import transport.Bus;
import transport.Car;
import transport.Car.Key;
import transport.Train;

import java.time.LocalDate;
import java.util.Date;

import static transport.Car.printCarInfo;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Лада", "Гранта", (int) 1.7, "желтого", 2015, "Россия", "МКПП", "универсал", "х000хх000", 5, true, null, 500);
        Car audiA8 = new Car("Audi ", "A8", (int) 3.0, "черный", 2020, "Германия", "АКПП", "универсал", "х000хх000", 5, true, null, 500);
        Car bmwZ8 = new Car("BMW ", "Z8", (int) 3.0, "черный", 2021, "Германия", "МКПП", "универсал", "х000хх000", 5, true, null, 500);
        Car kia = new Car(" Kia", "Sportage", (int) 2.4, "красный", 2018, "Южной Корее", "АКПП", "универсал", "х000хх000", 5, true, null, 500);
        Car hyunda = new Car(" Hyundai", "Avante", (int) 1.6, " оранжевый", 2016, "Южной Корее", "МКПП", "универсал", "х000хх000", 5, true, null, 500);

        Key.Insurance ladaGranta1 = new Key.Insurance(LocalDate.of(2022, 12, 12),
                10000, "131313131");
        Key.Insurance audiA81 = new Key.Insurance(LocalDate.of(2022, 12, 12),
                10000, "131313131");
        Key.Insurance bmwZ81 = new Key.Insurance(LocalDate.of(2022, 12, 12),
                10000, "131313131");
        Key.Insurance kia1 = new Key.Insurance(LocalDate.of(2022, 12, 12),
                10000, "131313131");
        Key.Insurance hyunda1 = new Key.Insurance(LocalDate.of(2022, 12, 12),
                10000, "131313131");


        System.out.println("- марка " + kia.getBrand() + " - модель " + kia.getModel() + "- объем двигателя в литрах " + kia.engineVolume + "- цвет кузова " + kia.color +
                "- год производства " + kia.getProductionYear() + " - страна сборки " + kia.getProductionCountry() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
                ". Регистрационный номер: " + kia.getRegistrationNumber() +
                "." + (kia.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
                (kia.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
                " Номер страховки: " + kia.getInsurance().getNumberInsurance() +
                ". Стоимость страховки: " + kia.getInsurance().getCost() +
                ". Срок действия страховки: " + kia.getInsurance().getValidityPeriod() + (kia.isSummerTires() ? " Летняя" : " Зимняя") + " резина");
        System.out.println("- марка " + hyunda.getBrand() + " - модель " + hyunda.getModel() + "- объем двигателя в литрах " + hyunda.engineVolume + "- цвет кузова " + hyunda.color +
                "- страна сборки " + hyunda.getProductionYear() + " - год производства" + hyunda.getProductionCountry() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
                ". Регистрационный номер: " + hyunda.getRegistrationNumber() +
                "." + (hyunda.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
                (hyunda.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
                " Номер страховки: " + hyunda.getInsurance().getNumberInsurance() +
                ". Стоимость страховки: " + hyunda.getInsurance().getCost() +
                ". Срок действия страховки: " + hyunda.getInsurance().getValidityPeriod() + (hyunda.isSummerTires() ? " Летняя" : " Зимняя") + " резина");
        System.out.println("- марка " + ladaGranta.getBrand() + " - модель " + ladaGranta.getModel() + "- объем двигателя в литрах " + ladaGranta.engineVolume + "- цвет кузова " + ladaGranta.color +
                "- страна сборки " + ladaGranta.getProductionCountry() + " - год производства " + ladaGranta.getProductionCountry() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
                ". Регистрационный номер: " + ladaGranta.getRegistrationNumber() +
                "." + (ladaGranta.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
                (ladaGranta.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
                " Номер страховки: " + ladaGranta.getInsurance().getNumberInsurance() +
                ". Стоимость страховки: " + ladaGranta.getInsurance().getCost() +
                ". Срок действия страховки: " + ladaGranta.getInsurance().getValidityPeriod() + (ladaGranta.isSummerTires() ? " Летняя" : " Зимняя") + " резина");
        System.out.println("- марка " + bmwZ8.getBrand() + " - модель " + bmwZ8.getModel() + "- объем двигателя в литрах " + bmwZ8.engineVolume + "- цвет кузова " + bmwZ8.color +
                "- страна сборки " + bmwZ8.getProductionCountry() + " - год производства" + bmwZ8.getProductionYear() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
                ". Регистрационный номер: " + bmwZ8.getRegistrationNumber() +
                "." + (bmwZ8.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
                (bmwZ8.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
                " Номер страховки: " + bmwZ8.getInsurance().getNumberInsurance() +
                ". Стоимость страховки: " + bmwZ8.getInsurance().getCost() +
                ". Срок действия страховки: " + bmwZ8.getInsurance().getValidityPeriod() + (bmwZ8.isSummerTires() ? " Летняя" : " Зимняя") + " резина");
        System.out.println("- марка " + audiA8.getBrand() + " - модель " + audiA8.getModel() + "- объем двигателя в литрах " + audiA8.engineVolume + "- цвет кузова " + audiA8.color +
                "- страна сборки " + audiA8.getProductionCountry() + " - год производства " + audiA8.getProductionYear() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
                ". Регистрационный номер: " + audiA8.getRegistrationNumber() +
                "." + (audiA8.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
                (audiA8.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
                " Номер страховки: " + audiA8.getInsurance().getNumberInsurance() +
                ". Стоимость страховки: " + audiA8.getInsurance().getCost() +
                ". Срок действия страховки: " + audiA8.getInsurance().getValidityPeriod() + (audiA8.isSummerTires() ? " Летняя" : " Зимняя") + " резина");

        System.out.println("===============================================================================================================================================================");
        System.out.println(ladaGranta);
        System.out.println(ladaGranta1);
        System.out.println(audiA8);
        System.out.println(audiA81);
        System.out.println(bmwZ8);
        System.out.println(bmwZ81);
        System.out.println(kia);
        System.out.println(kia1);
        System.out.println(hyunda);
        System.out.println(hyunda1);

        ladaGranta.setColor("розовый");
        audiA81.setNumberInsurance("a078aa777фывфыв");
        ;

        ladaGranta.registrationNumber("С065МК 78RUS");
        Car.CarStateNumberValidator stateNumber = new Car.CarStateNumberValidator();
        String st = ladaGranta.getRegistrationNumber();
        System.out.println(stateNumber.isValid(st));


        Date date1 = new Date(2022, 1, 1);
        Date date2 = new Date(2023, 1, 1);
        int result = date1.compareTo(date2);
        if (result == 0)
            System.out.println("Обе даты равны");
        else if (result < 0)
            System.out.println("Номер страховки корректный!");
        else
            System.out.println("Номер страховки некорректный!");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    Train train = new Train("Ласточка ", " B-901 ", 2011, "России ", "", 301, 3500, 20.30, " отходит от Белорусского вокзала  ", " следует до станции Минск-Пассажирский ", 11);
    Train train1 = new Train("Ленинград ", " D-125 ", 2019, "России ", "", 270, 1700, 20.30, " отходит от Ленинградского вокзала  ", "следует до станции Ленинград-Пассажирский ", 8);

    Bus bus = new Bus("Икарус", "121", 2011, "России ", "Белый ", 120, 1500, 11.30, " отходит от Белорусского вокзала  ", " следует до Белорусского вокзала  ", 1);
    Bus bus1 = new Bus("БМВ", "121", 2016, "Германия ", "Красный", 160, 1700, 10.30, " отходит от Белорусского вокзала  ", " следует до Белорусского вокзала  ", 1);
    Bus bus2 = new Bus("Пазик", "101", 2019, "России ", "Черный ", 110, 1000, 11.30, " отходит от Белорусского вокзала  ", " следует до Белорусского вокзала  ", 1);
        System.out.println(train);
        System.out.println(train1);
        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println("=============================================================================================================================");
        bus2.refill();
        bus1.refill();
        bus.refill();
        train1.refill();
        train.refill();
        ladaGranta.refill();
        audiA8.refill();
        bmwZ8.refill();
        hyunda.refill();
        kia.refill();
}
}


