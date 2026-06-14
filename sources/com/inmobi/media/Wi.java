package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Wi extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37958a;

    public Wi(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Wi(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Wi((Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37958a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Intrinsics.checkNotNullExpressionValue(Yi.f38063b, "access$getTAG$p(...)");
            Qi qi = Qi.f37598a;
            boolean sessionEnabled = Yi.a().getSessionEnabled();
            qi.getClass();
            Qi.f37602e = sessionEnabled;
            if (!sessionEnabled) {
                Qi.f37601d = null;
            }
            Qi.c();
            if (Ji.b() == null || Yi.a().getLocationEnabled()) {
                C3880mb c3880mb = C3880mb.f39026a;
                this.f37958a = 1;
                if (c3880mb.a(this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
