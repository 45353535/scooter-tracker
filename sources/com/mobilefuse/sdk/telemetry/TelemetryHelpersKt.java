package com.mobilefuse.sdk.telemetry;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000e\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007\u001a\u0019\u0010(\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\u0010,\u001a\u0006\u0010-\u001a\u00020.\u001a\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.\u001a&\u00103\u001a\b\u0012\u0004\u0012\u00020\b04*\u00020\u00102\b\b\u0002\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u001a\u0012\u00109\u001a\u00020.*\u00020\u00102\u0006\u0010:\u001a\u00020\b\u001a\"\u0010;\u001a\u0004\u0018\u00010\b*\u00020\u00102\b\b\u0002\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u001a\u0014\u0010<\u001a\u0004\u0018\u00010\b*\u00020\u00102\u0006\u0010=\u001a\u00020\f\u001a\u0014\u0010>\u001a\u0004\u0018\u00010\u0002*\u00020\b2\u0006\u0010=\u001a\u00020\f\u001a\n\u0010?\u001a\u00020@*\u00020\b\u001a\u0015\u0010A\u001a\u00020\u0007*\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0086\u0004\u001a\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000b\u001a\u00020\u0007*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\b*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0013\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0016\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0007*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001c\u001a\u00020\b*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010\u001f\u001a\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010\"\u001a\u00020#*\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006D"}, d2 = {"beautifyValue", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "getBeautifyValue", "(Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;)Ljava/lang/Object;", "breadcrumbExtras", "", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "getBreadcrumbExtras", "(Lcom/mobilefuse/sdk/telemetry/TelemetryAction;)Ljava/util/Map;", "escapedName", "Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "getEscapedName", "(Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;)Ljava/lang/String;", "lastHttpResponseAction", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionReceiver;", "getLastHttpResponseAction", "(Lcom/mobilefuse/sdk/telemetry/TelemetryActionReceiver;)Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "logTime", "getLogTime", "(Lcom/mobilefuse/sdk/telemetry/TelemetryAction;)Ljava/lang/String;", "logs", "getLogs", "stackTraceLog", "", "getStackTraceLog", "(Ljava/lang/Throwable;)Ljava/lang/String;", "telemetryAction", "getTelemetryAction", "(Ljava/lang/Throwable;)Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "telemetryActionSender", "getTelemetryActionSender", "(Ljava/lang/Object;)Ljava/lang/String;", "timestampDate", "Ljava/util/Date;", "getTimestampDate", "(Lcom/mobilefuse/sdk/telemetry/TelemetryAction;)Ljava/util/Date;", "beautifyJsonValue", "value", "formatStackTrace", "stackTrace", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "getCurrentTimeMillis", "", "getTimeDiffSeconds", "", "startMillis", "endMillis", "getActions", "", "logLevel", "Lcom/mobilefuse/sdk/telemetry/LogLevel;", "actionType", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "getHttpActionRequestTime", "responseAction", "getLastAction", "getLastActionWithParamOrNull", "paramType", "getLastParamOrNull", "logBreadcrumb", "", "logTimeSince", "earlierAction", "sanitizeVersionNames", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class TelemetryHelpersKt {
    @NotNull
    public static final String beautifyJsonValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (value.length() == 0) {
                return value;
            }
            String string = new JSONObject(value).toString(4);
            Intrinsics.checkNotNullExpressionValue(string, "json.toString(4)");
            return string;
        } catch (Throwable unused) {
            return value;
        }
    }

    @NotNull
    public static final String formatStackTrace(@NotNull StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        return ArraysKt.joinToString$default(stackTrace, IOUtils.LINE_SEPARATOR_UNIX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<StackTraceElement, CharSequence>() { // from class: com.mobilefuse.sdk.telemetry.TelemetryHelpersKt.formatStackTrace.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull StackTraceElement data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return ' ' + data.getClassName() + '.' + data.getMethodName() + " (" + data.getFileName() + ':' + data.getLineNumber() + ") ";
            }
        }, 30, (Object) null);
    }

    @NotNull
    public static final List<TelemetryAction> getActions(@NotNull TelemetryActionReceiver getActions, @NotNull LogLevel logLevel, @Nullable TelemetryActionType telemetryActionType) {
        Intrinsics.checkNotNullParameter(getActions, "$this$getActions");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        ArrayList arrayList = new ArrayList();
        for (TelemetryAction telemetryAction : getActions.getActions()) {
            if (LogLevelKt.contains(telemetryAction.getLogLevel(), logLevel) && (telemetryActionType == null || TelemetryDataModelKt.isTheSameActionType(telemetryAction.getType(), telemetryActionType))) {
                arrayList.add(telemetryAction);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List getActions$default(TelemetryActionReceiver telemetryActionReceiver, LogLevel logLevel, TelemetryActionType telemetryActionType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            logLevel = LogLevel.INFO;
        }
        if ((i10 & 2) != 0) {
            telemetryActionType = null;
        }
        return getActions(telemetryActionReceiver, logLevel, telemetryActionType);
    }

    @NotNull
    public static final Object getBeautifyValue(@NotNull TelemetryActionParam beautifyValue) {
        Intrinsics.checkNotNullParameter(beautifyValue, "$this$beautifyValue");
        return !(beautifyValue.getValue() instanceof String) ? beautifyValue.getValue() : beautifyValue.getType() == TelemetryBaseParamType.BODY ? beautifyJsonValue(beautifyValue.getValue().toString()) : beautifyValue.getValue();
    }

    @NotNull
    public static final Map<String, Object> getBreadcrumbExtras(@NotNull TelemetryAction breadcrumbExtras) {
        Intrinsics.checkNotNullParameter(breadcrumbExtras, "$this$breadcrumbExtras");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TelemetryActionParam telemetryActionParam : breadcrumbExtras.getExtras()) {
            if (telemetryActionParam.getIncludeToBreadcrumb()) {
                try {
                    linkedHashMap.put(telemetryActionParam.getType().getValue(), telemetryActionParam.getValue());
                } catch (Throwable unused) {
                }
            }
        }
        return linkedHashMap;
    }

    public static final long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final String getEscapedName(@NotNull TelemetryParamType escapedName) {
        Intrinsics.checkNotNullParameter(escapedName, "$this$escapedName");
        return "[[" + escapedName + "]]";
    }

    public static final long getHttpActionRequestTime(@NotNull TelemetryActionReceiver getHttpActionRequestTime, @NotNull TelemetryAction responseAction) {
        Intrinsics.checkNotNullParameter(getHttpActionRequestTime, "$this$getHttpActionRequestTime");
        Intrinsics.checkNotNullParameter(responseAction, "responseAction");
        TelemetryActionParam lastParamOrNull = getLastParamOrNull(responseAction, TelemetryBaseParamType.REQUEST_ACTION_INSTANCE);
        Object value = lastParamOrNull != null ? lastParamOrNull.getValue() : null;
        if (value == null || !(value instanceof TelemetryAction)) {
            return -1L;
        }
        return responseAction.getTimestamp() - ((TelemetryAction) value).getTimestamp();
    }

    @Nullable
    public static final TelemetryAction getLastAction(@NotNull TelemetryActionReceiver getLastAction, @NotNull LogLevel logLevel, @Nullable TelemetryActionType telemetryActionType) {
        Intrinsics.checkNotNullParameter(getLastAction, "$this$getLastAction");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return (TelemetryAction) CollectionsKt.lastOrNull((List) getActions(getLastAction, logLevel, telemetryActionType));
    }

    public static /* synthetic */ TelemetryAction getLastAction$default(TelemetryActionReceiver telemetryActionReceiver, LogLevel logLevel, TelemetryActionType telemetryActionType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            logLevel = LogLevel.INFO;
        }
        if ((i10 & 2) != 0) {
            telemetryActionType = null;
        }
        return getLastAction(telemetryActionReceiver, logLevel, telemetryActionType);
    }

    @Nullable
    public static final TelemetryAction getLastActionWithParamOrNull(@NotNull TelemetryActionReceiver getLastActionWithParamOrNull, @NotNull TelemetryParamType paramType) {
        Intrinsics.checkNotNullParameter(getLastActionWithParamOrNull, "$this$getLastActionWithParamOrNull");
        Intrinsics.checkNotNullParameter(paramType, "paramType");
        for (TelemetryAction telemetryAction : CollectionsKt.asReversed(getLastActionWithParamOrNull.getActions())) {
            if (getLastParamOrNull(telemetryAction, paramType) != null) {
                return telemetryAction;
            }
        }
        return null;
    }

    @Nullable
    public static final TelemetryAction getLastHttpResponseAction(@NotNull TelemetryActionReceiver lastHttpResponseAction) {
        Intrinsics.checkNotNullParameter(lastHttpResponseAction, "$this$lastHttpResponseAction");
        return getLastActionWithParamOrNull(lastHttpResponseAction, TelemetryBaseParamType.REQUEST_ACTION_INSTANCE);
    }

    @Nullable
    public static final TelemetryActionParam getLastParamOrNull(@NotNull TelemetryAction getLastParamOrNull, @NotNull TelemetryParamType paramType) {
        TelemetryActionParam telemetryActionParamPrevious;
        Intrinsics.checkNotNullParameter(getLastParamOrNull, "$this$getLastParamOrNull");
        Intrinsics.checkNotNullParameter(paramType, "paramType");
        List<TelemetryActionParam> extras = getLastParamOrNull.getExtras();
        ListIterator<TelemetryActionParam> listIterator = extras.listIterator(extras.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                telemetryActionParamPrevious = null;
                break;
            }
            telemetryActionParamPrevious = listIterator.previous();
            if (Intrinsics.areEqual(telemetryActionParamPrevious.getType(), paramType)) {
                break;
            }
        }
        return telemetryActionParamPrevious;
    }

    @NotNull
    public static final String getLogTime(@NotNull TelemetryAction logTime) {
        Intrinsics.checkNotNullParameter(logTime, "$this$logTime");
        return logTimeSince(logTime, Telemetry.INSTANCE.getAppLaunchAction());
    }

    @NotNull
    public static final String getLogs(@NotNull TelemetryAction logs) {
        Intrinsics.checkNotNullParameter(logs, "$this$logs");
        String logExtraMessage = logs.getType().getLogExtraMessage();
        if (logExtraMessage.length() == 0) {
            logExtraMessage = logs.getType().getMessage();
        }
        String strW = logExtraMessage;
        String str = "";
        for (TelemetryActionParam telemetryActionParam : logs.getExtras()) {
            if (telemetryActionParam.getType().getPrintInLogs()) {
                if (StringsKt.v0(strW, getEscapedName(telemetryActionParam.getType()), 0, false, 6, null) >= 0) {
                    strW = StringsKt.W(strW, getEscapedName(telemetryActionParam.getType()), getBeautifyValue(telemetryActionParam).toString(), false, 4, null);
                } else if (logs.getType().getIncludeImplicitParamsInLogs()) {
                    str = str + "\n    + " + telemetryActionParam.getType().getValue() + " = " + getBeautifyValue(telemetryActionParam);
                }
            }
        }
        String strReplace = new Regex("\\[\\[(.*?)\\]\\]").replace(strW, "");
        if (str.length() <= 0) {
            return strReplace;
        }
        return strReplace + str;
    }

    @NotNull
    public static final String getStackTraceLog(@NotNull Throwable stackTraceLog) {
        Intrinsics.checkNotNullParameter(stackTraceLog, "$this$stackTraceLog");
        StringWriter stringWriter = new StringWriter();
        stackTraceLog.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "with(StringWriter()) {\n …\n        toString()\n    }");
        return string;
    }

    @NotNull
    public static final TelemetryAction getTelemetryAction(@NotNull Throwable telemetryAction) {
        Intrinsics.checkNotNullParameter(telemetryAction, "$this$telemetryAction");
        return new TelemetryAction(getTelemetryActionSender(telemetryAction), TelemetryBaseActionType.ACTION_EXCEPTION, CollectionsKt.mutableListOf(new TelemetryActionParam(TelemetryBaseParamType.EXCEPTION_DETAILS, getStackTraceLog(telemetryAction), false, 4, null)), LogLevel.ERROR, 0L, 16, null);
    }

    @NotNull
    public static final String getTelemetryActionSender(@NotNull Object telemetryActionSender) {
        Intrinsics.checkNotNullParameter(telemetryActionSender, "$this$telemetryActionSender");
        try {
            String name = !Telemetry.INSTANCE.getStoreActionsEnabled() ? "unknown source" : telemetryActionSender instanceof String ? (String) telemetryActionSender : (!(telemetryActionSender instanceof Class) || ((Class) telemetryActionSender).getSimpleName().length() == 0) ? telemetryActionSender.getClass().getSimpleName().length() == 0 ? telemetryActionSender.getClass().getName() : telemetryActionSender.getClass().getSimpleName() : ((Class) telemetryActionSender).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(name, "if (!Telemetry.storeActi…unknown source\"\n        }");
            return name;
        } catch (Throwable unused) {
            return "unknown source";
        }
    }

    public static final float getTimeDiffSeconds(long j10, long j11) {
        return (j11 - j10) / 1000.0f;
    }

    @NotNull
    public static final Date getTimestampDate(@NotNull TelemetryAction timestampDate) {
        Intrinsics.checkNotNullParameter(timestampDate, "$this$timestampDate");
        return new Date(timestampDate.getTimestamp());
    }

    public static final void logBreadcrumb(@NotNull TelemetryAction logBreadcrumb) {
        Intrinsics.checkNotNullParameter(logBreadcrumb, "$this$logBreadcrumb");
        try {
            if (logBreadcrumb.getType().getEnabledBreadcrumbSending()) {
                TelemetryManager.INSTANCE.logBreadcrumb(logBreadcrumb.getType().getCategory(), logBreadcrumb.getType().getMessage(), getBreadcrumbExtras(logBreadcrumb), logBreadcrumb.getLogLevel(), logBreadcrumb.getType().getLogExtraMessage());
            }
        } catch (Throwable unused) {
        }
    }

    @NotNull
    public static final String logTimeSince(@NotNull TelemetryAction logTimeSince, @NotNull TelemetryAction earlierAction) {
        Intrinsics.checkNotNullParameter(logTimeSince, "$this$logTimeSince");
        Intrinsics.checkNotNullParameter(earlierAction, "earlierAction");
        String str = TelemetryHelpers.INSTANCE.getTimeLogFormat().format(new Date(logTimeSince.getTimestamp() - earlierAction.getTimestamp()));
        Intrinsics.checkNotNullExpressionValue(str, "TelemetryHelpers.timeLog…earlierAction.timestamp))");
        return str;
    }

    @NotNull
    public static final Map<String, String> sanitizeVersionNames(@NotNull Map<String, String> sanitizeVersionNames) {
        Intrinsics.checkNotNullParameter(sanitizeVersionNames, "$this$sanitizeVersionNames");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(sanitizeVersionNames.size()));
        Iterator<T> it = sanitizeVersionNames.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String strP0 = (String) entry.getValue();
            if (StringsKt.a0(strP0, "v", false, 2, null)) {
                strP0 = StringsKt.P0(strP0, "v");
            }
            linkedHashMap.put(key, strP0);
        }
        return linkedHashMap;
    }
}
