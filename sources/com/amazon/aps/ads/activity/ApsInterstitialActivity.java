package com.amazon.aps.ads.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.R;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.ads.util.ApsMraidCloseButtonListener;
import com.amazon.aps.ads.util.ApsMraidHandler;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdUtil;
import com.amazon.device.ads.DTBMRAIDCloseButtonListener;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.taurusx.tax.f.y;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/amazon/aps/ads/activity/ApsInterstitialActivity;", "Landroid/app/Activity;", "Lcom/amazon/aps/ads/util/ApsMraidCloseButtonListener;", "<init>", "()V", "TAG", "", "apsAdViewRef", "Ljava/lang/ref/WeakReference;", "Lcom/amazon/aps/ads/ApsAdView;", "imageParams", "Landroid/widget/LinearLayout$LayoutParams;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView$delegate", "Lkotlin/Lazy;", "closeIndicatorRegion", "Landroid/widget/LinearLayout;", "getCloseIndicatorRegion", "()Landroid/widget/LinearLayout;", "setCloseIndicatorRegion", "(Landroid/widget/LinearLayout;)V", "handleApsAdView", "", "apsAdView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "attachWebView", "prepareCloseButtonRegion", "getUseCustomClose", "", "initActivity", "cleanAndFinishAdView", "clean", "onBackPressed", "useCustomButtonUpdated", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsInterstitialActivity extends Activity implements ApsMraidCloseButtonListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static WeakReference<ApsAdView> adViewRefPassed;

    @NotNull
    private final String TAG = "ApsInterstitialActivity";

    @Nullable
    private WeakReference<ApsAdView> apsAdViewRef;

    @Nullable
    private LinearLayout closeIndicatorRegion;

    @NotNull
    private final LinearLayout.LayoutParams imageParams;

    /* JADX INFO: renamed from: imageView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy imageView;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/aps/ads/activity/ApsInterstitialActivity$Companion;", "", "<init>", "()V", "adViewRefPassed", "Ljava/lang/ref/WeakReference;", "Lcom/amazon/aps/ads/ApsAdView;", "getAdViewRefPassed", "()Ljava/lang/ref/WeakReference;", "setAdViewRefPassed", "(Ljava/lang/ref/WeakReference;)V", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final WeakReference<ApsAdView> getAdViewRefPassed() {
            return ApsInterstitialActivity.adViewRefPassed;
        }

        public final void setAdViewRefPassed(@Nullable WeakReference<ApsAdView> weakReference) {
            ApsInterstitialActivity.adViewRefPassed = weakReference;
        }

        private Companion() {
        }
    }

    public ApsInterstitialActivity() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
        layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
        this.imageParams = layoutParams;
        this.imageView = i.a(new Function0() { // from class: s0.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsInterstitialActivity.imageView_delegate$lambda$2(this.f99543b);
            }
        });
    }

    private final void attachWebView() {
        ApsLog.d(this.TAG, "Attaching the ApsAdView");
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        ApsAdView apsAdView = weakReference != null ? weakReference.get() : null;
        if (apsAdView != null) {
            apsAdView.setScrollEnabled(false);
            ViewParent parent = apsAdView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(apsAdView);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.inter_container);
        if (relativeLayout != null) {
            relativeLayout.addView(apsAdView, -1, -1);
        }
        prepareCloseButtonRegion();
    }

    private final void clean() {
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        if (weakReference != null) {
            weakReference.clear();
            this.apsAdViewRef = null;
        }
    }

    private final void cleanAndFinishAdView() {
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        ApsAdView apsAdView = weakReference != null ? weakReference.get() : null;
        if (apsAdView != null && apsAdView.getMraidHandler() != null) {
            apsAdView.evaluateJavascript(ApsMraidHandler.INSTANCE.getMRAID_CLOSE(), null);
        }
        clean();
        finish();
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView.getValue();
    }

    private final boolean getUseCustomClose() {
        DTBAdMRAIDController mraidHandler;
        try {
            WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
            ApsAdView apsAdView = weakReference != null ? weakReference.get() : null;
            if (apsAdView == null || (mraidHandler = apsAdView.getMraidHandler()) == null) {
                return false;
            }
            return mraidHandler.isUseCustomClose();
        } catch (Exception e10) {
            e10.printStackTrace();
            ApsAdExtensionsKt.e(this, "Error in using the flag isUseCustomClose:" + Unit.f93236a);
            return false;
        }
    }

    private final void handleApsAdView(ApsAdView apsAdView) {
        if (apsAdView != null) {
            try {
                ApsLog.d(this.TAG, "Received the ApsAdView");
                this.apsAdViewRef = new WeakReference<>(apsAdView);
                adViewRefPassed = null;
                attachWebView();
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error rendering the ApsInterstitial activity ApsAdView", e10);
                finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView imageView_delegate$lambda$2(ApsInterstitialActivity apsInterstitialActivity) {
        ImageView imageView = new ImageView(apsInterstitialActivity);
        imageView.setImageDrawable(AppCompatResources.getDrawable(apsInterstitialActivity, R.drawable.mraid_close));
        return imageView;
    }

    private final void initActivity() {
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            setContentView(R.layout.aps_interstitial_activity);
            ApsLog.d(this.TAG, "Init window completed");
        } catch (RuntimeException e10) {
            ApsLog.e(this.TAG, "Error in calling the initActivity: " + e10);
        }
    }

    private final void prepareCloseButtonRegion() {
        DTBAdMRAIDController mraidHandler;
        LinearLayout closeIndicatorRegion = getCloseIndicatorRegion();
        if (closeIndicatorRegion != null) {
            WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
            ApsAdView apsAdView = weakReference != null ? weakReference.get() : null;
            if (apsAdView != null && (mraidHandler = apsAdView.getMraidHandler()) != null) {
                mraidHandler.setCustomButtonListener(new DTBMRAIDCloseButtonListener() { // from class: s0.a
                    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
                    public final void useCustomButtonUpdated() {
                        this.f99540b.useCustomButtonUpdated();
                    }
                });
                DtbOmSdkSessionManager omSdkManager = apsAdView.getOmSdkManager();
                if (omSdkManager != null) {
                    omSdkManager.addFriendlyObstruction(findViewById(R.id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
                }
            }
            closeIndicatorRegion.setVisibility(getUseCustomClose() ? 4 : 0);
            closeIndicatorRegion.bringToFront();
            closeIndicatorRegion.setBackgroundColor(0);
            closeIndicatorRegion.setOrientation(1);
            closeIndicatorRegion.addView(getImageView(), this.imageParams);
            closeIndicatorRegion.setOnTouchListener(new View.OnTouchListener() { // from class: s0.b
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ApsInterstitialActivity.prepareCloseButtonRegion$lambda$12$lambda$11(this.f99541b, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean prepareCloseButtonRegion$lambda$12$lambda$11(ApsInterstitialActivity apsInterstitialActivity, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        apsInterstitialActivity.cleanAndFinishAdView();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void useCustomButtonUpdated$lambda$17(ApsInterstitialActivity apsInterstitialActivity) {
        apsInterstitialActivity.findViewById(R.id.mraid_close_indicator).setVisibility(apsInterstitialActivity.getUseCustomClose() ? 4 : 0);
    }

    @Nullable
    public final LinearLayout getCloseIndicatorRegion() {
        return (LinearLayout) findViewById(R.id.mraid_close_indicator);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            if (getUseCustomClose()) {
                return;
            }
            cleanAndFinishAdView();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute onBackPressed method", e10);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            initActivity();
            WeakReference<ApsAdView> weakReference = adViewRefPassed;
            if (weakReference != null) {
                handleApsAdView(weakReference != null ? weakReference.get() : null);
            } else {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to create ApsInterstitialActivity as the ad view is null");
                finish();
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to create ApsInterstitialActivity", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.inter_container);
            if (relativeLayout != null) {
                WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
                relativeLayout.removeView(weakReference != null ? weakReference.get() : null);
            }
            WeakReference<ApsAdView> weakReference2 = this.apsAdViewRef;
            if (weakReference2 != null) {
                ApsAdView apsAdView = weakReference2.get();
                if (apsAdView != null) {
                    apsAdView.evaluateJavascript(DTBAdMRAIDController.MRAID_CLOSE, null);
                }
                clean();
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to remove DTBAdView on Activity Destroy", e10);
        }
        super.onDestroy();
    }

    public final void setCloseIndicatorRegion(@Nullable LinearLayout linearLayout) {
        this.closeIndicatorRegion = linearLayout;
    }

    @Override // com.amazon.aps.ads.util.ApsMraidCloseButtonListener
    public void useCustomButtonUpdated() {
        WeakReference<ApsAdView> weakReference;
        ApsAdView apsAdView;
        DTBAdMRAIDController controller;
        DtbOmSdkSessionManager dtbOmSdkSessionManager;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: s0.c
            @Override // java.lang.Runnable
            public final void run() {
                ApsInterstitialActivity.useCustomButtonUpdated$lambda$17(this.f99542b);
            }
        });
        try {
            if (getUseCustomClose() || (weakReference = this.apsAdViewRef) == null || (apsAdView = weakReference.get()) == null || (controller = apsAdView.getController()) == null || (dtbOmSdkSessionManager = controller.getDtbOmSdkSessionManager()) == null) {
                return;
            }
            dtbOmSdkSessionManager.addFriendlyObstruction(findViewById(R.id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, " OMSDK : Unable to add close icon as friendly obstruction on geometry change", e10);
        }
    }
}
