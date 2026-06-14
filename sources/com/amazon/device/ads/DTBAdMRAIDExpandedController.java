package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class DTBAdMRAIDExpandedController extends DTBAdMRAIDController {
    static final String LOG_TAG = "DTBAdMRAIDExpandedController";
    private DTBAdMRAIDBannerController masterController;

    DTBAdMRAIDExpandedController(DTBAdView dTBAdView) {
        super(dTBAdView);
    }

    public static /* synthetic */ boolean e(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController, View view, MotionEvent motionEvent) {
        dTBAdMRAIDExpandedController.getClass();
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dTBAdMRAIDExpandedController.closeExpandedPartTwo();
        return true;
    }

    void addCloseIndicator() {
        addCloseIndicator(new View.OnTouchListener() { // from class: com.amazon.device.ads.z
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DTBAdMRAIDExpandedController.e(this.f7487b, view, motionEvent);
            }
        });
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void closeExpandedPartTwo() {
        DTBAdMRAIDBannerController dTBAdMRAIDBannerControllerFindControllerByIndex;
        DTBAdActivity dTBAdActivity = (DTBAdActivity) DTBAdUtil.getActivity(getAdView());
        Intent intent = dTBAdActivity.getIntent();
        if (intent != null && (dTBAdMRAIDBannerControllerFindControllerByIndex = DTBAdMRAIDBannerController.findControllerByIndex(intent.getIntExtra("cntrl_index", -1))) != null) {
            dTBAdMRAIDBannerControllerFindControllerByIndex.closeExpandedPartTwo();
        }
        dTBAdActivity.straightFinish();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void expand(Map<String, Object> map) {
        fireErrorEvent("expand", "Expanded View does not allow expand");
        commandCompleted("expand");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected MraidStateType getInitialStateType() {
        return MraidStateType.EXPANDED;
    }

    protected void layoutCloseIndicator() {
        ViewGroup rootView = DTBAdUtil.getRootView(getAdView());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(50), DTBAdUtil.sizeToDevicePixels(50));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 0;
        rootView.addView(this.closeIndicatorRegion, layoutParams);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLeftApplication() {
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void onMRAIDClose() {
        closeExpandedPartTwo();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onPageLoad() {
        try {
            prepareMraid();
            if (getDtbOmSdkSessionManager() != null) {
                getDtbOmSdkSessionManager().registerAdView(getAdView());
            }
        } catch (JSONException e10) {
            DtbLog.error("Error:" + e10.getMessage());
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void onResize(Map<String, Object> map) {
        fireErrorEvent("resize", "Expanded View does not allow resize");
        commandCompleted("resize");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    void passLoadError() {
        DTBAdMRAIDBannerController dTBAdMRAIDBannerController = this.masterController;
        if (dTBAdMRAIDBannerController != null) {
            dTBAdMRAIDBannerController.passLoadError();
        }
    }

    void setMasterController(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        this.masterController = dTBAdMRAIDBannerController;
    }

    @SuppressLint({"ResourceType"})
    void addCloseIndicator(View.OnTouchListener onTouchListener) {
        createContentIndicator();
        layoutCloseIndicator();
        setCloseIndicatorContent(onTouchListener);
    }
}
