package Demo04;

import java.awt.*;
import java.util.ArrayList;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-11 16:06
 */
public class Demo04 {
    public static void main(String[] args) {
        Cenvas canvas = new Cenvas();
        Circle circle = new Circle();
        canvas.draw(circle);//  一个花园
        // 定义多个形状，组成一个数组列表，传入
        Circle circle11 = new Circle();
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle11 = new Rectangle();
        Circle circle12 = new Circle();
        // 准备一个集合
        ArrayList<Shape> list = new ArrayList<>();
        list.add(circle11);
        list.add(circle12);
        list.add(rectangle);
        list.add(rectangle11);
        canvas.drawAll(list);
    }
}
