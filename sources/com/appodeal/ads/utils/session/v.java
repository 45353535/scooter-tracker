package com.appodeal.ads.utils.session;

import com.appodeal.ads.k7;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f15118s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f15118s = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f15118s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.f15118s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objG = pf.b.g();
        int i10 = this.f15117r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            k7 k7Var = k7.f13545a;
            this.f15117r = 1;
            if (k7Var.p(this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ((Result) obj).l();
        }
        MutableStateFlow mutableStateFlow = this.f15118s.f15122d;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, t.f15112c));
        return Unit.f93236a;
    }
}
