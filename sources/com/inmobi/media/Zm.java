package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Zm extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f38134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3614bn f38135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zm(MutableSharedFlow mutableSharedFlow, Continuation continuation, C3614bn c3614bn) {
        super(2, continuation);
        this.f38134c = mutableSharedFlow;
        this.f38135d = c3614bn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Zm zm = new Zm(this.f38134c, continuation, this.f38135d);
        zm.f38133b = obj;
        return zm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Zm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38132a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f38133b;
            MutableSharedFlow mutableSharedFlow = this.f38134c;
            Ym ym = new Ym(coroutineScope, this.f38135d);
            this.f38132a = 1;
            if (mutableSharedFlow.collect(ym, this) == objG) {
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
