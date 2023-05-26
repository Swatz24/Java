package simpleFileManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SimpleFileManager {
    public static void main(String[] args) {

        String directoryPath = "ProjectIO/NewDirectory/";
        Scanner input = new Scanner(System.in);

        try {
            Path dirPath = Paths.get(directoryPath);
            if (!Files.isDirectory(dirPath)) {
                System.out.println("Enter a valid directory Path. ");
                return;
            }
            boolean exit = true;
            while (exit) {
                System.out.println("""
                        Select an option below:\s
                        1. Display the contents of a directory\s
                        2. Copy a file within the directory\s
                        3. Move a file within the directory\s
                        4. Delete a file\s
                        5. Create a directory\s
                        6. Delete a directory\s
                        7. Search for a file by name\s
                        8. Search for a file by extension\s
                        9. Exit\s""");

                int userOption = Integer.parseInt(input.nextLine());
                switch (userOption) {
                    case 1: //display the contents of the directory.
                        displayDirectoryContents(directoryPath);
                        break;
                    case 2: //copy a file within the directory.
                        System.out.println("Enter the source file name to copy: "); // source.txt
                        String copySourceFile = input.nextLine();
                        System.out.println("Enter the target: ");  // target.txt
                        String copyTargetFile = input.nextLine();
                        copyFile(dirPath.resolve(copySourceFile), dirPath.resolve(copyTargetFile));
                        break;
                   case 3: //move a file within the directory.
                       System.out.println("Enter the source file name to move: ");
                       String moveSourceFile = input.nextLine(); // source.txt
                       System.out.println("Enter the target: ");
                       String moveTargetFile = input.nextLine();

                       // Move the file source.txt to newfile.txt
                       moveFile(dirPath.resolve(moveSourceFile), dirPath.resolve(moveTargetFile));
                       break;
                   case 4: //delete a file
                       System.out.println("Enter a file name to delete: "); // newfile.txt
                       String fileToDelete = input.nextLine();
                       deleteFile(dirPath.resolve(fileToDelete));
                       break;
                   case 5: //create a new directory inside the specified directory
                       System.out.println("Name for a new directory: ");
                       String in = input.nextLine();
                       String newDir = "ProjectIO/NewDirectory/"+in;
                       createDirectory(Path.of(newDir));
                       break;
                   case 6: //delete directory
                       System.out.println("Enter the name of the directory you wish to delete: ");
                       String deleteDir = input.nextLine();
                       deleteDirectory(dirPath.resolve(deleteDir));
                       break;
                   case 7: //search by file name
                       System.out.println("Enter a file name to search for: ");
                       String fileName = input.nextLine();
                       searchFilesByName(dirPath, fileName);
                       break;
                   case 8: //search by extension
                       System.out.println("Enter the file extension to search for: ");
                       String fileExtension = input.nextLine();
                       searchFilesByExtension(dirPath, fileExtension);
                       break;
                    case 9: //exit
                        System.out.println("Exiting. See you later!!.");
                        exit = false;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

            }
        } catch (InvalidPathException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //
    // Display the contents of a specified directory, including file names, file sizes, and last modified dates
    private static void displayDirectoryContents(String directoryPath) throws IOException {
        File dir = new File(directoryPath);
        // get the list of files from the directory
        File[] files = dir.listFiles();
        // Check if there are files inside the directory
        if (files != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Date and time format
            for (File file : files) {
                String name = file.getName();
                long size = file.length();
                long lastModified = file.lastModified();
                Date lastModifiedDate = new Date(lastModified);
                String formattedDate = dateFormat.format(lastModifiedDate);
                System.out.println("Name: " + name + "\tSize: " + size + " bytes\tLast Modified: " + formattedDate);
            }
        }
    }

        // Copy file within the directory

    public static void copyFile(Path source, Path target){
        try{
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!!");
        }catch (IOException e){
            System.out.println("Error copying the file," + e.getMessage());
        }

        }

        // Move file
        public static void moveFile(Path source, Path target){
            try{
                Files.move(source,target, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File moved!!");
            }catch (IOException e){
                System.out.println("Error copying the file," + e.getMessage());
            }

        }

        // Delete a file

    public static void deleteFile(Path filename) {
        try {
            Files.delete(filename);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting the file: " + e.getMessage());
        }
    }

    // Create a directory

    public static void createDirectory(Path directory){
        try {
            Files.createDirectory(directory);
            System.out.println("Created new directory.");
        } catch (IOException e) {
            System.out.println("Error creating directory: " + e.getMessage());
           // e.printStackTrace();
        }

    }

    // Delete a directory
    public static void deleteDirectory(Path directory){
        try {
            Files.delete(directory);
            System.out.println("Directory deleted.");
        } catch (IOException e) {
            System.out.println("Error deleting directory: " + e.getMessage());
            e.printStackTrace();
        }

    }

    // Search file by name

    private static void searchFilesByName(Path dir, String fileName) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, fileName)) {
            System.out.println("Search Results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Unable to find file by name: " + e.getMessage());
        }
    }

    // Search file by extension

    private static void searchFilesByExtension(Path dir, String fileExtension) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*." + fileExtension)) {
            System.out.println("Search Results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Unable to find file by extension: " + e.getMessage());
        }
    }


}