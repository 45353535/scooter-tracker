package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class D7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f36712a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(Continuation continuation, N7 n72) {
        super(2, continuation);
        this.f36712a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new D7(continuation, this.f36712a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new D7((Continuation) obj2, this.f36712a).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f36712a.f37417p.pause();
        this.f36712a.f37425x.a();
        S7 s72 = this.f36712a.f37426y;
        s72.f37696b.setVolume(0.0f);
        s72.f37698d.a();
        N7 n72 = this.f36712a;
        n72.f37413l.set(EnumC4034sg.f39536e);
        N7 n73 = this.f36712a;
        n73.a(new Om(n73.f37417p.getCurrentPosition()));
        return Unit.f93236a;
    }
}
