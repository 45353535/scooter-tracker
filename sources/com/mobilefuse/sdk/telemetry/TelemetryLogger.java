package com.mobilefuse.sdk.telemetry;

import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryLogger;", "", "()V", y.f66058y, "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class TelemetryLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0007J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0007¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryLogger$Companion;", "", "()V", "getLogs", "", "logLevel", "Lcom/mobilefuse/sdk/telemetry/LogLevel;", "actionsFactory", "Lkotlin/Function1;", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "getLongestActionSenderNameLength", "", "actions", "getTimedStampedLogs", "Lcom/mobilefuse/sdk/telemetry/TimedStampedLog;", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ String getLogs$default(Companion companion, LogLevel logLevel, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                logLevel = LogLevel.INFO;
            }
            if ((i10 & 2) != 0) {
                function1 = null;
            }
            return companion.getLogs(logLevel, function1);
        }

        private final int getLongestActionSenderNameLength(List<TelemetryAction> actions) {
            int length = 0;
            for (TelemetryAction telemetryAction : actions) {
                if (telemetryAction.getSender().length() > length) {
                    length = telemetryAction.getSender().length();
                }
            }
            return length;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List getTimedStampedLogs$default(Companion companion, LogLevel logLevel, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                logLevel = LogLevel.DEBUG;
            }
            if ((i10 & 2) != 0) {
                function1 = null;
            }
            return companion.getTimedStampedLogs(logLevel, function1);
        }

        @NotNull
        public final String getLogs() {
            return getLogs$default(this, null, null, 3, null);
        }

        @NotNull
        public final List<TimedStampedLog> getTimedStampedLogs(@NotNull LogLevel logLevel, @Nullable Function1<? super LogLevel, ? extends List<TelemetryAction>> actionsFactory) {
            List<TelemetryAction> actions$default;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            ArrayList arrayList = new ArrayList();
            if (actionsFactory == null || (actions$default = actionsFactory.invoke(logLevel)) == null) {
                actions$default = TelemetryHelpersKt.getActions$default(Telemetry.INSTANCE, logLevel, null, 2, null);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());
            String str = "%-" + getLongestActionSenderNameLength(actions$default) + "s";
            for (TelemetryAction telemetryAction : actions$default) {
                if (telemetryAction.getType().getIncludeInLogsPrinting()) {
                    Date timestampDate = TelemetryHelpersKt.getTimestampDate(telemetryAction);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(simpleDateFormat.format(TelemetryHelpersKt.getTimestampDate(telemetryAction)));
                    sb2.append(" | ");
                    sb2.append(telemetryAction.getLogLevel());
                    sb2.append(" | ");
                    sb2.append(TelemetryHelpersKt.getLogTime(telemetryAction));
                    sb2.append(" | [");
                    a1 a1Var = a1.f93282a;
                    String str2 = String.format(str, Arrays.copyOf(new Object[]{telemetryAction.getSender()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                    sb2.append(str2);
                    sb2.append(C4240b4.j.f42674e);
                    sb2.append(" ");
                    sb2.append(TelemetryHelpersKt.getLogs(telemetryAction));
                    sb2.append("\n\n");
                    arrayList.add(new TimedStampedLog(timestampDate, sb2.toString()));
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getLogs(@NotNull LogLevel logLevel) {
            return getLogs$default(this, logLevel, null, 2, null);
        }

        @NotNull
        public final String getLogs(@NotNull LogLevel logLevel, @Nullable Function1<? super LogLevel, ? extends List<TelemetryAction>> actionsFactory) {
            List<TelemetryAction> actions$default;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            if (actionsFactory == null || (actions$default = actionsFactory.invoke(logLevel)) == null) {
                actions$default = TelemetryHelpersKt.getActions$default(Telemetry.INSTANCE, logLevel, null, 2, null);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());
            String str = "%-" + getLongestActionSenderNameLength(actions$default) + "s";
            String string = "";
            for (TelemetryAction telemetryAction : actions$default) {
                if (telemetryAction.getType().getIncludeInLogsPrinting()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(simpleDateFormat.format(TelemetryHelpersKt.getTimestampDate(telemetryAction)));
                    sb2.append(" | ");
                    sb2.append(telemetryAction.getLogLevel());
                    sb2.append(" | ");
                    sb2.append(TelemetryHelpersKt.getLogTime(telemetryAction));
                    sb2.append(" | [");
                    a1 a1Var = a1.f93282a;
                    String str2 = String.format(str, Arrays.copyOf(new Object[]{telemetryAction.getSender()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                    sb2.append(str2);
                    sb2.append(C4240b4.j.f42674e);
                    sb2.append(" ");
                    sb2.append(TelemetryHelpersKt.getLogs(telemetryAction));
                    sb2.append("\n\n");
                    string = sb2.toString();
                }
            }
            return string;
        }
    }

    @NotNull
    public static final String getLogs() {
        return Companion.getLogs$default(INSTANCE, null, null, 3, null);
    }

    @NotNull
    public static final List<TimedStampedLog> getTimedStampedLogs(@NotNull LogLevel logLevel, @Nullable Function1<? super LogLevel, ? extends List<TelemetryAction>> function1) {
        return INSTANCE.getTimedStampedLogs(logLevel, function1);
    }

    @NotNull
    public static final String getLogs(@NotNull LogLevel logLevel) {
        return Companion.getLogs$default(INSTANCE, logLevel, null, 2, null);
    }

    @NotNull
    public static final String getLogs(@NotNull LogLevel logLevel, @Nullable Function1<? super LogLevel, ? extends List<TelemetryAction>> function1) {
        return INSTANCE.getLogs(logLevel, function1);
    }
}
