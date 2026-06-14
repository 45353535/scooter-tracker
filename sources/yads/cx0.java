package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.N6;
import java.util.List;
import kotlin.Result;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cx0 extends h53 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c4 f109632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nw0 f109633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l5 f109634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v5 f109635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z13 f109636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b9 f109637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c1 f109638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public uw0 f109639l;

    public /* synthetic */ cx0(Context context, t9 t9Var, c4 c4Var, es2 es2Var, nw0 nw0Var, l5 l5Var) {
        v5 v5Var = new v5();
        z13 z13Var = z13.f118512b;
        z13 z13VarA = y13.a();
        vz1 vz1Var = new vz1(c4Var);
        vz1Var.a(t9Var);
        pr3 pr3Var = (pr3) es2Var;
        this(context, t9Var, c4Var, es2Var, nw0Var, l5Var, v5Var, z13VarA, new b9(context, t9Var, c4Var, v5Var, vz1Var, pr3Var.a()), new c1(pr3Var.a(), c4Var, t9Var));
    }

    @Override // yads.h41
    public final void a(i5 i5Var) {
        uw0 uw0Var = this.f109639l;
        if (uw0Var != null) {
            uw0Var.a(i5Var);
        }
    }

    public final oz d() {
        List listB = this.f109633f.b();
        l5 l5Var = this.f109634g;
        Context context = this.f110800a;
        t9 t9Var = this.f110801b;
        c4 c4Var = this.f109632e;
        String adInfo = this.f109633f.getAdInfo();
        l5Var.getClass();
        String str = t9Var.f116112e;
        if (str == null && (str = c4Var.f109196c.f110681a) == null) {
            str = "";
        }
        zt0 zt0VarC = t9Var.c();
        if (zt0VarC.f118813b == 0 || zt0VarC.f118814c == 0) {
            zt0VarC = null;
        }
        return new oz(str, zt0VarC != null ? new ja(zt0VarC.c(context), zt0VarC.a(context)) : null, adInfo, listB);
    }

    public final List e() {
        return this.f109633f.a();
    }

    public abstract cx0 f();

    public final void g() {
        uw0 uw0Var = this.f109639l;
        if (uw0Var != null) {
            uw0Var.onAdClicked();
        }
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
    }

    @Override // yads.h53, yads.e4
    public void a(int i10, Bundle bundle) {
        getClass().toString();
        boolean z10 = lb1.f113032a;
        if (i10 == 0) {
            this.f109635h.a(u5.f116502f);
            b9 b9Var = this.f109637j;
            am2 am2VarA = b9Var.f108942c.a();
            am2VarA.b(wl2.f117511a, N6.G1);
            am2VarA.f108722a.putAll(b9Var.f108944e.a());
            mx2 mx2Var = b9Var.f108941b.f109197d.f114071a;
            if (mx2Var != null) {
                am2VarA.b(mx2Var.a().f113267b, "size_type");
                am2VarA.b(Integer.valueOf(mx2Var.getWidth()), "width");
                am2VarA.b(Integer.valueOf(mx2Var.getHeight()), "height");
            }
            hr2 hr2Var = b9Var.f108945f;
            if (hr2Var != null) {
                am2VarA.b(hr2Var.O, "banner_size_calculation_type");
            }
            c cVar = b9Var.f108940a.f116116i;
            am2VarA.f108723b = cVar;
            b9Var.f108943d.a(new zl2(xl2.f117867d.a(), MapsKt.toMutableMap(am2VarA.f108722a), cVar));
            uw0 uw0Var = this.f109639l;
            if (uw0Var != null) {
                uw0Var.onAdShown();
                return;
            }
            return;
        }
        if (i10 == 16) {
            if (bundle == null) {
                a((i5) null);
                return;
            } else {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                a(parcelable instanceof i5 ? (i5) parcelable : null);
                return;
            }
        }
        if (i10 == 17) {
            uw0 uw0Var2 = this.f109639l;
            if (uw0Var2 != null) {
                uw0Var2.onAdClicked();
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f109638k.b();
            return;
        }
        if (i10 == 3) {
            this.f109638k.a();
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.a(i10, bundle);
            }
        } else {
            this.f109636i.a(tc1.f116192c, this);
            uw0 uw0Var3 = this.f109639l;
            if (uw0Var3 != null) {
                uw0Var3.onAdDismissed();
            }
        }
    }

    public cx0(Context context, t9 t9Var, c4 c4Var, es2 es2Var, nw0 nw0Var, l5 l5Var, v5 v5Var, z13 z13Var, b9 b9Var, c1 c1Var) {
        super(context, t9Var, es2Var, c4Var);
        this.f109632e = c4Var;
        this.f109633f = nw0Var;
        this.f109634g = l5Var;
        this.f109635h = v5Var;
        this.f109636i = z13Var;
        this.f109637j = b9Var;
        this.f109638k = c1Var;
        k2.f112556b.a().a("window_type_fullscreen", new d2(es2Var));
    }

    public final void a(uw0 uw0Var) {
        this.f109639l = uw0Var;
    }

    public final Object a(Activity activity) {
        Result.Companion companion = Result.f93230c;
        Result.b(kotlin.d.a(m7.f113341b));
        synchronized (this) {
        }
        v5 v5Var = this.f109635h;
        u5 u5Var = u5.f116502f;
        v5Var.a(u5Var, null);
        z13 z13Var = this.f109636i;
        tc1 tc1Var = tc1.f116192c;
        z13Var.b(tc1Var, this);
        Object objA = this.f109633f.a(f(), activity);
        if (Result.g(objA) != null) {
            this.f109635h.a(u5Var);
            if (!rb.a((du) this)) {
                this.f109636i.a(tc1Var, this);
                this.f109633f.a(this.f110800a);
                super.c();
            }
        }
        return objA;
    }
}
