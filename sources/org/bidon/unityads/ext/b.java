package org.bidon.unityads.ext;

import com.unity3d.ads.UnityAds;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final BidonError.Unspecified a(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        return new BidonError.Unspecified(org.bidon.unityads.a.a(), new Throwable("UnityAdsInitializationError: " + unityAdsInitializationError), null, 4, null);
    }
}
