package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3905nb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mutex f39090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3955pb f39092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3905nb(C3955pb c3955pb, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39092e = c3955pb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39091d = obj;
        this.f39093f |= Integer.MIN_VALUE;
        return this.f39092e.a(null, null, this);
    }
}
