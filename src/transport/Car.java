package transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {

    private Key.Insurance insurance;
    private Key key;
    private String brand;
    private String model;
    public int engineVolume;
    public String color;
    private int productionYear;
    private String productionCountry;

    public String transmission;
    private String bodyType;
    public String registrationNumber;
    private int numberOfSeats;
    public boolean summerTires;


    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean getRemoteEngineStart() {

            return remoteEngineStart;
        }

        public boolean setRemoteEngineStart(String remoteEngineStart) {
            remoteEngineStart = remoteEngineStart;
            return false;
        }

        public boolean getKeylessAccess() {
            return keylessAccess;
        }

        public boolean setKeylessAccess(String keylessAccess) {
            keylessAccess = keylessAccess;
            return false;
        }

        public boolean isKeylessAccess() {
            return false;
        }

        public boolean isRemoteEngineStart() {
            return false;
        }

        public static class Insurance {
            private static LocalDate validityPeriod;
            private static int cost;
            private static String numberInsurance;

            public String toString() {
                return "Insurance{" +
                        "validityPeriod= " + validityPeriod +
                        ", cost= " + cost +
                        ", numberInsurance= " + numberInsurance +
                        '}';
            }

            public Insurance(LocalDate validityPeriod, int cost, String numberInsurance) {
                this.validityPeriod = validityPeriod;
                this.cost = cost;
                this.numberInsurance = numberInsurance;
                if (validityPeriod == null) {
                    this.validityPeriod = LocalDate.now().plusDays(365);
                } else {
                    this.validityPeriod = validityPeriod;
                }
                this.cost = cost;
                if (numberInsurance == null) {
                    this.numberInsurance = "123456789";
                } else {
                    this.numberInsurance = numberInsurance;
                }


            }

            public Insurance() {
                this(null, 5000, null);
            }

            public static LocalDate getValidityPeriod() {
                validityPeriod = validityPeriod;

                return validityPeriod;
            }

            public void checkExpiryDate() {
                if (validityPeriod.isBefore(LocalDate.now()) || validityPeriod.isEqual(LocalDate.now())) {
                    System.out.println("Вам нужно заново оформить страховку!");
                } else {
                    System.out.println("Ваша страховка действует до " + validityPeriod);
                }
            }

            public void main(String args[]) {
                String numberInsurance = "125445678";
                for (int i = 0; i < numberInsurance.length(); i++) {
                    if (numberInsurance.charAt(i) < '0' || numberInsurance.charAt(i) > '9') {
                        System.out.println("Номер страховки некорректный!");
                        break;
                    }
                }
            }

            public String setValidityPeriod(String validityPeriod) {
                validityPeriod = validityPeriod;
                return validityPeriod;
            }

            public static int getCost() {

                if (cost <= 0) {
                    cost = cost;

                } else {
                    cost = Math.abs(cost);
                }
                return cost;
            }

            public void setCost(int cost) {
                this.cost = cost;
            }

            public static String getNumberInsurance() {

                if (numberInsurance != null || numberInsurance.isEmpty()) {
                    numberInsurance = numberInsurance;
                }
                return numberInsurance;
            }

            public void setNumberInsurance(String numberInsurance) {

                this.numberInsurance = numberInsurance;
            }

        }
    }

    public String toString() {
        return "Car{" +
                "insurance= " + insurance +
                ", key= " + key +
                ", brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", engineVolume= " + engineVolume +
                ", color=' " + color + '\'' +
                ", productionYear= " + productionYear +
                ", productionCountry= '" + productionCountry + '\'' +
                ", transmission=' " + transmission + '\'' +
                ", bodyType=' " + bodyType + '\'' +
                ", registrationNumber=' " + registrationNumber + '\'' +
                ", numberOfSeats= " + numberOfSeats +
                ", summerTyre= " + summerTires +
                '}';
    }


    public boolean isSummerTires() {
        return summerTires;
    }

    public Car(String brand, String model, int engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTires, Key key, int insurance) {
        this.numberOfSeats = numberOfSeats;
        this.summerTires = summerTires;
        insurance = (int) insurance;
        if (brand == null || brand.length() == 0) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.length() == 0) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.engineVolume = engineVolume;
        if (color == null || color.length() == 0) {
            this.color = "жёлтый";
        } else {
            this.color = color;
        }
        this.productionYear = productionYear;
        if (productionCountry == null || productionCountry.length() == 0) {
            this.productionCountry = "'страна не указана'";
        } else {
            this.productionCountry = productionCountry;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        Key.Insurance insurance1;
        if (insurance < 0) {
            this.insurance = new Key.Insurance();
        }

        this.numberOfSeats = numberOfSeats;
    }

    private boolean summerTyre() {
        return false;
    }

    public void setSummerTires() {
        this.summerTires = summerTires;
    }

    public String getBrand() {

        if (brand == null || brand.isEmpty()) {
            this.brand = brand;
        } else {
        }
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        this.model = model;
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineVolume() {
        this.engineVolume = engineVolume;
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        this.color = color;
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        this.productionYear = productionYear;
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductionCountry() {
        this.productionCountry = productionCountry;
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public String getTransmission() {


        if (transmission == null || transmission.isEmpty()) {
            this.transmission = transmission;
        }
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = bodyType;
        }
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegistrationNumber() {

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        }
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {

        if (numberOfSeats < 0) {
            this.numberOfSeats = numberOfSeats;

        } else {
            this.numberOfSeats = Math.abs(numberOfSeats);
        }
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Key.Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Key.Insurance insurance) {
        this.insurance = insurance;
    }

    public void changingTires() {
        summerTires = !summerTires;
    }

    public boolean getSummerTires() {

        return getSummerTires();
    }

    public void registrationNumber(String s) {
    }

    public interface Validator<T> {

        boolean isValid(T t);
    }

    public static class CarStateNumberValidator implements Validator<String> {
        public boolean isValid(String registrationNumber) {
            Pattern registrationNumberPattern = Pattern.compile(
                    "([А-Яа-я])" +
                            "([0-9]){3}" +
                            "([А-Яа-я]){2}" +
                            "[\\s]" +
                            "([0-9]){2}|([0-9]){3}" +
                            "[RUS]"
            );
            Matcher registrationNumberMatcher = registrationNumberPattern.matcher(registrationNumber);
            if (registrationNumberMatcher.matches()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String printCarInfo(Car car) {
        return "Car { " + (car.isSummerTires() ? "Летняя" : "Зимняя") + " резина" +
                ". Год выпуска: " + car.getProductionYear() +
                ". Страная производитель: " + car.getProductionCountry() +
                ". Регистрационный номер: " + car.getRegistrationNumber() + "." + ". Регистрационный номер: " + car.getRegistrationNumber() +
                "." + (car.getKey().isKeylessAccess() ? " Бесключевой доступ!" : " Ключевой доступ!") +
                (car.getKey().isRemoteEngineStart() ?
                        " Есть удалённый запуск двигателя!" : " Нет удалённого запуска двигателя!") +
                " Номер страховки: " + Key.Insurance.getNumberInsurance() +
                ". Стоимость страховки: " + Key.Insurance.getCost() +
                ". Срок действия страховки: " + Key.Insurance.getValidityPeriod();

    }


}



