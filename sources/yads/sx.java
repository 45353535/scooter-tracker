package yads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class sx implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf0[] f115966a;

    public sx(hf0... hf0VarArr) {
        this.f115966a = hf0VarArr;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        for (hf0 hf0Var : this.f115966a) {
            hf0Var.a(viewGroup);
        }
    }

    @Override // yads.hf0
    public final void c() {
        for (hf0 hf0Var : this.f115966a) {
            hf0Var.c();
        }
    }
}
