package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ww2 implements p72 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f117619c = CollectionsKt.listOf((Object[]) new dw2[]{dw2.f110098b, dw2.f110099c});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f117620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f117621b;

    public ww2(r53 r53Var, r53 r53Var2) {
        this.f117620a = MapsKt.mapOf(TuplesKt.to(dw2.f110098b, r53Var), TuplesKt.to(dw2.f110099c, r53Var2));
    }

    @Override // yads.p72
    public final void a(dw2 dw2Var, e93 e93Var) {
        p72 p72Var = (p72) this.f117620a.get(dw2Var);
        if (p72Var != null) {
            p72Var.a(dw2Var, e93Var);
        }
    }

    @Override // yads.p72
    public final void invalidate() {
        Iterator it = this.f117620a.values().iterator();
        while (it.hasNext()) {
            ((p72) it.next()).invalidate();
        }
    }

    @Override // yads.p72
    public final void a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            dw2 dw2Var = ((u72) obj).f116558a.f114565d;
            Object arrayList = linkedHashMap.get(dw2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(dw2Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : MapsKt.withDefault(linkedHashMap, vw2.f117214b).entrySet()) {
            dw2 dw2Var2 = (dw2) entry.getKey();
            List list2 = (List) entry.getValue();
            p72 p72Var = (p72) this.f117620a.get(dw2Var2);
            if (p72Var != null) {
                p72Var.a(list2);
            }
        }
    }

    @Override // yads.p72
    public final void a(dw2 dw2Var, List list, f93 f93Var) {
        if (!this.f117621b) {
            this.f117621b = true;
            List listPlus = CollectionsKt.plus((Collection<? extends dw2>) list, dw2Var);
            for (dw2 dw2Var2 : CollectionsKt.minus((Iterable) f117619c, (Iterable) CollectionsKt.toSet(listPlus))) {
                a(dw2Var2, f93Var);
                a(dw2Var2, listPlus, f93Var);
            }
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((dw2) it.next()) == dw2Var) {
                    return;
                }
            }
        }
        p72 p72Var = (p72) this.f117620a.get(dw2Var);
        if (p72Var != null) {
            p72Var.a(dw2Var, list, f93Var);
        }
    }

    @Override // yads.p72
    public final void a(dw2 dw2Var, f93 f93Var) {
        p72 p72Var = (p72) this.f117620a.get(dw2Var);
        if (p72Var != null) {
            p72Var.a(dw2Var, f93Var);
        }
    }

    @Override // yads.p72
    public final void a(t9 t9Var) {
        Iterator it = this.f117620a.values().iterator();
        while (it.hasNext()) {
            ((p72) it.next()).a(t9Var);
        }
    }
}
