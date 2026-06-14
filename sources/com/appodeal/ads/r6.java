package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class r6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n8 f14327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ServiceVariant f14328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ServiceOptions f14329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n6 f14330v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(n6 n6Var, n8 n8Var, ServiceOptions serviceOptions, ServiceVariant serviceVariant, Continuation continuation) {
        super(2, continuation);
        this.f14327s = n8Var;
        this.f14328t = serviceVariant;
        this.f14329u = serviceOptions;
        this.f14330v = n6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        n8 n8Var = this.f14327s;
        ServiceVariant serviceVariant = this.f14328t;
        return new r6(this.f14330v, n8Var, this.f14329u, serviceVariant, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objG = pf.b.g();
        int i10 = this.f14326r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            n8 n8Var = this.f14327s;
            ServiceVariant serviceVariant = this.f14328t;
            ServiceOptions serviceOptions = this.f14329u;
            n6 n6Var = this.f14330v;
            this.f14326r = 1;
            objB = n8.b(n8Var, serviceVariant, serviceOptions, n6Var, this);
            if (objB == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            objB = ((Result) obj).l();
        }
        return Result.a(objB);
    }
}
