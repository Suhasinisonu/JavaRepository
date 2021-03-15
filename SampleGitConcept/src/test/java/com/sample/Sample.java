package com.sample;

import org.testng.annotations.Test;

public class Sample {
@Test
public void createContact(){
	System.out.println("createContact");
}

@Test
public void modifyContact(){
	System.out.println("modifyContact");
}

@Test
public void deleteContact(){
	System.out.println("deleteContact");
}
}
