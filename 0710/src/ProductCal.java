
public class ProductCal {
	void calc(Product prd) {
		int salesAmount = prd.getQuantity() * prd.getSalePrice();
		int purchaseAmount = prd.getQuantity() * prd.getPurchasePrice();
		int profits = prd.getSalesPrice() - (prd.getPurchaseAmount() + prd.getTransportation() );
		int margin = prd.getProfits() / prd.getPurchaseAmount() * 100;
		
	}
}
