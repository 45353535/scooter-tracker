package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4052t9 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4077u9 f39582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Me f39583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4052t9(C4077u9 c4077u9, Me me2, Continuation continuation) {
        super(2, continuation);
        this.f39582b = c4077u9;
        this.f39583c = me2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4052t9(this.f39582b, this.f39583c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4052t9(this.f39582b, this.f39583c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39581a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        C4147x4 c4147x4 = this.f39582b.f39655a;
        Me me2 = this.f39583c;
        this.f39581a = 1;
        Object objA = c4147x4.a(me2, this);
        return objA == objG ? objG : objA;
    }
}
