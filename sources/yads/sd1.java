package yads;

import android.widget.ProgressBar;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class sd1 implements oh2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f115752d = {kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(sd1.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd1 f115753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye f115754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk2 f115755c;

    public /* synthetic */ sd1() {
        this(new rd1(), new ye());
    }

    @Override // yads.oh2
    public final void a(long j10, long j11) {
        gk2 gk2Var = this.f115755c;
        KProperty kProperty = f115752d[0];
        ProgressBar progressBar = (ProgressBar) gk2Var.f111244a.get();
        if (progressBar != null) {
            this.f115754b.getClass();
            ye.a(progressBar, j10, j11);
        }
    }

    public sd1(rd1 rd1Var, ye yeVar) {
        this.f115753a = rd1Var;
        this.f115754b = yeVar;
        this.f115755c = hk2.a(null);
    }

    @Override // yads.oh2
    public final void a() {
        gk2 gk2Var = this.f115755c;
        KProperty kProperty = f115752d[0];
        ProgressBar progressBar = (ProgressBar) gk2Var.f111244a.get();
        if (progressBar != null) {
            long max = progressBar.getMax();
            this.f115754b.getClass();
            ye.a(progressBar, max, max);
        }
    }
}
