package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3640cn extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3717fn f38410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3640cn(C3717fn c3717fn, Continuation continuation) {
        super(2, continuation);
        this.f38410b = c3717fn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3640cn(this.f38410b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3640cn(this.f38410b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38409a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableSharedFlow mutableSharedFlow = this.f38410b.f38599d;
            Pl pl = new Pl(r7.f38596a.getDuration());
            this.f38409a = 1;
            if (mutableSharedFlow.emit(pl, this) == objG) {
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
