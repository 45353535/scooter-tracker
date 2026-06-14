package com.vungle.ads.internal;

import android.content.Context;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.vungle.ads.VungleAdSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/FullscreenAdInternal;", "Lcom/vungle/ads/internal/AdInternal;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAdSizeForAdRequest", "Lcom/vungle/ads/VungleAdSize;", "isValidAdSize", "", C4240b4.i.O, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class FullscreenAdInternal extends AdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenAdInternal(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    @Nullable
    public VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(@Nullable VungleAdSize adSize) {
        return true;
    }
}
