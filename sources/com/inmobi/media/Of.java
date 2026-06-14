package com.inmobi.media;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Of extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pf f37494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f37495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Of(Pf pf2, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.f37494b = pf2;
        this.f37495c = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Of(this.f37494b, this.f37495c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Of(this.f37494b, this.f37495c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37493a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Pf pf2 = this.f37494b;
            Activity activity = this.f37495c;
            this.f37493a = 1;
            if (Pf.a(pf2, activity, this) == objG) {
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
