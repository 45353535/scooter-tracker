package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4019s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3906nc f39494a;

    public AbstractC4019s1(C3920o1 adManagerComponent) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        C3945p1 c3945p1 = adManagerComponent.f39143a;
        this.f39494a = AbstractC3881mc.a(c3945p1.f39234b.getTimeouts().X(), c3945p1.f39233a.f37147g, "native", Ki.f37226b);
    }

    public abstract void a();

    public abstract void b();

    public void c() {
    }

    public abstract void d();

    public abstract void e();

    public void f() {
    }
}
