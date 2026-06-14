package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g22 implements c21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111039a;

    public g22(t9 t9Var) {
        this.f111039a = Intrinsics.areEqual(t9Var.b(), f22.f110586c.a()) || Intrinsics.areEqual(t9Var.b(), f22.f110587d.a());
    }

    @Override // yads.c21
    public final boolean a() {
        return this.f111039a;
    }
}
