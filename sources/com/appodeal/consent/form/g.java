package com.appodeal.consent.form;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f15420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15421s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f15420r = str;
        this.f15421s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f15420r, this.f15421s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f15420r, this.f15421s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        com.appodeal.consent.logger.a.b(this.f15420r + ": " + this.f15421s, null);
        return Unit.f93236a;
    }
}
