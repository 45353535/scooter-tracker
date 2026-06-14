package u8;

import android.content.Context;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.BannerAdSize;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;

/* JADX INFO: loaded from: classes12.dex */
final class a extends ViewAd {
    a(Context context) {
        super(context, AdsType.Banner);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewAdObject createAdObject(ContextProvider contextProvider, d dVar, NetworkAdapter networkAdapter, zb.b bVar, AdProcessCallback adProcessCallback) {
        od.e eVarCreateBanner = networkAdapter.createBanner();
        if (eVarCreateBanner == null) {
            return null;
        }
        ViewAdObject viewAdObject = new ViewAdObject(contextProvider, adProcessCallback, dVar, bVar, eVarCreateBanner);
        BannerAdSize bannerAdSizeK = dVar.k();
        if (bannerAdSizeK.getIsAdaptive()) {
            viewAdObject.setWidthMeasureMode(ViewAdObject.MeasureMode.Match);
            viewAdObject.setHeight(bVar.c());
            return viewAdObject;
        }
        viewAdObject.setWidth(bannerAdSizeK.getWidth());
        viewAdObject.setHeight(bannerAdSizeK.getHeight());
        return viewAdObject;
    }
}
