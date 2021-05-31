
package labs_exercises;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main_Class {




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        //get cities and countries from csv files and stores them in lists
        List<City> cities = new ArrayList<City>();
        List<Country> countries = new ArrayList<Country>();
        File_Reading Daata = new File_Reading();
        cities = Daata.read_csv_files("cities.csv");
        countries = Daata.readCountryfromCSV("country.csv");
        
        //print list of cities and countries
        System.out.println("\n Cities ");
        for(City c:cities){
            System.out.println(" "+c.getName());
        }
        System.out.println("\n Countries ");
        for(Country count:countries){
            System.out.println(" "+count.get_conname());
        }
        
        //map that uses the country code as keys and a list of cities as the value for each country. 
        List<City> citiesInSameCountry = new LinkedList<City>();
        List<City> y = new LinkedList<City>();
        Map<String,List<City>> map = new HashMap<>();
        System.out.println("\n Maping ");
        for(Country country:countries){
            for(City city:cities){
                //System.out.println(city.getName());
                if(country.getCode().equals(city.getcode()))
                    citiesInSameCountry.add(city);
                    
            }
            
            map.put(country.getCode(), citiesInSameCountry);
            
            
            //citiesInSameCountry.clear();              
            citiesInSameCountry = new LinkedList<City>();   
            
            y = map.get(country.getCode());
            for(City m:y)
                System.out.println("countryCode: "+country.getCode()
                                  +", cityName: "  +m.getName()
                                  +", continent: " +m.getContinent()
                                  +", Surface Area: "+m.getArea()
                                  +", population: "  +m.getPopulation()
                                  );
                    
        }
        
        System.out.println("\n Sorted cities ");
        //Ask user to enter country code
        citiesInSameCountry = new LinkedList<City>();
        System.out.println("Enter Country code: ");
        Scanner sc = new Scanner(System.in);
        String searchKey = sc.next().trim();
        citiesInSameCountry = map.get(searchKey);
        
        
        citiesInSameCountry.sort(new populationSorter());
        
        for(City m:citiesInSameCountry)
            System.out.println("countryCode: "+searchKey
                              +", cityName: "  +m.getName()
                              +", continent: " +m.getContinent()
                              +", Surface Area: "+m.getArea()
                              +", population: "  +m.getPopulation()
                              );
        
        
  
}}
