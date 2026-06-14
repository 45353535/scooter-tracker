package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes9.dex */
public final class A3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Deferred f36546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f36547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(Deferred deferred, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f36546b = deferred;
        this.f36547c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new A3(this.f36546b, this.f36547c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new A3(this.f36546b, this.f36547c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36545a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Deferred deferred = this.f36546b;
            this.f36545a = 1;
            obj = deferred.await(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        if (obj != null) {
            this.f36547c.invoke(obj);
        }
        return Unit.f93236a;
    }
}
