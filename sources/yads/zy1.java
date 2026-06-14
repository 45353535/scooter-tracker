package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zy1 extends rn {
    public final z13 A;
    public final yx1 B;
    public final yy1 C;
    public final my1 D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nz1 f118873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final iz1 f118874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sz1 f118875y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final vz1 f118876z;

    public zy1(Context context, es2 es2Var, nz1 nz1Var, c4 c4Var, iz1 iz1Var, v5 v5Var, CoroutineScope coroutineScope, sz1 sz1Var, vz1 vz1Var, z13 z13Var, yx1 yx1Var) {
        super(context, v5Var, c4Var, es2Var, coroutineScope);
        this.f118873w = nz1Var;
        this.f118874x = iz1Var;
        this.f118875y = sz1Var;
        this.f118876z = vz1Var;
        this.A = z13Var;
        this.B = yx1Var;
        this.C = new yy1(this);
        this.D = new my1(context, es2Var, this, this);
        iz1Var.a(vz1Var);
    }

    @Override // yads.rn
    public final boolean a(e9 e9Var) {
        return true;
    }

    @Override // yads.rn
    public final synchronized void b(e9 e9Var) {
        throw null;
    }

    @Override // yads.rn
    public final k4 o() {
        return (k4) CollectionsKt.firstOrNull(this.f115514j.a());
    }

    @Override // yads.rn
    public final hn a(String str, String str2) {
        JSONObject jSONObjectA;
        my1 my1Var = this.D;
        nz1 nz1Var = this.f118873w;
        tm2 tm2Var = nz1Var.f114137d;
        c4 c4Var = this.f115507c;
        e9 e9Var = nz1Var.f114134a;
        my1Var.getClass();
        ly1 ly1Var = new ly1(my1Var.f113649a, c4Var, ((pr3) my1Var.f113650b).a(), str, str2, my1Var.f113651c, my1Var.f113652d, new hz1(tm2Var), new pz1());
        String str3 = e9Var.f110259h;
        my1Var.f113654f.getClass();
        String strOptString = (str3 == null || (jSONObjectA = rc1.a(str3)) == null || !jSONObjectA.has("response")) ? null : jSONObjectA.optString("response");
        String str4 = e9Var.f110260i;
        if (strOptString == null) {
            strOptString = str4;
        }
        if (strOptString == null) {
            return ly1Var;
        }
        ck2 ck2Var = my1Var.f113653e;
        ck2Var.getClass();
        synchronized (ck2.f109433c) {
            ck2Var.f109435a.put(ly1Var, strOptString);
            Unit unit = Unit.f93236a;
        }
        return ly1Var;
    }

    @Override // yads.rn
    public final void a(k4 k4Var) {
        this.f118874x.a(k4Var);
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        k12 lt2Var;
        t9 t9Var = (t9) obj;
        synchronized (this) {
            this.f115506b.a(u5.f116515s);
            this.f115526v = t9Var;
        }
        this.f118876z.f117258d = t9Var;
        if (this.f115522r == y5.f118084b) {
            return;
        }
        sz1 sz1Var = this.f118875y;
        sz1Var.getClass();
        to1 to1Var = t9Var.f116124q;
        if (to1Var != null) {
            lt2Var = new bo1(t9Var, to1Var);
        } else {
            lt2Var = new lt2(sz1Var.f115999a, sz1Var.f116000b);
        }
        j12 j12VarA = lt2Var.a(this);
        Context contextA = j1.a();
        if (contextA != null) {
            boolean z10 = lb1.f113032a;
        }
        if (contextA == null) {
            contextA = this.f115505a;
        }
        j12VarA.a(contextA, t9Var);
    }
}
