package yads;

import android.view.View;
import android.view.ViewGroup;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class cy2 implements hf0, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7 f109660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f109661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ox1 f109662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rx2 f109663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public de0 f109664e;

    public cy2(h7 h7Var, b2 b2Var, ox1 ox1Var, rx2 rx2Var) {
        this.f109660a = h7Var;
        this.f109661b = b2Var;
        this.f109662c = ox1Var;
        this.f109663d = rx2Var;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        i7 i7Var;
        View viewB = this.f109662c.b(viewGroup);
        if (viewB != null) {
            this.f109661b.f108890b.add(this);
            rx2 rx2Var = this.f109663d;
            h7 h7Var = this.f109660a;
            Long lValueOf = (h7Var == null || (i7Var = h7Var.f111500b) == null) ? null : Long.valueOf(i7Var.f111884c);
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            ma2 ma2VarA = oa2.a();
            de0 de0Var = new de0(viewB, rx2Var, jLongValue, ma2VarA);
            this.f109664e = de0Var;
            gk2 gk2Var = de0Var.f109897b;
            KProperty kProperty = de0.f109895c[0];
            View view = (View) gk2Var.f111244a.get();
            if (view != null) {
                ce0 ce0Var = new ce0(view, rx2Var);
                if (jLongValue == 0) {
                    rx2Var.b(view);
                } else {
                    ma2VarA.a(jLongValue, ce0Var);
                }
            }
            if (viewB.getTag() == null) {
                viewB.setTag("skip_button");
            }
        }
    }

    @Override // yads.c2
    public final void b() {
        de0 de0Var = this.f109664e;
        if (de0Var != null) {
            ((ma2) de0Var.f109896a).b();
        }
    }

    @Override // yads.hf0
    public final void c() {
        this.f109661b.f108890b.remove(this);
        de0 de0Var = this.f109664e;
        if (de0Var != null) {
            ((ma2) de0Var.f109896a).a();
        }
    }

    @Override // yads.c2
    public final void a() {
        de0 de0Var = this.f109664e;
        if (de0Var != null) {
            ((ma2) de0Var.f109896a).d();
        }
    }
}
