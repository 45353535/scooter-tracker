package io.bidmachine.iab.mraid;

import android.net.Uri;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes12.dex */
final class f0 {
    f0() {
    }

    String a(String str) {
        try {
            return new Uri.Builder().scheme(MRAIDNativeFeature.CALENDAR).authority("mraid").appendQueryParameter("eventJson", str).build().toString();
        } catch (Exception e10) {
            i.e("MraidNativeFeatureUrlFactory", e10);
            return null;
        }
    }

    String b(String str) {
        try {
            return new Uri.Builder().scheme(MRAIDNativeFeature.STORE_PICTURE).authority("mraid").appendQueryParameter("url", str).build().toString();
        } catch (Exception e10) {
            i.e("MraidNativeFeatureUrlFactory", e10);
            return null;
        }
    }
}
