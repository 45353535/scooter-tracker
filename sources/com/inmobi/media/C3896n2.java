package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3896n2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow f39076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC4020s2 f39077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3896n2(MutableStateFlow mutableStateFlow, Continuation continuation, AbstractC4020s2 abstractC4020s2) {
        super(2, continuation);
        this.f39076c = mutableStateFlow;
        this.f39077d = abstractC4020s2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3896n2 c3896n2 = new C3896n2(this.f39076c, continuation, this.f39077d);
        c3896n2.f39075b = obj;
        return c3896n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3896n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39074a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f39075b;
            MutableStateFlow mutableStateFlow = this.f39076c;
            C3871m2 c3871m2 = new C3871m2(coroutineScope, this.f39077d);
            this.f39074a = 1;
            if (mutableStateFlow.collect(c3871m2, this) == objG) {
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
