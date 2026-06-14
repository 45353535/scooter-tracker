package com.mobilefuse.sdk.experimental;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseNativeAd;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.core.R;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/experimental/NativeInterstitialActivity;", "Landroid/app/Activity;", "()V", "nativeAd", "Lcom/mobilefuse/sdk/MobileFuseNativeAd;", "getNativeAd", "()Lcom/mobilefuse/sdk/MobileFuseNativeAd;", "addNativeAdLayout", "", "container", "Landroid/widget/FrameLayout;", "closeAd", "", "createLayout", "Lcom/mobilefuse/sdk/experimental/NativeInterstitialAdLayout;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class NativeInterstitialActivity extends Activity {

    @Nullable
    private final MobileFuseNativeAd nativeAd;

    public NativeInterstitialActivity() {
        WeakReference<MobileFuseNativeAd> currentNativeAd = NativeInterstitialAdLayout.INSTANCE.getCurrentNativeAd();
        this.nativeAd = currentNativeAd != null ? currentNativeAd.get() : null;
    }

    private final boolean addNativeAdLayout(MobileFuseNativeAd nativeAd, final FrameLayout container) {
        final NativeInterstitialAdLayout nativeInterstitialAdLayoutCreateLayout = createLayout(nativeAd);
        if (nativeInterstitialAdLayoutCreateLayout == null) {
            return false;
        }
        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.experimental.NativeInterstitialActivity.addNativeAdLayout.1
            @Override // java.lang.Runnable
            public final void run() {
                container.addView(nativeInterstitialAdLayoutCreateLayout.getRootView(), layoutParams);
            }
        }, 100L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeAd() {
        finish();
    }

    private final NativeInterstitialAdLayout createLayout(MobileFuseNativeAd nativeAd) {
        View viewCreateLayoutView = NativeInterstitialAdHelpersKt.createLayoutView(this);
        if (viewCreateLayoutView == null) {
            MobileFuse.logError("Can't show NativeInterstitialAdLayout due created root view is null.");
            return null;
        }
        NativeInterstitialAdLayout nativeInterstitialAdLayout = new NativeInterstitialAdLayout(nativeAd, viewCreateLayoutView);
        try {
            NativeInterstitialAdHelpersKt.bindViews(nativeInterstitialAdLayout);
            return nativeInterstitialAdLayout;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            MobileFuse.logError("Can't show NativeInterstitialAdLayout due exception in view binding.");
            return null;
        }
    }

    @Nullable
    public final MobileFuseNativeAd getNativeAd() {
        return this.nativeAd;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobilefuse_native_interstitial_fullscreen);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ad_container);
        if (frameLayout == null) {
            closeAd();
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.close_btn);
        if (imageView == null) {
            closeAd();
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mobilefuse.sdk.experimental.NativeInterstitialActivity.onCreate.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NativeInterstitialActivity.this.closeAd();
            }
        });
        MobileFuseNativeAd mobileFuseNativeAd = this.nativeAd;
        if (mobileFuseNativeAd == null) {
            closeAd();
        } else {
            if (addNativeAdLayout(mobileFuseNativeAd, frameLayout)) {
                return;
            }
            closeAd();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        NativeInterstitialAdHelpersKt.onClosed(this);
        super.onDestroy();
    }
}
