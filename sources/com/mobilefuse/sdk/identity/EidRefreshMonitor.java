package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.internal.IntervalTaskRunner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0005R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidRefreshMonitor;", "", "()V", "onTimeout", "Lkotlin/Function0;", "", "getOnTimeout", "()Lkotlin/jvm/functions/Function0;", "setOnTimeout", "(Lkotlin/jvm/functions/Function0;)V", "taskRunner", "Lcom/mobilefuse/sdk/internal/IntervalTaskRunner;", "onTaskRunnerComplete", "start", "", "timeoutTimestamp", "", "onlyFutureAllowed", AtomManager.ATOM_STOP_METHOD_NAME, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class EidRefreshMonitor {

    @Nullable
    private Function0<Unit> onTimeout;
    private IntervalTaskRunner taskRunner;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.identity.EidRefreshMonitor$start$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
    static final /* synthetic */ class AnonymousClass1 extends y implements Function0<Unit> {
        AnonymousClass1(EidRefreshMonitor eidRefreshMonitor) {
            super(0, eidRefreshMonitor, EidRefreshMonitor.class, "onTaskRunnerComplete", "onTaskRunnerComplete()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Throwable {
            ((EidRefreshMonitor) this.receiver).onTaskRunnerComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTaskRunnerComplete() throws Throwable {
        stop();
        Function0<Unit> function0 = this.onTimeout;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ boolean start$default(EidRefreshMonitor eidRefreshMonitor, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return eidRefreshMonitor.start(j10, z10);
    }

    @Nullable
    public final Function0<Unit> getOnTimeout() {
        return this.onTimeout;
    }

    public final void setOnTimeout(@Nullable Function0<Unit> function0) {
        this.onTimeout = function0;
    }

    public final boolean start(long timeoutTimestamp, boolean onlyFutureAllowed) throws Throwable {
        stop();
        if (timeoutTimestamp <= 0) {
            return false;
        }
        if (onlyFutureAllowed && timeoutTimestamp <= System.currentTimeMillis()) {
            return false;
        }
        long jCurrentTimeMillis = timeoutTimestamp - System.currentTimeMillis();
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        IntervalTaskRunner intervalTaskRunner = new IntervalTaskRunner(jCurrentTimeMillis, false, new IntervalTaskRunner.Listener() { // from class: com.mobilefuse.sdk.identity.EidRefreshMonitor$sam$com_mobilefuse_sdk_internal_IntervalTaskRunner_Listener$0
            @Override // com.mobilefuse.sdk.internal.IntervalTaskRunner.Listener
            public final /* synthetic */ void onTaskRun() {
                Intrinsics.checkNotNullExpressionValue(anonymousClass1.invoke(), "invoke(...)");
            }
        });
        intervalTaskRunner.setRunInBackground(false);
        intervalTaskRunner.start();
        Unit unit = Unit.f93236a;
        this.taskRunner = intervalTaskRunner;
        return true;
    }

    public final void stop() throws Throwable {
        IntervalTaskRunner intervalTaskRunner = this.taskRunner;
        if (intervalTaskRunner != null) {
            intervalTaskRunner.reset();
        }
        this.taskRunner = null;
    }
}
