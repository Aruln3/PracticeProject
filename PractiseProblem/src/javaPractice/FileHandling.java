package javaPractice;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	     File handledFiles;
	     public  FileHandling() {
	     	 handledFiles = new File("C://Users//hp//Desktop");
	         if (!handledFiles.exists())
	         System.out.println("MyFilePath : "+ handledFiles.getAbsolutePath());
	     }
	
	    public static final String Main_Menu_TAB  =
	    		 
	            "Select any one option (1, 2, 3)\n"+
	                     "  1)Create a file\n"+
	                     "  2)Remove a file\n"+
	                     "  3)Search a file\n";
	        
	     void ViewPagee() {
	         System.out.println(Main_Menu_TAB );
	         try(Scanner scanner = new Scanner(System.in))
	         {
	             char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
	             char logic = input[0];
	             switch (logic){
	                 case '1' : {
	                     System.out.print("\nName of the file that you want to Add : ");
	                     String filename = scanner.next();
	                     addFileMethod(filename);
	                     break;
	                            }
	                 case '2' : {
	                     System.out.print("\nName of the file that you want to Remove : ");
	                     String filename = scanner.next().trim();
	                     deleteFileMethod(filename);
	                     break;
	                            }
	                 case '3' : {
	                     System.out.print("\nName of the file that you Searching for : ");
	                     String filename = scanner.next().trim();
	                     searchFileMethod(filename);
	                     break;
	                            }
	                 default : System.out.println("\nFile not found, Please enter correct values");
	             }
	             ViewPagee();
	         }
	         catch (Exception e){
	             System.out.println("Please enter correct values");
	             ViewPagee();
	         }
	     }


       void addFileMethod(String filename) throws IOException{
    	   File file = new File("C://Users//hp//Desktop//"+filename);// this is used to create the file
           if (file.createNewFile()) {  
        	   System.out.println("File created");
           }
       }

	   void deleteFileMethod(String filename) {
	        File filepath = new File(handledFiles +"/"+filename);
	        String[] list = handledFiles.list();
	        for (String file: list) {
	        if (filename.equals(file) && filepath.delete()) {
                   System.out.println("File " + filename + " deleted from " + handledFiles);
                   return;
               }
	         }
	         System.out.println("File not found");
	        }

	   void searchFileMethod(String filename) {
	         String[] list = handledFiles.list();
	         for (String file: list) {
             if (filename.equals(file)) {
	                System.out.println("FOUND : File " + filename + " exists at " + handledFiles);
	                return;
	           }
	          }
	         System.out.println("File not found");
	        }
	
      public static void main(String[] args) {
	        FileHandling menu = new  FileHandling();
	        menu.ViewPagee();
	     }
}