package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class Kk extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mutex f37229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Mk f37231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kk(Mk mk, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37231e = mk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37230d = obj;
        this.f37232f |= Integer.MIN_VALUE;
        return this.f37231e.a(0, null, this);
    }
}
