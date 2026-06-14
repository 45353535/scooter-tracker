package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class tx implements if0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final if0[] f116404a;

    public tx(if0... if0VarArr) {
        this.f116404a = if0VarArr;
    }

    @Override // yads.if0
    public final boolean a(Context context) {
        for (if0 if0Var : this.f116404a) {
            if (!if0Var.a(context)) {
                return false;
            }
        }
        return true;
    }
}
