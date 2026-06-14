package com.appodeal.ads;

import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AppEvent;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class k8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u8 f13549s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(u8 u8Var, Continuation continuation) {
        super(2, continuation);
        this.f13549s = u8Var;
    }

    public static final Event i() {
        return AppEvent.Pause.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k8(this.f13549s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k8(this.f13549s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f13548r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            this.f13549s.f14929d = System.currentTimeMillis();
            this.f13548r = 1;
            if (eg.k0.a(1000L, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        u8 u8Var = this.f13549s;
        if (u8Var.f14930e < u8Var.f14929d) {
            u8Var.f14931f.set(true);
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_PAUSE);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.f8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k8.i();
                }
            });
        }
        return Unit.f93236a;
    }
}
