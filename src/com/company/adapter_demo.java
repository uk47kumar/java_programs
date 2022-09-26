package com.company;

class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}
class omega {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";"+ y + "), width: " + width + ", height: " + height);

    }
}

public class adapter_demo {
    public static void main(String[] args) {
        Object[] shapes = {new Line(), new omega()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        int width = 40, height = 40;
        for (Object shape : shapes) {
            if (shape.getClass().getSimpleName().equals("Line")) {
                ((Line)shape).draw(x1, y1, x2, y2);
            }
            else if (shape.getClass().getSimpleName().equals("Rectangle")) {
                ((omega)shape).draw(x2, y2, width, height);
            }
        }
    }
}
