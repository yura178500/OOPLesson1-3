import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car();
        ladaGranta.getBrand() = "Лада";
        ladaGranta.getModel() = "Гранта";
        ladaGranta.color = "желтого";
        ladaGranta.engineVolume = (int) 1.7;
        ladaGranta.getProductionCountry() = "Россия";
        ladaGranta.getProductionYear() = 2015;

        Car audiA8 = new Car();
        audiA8.getBrand() = "Audi ";
        audiA8.getModel() = "A8";
        audiA8.color = "черный";
        audiA8.engineVolume = (int) 3.0;
        audiA8.getProductionCountry() = "Германия";
        audiA8.getProductionYear() = 2020;

        Car bmwZ8 = new Car();
        bmwZ8.getBrand() = "BMW ";
        bmwZ8.getModel() = "Z8";
        bmwZ8.color = "черный";
        bmwZ8.engineVolume = (int) 3.0;
        bmwZ8.getProductionCountry() = "Германия";
        bmwZ8.getProductionYear() = 2021;

        Car kia = new Car();
        kia.getBrand() = " Kia";
        kia.getModel() = "Sportage";
        kia.color = "красный";
        kia.engineVolume = (int) 2.4;
        kia.getProductionCountry() = "Южной Корее";
        kia.getProductionYear() = 2018;

        Car hyunda = new Car();
        hyunda.getBrand() = " Hyundai";
        hyunda.getModel() = "Avante";
        hyunda.color = " оранжевый";
        hyunda.engineVolume = (int) 1.6;
        hyunda.getProductionCountry() = "Южной Корее";
        hyunda.getProductionYear() = 2016;


        System.out.println("- марка " + kia.getBrand() + " - модель " + kia.getModel() + "- объем двигателя в литрах" + kia.engineVolume + "- цвет кузова" + kia.color +
                "- год производства" + kia.getProductionYear() + " - страна сборки" + kia.getProductionCountry());
        System.out.println("- марка " + hyunda.getBrand() + " - модель " + hyunda.getModel() + "- объем двигателя в литрах" + hyunda.engineVolume + "- цвет кузова" + hyunda.color +
                "- год производства" + hyunda.getProductionYear() +  " - страна сборки" + hyunda.getProductionCountry());
        System.out.println("- марка " + ladaGranta.getBrand() + " - модель " + ladaGranta.getModel() + "- объем двигателя в литрах" + ladaGranta.engineVolume + "- цвет кузова" + ladaGranta.color +
                "- год производства" + ladaGranta.getProductionCountry() + " - страна сборки" + ladaGranta.getProductionCountry());
        System.out.println("- марка " + bmwZ8.getBrand() + " - модель " + bmwZ8.getModel() + "- объем двигателя в литрах" + bmwZ8.engineVolume + "- цвет кузова" + bmwZ8.color +
                "- год производства" + bmwZ8.getProductionCountry() + " - страна сборки" + bmwZ8.getProductionYear());
        System.out.println("- марка " + audiA8.getBrand() + " - модель " + audiA8.getModel() + "- объем двигателя в литрах" + audiA8.engineVolume + "- цвет кузова" + audiA8.color +
                "- год производства" + audiA8.getProductionCountry() +  " - страна сборки" + audiA8.getProductionYear());

        System.out.println("===============================================================================================================================================================");

        boolean winterTires = true;
        boolean summerTires = true;
        System.out.println(winterTires == summerTires);
        System.out.println(true == winterTires);
        System.out.println((boolean) true == winterTires);


    }
}