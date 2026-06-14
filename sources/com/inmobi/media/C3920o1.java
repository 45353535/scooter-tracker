package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3920o1 implements InterfaceC4126w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3945p1 f39143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f39144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3903n9 f39145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3617c0 f39146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineScope f39147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3869m0 f39148f;

    public C3920o1(Context context, Gc gc2, C3945p1 adManagerContext) {
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        this.f39143a = adManagerContext;
        C3895n1 c3895n1 = new C3895n1(eg.c0.J8, this);
        this.f39144b = context;
        this.f39145c = gc2.f36937a;
        C3617c0 c3617c0 = new C3617c0();
        this.f39146d = c3617c0;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(eg.o0.b().plus(eg.m1.b(null, 1, null)).plus(c3895n1));
        this.f39147e = coroutineScopeA;
        this.f39148f = new C3869m0(coroutineScopeA, adManagerContext, c3617c0);
    }

    @Override // com.inmobi.media.InterfaceC4126w8
    public final CoroutineScope a() {
        return this.f39147e;
    }

    @Override // com.inmobi.media.InterfaceC4126w8
    public final C3869m0 b() {
        return this.f39148f;
    }

    @Override // com.inmobi.media.InterfaceC4126w8
    public final InterfaceC3878m9 c() {
        return this.f39145c;
    }
}
