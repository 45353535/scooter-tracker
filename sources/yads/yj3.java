package yads;

import android.view.View;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw1 f118247a;

    public yj3(jw1 jw1Var) {
        this.f118247a = jw1Var;
    }

    public final void a(View view, boolean z10) {
        int i10;
        int i11 = z10 ? this.f118247a.f112484a : this.f118247a.f112485b;
        if (z10) {
            i10 = this.f118247a.f112486c;
        } else {
            if (z10) {
                throw new lf.m();
            }
            i10 = this.f118247a.f112487d;
        }
        view.setBackground(ContextCompat.getDrawable(view.getContext(), i11));
        view.setContentDescription(ContextCompat.getString(view.getContext(), i10));
    }
}
