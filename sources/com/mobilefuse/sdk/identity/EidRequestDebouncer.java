package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\bR<\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010\b\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidRequestDebouncer;", "", "", "debounceDelayMillis", "<init>", "(J)V", "", "clearCurrentTask", "()V", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "eidData", "", "Lcom/mobilefuse/sdk/identity/IdentifierUpdateSignal;", "sdkSignals", "debounceEidUpdate", "(Lcom/mobilefuse/sdk/identity/EidSdkData;Ljava/util/Set;)V", "callSdkStateChangedOnProviders$mobilefuse_sdk_core_release", "callSdkStateChangedOnProviders", "Lkotlin/Function2;", "onEidRequest", "Lkotlin/jvm/functions/Function2;", "getOnEidRequest", "()Lkotlin/jvm/functions/Function2;", "setOnEidRequest", "(Lkotlin/jvm/functions/Function2;)V", "awaitingEidData", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "", "awaitingUpdateSignals", "Ljava/util/Set;", "Ljava/lang/Runnable;", "activeDebouceTask", "Ljava/lang/Runnable;", "getActiveDebouceTask$mobilefuse_sdk_core_release", "()Ljava/lang/Runnable;", "setActiveDebouceTask$mobilefuse_sdk_core_release", "(Ljava/lang/Runnable;)V", "getActiveDebouceTask$mobilefuse_sdk_core_release$annotations", "J", "getDebounceDelayMillis", "()J", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class EidRequestDebouncer {

    @Nullable
    private Runnable activeDebouceTask;
    private EidSdkData awaitingEidData;
    private final Set<IdentifierUpdateSignal> awaitingUpdateSignals;
    private final long debounceDelayMillis;

    @Nullable
    private Function2<? super EidSdkData, ? super Set<? extends IdentifierUpdateSignal>, Unit> onEidRequest;

    public EidRequestDebouncer() {
        this(0L, 1, null);
    }

    private final void clearCurrentTask() {
        Runnable runnable = this.activeDebouceTask;
        if (runnable != null) {
            SchedulersKt.getGlobalHandler().removeCallbacks(runnable);
        }
        this.activeDebouceTask = null;
    }

    @VisibleForTesting
    public static /* synthetic */ void getActiveDebouceTask$mobilefuse_sdk_core_release$annotations() {
    }

    @VisibleForTesting
    public final void callSdkStateChangedOnProviders$mobilefuse_sdk_core_release() {
        Set set = CollectionsKt.toSet(this.awaitingUpdateSignals);
        this.awaitingUpdateSignals.clear();
        EidSdkData eidSdkData = this.awaitingEidData;
        if (eidSdkData == null) {
            return;
        }
        this.awaitingEidData = null;
        this.activeDebouceTask = null;
        Function2<? super EidSdkData, ? super Set<? extends IdentifierUpdateSignal>, Unit> function2 = this.onEidRequest;
        if (function2 != null) {
            function2.invoke(eidSdkData, set);
        }
    }

    public final void debounceEidUpdate(@NotNull EidSdkData eidData, @NotNull Set<? extends IdentifierUpdateSignal> sdkSignals) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(sdkSignals, "sdkSignals");
        clearCurrentTask();
        CollectionsKt.addAll(this.awaitingUpdateSignals, sdkSignals);
        this.awaitingEidData = eidData;
        Runnable runnable = new Runnable() { // from class: com.mobilefuse.sdk.identity.EidRequestDebouncer$debounceEidUpdate$task$1
            @Override // java.lang.Runnable
            public final void run() {
                EidRequestDebouncer eidRequestDebouncer = this.this$0;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    eidRequestDebouncer.callSdkStateChangedOnProviders$mobilefuse_sdk_core_release();
                } catch (Throwable th2) {
                    int i10 = EidRequestDebouncer$debounceEidUpdate$task$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }
        };
        this.activeDebouceTask = runnable;
        SchedulersKt.getGlobalHandler().postDelayed(runnable, this.debounceDelayMillis);
    }

    @Nullable
    /* JADX INFO: renamed from: getActiveDebouceTask$mobilefuse_sdk_core_release, reason: from getter */
    public final Runnable getActiveDebouceTask() {
        return this.activeDebouceTask;
    }

    public final long getDebounceDelayMillis() {
        return this.debounceDelayMillis;
    }

    @Nullable
    public final Function2<EidSdkData, Set<? extends IdentifierUpdateSignal>, Unit> getOnEidRequest() {
        return this.onEidRequest;
    }

    public final void setActiveDebouceTask$mobilefuse_sdk_core_release(@Nullable Runnable runnable) {
        this.activeDebouceTask = runnable;
    }

    public final void setOnEidRequest(@Nullable Function2<? super EidSdkData, ? super Set<? extends IdentifierUpdateSignal>, Unit> function2) {
        this.onEidRequest = function2;
    }

    public EidRequestDebouncer(long j10) {
        this.debounceDelayMillis = j10;
        this.awaitingUpdateSignals = new LinkedHashSet();
    }

    public /* synthetic */ EidRequestDebouncer(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1000L : j10);
    }
}
