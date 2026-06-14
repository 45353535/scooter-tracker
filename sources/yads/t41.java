package yads;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class t41 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz1 f116048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u41 f116049c;

    public t41(u41 u41Var, yz1 yz1Var) {
        this.f116049c = u41Var;
        this.f116048b = yz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y41 y41Var;
        View viewA = this.f116048b.f118468b.a();
        if (viewA instanceof FrameLayout) {
            za1 za1Var = this.f116049c.f116488d;
            FrameLayout frameLayout = (FrameLayout) viewA;
            h93 h93VarA = ((xz1) za1Var.f118601a).a(za1Var.f118602b, frameLayout.getContext(), false);
            v41 v41Var = this.f116049c.f116485a;
            v41Var.getClass();
            boolean z10 = h93VarA instanceof e93;
            w41 w41Var = v41Var.f116870a;
            WeakReference weakReference = (WeakReference) w41Var.f117313d.get(frameLayout);
            dq dqVar = weakReference != null ? (dq) weakReference.get() : null;
            if (dqVar == null) {
                dqVar = new dq(frameLayout.getContext(), w41Var.f117312c, new tk0());
                w41Var.f117313d.put(frameLayout, new WeakReference(dqVar));
                frameLayout.addView(dqVar);
            }
            w41Var.f117311b.getClass();
            dqVar.setColor(z10 ? SupportMenu.CATEGORY_MASK : -16711936);
            if (z10) {
                WeakReference weakReference2 = (WeakReference) w41Var.f117314e.get(frameLayout);
                y41Var = weakReference2 != null ? (y41) weakReference2.get() : null;
                if (y41Var == null) {
                    y41Var = new y41(frameLayout.getContext(), new wf0());
                    w41Var.f117314e.put(frameLayout, new WeakReference(y41Var));
                    frameLayout.addView(y41Var);
                }
                w41Var.f117310a.getClass();
                y41Var.setDescription(zi3.a(h93VarA));
            } else {
                WeakReference weakReference3 = (WeakReference) w41Var.f117314e.get(frameLayout);
                y41Var = weakReference3 != null ? (y41) weakReference3.get() : null;
                if (y41Var != null) {
                    w41Var.f117314e.remove(frameLayout);
                    frameLayout.removeView(y41Var);
                }
            }
            u41 u41Var = this.f116049c;
            u41Var.f116486b.postDelayed(new t41(u41Var, this.f116048b), 300L);
        }
    }
}
