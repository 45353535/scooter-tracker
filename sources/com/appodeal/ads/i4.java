package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class i4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13413s;

    public i4(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13412r = obj;
        this.f13413s |= Integer.MIN_VALUE;
        return v4.f(null, this);
    }
}
