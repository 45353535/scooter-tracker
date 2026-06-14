package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kz1 {
    public static Set a(jz1 jz1Var, fh0 fh0Var) {
        List listD = jz1Var.d();
        if (listD != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((oh0) it.next()).f114323g);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                eh0 eh0Var = (eh0) obj;
                if (fh0Var == null || eh0Var.f110373a == fh0Var) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((eh0) it2.next()).f110374b);
            }
            Set set = CollectionsKt.toSet(arrayList3);
            if (set != null) {
                return set;
            }
        }
        return SetsKt.emptySet();
    }
}
