package com.amazon.device.ads;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.ironsource.C4240b4;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class DTBAdMRAIDBannerController extends DTBAdMRAIDController implements DTBMRAIDCloseButtonListener {
    private static final int ANIMATION_DURATION = 500;
    private static List<WeakReference<DTBAdMRAIDBannerController>> bannerControllers = new ArrayList();
    private static AtomicInteger indexDispencer = new AtomicInteger(100);
    private ObjectAnimator animater;
    private float animationProgress;
    public DTBAdBannerListener bannerListener;
    private ViewGroup defaultParent;
    private AnimationPoint endAnimation;
    private ViewGroup expandedBackground;
    private int index;
    private int originalHeight;
    private ViewGroup.LayoutParams originalParams;
    private int originalWidth;
    private float originalX;
    private int originalXPos;
    private float originalY;
    private int originalYPos;
    private AnimationPoint startAnimation;

    class AnimationPoint {
        int height;
        int width;
        int xPos;
        int yPos;

        AnimationPoint(int i10, int i11, int i12, int i13) {
            this.xPos = i10;
            this.yPos = i11;
            this.width = i12;
            this.height = i13;
        }
    }

    class BackgroundView extends LinearLayout {
        BackgroundView(Context context) {
            super(context);
            setOrientation(1);
        }
    }

    class ExpandedBannerListener implements DTBAdExpandedListener {
        ExpandedBannerListener() {
        }

        @Override // com.amazon.device.ads.DTBAdExpandedListener
        public void onAdLoaded(DTBAdView dTBAdView) {
        }

        @Override // com.amazon.device.ads.DTBAdExpandedListener
        public void onCreateExpandedController(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController) {
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.this);
        }
    }

    public DTBAdMRAIDBannerController(DTBAdView dTBAdView, DTBAdBannerListener dTBAdBannerListener) {
        super(dTBAdView);
        this.index = indexDispencer.incrementAndGet();
        this.bannerListener = dTBAdBannerListener;
        this.customButtonListener = this;
    }

    public static /* synthetic */ void e(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i10, int i11, int i12, int i13, ValueAnimator valueAnimator) {
        if (dTBAdMRAIDBannerController.updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            dTBAdMRAIDBannerController.fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i10), DTBAdUtil.pixelsToDeviceIndependenPixels(i11));
            dTBAdMRAIDBannerController.addCloseIndicator(i12 + i10, i13);
            dTBAdMRAIDBannerController.commandCompleted("resize");
            dTBAdMRAIDBannerController.setState(MraidStateType.RESIZED);
            dTBAdMRAIDBannerController.animater = null;
            dTBAdMRAIDBannerController.getAdView().computeExposure(true);
        }
    }

    private void executeOnePartExpand(Map<String, Object> map) {
        int i10;
        int i11;
        final boolean zBooleanValue;
        int iIntValue;
        int iIntValue2;
        this.originalX = getAdView().getX();
        this.originalY = getAdView().getY();
        ViewGroup rootView = DTBAdUtil.getRootView(getAdView());
        if (rootView == null) {
            fireErrorEvent("expand", "rootview doesn't exist in one part expand");
            commandCompleted("expand");
            return;
        }
        int[] iArr = new int[2];
        getAdView().getLocationInWindow(iArr);
        this.defaultParent = (ViewGroup) getAdView().getParent();
        this.originalParams = getAdView().getLayoutParams();
        getAdView().setIgnoreDetachment();
        this.defaultParent.removeView(getAdView());
        int[] iArr2 = new int[2];
        rootView.getLocationInWindow(iArr2);
        int height = rootView.getHeight();
        final int width = rootView.getWidth();
        this.startAnimation = new AnimationPoint(iArr[0] - iArr2[0], iArr[1] - iArr2[1], getAdView().getWidth(), getAdView().getHeight());
        if (map.containsKey(C4240b4.i.L) && (map.get(C4240b4.i.L) instanceof Map)) {
            Map map2 = (Map) map.get(C4240b4.i.L);
            int iSizeToDevicePixels = (!map2.containsKey("width") || (iIntValue2 = ((Integer) map2.get("width")).intValue()) <= 0) ? width : DTBAdUtil.sizeToDevicePixels(iIntValue2);
            if (map2.containsKey("height") && (iIntValue = ((Integer) map2.get("height")).intValue()) > 0) {
                height = DTBAdUtil.sizeToDevicePixels(iIntValue);
            }
            if (map2.containsKey("useCustomClose")) {
                zBooleanValue = ((Boolean) map2.get("useCustomClose")).booleanValue();
                i11 = iSizeToDevicePixels;
                i10 = height;
                BackgroundView backgroundView = new BackgroundView(getAdView().getContext());
                this.expandedBackground = backgroundView;
                backgroundView.setBackgroundColor(0);
                rootView.addView(backgroundView, -1, -1);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(getAdView().getWidth(), getAdView().getHeight());
                AnimationPoint animationPoint = this.startAnimation;
                marginLayoutParams.leftMargin = animationPoint.xPos;
                marginLayoutParams.topMargin = animationPoint.yPos;
                rootView.bringChildToFront(backgroundView);
                backgroundView.addView(getAdView(), marginLayoutParams);
                getAdView().setX(this.startAnimation.xPos);
                getAdView().setY(this.startAnimation.yPos);
                this.endAnimation = new AnimationPoint(0, 0, i11, i10);
                setCurrentPositionProperty(DTBAdUtil.pixelsToDeviceIndependenPixels(i11), DTBAdUtil.pixelsToDeviceIndependenPixels(i10));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
                this.animater = objectAnimatorOfFloat;
                objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.l
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        DTBAdMRAIDBannerController.o(this.f7445b, width, zBooleanValue, valueAnimator);
                    }
                });
                this.animater.setDuration(500L);
                this.animater.start();
            }
            i11 = iSizeToDevicePixels;
            i10 = height;
        } else {
            i10 = height;
            i11 = width;
        }
        zBooleanValue = false;
        BackgroundView backgroundView2 = new BackgroundView(getAdView().getContext());
        this.expandedBackground = backgroundView2;
        backgroundView2.setBackgroundColor(0);
        rootView.addView(backgroundView2, -1, -1);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(getAdView().getWidth(), getAdView().getHeight());
        AnimationPoint animationPoint2 = this.startAnimation;
        marginLayoutParams2.leftMargin = animationPoint2.xPos;
        marginLayoutParams2.topMargin = animationPoint2.yPos;
        rootView.bringChildToFront(backgroundView2);
        backgroundView2.addView(getAdView(), marginLayoutParams2);
        getAdView().setX(this.startAnimation.xPos);
        getAdView().setY(this.startAnimation.yPos);
        this.endAnimation = new AnimationPoint(0, 0, i11, i10);
        setCurrentPositionProperty(DTBAdUtil.pixelsToDeviceIndependenPixels(i11), DTBAdUtil.pixelsToDeviceIndependenPixels(i10));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DTBAdMRAIDBannerController.o(this.f7445b, width, zBooleanValue, valueAnimator);
            }
        });
        this.animater.setDuration(500L);
        this.animater.start();
    }

    private void executeTwoPartsExpand(Map<String, Object> map) {
        String str = (String) map.get("url");
        Activity activity = DTBAdUtil.getActivity(getAdView());
        Intent intent = new Intent(activity, (Class<?>) DTBAdActivity.class);
        if (str != null) {
            intent.putExtra("url", str);
        }
        intent.putExtra("ad_state", "expanded");
        intent.putExtra("cntrl_index", this.index);
        intent.putExtra("two_part_expand", true);
        if (map.get("orientation") != null) {
            intent.putExtra("orientation", (Serializable) map.get("orientation"));
        }
        activity.startActivity(intent);
        commandCompleted("expand");
        setState(MraidStateType.EXPANDED);
        bannerControllers.add(new WeakReference<>(this));
    }

    static DTBAdMRAIDBannerController findControllerByIndex(int i10) {
        Iterator<WeakReference<DTBAdMRAIDBannerController>> it = bannerControllers.iterator();
        while (it.hasNext()) {
            DTBAdMRAIDBannerController dTBAdMRAIDBannerController = it.next().get();
            if (dTBAdMRAIDBannerController != null && dTBAdMRAIDBannerController.index == i10) {
                return dTBAdMRAIDBannerController;
            }
        }
        return null;
    }

    public static /* synthetic */ void g(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
        dTBAdMRAIDBannerController.commandCompleted("unload");
    }

    public static /* synthetic */ void h(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, Map map) {
        dTBAdMRAIDBannerController.getClass();
        if (((String) map.get("url")) != null) {
            dTBAdMRAIDBannerController.executeTwoPartsExpand(map);
        } else {
            dTBAdMRAIDBannerController.executeOnePartExpand(map);
        }
    }

    public static /* synthetic */ void i(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
        dTBAdMRAIDBannerController.commandCompleted("unload");
    }

    private boolean isVisibleRecyclerOrListView(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        if (viewParent.toString().toLowerCase().contains("recyclerview") || viewParent.toString().toLowerCase().contains("listview")) {
            return true;
        }
        return isVisibleRecyclerOrListView(viewParent.getParent());
    }

    public static /* synthetic */ void j(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
        dTBAdMRAIDBannerController.commandCompleted("unload");
    }

    public static /* synthetic */ void k(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        dTBAdMRAIDBannerController.bannerListener.onAdOpen(dTBAdMRAIDBannerController.adView);
        dTBAdMRAIDBannerController.bannerListener.onAdLeftApplication(dTBAdMRAIDBannerController.adView);
    }

    public static /* synthetic */ void l(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, ViewGroup viewGroup, boolean z10, ValueAnimator valueAnimator) {
        if (dTBAdMRAIDBannerController.updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            dTBAdMRAIDBannerController.updateExpandedToDefaultListener(viewGroup, z10);
        }
    }

    private void moveExpandedToDefault() {
        moveExpandedToDefault(500, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveExpandedToDefaultImpl(int i10, final boolean z10) {
        ViewGroup viewGroup;
        AnimationPoint animationPoint = this.startAnimation;
        this.startAnimation = this.endAnimation;
        this.endAnimation = animationPoint;
        final ViewGroup viewGroup2 = (ViewGroup) getAdView().getParent();
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout != null && (viewGroup = (ViewGroup) linearLayout.getParent()) != null) {
            viewGroup.removeView(this.closeIndicatorRegion);
            this.closeIndicatorRegion = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DTBAdMRAIDBannerController.l(this.f7427b, viewGroup2, z10, valueAnimator);
            }
        });
        this.animater.setDuration(i10);
        this.animater.start();
    }

    private void moveResizedToDefault() {
        moveResizedToDefault(500, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveResizedToDefaultImpl(int i10, final boolean z10) {
        AnimationPoint animationPoint = this.startAnimation;
        this.startAnimation = this.endAnimation;
        this.endAnimation = animationPoint;
        animationPoint.height = this.originalHeight;
        animationPoint.width = this.originalWidth;
        animationPoint.xPos = this.originalXPos;
        animationPoint.yPos = this.originalYPos;
        final ViewGroup viewGroup = (ViewGroup) getAdView().getParent();
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout != null) {
            viewGroup.removeView(linearLayout);
            this.closeIndicatorRegion = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DTBAdMRAIDBannerController.s(this.f7464b, viewGroup, z10, valueAnimator);
            }
        });
        this.animater.setDuration(i10);
        this.animater.start();
    }

    public static /* synthetic */ void o(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i10, boolean z10, ValueAnimator valueAnimator) {
        if (dTBAdMRAIDBannerController.updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            dTBAdMRAIDBannerController.addCloseIndicator(i10, 0, z10);
            dTBAdMRAIDBannerController.fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(dTBAdMRAIDBannerController.endAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(dTBAdMRAIDBannerController.endAnimation.height));
            dTBAdMRAIDBannerController.setState(MraidStateType.EXPANDED);
            dTBAdMRAIDBannerController.commandCompleted("expand");
            dTBAdMRAIDBannerController.animater = null;
            dTBAdMRAIDBannerController.getAdView().computeExposure(true);
            dTBAdMRAIDBannerController.getAdView().setScrollEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[PHI: r3 r5
  0x00b4: PHI (r3v3 int) = (r3v2 int), (r3v15 int) binds: [B:10:0x009f, B:19:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r5v3 int) = (r5v2 int), (r5v12 int) binds: [B:10:0x009f, B:19:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc A[PHI: r0 r2
  0x00fc: PHI (r0v4 int) = (r0v3 int), (r0v16 int) binds: [B:24:0x00e4, B:35:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r2v8 int) = (r2v7 int), (r2v14 int) binds: [B:24:0x00e4, B:35:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResizeImpl(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdMRAIDBannerController.onResizeImpl(int, int, int, int, boolean):void");
    }

    public static /* synthetic */ void s(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, ViewGroup viewGroup, boolean z10, ValueAnimator valueAnimator) {
        if (dTBAdMRAIDBannerController.updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            dTBAdMRAIDBannerController.updateResizedToDefaultListener(viewGroup, z10);
        }
    }

    private Float updateAdViewLayout(ValueAnimator valueAnimator) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = getAdView().getLayoutParams();
        getAdView().setX(this.startAnimation.xPos + ((this.endAnimation.xPos - r2) * f10.floatValue()));
        getAdView().setY(this.startAnimation.yPos + ((this.endAnimation.yPos - r2) * f10.floatValue()));
        layoutParams.width = (int) (this.startAnimation.width + ((this.endAnimation.width - r1) * f10.floatValue()));
        layoutParams.height = (int) (this.startAnimation.height + ((this.endAnimation.height - r1) * f10.floatValue()));
        getAdView().setLayoutParams(layoutParams);
        getAdView().invalidate();
        return f10;
    }

    private void updateExpandedToDefaultListener(ViewGroup viewGroup, boolean z10) {
        getAdView().setIgnoreDetachment();
        viewGroup.removeView(getAdView());
        this.startAnimation = this.endAnimation;
        ViewGroup viewGroup2 = this.expandedBackground;
        if (viewGroup2 != null) {
            ((ViewGroup) viewGroup2.getParent()).removeView(this.expandedBackground);
            this.expandedBackground = null;
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.startAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.startAnimation.height));
        }
        if (this.originalParams != null) {
            this.defaultParent.addView(getAdView(), this.originalParams);
            this.defaultParent.requestLayout();
        }
        setCurrentPositionProperty();
        setState(MraidStateType.DEFAULT);
        getAdView().setScrollEnabled(false);
        commandCompleted("close");
        this.defaultParent = null;
        this.animater = null;
        if (z10) {
            new Handler().postDelayed(new Runnable() { // from class: com.amazon.device.ads.n
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.j(this.f7450b);
                }
            }, 500L);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.amazon.device.ads.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f7452b.getAdView().computeExposure(true);
            }
        }, 100L);
    }

    private void updateResizedToDefaultListener(ViewGroup viewGroup, boolean z10) {
        getAdView().setIgnoreDetachment();
        viewGroup.removeView(getAdView());
        this.startAnimation = this.endAnimation;
        if (this.originalParams != null) {
            this.defaultParent.addView(getAdView(), this.originalParams);
            this.defaultParent.requestLayout();
        }
        getAdView().invalidate();
        setCurrentPositionProperty();
        this.defaultParent = null;
        fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.height));
        setState(MraidStateType.DEFAULT);
        this.animater = null;
        commandCompleted("close");
        if (z10) {
            new Handler().postDelayed(new Runnable() { // from class: com.amazon.device.ads.q
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.g(this.f7458b);
                }
            }, 500L);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.amazon.device.ads.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f7459b.getAdView().computeExposure(true);
            }
        }, 100L);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void closeExpandedPartTwo() {
        setState(MraidStateType.DEFAULT);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void expand(final Map<String, Object> map) {
        if (this.state.equals(MraidStateType.DEFAULT)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.j
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.h(this.f7437b, map);
                }
            });
        } else {
            fireErrorEvent("expand", "current state does not allow transition to expand");
            commandCompleted("expand");
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected String getPlacementType() {
        return "inline";
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void impressionFired() {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.u
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController dTBAdMRAIDBannerController = this.f7474b;
                dTBAdMRAIDBannerController.bannerListener.onImpressionFired(dTBAdMRAIDBannerController.adView);
            }
        });
        super.impressionFired();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
        this.bannerListener.onAdClosed(this.adView);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdClicked() {
        final DTBAdView dTBAdView = this.adView;
        if (this.bannerListener != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7455b.bannerListener.onAdClicked(dTBAdView);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdFailedToLoad() {
        if (this.bannerListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to get bannerListener on onAdFailedToLoad");
            return;
        }
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.m
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController dTBAdMRAIDBannerController = this.f7448b;
                dTBAdMRAIDBannerController.bannerListener.onAdFailed(dTBAdMRAIDBannerController.adView);
            }
        });
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.h
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController.k(this.f7431b);
            }
        });
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLoaded() {
        if (this.bannerListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to get bannerListener on OnAdLoaded");
        } else {
            DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController dTBAdMRAIDBannerController = this.f7417b;
                    dTBAdMRAIDBannerController.bannerListener.onAdLoaded(dTBAdMRAIDBannerController.adView);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdRemoved() {
        ViewGroup viewGroup;
        if (this.adView == null) {
            return;
        }
        super.onAdRemoved();
        removeCloseIndicator();
        ObjectAnimator objectAnimator = this.animater;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        if (!isVisibleRecyclerOrListView(this.adView.getParent())) {
            this.adView.setVisibility(8);
        }
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            ViewParent parent = this.adView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.adView);
                return;
            }
            return;
        }
        if (mraidStateType == MraidStateType.EXPANDED && (viewGroup = this.expandedBackground) != null && (viewGroup.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.expandedBackground.getParent()).removeView(this.expandedBackground);
        }
    }

    protected boolean onBackPressed() {
        return false;
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void onMRAIDClose() {
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            moveResizedToDefault();
            return;
        }
        if (mraidStateType == MraidStateType.EXPANDED) {
            moveExpandedToDefault();
            return;
        }
        if (mraidStateType == MraidStateType.DEFAULT) {
            setState(MraidStateType.HIDDEN);
            commandCompleted("close");
            return;
        }
        fireErrorEvent("close", "Command is not allowed in a given ad state:" + this.state.toString());
        commandCompleted("close");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void onMRAIDUnload() {
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            moveResizedToDefault(10, true);
        } else if (mraidStateType == MraidStateType.EXPANDED) {
            moveExpandedToDefault(10, true);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDBannerController.i(this.f7425b);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onPageLoad() {
        try {
            if (!this.pageLoaded) {
                prepareMraid();
                if (DTBMetricsConfiguration.getInstance().isFeatureEnabled("additional_webview_metric", false)) {
                    ApsMetrics.customEvent("bannerCreativeFinished", getAdView().getBidId(), null);
                }
            }
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute onPageLoad for Banner", e10);
        }
        this.originalParams = getAdView().getLayoutParams();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void onResize(Map<String, Object> map) {
        MraidStateType mraidStateType = this.state;
        if (mraidStateType != MraidStateType.DEFAULT && mraidStateType != MraidStateType.RESIZED) {
            fireErrorEvent("resize", "invalid current state");
            commandCompleted("resize");
            return;
        }
        try {
            final int iIntValue = map.containsKey("offsetX") ? ((Integer) map.get("offsetX")).intValue() : 0;
            final int iIntValue2 = map.containsKey("offsetY") ? ((Integer) map.get("offsetY")).intValue() : 0;
            final int iIntValue3 = ((Integer) map.get("width")).intValue();
            final int iIntValue4 = ((Integer) map.get("height")).intValue();
            final boolean zBooleanValue = ((Boolean) map.get("allowOffscreen")).booleanValue();
            try {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7408b.onResizeImpl(iIntValue, iIntValue2, iIntValue3, iIntValue4, zBooleanValue);
                    }
                });
            } catch (Exception unused) {
                fireErrorEvent("resize", "invalid input parameters");
                commandCompleted("resize");
            }
        } catch (Exception unused2) {
        }
    }

    void openExpanded() {
        setState(MraidStateType.EXPANDED);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    void passLoadError() {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController dTBAdMRAIDBannerController = this.f7415b;
                dTBAdMRAIDBannerController.bannerListener.onAdError(dTBAdMRAIDBannerController.adView);
            }
        });
    }

    public void setAnimationProgress(float f10) {
        this.animationProgress = f10;
    }

    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
    public void useCustomButtonUpdated() {
        if (this.state != MraidStateType.EXPANDED || this.closeIndicatorRegion == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.s
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDBannerController dTBAdMRAIDBannerController = this.f7461b;
                dTBAdMRAIDBannerController.closeIndicatorRegion.setVisibility(dTBAdMRAIDBannerController.useCustomClose ? 4 : 0);
            }
        });
    }

    private void moveExpandedToDefault(final int i10, final boolean z10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f7441b.moveExpandedToDefaultImpl(i10, z10);
            }
        });
    }

    private void moveResizedToDefault(final int i10, final boolean z10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f7433b.moveResizedToDefaultImpl(i10, z10);
            }
        });
    }
}
