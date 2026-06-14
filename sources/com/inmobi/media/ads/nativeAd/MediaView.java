package com.inmobi.media.ads.nativeAd;

import android.content.Context;
import android.widget.FrameLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/inmobi/media/ads/nativeAd/MediaView;", "Landroid/widget/FrameLayout;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
