package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3983qe extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f39387a;

    public C3983qe(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3983qe c3983qe = new C3983qe(continuation);
        c3983qe.f39387a = ((Boolean) obj).booleanValue();
        return c3983qe;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C3983qe c3983qe = new C3983qe((Continuation) obj2);
        c3983qe.f39387a = bool.booleanValue();
        return c3983qe.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(this.f39387a);
    }
}
