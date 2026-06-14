package com.mobilefuse.sdk.telemetry.mfxlogs;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.telemetry.BuildConfig;
import com.mobilefuse.sdk.telemetry.LogLevel;
import com.mobilefuse.sdk.telemetry.LogLevelKt;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService;
import com.mobilefuse.sdk.telemetry.loggers.MfxRequestManager;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J.\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001cJ\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020 0\u001cH\u0016J\u0018\u0010!\u001a\u0004\u0018\u00010\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0017J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0010J\u0016\u0010(\u001a\u00020\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0002J\u0016\u0010*\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/mfxlogs/TelemetryEventsMfxImpl;", "Lcom/mobilefuse/sdk/telemetry/TelemetryEventsMfxService;", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "()V", "appInfoJson", "Lorg/json/JSONObject;", "getAppInfoJson$mobilefuse_sdk_telemetry_release$annotations", "getAppInfoJson$mobilefuse_sdk_telemetry_release", "()Lorg/json/JSONObject;", "setAppInfoJson$mobilefuse_sdk_telemetry_release", "(Lorg/json/JSONObject;)V", "globalIndex", "", "initialLogReported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialTimeOffset", "", "requestManager", "Lcom/mobilefuse/sdk/telemetry/loggers/MfxRequestManager;", "sdkVersion", "", "getSdkVersion", "()Ljava/lang/String;", CommonUrlParts.UUID, "Ljava/util/UUID;", "createInitialLog", "", "modules", "", "variables", "createJson", "data", "", "createJsonLines", "", "getCurrentTimeMillis", "getSessionId", "getTimeOffset", "", "currentTime", "markEventsAsReported", "breadcrumbs", "reportEvents", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class TelemetryEventsMfxImpl implements TelemetryEventsMfxService<TelemetryBreadcrumb> {

    @Nullable
    private JSONObject appInfoJson;
    private int globalIndex;
    private AtomicBoolean initialLogReported;
    private final long initialTimeOffset;
    private final MfxRequestManager requestManager;

    @NotNull
    private final String sdkVersion;
    private final UUID uuid;

    public TelemetryEventsMfxImpl() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "UUID.randomUUID()");
        this.uuid = uuidRandomUUID;
        this.requestManager = new MfxRequestManager();
        this.initialLogReported = new AtomicBoolean(false);
        this.initialTimeOffset = getCurrentTimeMillis();
        this.sdkVersion = (String) StringsKt.split$default("1.9.3", new String[]{TokenBuilder.TOKEN_DELIMITER}, false, 0, 6, null).get(0);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAppInfoJson$mobilefuse_sdk_telemetry_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markEventsAsReported(final List<TelemetryBreadcrumb> breadcrumbs) {
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.telemetry.mfxlogs.TelemetryEventsMfxImpl.markEventsAsReported.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Iterator it = breadcrumbs.iterator();
                while (it.hasNext()) {
                    ((TelemetryBreadcrumb) it.next()).setWasReported(true);
                }
            }
        }, 1, null);
    }

    public final void createInitialLog(@NotNull Map<String, String> modules, @NotNull Map<String, String> variables) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("sdk.version", this.sdkVersion), TuplesKt.to("device.os", "android"));
        this.appInfoJson = createJson(MapsKt.mapOf(TuplesKt.to(CommonUrlParts.UUID, this.uuid.toString()), TuplesKt.to("level", LogLevelKt.toLowerCase(LogLevel.INFO)), TuplesKt.to("category", TelemetryCategory.TELEMETRY), TuplesKt.to("type", EventTypes.SDK_INIT.getValue()), TuplesKt.to(NotificationCompat.CATEGORY_MESSAGE, "SDK " + this.sdkVersion + " initialized for " + variables.get("app.bundle") + " on android"), TuplesKt.to("detail", MapsKt.plus(MapsKt.plus(modules, variables), mapMapOf)), TuplesKt.to("time_offset", Float.valueOf(getTimeOffset(getCurrentTimeMillis())))));
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    @Nullable
    public JSONObject createJson(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            this.globalIndex++;
            JSONObject jSONObject = new JSONObject(data);
            jSONObject.put(FirebaseAnalytics.Param.INDEX, this.globalIndex);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    @VisibleForTesting
    @Nullable
    public String createJsonLines(@NotNull List<? extends TelemetryBreadcrumb> data) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            ArrayList arrayList = new ArrayList();
            if (this.initialLogReported.compareAndSet(false, true) && (jSONObject = this.appInfoJson) != null) {
                arrayList.add(jSONObject);
            }
            int i10 = 0;
            for (Object obj : data) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TelemetryBreadcrumb telemetryBreadcrumb = (TelemetryBreadcrumb) obj;
                Map<String, ? extends Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(CommonUrlParts.UUID, this.uuid.toString()), TuplesKt.to("level", LogLevelKt.toLowerCase(telemetryBreadcrumb.getLogLevel())), TuplesKt.to("category", telemetryBreadcrumb.getCategory()), TuplesKt.to(NotificationCompat.CATEGORY_MESSAGE, telemetryBreadcrumb.getMessage()), TuplesKt.to("time_offset", Float.valueOf(getTimeOffset(telemetryBreadcrumb.getTimestamp()))), TuplesKt.to("type", telemetryBreadcrumb.getLogType()));
                Map<String, Object> data2 = telemetryBreadcrumb.getData();
                if (data2 != null) {
                    mapMutableMapOf.put("detail", data2);
                }
                JSONObject jSONObjectCreateJson = createJson(mapMutableMapOf);
                if (jSONObjectCreateJson != null) {
                    arrayList.add(jSONObjectCreateJson);
                }
                i10 = i11;
            }
            return CollectionsKt.joinToString$default(arrayList, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, new Function1<JSONObject, CharSequence>() { // from class: com.mobilefuse.sdk.telemetry.mfxlogs.TelemetryEventsMfxImpl.createJsonLines.3
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull JSONObject it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    String string = it.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "it.toString()");
                    return string;
                }
            }, 30, null);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getAppInfoJson$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final JSONObject getAppInfoJson() {
        return this.appInfoJson;
    }

    public final long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: getSessionId, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    public final float getTimeOffset(long currentTime) {
        return (currentTime - this.initialTimeOffset) / 1000.0f;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryEventsMfxService
    public void reportEvents(@NotNull final List<? extends TelemetryBreadcrumb> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String strCreateJsonLines = createJsonLines(data);
        if (strCreateJsonLines == null) {
            return;
        }
        this.requestManager.sendRequest(BuildConfig.TELEMETRY_MFX_LOGGING_SERVICE, strCreateJsonLines, new Function0<Unit>() { // from class: com.mobilefuse.sdk.telemetry.mfxlogs.TelemetryEventsMfxImpl.reportEvents.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                TelemetryEventsMfxImpl.this.markEventsAsReported(data);
            }
        });
        DebuggingKt.logDebug$default(this, "Telemetry session id: " + this.uuid, null, 2, null);
    }

    public final void setAppInfoJson$mobilefuse_sdk_telemetry_release(@Nullable JSONObject jSONObject) {
        this.appInfoJson = jSONObject;
    }
}
