package com.cg.interim;
import java.util.*;

public class List1 {
public static void main(String[] args) {
	LinkedList<Integer> lang=new LinkedList<Integer>();
	lang.add(8);
	lang.add(2);
	lang.add(1);
	lang.add(6);
	Iterator it=lang.iterator();
	Collections.reverse(lang);
	Collections.sort(lang);
	while(it.hasNext()) 
	System.out.println(it.next()+" ");
}
}
