package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Ld extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Od f37286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Sd f37287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ld(Od od2, Continuation continuation, Sd sd2) {
        super(2, continuation);
        this.f37286c = od2;
        this.f37287d = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Ld ld2 = new Ld(this.f37286c, continuation, this.f37287d);
        ld2.f37285b = obj;
        return ld2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ld) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37284a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f37285b;
            Od od2 = this.f37286c;
            Kd kd2 = new Kd(coroutineScope, this.f37287d);
            this.f37284a = 1;
            if (od2.collect(kd2, this) == objG) {
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
