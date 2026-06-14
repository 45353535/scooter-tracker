package yads;

import com.ironsource.N6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class vz1 implements ao2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f117255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g12 f117256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vp1 f117257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t9 f117258d;

    public /* synthetic */ vz1(c4 c4Var) {
        this(c4Var, new s02(), new vp1());
    }

    public final am2 a() {
        am2 am2Var;
        am2 am2Var2 = new am2((Map) null, 3);
        t9 t9Var = this.f117258d;
        if (t9Var == null) {
            return am2Var2;
        }
        am2 am2VarA = bm2.a(am2Var2, this.f117256b.a(t9Var, this.f117255a, (qz1) t9Var.f116127t));
        cp1 cp1Var = this.f117255a.f109205l;
        vp1 vp1Var = this.f117257c;
        if (cp1Var != null) {
            vp1Var.getClass();
            am2Var = vp1.a(cp1Var);
        } else {
            vp1Var.getClass();
            am2Var = new am2(new LinkedHashMap(), 2);
            am2Var.b(wl2.f117511a, N6.G1);
        }
        return bm2.a(am2VarA, am2Var);
    }

    public vz1(c4 c4Var, g12 g12Var, vp1 vp1Var) {
        this.f117255a = c4Var;
        this.f117256b = g12Var;
        this.f117257c = vp1Var;
    }

    public final void a(t9 t9Var) {
        this.f117258d = t9Var;
    }
}
