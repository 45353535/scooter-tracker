package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.O2;
import com.ironsource.P2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class BannerAdView extends FrameLayout implements P2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O2 f67812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private BannerAdViewListener f67813b;

    private BannerAdView(Context context) {
        super(context);
    }

    @NotNull
    public final BannerAdInfo getAdInfo() {
        O2 o22 = this.f67812a;
        if (o22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerAdViewInternal");
            o22 = null;
        }
        return o22.c();
    }

    @Nullable
    public final BannerAdViewListener getListener() {
        return this.f67813b;
    }

    @Override // com.ironsource.P2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f67813b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.P2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f67813b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(@Nullable BannerAdViewListener bannerAdViewListener) {
        this.f67813b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(@NotNull O2 bannerAdViewInternal) {
        Intrinsics.checkNotNullParameter(bannerAdViewInternal, "bannerAdViewInternal");
        Context context = bannerAdViewInternal.d().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "bannerAdViewInternal.container.context");
        this(context);
        this.f67812a = bannerAdViewInternal;
        bannerAdViewInternal.a(new WeakReference<>(this));
        bannerAdViewInternal.b(new WeakReference<>(this));
    }
}
