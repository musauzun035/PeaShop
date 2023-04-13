
public class Products {
	private Product product;
    private String salesPersonName;
    
    // Constructor
    public Products(Product product, String salesPersonName) {
        this.product = product;
        this.salesPersonName = salesPersonName;
    }
    
    // Getter ve Setter metotlarý
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public String getSalesPersonName() {
        return salesPersonName;
    }
    
    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }
}
