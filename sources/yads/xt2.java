package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xt2 implements n53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s72 f117961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl2 f117962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u41 f117963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f117964d;

    public xt2(fv1 fv1Var, dl2 dl2Var, u41 u41Var, jb2 jb2Var) {
        this.f117961a = fv1Var;
        this.f117962b = dl2Var;
        this.f117963c = u41Var;
        this.f117964d = jb2Var;
    }

    @Override // yads.n53
    public final void a(yz1 yz1Var) {
        u41 u41Var = this.f117963c;
        u41Var.f116486b.removeCallbacksAndMessages(null);
        View viewA = yz1Var.f118468b.a();
        if (viewA instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewA;
            w41 w41Var = u41Var.f116485a.f116870a;
            WeakReference weakReference = (WeakReference) w41Var.f117313d.get(frameLayout);
            dq dqVar = weakReference != null ? (dq) weakReference.get() : null;
            if (dqVar != null) {
                w41Var.f117313d.remove(frameLayout);
                frameLayout.removeView(dqVar);
            }
            WeakReference weakReference2 = (WeakReference) w41Var.f117314e.get(frameLayout);
            y41 y41Var = weakReference2 != null ? (y41) weakReference2.get() : null;
            if (y41Var != null) {
                w41Var.f117314e.remove(frameLayout);
                frameLayout.removeView(y41Var);
            }
        }
    }

    @Override // yads.n53
    public final void a(m41 m41Var) {
        ((fv1) this.f117961a).f110945j = m41Var;
    }

    @Override // yads.n53
    public final void a(b32 b32Var) {
        this.f117962b.f109970d.f109460c.f109040g = b32Var;
    }

    @Override // yads.n53
    public final void a(Context context, a22 a22Var, yz1 yz1Var) {
        boolean z10;
        dl2 dl2Var = this.f117962b;
        if (!dl2Var.f109972f) {
            dl2Var.f109972f = true;
            al2 al2Var = dl2Var.f109971e;
            al2Var.f108716c.post(new zk2(al2Var, al2Var.f108714a));
        }
        ((fv1) this.f117961a).a();
        this.f117964d.a(a22Var);
        if (yz1Var != null) {
            u41 u41Var = this.f117963c;
            u41Var.f116487c.getClass();
            Object obj = vt2.f117186j;
            vt2 vt2VarA = ut2.a();
            hr2 hr2VarA = vt2VarA.a(context);
            Boolean bool = hr2VarA != null ? hr2VarA.N : null;
            synchronized (vt2.f117186j) {
                z10 = vt2VarA.f117191d;
            }
            boolean zC = vt2VarA.c();
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return;
                }
            } else if ((!z10 || !sb.a(context)) && !zC) {
                return;
            }
            u41Var.f116486b.post(new t41(u41Var, yz1Var));
        }
    }

    @Override // yads.n53
    public final void a(a22 a22Var) {
        dl2 dl2Var = this.f117962b;
        dl2Var.f109972f = false;
        dl2Var.f109971e.f108716c.removeCallbacksAndMessages(null);
        ((fv1) this.f117961a).b();
        this.f117964d.b(a22Var);
        this.f117963c.f116486b.removeCallbacksAndMessages(null);
    }

    @Override // yads.n53
    public final void a(t9 t9Var, List list) {
        ((fv1) this.f117961a).a(t9Var, list);
    }
}
