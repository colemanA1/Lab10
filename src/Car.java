public class Car {
    //Main cannot see these variables.
    public int carNum;
    public String make;
    public String model;
    public int year;

    public double price;

    //Command N or right click and select generate, select all variables, constructor for method in the bottom method.
//Command N getter/setter makes the getter/setter right below.
    public int getcarNum(){
        return carNum;
    }
    public void setcarNum(int carNum){
        this.carNum = carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;

    }

    //Changes the way the object prints.  Method signature must match the same .toString method.

    /**
     *Remember String.format()
     */
    @Override
    public String toString(){
        return String.format("%-4d %-13s %-12s %-12s $%-12.2f", carNum, make, model, year, price);
    }
    public Car() {
        this.carNum = 0;
        this.make = "";
        this.model = "";
        this.year = 0;
        this.price = 0;
    }
    public Car(int carNum, String make, String model, int year, double price) {
        this.carNum = carNum;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}

