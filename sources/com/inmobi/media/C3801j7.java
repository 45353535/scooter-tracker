package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3801j7 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f38798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3876m7 f38800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3801j7(C3876m7 c3876m7, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38800c = c3876m7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38799b = obj;
        this.f38801d |= Integer.MIN_VALUE;
        return this.f38800c.d(this);
    }
}
