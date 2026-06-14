package com.mobilefuse.sdk.telemetry;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n\u001a&\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a&\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a0\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a8\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001aF\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a&\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a&\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0018"}, d2 = {"createAction", "Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "senderObject", "", "type", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "logLevel", "Lcom/mobilefuse/sdk/telemetry/LogLevel;", "createDebugAction", "createErrorAction", "createHttpGetRequestAction", "url", "", "createHttpPostRequestAction", "body", "createHttpResponseAction", "requestAction", "statusCode", "", "createInfoAction", "createWarnAction", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class TelemetryActionFactory {
    @NotNull
    public static final TelemetryAction createAction(@NotNull Object senderObject, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras, @NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(senderObject, "senderObject");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return new TelemetryAction(TelemetryHelpersKt.getTelemetryActionSender(senderObject), type, extras, logLevel, 0L, 16, null);
    }

    public static /* synthetic */ TelemetryAction createAction$default(Object obj, TelemetryActionType telemetryActionType, List list, LogLevel logLevel, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 8) != 0) {
            logLevel = LogLevel.INFO;
        }
        return createAction(obj, telemetryActionType, list, logLevel);
    }

    @NotNull
    public static final TelemetryAction createDebugAction(@NotNull Object senderObject, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras) {
        Intrinsics.checkNotNullParameter(senderObject, "senderObject");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return createAction(senderObject, type, extras, LogLevel.DEBUG);
    }

    public static /* synthetic */ TelemetryAction createDebugAction$default(Object obj, TelemetryActionType telemetryActionType, List list, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return createDebugAction(obj, telemetryActionType, list);
    }

    @NotNull
    public static final TelemetryAction createErrorAction(@NotNull Object senderObject, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras) {
        Intrinsics.checkNotNullParameter(senderObject, "senderObject");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return createAction(senderObject, type, extras, LogLevel.ERROR);
    }

    public static /* synthetic */ TelemetryAction createErrorAction$default(Object obj, TelemetryActionType telemetryActionType, List list, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return createErrorAction(obj, telemetryActionType, list);
    }

    @NotNull
    public static final TelemetryAction createHttpGetRequestAction(@NotNull Object senderObject, @NotNull TelemetryActionType type, @NotNull String url, @Nullable List<TelemetryActionParam> list) {
        List arrayList;
        Intrinsics.checkNotNullParameter(senderObject, "senderObject");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List list2 = arrayList;
        list2.add(new TelemetryActionParam(TelemetryBaseParamType.URL, url, false));
        list2.add(new TelemetryActionParam(TelemetryBaseParamType.REQUEST_METHOD, HttpRequestMethod.GET.name(), false));
        return createAction(senderObject, type, arrayList, LogLevel.INFO);
    }

    public static /* synthetic */ TelemetryAction createHttpGetRequestAction$default(Object obj, TelemetryActionType telemetryActionType, String str, List list, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            list = null;
        }
        return createHttpGetRequestAction(obj, telemetryActionType, str, list);
    }

    @NotNull
    public static final TelemetryAction createHttpPostRequestAction(@NotNull Object senderObject, @NotNull TelemetryActionType type, @NotNull String url, @NotNull String body, @Nullable List<TelemetryActionParam> list) {
        List arrayList;
        Intrinsics.checkNotNullParameter(senderObject, "senderObject");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List list2 = arrayList;
        list2.add(new TelemetryActionParam(TelemetryBaseParamType.URL, url, true));
        list2.add(new TelemetryActionParam(TelemetryBaseParamType.REQUEST_METHOD, HttpRequestMethod.POST.name(), true));
        list2.add(new TelemetryActionParam(TelemetryBaseParamType.BODY, body, false));
        return createAction(senderObject, type, arrayList, LogLevel.INFO);
    }

    public static /* synthetic */ TelemetryAction createHttpPostRequestAction$default(Object obj, TelemetryActionType telemetryActionType, String str, String str2, List list, int i10, Object obj2) {
        if ((i10 & 16) != 0) {
            list = null;
        }
        return createHttpPostRequestAction(obj, telemetryActionType, str, str2, list);
    }

    @NotNull
    public static final TelemetryAction createHttpResponseAction(@NotNull Object senderObject, @NotNull TelemetryActionType type, @Nullable TelemetryAction telemetryAction, int i10, @Nullable String str, @Nullable List<TelemetryActionParam> list) {
        List arrayList;
        Intrinsics.checkNotNullParameter(senderObject, "senderObject");
        Intrinsics.checkNotNullParameter(type, "type");
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List list2 = arrayList;
        list2.add(new TelemetryActionParam(TelemetryBaseParamType.STATUS_CODE, Integer.valueOf(i10), true));
        if (telemetryAction != null) {
            list2.add(new TelemetryActionParam(TelemetryBaseParamType.REQUEST_ACTION_INSTANCE, telemetryAction, false));
            list2.add(new TelemetryActionParam(TelemetryBaseParamType.REQUEST_METHOD, HttpRequestMethod.POST.name(), true));
        }
        if (str != null) {
            list2.add(new TelemetryActionParam(TelemetryBaseParamType.BODY, str, false));
        }
        return createAction(senderObject, type, arrayList, LogLevel.INFO);
    }

    public static /* synthetic */ TelemetryAction createHttpResponseAction$default(Object obj, TelemetryActionType telemetryActionType, TelemetryAction telemetryAction, int i10, String str, List list, int i11, Object obj2) {
        if ((i11 & 16) != 0) {
            str = null;
        }
        if ((i11 & 32) != 0) {
            list = null;
        }
        return createHttpResponseAction(obj, telemetryActionType, telemetryAction, i10, str, list);
    }

    @NotNull
    public static final TelemetryAction createInfoAction(@NotNull Object senderObject, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras) {
        Intrinsics.checkNotNullParameter(senderObject, "senderObject");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return createAction(senderObject, type, extras, LogLevel.INFO);
    }

    public static /* synthetic */ TelemetryAction createInfoAction$default(Object obj, TelemetryActionType telemetryActionType, List list, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return createInfoAction(obj, telemetryActionType, list);
    }

    @NotNull
    public static final TelemetryAction createWarnAction(@NotNull Object senderObject, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras) {
        Intrinsics.checkNotNullParameter(senderObject, "senderObject");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return createAction(senderObject, type, extras, LogLevel.WARN);
    }

    public static /* synthetic */ TelemetryAction createWarnAction$default(Object obj, TelemetryActionType telemetryActionType, List list, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return createWarnAction(obj, telemetryActionType, list);
    }
}
