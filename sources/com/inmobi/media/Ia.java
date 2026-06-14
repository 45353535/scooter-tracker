package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Ia extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f37061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ia(La la2, Continuation continuation) {
        super(1, continuation);
        this.f37061b = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Ia(this.f37061b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ia(this.f37061b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37060a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            La la2 = this.f37061b;
            la2.getClass();
            la2.f37274b = new C3850l6("crash", (N9) P9.f37527a.getValue(), la2, la2.f37273a.getEventConfig(), null);
            La la3 = this.f37061b;
            this.f37060a = 1;
            if (La.a(la3, this) == objG) {
                return objG;
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
