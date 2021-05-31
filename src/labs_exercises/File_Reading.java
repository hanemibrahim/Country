
package labs_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class File_Reading {
    public List <City> read_csv_files(String filename) throws NumberFormatException,FileNotFoundException{
      List <City> cities=new ArrayList<>(); 
      File file1=new File(filename);
      Scanner sc=null;
        try  {
            sc = new Scanner(file1);
            String line = sc.nextLine();
            
            while (sc.hasNextLine()) {
                City city = new City();
                line = sc.nextLine();
                String [] features = line.split(",");
                city.setcode(features[0]);
                city.setName(features[1]);
                city.setContinent(features[2]);
                city.setArea(Double.parseDouble(features[3].trim()));
                city.setPopulation(Integer.parseInt(features[4].trim()));
                cities.add(city);
            } //closes the scanner  }
             } catch (NumberFormatException ignored) {
            
        }
        finally {
            sc.close();
        }  //closes the scanner  }
        return cities;
    }
    public List<Country> readCountryfromCSV(String filename) {
        Scanner sc=null;
        List<Country> countries = new ArrayList<Country>();

        try{
            File file2 = new File(filename);
            sc = new Scanner(file2);
            String line = sc.nextLine(); //closes the scanner  }
            while(sc.hasNextLine()){
                line = sc.nextLine();
                String [] features = line.split(",");
                Country country = new Country();

                country.setCode(features[0]);
                country.set_conname(features[1]);
                countries.add(country);
            
            
        } }catch (FileNotFoundException ex) {
            Logger.getLogger(File_Reading.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            sc.close();
        }  //closes the scanner  }
        return countries;
    }
    }


    
    

