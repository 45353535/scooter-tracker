package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class R7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S7 f37646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(S7 s72, Continuation continuation) {
        super(2, continuation);
        this.f37646a = s72;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new R7(this.f37646a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new R7(this.f37646a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        if (this.f37646a.f37698d.d()) {
            S7 s72 = this.f37646a;
            s72.f37696b.setVolume(1.0f);
            P4.a(s72.f37697c, s72.f37695a, new S1(1.0f, false));
            s72.f37699e = false;
        } else {
            this.f37646a.a();
        }
        return Unit.f93236a;
    }
}
