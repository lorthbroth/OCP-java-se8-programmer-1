package com.topic9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCreation {

	public static void main(String[] args) throws IOException {
		
		//creating a directory
		Path path = Paths.get("C:\\Users\\dominic\\Desktop\\Dev\\JumpCo\\OCP-java-se8-programmer-1\\Topic_9\\testDirectory");
        Path newPath= Files.createDirectory(path);
        pathMethod(path);
        
        //Display Path
        
        System.out.format("toURI: %s%n", path.toUri());
        System.out.format("toAbsolutePath: %s%n", path.toAbsolutePath());
        System.out.format("toRealPath: %s%n", path.toRealPath());
        
        //Write file n the directory
        
        String filecontent = "Writting a .txt file with java code";
       
        
        Path path2 = Paths.get("C:\\Users\\dominic\\Desktop\\Dev\\JumpCo\\OCP-java-se8-programmer-1\\Topic_9\\testDirectory\\testfile.txt");
        
        byte[] fileByteContent = filecontent.getBytes();
      
        
        Files.write(Paths.get("C:\\\\Users\\\\dominic\\\\Desktop\\\\Dev\\\\JumpCo\\\\OCP-java-se8-programmer-1\\\\Topic_9\\\\testDirectory\\\\testfile.txt"), fileByteContent);
        
        //to validate the data
        String readFile = Files.readAllLines(path2).get(0);
        System.out.println(readFile.equals(filecontent));
        
        //Listing files by Stream
        System.out.println("\tContents of my working directory");
        Path source = Paths.get("C:\\\\Users\\\\dominic\\\\Desktop\\\\Dev\\\\JumpCo\\\\OCP-java-se8-programmer-1\\\\Topic_9");
        Files.walk(source).filter(Files::isRegularFile).forEach(System.out::println);
	}
	
	public static void pathMethod(Path path) {

        System.out.println("toString method :: " + path.toString());
        System.out.println("getFileName :: " + path.getFileName());
        System.out.println("getFileSystem :: " + path.getFileSystem());
        System.out.println("Get Root Name :: " + path.getRoot());
        System.out.println("Get Parent ::" + path.getParent());
        System.out.println("get count :: " + path.getNameCount());
    }

}
