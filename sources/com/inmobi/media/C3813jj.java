package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3813jj extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cj f38829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3913nj f38831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4111vi f38832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3813jj(C3913nj c3913nj, C4111vi c4111vi, Continuation continuation) {
        super(2, continuation);
        this.f38831c = c3913nj;
        this.f38832d = c4111vi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3813jj(this.f38831c, this.f38832d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3813jj(this.f38831c, this.f38832d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38830b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Cj cj = this.f38829a;
            kotlin.d.b(obj);
            return cj;
        }
        kotlin.d.b(obj);
        Cj cj2 = new Cj(this.f38831c.f39112a);
        C3913nj c3913nj = this.f38831c;
        String str = this.f38832d.f39783a;
        this.f38829a = cj2;
        this.f38830b = 1;
        return C3913nj.a(c3913nj, str, cj2, this) == objG ? objG : cj2;
    }
}
