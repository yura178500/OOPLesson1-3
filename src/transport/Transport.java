package transport;

public class Transport {
    public String stamp;
    public String model;
    private int yearOfRelease;
    private String countryOfManufacture;
    public String bodyColor;
    public int maximumMovementSpeed;

    public Transport(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed) {
        if (stamp == null || stamp.length() == 0) {
            this.stamp = "default";
        } else {
            this.stamp = stamp;
        }
        if (yearOfRelease <= 0) {
            this.yearOfRelease = yearOfRelease;
        } else {
            this.yearOfRelease = yearOfRelease;
        }
        if (countryOfManufacture == null || countryOfManufacture.isEmpty()) {
            this.countryOfManufacture = "default";
        } else {
            this.countryOfManufacture = countryOfManufacture;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (bodyColor == null || bodyColor.isEmpty()) {
            this.bodyColor = "default";
        } else {
            this.bodyColor = bodyColor;
        }
        if (maximumMovementSpeed <= 0) {
            this.maximumMovementSpeed = maximumMovementSpeed;
        } else {
            this.maximumMovementSpeed = maximumMovementSpeed;
        }
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
    }
}
