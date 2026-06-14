package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4206zd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4124w6 f40048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4206zd(AbstractC4124w6 abstractC4124w6, Continuation continuation) {
        super(2, continuation);
        this.f40048b = abstractC4124w6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4206zd(this.f40048b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4206zd(this.f40048b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f40047a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        AbstractC4124w6 abstractC4124w6 = this.f40048b;
        this.f40047a = 1;
        Object objA = abstractC4124w6.a(this);
        return objA == objG ? objG : objA;
    }
}
