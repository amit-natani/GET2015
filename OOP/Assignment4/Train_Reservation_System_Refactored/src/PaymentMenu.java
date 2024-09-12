
public class PaymentMenu  {
	
		public void showMenu()
		{
			Menu menu = new Menu();
			ActionableMenuItem item1 = new ActionableMenuItem("Press 1 for Credit Card");
			ActionableMenuItem item2 = new ActionableMenuItem("Press 2 for Debit Card");
			ActionableMenuItem item3 = new ActionableMenuItem("Press 3 for Wallet");
			ActionableMenuItem item4 = new ActionableMenuItem("Press 4 for Net Banking");
			menu.addMenuItem(item1);
			menu.addMenuItem(item2);
			menu.addMenuItem(item3);
			menu.addMenuItem(item4);
			menu.display();
		}

}
