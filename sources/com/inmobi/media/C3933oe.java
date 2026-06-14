package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3933oe extends kotlin.coroutines.jvm.internal.k implements Function2 {
    public C3933oe(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3933oe(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3933oe((Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(true);
    }
}
