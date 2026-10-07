package labexamsetc_enhanced;
public class StudentGrade {
    private String studentname, emailaddress, course, section, subject, completionstatus, studentadviser, semester, academicyear;
    private int studentid, yearlevel;
    private double finalgrade, gpa, units, attendance;
    
   public void setstudentname (String studentname){
       this.studentname=studentname;
   } public String getstudentname(){
       return studentname;
   } public void setemailaddress (String emailaddress){
       this.emailaddress=emailaddress;
   } public String getemailaddress(){
       return emailaddress;
   } public void setcourse(String course){
       this.course=course;
   } public String getcourse(){
       return course;
   } public void setsection (String section){
       this.section=section;
   } public String getsection(){
       return section;
   } public void setsubject (String subject){
       this.subject=subject;
   } public String getsubject(){
       return subject;
   } public void setcompletionstatus (String completionstatus){
       this.completionstatus=completionstatus;
   } public String getcompletionstatus(){
       return completionstatus;
   } public void setstudentadviser (String studentadviser){
       this.studentadviser=studentadviser;
   } public String getstudentadviser(){
       return studentadviser;
   } public void setsemester (String semester){
       this.semester=semester;
   } public String getsemester(){
       return semester;
   } public void setacademicyear(String academicyear){
       this.academicyear=academicyear;
   } public String getacademicyear(){
       return academicyear;
   } public void setstudentid (int studentid){
       this.studentid=studentid;
   } public int getstudentid(){
       return studentid;
   } public void setyearlevel (int yearlevel){
       this.yearlevel=yearlevel;
   } public int getyearlevel(){
       return yearlevel;
   } public void setfinalgrade (double finalgrade){
       this.finalgrade=finalgrade;
   } public double getfinalgrade(){
       return finalgrade;
   } public void setgpa (double gpa){
       this.gpa=gpa;
   } public double getgpa(){
       return gpa;
   } public void setunits (double units){
       this.units=units;
   } public double getunits(){
       return units;
   } public void setattendance (double attendance){
       this.attendance=attendance;
   } public double getattendance(){
       return attendance;
   }
     public void displayStudentInfo(){
         System.out.println("Student ID: " + studentid);
         System.out.println("Student Name: " + studentname);
         System.out.println("Email Address: " + emailaddress);
         System.out.println("Course: " + course);
         System.out.println("Year Level: " + yearlevel);
         System.out.println("Section: " + section);
         System.out.println("                      ");
         System.out.println("ACADEMIC PERFORMANCE");
         System.out.println("--------------------");
         System.out.println("Subject: " + subject);
         System.out.println("Final Grade: " + finalgrade);
         System.out.println("Current GPA: " + gpa);
         System.out.println("Units: " + units);
         System.out.println("Attendance: " + attendance);
         System.out.println("Completion Status: " + completionstatus);
         System.out.println("Semester: " + semester);
         System.out.println("Academic Year: " + academicyear);
          }   
     
     public void displayAdvisorInfo(){
         System.out.println("Advisor: " + studentadviser + " advises " + studentname + " who is currently in 3rd Year " + course + "Contact: " + studentname + " | " + emailaddress);
     }
     public void getRemarks(){
         String Remarks;
         if (finalgrade >=90){
             Remarks="Excellent with High Distinction";
         } else if (finalgrade >=85 && finalgrade <=89){
             Remarks="Very Good with Merit";
         } else if (finalgrade >=80 && finalgrade<=84){
             Remarks="Good Standing";
         } else if (finalgrade >=75 && finalgrade <=79){
             Remarks="Satisfactory Performance";
         } else if (finalgrade >=70 && finalgrade <=74){
             Remarks="Needs Improvement";
         } else {
             Remarks="Academic Warning";
         }
             System.out.println("Remarks: " + Remarks);
         }
     public void calculateStanding(){
         String Standing;
         if (gpa <=1.5){
             Standing="Excellent";
         } else if (gpa >=1.6 && gpa <=2.5){
             Standing="Good";
         } else if (gpa >=2.6 && gpa <=3.5){
             Standing="Average";
         } else {
             Standing="Below";
         }
         System.out.println("Academic Standing: " + Standing);
     }
     public void validateEmail(){
         String Validate;
         if (emailaddress.contains("@") && emailaddress.contains(".")){
            Validate="Valid email format";
         } else{
             Validate="Not Valid email format";
         }
         System.out.println("Email Validation: " + Validate);
     }
     public void checkEligibilityForHonors(){
         String Eligibility;
         if (gpa <=1.5 && finalgrade >=90){
             Eligibility="Eligible";   
         } else {
             Eligibility="Not Eligible";
         } 
         System.out.println("Eligibility for Honors: " + Eligibility);
     }
     public void computePotentialGraduationYear(){
         int PotentialGY;
         if (yearlevel == 1){
             System.out.println(2028);
         } else if (yearlevel == 2){
             System.out.println(2027);
         } else if (yearlevel == 3){
           System.out.println("Estimated Graduation Year: 2026");
     }}
     
     }
