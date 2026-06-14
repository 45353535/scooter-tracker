package org.bidon.sdk.ads.banner.helper;

import com.appodeal.ads.modules.common.internal.LogConstants;
import eg.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.bidon.sdk.ads.banner.helper.impl.ActivityLifecycleObserver;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.SdkDispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/CountDownTimer;", "", "activityLifecycleObserver", "Lorg/bidon/sdk/ads/banner/helper/impl/ActivityLifecycleObserver;", "<init>", "(Lorg/bidon/sdk/ads/banner/helper/impl/ActivityLifecycleObserver;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "timerDeferred", "Lkotlinx/coroutines/Deferred;", "", AtomManager.ATOM_STOP_METHOD_NAME, "startTimer", "timeoutMs", "", "onFinish", "Lkotlin/Function0;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CountDownTimer {

    @NotNull
    private final ActivityLifecycleObserver activityLifecycleObserver;

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @Nullable
    private Deferred timerDeferred;

    /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.helper.CountDownTimer$startTimer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.ads.banner.helper.CountDownTimer$startTimer$1", f = "CountDownTimer.kt", l = {39}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function0<Unit> $onFinish;
        final /* synthetic */ long $timeoutMs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0, long j10, Continuation continuation) {
            super(2, continuation);
            this.$onFinish = function0;
            this.$timeoutMs = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = CountDownTimer.this.new AnonymousClass1(this.$onFinish, this.$timeoutMs, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    d.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    LogExtKt.logInfo("CountDownTimer", LogConstants.EVENT_STARTED);
                    Deferred deferredB = CountDownTimer.this.timerDeferred;
                    if (deferredB == null) {
                        deferredB = i.b(coroutineScope, null, null, new CountDownTimer$startTimer$1$deferred$1(this.$timeoutMs, CountDownTimer.this, null), 3, null);
                        CountDownTimer.this.timerDeferred = deferredB;
                    }
                    this.label = 1;
                    if (deferredB.await(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                this.$onFinish.invoke();
                LogExtKt.logInfo("CountDownTimer", LogConstants.EVENT_FINISHED);
                CountDownTimer.this.timerDeferred = null;
                return Unit.f93236a;
            } catch (Throwable th2) {
                CountDownTimer.this.timerDeferred = null;
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public CountDownTimer(@NotNull ActivityLifecycleObserver activityLifecycleObserver) {
        Intrinsics.checkNotNullParameter(activityLifecycleObserver, "activityLifecycleObserver");
        this.activityLifecycleObserver = activityLifecycleObserver;
        this.scope = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.banner.helper.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CountDownTimer.scope_delegate$lambda$0();
            }
        });
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$0() {
        return kotlinx.coroutines.i.a(SdkDispatchers.INSTANCE.getMain());
    }

    public final void startTimer(long timeoutMs, @NotNull Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        i.d(getScope(), null, null, new AnonymousClass1(onFinish, timeoutMs, null), 3, null);
    }

    public final void stop() {
        LogExtKt.logInfo("CountDownTimer", "Canceled");
        Deferred deferred = this.timerDeferred;
        if (deferred != null) {
            Job.a.a(deferred, null, 1, null);
        }
    }
}
