package javacore.buoi05.bai53;

public class Word {
    private String key;
    private String value;
    private String type;

    public Word(String key, String value, String type) {
        this.key = key;
        this.value = value;
        this.type = type;
    }

    public Word() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Word{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
