package md;

import ae.f;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.FullScreenAdRequestParameters;

/* JADX INFO: loaded from: classes3.dex */
public class b extends FullScreenAdRequestParameters {
    public b(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) {
        return f.n(placement);
    }
}
