package Demo04;

import java.util.List;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-11 16:03
 */
public class Cenvas {

    // 在画布上画一个
    public void draw(Shape shape){
        shape.xingzhuang();
    }


    // 在画布上花多个
    public void drawAll(List<Shape> shapeList){
        for(Shape s:shapeList){
            s.xingzhuang();
        }

    }
}
