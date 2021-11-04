package com.company;

public class Main {

    public static void main(String[] args) {
        ElectronicDevices iphone = new Iphone();
        iphone.joinWorkshop(new ProduceWorkShop());
        iphone.joinWorkshop(new AssembleWorkShop());
        iphone.joinWorkshop(new TestWorkShop());
        iphone.manufacture();

        ElectronicDevices macbook = new Macbook();
        macbook.joinWorkshop(new ProduceWorkShop());
        macbook.joinWorkshop(new AssembleWorkShop());
        macbook.joinWorkshop(new TestWorkShop());
        macbook.manufacture();

        ElectronicDevices applewatch = new AppleWatch();
        applewatch.joinWorkshop(new ProduceWorkShop());
        applewatch.joinWorkshop(new AssembleWorkShop());
        applewatch.joinWorkshop(new TestWorkShop());
        applewatch.manufacture();
    }
}
