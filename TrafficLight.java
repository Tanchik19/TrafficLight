import javax.swing.*;
import java.awt.*;

public class TrafficLight {
    public static void main(String[] args) {
        DISPLAY display = new DISPLAY();
        JFrame frame = new JFrame(); //создвем окно. frame - рамка
        frame.add(display); // добавляем в окно display
        frame.setBounds(500, 100, 800, 800); // размер окна
        frame.setVisible(true); // видимость окна
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
}

class DISPLAY extends Canvas { //класс
    public void paint(Graphics gra) { //метод

        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.BLACK);

        gra.setColor(Color.DARK_GRAY);
        gra.fillRoundRect(300, 200, 160, 430, 30, 30);//большой корпус
        gra.fillRoundRect(340, 640, 80, 85, 10, 10);//маленький корпус

        gra.drawArc(305, 150, 140,140,30,120);
        gra.drawLine(315,185,435,185);

        gra.setColor(Color.DARK_GRAY);
        gra.drawArc(200, 240, 20, 20, 90,120);
        gra.drawLine(210, 240, 280, 240);
        gra.drawArc(270, 240, 20, 20, 0,90);
        gra.drawLine(290, 250, 290, 320);
        gra.drawArc(270, 310, 20, 20, 240,120);
        gra.drawLine(275, 328, 201, 253);

        /*int[] one = new int[]{10, 50, 55, 55, 50, 5, 10}; //полилиния
        int[] two = new int[]{20, 20, 25, 65, 70, 25, 20}; //полилиния
        gra.drawPolyline(one, two, 7); //полилиния */

        gra.setColor(Color.red); //красный круг
        gra.fillOval(335, 240, 90, 90);
        gra.setColor(Color.yellow);//желтый круг
        gra.fillOval(335, 370, 90, 90);
        gra.setColor(Color.green);//зеленый круг
        gra.fillOval(335, 500, 90, 90);

    }
}
