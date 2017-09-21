package com.selecon.practise;

import java.io.IOException;

import com.selecon.utils.PropFileHandler;

public class SampleFilePath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("user.dir")+"\\Lib\\geckodriver.exe");
		System.out.println(PropFileHandler.fetchProp("URL"));

	}

}
