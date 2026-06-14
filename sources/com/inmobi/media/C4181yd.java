package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4181yd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dd f39991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4181yd(Dd dd2, Continuation continuation) {
        super(2, continuation);
        this.f39991b = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4181yd(this.f39991b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4181yd(this.f39991b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39990a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        C4117w c4117w = this.f39991b.f36729f;
        this.f39990a = 1;
        Object objA = c4117w.a(this);
        return objA == objG ? objG : objA;
    }
}
