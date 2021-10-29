public class NumberConvertOut <T extends Number> {
    private T number;

    public NumberConvertOut(T number) {
        this.number = number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
    public Float getNumberAsFloat() {

        return this.number.floatValue();
    }

    public Double getNumberAsDouble() {
        return this.number.doubleValue();
    }

    public String getNumberAsString() {
        return this.number.toString();
    }

    public Byte getNumberAsByte() {
        return this.number.byteValue();
    }

    public Integer getNumberAsInteger() {
        return this.number.intValue();
    }

    public Long getNumberAsLong() {
        return this.number.longValue();
    }

    public Short getNumberAsShort() {
        return this.number.shortValue();
    }
}
