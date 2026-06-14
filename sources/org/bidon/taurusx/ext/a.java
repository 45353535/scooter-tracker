package org.bidon.taurusx.ext;

import com.taurusx.tax.api.TaurusXAdError;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.config.BidonError;
import org.bidon.taurusx.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final BidonError a(TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null) {
            return new BidonError.Unspecified(b.a(), null, null, 6, null);
        }
        int code = taurusXAdError.getCode();
        if (code == 2) {
            return new BidonError.NetworkError(b.a(), taurusXAdError.getMessage());
        }
        if (code != 3) {
            if (code == 4) {
                return new BidonError.FillTimedOut(b.a());
            }
            if (code == 5) {
                return BidonError.AdNotReady.INSTANCE;
            }
            if (code != 6) {
                return new BidonError.Unspecified(b.a(), new Throwable(taurusXAdError.getMessage()), null, 4, null);
            }
        }
        return new BidonError.NoFill(b.a());
    }

    public static final org.bidon.taurusx.a b(AdTypeParam adTypeParam) {
        Intrinsics.checkNotNullParameter(adTypeParam, "<this>");
        if (adTypeParam instanceof AdTypeParam.Banner) {
            return ((AdTypeParam.Banner) adTypeParam).getBannerFormat() == BannerFormat.MRec ? org.bidon.taurusx.a.f97717d : org.bidon.taurusx.a.f97718e;
        }
        if (adTypeParam instanceof AdTypeParam.Interstitial) {
            return org.bidon.taurusx.a.f97719f;
        }
        if (adTypeParam instanceof AdTypeParam.Rewarded) {
            return org.bidon.taurusx.a.f97720g;
        }
        throw new m();
    }
}
