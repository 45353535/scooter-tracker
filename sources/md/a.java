package md;

import android.content.Context;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;
import od.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends FullScreenAd {
    public a(Context context) {
        super(context, AdsType.Rewarded);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FullScreenAdObject createAdObject(ContextProvider contextProvider, d dVar, NetworkAdapter networkAdapter, zb.b bVar, AdProcessCallback adProcessCallback) {
        h hVarCreateRewarded = networkAdapter.createRewarded();
        if (hVarCreateRewarded == null) {
            return null;
        }
        return new FullScreenAdObject(contextProvider, adProcessCallback, dVar, bVar, hVarCreateRewarded);
    }
}
