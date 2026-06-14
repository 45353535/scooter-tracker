package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;

/* JADX INFO: loaded from: classes12.dex */
abstract class e5 {

    interface a {
        void a(ae.a aVar);

        void onSuccess(Object obj);
    }

    static void a(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, Response response, a aVar) {
        if (response == null || response.getSeatbidCount() == 0) {
            aVar.a(ae.a.k("Response"));
            return;
        }
        Response.Seatbid seatbid = response.getSeatbid(0);
        if (seatbid == null || seatbid.getBidCount() == 0) {
            aVar.a(ae.a.k("Seatbid"));
            return;
        }
        Response.Seatbid.Bid bid = seatbid.getBid(0);
        if (bid == null) {
            aVar.a(ae.a.k("Bid"));
            return;
        }
        Any media = bid.getMedia();
        if (media == null) {
            aVar.a(ae.a.k("Media"));
            return;
        }
        if (!media.is(Ad.class)) {
            aVar.a(ae.a.h("Media not valid"));
            return;
        }
        try {
            Ad ad2 = (Ad) media.unpack(Ad.class);
            if (ad2 == null) {
                aVar.a(ae.a.k(com.taurusx.tax.f.t.f66040o));
                return;
            }
            NetworkAdapter networkAdapterFindNetworkAdapter = adRequestParameters.getAdsType().findNetworkAdapter(ad2);
            if (networkAdapterFindNetworkAdapter == null) {
                aVar.a(ae.a.k("NetworkAdapter"));
            } else {
                aVar.onSuccess(new u(adRequestParameters, networkAdUnitManager, response, seatbid, bid, ad2, networkAdapterFindNetworkAdapter));
            }
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            aVar.a(ae.a.l("Failed to process response", th2));
        }
    }
}
