package yads;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class va1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f116918a = kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.c().w()).plus(new j10()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ux0 f116919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n23 f116920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tx0 f116921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rx0 f116922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final px0 f116923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wx0 f116924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k70 f116925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ob f116926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f116927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ib f116928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xp1 f116929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MutableStateFlow f116930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final StateFlow f116931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gg.g f116932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Flow f116933p;

    public va1(ux0 ux0Var, n23 n23Var, tx0 tx0Var, rx0 rx0Var, px0 px0Var, wx0 wx0Var, k70 k70Var, ob obVar, lb lbVar, ib ibVar, xp1 xp1Var) {
        this.f116919b = ux0Var;
        this.f116920c = n23Var;
        this.f116921d = tx0Var;
        this.f116922e = rx0Var;
        this.f116923f = px0Var;
        this.f116924g = wx0Var;
        this.f116925h = k70Var;
        this.f116926i = obVar;
        this.f116927j = lbVar;
        this.f116928k = ibVar;
        this.f116929l = xp1Var;
        MutableStateFlow mutableStateFlowA = hg.l0.a(new c90(null, d70.f109818b, false, CollectionsKt.emptyList()));
        this.f116930m = mutableStateFlowA;
        this.f116931n = hg.i.c(mutableStateFlowA);
        gg.g gVarB = gg.j.b(0, null, null, 7, null);
        this.f116932o = gVarB;
        this.f116933p = hg.i.N(gVarB);
    }

    public final void a(t80 t80Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (t80Var instanceof l80) {
            eg.i.d(this.f116918a, null, null, new ua1(this, false, null), 3, null);
            return;
        }
        if (t80Var instanceof r80) {
            eg.i.d(this.f116918a, null, null, new sa1(this, null), 3, null);
            return;
        }
        if (t80Var instanceof p80) {
            n23 n23Var = this.f116920c;
            boolean z10 = !n23Var.f113710a.f109830a.a().f114215e.f111502a;
            vt2 vt2Var = n23Var.f113710a.f109830a.f108989e.f112568a;
            vt2Var.getClass();
            synchronized (vt2.f117186j) {
                vt2Var.f117191d = z10;
                vt2Var.f117192e = z10;
                vt2Var.f117193f = z10;
                Unit unit = Unit.f93236a;
            }
            eg.i.d(this.f116918a, null, null, new ua1(this, false, null), 3, null);
            return;
        }
        if (t80Var instanceof o80) {
            c90 c90Var = ((c90) this.f116930m.getValue()).f109285a;
            if (c90Var == null) {
                eg.i.d(this.f116918a, null, null, new ra1(this, u80.f116564a, null), 3, null);
                return;
            }
            c90 c90VarA = c90.a(c90Var, null, null, false, null, 11);
            MutableStateFlow mutableStateFlow = this.f116930m;
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value4, c90VarA));
            return;
        }
        if (t80Var instanceof n80) {
            c70 c70Var = c70.f109265b;
            c90 c90Var2 = (c90) this.f116930m.getValue();
            c90 c90VarA2 = c90.a(c90Var2, c90Var2, c70Var, false, null, 12);
            MutableStateFlow mutableStateFlow2 = this.f116930m;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.b(value3, c90VarA2));
            eg.i.d(this.f116918a, null, null, new ua1(this, false, null), 3, null);
            return;
        }
        if (t80Var instanceof m80) {
            a70 a70Var = new a70(((m80) t80Var).f113347a);
            c90 c90Var3 = (c90) this.f116930m.getValue();
            c90 c90VarA3 = c90.a(c90Var3, c90Var3, a70Var, false, null, 12);
            MutableStateFlow mutableStateFlow3 = this.f116930m;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.b(value2, c90VarA3));
            eg.i.d(this.f116918a, null, null, new ua1(this, false, null), 3, null);
            return;
        }
        if (!(t80Var instanceof q80)) {
            if (t80Var instanceof s80) {
                eg.i.d(this.f116918a, null, null, new ta1(this, ((s80) t80Var).f115719a, null), 3, null);
                return;
            }
            return;
        }
        f70 f70Var = ((c90) this.f116930m.getValue()).f109286b;
        l90 l90Var = ((q80) t80Var).f114890a;
        f70 b70Var = f70Var instanceof a70 ? new b70(l90Var) : new e70(l90Var.f113004a);
        c90 c90Var4 = (c90) this.f116930m.getValue();
        c90 c90VarA4 = c90.a(c90Var4, c90Var4, b70Var, false, null, 12);
        MutableStateFlow mutableStateFlow4 = this.f116930m;
        do {
            value = mutableStateFlow4.getValue();
        } while (!mutableStateFlow4.b(value, c90VarA4));
        eg.i.d(this.f116918a, null, null, new ua1(this, false, null), 3, null);
    }
}
