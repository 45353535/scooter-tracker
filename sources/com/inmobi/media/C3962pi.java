package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3962pi extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4011ri f39291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3962pi(AbstractC4011ri abstractC4011ri, Continuation continuation) {
        super(2, continuation);
        this.f39291a = abstractC4011ri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3962pi(this.f39291a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3962pi(this.f39291a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f39291a.f39476d.onAdImpression(null);
        return Unit.f93236a;
    }
}
