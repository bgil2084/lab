package lab.AMR17S2;



import java.io.*;

import java.util.*;

public class AMR {
    public static void main(String[] args){

        // read the files

        //private File inputFile1 = new File(args[0]);
        //private File inputFile2 = new File(args[1]);
        //private File outputFile1 = new File(args[2]);
        //private File outputFile2 = new File(args[3]);

        //read members file

        Members members = new Members();
        Individual individual = new Individual();
        String lineStorage;

        try{
            File file = new File(args[0]);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()){

                lineStorage = reader.nextLine();
                if(!lineStorage.equals("")) {
                    String key = lineStorage.substring(0, lineStorage.indexOf(' ')),
                            value = lineStorage.substring(lineStorage.indexOf(' ') + 1);
                    if(key.equals("name")){
                        individual.setName(value);

                    }else if(key.equals("number")){
                        individual.setMemNo(Integer.parseInt(value));
                    }else if(key.equals("birthday")){
                        individual.setdOB(value);
                    }else if(key.equals("tier")){
                        individual.setTier(value);
                    }else if (key.equals("mileage")){
                        individual.setMileage(Double.parseDouble(value.replace("km","")));
                    }
                }else{
                    members.addIndiv(individual);
                    individual = new Individual();
                }

            }
        }
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println(members);

        String lineStorage1;

        /*

        try {
            File file1 = new File(args[1]);
            Scanner reader1 =new Scanner(file1);

            while (reader1.hasNextLine()){
                lineStorage1 = reader1.nextLine();

                if(!lineStorage.equals("")) {
                    String key = lineStorage.substring(0, lineStorage.indexOf(' ')),
                            value = lineStorage.substring(lineStorage.indexOf(' ') + 1);

                    if(key.equals("query")){
                        individual.setName(value);

                    }else if(key.equals("add")){
                        members.addIndiv(value);
                    }else if(key.equals("delete")){
                        members.delIndiv(value);
                    } else if(key.equals("earn")){
                        individual.earnMileage(value);
                    }else if(key.equals("redeem")){
                        individual.redeemPoints(value);
                    }

            }

        }
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
*/

        try{

            File file4 = new File(args[2]);
            PrintWriter out = new PrintWriter(new FileOutputStream(file4));
            out.println(members);
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }
}
