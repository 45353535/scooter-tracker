package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3953p9 extends kotlin.coroutines.jvm.internal.k implements Function1 {
    public C3953p9(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3953p9(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3953p9((Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C4154xb c4154xb = (C4154xb) AbstractC4179yb.f39987a.getValue();
        C3928o9 listener = AbstractC3978q9.f39365c;
        c4154xb.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c4154xb.f39922b = new WeakReference(listener);
        return Unit.f93236a;
    }
}
