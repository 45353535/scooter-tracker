package yads;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class su1 extends u92 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ju1 f115951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ll3 f115952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wu1 f115953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public wh1 f115954o;

    public /* synthetic */ su1(Context context, zk3 zk3Var, int i10) {
        this(context, (i10 & 2) != 0 ? new zk3() : zk3Var, (AttributeSet) null);
    }

    public final void a(String str, ru1 ru1Var) {
        if (this.f115952m instanceof kl3) {
            this.f115952m = new jl3(ru1Var);
            wu1 wu1Var = this.f115953n;
            wu1Var.f117598e.getClass();
            boolean zFind = gu1.f111340a.matcher(str).find();
            wu1Var.f117599f.getClass();
            uz0 ku1Var = zFind ? new ku1() : new yn();
            su1 su1Var = wu1Var.f117594a;
            ze3 ze3Var = wu1Var.f117596c;
            ju1 ju1Var = wu1Var.f117595b;
            ku1Var.a(su1Var, wu1Var, ze3Var, ju1Var, ju1Var, ju1Var).a(str);
        }
    }

    @Override // yads.u92
    public final void e() {
        this.f115953n.f117597d.a(MapsKt.emptyMap());
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        vh1 vh1VarA = this.f115954o.a(i10, i11);
        super.onMeasure(vh1VarA.f117010a, vh1VarA.f117011b);
    }

    public final void setAspectRatio(float f10) {
        this.f115954o = new ki2(f10);
    }

    public final void setClickListener(@NotNull nu nuVar) {
        this.f115953n.f117601h = nuVar;
    }

    public final void setPreloadingState(@NotNull ll3 ll3Var) {
        this.f115952m = ll3Var;
    }

    public su1(Context context, zk3 zk3Var, AttributeSet attributeSet) {
        super(context, zk3Var, attributeSet, 56);
        ju1 ju1Var = new ju1();
        this.f115951l = ju1Var;
        this.f115952m = kl3.f112753a;
        this.f115953n = new wu1(this, ju1Var);
        this.f115954o = new ow2();
    }

    @Override // yads.u92, yads.xz0
    public final void a() {
        super.a();
        ll3 ll3Var = this.f115952m;
        jl3 jl3Var = ll3Var instanceof jl3 ? (jl3) ll3Var : null;
        if (jl3Var != null) {
            ru1 ru1Var = jl3Var.f112383a;
            if (ru1Var != null) {
                ru1Var.b();
            }
            this.f115952m = il3.f112051a;
        }
    }

    @Override // yads.u92, yads.xz0
    public final void a(int i10) {
        super.a(i10);
        ll3 ll3Var = this.f115952m;
        jl3 jl3Var = ll3Var instanceof jl3 ? (jl3) ll3Var : null;
        if (jl3Var != null) {
            ru1 ru1Var = jl3Var.f112383a;
            if (ru1Var != null) {
                ru1Var.a();
            }
            stopLoading();
            this.f115952m = kl3.f112753a;
        }
    }
}
