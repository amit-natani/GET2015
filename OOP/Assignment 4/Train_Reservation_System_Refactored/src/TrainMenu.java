
public class TrainMenu  {
	
		public void showMenu()
		{
			Menu menu = new Menu();
			ActionableMenuItem item1 = new ActionableMenuItem("Press 1 for Passenger Train");
			ActionableMenuItem item2 = new ActionableMenuItem("Press 2 for Goods Train");
			menu.addMenuItem(item1);
			menu.addMenuItem(item2);
			menu.display();
		}

}
