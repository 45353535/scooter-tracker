package u8;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.BannerAdSize;

/* JADX INFO: loaded from: classes12.dex */
public class b extends AdRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerAdSize f105267a;

    public b(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Banner) {
            this.f105267a = ((AdFormat.Banner) adFormat).getBannerAdSize();
        } else {
            this.f105267a = BannerAdSize.Banner;
        }
    }

    private boolean c(b bVar) {
        return this.f105267a.isSuitable(bVar.a());
    }

    public BannerAdSize a() {
        return this.f105267a;
    }

    public e b() {
        return e.g(this.f105267a);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof b) && c((b) adRequestParameters);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) {
        return ae.f.i(placement, this.f105267a);
    }
}
