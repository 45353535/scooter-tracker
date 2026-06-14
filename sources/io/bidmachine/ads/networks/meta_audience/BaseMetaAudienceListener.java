package io.bidmachine.ads.networks.meta_audience;

import androidx.annotation.NonNull;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import od.c;

/* JADX INFO: loaded from: classes12.dex */
abstract class BaseMetaAudienceListener<UnifiedAdCallbackType extends c> implements AdListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    BaseMetaAudienceListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static ae.a mapError(@androidx.annotation.Nullable com.facebook.ads.AdError r3) {
        /*
            if (r3 != 0) goto L5
            ae.a r3 = ae.a.f4248r
            return r3
        L5:
            int r0 = r3.getErrorCode()
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 == r1) goto L30
            r1 = 2002(0x7d2, float:2.805E-42)
            if (r0 == r1) goto L2d
            r1 = 2009(0x7d9, float:2.815E-42)
            if (r0 == r1) goto L2a
            r1 = 2100(0x834, float:2.943E-42)
            if (r0 == r1) goto L2d
            r1 = 3001(0xbb9, float:4.205E-42)
            if (r0 == r1) goto L2d
            r1 = 6003(0x1773, float:8.412E-42)
            if (r0 == r1) goto L2d
            switch(r0) {
                case 1000: goto L27;
                case 1001: goto L2d;
                case 1002: goto L2d;
                default: goto L24;
            }
        L24:
            ae.a r1 = ae.a.f4248r
            goto L32
        L27:
            ae.a r1 = ae.a.f4235e
            goto L32
        L2a:
            ae.a r1 = ae.a.f4236f
            goto L32
        L2d:
            ae.a r1 = ae.a.f4247q
            goto L32
        L30:
            ae.a r1 = ae.a.f4238h
        L32:
            ae.a r2 = new ae.a
            java.lang.String r3 = r3.getErrorMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.meta_audience.BaseMetaAudienceListener.mapError(com.facebook.ads.AdError):ae.a");
    }

    @NonNull
    UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        this.callback.onAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        this.callback.onAdLoadFailed(mapError(adError));
        ad2.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        this.callback.onAdShown();
    }
}
