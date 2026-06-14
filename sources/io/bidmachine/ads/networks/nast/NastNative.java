package io.bidmachine.ads.networks.nast;

import ac.n;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.NetworkAdUnit;
import od.k;
import od.l;
import od.m;

/* JADX INFO: loaded from: classes12.dex */
class NastNative extends l {

    private static final class NastAdapter extends n {
        private NastAdapter() {
        }

        @Override // ac.n, ac.o
        public boolean hasVideo() {
            return (TextUtils.isEmpty(getVideoAdm()) && TextUtils.isEmpty(getVideoUrl())) ? false : true;
        }
    }

    NastNative() {
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull m mVar, @NonNull od.n nVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        NastParams nastParams = new NastParams(kVar);
        if (nastParams.isValid(nVar, mVar)) {
            mVar.setVisibilitySource(io.bidmachine.core.k.BidMachine);
            n privacySheetData = new NastAdapter().setTitle(nastParams.title).setDescription(nastParams.description).setCallToAction(nastParams.callToAction).setIcon(new ImageDataImpl(nastParams.iconUrl)).setMainImage(new ImageDataImpl(nastParams.imageUrl)).setVideoUrl(nastParams.videoUrl).setVideoAdm(nastParams.videoAdm).setClickUrl(nastParams.clickUrl).setNetworkControlLoadingAssets(false).setAdLabelData(nastParams.adLabelData).setPrivacySheetData(nastParams.privacySheetData);
            Float f10 = nastParams.rating;
            if (f10 != null) {
                privacySheetData.setRating(f10.floatValue());
            }
            mVar.a(privacySheetData);
        }
    }
}
