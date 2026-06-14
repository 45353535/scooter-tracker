package com.yandex.mobile.ads.nativeads;

import com.ironsource.C4240b4;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdAssets;", "", "", "getBody", "()Ljava/lang/String;", "body", "getCallToAction", "callToAction", "getDomain", C4240b4.j.D, "Lcom/yandex/mobile/ads/nativeads/NativeAdImage;", "getIcon", "()Lcom/yandex/mobile/ads/nativeads/NativeAdImage;", "icon", "Lcom/yandex/mobile/ads/nativeads/NativeAdMedia;", "getMedia", "()Lcom/yandex/mobile/ads/nativeads/NativeAdMedia;", "media", "", "getRating", "()Ljava/lang/Float;", "rating", "getTitle", "title", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface NativeAdAssets {
    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    String getDomain();

    @Nullable
    NativeAdImage getIcon();

    @Nullable
    NativeAdMedia getMedia();

    @Nullable
    Float getRating();

    @Nullable
    String getTitle();
}
