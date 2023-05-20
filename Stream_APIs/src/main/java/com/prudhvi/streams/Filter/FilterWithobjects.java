package com.prudhvi.streams.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWithobjects {

	public static void main(String[] args) {
		List<Product> products=Arrays.asList(new Product(1, "soap", 10),new Product(2,"shampoo", 50),new Product(3,"faceWash", 70),new Product(4,"towel", 100));
		
		//filter the price is >50
		List<Product> priceList=new ArrayList<>();
		priceList=products.stream()
				.filter(ele->ele.getPrice()>50)
				.collect(Collectors.toList());
		System.out.print(priceList+"\n");
		
		products.stream()
		.filter(ele->ele.getPrice()<51) //filtering
		.forEach(ele->System.out.print(ele.getName()+" "));//printing the data
		
		

	}

}
class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
