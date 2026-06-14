package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Yl extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow f38076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3941om f38077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yl(MutableStateFlow mutableStateFlow, Continuation continuation, C3941om c3941om) {
        super(2, continuation);
        this.f38076c = mutableStateFlow;
        this.f38077d = c3941om;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Yl yl = new Yl(this.f38076c, continuation, this.f38077d);
        yl.f38075b = obj;
        return yl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Yl) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38074a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f38075b;
            MutableStateFlow mutableStateFlow = this.f38076c;
            Xl xl = new Xl(coroutineScope, this.f38077d);
            this.f38074a = 1;
            if (mutableStateFlow.collect(xl, this) == objG) {
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
