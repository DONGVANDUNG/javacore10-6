package javacore.buoi05.bai51;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getchuvi() {
        return (width + height) * 2;
    }

    public float getdientich() {
        return width * height;
    }

    public boolean check() {
        if (width == height) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Chieu dai hinh chu nhat la: " + width + ", Chieu rong hinh chu nhat la: " + height;
    }
}
