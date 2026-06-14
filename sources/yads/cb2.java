package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class cb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f109312a;

    public cb2(v5 v5Var) {
        this.f109312a = v5Var;
    }

    public final LinkedHashMap a(Set set) {
        List list;
        v5 v5Var = this.f109312a;
        synchronized (v5Var.f116876a) {
            list = CollectionsKt.toList(v5Var.f116879d);
        }
        Sequence<t5> sequenceE = kotlin.sequences.k.E(CollectionsKt.asSequence(list), new bb2(set));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (t5 t5Var : sequenceE) {
            String str = t5Var.f116068a.f116523b;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(t5Var.f116069b);
        }
        return linkedHashMap;
    }
}
