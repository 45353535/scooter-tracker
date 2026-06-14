package org.bidon.sdk.ads.banner.helper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lorg/bidon/sdk/ads/banner/helper/ActivityLifecycleState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "org.bidon.sdk.ads.banner.helper.CountDownTimer$startTimer$1$deferred$1$1$1", f = "CountDownTimer.kt", l = {}, m = "invokeSuspend")
final class CountDownTimer$startTimer$1$deferred$1$1$1 extends k implements Function2<ActivityLifecycleState, Continuation, Object> {
    /* synthetic */ Object L$0;
    int label;

    CountDownTimer$startTimer$1$deferred$1$1$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        CountDownTimer$startTimer$1$deferred$1$1$1 countDownTimer$startTimer$1$deferred$1$1$1 = new CountDownTimer$startTimer$1$deferred$1$1$1(continuation);
        countDownTimer$startTimer$1$deferred$1$1$1.L$0 = obj;
        return countDownTimer$startTimer$1$deferred$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(((ActivityLifecycleState) this.L$0) == ActivityLifecycleState.Resumed);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ActivityLifecycleState activityLifecycleState, Continuation continuation) {
        return ((CountDownTimer$startTimer$1$deferred$1$1$1) create(activityLifecycleState, continuation)).invokeSuspend(Unit.f93236a);
    }
}
