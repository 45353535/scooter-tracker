package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3971q2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4020s2 f39337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3971q2(AbstractC4020s2 abstractC4020s2, Continuation continuation) {
        super(2, continuation);
        this.f39337b = abstractC4020s2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3971q2(this.f39337b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3971q2(this.f39337b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39336a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            AbstractC4020s2 abstractC4020s2 = this.f39337b;
            this.f39336a = 1;
            if (AbstractC4020s2.b(abstractC4020s2, this) == objG) {
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
