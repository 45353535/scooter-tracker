package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3877m8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3927o8 f39023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ij f39024b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3877m8(C3927o8 c3927o8, Ij ij, Continuation continuation) {
        super(2, continuation);
        this.f39023a = c3927o8;
        this.f39024b = ij;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3877m8(this.f39023a, this.f39024b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3877m8(this.f39023a, this.f39024b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3927o8 c3927o8 = this.f39023a;
        c3927o8.f39174f = this.f39024b;
        c3927o8.f39172d.a(c3927o8.f39176h);
        return Unit.f93236a;
    }
}
