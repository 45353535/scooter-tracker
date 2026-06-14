package w8;

import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;

/* JADX INFO: loaded from: classes12.dex */
class c extends zb.b {
    c(Ad ad2, HeaderBiddingAd headerBiddingAd) {
        super(ad2);
        b().putAll(headerBiddingAd.getClientParamsMap());
        b().putAll(headerBiddingAd.getServerParamsMap());
    }

    @Override // zb.b
    public boolean f() {
        return true;
    }
}
