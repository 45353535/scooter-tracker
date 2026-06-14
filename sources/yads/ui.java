package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f116656a;

    public ui(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gi giVar = (gi) it.next();
            Pair pair = TuplesKt.to(giVar.b(), giVar.c());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.f116656a = linkedHashMap;
    }
}
