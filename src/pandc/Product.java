package pandc;

import java.util.Date;

public class Product extends Allocations {

	public double bPrice;
	public double sPrice;
	public Date bDate;
	public int dRate;

	public Product(double bPrice, Date bDate) {
		this.bPrice = bPrice;
		this.bDate = bDate;
	}

	public void setDeclineRate(int dRate) {
		this.dRate = dRate;
	}
}
