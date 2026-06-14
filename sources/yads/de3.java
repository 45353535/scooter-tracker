package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class de3 {
    public static ce3 a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((ib3) obj).f111940a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new ce3((List) pair.component2(), (List) pair.component1());
    }
}
