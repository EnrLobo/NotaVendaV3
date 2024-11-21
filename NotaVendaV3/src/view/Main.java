package view;

import model.Sale;

public class Main {

	public static void main(String[] args) {
		Sale sale = new Sale();
		sale.createSaleItem("pa", 2);
		sale.createSaleItem("mo", 100);
		sale.createSaleItem("mu", 200);
		sale.createSaleItem("ga", 2);
		
		//Fim da Venda
		sale.setPaymentMethod("c");
		
		for (Object item : sale.getItems()) {
			System.out.println(item);
		}
		
		System.out.println(String.format("Total: %.2f", sale.getTotal()));
		
		System.out.println(String.format("Forma de Pagamento: '%s'", sale.getPaymentMethod()));
		
		
		System.out.println(String.format("Valor a ser pago: R$%.2f", sale.getFinalPrice()));
	}

}
