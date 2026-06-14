package l9;

import android.content.Context;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;
import od.h;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends FullScreenAd {
    public a(Context context) {
        super(context, AdsType.Interstitial);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FullScreenAdObject createAdObject(ContextProvider contextProvider, d dVar, NetworkAdapter networkAdapter, zb.b bVar, AdProcessCallback adProcessCallback) {
        h hVarCreateInterstitial = networkAdapter.createInterstitial();
        if (hVarCreateInterstitial == null) {
            return null;
        }
        return new FullScreenAdObject(contextProvider, adProcessCallback, dVar, bVar, hVarCreateInterstitial);
    }
}
