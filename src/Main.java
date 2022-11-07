public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car();
        ladaGranta.brand = "Лада";
        ladaGranta.model = "Гранта";
        ladaGranta.color = "желтого";
        ladaGranta.engineVolume = (int) 1.7;
        ladaGranta.productionCountry = "Россия";
        ladaGranta.productionYear = 2015;

        Car audiA8 = new Car();
        audiA8.brand = "Audi ";
        audiA8.model = "A8";
        audiA8.color = "черный";
        audiA8.engineVolume = (int) 3.0;
        audiA8.productionCountry = "Германия";
        audiA8.productionYear = 2020;

        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW ";
        bmwZ8.model = "Z8";
        bmwZ8.color = "черный";
        bmwZ8.engineVolume = (int) 3.0;
        bmwZ8.productionCountry = "Германия";
        bmwZ8.productionYear = 2021;

        Car kia = new Car();
        kia.brand = " Kia";
        kia.model = "Sportage";
        kia.color = "красный";
        kia.engineVolume = (int) 2.4;
        kia.productionCountry = "Южной Корее";
        kia.productionYear = 2018;

        Car hyunda = new Car();
        hyunda.brand = " Hyundai";
        hyunda.model = "Avante";
        hyunda.color = " оранжевый";
        hyunda.engineVolume = (int) 1.6;
        hyunda.productionCountry = "Южной Корее";
        hyunda.productionYear = 2016;


        System.out.println("- марка " + kia.brand + " - модель " + kia.model + "- объем двигателя в литрах" + kia.engineVolume + "- цвет кузова" + kia.color +
                "- год производства" + kia.productionYear + " - страна сборки" + kia.productionCountry);
        System.out.println("- марка " + hyunda.brand + " - модель " + hyunda.model + "- объем двигателя в литрах" + hyunda.engineVolume + "- цвет кузова" + hyunda.color +
                "- год производства" + hyunda.productionYear +  " - страна сборки" + hyunda.productionCountry);
        System.out.println("- марка " + ladaGranta.brand + " - модель " + ladaGranta.model + "- объем двигателя в литрах" + ladaGranta.engineVolume + "- цвет кузова" + ladaGranta.color +
                "- год производства" + ladaGranta.productionYear + " - страна сборки" + ladaGranta.productionCountry);
        System.out.println("- марка " + bmwZ8.brand + " - модель " + bmwZ8.model + "- объем двигателя в литрах" + bmwZ8.engineVolume + "- цвет кузова" + bmwZ8.color +
                "- год производства" + bmwZ8.productionYear + " - страна сборки" + bmwZ8.productionCountry);
        System.out.println("- марка " + audiA8.brand + " - модель " + audiA8.model + "- объем двигателя в литрах" + audiA8.engineVolume + "- цвет кузова" + audiA8.color +
                "- год производства" + audiA8.productionYear +  " - страна сборки" + audiA8.productionCountry);


    }
}