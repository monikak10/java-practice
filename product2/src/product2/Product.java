package product2;

public class Product {
		public Product(long id, String productName, String supplierName) {
			super();
			this.id = id;
			this.productName = productName;
			this.supplierName = supplierName;
		}

		private long id;
		private String productName;
		private String supplierName;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getSupplierName() {
			return supplierName;
		}
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		 
		Product(){}
		void display()
		{
			System.out.println("Product Id is "+id);
			System.out.println("Product Name is "+productName);
			System.out.println("Supplier Name is "+supplierName);
		}
		
	
	
	
}
