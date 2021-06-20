package HomeWork;

public class Cat {
    private String name;
    private int year;
    private double weight;

    public Cat(String name, int year, double weight){
        this.name=name;
        this.year=year;
        this.weight=weight;
    }
    public Cat(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public void sleep(){
        System.out.println("=_=");

    }
    public void eat(){
        System.out.println("Nyam Nyam");
    }
    public void run(){
        System.out.println("RUN RUN RUN!");
    }
    public void print(){
        System.out.println("Name" + name);
        System.out.println("Year" + year);
        System.out.println("Weight" + weight);
    }
    @Override
    public String toString(){
        return "Cat name = " + name + "; year = " + year + "; weight = " + weight;
    }
}
