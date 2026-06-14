package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3851l7 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f38955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3876m7 f38957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3851l7(C3876m7 c3876m7, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38957c = c3876m7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38956b = obj;
        this.f38958d |= Integer.MIN_VALUE;
        return this.f38957c.e(this);
    }
}
