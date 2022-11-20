import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sponsor lucoil = new Sponsor("Лукойл", 200000);
        Mtchanik<Trucks> oleg = new Mtchanik<Trucks>("JAC", "N-35/25", 3.4, "Олег", "Петров", "Нептун");
        Sponsor dvigenie = new Sponsor("Движение", 100000);
        Mtchanik<PassengerCars> roma = new Mtchanik<PassengerCars>("Лада", "N-35/25", 3.4, "Рома", "Петров", "Нептун");
        Mtchanik<TheBuses> kirill = new Mtchanik<TheBuses>("Пазик", "N-35/25", 3.4, "Кирилл", "Петров", "Нептун");


        //   Car ladaGranta = new Car("Лада", "Гранта", (int) 1.7, "желтого", 2015, "Россия", "МКПП", "универсал", "х000хх000", 5, true, null, 500);
        //   Car audiA8 = new Car("Audi ", "A8", (int) 3.0, "черный", 2020, "Германия", "АКПП", "универсал", "х000хх000", 5, true, null, 500);
        //    Car bmwZ8 = new Car("BMW ", "Z8", (int) 3.0, "черный", 2021, "Германия", "МКПП", "универсал", "х000хх000", 5, true, null, 500);
        //    Car kia = new Car(" Kia", "Sportage", (int) 2.4, "красный", 2018, "Южной Корее", "АКПП", "универсал", "х000хх000", 5, true, null, 500);
        //   Car hyunda = new Car(" Hyundai", "Avante", (int) 1.6, " оранжевый", 2016, "Южной Корее", "МКПП", "универсал", "х000хх000", 5, true, null, 500);

        //   Key.Insurance ladaGranta1 = new Key.Insurance(LocalDate.of(2022, 12, 12),
        //           10000, "131313131");
        //   Key.Insurance audiA81 = new Key.Insurance(LocalDate.of(2022, 12, 12),
        //           10000, "131313131");
        //   Key.Insurance bmwZ81 = new Key.Insurance(LocalDate.of(2022, 12, 12),
        //          10000, "131313131");
        //   Key.Insurance kia1 = new Key.Insurance(LocalDate.of(2022, 12, 12),
        //          10000, "131313131");
        //   Key.Insurance hyunda1 = new Key.Insurance(LocalDate.of(2022, 12, 12),
        //           10000, "131313131");


        //   System.out.println("- марка " + kia.getBrand() + " - модель " + kia.getModel() + "- объем двигателя в литрах " + kia.engineVolume + "- цвет кузова " + kia.color +
        //          "- год производства " + kia.getProductionYear() + " - страна сборки " + kia.getProductionCountry() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
        //          ". Регистрационный номер: " + kia.getRegistrationNumber() +
        //          "." + (kia.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
        //          (kia.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
        //          " Номер страховки: " + kia.getInsurance().getNumberInsurance() +
        //          ". Стоимость страховки: " + kia.getInsurance().getCost() +
        //          ". Срок действия страховки: " + kia.getInsurance().getValidityPeriod() + (kia.isSummerTires() ? " Летняя" : " Зимняя") + " резина");
        //   System.out.println("- марка " + hyunda.getBrand() + " - модель " + hyunda.getModel() + "- объем двигателя в литрах " + hyunda.engineVolume + "- цвет кузова " + hyunda.color +
        //         "- страна сборки " + hyunda.getProductionYear() + " - год производства" + hyunda.getProductionCountry() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
        //         ". Регистрационный номер: " + hyunda.getRegistrationNumber() +
        //           "." + (hyunda.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
        //           (hyunda.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
        //          " Номер страховки: " + hyunda.getInsurance().getNumberInsurance() +
        //           ". Стоимость страховки: " + hyunda.getInsurance().getCost() +
        //            ". Срок действия страховки: " + hyunda.getInsurance().getValidityPeriod() + (hyunda.isSummerTires() ? " Летняя" : " Зимняя") + " резина");
        //    System.out.println("- марка " + ladaGranta.getBrand() + " - модель " + ladaGranta.getModel() + "- объем двигателя в литрах " + ladaGranta.engineVolume + "- цвет кузова " + ladaGranta.color +
        //           "- страна сборки " + ladaGranta.getProductionCountry() + " - год производства " + ladaGranta.getProductionCountry() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
        //           ". Регистрационный номер: " + ladaGranta.getRegistrationNumber() +
        //           "." + (ladaGranta.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
        //           (ladaGranta.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
        //           " Номер страховки: " + ladaGranta.getInsurance().getNumberInsurance() +
        //            ". Стоимость страховки: " + ladaGranta.getInsurance().getCost() +
        //         ". Срок действия страховки: " + ladaGranta.getInsurance().getValidityPeriod() + (ladaGranta.isSummerTires() ? " Летняя" : " Зимняя") + " резина");
        //  System.out.println("- марка " + bmwZ8.getBrand() + " - модель " + bmwZ8.getModel() + "- объем двигателя в литрах " + bmwZ8.engineVolume + "- цвет кузова " + bmwZ8.color +
        //           "- страна сборки " + bmwZ8.getProductionCountry() + " - год производства" + bmwZ8.getProductionYear() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
        //           ". Регистрационный номер: " + bmwZ8.getRegistrationNumber() + "." + (bmwZ8.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
        //          (bmwZ8.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
        //           " Номер страховки: " + bmwZ8.getInsurance().getNumberInsurance() +
        //           ". Стоимость страховки: " + bmwZ8.getInsurance().getCost() +
        //           ". Срок действия страховки: " + bmwZ8.getInsurance().getValidityPeriod() + (bmwZ8.isSummerTires() ? " Летняя" : " Зимняя") + " резина");
        //   System.out.println("- марка " + audiA8.getBrand() + " - модель " + audiA8.getModel() + "- объем двигателя в литрах " + audiA8.engineVolume + "- цвет кузова " + audiA8.color +
        //           "- страна сборки " + audiA8.getProductionCountry() + " - год производства " + audiA8.getProductionYear() + " Номер страховки: " + Key.Insurance.getNumberInsurance() +
        //           ". Регистрационный номер: " + audiA8.getRegistrationNumber() +
        //           "." + (audiA8.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
        //           (audiA8.getKey().isRemoteEngineStart() ? " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
        //           " Номер страховки: " + audiA8.getInsurance().getNumberInsurance() +
        //          ". Стоимость страховки: " + audiA8.getInsurance().getCost() +
        //          ". Срок действия страховки: " + audiA8.getInsurance().getValidityPeriod() + (audiA8.isSummerTires() ? " Летняя" : " Зимняя") + " резина");

        //   System.out.println("===============================================================================================================================================================");
        //  System.out.println(ladaGranta);
        //  System.out.println(ladaGranta1);
        //   System.out.println(audiA8);
        //   System.out.println(audiA81);
        //   System.out.println(bmwZ8);
        //   System.out.println(bmwZ81);
        //   System.out.println(kia);
        //   System.out.println(kia1);
        //   System.out.println(hyunda);
        //  System.out.println(hyunda1);

        //   ladaGranta.setColor("розовый");
        //   audiA81.setNumberInsurance("a078aa777фывфыв");
        ;

        //  ladaGranta.registrationNumber("С065МК 78RUS");
        //   Car.CarStateNumberValidator stateNumber = new Car.CarStateNumberValidator();
        //   String st = ladaGranta.getRegistrationNumber();
        //   System.out.println(stateNumber.isValid(st));


        //  Date date1 = new Date(2022, 1, 1);
        //  Date date2 = new Date(2023, 1, 1);
        //   int result = date1.compareTo(date2);
        //   if (result == 0)
        //      System.out.println("Обе даты равны");
        //   else if (result < 0)
        //      System.out.println("Номер страховки корректный!");
        //   else
        //      System.out.println("Номер страховки некорректный!");
        //  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        //    Train train = new Train("Ласточка ", " B-901 ", 2011, "России ", "", 301, 3500, 20.30, " отходит от Белорусского вокзала  ", " следует до станции Минск-Пассажирский ", 11);
        //    Train train1 = new Train("Ленинград ", " D-125 ", 2019, "России ", "", 270, 1700, 20.30, " отходит от Ленинградского вокзала  ", "следует до станции Ленинград-Пассажирский ", 8);

        //  Bus bus = new Bus("Икарус", "121", 2011, "России ", "Белый ", 120, 1500, 11.30, " отходит от Белорусского вокзала  ", " следует до Белорусского вокзала  ", 1, 3);
        //  Bus bus1 = new Bus("БМВ", "121", 2016, "Германия ", "Красный", 160, 1700, 10.30, " отходит от Белорусского вокзала  ", " следует до Белорусского вокзала  ", 1, 2.7);
        //  Bus bus2 = new Bus("Пазик", "101", 2019, "России ", "Черный ", 110, 1000, 11.30, " отходит от Белорусского вокзала  ", " следует до Белорусского вокзала  ", 1, 3.1);
        //   Bus bus3 = new Bus("Лиаз", "101", 2019, "России ", "Черный ", 110, 1000, 11.30, " отходит от Белорусского вокзала  ", " следует до Белорусского вокзала  ", 1, 3.1);
        //   System.out.println(train);
        //   System.out.println(train1);
        //   System.out.println(bus);
        //   System.out.println(bus1);
        //  System.out.println(bus2);
        //  System.out.println(bus3);
        //   System.out.println("=============================================================================================================================");
        //   bus2.refill();
        //   bus1.refill();
        //   bus.refill();
        //   train1.refill();
        //    train.refill();
        //  ladaGranta.refill();
        //  audiA8.refill();
        // bmwZ8.refill();
        //  hyunda.refill();
        //   kia.refill();
        System.out.println("==============================++++++++++++++++++++++++++++++++++++++++++++++++++===");
        TheBuses buses = new TheBuses("Икарус", "121", 3.2, TypeOfoutOfSight.LARGE);
        TheBuses buses1 = new TheBuses("Пазик", "101", 4.0, TypeOfoutOfSight.ESPECIALLY);
        TheBuses buses2 = new TheBuses("Лиаз", "101", 3.2, TypeOfoutOfSight.MEDIUM);
        TheBuses buses3 = new TheBuses("БМВ", "121", 3.4, TypeOfoutOfSight.ESPECIALLE_SMALL);
        TheBuses buses4 = new TheBuses("БМВ", "121", 3.4, TypeOfoutOfSight.SMAL);
        buses1.addMtchanik(kirill);
        buses1.addDriver(new DriverD("Кирилл", 10, buses1));
        buses1.addSponsor(dvigenie);

        PassengerCars cars = new PassengerCars("Лада", "Granta", 2.0, TypeCars.CROSSOVER);
        PassengerCars cars1 = new PassengerCars("Ауди", "A8", 2.4, TypeCars.MINIVAN);
        PassengerCars cars2 = new PassengerCars("Киа", "Sportage", 2.8, TypeCars.SEDAN);
        PassengerCars cars3 = new PassengerCars("Хундай", "Avante", 1.4, TypeCars.SUV);
        cars.addMtchanik(roma);
        cars.addDriver(new DriverB("Олег", 10, cars));
        cars.addSponsor(dvigenie);

        Trucks jac = new Trucks("JAC", "N-35/25", 3.4, TypeOfLoadCapacity.N1);
        Trucks kamaz = new Trucks("Камаз", "54901", 2.4, TypeOfLoadCapacity.N2);
        Trucks valdai = new Trucks("Волдай", "Next", 3.4, TypeOfLoadCapacity.N3);
        Trucks gazel = new Trucks("Газель", "NN", 2.8, TypeOfLoadCapacity.N2);
        kamaz.addMtchanik(oleg);
       // kamaz.addDriver(new DriverC("Олег", 10, kamaz));
        kamaz.addSponsor(lucoil);



        cars.printCar();
        cars1.printCar();
        cars2.printCar();
        cars3.printCar();
        jac.printTrucks();
        kamaz.printTrucks();
        valdai.printTrucks();
        gazel.printTrucks();
        buses.printBuses();
        buses1.printBuses();
        buses2.printBuses();
        buses3.printBuses();


        //   cars.startMovements();
        //   jac.finishMovements();

        //   buses3.maximumSpeed();

        //   chekCompeting(buses3);
        //  gazel.command(buses2.CMD_PITSTOP);
        //   jac.command(buses.CMD_MAXIMUM_SPID);

        System.out.println("-----------------------------------------------------------------");


        //   Driver<TheBuses> igor = new Driver<>("Игорь ", "катигория Е", 8);
        //   Driver<Trucks> dima = new Driver<>("Дима ", "катигория C", 8);
        //  Driver<PassengerCars> oleg = new Driver<>("Олег ", "катигория B", 8);
        //   System.out.println("водитель " + "\"" + igor +  "управляет автомобилем " + buses1 + "  и будет участвовать в заезде");
        //   System.out.println("водитель "+"\""+ dima +  "управляет автомобилем " + jac + "  и будет участвовать в заезде");
        //   System.out.println("водитель "+"\""+ oleg +  "управляет автомобилем " + cars1 + "  и будет участвовать в заезде");


