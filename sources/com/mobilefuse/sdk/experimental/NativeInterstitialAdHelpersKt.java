package com.mobilefuse.sdk.experimental;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.mobilefuse.sdk.MobileFuseNativeAd;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.experimental.NativeInterstitialAdLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u000b\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"startNativeInterstitialActivity", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "bindViews", "Lcom/mobilefuse/sdk/experimental/NativeInterstitialAdLayout;", "canShow", "", "Lcom/mobilefuse/sdk/experimental/NativeInterstitialAdLayout$Companion;", "createLayoutView", "Landroid/view/View;", "Lcom/mobilefuse/sdk/experimental/NativeInterstitialActivity;", "onClosed", "tint", "Landroid/widget/Button;", "color", "", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class NativeInterstitialAdHelpersKt {
    public static final void bindViews(@NotNull NativeInterstitialAdLayout bindViews) throws Throwable {
        Intrinsics.checkNotNullParameter(bindViews, "$this$bindViews");
        ArrayList arrayList = new ArrayList();
        View rootView = bindViews.getRootView();
        TextView textView = (TextView) rootView.findViewById(R.id.headline_txt);
        View mainImageView = null;
        if (textView != null) {
            arrayList.add(textView);
            textView.setText(MobileFuseNativeAd.getTitle$default(bindViews.getNativeAd(), null, 1, null));
        }
        TextView textView2 = (TextView) rootView.findViewById(R.id.body_txt);
        if (textView2 != null) {
            arrayList.add(textView2);
            textView2.setText(MobileFuseNativeAd.getDescriptionText$default(bindViews.getNativeAd(), null, 1, null));
        }
        TextView textView3 = (TextView) rootView.findViewById(R.id.advertiser_txt);
        if (textView3 != null) {
            arrayList.add(textView3);
            textView3.setText(MobileFuseNativeAd.getSponsoredText$default(bindViews.getNativeAd(), null, 1, null));
        }
        Button button = (Button) rootView.findViewById(R.id.cta_btn);
        if (button != null) {
            String ctaButtonText$default = MobileFuseNativeAd.getCtaButtonText$default(bindViews.getNativeAd(), null, 1, null);
            if (StringsKt.y0(ctaButtonText$default)) {
                button.setVisibility(8);
            } else {
                tint(button, (int) 4282562560L);
                button.setVisibility(0);
                arrayList.add(button);
                button.setText(ctaButtonText$default);
            }
        }
        FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.icon_container);
        if (frameLayout != null) {
            arrayList.add(frameLayout);
            View iconView = bindViews.getNativeAd().getIconView();
            if (iconView != null) {
                frameLayout.setVisibility(0);
                frameLayout.addView(iconView, new FrameLayout.LayoutParams(-1, -1));
            } else {
                frameLayout.setVisibility(8);
            }
        }
        FrameLayout frameLayout2 = (FrameLayout) rootView.findViewById(R.id.media_view_container);
        if (frameLayout2 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (bindViews.getNativeAd().hasMainVideo()) {
                mainImageView = bindViews.getNativeAd().getMainVideoView();
            } else if (bindViews.getNativeAd().hasMainImage()) {
                layoutParams.height = -1;
                mainImageView = bindViews.getNativeAd().getMainImageView();
            }
            if (mainImageView == null) {
                return;
            }
            if (mainImageView.getParent() != null) {
                ViewParent parent = mainImageView.getParent();
                if (parent == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                ((ViewGroup) parent).removeView(mainImageView);
            }
            if (mainImageView instanceof ImageView) {
                ((ImageView) mainImageView).setScaleType(ImageView.ScaleType.FIT_START);
            }
            arrayList.add(frameLayout2);
            frameLayout2.addView(mainImageView, layoutParams);
        }
        bindViews.getNativeAd().registerViewForInteraction(bindViews.getRootView(), arrayList);
    }

    public static final boolean canShow(@NotNull NativeInterstitialAdLayout.Companion canShow) {
        Intrinsics.checkNotNullParameter(canShow, "$this$canShow");
        WeakReference<MobileFuseNativeAd> currentNativeAd = canShow.getCurrentNativeAd();
        return currentNativeAd == null || currentNativeAd.get() == null;
    }

    @Nullable
    public static final View createLayoutView(@NotNull NativeInterstitialActivity createLayoutView) {
        Intrinsics.checkNotNullParameter(createLayoutView, "$this$createLayoutView");
        try {
            return createLayoutView.getLayoutInflater().inflate(R.layout.mobilefuse_native_interstitial_layout, (ViewGroup) null);
        } catch (Throwable th2) {
            StabilityHelper.logException(createLayoutView, th2);
            return null;
        }
    }

    public static final void onClosed(@NotNull NativeInterstitialActivity onClosed) {
        Intrinsics.checkNotNullParameter(onClosed, "$this$onClosed");
        NativeInterstitialAdLayout.INSTANCE.releaseCurrentNativeAd$mobilefuse_sdk_core_release();
    }

    public static final void startNativeInterstitialActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) NativeInterstitialActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static final void tint(@NotNull Button tint, int i10) {
        Intrinsics.checkNotNullParameter(tint, "$this$tint");
        try {
            Drawable background = tint.getBackground();
            Intrinsics.checkNotNullExpressionValue(background, "background");
            background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_ATOP));
        } catch (Exception e10) {
            StabilityHelper.logException(tint, e10);
        }
    }
}
