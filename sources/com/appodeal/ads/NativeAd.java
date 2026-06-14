package com.appodeal.ads;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u001b\u001a\u00020\u0011H&J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020!H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/appodeal/ads/NativeAd;", "", "title", "", "getTitle", "()Ljava/lang/String;", "description", "getDescription", "callToAction", "getCallToAction", "adProvider", "getAdProvider", "rating", "", "getRating", "()F", "isPrecache", "", "()Z", "predictedEcpm", "", "getPredictedEcpm", "()D", "mediaAssets", "Lcom/appodeal/ads/MediaAssets;", "getMediaAssets", "()Lcom/appodeal/ads/MediaAssets;", "containsVideo", "canShow", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "placementName", "destroy", "", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NativeAd {
    boolean canShow(Context context, String placementName);

    boolean containsVideo();

    void destroy();

    String getAdProvider();

    String getCallToAction();

    String getDescription();

    MediaAssets getMediaAssets();

    double getPredictedEcpm();

    float getRating();

    String getTitle();

    boolean isPrecache();
}
