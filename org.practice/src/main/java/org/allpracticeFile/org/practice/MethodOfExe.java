package org.allpracticeFile.org.practice;

import java.io.IOException;

public class MethodOfExe
{
	
	public static void exeRun()
	{
	try{
	String exePath="D:\\Autoit_Example\\RohitSeleniumFolder.exe";
	
	ProcessBuilder pb = new ProcessBuilder(exePath);
	Process process = pb.start();
	}
	catch (IOException e) {
        e.printStackTrace();
    }
	}
}



