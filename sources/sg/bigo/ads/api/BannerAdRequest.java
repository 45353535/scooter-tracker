package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes4.dex */
public class BannerAdRequest extends b<BannerAdRequest> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final List<AdSize> f102082i;

    public static class Builder extends c<Builder, BannerAdRequest> {
        private List<AdSize> mAdSizes;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // sg.bigo.ads.api.c
        public BannerAdRequest createAdRequest() {
            return new BannerAdRequest(this.mSlotId, this.mAdSizes, this.mServerBidPayload);
        }

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }
    }

    BannerAdRequest(String str, List<AdSize> list, String str2) {
        super(str, str2);
        this.f102082i = new ArrayList();
        if (list != null) {
            for (AdSize adSize : list) {
                if (adSize != null) {
                    this.f102082i.add(adSize);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final /* synthetic */ b a() {
        BannerAdRequest bannerAdRequest = new BannerAdRequest(this.f102117a, new ArrayList(this.f102082i), this.f102118b);
        bannerAdRequest.a(this.f102124h.f102125a);
        bannerAdRequest.f102119c = this.f102119c;
        bannerAdRequest.f102123g = this.f102123g;
        return bannerAdRequest;
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final sg.bigo.ads.api.core.c b() {
        sg.bigo.ads.api.core.c cVarB = super.b();
        if (cVarB != null) {
            return cVarB;
        }
        if (this.f102082i.isEmpty()) {
            return new sg.bigo.ads.api.core.c(1001, 10003, "Ad sizes cannot be empty.");
        }
        return null;
    }

    @Override // sg.bigo.ads.api.b
    public int c() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> d() {
        HashMap map = new HashMap();
        map.put(Reporting.Key.AD_SIZE, sg.bigo.ads.ad.banner.a.a(this.f102082i));
        return map;
    }
}
