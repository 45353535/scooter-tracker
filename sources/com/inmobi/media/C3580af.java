package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3580af extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3632cf f38211b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3580af(C3632cf c3632cf, Continuation continuation) {
        super(1, continuation);
        this.f38211b = c3632cf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3580af(this.f38211b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3580af(this.f38211b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38210a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3632cf c3632cf = this.f38211b;
            this.f38210a = 1;
            if (c3632cf.b(this) == objG) {
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
