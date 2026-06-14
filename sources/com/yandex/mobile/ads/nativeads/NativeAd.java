package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAd;", "", "Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;", "viewBinder", "", "bindNativeAd", "(Lcom/yandex/mobile/ads/nativeads/NativeAdViewBinder;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdEventListener;", "eventListener", "setNativeAdEventListener", "(Lcom/yandex/mobile/ads/nativeads/NativeAdEventListener;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdAssets;", "getAdAssets", "()Lcom/yandex/mobile/ads/nativeads/NativeAdAssets;", "adAssets", "Lcom/yandex/mobile/ads/nativeads/NativeAdType;", "getAdType", "()Lcom/yandex/mobile/ads/nativeads/NativeAdType;", "adType", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
public interface NativeAd {
    void bindNativeAd(@NotNull NativeAdViewBinder viewBinder) throws NativeAdException;

    @NotNull
    NativeAdAssets getAdAssets();

    @NotNull
    NativeAdType getAdType();

    void setNativeAdEventListener(@Nullable NativeAdEventListener eventListener);
}
