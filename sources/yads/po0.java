package yads;

import android.os.Handler;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class po0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f114725f = {ub.a(po0.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), ub.a(po0.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f114726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final no0 f114727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gk2 f114728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk2 f114729e;

    public po0(Handler handler, View view, no0 no0Var, x82 x82Var) {
        this.f114726b = handler;
        this.f114727c = no0Var;
        this.f114728d = hk2.a(x82Var);
        this.f114729e = hk2.a(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk2 gk2Var = this.f114729e;
        KProperty[] kPropertyArr = f114725f;
        KProperty kProperty = kPropertyArr[1];
        View view = (View) gk2Var.f111244a.get();
        gk2 gk2Var2 = this.f114728d;
        KProperty kProperty2 = kPropertyArr[0];
        x82 x82Var = (x82) gk2Var2.f111244a.get();
        if (view == null || x82Var == null) {
            return;
        }
        mo0 mo0VarA = this.f114727c.a(view);
        iu1 iu1Var = (iu1) x82Var;
        if (!Intrinsics.areEqual(mo0VarA, iu1Var.f112156r)) {
            iu1Var.f112156r = mo0VarA;
            iu1Var.f112140b.a(new oo0(mo0VarA.f113566a, mo0VarA.f113567b));
        }
        this.f114726b.postDelayed(this, 200L);
    }
}
