package menuitem;
import java.util.Scanner;

class Menu{
    public void prepare(){
        System.out.println("Preparing menu item");
    }
    public void cook(){
        System.out.println("Cooking menu item");
    }
    public void serve(){
        System.out.println("Serving menu item");
    }}
class Pizza extends Menu{
    public void prepare(){
        System.out.println("Pizza: Rolling out fresh dough and spreading tomato sauce!");
    }
    public void cook(){
        System.out.println("Pizza: Baking in wood-fired oven at 450°F for 12 minutes!");
    }
    public void serve(){
        System.out.println("Pizza: Served hot with extra cheese and basil leaves!");
    }
    public void addTopping(){
        System.out.println("Pizza: Adding pepperoni, mushrooms, and bell peppers!");
    }
    public void chooseCrust(){
        System.out.println("Pizza: Selecting hand-tossed thick crust!");
    }
    public void adjustCheese(){
        System.out.println("Pizza: Adding extra mozzarella cheese!");
    }
    public void setBakingTime(){
        System.out.println("Pizza: Setting timer for 12 minutes at 450°F!");
    }
    public void makeGlutenFree(){
        System.out.println("Pizza: Preparing gluten-free crust option!");
    }
    public void addSeasoning(){
        System.out.println("Pizza: Sprinkling oregano and chili flakes!");
    }}
class Burger extends Menu{
     public void prepare(){
        System.out.println("Burger: Grinding fresh beef and forming patties!");
    }
    public void cook(){
        System.out.println("Burger: Grilling patties to medium-well perfection!");
    }
    public void serve(){
        System.out.println("Burger: Served with lettuce, tomato, and special sauce!");
    }
    public void selectBun(){
        System.out.println("Burger: Choosing toasted brioche bun!");
    }
    public void addToppings(){
        System.out.println("Burger: Adding bacon, cheese, and fried egg!");
    }
    public void chooseSauce(){
        System.out.println("Burger: Spreading secret BBQ sauce!");
    }
    public void setGrillTemp(){
        System.out.println("Burger: Setting grill to 375°F for perfect char!");
    }
    public void makeDouble(){
        System.out.println("Burger: Upgrading to double patty!");
    }
    public void addVeggies(){
        System.out.println("Burger: Adding fresh lettuce, tomato, and onion rings!");
    }}
class Sushi extends Menu{
     public void prepare(){
        System.out.println("Sushi: Preparing fresh sushi rice and slicing sashimi-grade fish!");
    }
    public void cook(){
        System.out.println("Sushi: Rolling maki with nori and fresh ingredients!");
    }
    public void serve(){
        System.out.println("Sushi: Served on wooden platter with wasabi and pickled ginger!");
    }
    public void selectFish(){
        System.out.println("Sushi: Choosing fresh salmon and tuna!");
    }
    public void prepareRice(){
        System.out.println("Sushi: Seasoning rice with rice vinegar and sugar!");
    }
    public void makeMakiRoll(){
        System.out.println("Sushi: Rolling California roll with crab and avocado!");
    }
    public void createSashimi(){
        System.out.println("Sushi: Slicing sashimi-grade fish 1/4 inch thick!");
    }
    public void addWasabi(){
        System.out.println("Sushi: Placing wasabi and ginger garnish!");
    }
    public void setTemp(){
        System.out.println("Sushi: Keeping sashimi refrigerated at 40F");
    }}
class Pasta extends Menu{
     public void prepare(){
        System.out.println("Pasta: Making fresh pasta dough with semolina flour!");
    }
    public void cook(){
        System.out.println("Pasta: Boiling in salted water until al dente!");
    }
    public void serve(){
        System.out.println("Pasta:Served with salsa, guacamole, and lime wedges!");
    }
    public void choosePasta(){
        System.out.println("Pasta: Selecting spaghetti noodles!");
    }
    public void makeSauce(){
        System.out.println("Pasta: Making homemade marinara sauce!");
    }
    public void addProtein(){
        System.out.println("Pasta: Adding grilled chicken and shrimp!");
    }
    public void setCookingTime(){
        System.out.println("Pasta: Setting timer for 8-10 minutes for al dente!");
    }
    public void addVegetables(){
        System.out.println("Pasta: Adding broccoli, zucchini, and cherry tomatoes!");
    }
    public void garnishCheese(){
        System.out.println("Pasta: Shaving parmesan cheese on top!");
    }}
class Tacos extends Menu{
     public void prepare(){
        System.out.println("Tacos: Warming tortillas and preparing meat filling!");
    }
    public void cook(){
        System.out.println("Tacos: Seasoning and grilling meat with spices!");
    }
    public void serve(){
        System.out.println("Tacos: Served with salsa, guacamole, and lime wedges!");
    }
    public void chooseProtein(){
        System.out.println("Tacos: Selecting marinated grilled chicken!");
    }
    public void warmTortillas(){
        System.out.println("Tacos: Heating corn tortillas on comal!");
    }
    public void makeSalsa(){
        System.out.println("Tacos: Preparing fresh pico de gallo!");
    }
    public void addToppings(){
        System.out.println("Tacos: Adding onions, cilantro, and hot sauce!");
    }
    public void makeGuacamole(){
        System.out.println("Tacos: Mashing ripe avocados for guacamole!");
    }
    public void setServingStyle(){
        System.out.println("Tacos: Served street-style with lime wedges!");
    }}
