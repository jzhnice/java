package Demo05;

import java.util.ArrayList;
import java.util.List;
/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-11 16:26
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        List tempList = list;    //  泛型的擦除
        tempList.add(12345);
        System.out.println(tempList);


    }
}
