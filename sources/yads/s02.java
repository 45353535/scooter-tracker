package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class s02 implements g12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vn2 f115661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9 f115662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iy f115663c;

    public /* synthetic */ s02() {
        this(new vn2(), new l9(), new iy());
    }

    @Override // yads.g12
    public final am2 a(t9 t9Var, c4 c4Var, qz1 qz1Var) {
        vn2 vn2Var = this.f115661a;
        am2 am2VarA = vn2Var.a(t9Var, c4Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!kotlin.jvm.internal.b1.q(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (qz1Var != null) {
            List listA = vn2Var.f117133b.a(qz1Var);
            if (!listA.isEmpty()) {
                linkedHashMap.put("image_sizes", listA);
            }
            vn2Var.f117133b.getClass();
            List list = qz1Var.f115232a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((rw1) it.next()).f115623a.f117917b);
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("native_ad_types", arrayList);
            }
            vn2Var.f117133b.getClass();
            ArrayList arrayListB = tz1.b(qz1Var);
            Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) arrayListB);
            if (objFirstOrNull == null) {
                linkedHashMap.put("ad_id", "undefined");
            } else {
                linkedHashMap.put("ad_id", objFirstOrNull);
            }
            if (arrayListB.isEmpty()) {
                arrayListB = null;
            }
            if (arrayListB == null) {
                linkedHashMap.put("ad_ids", "undefined");
            } else {
                linkedHashMap.put("ad_ids", arrayListB);
            }
        }
        c cVar = am2VarA.f108723b;
        if (cVar == null) {
            cVar = null;
        }
        Map mapPlus = MapsKt.plus(am2VarA.f108722a, linkedHashMap);
        if (!kotlin.jvm.internal.b1.q(mapPlus)) {
            mapPlus = null;
        }
        if (mapPlus == null) {
            mapPlus = new LinkedHashMap();
        }
        am2 am2VarA2 = this.f115662b.a(c4Var.f109198e);
        am2 am2VarA3 = this.f115663c.a(c4Var);
        if (cVar == null) {
            cVar = am2VarA2.f108723b;
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, am2VarA2.f108722a);
        Map linkedHashMap2 = kotlin.jvm.internal.b1.q(mapPlus2) ? mapPlus2 : null;
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        if (cVar == null) {
            cVar = am2VarA3.f108723b;
        }
        return new am2(MapsKt.plus(linkedHashMap2, am2VarA3.f108722a), cVar);
    }

    public s02(vn2 vn2Var, l9 l9Var, iy iyVar) {
        this.f115661a = vn2Var;
        this.f115662b = l9Var;
        this.f115663c = iyVar;
    }
}
