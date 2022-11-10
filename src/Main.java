import transport.Car;

import java.util.Date;

public class Main {
    public static void main(String[] args){

        Car ladaGranta = new Car("Лада", "Гранта", (int) 1.7, "желтого", 2015, "Россия", "МКПП", "универсал", "х000хх000", 5, "summerTires");
        Car audiA8 = new Car("Audi ", "A8", (int) 3.0, "черный", 2020, "Германия", "АКПП", "универсал", "х000хх000", 5, "summerTires");
        Car bmwZ8 = new Car("BMW ", "Z8", (int) 3.0, "черный", 2021, "Германия", "МКПП", "универсал", "х000хх000", 5, "winterTires");
        Car kia = new Car(" Kia", "Sportage", (int) 2.4, "красный", 2018, "Южной Корее", "АКПП", "универсал", "х000хх000", 5, "summerTires");
        Car hyunda = new Car(" Hyundai", "Avante", (int) 1.6, " оранжевый", 2016, "Южной Корее", "МКПП", "универсал", "х000хх000", 5, "summerTires");

        System.out.println("- марка " + kia.getBrand() + " - модель " + kia.getModel() + "- объем двигателя в литрах" + kia.engineVolume + "- цвет кузова " + kia.color +
                "- год производства" + kia.getProductionYear() + " - страна сборки" + kia.getProductionCountry());
        System.out.println("- марка " + hyunda.getBrand() + " - модель " + hyunda.getModel() + "- объем двигателя в литрах" + hyunda.engineVolume + "- цвет кузова " + hyunda.color +
                "- год производства" + hyunda.getProductionYear() + " - страна сборки" + hyunda.getProductionCountry());
        System.out.println("- марка " + ladaGranta.getBrand() + " - модель " + ladaGranta.getModel() + "- объем двигателя в литрах" + ladaGranta.engineVolume + "- цвет кузова " + ladaGranta.color +
                "- год производства" + ladaGranta.getProductionCountry() + " - страна сборки" + ladaGranta.getProductionCountry());
        System.out.println("- марка " + bmwZ8.getBrand() + " - модель " + bmwZ8.getModel() + "- объем двигателя в литрах" + bmwZ8.engineVolume + "- цвет кузова" + bmwZ8.color +
                "- год производства" + bmwZ8.getProductionCountry() + " - страна сборки" + bmwZ8.getProductionYear());
        System.out.println("- марка " + audiA8.getBrand() + " - модель " + audiA8.getModel() + "- объем двигателя в литрах" + audiA8.engineVolume + "- цвет кузова" + audiA8.color +
                "- год производства" + audiA8.getProductionCountry() + " - страна сборки" + audiA8.getProductionYear());

        System.out.println("===============================================================================================================================================================");
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kia);
        System.out.println(hyunda);


        ladaGranta.setSummerTyre();
        System.out.println(ladaGranta.isSummerTyre);
        System.out.println(audiA8.isSummerTyre);
        System.out.println(bmwZ8.isSummerTyre);
        System.out.println(kia.isSummerTyre);
        System.out.println(hyunda.isSummerTyre);

        ladaGranta.registrationNumber("С065МК 78RUS");
        Car.CarStateNumberValidator stateNumber = new Car.CarStateNumberValidator();
        String st = ladaGranta.getRegistrationNumber();
        System.out.println(stateNumber.isValid(st));

        Date date1 = new Date(2022, 1, 1);
        Date date2 = new Date(2023, 1, 1);
        int result = date1.compareTo(date2);
        if( result ==0)
            System.out.println("Both dates are equal");
        else if(result < 0)
            System.out.println("Date1 is before Date2");
        else
            System.out.println("Date1 is after Date2");


    }
       }
