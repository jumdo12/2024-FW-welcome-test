package java_test;

import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String model1 = scanner.nextLine();
        int price1 = scanner.nextInt();
        scanner.nextLine();
        Fan fan1 = new Fan(model1, price1);

        String model2 = scanner.nextLine();
        int price2 = scanner.nextInt();
        scanner.nextLine();
        Fan fan2 = new Fan(model2, price2);

        String model3 = scanner.nextLine();
        int price3 = scanner.nextInt();
        Fan fan3 = new Fan(model3, price3);

        Fan cheapestFan = fan1;
        if (fan2.getPrice() < cheapestFan.getPrice()) {
            cheapestFan = fan2;
        }

        if (fan3.getPrice() < cheapestFan.getPrice()) {
            cheapestFan = fan3;
        }

        System.out.println(cheapestFan.getModel());
        scanner.close();
    }

    static class Fan {
        private String model;
        private int price;
    
        public Fan(String model, int price) {
            this.model = model;
            this.price = price;
        }
    
        public String getModel() {
            return model;
        }
    
        public int getPrice() {
            return price;
        }
    
        public void setModel(String model) {
            this.model = model;
        }
    
        public void setPrice(int price) {
            this.price = price;
        }
    }
}
