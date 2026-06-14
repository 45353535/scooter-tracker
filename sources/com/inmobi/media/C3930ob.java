package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3930ob extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f39183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3955pb f39185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3930ob(C3955pb c3955pb, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39185d = c3955pb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39184c = obj;
        this.f39186e |= Integer.MIN_VALUE;
        return this.f39185d.a(null, this);
    }
}
