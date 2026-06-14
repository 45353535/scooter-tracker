package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3639cm extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3941om f38408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3639cm(C3941om c3941om, Continuation continuation) {
        super(2, continuation);
        this.f38408a = c3941om;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3639cm(this.f38408a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3639cm(this.f38408a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3941om c3941om = this.f38408a;
        return new Sd(c3941om.f38785a, c3941om.f39215b, c3941om.f39216c.f39306e, c3941om.f39218e);
    }
}
