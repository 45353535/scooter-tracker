package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4120w2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4145x2 f39814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rl f39815b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4120w2(AbstractC4145x2 abstractC4145x2, Rl rl, Continuation continuation) {
        super(2, continuation);
        this.f39814a = abstractC4145x2;
        this.f39815b = rl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4120w2(this.f39814a, this.f39815b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4120w2(this.f39814a, this.f39815b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AbstractC4145x2 abstractC4145x2 = this.f39814a;
        Rl rl = this.f39815b;
        int i10 = AbstractC4145x2.f39887h;
        abstractC4145x2.b(rl);
        return Unit.f93236a;
    }
}
