package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rh0 implements if0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f115446a;

    public rh0(t9 t9Var) {
        this.f115446a = t9Var;
    }

    @Override // yads.if0
    public final boolean a(Context context) {
        String str = this.f115446a.f116118k;
        mf0[] mf0VarArr = mf0.f113454b;
        return Intrinsics.areEqual("divkit", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh0) && Intrinsics.areEqual(this.f115446a, ((rh0) obj).f115446a);
    }

    public final int hashCode() {
        return this.f115446a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.f115446a + ")";
    }
}
