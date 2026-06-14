package com.amazon.aps.ads.util.adview;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.MraidCommand;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.taurusx.tax.y.z.w.s;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0015J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewWebBridge;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/ads/util/adview/ApsWebBridgeListener;", "<init>", "(Lcom/amazon/aps/ads/util/adview/ApsWebBridgeListener;)V", "getListener", "()Lcom/amazon/aps/ads/util/adview/ApsWebBridgeListener;", "executionException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getExecutionException", "()Ljava/lang/Exception;", "setExecutionException", "(Ljava/lang/Exception;)V", "postMessage", "", "args", "", "handleVideoEvent", "videoEvent", "Lorg/json/JSONObject;", "handleServiceCall", "request", "handleApsCommand", "apsEvent", "handleMraidCommand", "logFromJavasScript", PglCryptUtils.KEY_MESSAGE, "echo", "json", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsAdViewWebBridge {

    @Nullable
    private Exception executionException;

    @NotNull
    private final ApsWebBridgeListener listener;

    public ApsAdViewWebBridge(@NotNull ApsWebBridgeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void echo$lambda$8(ApsAdViewWebBridge apsAdViewWebBridge, String str) {
        apsAdViewWebBridge.listener.evaluateApsJavascript(str, null);
    }

    private final void logFromJavasScript(String message) {
        ApsAdExtensionsKt.d(this, "mraid:JSNative: " + message);
    }

    public final void echo(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            int i10 = json.getInt("promiseId");
            String str = json.getJSONObject("arguments").getString("greeting") + " Returned";
            a1 a1Var = a1.f93282a;
            final String str2 = String.format("window.promiseResolve(%d, '%s');", Arrays.copyOf(new Object[]{Integer.valueOf(i10), str}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.ads.util.adview.g
                @Override // java.lang.Runnable
                public final void run() {
                    ApsAdViewWebBridge.echo$lambda$8(this.f7387b, str2);
                }
            });
        } catch (JSONException e10) {
            ApsAdExtensionsKt.d(this, "JSON conversion failed:" + e10);
        }
    }

    @Nullable
    public final Exception getExecutionException() {
        return this.executionException;
    }

    @NotNull
    public final ApsWebBridgeListener getListener() {
        return this.listener;
    }

    public final void handleApsCommand(@NotNull JSONObject apsEvent) throws JSONException {
        Intrinsics.checkNotNullParameter(apsEvent, "apsEvent");
        String string = apsEvent.getString("subtype");
        if (DtbCommonUtils.isNullOrWhiteSpace(string) || this.listener.getApsMraidHandler() == null) {
            return;
        }
        if (Intrinsics.areEqual(string, "onAdLoaded")) {
            DTBAdMRAIDController apsMraidHandler = this.listener.getApsMraidHandler();
            if (apsMraidHandler != null) {
                apsMraidHandler.onAdLoaded();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(string, "onAdFailedToLoad")) {
            DTBAdMRAIDController apsMraidHandler2 = this.listener.getApsMraidHandler();
            if (apsMraidHandler2 != null) {
                apsMraidHandler2.onAdFailedToLoad();
                return;
            }
            return;
        }
        ApsAdExtensionsKt.i(this, string + " aps event not supported");
    }

    public final void handleMraidCommand(@NotNull JSONObject request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.executionException = null;
        String string = request.getString("subtype");
        Class<MraidCommand> clsFindMraidCommandByName = MraidCommand.findMraidCommandByName(string);
        if (clsFindMraidCommandByName == null) {
            ApsAdExtensionsKt.e(this, "MRAID Command:" + string + " is not found");
            DTBAdMRAIDController apsMraidHandler = this.listener.getApsMraidHandler();
            Intrinsics.checkNotNull(apsMraidHandler);
            apsMraidHandler.fireErrorEvent(string, string + " is not supported");
            DTBAdMRAIDController apsMraidHandler2 = this.listener.getApsMraidHandler();
            Intrinsics.checkNotNull(apsMraidHandler2);
            apsMraidHandler2.commandCompleted(string);
            return;
        }
        try {
            MraidCommand mraidCommandNewInstance = clsFindMraidCommandByName.newInstance();
            Intrinsics.checkNotNull(mraidCommandNewInstance, "null cannot be cast to non-null type com.amazon.device.ads.MraidCommand");
            MraidCommand mraidCommand = mraidCommandNewInstance;
            ApsAdExtensionsKt.d(this, "execute command " + mraidCommand.getName());
            mraidCommand.execute(request.getJSONObject("arguments"), this.listener.getApsMraidHandler());
        } catch (JSONException e10) {
            throw e10;
        } catch (Exception e11) {
            this.executionException = e11;
            ApsAdExtensionsKt.e(this, "Error execution command " + string + " " + e11.getLocalizedMessage());
        }
    }

    public final void handleServiceCall(@NotNull JSONObject request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (Intrinsics.areEqual(s.z.f67719y, request.getString("subtype"))) {
            String string = request.getJSONObject("arguments").getString(PglCryptUtils.KEY_MESSAGE);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            logFromJavasScript(string);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void handleVideoEvent(@NotNull JSONObject videoEvent) throws JSONException {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        String string = videoEvent.getString("subtype");
        if (DtbCommonUtils.isNullOrWhiteSpace(string) || this.listener.getApsMraidHandler() == null) {
            return;
        }
        if (string != null) {
            switch (string.hashCode()) {
                case -1928679091:
                    if (string.equals("AD_VIDEO_PLAYER_COMPLETED")) {
                        DTBAdMRAIDController apsMraidHandler = this.listener.getApsMraidHandler();
                        if (apsMraidHandler != null) {
                            apsMraidHandler.onVideoCompleted();
                            return;
                        }
                        return;
                    }
                    break;
                case -100915287:
                    if (string.equals("AD_VIDEO_PLAYER_CLICKED")) {
                        DTBAdMRAIDController apsMraidHandler2 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler2 != null) {
                            apsMraidHandler2.onAdClicked();
                            return;
                        }
                        return;
                    }
                    break;
                case 252691236:
                    if (string.equals("END_CARD_COMPANION_AD_START")) {
                        DTBAdMRAIDController apsMraidHandler3 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler3 != null) {
                            apsMraidHandler3.startEndCardDisplayOMSDKSession();
                            return;
                        }
                        return;
                    }
                    break;
                case 604315076:
                    if (string.equals("AD_FAILED_TO_LOAD")) {
                        DTBAdMRAIDController apsMraidHandler4 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler4 != null) {
                            apsMraidHandler4.onAdFailedToLoad();
                            return;
                        }
                        return;
                    }
                    break;
                case 1135343643:
                    if (string.equals("END_CARD_VIDEO_CLOSED")) {
                        DTBAdMRAIDController apsMraidHandler5 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler5 != null) {
                            apsMraidHandler5.stopOMSDKSession();
                            return;
                        }
                        return;
                    }
                    break;
                case 1690844065:
                    if (string.equals("AD_LOADED")) {
                        DTBAdMRAIDController apsMraidHandler6 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler6 != null) {
                            apsMraidHandler6.onAdLoaded();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        ApsAdExtensionsKt.i(this, string + " video event not supported");
    }

    @JavascriptInterface
    public final void postMessage(@Nullable String args) {
        try {
            JSONObject jSONObject = new JSONObject(args);
            if (!jSONObject.has("type")) {
                ApsAdExtensionsKt.e(this, "Unrecognized bridge call");
                return;
            }
            String string = jSONObject.getString("type");
            if (Intrinsics.areEqual(NotificationCompat.CATEGORY_SERVICE, string)) {
                handleServiceCall(jSONObject);
                return;
            }
            if (Intrinsics.areEqual("mraid", string)) {
                handleMraidCommand(jSONObject);
            } else if (Intrinsics.areEqual(ApsMetricsDataMap.APSMETRICS_FIELD_APS, string)) {
                handleApsCommand(jSONObject);
            } else if (Intrinsics.areEqual("apsvid", string)) {
                handleVideoEvent(jSONObject);
            }
        } catch (JSONException e10) {
            ApsAdExtensionsKt.d(this, "JSON conversion failed:" + e10);
        }
    }

    public final void setExecutionException(@Nullable Exception exc) {
        this.executionException = exc;
    }
}
