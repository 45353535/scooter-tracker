package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Fa extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fa(int i10, Continuation continuation) {
        super(2, continuation);
        this.f36838b = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Fa(this.f36838b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Fa(this.f36838b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36837a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        N9 n92 = (N9) P9.f37527a.getValue();
        int i11 = this.f36838b;
        this.f36837a = 1;
        Object objB = n92.b(i11, this);
        return objB == objG ? objG : objB;
    }
}
