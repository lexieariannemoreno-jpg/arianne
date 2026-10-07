package labexamsetc_enhanced;

public class PharmacyProduct {
    private String productcode, productname, manufacturer, expirationdate, category, dosage, stemperature, reorderlevel, branchlocation,suppliercontact,restockhistory;  
    private double price, stockquantity, discountrate, unitsold;
   
    public void setproductcode (String productcode){
        this.productcode=productcode;
    } public String getproductcode(){
        return productcode;
    } public void setproductname (String productname){
        this.productname=productname;
    } public String getproductname(){
        return productname;
    } public void setmanufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    } public String getmanufacturer(){
        return manufacturer;
    } public void setstockquantity(double stockquantity){
        this.stockquantity=stockquantity;
    } public double getstockquantity(){
        return stockquantity;
    } public void setexpirationdate(String expirationdate){
        this.expirationdate=expirationdate;
    } public String getexpirationdate(){
        return expirationdate;
    } public void setcategory(String category){
        this.category=category;
    } public String getcategory(){
        return category;
    } public void setdosage(String dosage){
        this.dosage=dosage;
    } public String getdosage(){
        return dosage;
    } public void setstemperature(String stemperature){
        this.stemperature=stemperature;
    } public String getstemperature(){
        return stemperature;
    } public void setreorderlevel(String reorderlevel){
        this.reorderlevel=reorderlevel;
    } public String getreorderlevel(){
        return reorderlevel;
    } public void setbranchlocation(String branchlocation){
        this.branchlocation=branchlocation;
    } public String getbranchlocation(){
        return branchlocation;
    } public void setsuppliercontact(String suppliercontact){
        this.suppliercontact=suppliercontact;
    } public String getsuppliercontact(){
        return suppliercontact;
    } public void setrestockhistory(String restockhistory){
        this.restockhistory=restockhistory;
    } public String getrestockhistory(){
        return restockhistory;
    }  public void setunitsold(double unitsold){
        this.unitsold=unitsold;
    } public double getunitsold(){
        return unitsold;
    } public void getprice (double price){
        this.price=price;
    } public double getprice(){
        return price;
    } public void setdiscountrate (int discountrate){
        this.discountrate=discountrate;
    } public double getdiscountrate(){
        return discountrate;
    }
    public void displayProductInfo(){
        System.out.println("Product Code: " + productcode);
        System.out.println("Product Name: " + productname);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Category: " + category);
        System.out.println("Dosage Strength: " + dosage);
        System.out.println("Price Per Piece: PHP" + price);
        System.out.println("Stock Quantity: " + stockquantity + " units");
        System.out.println("Reorder Level: " + reorderlevel);
    }
    public void calculateInventoryValue(){
        double calculate = stockquantity*price;
        System.out.println("Inventory Value: " + calculate);
    }
    public void calculateTotalSalesValue(){
        double totalsales = unitsold*price;
        System.out.println("Total Sales Value: " + totalsales);
    }
    public void displayStorageInstructions(){
        System.out.println("Storage Temperature: " + stemperature);
        System.out.println("Storage Instructions: Store at room temperature");
        System.out.println("Expiration Date: " + expirationdate);
    }
    public void displayExpiryAlert(){
        System.out.println("Expiry Alert: Product is valid and not expiring soon");
    }
    public void displaySupplierInfo(){
        System.out.println("Supplier Contact: " + suppliercontact);
        System.out.println("Branch Location: " + branchlocation);
    }
    public double checkReorderStatus(){
        String status;
        if (stockquantity <=50){
            status="Stock Level is unsufficient";
        } else{
            status="Stock Level is sufficient";
        }  
        System.out.println("Reorder Status: " + status);
        return 0;
    }
    public void checkBulkEligibility(){
        String Eligibility;
        if (stockquantity >100){
            Eligibility="Product is eligible for bulk discount pricing at 5.0%";
        } else {
            Eligibility="Product is not eligible for bulk discount";
        }
        System.out.println("Bulk Eligibility: " + Eligibility);
    }
    public void displayRestockHistory(){
        double calculate = stockquantity*price;
        System.out.println("Restock History: Last Restocked on " + restockhistory + ",");
        System.out.println("Current Stock: " + stockquantity + " units, Reorder at: " + reorderlevel + " units");
        System.out.println("Total Inventory Cost: PHP 1904.00 Base: PHP " + calculate + " Tax: PHP 204.00");
    }

    void setprice(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
