package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-11 15:18
 */
public class Pair<T> {
//    type 类型      t
//   elememt  元素   E
//    key  键     K
//    value  值   V
//    ？ 未知类型
    private T first;
    private T second;
    // 构造方法

    public Pair() {
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
// set   get


    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
