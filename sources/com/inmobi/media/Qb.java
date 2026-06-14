package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Qb extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4154xb f37587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f37588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qb(C4154xb c4154xb, long j10, int i10, Continuation continuation) {
        super(1, continuation);
        this.f37587a = c4154xb;
        this.f37588b = j10;
        this.f37589c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Qb(this.f37587a, this.f37588b, this.f37589c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Qb) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        eg.i.d(A9.f36557c, null, null, new Pb(this.f37587a, this.f37588b, this.f37589c, null), 3, null);
        return Unit.f93236a;
    }
}
