package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class bf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dg f108985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us2 f108986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bq1 f108987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qy f108988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k30 f108989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vf1 f108990f;

    public bf1(dg dgVar, us2 us2Var, bq1 bq1Var, qy qyVar, k30 k30Var, vf1 vf1Var) {
        this.f108985a = dgVar;
        this.f108986b = us2Var;
        this.f108987c = bq1Var;
        this.f108988d = qyVar;
        this.f108989e = k30Var;
        this.f108990f = vf1Var;
    }

    public final o70 a() {
        g80 g80Var;
        String strD;
        String strC;
        p70 p70Var;
        z40 z40VarA = this.f108985a.a();
        us2 us2Var = this.f108986b;
        ms1 ms1Var = us2Var.f116755b;
        Context context = us2Var.f116754a;
        ms1Var.getClass();
        ls1 ls1VarA = ms1.a(context);
        boolean z10 = false;
        if (Intrinsics.areEqual(ls1VarA, js1.f112447a)) {
            g80Var = new g80(true, CollectionsKt.emptyList());
        } else {
            if (!(ls1VarA instanceof ks1)) {
                throw new lf.m();
            }
            List list = ((ks1) ls1VarA).f112839a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((fa1) it.next()).getMessage());
            }
            g80Var = new g80(false, arrayList);
        }
        bq1 bq1Var = this.f108987c;
        bq1Var.getClass();
        String str = bp1.f109076d;
        ArrayList arrayListA = bq1Var.f109080a.a(yo1.a());
        qy qyVar = this.f108988d;
        boolean zA = qyVar.f115194a.a();
        Boolean boolB = qyVar.f115194a.b();
        Boolean boolD = qyVar.f115194a.d();
        String strB = ((jw) qyVar.f115195b).b();
        if ((strB != null && !StringsKt.y0(strB)) || (((strD = ((jw) qyVar.f115195b).d()) != null && !StringsKt.y0(strD)) || ((strC = ((jw) qyVar.f115195b).c()) != null && !StringsKt.y0(strC)))) {
            z10 = true;
        }
        g50 g50Var = new g50(zA, boolB, boolD, z10);
        h70 h70Var = new h70(this.f108989e.f112568a.c());
        vf1 vf1Var = this.f108990f;
        vf1Var.getClass();
        synchronized (vf1.f117000c) {
            p70Var = !qs1.f115145b ? null : new p70(vf1Var.f117001a.b(), vf1Var.f117002b.b());
        }
        return new o70(z40VarA, g80Var, arrayListA, g50Var, h70Var, p70Var);
    }
}
