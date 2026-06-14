package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Ha extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f37003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L2 f37004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ha(La la2, L2 l22, Continuation continuation) {
        super(1, continuation);
        this.f37003b = la2;
        this.f37004c = l22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Ha(this.f37003b, this.f37004c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ha(this.f37003b, this.f37004c, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37002a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            La la2 = this.f37003b;
            L2 l22 = this.f37004c;
            this.f37002a = 1;
            if (La.a(la2, l22, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        this.f37003b.a();
        return Unit.f93236a;
    }
}
