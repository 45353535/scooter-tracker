package com.inmobi.media;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class Md extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Nd f37368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Md(Nd nd2, Continuation continuation) {
        super(continuation);
        this.f37368c = nd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37366a = obj;
        this.f37367b |= Integer.MIN_VALUE;
        return this.f37368c.emit(null, this);
    }
}
