package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
final class c1 implements zb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f80008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f80009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f80010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f80011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f80012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f80013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f80014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f80015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CreativeFormat f80016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f80017k;

    c1(AdsType adsType, Response.Seatbid seatbid, Response.Seatbid.Bid bid, Ad ad2, NetworkAdapter networkAdapter, AdExtension adExtension) {
        this.f80007a = bid.getId();
        this.f80008b = seatbid.getSeat();
        this.f80009c = bid.getPrice();
        this.f80010d = bid.getDeal();
        this.f80011e = ad2.getId();
        this.f80012f = bid.getCid();
        if (ad2.getAdomainCount() > 0) {
            this.f80013g = (String[]) ad2.m4441getAdomainList().toArray(new String[0]);
        } else {
            this.f80013g = null;
        }
        this.f80017k = d(adExtension);
        this.f80014h = networkAdapter.getKey();
        this.f80015i = c(adsType.obtainHeaderBiddingAd(ad2));
        this.f80016j = e(ad2);
    }

    private Map d(AdExtension adExtension) {
        HashMap map = new HashMap();
        if (adExtension != null) {
            try {
                map.putAll(adExtension.getCustomParamsMap());
            } catch (Exception unused) {
            }
        }
        return map;
    }

    static CreativeFormat e(Ad ad2) {
        if (!ad2.hasDisplay()) {
            if (ad2.hasVideo()) {
                return CreativeFormat.Video;
            }
            return null;
        }
        Ad.Display display = ad2.getDisplay();
        if (display.hasBanner() || !TextUtils.isEmpty(display.getAdm())) {
            return CreativeFormat.Banner;
        }
        if (display.hasNative()) {
            return CreativeFormat.Native;
        }
        return null;
    }

    @Override // zb.c
    public Map a() {
        return this.f80015i;
    }

    @Override // zb.c
    public CreativeFormat b() {
        return this.f80016j;
    }

    Map c(HeaderBiddingAd headerBiddingAd) {
        Map<String, String> clientParamsMap;
        HashMap map = new HashMap();
        if (headerBiddingAd != null && (clientParamsMap = headerBiddingAd.getClientParamsMap()) != null) {
            map.putAll(clientParamsMap);
        }
        return map;
    }

    @Override // zb.c
    public String getCreativeId() {
        return this.f80011e;
    }

    @Override // zb.c
    public Map getCustomParams() {
        return this.f80017k;
    }

    @Override // zb.c
    public String getDemandSource() {
        return this.f80008b;
    }

    @Override // zb.c
    public String getId() {
        return this.f80007a;
    }

    @Override // zb.c
    public String getNetworkKey() {
        return this.f80014h;
    }

    @Override // zb.c
    public double getPrice() {
        return this.f80009c;
    }

    public String toString() {
        return "id=" + this.f80007a + ", demandSource=" + this.f80008b + ", price=" + this.f80009c + ", creativeId=" + this.f80011e + ", cid=" + this.f80012f;
    }
}
