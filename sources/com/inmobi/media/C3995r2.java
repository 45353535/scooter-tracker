package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.inmobi.media.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3995r2 extends kotlin.coroutines.jvm.internal.k implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4020s2 f39434b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3995r2(AbstractC4020s2 abstractC4020s2, Continuation continuation) {
        super(3, continuation);
        this.f39434b = abstractC4020s2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C3995r2(this.f39434b, (Continuation) obj3).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39433a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            AbstractC4020s2 abstractC4020s2 = this.f39434b;
            this.f39433a = 1;
            if (AbstractC4020s2.a(abstractC4020s2, this) == objG) {
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
