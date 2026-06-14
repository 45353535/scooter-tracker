package yads;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u12 f111866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g52 f111867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me3 f111868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i42 f111869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f52 f111870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t12 f111871f;

    public /* synthetic */ i52(Context context, jh3 jh3Var, lf3 lf3Var, c4 c4Var, es2 es2Var, t9 t9Var, jf3 jf3Var, q42 q42Var, u12 u12Var, hg2 hg2Var, zv2 zv2Var) {
        this(u12Var, new g52(jh3Var, lf3Var, c4Var, es2Var, t9Var, jf3Var, q42Var, hg2Var, zv2Var), new me3(), new i42(context.getApplicationContext(), c4Var, es2Var, t9Var));
    }

    public final void a(r52 r52Var, gb3 gb3Var, fh3 fh3Var) {
        f42 f42Var;
        double dDoubleValue;
        d31 d31Var;
        i42 i42Var = this.f111869d;
        xb3 xb3Var = (xb3) CollectionsKt.first(gb3Var.f111136a);
        i42Var.getClass();
        Object obj = xn0.f117909b;
        f42 f42VarA = wn0.a().a(xb3Var);
        if (f42VarA == null || ((do0) f42VarA).f110002m) {
            rd0 rd0Var = i42Var.f111859a;
            Context context = rd0Var.f115405a;
            c4 c4Var = rd0Var.f115406b;
            es2 es2Var = rd0Var.f115407c;
            t9 t9Var = rd0Var.f115408d;
            Object obj2 = vt2.f117186j;
            hr2 hr2VarA = ut2.a().a(context);
            Context applicationContext = context.getApplicationContext();
            Boolean boolValueOf = hr2VarA != null ? Boolean.valueOf(hr2VarA.G0) : null;
            nm0 nm0Var = new nm0(applicationContext);
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                yd0 yd0Var = new yd0(applicationContext);
                yd0Var.f118160d = true;
                nm0Var.c(yd0Var);
            }
            if (nm0Var.f113978r) {
                throw new IllegalStateException();
            }
            nm0Var.f113978r = true;
            vm0 vm0Var = new vm0(nm0Var);
            xl1 xl1Var = new xl1(applicationContext, new wl1());
            ((pr3) es2Var).getClass();
            wr3 wr3Var = wr3.f117545a;
            do0 do0Var = new do0(vm0Var, xl1Var, new ag3(ve.a(applicationContext, new in3()), new tc3(c4Var, t9Var)), new e42(), new mg3());
            wn0.a().a(xb3Var, do0Var);
            f42Var = do0Var;
        } else {
            f42Var = f42VarA;
        }
        Context context2 = r52Var.getContext();
        g52 g52Var = this.f111867b;
        tc3 tc3Var = new tc3(g52Var.f111069c, g52Var.f111071e);
        t9 t9Var2 = g52Var.f111071e;
        es2 es2Var2 = g52Var.f111070d;
        lf3 lf3Var = g52Var.f111068b;
        f52 f52Var = new f52(context2, t9Var2, es2Var2, f42Var, gb3Var, lf3Var, g52Var.f111067a, tc3Var, fh3Var, g52Var.f111072f, g52Var.f111073g, g52Var.f111074h, g52Var.f111075i);
        this.f111870e = f52Var;
        g42 g42Var = f52Var.f110605d;
        g42Var.getClass();
        Double d10 = lf3Var.f113089d;
        j42 j42Var = g42Var.f111061b;
        if (d10 != null) {
            j42Var.getClass();
            dDoubleValue = d10.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        f42 f42Var2 = j42Var.f112233a;
        float f10 = (float) dDoubleValue;
        do0 do0Var2 = (do0) f42Var2;
        if (!do0Var2.f110002m) {
            ((vm0) do0Var2.f109990a).a(f10);
            yc3 yc3Var = do0Var2.f110000k;
            qc3 qc3Var = do0Var2.f109999j;
            if (yc3Var != null && qc3Var != null) {
                yc3Var.onVolumeChanged(f10);
            }
        }
        pg3 pg3Var = lf3Var.f113086a;
        do0 do0Var3 = (do0) g42Var.f111060a;
        if (!do0Var3.f110002m) {
            mg3 mg3Var = do0Var3.f109994e;
            mg3Var.f113468d = pg3Var;
            mg3Var.b();
        }
        f52Var.f110607f.a(r52Var);
        pf3 pf3Var = r52Var.f115323a;
        bh2 bh2Var = f52Var.f110606e;
        bh2Var.getClass();
        ImageView imageView = pf3Var.f114659b;
        ProgressBar progressBar = pf3Var.f114658a;
        if (imageView == null || (d31Var = bh2Var.f109004a.f111138c) == null) {
            progressBar.setVisibility(0);
        } else {
            bh2Var.f109005b.a(d31Var, new ah2(imageView, progressBar));
        }
        f52Var.a(f52Var.f110609h);
        t12 t12Var = new t12(f42Var);
        this.f111871f = t12Var;
        u12 u12Var = this.f111866a;
        u12Var.f116438a.add(t12Var);
        if (u12Var.f116439b) {
            t12Var.b();
        }
        r52Var.setOnAttachStateChangeListener(new n42(f42Var, r52Var));
    }

    public i52(u12 u12Var, g52 g52Var, me3 me3Var, i42 i42Var) {
        this.f111866a = u12Var;
        this.f111867b = g52Var;
        this.f111868c = me3Var;
        this.f111869d = i42Var;
    }
}
