package yads;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j82 implements za3, kotlin.jvm.internal.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k82 f112264a;

    public j82(k82 k82Var) {
        this.f112264a = k82Var;
    }

    @Override // yads.za3
    public final void a() {
        k82 k82Var = this.f112264a;
        synchronized (k82Var.f112645a) {
            k82Var.f112650f = true;
            Unit unit = Unit.f93236a;
        }
        k82Var.c();
        k82Var.f112648d.b();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof za3) && (obj instanceof kotlin.jvm.internal.v)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.v) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.v
    public final lf.e getFunctionDelegate() {
        return new kotlin.jvm.internal.y(0, this.f112264a, k82.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
