package designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {

	 protected List<String> parts = new ArrayList<String>();
	 
	 public void add(String part){
		 parts.add(part);
	 }
	 
	 public void show(){
        System.out.print("Product Information:");
        for(String part : parts){
            System.out.print(part + "\t");
        }
	 }
	 
}
