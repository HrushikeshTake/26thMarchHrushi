package myStudy;



public class ZerodaBrokerageFind {

	public static void main(String[] args) 
	{
		int stockQty=50;
		float stockBuyPrice=300;
		float stockSellPrice=310;
		float amountPocket=15000;
		
		
		System.out.println("User Balance in account = "+amountPocket);
		System.out.println("Stock Quantity = "+stockQty);
		System.out.println("Stock Buying Price per stock = "+stockBuyPrice);
		
		//-->Stock Buy
		float totalBuyPrice=stockBuyPrice*stockQty;
		System.out.println("Total Buying price = "+totalBuyPrice);
		float userPay=((totalBuyPrice*10)/100);
		System.out.println("10 % will pay by user ="+userPay);
		float companyPay=((totalBuyPrice*90)/100);
		System.out.println("90 % will pay by company ="+companyPay);
		
		//-->Stock sell
		System.out.println("Stock Selling Price per stock = "+stockSellPrice);
		float totalSellingPrice=stockSellPrice*stockQty;
		System.out.println("Total Selling price = "+totalSellingPrice);
		
		//-->Profit:
		float profit=(stockSellPrice-stockBuyPrice)*stockBuyPrice;
		System.out.println("Profit/Loss ="+profit);
		
		System.out.println("Brokerage will be apply on total transaction");
		float totalTransaction=totalBuyPrice+totalSellingPrice;
		System.out.println("Total TurnOver = "+totalTransaction);
		
		
		float userBalance=profit+userPay;
		System.out.println("User Total Money = "+userBalance);
		
		//-->Brokerage
		System.out.println("3% of Total Trasaction = Brokerage");
		float brokerage=(float) ((totalTransaction*(0.03))/100);
		System.out.println("Brokerage = "+brokerage);
		
		float stdBrokerage=40;
		if(brokerage>=stdBrokerage)
		{
			System.out.println("*******************");
			float endTrasn=userBalance-40;
			System.out.println("End Transaction = "+"User Balance - "+"StdBokerage = "+userBalance+" - "+"40"+" = "+endTrasn);
		
			float finallBalance=amountPocket-brokerage+profit;
			System.out.println("Final Balance in Account = "+finallBalance);
			
		}
		else
		{
			System.out.println("============");
		
			float endTrasn=userBalance-brokerage;
			System.out.println("End Transaction = "+"User Balance - "+"Bokerage = "+userBalance+" - "+brokerage+" = "+endTrasn);
		
			float finallBalance=amountPocket-brokerage+profit;
			System.out.println("Final Balance in Account = "+finallBalance);
		}
		
		
		

	}

}
