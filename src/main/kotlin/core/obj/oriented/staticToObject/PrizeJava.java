package core.obj.oriented.staticToObject;

/**
 * Created by chenjinxin on 2021/6/25 下午3:57
 */
public class PrizeJava {
    private String name;
    private int count;
    private int type;

    public PrizeJava(String name, int count, int type) {
        this.name = name;
        this.count = count;
        this.type = type;
    }

    static int TYPE_REDPACK = 0;
    static int TYPE_COUPON = 1;

    static boolean isRedpack(PrizeJava prize) {
        return prize.type == TYPE_REDPACK;
    }

    public static void main(String[] args) {
        PrizeJava prize = new PrizeJava("红包", 10, PrizeJava.TYPE_REDPACK);
        System.out.println(PrizeJava.isRedpack(prize));
    }
}
