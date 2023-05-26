package io;

import java.io.*;
import java.util.ArrayList;

import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        String input1 = "C:\\CTAC\\JAVA\\JavaIO\\src\\io\\input1.txt";
        String input2 =  "C:\\CTAC\\JAVA\\JavaIO\\src\\io\\input2.txt";

        String merge =  "C:\\CTAC\\JAVA\\JavaIO\\src\\io\\merge.txt";
        String common =  "C:\\CTAC\\JAVA\\JavaIO\\src\\io\\commonInt.txt";

        List<String> set1 = new ArrayList<>();
        List<String> set2 = new ArrayList<>();


        List<String> num1 = MergeFiles(input1, set1);

        List<String> num2 = MergeFiles(input2, set2);

        // Merge two arraylist and then write it to the new merge.txt file
        List<String> mergeSet = new ArrayList<>(num1);
        mergeSet.addAll(num2);
        System.out.println("Combined Set: "  + mergeSet);


        // Finding the common items present in both input1.txt and input2.txt

        List<String> commonSet = new ArrayList<>();
        for(String item1: num1)
            for(String item2: num2){
                if(item1.equals(item2)){
                    commonSet.add(item1);
                }
            }
        System.out.println("Common items: " + commonSet);
        // Write the arrayList to the common.txt file.
        BufferedWriter writer1 = null;

        try{
           writer1 = new BufferedWriter(new FileWriter(common));
            for(String item: commonSet){
                writer1.write(item);
                writer1.newLine();
            }

        }
        catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
        } finally {

            if (writer1 != null) {
                writer1.flush();
            }
        }

        BufferedWriter writer = null;
        try{
           writer  = new BufferedWriter(new FileWriter(merge));
            for(String item : mergeSet){
                writer.write(item);
                writer.newLine();
            }

        }catch (IOException e){
            System.out.println("Error writing in the file");
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

        try {
            if (writer !=null){
            writer.flush();
            writer.close();}

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

    private static List<String> MergeFiles(String input2, List<String> set) {

        try{
            BufferedReader read = new BufferedReader(new FileReader(input2));

            while (true){
                String data = read.readLine();
                if(data == null){
                    System.out.println("Done reading the file.");
                    break;
                }
                set.add(data);

            }

            System.out.println("Input from the file " + set);


        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println("Error reading the file");
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return set;
    }
}
