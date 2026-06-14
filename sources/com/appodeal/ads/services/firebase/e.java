package com.appodeal.ads.services.firebase;

import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FirebaseService f14675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ServiceOptions.Firebase f14676t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ServiceOptions.Firebase firebase, FirebaseService firebaseService, Continuation continuation) {
        super(2, continuation);
        this.f14675s = firebaseService;
        this.f14676t = firebase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f14676t, this.f14675s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FirebaseService firebaseService = this.f14675s;
        return new e(this.f14676t, firebaseService, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f14674r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            FirebaseService firebaseService = this.f14675s;
            List<String> configKeys = this.f14676t.getConfigKeys();
            this.f14674r = 1;
            if (FirebaseService.c(firebaseService, configKeys, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        this.f14675s.f14658a.releaseAwaiter();
        return Unit.f93236a;
    }
}
