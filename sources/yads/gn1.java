package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class gn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo1 f111283a;

    public gn1(eo1 eo1Var) {
        this.f111283a = eo1Var;
    }

    public final ArrayList a(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String strB = this.f111283a.b((cp1) obj);
            Object arrayList2 = linkedHashMap.get(strB);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(strB, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cp1 cp1Var = ((String) entry.getKey()) != null ? (cp1) CollectionsKt.first((List) entry.getValue()) : null;
            if (cp1Var != null) {
                arrayList3.add(cp1Var);
            }
        }
        return arrayList3;
    }
}
