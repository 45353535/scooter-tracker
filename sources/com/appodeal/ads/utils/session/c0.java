package com.appodeal.ads.utils.session;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f15060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f15061s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.f15060r = d0Var;
        this.f15061s = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c0(this.f15060r, this.f15061s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c0(this.f15060r, this.f15061s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f15060r.f15063a.f(this.f15061s);
        return Unit.f93236a;
    }
}
