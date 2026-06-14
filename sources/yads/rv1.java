package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class rv1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv1 f115617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115618b;

    public rv1(hv1 hv1Var, long j10) {
        this.f115617a = hv1Var;
        this.f115618b = j10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Unit unit;
        hv1 hv1Var = this.f115617a;
        long j10 = this.f115618b;
        if (j10 <= 0) {
            hv1Var.getClass();
            return;
        }
        if (hv1Var.f111786f) {
            hv1Var.a();
            gk2 gk2Var = hv1Var.f111784d;
            KProperty kProperty = hv1.f111780g[0];
            ViewPager2 viewPager2 = (ViewPager2) gk2Var.f111244a.get();
            if (viewPager2 != null) {
                jv1 jv1Var = new jv1(viewPager2, hv1Var.f111781a, hv1Var.f111782b);
                hv1Var.f111783c.getClass();
                Handler handler = new Handler(Looper.getMainLooper());
                dg1 dg1Var = new dg1(handler);
                hv1Var.f111785e = dg1Var;
                if (jv1Var.f116750b == ts.f116350b) {
                    handler.postDelayed(new cg1(dg1Var, j10, jv1Var), j10);
                }
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                hv1Var.a();
                hv1Var.f111786f = false;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f115617a.a();
    }
}
