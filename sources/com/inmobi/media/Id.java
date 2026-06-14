package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Id extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Jd f37069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Id(Jd jd2, Continuation continuation) {
        super(2, continuation);
        this.f37069c = jd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Id id2 = new Id(this.f37069c, continuation);
        id2.f37068b = obj;
        return id2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Id id2 = new Id(this.f37069c, (Continuation) obj2);
        id2.f37068b = (gg.v) obj;
        return id2.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37067a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            gg.v vVar = (gg.v) this.f37068b;
            Jd jd2 = this.f37069c;
            MutableSharedFlow mutableSharedFlow = jd2.f37131a.f37464a;
            Hd hd2 = new Hd(jd2, vVar);
            this.f37067a = 1;
            if (mutableSharedFlow.collect(hd2, this) == objG) {
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
