package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r53 implements p72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l41 f115328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n41 f115329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f115330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f115333f;

    public r53(l41 l41Var, n41 n41Var) {
        this.f115328a = l41Var;
        this.f115329b = n41Var;
    }

    public final Map a(f93 f93Var) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("failure_tracked", Boolean.valueOf(this.f115332e));
        if (!f93Var.f110663a.isEmpty()) {
            List list = f93Var.f110663a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((g93) it.next()).f111121b);
            }
            mapCreateMapBuilder.put("warnings", arrayList);
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override // yads.p72
    public final void invalidate() {
        this.f115330c = false;
        this.f115331d = 0;
        this.f115332e = false;
        this.f115333f = false;
    }

    @Override // yads.p72
    public final void a(dw2 dw2Var, e93 e93Var) {
        int i10 = this.f115331d + 1;
        this.f115331d = i10;
        if (i10 == 20) {
            this.f115332e = true;
            l41 l41Var = this.f115328a;
            l41Var.a(this.f115329b.f113722c, l41Var.a(e93Var));
        }
    }

    @Override // yads.p72
    public final void a(List list) {
        u72 u72Var = (u72) CollectionsKt.firstOrNull(list);
        if (u72Var == null) {
            return;
        }
        l41 l41Var = this.f115328a;
        l41Var.a(this.f115329b.f113723d, l41Var.a(u72Var.f116559b));
    }

    @Override // yads.p72
    public final void a(dw2 dw2Var, List list, f93 f93Var) {
        if (this.f115333f) {
            return;
        }
        this.f115333f = true;
        Map mapA = a(f93Var);
        l41 l41Var = this.f115328a;
        xl2 xl2Var = this.f115329b.f113720a;
        am2 am2VarA = l41Var.a();
        am2VarA.f108722a.putAll(mapA);
        l41Var.a(xl2Var, am2VarA);
    }

    @Override // yads.p72
    public final void a(dw2 dw2Var, f93 f93Var) {
        if (this.f115330c) {
            return;
        }
        this.f115330c = true;
        Map mapA = a(f93Var);
        l41 l41Var = this.f115328a;
        xl2 xl2Var = this.f115329b.f113721b;
        am2 am2VarA = l41Var.a();
        am2VarA.f108722a.putAll(mapA);
        l41Var.a(xl2Var, am2VarA);
    }

    @Override // yads.p72
    public final void a(t9 t9Var) {
        this.f115328a.f112958a = t9Var;
    }
}
