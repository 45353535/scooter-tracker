package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f113506a;

    public mi(su suVar, List list, w3 w3Var, yz1 yz1Var, fl2 fl2Var, g41 g41Var, td1 td1Var) {
        td1 td1Var2;
        w3 w3Var2;
        yz1 yz1Var2;
        fl2 fl2Var2;
        g41 g41Var2;
        su suVar2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gi giVar = (gi) it.next();
            String strB = giVar.b();
            td1 td1VarA = giVar.a();
            if (td1VarA == null) {
                td1Var2 = td1Var;
                suVar2 = suVar;
                w3Var2 = w3Var;
                yz1Var2 = yz1Var;
                fl2Var2 = fl2Var;
                g41Var2 = g41Var;
            } else {
                td1Var2 = td1VarA;
                w3Var2 = w3Var;
                yz1Var2 = yz1Var;
                fl2Var2 = fl2Var;
                g41Var2 = g41Var;
                suVar2 = suVar;
            }
            Pair pair = TuplesKt.to(strB, suVar2.a(giVar, td1Var2, w3Var2, yz1Var2, fl2Var2, g41Var2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.f113506a = linkedHashMap;
    }
}
