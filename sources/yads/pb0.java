package yads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pb0 {
    public static HashMap a(String str) {
        int[] iArrA = qb0.a(str);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        nk2 nk2Var = qb0.f114909n;
        map.put(2, (Long) nk2Var.get(iArrA[0]));
        map.put(3, (Long) qb0.f114910o.get(iArrA[1]));
        map.put(4, (Long) qb0.f114911p.get(iArrA[2]));
        map.put(5, (Long) qb0.f114912q.get(iArrA[3]));
        map.put(10, (Long) qb0.f114913r.get(iArrA[4]));
        map.put(9, (Long) qb0.f114914s.get(iArrA[5]));
        map.put(7, (Long) nk2Var.get(iArrA[0]));
        return map;
    }
}
