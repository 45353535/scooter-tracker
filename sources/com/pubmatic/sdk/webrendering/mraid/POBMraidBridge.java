package com.pubmatic.sdk.webrendering.mraid;

import android.webkit.JavascriptInterface;
import androidx.annotation.AnyThread;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.N6;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@MainThread
public class POBMraidBridge {
    private static final String JS_CLASS = "mraidService";
    private static final String MRAID_MAPPING = "nativeBridge";
    private static final String TAG = "POBMraidBridge";

    @NonNull
    protected final POBAdViewContainer adViewContainer;

    @NonNull
    private final Map<String, g> commandHandlingMap;

    @Nullable
    private n mraidBridgeListener;

    @NonNull
    private com.pubmatic.sdk.webrendering.mraid.b mraidState = com.pubmatic.sdk.webrendering.mraid.b.LOADING;

    @NonNull
    private final Map<b, String> propertyMap;

    @NonNull
    protected final POBWebView webView;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63304a;

        a(String str) {
            this.f63304a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMraidBridge.this.acknowledgeMraidCommand();
            POBLog.debug(POBMraidBridge.TAG, "Received MRAID event : %s", this.f63304a);
            try {
                POBMraidBridge.this.invokeMraidCommands(new JSONObject(this.f63304a));
            } catch (JSONException e10) {
                POBLog.error(POBMraidBridge.TAG, "Failed to parse MRAID event. Error : %s", e10.getLocalizedMessage());
                POBMraidBridge.this.notifyError("Not supported", this.f63304a);
            }
        }
    }

    private enum b {
        CURRENT_POSITION,
        DEFAULT_POSITION,
        SCREEN_SIZE,
        MAX_SIZE,
        STATE,
        VIEWABLE
    }

    POBMraidBridge(@NonNull POBAdViewContainer pOBAdViewContainer) {
        this.adViewContainer = pOBAdViewContainer;
        POBWebView adView = pOBAdViewContainer.getAdView();
        this.webView = adView;
        adView.addJavascriptInterface(this, MRAID_MAPPING);
        this.propertyMap = new HashMap(5);
        this.commandHandlingMap = new HashMap(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acknowledgeMraidCommand() {
        injectProperties("mraidService.nativeCallComplete();");
    }

    private void injectProperties(String str) {
        POBLog.debug(TAG, "Injecting JS property : %s", str);
        this.webView.loadUrl("javascript:" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void invokeMraidCommands(@NonNull JSONObject jSONObject) {
        POBError pOBError;
        String strOptString = jSONObject.optString("name");
        g gVar = this.commandHandlingMap.get(strOptString);
        if (gVar == null) {
            pOBError = new POBError(1009, "Not supported");
        } else if (this.mraidBridgeListener == null || gVar.a()) {
            n nVar = this.mraidBridgeListener;
            pOBError = (nVar == null || !nVar.isUserInteracted(true)) ? new POBError(1009, "Illegal state of command execution without user interaction") : gVar.a(jSONObject, this.mraidBridgeListener, true);
        } else {
            pOBError = gVar.a(jSONObject, this.mraidBridgeListener, this.mraidBridgeListener.isUserInteracted(false));
        }
        if (pOBError != null) {
            notifyError(pOBError.getErrorMessage(), strOptString);
        }
    }

    private boolean isPropertyUpdated(b bVar, String str) {
        String str2 = this.propertyMap.get(bVar);
        if (str2 != null && str2.equals(str)) {
            return false;
        }
        this.propertyMap.put(bVar, str);
        return true;
    }

    protected void addCommandHandler(@NonNull g gVar) {
        this.commandHandlingMap.put(gVar.b(), gVar);
    }

    @JavascriptInterface
    public void error(String str) {
        POBLog.error(TAG, "Error message from JS :%s", str);
    }

    @NonNull
    protected com.pubmatic.sdk.webrendering.mraid.b getMraidState() {
        return this.mraidState;
    }

    @JavascriptInterface
    public void log(String str) {
        POBLog.debug(TAG, "Received MRAID log :%s", str);
    }

    @AnyThread
    @JavascriptInterface
    public void nativeCall(@Nullable String str) {
        POBTaskHandler.getInstance().runOnMainThread(new a(str));
    }

    protected void notifyAppInstallStatus(@NonNull String str, int i10) {
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".onAppInstallStatusReceived('%s', %d);", str, Integer.valueOf(i10)));
    }

    protected void notifyError(@Nullable String str, @Nullable String str2) {
        POBLog.debug(TAG, "JS called MRAID event without user interaction. Event : %s", str2);
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".fireErrorEvent('%s', '%s');", str, str2));
    }

    protected void resetPropertyMap() {
        this.propertyMap.clear();
    }

    protected void setAudioVolumePercentage(@Nullable Double d10) {
        injectProperties(JS_CLASS + (d10 != null ? String.format(Locale.getDefault(), ".fireEvent('audioVolumeChange', %.2f);", d10) : String.format(Locale.getDefault(), ".fireEvent('audioVolumeChange', %s);", "null")));
    }

    protected boolean setCurrentPosition(int i10, int i11, int i12, int i13) {
        JSONObject rectJson = POBMRAIDUtil.getRectJson(i10, i11, i12, i13);
        if (!isPropertyUpdated(b.CURRENT_POSITION, rectJson.toString())) {
            return false;
        }
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setCurrentPosition(%s);", rectJson));
        return true;
    }

    protected void setDefaultPosition(int i10, int i11, int i12, int i13) {
        JSONObject rectJson = POBMRAIDUtil.getRectJson(i10, i11, i12, i13);
        if (isPropertyUpdated(b.DEFAULT_POSITION, rectJson.toString())) {
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setDefaultPosition(%s);", rectJson));
        }
    }

    protected void setLocation(POBLocation pOBLocation) {
        String str;
        if (pOBLocation != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(N6.f41419s, pOBLocation.getLatitude());
                jSONObject.put("lon", pOBLocation.getLongitude());
                POBLocation.Source source = pOBLocation.getSource();
                if (source != null) {
                    jSONObject.put("type", String.valueOf(source.getValue()));
                }
                str = String.format(Locale.getDefault(), ".setLocation(%s);", jSONObject);
            } catch (Exception unused) {
                POBLog.error(TAG, "Not able to inject setLocation property!", new Object[0]);
                str = null;
            }
        } else {
            str = String.format(Locale.getDefault(), ".setLocation(%s);", JsonUtils.EMPTY_JSON);
        }
        injectProperties(JS_CLASS + str);
    }

    protected boolean setMaxSize(int i10, int i11) {
        JSONObject heightWidthJson = POBMRAIDUtil.getHeightWidthJson(i10, i11);
        if (!isPropertyUpdated(b.MAX_SIZE, heightWidthJson.toString())) {
            return false;
        }
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setMaxSize(%s);", heightWidthJson));
        return true;
    }

    protected void setMraidBridgeListener(@Nullable n nVar) {
        this.mraidBridgeListener = nVar;
    }

    protected void setMraidState(@NonNull com.pubmatic.sdk.webrendering.mraid.b bVar) {
        this.mraidState = bVar;
    }

    protected void setPlacementType(@NonNull String str) {
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setPlacementType('%s');", str));
    }

    protected void setScreenSize(int i10, int i11) {
        JSONObject heightWidthJson = POBMRAIDUtil.getHeightWidthJson(i10, i11);
        if (isPropertyUpdated(b.SCREEN_SIZE, heightWidthJson.toString())) {
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setScreenSize(%s);", heightWidthJson));
        }
    }

    protected void setSizeChange(int i10, int i11) {
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".fireEvent('%s', %d, %d);", com.pubmatic.sdk.webrendering.mraid.a.SIZE_CHANGE.b(), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    protected void setSupportedFeatures(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MRAIDNativeFeature.SMS, z10);
            jSONObject.put(MRAIDNativeFeature.TEL, z11);
            jSONObject.put(MRAIDNativeFeature.CALENDAR, z12);
            jSONObject.put(MRAIDNativeFeature.STORE_PICTURE, z13);
            jSONObject.put(MRAIDNativeFeature.INLINE_VIDEO, z14);
            jSONObject.put("location", z15);
            jSONObject.put(MRAIDNativeFeature.VPAID, z16);
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setSupports(%s);", jSONObject));
        } catch (JSONException unused) {
            POBLog.error(TAG, "Not able to inject setSupports property!", new Object[0]);
        }
    }

    protected void updateEvent(@NonNull com.pubmatic.sdk.webrendering.mraid.a aVar) {
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".fireEvent('%s');", aVar.b()));
    }

    protected void updateExposureChangeData(Float f10, JSONObject jSONObject) {
        if (f10 == null || jSONObject == null) {
            return;
        }
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".fireEvent('exposureChange', %.1f, %s, null);", f10, jSONObject));
    }

    protected void updateMraidState(@NonNull com.pubmatic.sdk.webrendering.mraid.b bVar) {
        if (isPropertyUpdated(b.STATE, bVar.b())) {
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setState('%s');", bVar.b()));
        }
    }

    protected void updateViewable(boolean z10) {
        if (isPropertyUpdated(b.VIEWABLE, String.valueOf(z10))) {
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setViewable(%b);", Boolean.valueOf(z10)));
        }
    }
}
