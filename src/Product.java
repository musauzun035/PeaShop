
public class Product {
	 private String name;
	    private double price;
	    private String categoryType;
	    private String salesPersonName;
	    
	    // Constructor
	    public Product(String name, double price, String categoryType, String salesPersonName) {
	        this.name = name;
	        this.price = price;
	        this.categoryType = categoryType;
	        this.salesPersonName = salesPersonName;
	    }
	    
	    // Getter ve Setter metotlarý
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public double getPrice() {
	        return price;
	    }
	    
	    public void setPrice(double price) {
	        this.price = price;
	    }
	    
	    public String getCategoryType() {
	        return categoryType;
	    }
	    
	    public void setCategoryType(String categoryType) {
	        this.categoryType = categoryType;
	    }
	    
	    public String getSalesPersonName() {
	        return salesPersonName;
	    }
	    
	    public void setSalesPersonName(String salesPersonName) {
	        this.salesPersonName = salesPersonName;
	    }
}
