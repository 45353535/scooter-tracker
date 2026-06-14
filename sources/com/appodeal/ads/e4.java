package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class e4 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13269s;

    public e4(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f13268r = obj;
        this.f13269s |= Integer.MIN_VALUE;
        return v4.a(null, this);
    }
}
