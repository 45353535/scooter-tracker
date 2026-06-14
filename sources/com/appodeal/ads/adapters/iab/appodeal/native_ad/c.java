package com.appodeal.ads.adapters.iab.appodeal.native_ad;

import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ImageData;
import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.NativeMediaViewContentType;
import com.appodeal.ads.VideoData;
import com.appodeal.ads.adapters.iab.unified.y;
import com.appodeal.ads.ext.JsonExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedNative {
    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) throws JSONException {
        String stringOrNull;
        UnifiedNativeParams adTypeParams = (UnifiedNativeParams) unifiedAdParams;
        com.appodeal.ads.adapters.iab.appodeal.a adUnitParams2 = (com.appodeal.ads.adapters.iab.appodeal.a) adUnitParams;
        UnifiedNativeCallback callback = (UnifiedNativeCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = contextProvider.getApplicationContext();
        String string = adUnitParams2.f12204a.getString(CampaignEx.JSON_KEY_CLICK_URL);
        y yVar = new y(adUnitParams2.f12205b, adUnitParams2.f12206c);
        VideoData.Remote remote = (NativeMediaViewContentType.NoVideo == adTypeParams.getNativeMediaContentType() || (stringOrNull = JsonExtKt.getStringOrNull(adUnitParams2.f12204a, "video_url")) == null) ? null : new VideoData.Remote(stringOrNull);
        String stringOrNull2 = JsonExtKt.getStringOrNull(adUnitParams2.f12204a, "icon");
        ImageData.Remote remote2 = stringOrNull2 != null ? new ImageData.Remote(stringOrNull2) : null;
        String stringOrNull3 = JsonExtKt.getStringOrNull(adUnitParams2.f12204a, "image", "https://image-cdn-max.appodeal.com/appodeal-images/native-diu-image.jpg");
        MediaAssets mediaAssets = new MediaAssets(remote2, stringOrNull3 != null ? new ImageData.Remote(stringOrNull3) : null, remote);
        String string2 = adUnitParams2.f12204a.getString("title");
        String string3 = adUnitParams2.f12204a.getString("description");
        String stringOrNull4 = JsonExtKt.getStringOrNull(adUnitParams2.f12204a, "button");
        if (stringOrNull4 == null) {
            stringOrNull4 = "";
        }
        String str = stringOrNull4;
        double dOptDouble = adUnitParams2.f12204a.optDouble("rating");
        Double dValueOf = Double.isNaN(dOptDouble) ? null : Double.valueOf(dOptDouble);
        callback.onAdLoaded(new b(mediaAssets, adTypeParams, applicationContext, string, yVar, string2, string3, str, dValueOf != null ? (float) dValueOf.doubleValue() : 0.0f));
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }
}
