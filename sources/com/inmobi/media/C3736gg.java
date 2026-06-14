package com.inmobi.media;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3736gg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Xf f38634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3710fg f38635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rf f38636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3785ig f38638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3736gg(AbstractC3785ig abstractC3785ig, Continuation continuation) {
        super(continuation);
        this.f38638e = abstractC3785ig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38637d = obj;
        this.f38639f |= Integer.MIN_VALUE;
        return this.f38638e.a(null, null, this);
    }
}
