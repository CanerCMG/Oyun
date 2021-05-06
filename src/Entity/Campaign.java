package Entity;

public class Campaign {

	private int Id;
	private String CampaignName;
	private int DiscountRate;

public Campaign(int id, String campaignName, int discountRate) {
	super();
	this.Id = id;
	this.CampaignName = campaignName;
	this.DiscountRate = discountRate;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getCampaignName() {
	return CampaignName;
}

public void setCampaignName(String campaignName) {
	CampaignName = campaignName;
}

public int getDiscountRate() {
	return DiscountRate;
}

public void setDiscountRate(int discountRate) {
	DiscountRate = discountRate;
}


}
