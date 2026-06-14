package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3987qi extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4011ri f39395a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3987qi(AbstractC4011ri abstractC4011ri, Continuation continuation) {
        super(2, continuation);
        this.f39395a = abstractC4011ri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3987qi(this.f39395a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3987qi(this.f39395a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f39395a.f39476d.onUserLeftApplication();
        return Unit.f93236a;
    }
}
