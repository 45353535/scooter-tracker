package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class gb1 implements fb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm f111134a;

    public gb1(cm cmVar) {
        this.f111134a = cmVar;
    }

    @Override // yads.fb1
    public final void a(Context context, View view) {
    }

    @Override // yads.fb1
    public final void onAttachedToWindow() {
        int i10 = rb.f115393b;
        if (rb.a((du) this.f111134a)) {
            return;
        }
        this.f111134a.m();
    }

    @Override // yads.fb1
    public final void onDetachedFromWindow() {
        int i10 = rb.f115393b;
        if (rb.a((du) this.f111134a)) {
            return;
        }
        this.f111134a.n();
    }
}
