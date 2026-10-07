// 1. Mobile menu: show or hide the links when the button is clicked
const menu = document.getElementById("menu");
document.querySelector(".menu-btn").addEventListener("click", () => menu.classList.toggle("open"));
menu.querySelectorAll("a").forEach(a => a.addEventListener("click", () => menu.classList.remove("open")));

// 2. Profile photo: look in images/profile.png first, then in the main folder.
const avatar = document.querySelector(".avatar");
const photo = avatar.querySelector("img");
const paths = ["images/profile.png", "profile.png"];
let n = 0;

function showPhoto() {
  photo.style.display = "";
  avatar.classList.add("has-photo");   // hides the "LM" initials
}
function tryNext() {
  n++;
  if (n < paths.length) photo.src = paths[n];
  else photo.style.display = "none";   // photo not found, keep "LM"
}

photo.addEventListener("load", showPhoto);
photo.addEventListener("error", tryNext);
if (photo.complete) { photo.naturalWidth > 0 ? showPhoto() : tryNext(); }

// 3. Fade-in: sections appear softly when you scroll to them
const observer = new IntersectionObserver(entries => {
  entries.forEach(e => { if (e.isIntersecting) { e.target.classList.add("show"); observer.unobserve(e.target); } });
}, { threshold: 0.12 });
document.querySelectorAll(".reveal").forEach(el => observer.observe(el));

// 4. Highlight the nav link of the section you are viewing
const links = document.querySelectorAll("nav a");
const spy = new IntersectionObserver(entries => {
  entries.forEach(e => {
    if (e.isIntersecting) links.forEach(l => l.classList.toggle("active", l.getAttribute("href") === "#" + e.target.id));
  });
}, { rootMargin: "-45% 0px -50% 0px" });
document.querySelectorAll("section[id]").forEach(s => spy.observe(s));

// 5. Lightbox: click a café post to view it larger, click again to close
const box = document.getElementById("lightbox");
document.querySelectorAll(".gallery img").forEach(img => {
  img.addEventListener("click", () => { box.querySelector("img").src = img.src; box.classList.add("open"); });
});
box.addEventListener("click", () => box.classList.remove("open"));
document.addEventListener("keydown", e => { if (e.key === "Escape") box.classList.remove("open"); });
