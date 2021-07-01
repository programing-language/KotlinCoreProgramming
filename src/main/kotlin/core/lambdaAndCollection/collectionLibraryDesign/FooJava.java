package core.lambdaAndCollection.collectionLibraryDesign;

import java.util.List;

/**
 * Created by ChenJinXin on 2021/7/1 下午5:16
 */
public class FooJava {
    public static List<Integer> foo(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
        return list;
    }
}
