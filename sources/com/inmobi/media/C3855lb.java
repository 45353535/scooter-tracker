package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3855lb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f38966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3880mb f38968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3855lb(C3880mb c3880mb, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38968c = c3880mb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38967b = obj;
        this.f38969d |= Integer.MIN_VALUE;
        return this.f38968c.a(this);
    }
}
