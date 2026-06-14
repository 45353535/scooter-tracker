package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cm1 {
    public static Set a(rw1 rw1Var) {
        List list = rw1Var.f115624b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((gi) it.next()).f111215c);
        }
        return CollectionsKt.toSet(CollectionsKt.filterIsInstance(arrayList, am1.class));
    }
}
