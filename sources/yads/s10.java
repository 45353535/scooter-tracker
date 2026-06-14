package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class s10 implements ah3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n10 f115666a;

    public s10(n10 n10Var) {
        this.f115666a = n10Var;
    }

    @Override // yads.ah3
    public final Map a() {
        q10 q10Var = this.f115666a.f113682e;
        List listEmptyList = q10Var != null ? q10Var.f114847b : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listEmptyList) {
            String str = ((k53) obj).f112597a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((k53) it.next()).f112598b);
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }
}
