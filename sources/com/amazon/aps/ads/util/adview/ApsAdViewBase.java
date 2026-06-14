package com.amazon.aps.ads.util.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ScrollView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBActivityListener;
import com.amazon.device.ads.DTBAdMRAIDBannerController;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdViewDisplayListener;
import com.amazon.device.ads.DTBTimeTrace;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.ironsource.Df;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020JH$J\u0010\u0010K\u001a\u00020G2\u0006\u0010I\u001a\u00020JH$J\b\u0010L\u001a\u00020GH$J\b\u0010M\u001a\u00020GH$J\u0010\u0010N\u001a\u00020G2\u0006\u0010O\u001a\u00020\bH$J\b\u0010P\u001a\u00020\bH\u0014J\b\u0010Q\u001a\u00020GH\u0004J\b\u0010R\u001a\u00020GH\u0016J(\u0010S\u001a\u00020G2\u0006\u0010T\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000bH\u0016J\b\u0010X\u001a\u0004\u0018\u00010YJ\b\u0010Z\u001a\u00020GH\u0014J\u0014\u0010[\u001a\u0004\u0018\u00010J2\b\u0010\\\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010]\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010^\u001a\u00020G2\u0006\u0010_\u001a\u00020\bH\u0016J\n\u0010`\u001a\u0004\u0018\u00010JH\u0016J\u001a\u0010a\u001a\u00020G2\u0006\u0010b\u001a\u00020\b2\b\b\u0002\u0010c\u001a\u00020\bH\u0014J\b\u0010d\u001a\u00020GH\u0016J\b\u0010e\u001a\u00020GH\u0014J\u0010\u0010f\u001a\u00020G2\u0006\u0010g\u001a\u00020\bH\u0016J\b\u0010h\u001a\u00020GH\u0016J\u0010\u0010i\u001a\u00020G2\u0006\u0010j\u001a\u00020kH\u0016J\b\u0010l\u001a\u00020GH\u0016J\u0010\u0010m\u001a\u00020G2\u0006\u0010n\u001a\u00020\u0000H\u0002J\u001a\u0010]\u001a\u00020G2\b\u0010\\\u001a\u0004\u0018\u00010Y2\u0006\u0010g\u001a\u00020\bH\u0014J\u0010\u0010o\u001a\u00020G2\u0006\u0010g\u001a\u00020\bH\u0016R\u0012\u0010\u0007\u001a\u00020\b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\r8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010(8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u0004\u0018\u00010*8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\"\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u0011\u001a\u0004\u0018\u00010+@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R$\u0010/\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u00109\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u000108@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010>\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u000108@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R$\u0010A\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R$\u0010D\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00105\"\u0004\bE\u00107¨\u0006p"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewBase;", "Landroid/webkit/WebView;", "Lcom/amazon/aps/ads/util/adview/ApsAdViewConstants;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ignoreDetachment", "", "isFirstDisplay", "exposurePercent", "", "timePressed", "", "timeClicked", "apsAdFormat", "Lcom/amazon/aps/ads/model/ApsAdFormat;", "value", "Lcom/amazon/device/ads/DTBAdMRAIDController;", "mraidHandler", "getMraidHandler", "()Lcom/amazon/device/ads/DTBAdMRAIDController;", "setMraidHandler", "(Lcom/amazon/device/ads/DTBAdMRAIDController;)V", "Lcom/amazon/aps/ads/metrics/ApsMetricsAdListenerAdapterBase;", "mraidListenerAdapter", "getMraidListenerAdapter", "()Lcom/amazon/aps/ads/metrics/ApsMetricsAdListenerAdapterBase;", "setMraidListenerAdapter", "(Lcom/amazon/aps/ads/metrics/ApsMetricsAdListenerAdapterBase;)V", "viewWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "getViewWeakReference", "()Ljava/lang/ref/WeakReference;", "setViewWeakReference", "(Ljava/lang/ref/WeakReference;)V", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "focusChangeListener", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "scrollChangeListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Lcom/amazon/device/ads/DtbOmSdkSessionManager;", "omSdkManager", "getOmSdkManager", "()Lcom/amazon/device/ads/DtbOmSdkSessionManager;", "startTime", "getStartTime", "()J", "setStartTime", "(J)V", "isVideo", "()Z", "setVideo", "(Z)V", "", "hostname", "getHostname", "()Ljava/lang/String;", "setHostname", "(Ljava/lang/String;)V", "bidId", "getBidId", "setBidId", "adViewScrollEnabled", "getAdViewScrollEnabled", "setAdViewScrollEnabled", "isAdViewVisible", "setAdViewVisible", "onExposureChange", "", "exposurePercentage", "adViewRect", "Landroid/graphics/Rect;", "onPositionChanged", Df.f40642c, "setCurrentPositionProperty", "onViewabilityChanged", "isChanged", "isMraidHandlerInitialized", "initLayoutListeners", "cleanup", "onScrollChanged", CmcdData.Factory.STREAM_TYPE_LIVE, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "oldl", "oldt", "getScrollViewParent", "Landroid/widget/ScrollView;", "initWebView", "computeAdViewRect", "scrollView", "computeExposureInScrollView", "setScrollEnabled", "enabled", "computeRootContainerRectInRootView", "notifyViewabilityAndSetIsVisible", "flag", "overrideValidation", "finalize", "verifyIsVisible", "computeExposureInRootView", "enforced", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onAttachedToWindow", "replaceWithBidderAdView", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "computeExposure", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ApsAdViewBase extends WebView implements ApsAdViewConstants {
    private boolean adViewScrollEnabled;

    @Nullable
    protected ApsAdFormat apsAdFormat;

    @Nullable
    private String bidId;
    protected int exposurePercent;

    @Nullable
    protected ViewTreeObserver.OnGlobalFocusChangeListener focusChangeListener;

    @Nullable
    protected ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;

    @Nullable
    private String hostname;
    protected boolean ignoreDetachment;
    private boolean isAdViewVisible;
    protected boolean isFirstDisplay;
    private boolean isVideo;

    @Nullable
    private DTBAdMRAIDController mraidHandler;

    @Nullable
    private ApsMetricsAdListenerAdapterBase mraidListenerAdapter;

    @Nullable
    private DtbOmSdkSessionManager omSdkManager;

    @Nullable
    protected ViewTreeObserver.OnScrollChangedListener scrollChangeListener;
    private long startTime;
    protected long timeClicked;
    protected long timePressed;

    @Nullable
    private WeakReference<View> viewWeakReference;

    /* JADX INFO: renamed from: com.amazon.aps.ads.util.adview.ApsAdViewBase$verifyIsVisible$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends y implements Function2<Boolean, Boolean, Unit> {
        AnonymousClass1(Object obj) {
            super(2, obj, ApsAdViewBase.class, "notifyViewabilityAndSetIsVisible", "notifyViewabilityAndSetIsVisible(ZZ)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
            invoke(bool.booleanValue(), bool2.booleanValue());
            return Unit.f93236a;
        }

        public final void invoke(boolean z10, boolean z11) {
            ((ApsAdViewBase) this.receiver).notifyViewabilityAndSetIsVisible(z10, z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsAdViewBase(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isFirstDisplay = true;
        this.exposurePercent = -1;
        this.adViewScrollEnabled = true;
        CookieManager.getInstance().setAcceptCookie(true);
        this.omSdkManager = DtbOmSdkSessionManager.getNewInstance();
    }

    public static /* synthetic */ void notifyViewabilityAndSetIsVisible$default(ApsAdViewBase apsAdViewBase, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyViewabilityAndSetIsVisible");
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        apsAdViewBase.notifyViewabilityAndSetIsVisible(z10, z11);
    }

    private final void replaceWithBidderAdView(ApsAdViewBase view) {
        ViewParent parent = view.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(view);
        WeakReference<View> weakReference = this.viewWeakReference;
        viewGroup.addView(weakReference != null ? weakReference.get() : null);
    }

    public void cleanup() {
    }

    @Nullable
    public Rect computeAdViewRect(@Nullable ScrollView scrollView) {
        return ApsAdViewUtils.INSTANCE.computeAdViewRect(this, scrollView);
    }

    public void computeExposure(boolean enforced) {
        ScrollView scrollViewParent = getScrollViewParent();
        if (scrollViewParent != null) {
            computeExposureInScrollView(scrollViewParent, enforced);
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        Rect rect = new Rect(i10, iArr[1], getWidth() + i10, iArr[1] + getHeight());
        if (isMraidHandlerInitialized()) {
            computeExposureInRootView(enforced);
            onPositionChanged(rect);
        }
    }

    public void computeExposureInRootView(boolean enforced) {
        Rect rectComputeRootContainerRectInRootView = computeRootContainerRectInRootView();
        if (rectComputeRootContainerRectInRootView != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i10 = iArr[0];
            Rect rect = new Rect(i10, iArr[1], getWidth() + i10, iArr[1] + getHeight());
            float width = getWidth() * getHeight();
            if (rect.intersect(rectComputeRootContainerRectInRootView)) {
                int i11 = (int) (((((double) ((rect.right - rect.left) * (rect.bottom - rect.top))) * 100.0d) / ((double) width)) + 0.5d);
                if (i11 != this.exposurePercent || enforced) {
                    this.exposurePercent = i11;
                    onExposureChange(i11, rect);
                    return;
                }
                return;
            }
            if (this.exposurePercent != 0 || enforced) {
                this.exposurePercent = 0;
                rect.top = rect.bottom;
                onExposureChange(0, rect);
            }
        }
    }

    public int computeExposureInScrollView(@NotNull Rect adViewRect) {
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        return ApsAdViewUtils.INSTANCE.computeExposureInScrollView(this, adViewRect);
    }

    @Nullable
    public Rect computeRootContainerRectInRootView() {
        return ApsAdViewUtils.INSTANCE.computeRootContainerRectInRootView(this);
    }

    public void finalize() {
        try {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.removeOnScrollChangedListener(this.scrollChangeListener);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.focusChangeListener);
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute finalize method", e10);
        }
    }

    protected final boolean getAdViewScrollEnabled() {
        return this.adViewScrollEnabled;
    }

    @Nullable
    public final String getBidId() {
        return this.bidId;
    }

    @Nullable
    public final String getHostname() {
        return this.hostname;
    }

    @Nullable
    public final DTBAdMRAIDController getMraidHandler() {
        return this.mraidHandler;
    }

    @Nullable
    public final ApsMetricsAdListenerAdapterBase getMraidListenerAdapter() {
        return this.mraidListenerAdapter;
    }

    @Nullable
    public final DtbOmSdkSessionManager getOmSdkManager() {
        return this.omSdkManager;
    }

    @Nullable
    public final ScrollView getScrollViewParent() {
        return ApsAdViewUtils.INSTANCE.getScrollViewParent(this);
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final WeakReference<View> getViewWeakReference() {
        return this.viewWeakReference;
    }

    protected final void initLayoutListeners() {
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.amazon.aps.ads.util.adview.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f7378b.verifyIsVisible();
            }
        };
        this.focusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.amazon.aps.ads.util.adview.b
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f7379b.verifyIsVisible();
            }
        };
        this.scrollChangeListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.amazon.aps.ads.util.adview.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f7380b.verifyIsVisible();
            }
        };
    }

    protected void initWebView() {
        ApsAdViewUtils.INSTANCE.initWebView(this);
    }

    /* JADX INFO: renamed from: isAdViewVisible, reason: from getter */
    public final boolean getIsAdViewVisible() {
        return this.isAdViewVisible;
    }

    protected boolean isMraidHandlerInitialized() {
        return this.mraidHandler != null;
    }

    /* JADX INFO: renamed from: isVideo, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    protected void notifyViewabilityAndSetIsVisible(boolean flag, boolean overrideValidation) {
        if (this.isAdViewVisible || overrideValidation) {
            if (isMraidHandlerInitialized()) {
                onViewabilityChanged(flag);
            }
            setAdViewVisible(flag);
        }
    }

    protected abstract void onAdOpened();

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            WeakReference<View> weakReference = this.viewWeakReference;
            if ((weakReference != null ? weakReference.get() : null) != null) {
                replaceWithBidderAdView(this);
                return;
            }
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.addOnGlobalFocusChangeListener(this.focusChangeListener);
                viewTreeObserver.addOnScrollChangedListener(this.scrollChangeListener);
            }
            if (isMraidHandlerInitialized()) {
                onAdOpened();
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onAttachedToWindow method", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        DtbOmSdkSessionManager dtbOmSdkSessionManager;
        try {
            super.onDetachedFromWindow();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.removeOnScrollChangedListener(this.scrollChangeListener);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.focusChangeListener);
            }
            DTBAdMRAIDController dTBAdMRAIDController = this.mraidHandler;
            if (dTBAdMRAIDController != null && (dTBAdMRAIDController instanceof DTBAdMRAIDBannerController) && (dtbOmSdkSessionManager = this.omSdkManager) != null && dtbOmSdkSessionManager != null) {
                dtbOmSdkSessionManager.stopOmAdSession();
            }
            WeakReference<View> weakReference = this.viewWeakReference;
            if ((weakReference != null ? weakReference.get() : null) == null) {
                this.mraidListenerAdapter = null;
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onDetachedFromWindow method in ApsAdView class", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.isFirstDisplay) {
            DTBTimeTrace dTBTimeTrace = DTBTimeTrace.getInstance();
            if (dTBTimeTrace != null && AdRegistration.isTestMode()) {
                dTBTimeTrace.addPhase(DTBTimeTrace.TIMETRACE_AD_DISPLAY_SUCCEEDED);
                dTBTimeTrace.logTrace();
            }
            DTBActivityListener dTBActivityListener = this.mraidHandler;
            if (dTBActivityListener instanceof DTBAdViewDisplayListener) {
                Intrinsics.checkNotNull(dTBActivityListener, "null cannot be cast to non-null type com.amazon.device.ads.DTBAdViewDisplayListener");
                ((DTBAdViewDisplayListener) dTBActivityListener).onInitialDisplay();
            }
            this.isFirstDisplay = false;
        }
    }

    protected abstract void onExposureChange(int exposurePercentage, @NotNull Rect adViewRect);

    protected abstract void onPositionChanged(@NotNull Rect adViewRect);

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int l10, int t10, int oldl, int oldt) {
        if (this.adViewScrollEnabled) {
            super.onScrollChanged(l10, t10, oldt, oldl);
        } else {
            scrollTo(0, 0);
        }
    }

    protected abstract void onViewabilityChanged(boolean isChanged);

    protected final void setAdViewScrollEnabled(boolean z10) {
        this.adViewScrollEnabled = z10;
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    protected final void setAdViewVisible(boolean z10) {
        this.isAdViewVisible = z10;
        if (z10) {
            return;
        }
        this.exposurePercent = -1;
        if (isMraidHandlerInitialized()) {
            onExposureChange(0, new Rect(0, 0, 0, 0));
        }
    }

    protected final void setBidId(@Nullable String str) {
        this.bidId = str;
        ApsMetricsAdListenerAdapterBase apsMetricsAdListenerAdapterBase = this.mraidListenerAdapter;
        if (apsMetricsAdListenerAdapterBase != null) {
            apsMetricsAdListenerAdapterBase.setBidId(str);
        }
    }

    protected abstract void setCurrentPositionProperty();

    protected final void setHostname(@Nullable String str) {
        this.hostname = str;
    }

    protected final void setMraidHandler(@Nullable DTBAdMRAIDController dTBAdMRAIDController) {
        this.mraidHandler = dTBAdMRAIDController;
    }

    protected final void setMraidListenerAdapter(@Nullable ApsMetricsAdListenerAdapterBase apsMetricsAdListenerAdapterBase) {
        this.mraidListenerAdapter = apsMetricsAdListenerAdapterBase;
    }

    public void setScrollEnabled(boolean enabled) {
        setAdViewScrollEnabled(enabled);
        setVerticalScrollBarEnabled(enabled);
        setHorizontalScrollBarEnabled(enabled);
    }

    protected final void setStartTime(long j10) {
        this.startTime = j10;
    }

    protected final void setVideo(boolean z10) {
        this.isVideo = z10;
    }

    public final void setViewWeakReference(@Nullable WeakReference<View> weakReference) {
        this.viewWeakReference = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void verifyIsVisible() {
        ApsAdExtensionsKt.d(this, "method verifyIsVisible called: " + this.isAdViewVisible);
        ApsAdViewUtils.INSTANCE.verifyIsVisible(this, this.isAdViewVisible, new AnonymousClass1(this));
        if (this.isAdViewVisible) {
            computeExposure(false);
        }
    }

    protected void computeExposureInScrollView(@Nullable ScrollView scrollView, boolean enforced) {
        Rect rectComputeAdViewRect = computeAdViewRect(scrollView);
        if (rectComputeAdViewRect != null) {
            int iComputeExposureInScrollView = computeExposureInScrollView(rectComputeAdViewRect);
            if (iComputeExposureInScrollView != this.exposurePercent || enforced) {
                this.exposurePercent = iComputeExposureInScrollView;
                onExposureChange(iComputeExposureInScrollView, rectComputeAdViewRect);
                setCurrentPositionProperty();
            }
        }
    }
}
