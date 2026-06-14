package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Yd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3579ae f38052a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yd(C3579ae c3579ae, Continuation continuation) {
        super(2, continuation);
        this.f38052a = c3579ae;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Yd(this.f38052a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Yd(this.f38052a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f38052a.f38204g.setActivated(true);
        this.f38052a.f38204g.setFocusable(true);
        C3579ae c3579ae = this.f38052a;
        if (c3579ae.f38206i) {
            c3579ae.a();
        } else {
            P4.a(c3579ae.f38199b, new Zd(c3579ae, null));
        }
        return Unit.f93236a;
    }
}
