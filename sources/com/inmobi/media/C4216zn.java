package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4216zn extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow f40081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bn f40082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4216zn(MutableStateFlow mutableStateFlow, Continuation continuation, Bn bn) {
        super(2, continuation);
        this.f40081c = mutableStateFlow;
        this.f40082d = bn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4216zn c4216zn = new C4216zn(this.f40081c, continuation, this.f40082d);
        c4216zn.f40080b = obj;
        return c4216zn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4216zn) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f40079a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f40080b;
            MutableStateFlow mutableStateFlow = this.f40081c;
            C4191yn c4191yn = new C4191yn(coroutineScope, this.f40082d);
            this.f40079a = 1;
            if (mutableStateFlow.collect(c4191yn, this) == objG) {
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
