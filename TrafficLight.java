import javax.swing.*;
import java.awt.*;

public class TrafficLight {
    public static void main(String[] args) {
        DISPLAY display = new DISPLAY();
        JFrame frame = new JFrame(); //������� ����. frame - �����
        frame.add(display); // ��������� � ���� display
        frame.setBounds(500, 100, 800, 800); // ������ ����
        frame.setVisible(true); // ��������� ����
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
}

class DISPLAY extends Canvas { //�����
    public void paint(Graphics gra) { //�����

        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.BLACK);

        gra.setColor(Color.DARK_GRAY);
        gra.fillRoundRect(300, 200, 160, 430, 30, 30);//������� ������
        gra.fillRoundRect(340, 640, 80, 85, 10, 10);//��������� ������

        gra.drawArc(305, 150, 140,140,30,120);
        gra.drawLine(315,185,435,185);

        gra.setColor(Color.DARK_GRAY);
        gra.drawArc(200, 240, 20, 20, 90,120);
        gra.drawLine(210, 240, 280, 240);
        gra.drawArc(270, 240, 20, 20, 0,90);
        gra.drawLine(290, 250, 290, 320);
        gra.drawArc(270, 310, 20, 20, 240,120);
        gra.drawLine(275, 328, 201, 253);

        /*int[] one = new int[]{10, 50, 55, 55, 50, 5, 10}; //���������
        int[] two = new int[]{20, 20, 25, 65, 70, 25, 20}; //���������
        gra.drawPolyline(one, two, 7); //��������� */

        gra.setColor(Color.red); //������� ����
        gra.fillOval(335, 240, 90, 90);
        gra.setColor(Color.yellow);//������ ����
        gra.fillOval(335, 370, 90, 90);
        gra.setColor(Color.green);//������� ����
        gra.fillOval(335, 500, 90, 90);

    }
}
