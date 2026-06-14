package com.ironsource.adapters.ironsource.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C8;
import com.ironsource.D8;
import com.ironsource.F8;
import com.ironsource.G8;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {

    @NotNull
    private final F8 nativeAd;

    @NotNull
    private final NativeAdProperties nativeAdProperties;

    @Nullable
    private C8 networkNativeAdView;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            try {
                iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(@NotNull F8 nativeAd, @NotNull NativeAdProperties nativeAdProperties) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    @SuppressLint({"RtlHardcoded"})
    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i11 == 1) {
            i10 = 51;
        } else if (i11 == 2) {
            i10 = 53;
        } else if (i11 == 3) {
            i10 = 83;
        } else {
            if (i11 != 4) {
                throw new m();
            }
            i10 = 85;
        }
        layoutParams.gravity = i10;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(@Nullable View view) {
        if (view == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.c() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            D8 d8C = this.nativeAd.c();
            Intrinsics.checkNotNull(d8C);
            WebView webViewL = d8C.l();
            if (webViewL != null) {
                mediaView.addView(webViewL, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        D8 d8C2 = this.nativeAd.c();
        Intrinsics.checkNotNull(d8C2);
        View viewM = d8C2.m();
        viewM.setId(R.id.privacy_icon_button);
        viewM.setLayoutParams(getPrivacyIconLayoutParams());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C8 c82 = new C8(context);
        c82.addView(view);
        c82.addView(viewM);
        this.networkNativeAdView = c82;
        C8 networkNativeAdView = getNetworkNativeAdView();
        Intrinsics.checkNotNull(networkNativeAdView);
        this.nativeAd.a(new G8(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), viewM));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    @Nullable
    public C8 getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }
}
