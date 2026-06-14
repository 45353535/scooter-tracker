package com.mobilefuse.sdk.telemetry.implementations.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"!\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"jsonWithStringValues", "Lorg/json/JSONObject;", "", "", "", "getJsonWithStringValues", "(Ljava/util/Map;)Lorg/json/JSONObject;", "sentryException", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;", "", "getSentryException", "(Ljava/lang/Throwable;)Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;", "sentryFrames", "", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackFrame;", "getSentryFrames", "(Ljava/lang/Throwable;)Ljava/util/List;", "sentryStackTrace", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackTrace;", "getSentryStackTrace", "(Ljava/lang/Throwable;)Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackTrace;", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class SentryHelpersKt {
    @NotNull
    public static final JSONObject getJsonWithStringValues(@NotNull Map<String, ? extends Object> jsonWithStringValues) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonWithStringValues, "$this$jsonWithStringValues");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : jsonWithStringValues.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().toString());
        }
        return jSONObject;
    }

    @NotNull
    public static final SentryException getSentryException(@NotNull Throwable sentryException) {
        String name;
        String str;
        Intrinsics.checkNotNullParameter(sentryException, "$this$sentryException");
        Package r02 = sentryException.getClass().getPackage();
        if (r02 == null || (name = r02.getName()) == null) {
            name = "";
        }
        if (name.length() > 0) {
            str = name + '.';
        } else {
            str = "";
        }
        String name2 = sentryException.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "javaClass.name");
        String strW = StringsKt.W(name2, str, "", false, 4, null);
        String message = sentryException.getMessage();
        return new SentryException(strW, message != null ? message : "", name, getSentryStackTrace(sentryException));
    }

    private static final List<SentryStackFrame> getSentryFrames(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        for (StackTraceElement it : stackTrace) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String methodName = it.getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "it.methodName");
            String fileName = it.getFileName();
            if (fileName == null) {
                fileName = "";
            }
            int lineNumber = it.getLineNumber() >= 0 ? it.getLineNumber() : 0;
            String className = it.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            arrayList.add(new SentryStackFrame(methodName, fileName, lineNumber, className));
        }
        CollectionsKt.reverse(arrayList);
        return arrayList;
    }

    private static final SentryStackTrace getSentryStackTrace(Throwable th2) {
        return new SentryStackTrace(getSentryFrames(th2));
    }
}
