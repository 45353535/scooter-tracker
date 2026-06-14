package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3687ej extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC3636cj f38523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3636cj f38524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mutex f38525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3713fj f38527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3687ej(AbstractC3713fj abstractC3713fj, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38527e = abstractC3713fj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38526d = obj;
        this.f38528f |= Integer.MIN_VALUE;
        return this.f38527e.a(null, null, this);
    }
}
