package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Qd extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sd f37591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qd(Sd sd2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37591b = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37590a = obj;
        this.f37592c |= Integer.MIN_VALUE;
        return this.f37591b.a(null, this);
    }
}
