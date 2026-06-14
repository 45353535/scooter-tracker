package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3601ba extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3980qb f38259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3601ba(C3980qb c3980qb, Continuation continuation) {
        super(2, continuation);
        this.f38259b = c3980qb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3601ba(this.f38259b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3601ba(this.f38259b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38258a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4154xb c4154xb = (C4154xb) AbstractC4179yb.f39987a.getValue();
            C3980qb c3980qb = this.f38259b;
            this.f38258a = 1;
            if (c4154xb.b(c3980qb, this) == objG) {
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
