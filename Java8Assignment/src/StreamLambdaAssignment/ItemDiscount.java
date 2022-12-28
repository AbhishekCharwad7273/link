package StreamLambdaAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemDiscount {

	public static void main(String[] args) {
		List<Item>item_List=new ArrayList<Item>();
		item_List.add(new Item(134, "Moto24",15000,"Mobiles"));
		item_List.add(new Item(157, "Spiderman",50,"Books"));
		item_List.add(new Item(204, "Acer",70000,"Laptops"));
		item_List.add(new Item(210, "iPhone",45000,"Mobiles"));
		item_List.add(new Item(215, "Shirt",1500,"Shirts"));
		
	
	List<Double>result=item_List.stream().filter(e->e.getCategory().equalsIgnoreCase("Laptops")).map(m->m.getPrice()*0.05).collect(Collectors.toList());
	System.out.println(result);

	}

}
