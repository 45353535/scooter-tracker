package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3833ke extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4032se f38882a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3833ke(C4032se c4032se, Continuation continuation) {
        super(2, continuation);
        this.f38882a = c4032se;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3833ke(this.f38882a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3833ke(this.f38882a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f38882a.f39529h.onVideoResumed();
        return Unit.f93236a;
    }
}