//    }

        //  public static void chekCompeting(Competing... transports) {
        //     for (Competing transport : transports) {
        //         for (String command : transport.getCompeting()) {
        //            transport.doCommand(command);
        //         }
        //   }
        // }

        PassengerCars car = new PassengerCars("Kia", "K5", 3.0, TypeCars.SUV);
        DriverB driverB = new DriverB("Роман", 10, car);
        System.out.println(driverB);
        DriverC driverC = new DriverC("Роман", 10, kamaz);
        DriverD driverD = new DriverD("Роман", 10, buses1);
        System.out.println(driverC);
        System.out.println(driverD);

        buses1.printType();
        List<TransportForRacing> transport = List.of(kamaz, car,buses1);
        for (TransportForRacing transport1 : transport) {
            printInfo(transport1);
        }
        }
    static Mtchanik<?> mtchanik = new Mtchanik<>("Камаз ", "456 ", 2.4, "Кирилл ", "Ветров ", "Лукоил ");
    public Sponsor sponsor = new Sponsor("Движение", 30000);
    public Sponsor sponsor1 = new Sponsor("Лукоил", 30000);


    public static void printInfo (TransportForRacing transport) {
        System.out.println(transport.getDrivers() + transport.getModel());
        System.out.println("Водитель" + transport.getDrivers());
        System.out.println("Спонсор" + transport.getSponsor());
        System.out.println("Механик" + mtchanik.getName() + mtchanik.getSorname() + mtchanik.getCompani());
       }
    }