class Steak extends Menu{
     public void prepare(){
        System.out.println("Steak: Seasoning prime ribeye with salt and pepper!");
    }
    public void cook(){
        System.out.println("Steak: Grilling to medium-rare at 135°F internal temperature!");
    }
    public void serve(){
        System.out.println("Steak: Served with garlic butter and roasted vegetables!");
    }
    public void selectCut(){
        System.out.println("Steak: Choosing prime ribeye with marbling!");
    }
    public void seasonSteak(){
        System.out.println("Steak: Rubbing with garlic herb seasoning!");
    }
    public void setDoneness(){
        System.out.println("Steak: Grilling to medium-rare perfection!");
    }
    public void addSauce(){
        System.out.println("Steak: Serving with red wine reduction!");
    }
    public void restSteak(){
        System.out.println("Steak: Letting rest for 5 minutes before serving!");
    }
    public void addSides(){
        System.out.println("Steak: Adding mashed potatoes and asparagus!");
    }}
class Noodles extends Menu{
     public void prepare(){
        System.out.println("Noodles: Boiling fresh egg noodles and preparing stir-fry sauce!");
    }
    public void cook(){
        System.out.println("Noodles: Stir-frying with vegetables and chicken!");
    }
    public void serve(){
        System.out.println("Noodles: Served in bowl with sesame seeds and spring onions!");
    }
    public void chooseNoodle(){
        System.out.println("Noodles: Selecting thick egg noodles!");
    }
    public void makeBroth(){
        System.out.println("Noodles: Simmering savory bone broth!");
    }
    public void addVeggies(){
        System.out.println("Noodles: Adding bok choy, mushrooms, and carrots!");
    }
    public void addProtein(){
        System.out.println("Noodles: Adding grilled chicken and tofu!");
    }
    public void adjustSpice(){
        System.out.println("Noodles: Adding sriracha and chili oil!");
    }
    public void garnishHerbs(){
        System.out.println("Noodles: Topping with green onions and sesame!");
    }}

public class MenuItem {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int menu;
     
        System.out.println("=====================================");
        System.out.println(" FLAVOR FUSION RESTAURANT");
        System.out.println("ORDER MANAGEMENT SYSTEM");
        System.out.println("=====================================");
        do{
            System.out.println("\n=== Menu ===");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Sushi");
            System.out.println("4. Pasta");
            System.out.println("5. Tacos");
            System.out.println("6. Steak");
            System.out.println("7. Noodles");
            System.out.println("8. Exit Program");
            System.out.print("Enter your choice (1-8): ");
            while (!input.hasNextInt()){
                System.out.println("Invalid menu selection! Please choose 1-8.");
                input.next();
            }
            menu = input.nextInt();
            input.nextLine();
            Menu a = null;
            switch (menu) {
                case 1:
                    System.out.println("--- PIZZA SELECTED ---");
                    a = new Pizza();
                    break;
                    
                case 2:
                    System.out.println("--- BURGER SELECTED ---");
                    a = new Burger();
                    break;
                
                case 3:
                    System.out.println("--- SUSHI SELECTED ---");
                    a = new Sushi();
                    break;
                
                case 4:
                    System.out.println("--- PASTA SELECTED ---");
                    a = new Pasta();
                    break; 
                    
                case 5:
                    System.out.println("--- TACOS SELECTED ---");
                    a = new Tacos();
                    break;
                    
                case 6:
                    System.out.println("--- STEAK SELECTED ---");
                    a = new Steak();
                    break;  
                    
                case 7:
                    System.out.println("--- NOODLES SELECTED ---");
                    a = new Noodles();
                    break;    
                default:
                    System.out.println("Invalid menu selection! Please choose 1-8.");
                    continue;
            }
        if (menu ==7) {
            break;
        }
        if (a != null){
            System.out.println("=== ORDER OPERATIONS ===");
            System.out.println("=== OVERRIDDEN METHODS ===");
           a.prepare();
           a.cook();
           a.serve();
           
            System.out.println("\n === EXTRA METHODS ===");
            
          if (a instanceof Pizza) {
              Pizza p = (Pizza) a;
              p.addTopping();
              p.chooseCrust();
              p.adjustCheese();
              p.setBakingTime();
              p.makeGlutenFree();
              p.addSeasoning();
          } else if (a instanceof Burger){
              Burger b = (Burger) a;
              b.selectBun();
              b.addToppings();
              b.chooseSauce();
              b.setGrillTemp();
              b.makeDouble();
              b.addVeggies();
          } else if (a instanceof Sushi){
              Sushi s = (Sushi) a;
              s.selectFish();
              s.prepareRice();
              s.makeMakiRoll();
              s.createSashimi();
              s.addWasabi();
              s.setTemp();
          } else if (a instanceof Pasta) {
            Pasta d = (Pasta) a;
            d.choosePasta();
            d.makeSauce();
            d.addProtein();
            d.setCookingTime();
            d.addVegetables();
            d.garnishCheese();
        } else if (a instanceof Tacos) {
            Tacos t = (Tacos) a;
            t.chooseProtein();
            t.warmTortillas();
            t.makeSalsa();
            t.addToppings();
            t.makeGuacamole();
            t.setServingStyle();
        } else if (a instanceof Steak) {
            Steak f = (Steak) a;
            f.selectCut();
            f.seasonSteak();
            f.setDoneness();
            f.addSauce();
            f.restSteak();
            f.addSides();
        } else if (a instanceof Noodles) {
            Noodles n = (Noodles) a;
            n.chooseNoodle();
            n.makeBroth();
            n.addVeggies();
            n.addProtein();
            n.adjustSpice();
            n.garnishHerbs();
        }
            System.out.println("======================================");
        }
        } while (menu !=7);
        input.close();
        System.out.println("Exiting Restaurant Order Management System. Thank you for visiting Flavor Fusion!");
        }
    }
    

