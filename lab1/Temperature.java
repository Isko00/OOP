class TemperatureConstructionException extends Exception {
    public String toString() {
        return "Check your construction data!";
    }
}

public class Temperature {
    private double value;
    private Scales scale;

    public enum Scales { 
        C("Celsius"), 
        F("Fahrenheit");

        private String name;

        Scales(String name) {
            this.name = name;
        }

        public String toString() { return name; }

        public char getSign() { return name.charAt(0); }
    }

    public Temperature() {
        value = 0;
        scale = Scales.C;
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = Scales.C;
    }

    public Temperature(char scale) 
            throws TemperatureConstructionException {
        this.value = 0;
        this.scale = (scale == 'C') ? Scales.C :
            (scale == 'F') ? Scales.F : null;
        if (this.scale == null) { 
            throw new TemperatureConstructionException(); 
        }
    }

    public Temperature(double value, char scale) 
            throws TemperatureConstructionException {
        this.value = value;
        this.scale = (scale == 'C') ? Scales.C :
            (scale == 'F') ? Scales.F : null;
        if (this.scale == null) { 
            throw new TemperatureConstructionException(); 
        }
    }

    public double getValueInFahrenheit() {
        return (scale == Scales.F) ? value 
            : 5 * (value - 32) / 9;
    }

    public double getValueInCelsius() {
        return (scale == Scales.C) ? value 
            : 9 * (value / 5) + 32;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) 
            throws TemperatureConstructionException {
        this.scale = (scale == 'C') ? Scales.C :
            (scale == 'F') ? Scales.F : null;
        if (this.scale == null) { 
            throw new TemperatureConstructionException(); 
        }
    }

    public void setValueAndScale(double value, char scale) 
            throws TemperatureConstructionException {
        this.value = value;
        this.scale = (scale == 'C') ? Scales.C :
            (scale == 'F') ? Scales.F : null;
        if (this.scale == null) { 
            throw new TemperatureConstructionException(); 
        }
    }

    public String getScale() {
        return scale.toString();
    }

    public char getScaleSign() {
        return scale.getSign();
    }

    public static void main(String[] args) {
        Temperature myTemp = new Temperature();

        System.out.println(myTemp.getScale());

        try {
            myTemp.setScale('F');
        } catch(TemperatureConstructionException e) {
            System.out.println("Exception: "+ e.toString());
            return;
        }

        System.out.println(myTemp.getScale());
    }
}