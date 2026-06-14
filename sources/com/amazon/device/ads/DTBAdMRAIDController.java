package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import com.amazon.aps.ads.R;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.SDKUtilities;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.ironsource.C4240b4;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DTBAdMRAIDController implements DTBActivityListener {
    static final String LOG_TAG = "DTBAdMRAIDController";
    public static final String MRAID_CLOSE = "window.mraid.close();";
    private static final String MRAID_READY = "window.mraidBridge.event.ready();";
    DTBAdView adView;
    LinearLayout closeIndicatorRegion;
    DTBMRAIDCloseButtonListener customButtonListener;
    private DtbOmSdkSessionManager dtbOmSdkSessionManager;
    private Rect lastRect;
    private MraidExposure lastReportedExposure;
    private Boolean lastViewabilityState;
    private boolean loadReportSubmitted;
    boolean pageLoaded = false;
    protected boolean useCustomClose = false;
    private int lastReportedSizeChangeWidth = -1;
    private int lastReportedSizeChangeHeight = -1;
    protected MraidStateType state = MraidStateType.LOADING;
    private boolean jsReady = false;
    private boolean isTwoPartExpand = false;

    /* JADX INFO: renamed from: com.amazon.device.ads.DTBAdMRAIDController$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidStateType;

        static {
            int[] iArr = new int[MraidStateType.values().length];
            $SwitchMap$com$amazon$device$ads$MraidStateType = iArr;
            try {
                iArr[MraidStateType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.RESIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.EXPANDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    class MraidExposure {
        int percent;
        Rect rect;

        MraidExposure(int i10, Rect rect) {
            this.percent = i10;
            this.rect = new Rect(rect);
        }
    }

    static {
        MraidCommand.registerCommand(MraidOpenCommand.getMraidName(), MraidOpenCommand.class);
        MraidCommand.registerCommand(MraidCloseCommand.getMraidName(), MraidCloseCommand.class);
        MraidCommand.registerCommand(MraidUnloadCommand.getMraidName(), MraidUnloadCommand.class);
        MraidCommand.registerCommand(MraidResizeCommand.getMraidName(), MraidResizeCommand.class);
        MraidCommand.registerCommand(MraidExpandCommand.getMraidName(), MraidExpandCommand.class);
        MraidCommand.registerCommand(MraidUseCustomCloseCommand.getMraidName(), MraidUseCustomCloseCommand.class);
        MraidCommand.registerCommand(MraidJSReadyCommand.getMraidName(), MraidJSReadyCommand.class);
        MraidCommand.registerCommand(MraidFirePixelCommand.getMraidName(), MraidFirePixelCommand.class);
    }

    protected DTBAdMRAIDController(DTBAdView dTBAdView) {
        this.adView = dTBAdView;
        this.dtbOmSdkSessionManager = dTBAdView.getOmSdkManager();
    }

    public static /* synthetic */ void b(DTBAdMRAIDController dTBAdMRAIDController, final String str) {
        if (dTBAdMRAIDController.getAdView() != null) {
            dTBAdMRAIDController.getAdView().evaluateJavascript(str, new ValueCallback<String>() { // from class: com.amazon.device.ads.DTBAdMRAIDController.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                    if (str2 == null || "null".equals(str2)) {
                        return;
                    }
                    DtbLog.debug(DTBAdMRAIDController.LOG_TAG, "Value received:" + str2 + " for script " + str);
                }
            });
        }
    }

    public static /* synthetic */ void c(DTBAdMRAIDController dTBAdMRAIDController) {
        DTBAdView adView = dTBAdMRAIDController.getAdView();
        if (adView != null) {
            adView.setVisibility(8);
        }
    }

    public static /* synthetic */ boolean d(DTBAdMRAIDController dTBAdMRAIDController, View view, MotionEvent motionEvent) {
        dTBAdMRAIDController.getClass();
        if (motionEvent.getAction() != 0) {
            return true;
        }
        dTBAdMRAIDController.evaluateJavascript(MRAID_CLOSE);
        ((ViewGroup) view.getParent()).removeView(view);
        dTBAdMRAIDController.closeIndicatorRegion = null;
        return true;
    }

    private void evaluateJavascriptMethod(String str, JSONObject jSONObject) {
        evaluateJavascript(String.format(str + "(%s);", jSONObject.toString()));
    }

    private void fireEnforcedExposureChange(int i10, Rect rect) {
        evaluateJavascript(String.format("window.mraidBridge.event.exposureChange(%d, { x:%d, y:%d, width:%d, height: %d}, null);", Integer.valueOf(i10), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.top)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.right - rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.bottom - rect.top))));
    }

    private void fireMaxSizeEvent() {
        SDKUtilities.SimpleSize maxSize = DTBAdUtil.getMaxSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setMaxSize({'width':%d, 'height':%d});", Integer.valueOf(maxSize.getWidth()), Integer.valueOf(maxSize.getHeight())));
    }

    private JSONObject formProperties(MraidProperty[] mraidPropertyArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (MraidProperty mraidProperty : mraidPropertyArr) {
            mraidProperty.formJSON(jSONObject);
        }
        return jSONObject;
    }

    private MraidProperty getCurrentStateProperty() {
        int i10 = AnonymousClass2.$SwitchMap$com$amazon$device$ads$MraidStateType[this.state.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MraidProperty.STATE_DEFAULT_PROPERTY : MraidProperty.STATE_HIDDEN_PROPERTY : MraidProperty.STATE_EXPANDED_PROPERTY : MraidProperty.STATE_RESIZED_PROPERTY : MraidProperty.STATE_DEFAULT_PROPERTY : MraidProperty.STATE_LOADING_PROPERTY;
    }

    private boolean launchBrowserIntent(Uri uri) {
        boolean z10 = false;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            z10 = true;
            onAdLeftApplication();
            return true;
        } catch (Exception e10) {
            String str = "Failed to execute open browser Intent: invalid url " + uri.toString();
            fireErrorEvent("open", str);
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, str, e10);
            return z10;
        }
    }

    private boolean launchUrlInAppBrowser(Uri uri) {
        if (!APSSharedUtil.isClassExistInPackage("androidx.browser.customtabs.CustomTabsClient")) {
            fireErrorEvent("open", "Custom Tab Dependency Not found");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Custom Tab Dependency Not found");
            return false;
        }
        ApsMetrics.customEvent("CUSTOM_BROWSER_DEPENDENCY_CHECK", "FOUND", null);
        try {
            if (CustomTabsClient.getPackageName(getContext(), Collections.EMPTY_LIST) != null) {
                new CustomTabsIntent.Builder().build().launchUrl(getContext(), uri);
                onAdLeftApplication();
                return true;
            }
            String str = "Unable to find the default app browser :" + uri.toString();
            fireErrorEvent("open", str);
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, str);
            return false;
        } catch (Exception e10) {
            String str2 = "Failed to execute open command within InAppBrowser: invalid url " + uri.toString();
            fireErrorEvent("open", str2);
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, str2, e10);
            return false;
        }
    }

    void addCloseIndicator(int i10, int i11) {
        removeCloseIndicator();
        addCloseIndicator(i10, i11, false);
    }

    public void cleanup() {
        this.closeIndicatorRegion = null;
        this.adView = null;
        this.customButtonListener = null;
    }

    void closeExpandedPartTwo() {
    }

    public void commandCompleted(String str) {
        evaluateJavascript(String.format("window.mraidBridge.service.acknowledgement('%s');", str));
    }

    protected void createContentIndicator() {
        LinearLayout linearLayout = new LinearLayout(getAdView().getContext());
        this.closeIndicatorRegion = linearLayout;
        linearLayout.setVisibility(this.useCustomClose ? 4 : 0);
        this.closeIndicatorRegion.setOrientation(1);
    }

    protected void createLoadReport() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId == null || this.loadReportSubmitted) {
            return;
        }
        DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_LATENCY, (int) (new Date().getTime() - this.adView.getStartTime()));
        this.loadReportSubmitted = true;
    }

    protected void evaluateJavascript(final String str) {
        DtbLog.debug(LOG_TAG, "MRAID Evaluate JSScript:" + str);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.v
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDController.b(this.f7478b, str);
            }
        });
    }

    protected abstract void expand(Map<String, Object> map);

    void fireEnforcedSizeChange(int i10, int i11) {
        evaluateJavascript(String.format("window.mraidBridge.event.sizeChange(%d, %d);", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    void fireEnforcedViewableChange(boolean z10) {
        evaluateJavascript(String.format("window.mraidBridge.event.viewableChange(%s);", z10 ? "true" : "false"));
    }

    public void fireErrorEvent(String str, String str2) {
        evaluateJavascript(String.format("window.mraidBridge.event.error('%s','%s');", str2, str));
    }

    public void fireExposureChange(int i10, Rect rect) {
        int i11 = rect.right;
        if (this.jsReady) {
            fireEnforcedExposureChange(i10, rect);
        } else {
            this.lastReportedExposure = new MraidExposure(i10, rect);
        }
    }

    void fireMRAIDReadyEvent() {
        evaluateJavascript(MRAID_READY);
    }

    protected void fireMRAIDSupports() {
        evaluateJavascriptMethod("window.mraidBridge.property.setSupports", MraidProperty.SUPPORTS_PROPERTY.getData());
    }

    protected void firePlacementType() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", getPlacementType());
        evaluateJavascriptMethod("window.mraidBridge.property.setPlacementType", jSONObject);
    }

    void fireScreenSizeEvent() {
        SDKUtilities.SimpleSize screenSize = DTBAdUtil.getScreenSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setScreenSize({'width':%d, 'height':%d});", Integer.valueOf(screenSize.getWidth()), Integer.valueOf(screenSize.getHeight())));
    }

    void fireSizeChange(int i10, int i11) {
        if (this.lastReportedSizeChangeWidth == i10 && this.lastReportedSizeChangeHeight == i11) {
            return;
        }
        this.lastReportedSizeChangeWidth = i10;
        this.lastReportedSizeChangeHeight = i11;
        if (this.jsReady) {
            fireEnforcedSizeChange(i10, i11);
        }
    }

    void fireStateChangeEvent() {
        try {
            JSONObject jSONObjectFormProperties = formProperties(new MraidProperty[]{getCurrentStateProperty()});
            DtbLog.debug(LOG_TAG, "State was changed to " + jSONObjectFormProperties.toString() + " for controller " + this);
            evaluateJavascript(String.format("window.mraidBridge.event.stateChange(%s);", jSONObjectFormProperties.toString()));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    void fireViewableChange(boolean z10) {
        Boolean bool = this.lastViewabilityState;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.jsReady) {
                fireEnforcedViewableChange(z10);
            }
            this.lastViewabilityState = Boolean.valueOf(z10);
        }
    }

    protected DTBAdView getAdView() {
        return this.adView;
    }

    Context getContext() {
        return getAdView().getContext();
    }

    public DtbOmSdkSessionManager getDtbOmSdkSessionManager() {
        return this.dtbOmSdkSessionManager;
    }

    protected MraidStateType getInitialStateType() {
        return MraidStateType.DEFAULT;
    }

    protected String getPlacementType() {
        return "";
    }

    public void impressionFired() {
        if (!getAdView().getIsVideo() && getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().impressionOccured();
        }
        commandCompleted(MraidFirePixelCommand.getMraidName());
    }

    public boolean isTwoPartExpand() {
        return this.isTwoPartExpand;
    }

    public boolean isUseCustomClose() {
        return this.useCustomClose;
    }

    void jsReady() {
        int i10;
        commandCompleted("jsready");
        this.jsReady = true;
        Boolean bool = this.lastViewabilityState;
        if (bool != null) {
            fireEnforcedViewableChange(bool.booleanValue());
        }
        MraidExposure mraidExposure = this.lastReportedExposure;
        if (mraidExposure != null) {
            fireEnforcedExposureChange(mraidExposure.percent, mraidExposure.rect);
        }
        int i11 = this.lastReportedSizeChangeWidth;
        if (i11 <= 0 || (i10 = this.lastReportedSizeChangeHeight) <= 0) {
            return;
        }
        fireEnforcedSizeChange(i11, i10);
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityStopped(Activity activity) {
    }

    public void onAdClicked() {
    }

    public void onAdFailedToLoad() {
    }

    public abstract void onAdLeftApplication();

    public void onAdLoaded() {
    }

    public void onAdOpened() {
    }

    public void onAdRemoved() {
    }

    void onLoadError(String str, int i10) {
        onLoadError();
    }

    protected abstract void onMRAIDClose();

    protected void onMRAIDUnload() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f7483b.getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
            }
        });
    }

    public abstract void onPageLoad();

    public void onPositionChanged(Rect rect) {
        Rect rect2 = this.lastRect;
        if (rect2 == null || !rect2.equals(rect)) {
            int i10 = rect.right - rect.left;
            int i11 = rect.bottom - rect.top;
            Rect rect3 = this.lastRect;
            boolean z10 = true;
            if (rect3 != null) {
                int i12 = rect3.right - rect3.left;
                int i13 = rect3.bottom - rect3.top;
                if (Math.abs(i12 - i10) <= 1 && Math.abs(i13 - i11) <= 1) {
                    z10 = false;
                }
            }
            setCurrentPositionProperty();
            if (z10) {
                fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i10), DTBAdUtil.pixelsToDeviceIndependenPixels(i11));
            }
            this.lastRect = rect;
        }
    }

    protected abstract void onResize(Map<String, Object> map);

    public void onVideoCompleted() {
    }

    public void onViewabilityChanged(boolean z10) {
        DtbLog.debug("SET MRAID Visible " + z10);
        fireViewableChange(z10);
    }

    void openUrl(String str) {
        openUrl(str, false);
    }

    void passLoadError() {
    }

    void prepareMraid() throws JSONException {
        createLoadReport();
        this.pageLoaded = true;
        fireMaxSizeEvent();
        fireScreenSizeEvent();
        if (getAdView().getIsAdViewVisible()) {
            setCurrentPositionProperty();
        }
        fireMRAIDSupports();
        firePlacementType();
        setCurrentAppOrientation();
        setState(getInitialStateType());
        fireMRAIDReadyEvent();
        if (AdRegistration.isTestMode()) {
            evaluateJavascript("window.mraidBridge.service.debug('enable');");
        }
    }

    protected void removeCloseIndicator() {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout == null || (viewGroup = (ViewGroup) linearLayout.getParent()) == null) {
            return;
        }
        viewGroup.removeView(this.closeIndicatorRegion);
    }

    protected void setCloseIndicatorContent(View.OnTouchListener onTouchListener) {
        this.closeIndicatorRegion.setBackgroundColor(0);
        LinearLayout linearLayout = this.closeIndicatorRegion;
        int i10 = R.id.mraid_close_indicator;
        linearLayout.setId(i10);
        ImageView imageView = new ImageView(getAdView().getContext());
        imageView.setId(i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
        layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
        this.closeIndicatorRegion.addView(imageView, layoutParams);
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().addFriendlyObstruction(this.closeIndicatorRegion.findViewById(i10), FriendlyObstructionPurpose.CLOSE_AD);
        }
        imageView.setImageDrawable(AppCompatResources.getDrawable(getAdView().getContext(), R.drawable.mraid_close));
        if (onTouchListener != null) {
            this.closeIndicatorRegion.setOnTouchListener(onTouchListener);
        } else {
            this.closeIndicatorRegion.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.device.ads.w
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return DTBAdMRAIDController.d(this.f7481b, view, motionEvent);
                }
            });
        }
    }

    protected void setCurrentAppOrientation() throws JSONException {
        int iDetermineSimpleOrientation = DisplayUtils.determineSimpleOrientation();
        String str = iDetermineSimpleOrientation != 1 ? iDetermineSimpleOrientation != 2 ? "unspecified" : "landscape" : "portrait";
        boolean zIsRotationLocked = DisplayUtils.isRotationLocked();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orientation", str);
        jSONObject.put("locked", zIsRotationLocked);
        evaluateJavascriptMethod("window.mraidBridge.property.setCurrentAppOrientation", jSONObject);
    }

    public void setCurrentPositionProperty() {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], getAdView().getWidth(), getAdView().getHeight());
        }
    }

    public void setCustomButtonListener(DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener) {
        this.customButtonListener = dTBMRAIDCloseButtonListener;
    }

    void setState(MraidStateType mraidStateType) {
        this.state = mraidStateType;
        if (mraidStateType == MraidStateType.HIDDEN) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.y
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDController.c(this.f7485b);
                }
            });
        }
        fireStateChangeEvent();
    }

    void setTwoPartExpand(boolean z10) {
        this.isTwoPartExpand = z10;
    }

    public void setUseCustomClose(boolean z10) {
        DtbLog.debug("Set useCustomClose to " + z10);
        this.useCustomClose = z10;
        commandCompleted("useCustomClose");
        DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener = this.customButtonListener;
        if (dTBMRAIDCloseButtonListener != null) {
            dTBMRAIDCloseButtonListener.useCustomButtonUpdated();
        }
    }

    public void startEndCardDisplayOMSDKSession() {
    }

    public void startOMSDKSession() {
    }

    public void stopOMSDKSession() {
    }

    public void onLoadError() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId != null) {
            DTBMetricsProcessor.getInstance().submitSimpleReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_FAILURE);
        }
        passLoadError();
    }

    void openUrl(String str, boolean z10) {
        PackageManager packageManager = this.adView.getContext().getPackageManager();
        try {
            Uri uri = Uri.parse(str);
            if ("amazonmobile".equals(uri.getScheme()) && uri.getHost().equals(com.taurusx.tax.g.n.f66171o)) {
                String[] strArrSplit = str.split("intent=");
                if (strArrSplit.length > 1) {
                    String strDecode = null;
                    for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                        try {
                            String strSubstring = strArrSplit[i10];
                            if (strSubstring.lastIndexOf(C4240b4.j.f42670c) == strSubstring.length() - 1) {
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                            }
                            strDecode = URLDecoder.decode(strSubstring, "UTF-8");
                            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strDecode)));
                            onAdLeftApplication();
                            ApsMetrics.customEvent("AD_CLICK_LAUNCH_INTENT", "SUCCESS", null);
                            break;
                        } catch (ActivityNotFoundException e10) {
                            DtbLog.debug("Intent:" + strDecode + " not found.");
                            fireErrorEvent("open", "requested activity not found");
                            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AD_CLICK_requested activity not found", e10);
                        } catch (UnsupportedEncodingException e11) {
                            DtbLog.debug("Unsupported encoding");
                            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AD_CLICK_Unsupported encoding", e11);
                        }
                    }
                }
            } else if (ApsAdWebViewSupportClient.MOBILE_SHOPPING_SCHEME.equals(uri.getScheme())) {
                try {
                    if (packageManager.getLaunchIntentForPackage("com.amazon.mShop.android.shopping") != null) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uri);
                        AdRegistration.getCurrentActivity().startActivity(intent);
                        ApsMetrics.customEvent("AD_CLICK_LAUNCH_MSHOP_INTENT", "SUCCESS", null);
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(uri);
                        int iIndexOf = str.indexOf("products/");
                        if (iIndexOf > 0) {
                            intent2.setData(Uri.parse("https://www.amazon.com/dp/" + str.substring(iIndexOf + 9)));
                            AdRegistration.getCurrentActivity().startActivity(intent2);
                            ApsMetrics.customEvent("AD_CLICK_LAUNCH_MSHOP_URL_INTENT", "SUCCESS", null);
                        }
                    }
                    onAdLeftApplication();
                } catch (ActivityNotFoundException e12) {
                    DtbLog.debug(LOG_TAG, "Activity not found com.amazon.mobile.shopping");
                    fireErrorEvent("open", "mshop activity not found");
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AD_CLICK_mshop activity not found", e12);
                } catch (NullPointerException e13) {
                    DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                    fireErrorEvent("open", "current activity from AdRegistration not found");
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AD_CLICK_current activity from AdRegistration not found", e13);
                }
            } else if ("market".equals(uri.getScheme()) || ApsAdWebViewSupportClient.AMAZON_SCHEME.equals(uri.getScheme())) {
                try {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setData(uri);
                    AdRegistration.getCurrentActivity().startActivity(intent3);
                    onAdLeftApplication();
                    ApsMetrics.customEvent("AD_CLICK_LAUNCH_PLAY_STORE_INTENT", "SUCCESS", null);
                } catch (ActivityNotFoundException e14) {
                    try {
                        DTBAdUtil.directAppStoreLinkToBrowser(this, uri);
                    } catch (ActivityNotFoundException unused) {
                        DtbLog.debug(LOG_TAG, "App stores and browsers not found");
                        fireErrorEvent("open", "app stores and browsers not found");
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AD_CLICK_app stores and browsers not found", e14);
                    } catch (NullPointerException unused2) {
                        DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                        fireErrorEvent("open", "current activity from AdRegistration not found");
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AD_CLICK_current activity from AdRegistration not found", e14);
                    }
                } catch (NullPointerException e15) {
                    DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                    fireErrorEvent("open", "current activity from AdRegistration not found");
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AD_CLICK_current activity from AdRegistration not found", e15);
                }
            } else {
                if (uri.getScheme() == null) {
                    uri = Uri.parse("https:" + str);
                }
                if (z10 && launchUrlInAppBrowser(uri)) {
                    ApsMetrics.customEvent("LAUNCH_IN_APP_BROWSER_INTENT", "SUCCESS", null);
                } else {
                    ApsMetrics.customEvent("LAUNCH_BROWSER_INTENT", String.valueOf(launchBrowserIntent(uri)), null);
                }
            }
            commandCompleted("open");
        } catch (Exception unused3) {
            fireErrorEvent("open", "invalid url " + str);
            commandCompleted("open");
        }
    }

    protected void addCloseIndicator(int i10, int i11, boolean z10) {
        removeCloseIndicator();
        addCloseIndicator(i10, i11, null, z10);
    }

    @SuppressLint({"ResourceType"})
    protected void addCloseIndicator(int i10, int i11, View.OnTouchListener onTouchListener, boolean z10) {
        createContentIndicator();
        DTBAdUtil.getRootView(getAdView()).addView(this.closeIndicatorRegion, DTBAdUtil.sizeToDevicePixels(50), DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setX(i10 - DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setY(i11);
        setCloseIndicatorContent(onTouchListener);
    }

    void setCurrentPositionProperty(float f10, float f11) {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], f10, f11);
        }
    }

    void setCurrentPositionProperty(int i10, int i11, float f10, float f11) {
        if (this.pageLoaded) {
            evaluateJavascript(String.format("window.mraidBridge.property.setCurrentPosition({'xPos':%.1f, 'yPos':%.1f, 'width': %.1f, 'height': %.1f});", Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(i10)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(i11)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels((int) f10)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels((int) f11))));
        }
    }
}
