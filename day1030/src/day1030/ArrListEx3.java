package day1030;

import java.util.ArrayList;

public class ArrListEx3 {
	 public static void main(String[] args) {
	        ArrayList<Item> cart = new ArrayList<Item>();

	        cart.add(new Item("스트라이프 셔츠", 49900));
	        cart.add(new Item("슬림 면바지", 58900));
	        cart.add(new Item("스니커즈", 46900));

	        for (Item i : cart) {
	            System.out.println(i);
	        }

	        System.out.println("===========================");

	        int total = 0;
	        for (Item i : cart) {
	            total += i.getPrice();
	        }

	        System.out.println("총합: " + total + "원");
	    }
}
