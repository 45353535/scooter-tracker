package com.mobilefuse.sdk.telemetry.loggers;

import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.mobilefuse.sdk.telemetry.TelemetryHelpersKt;
import com.mobilefuse.sdk.telemetry.mfxlogs.EventTypes;
import com.mobilefuse.sdk.telemetry.mfxlogs.TelemetryEventsMfxImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b-J\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u000200J\r\u00101\u001a\u00020,H\u0000¢\u0006\u0002\b2J\u000e\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\u0016J\b\u00105\u001a\u00020,H\u0002J\u001e\u00106\u001a\u00020,2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208J.\u0010;\u001a\u00020,2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002000=2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002000=J\b\u0010?\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\"8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R$\u0010$\u001a\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u0002\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006@"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/LogsHandler;", "Lcom/mobilefuse/sdk/telemetry/loggers/BaseSampleRate;", "()V", "JOB_TIME_TO_CHECK_LOGS", "", "TIME_DEBOUNCE", "TIME_TO_DELETE_LOGS", "", "getTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release$annotations", "getTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release", "()I", "setTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release", "(I)V", "debouncer", "Lcom/mobilefuse/sdk/telemetry/loggers/TelemetryDebouncer;", "getDebouncer$mobilefuse_sdk_telemetry_release$annotations", "getDebouncer$mobilefuse_sdk_telemetry_release", "()Lcom/mobilefuse/sdk/telemetry/loggers/TelemetryDebouncer;", "setDebouncer$mobilefuse_sdk_telemetry_release", "(Lcom/mobilefuse/sdk/telemetry/loggers/TelemetryDebouncer;)V", "eventLogs", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "getEventLogs$mobilefuse_sdk_telemetry_release$annotations", "getEventLogs$mobilefuse_sdk_telemetry_release", "()Ljava/util/List;", "eventsAreProcessing", "", "getEventsAreProcessing$mobilefuse_sdk_telemetry_release$annotations", "getEventsAreProcessing$mobilefuse_sdk_telemetry_release", "()Z", "setEventsAreProcessing$mobilefuse_sdk_telemetry_release", "(Z)V", "telemetryEventList", "", "getTelemetryEventList", "telemetryEventsMfxImpl", "Lcom/mobilefuse/sdk/telemetry/mfxlogs/TelemetryEventsMfxImpl;", "getTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release$annotations", "getTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release", "()Lcom/mobilefuse/sdk/telemetry/mfxlogs/TelemetryEventsMfxImpl;", "setTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release", "(Lcom/mobilefuse/sdk/telemetry/mfxlogs/TelemetryEventsMfxImpl;)V", "debounceMfxLog", "", "debounceMfxLog$mobilefuse_sdk_telemetry_release", "enableAndSendEventsImmediately", "getSessionId", "", "removeLogs", "removeLogs$mobilefuse_sdk_telemetry_release", "reportBreadcrumb", "breadcrumb", "reportEvents", "reportSampleRateBreadcrumb", "exceptionsSampleRate", "", "logsSampleRate", "metricsSampleRate", "reportSessionStarted", "modules", "", "variables", "startDeleteLogsRunnable", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class LogsHandler extends BaseSampleRate {
    private boolean eventsAreProcessing;

    @NotNull
    private final List<TelemetryBreadcrumb> eventLogs = new ArrayList();

    @NotNull
    private TelemetryEventsMfxImpl telemetryEventsMfxImpl = new TelemetryEventsMfxImpl();
    private final long JOB_TIME_TO_CHECK_LOGS = 60000;
    private final long TIME_DEBOUNCE = 30000;
    private int TIME_TO_DELETE_LOGS = Constants.THIRTY_MINUTES;

    @NotNull
    private TelemetryDebouncer debouncer = new TelemetryDebouncer(30000);

    /* JADX INFO: renamed from: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$startDeleteLogsRunnable$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f93236a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.mobilefuse.sdk.telemetry.loggers.LogsHandler$startDeleteLogsRunnable$1$deleteRunnable$1, java.lang.Runnable] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final ?? r02 = new Runnable() { // from class: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$startDeleteLogsRunnable$1$deleteRunnable$1
                @Override // java.lang.Runnable
                public void run() {
                    LogsHandler.this.removeLogs$mobilefuse_sdk_telemetry_release();
                    SchedulersKt.getGlobalHandler().postDelayed(this, LogsHandler.this.JOB_TIME_TO_CHECK_LOGS);
                }
            };
            SchedulersKt.getGlobalHandler().post(r02);
            AppLifecycleHelper.addActivityLifecycleObserver(new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$startDeleteLogsRunnable$1$activityLifecycleObserver$1
                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onApplicationInBackground() {
                    SchedulersKt.getGlobalHandler().removeCallbacks(r02);
                }

                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onApplicationInForeground() {
                    SchedulersKt.getGlobalHandler().post(r02);
                }
            });
        }
    }

    public LogsHandler() {
        startDeleteLogsRunnable();
    }

    @VisibleForTesting
    public static /* synthetic */ void getDebouncer$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEventLogs$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEventsAreProcessing$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportEvents() {
        List<TelemetryBreadcrumb> list = this.eventLogs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((TelemetryBreadcrumb) obj).getWasReported()) {
                arrayList.add(obj);
            }
        }
        List<? extends TelemetryBreadcrumb> list2 = CollectionsKt.toList(arrayList);
        if (list2.isEmpty()) {
            return;
        }
        this.telemetryEventsMfxImpl.reportEvents(list2);
        this.eventsAreProcessing = false;
    }

    private final void startDeleteLogsRunnable() {
        SchedulersKt.safelyRunOnBgThread$default(null, new AnonymousClass1(), 1, null);
    }

    public final void debounceMfxLog$mobilefuse_sdk_telemetry_release() {
        if (!getShouldTransmitToServer()) {
            this.eventsAreProcessing = false;
            return;
        }
        try {
            this.debouncer.debounce(new Function0<Unit>() { // from class: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$debounceMfxLog$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.reportEvents();
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void enableAndSendEventsImmediately() {
        setShouldTransmitToServer(true);
        this.eventsAreProcessing = true;
        reportEvents();
    }

    @NotNull
    /* JADX INFO: renamed from: getDebouncer$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final TelemetryDebouncer getDebouncer() {
        return this.debouncer;
    }

    @NotNull
    public final List<TelemetryBreadcrumb> getEventLogs$mobilefuse_sdk_telemetry_release() {
        return this.eventLogs;
    }

    /* JADX INFO: renamed from: getEventsAreProcessing$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final boolean getEventsAreProcessing() {
        return this.eventsAreProcessing;
    }

    @NotNull
    public final String getSessionId() {
        if (!getShouldTransmitToServer()) {
            return "";
        }
        String string = this.telemetryEventsMfxImpl.getUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string, "telemetryEventsMfxImpl.getSessionId().toString()");
        return string;
    }

    /* JADX INFO: renamed from: getTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final int getTIME_TO_DELETE_LOGS() {
        return this.TIME_TO_DELETE_LOGS;
    }

    @NotNull
    public final List<TelemetryBreadcrumb> getTelemetryEventList() {
        return CollectionsKt.toList(this.eventLogs);
    }

    @NotNull
    /* JADX INFO: renamed from: getTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final TelemetryEventsMfxImpl getTelemetryEventsMfxImpl() {
        return this.telemetryEventsMfxImpl;
    }

    public final void removeLogs$mobilefuse_sdk_telemetry_release() {
        try {
            CollectionsKt.removeAll((List) this.eventLogs, (Function1) new Function1<TelemetryBreadcrumb, Boolean>() { // from class: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$removeLogs$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(TelemetryBreadcrumb telemetryBreadcrumb) {
                    return Boolean.valueOf(invoke2(telemetryBreadcrumb));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(@NotNull TelemetryBreadcrumb it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.this$0.getTelemetryEventsMfxImpl().getCurrentTimeMillis() - it.getTimestamp() >= ((long) this.this$0.getTIME_TO_DELETE_LOGS());
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void reportBreadcrumb(@NotNull TelemetryBreadcrumb breadcrumb) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        this.eventLogs.add(breadcrumb);
        if (this.eventsAreProcessing) {
            return;
        }
        this.eventsAreProcessing = true;
        debounceMfxLog$mobilefuse_sdk_telemetry_release();
    }

    public final void reportSampleRateBreadcrumb(double exceptionsSampleRate, double logsSampleRate, double metricsSampleRate) {
        reportBreadcrumb(new TelemetryBreadcrumb("Telemetry sample rates were set to " + exceptionsSampleRate + " for exceptions, " + logsSampleRate + " for logs, " + metricsSampleRate + " for metrics", TelemetryCategory.TELEMETRY, MapsKt.mapOf(TuplesKt.to("telemetry.samplerate.exceptions", Double.valueOf(exceptionsSampleRate)), TuplesKt.to("telemetry.samplerate.logs", Double.valueOf(logsSampleRate)), TuplesKt.to("telemetry.samplerate.metrics", Double.valueOf(metricsSampleRate))), 0L, null, EventTypes.SAMPLE_RATE.getValue(), false, 88, null));
    }

    public final void reportSessionStarted(@NotNull Map<String, String> modules, @NotNull Map<String, String> variables) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(variables, "variables");
        this.telemetryEventsMfxImpl.createInitialLog(modules, TelemetryHelpersKt.sanitizeVersionNames(variables));
    }

    public final void setDebouncer$mobilefuse_sdk_telemetry_release(@NotNull TelemetryDebouncer telemetryDebouncer) {
        Intrinsics.checkNotNullParameter(telemetryDebouncer, "<set-?>");
        this.debouncer = telemetryDebouncer;
    }

    public final void setEventsAreProcessing$mobilefuse_sdk_telemetry_release(boolean z10) {
        this.eventsAreProcessing = z10;
    }

    public final void setTIME_TO_DELETE_LOGS$mobilefuse_sdk_telemetry_release(int i10) {
        this.TIME_TO_DELETE_LOGS = i10;
    }

    public final void setTelemetryEventsMfxImpl$mobilefuse_sdk_telemetry_release(@NotNull TelemetryEventsMfxImpl telemetryEventsMfxImpl) {
        Intrinsics.checkNotNullParameter(telemetryEventsMfxImpl, "<set-?>");
        this.telemetryEventsMfxImpl = telemetryEventsMfxImpl;
    }
}
