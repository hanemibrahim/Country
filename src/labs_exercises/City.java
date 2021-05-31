
package labs_exercises;


public class City {
private String name;
private String continent;
private String code;
private int population;
private Double area;
/*
    public City (String name,String continent,double area,int population) {
        this.name = name;
        this.continent=continent;
        this.area=area;
        this.population = population;
    }
*/
    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setContinent(String continent) {
        this.continent = continent;
    }
    
    public String getContinent() {
        return continent;
    }
    public void setArea(Double area) {
        this.area = area;
    }
    
    public Double getArea() {
        return area;
        
    }
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name
                + ", " + "continent=" + continent
                + "," + "Area=" + area
                + "population=" + population + '}';
    }
}

