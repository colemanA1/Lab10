import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static ArrayList<Car> carList = new ArrayList<>();
    static boolean buyOrNah = true;

    public static int userChoice() {
        int input = Validator.getInt(scan, "Please make a selection from our dealership...", 1, carList.size());
        return input;
    }


    public static void main(String[] args) {

        String yesNo = "";
        System.out.println("WELCOME TO THE GRAND CIRCUS CAR LOT!");
        System.out.println();
        System.out.printf("%-2s %-12s %-12s %-12s %-13s %-6s %-2s", "Num", "Model", "Make", "Year", "Price", "N/U", "Mileage\n");
        System.out.println("------------------------------------------------------------------------------");
        carList.add(new Car("Lamborghini", "Reventon", 2010, 2500000));
        carList.add(new Car("Mercedes", "Maybach", 2017, 500000));
        carList.add(new Car("Aston Martin", "DB10", 2011, 1500000));
        carList.add(new UsedCar("Ford", "Pinto", 1978, 2000, "(Used)", 300000));
        carList.add(new UsedCar("Mazda", "Miata", 1994, 800, "(Used)", 280000));
        carList.add(new UsedCar("Geo/Chevy", "Metro", 1995, 500, "(Used)", 300000));

        for (int i = 0; i < carList.size(); ++i) {
            System.out.print((i + 1) + ". ");
            System.out.println(carList.get(i).toString());
        }
            do{
                int makeSelection = userChoice();
                System.out.println(carList.get(makeSelection - 1));
                yesNo = Validator.getString(scan, "Would you like to purchase this automobile, sir/ma'am?(y/n)");
                buyOrNah = yesNo.equalsIgnoreCase("y");
                if (buyOrNah) {
                    carList.remove(makeSelection - 1);
                    System.out.println("Excellent Selection Sir/Ma'am");
                    for (int i = 0; i < carList.size(); ++i) {
                        System.out.print((i + 1) + ". ");
                        System.out.println(carList.get(i).toString());
                    }
                } else {
                    System.out.println("Another Day Perhaps!");
                }
            yesNo = Validator.getString(scan, "Would you like to make another purchase?");
            }while (buyOrNah = yesNo.equalsIgnoreCase("y")) ;
    }
}