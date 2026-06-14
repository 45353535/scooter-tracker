package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import com.ironsource.Df;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/inmobi/ads/listeners/NativeAdEventListener;", "Lcom/inmobi/ads/listeners/AdEventListener;", "Lcom/inmobi/ads/InMobiNative;", "<init>", "()V", "onAdFullScreenDismissed", "", "ad", "onAdFullScreenDisplayed", "onUserWillLeaveApplication", Df.f40645f, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class NativeAdEventListener extends AdEventListener<InMobiNative> {
    public void onAdClicked(@NotNull InMobiNative ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    public void onAdFullScreenDismissed(@NotNull InMobiNative ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    public void onAdFullScreenDisplayed(@NotNull InMobiNative ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    public void onUserWillLeaveApplication(@NotNull InMobiNative ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }
}
