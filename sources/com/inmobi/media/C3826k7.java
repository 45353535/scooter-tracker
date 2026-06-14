package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3826k7 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3876m7 f38865b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3826k7(C3876m7 c3876m7, Continuation continuation) {
        super(1, continuation);
        this.f38865b = c3876m7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3826k7(this.f38865b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3826k7(this.f38865b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38864a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3876m7 c3876m7 = this.f38865b;
            this.f38864a = 1;
            if (c3876m7.b(this) == objG) {
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
