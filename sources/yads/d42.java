package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class d42 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pl2 f109754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sj1 f109755b;

    /* JADX WARN: Multi-variable type inference failed */
    public d42(Context context, pl2 pl2Var, sj1 sj1Var) {
        super(context);
        this.f109754a = pl2Var;
        this.f109755b = sj1Var;
        addView(pl2Var);
        if (sj1Var == 0 || !(sj1Var instanceof View)) {
            return;
        }
        addView((View) sj1Var);
    }
}
