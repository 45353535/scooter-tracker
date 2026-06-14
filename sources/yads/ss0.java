package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class ss0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final at0 f115921a;

    public ss0(at0 at0Var) {
        this.f115921a = at0Var;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        Context context = view.getContext();
        this.f115921a.a(context, (rs0) m0Var);
        return new zy0(false);
    }
}
