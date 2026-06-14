package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Tk extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37791b;

    public Tk(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37790a = obj;
        this.f37791b |= Integer.MIN_VALUE;
        return Yk.a(this);
    }
}
