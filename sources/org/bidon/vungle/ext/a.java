package org.bidon.vungle.ext;

import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97828a = "7.6.1.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97829b = VungleAds.INSTANCE.getSdkVersion();

    public static final BidonError a(VungleError vungleError) {
        return vungleError instanceof SdkNotInitialized ? BidonError.SdkNotInitialized.INSTANCE : ((vungleError instanceof NetworkUnreachable) || (vungleError instanceof NetworkTimeoutError)) ? new BidonError.NetworkError(org.bidon.vungle.a.a(), null, 2, null) : vungleError instanceof AdNotLoadedCantPlay ? BidonError.AdNotReady.INSTANCE : vungleError instanceof AdResponseEmptyError ? new BidonError.NoFill(org.bidon.vungle.a.a()) : ((vungleError instanceof AdPayloadError) || (vungleError instanceof InvalidBidPayloadError)) ? BidonError.NoBid.INSTANCE : ((vungleError instanceof AdExpiredError) || (vungleError instanceof AdExpiredOnPlayError)) ? new BidonError.Expired(org.bidon.vungle.a.a()) : new BidonError.Unspecified(org.bidon.vungle.a.a(), vungleError, null, 4, null);
    }

    public static final String b() {
        return f97828a;
    }

    public static final String c() {
        return f97829b;
    }
}
