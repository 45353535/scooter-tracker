package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cj {
    public static Set a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((gi) it.next()).f111215c);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            List listListOf = obj instanceof d31 ? CollectionsKt.listOf(obj) : obj instanceof am1 ? ((am1) obj).f108721c : null;
            if (listListOf != null) {
                arrayList2.add(listListOf);
            }
        }
        return CollectionsKt.toSet(CollectionsKt.flatten(arrayList2));
    }
}
