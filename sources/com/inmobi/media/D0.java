package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class D0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f36693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f36694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(long j10, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f36693b = j10;
        this.f36694c = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new D0(this.f36693b, this.f36694c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new D0(this.f36693b, this.f36694c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36692a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            long j10 = this.f36693b;
            this.f36692a = 1;
            if (eg.k0.a(j10, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        this.f36694c.invoke();
        return Unit.f93236a;
    }
}
