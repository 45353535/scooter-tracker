package ac;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.MediaAssetType;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class h extends AdRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4231b;

    public h(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        this.f4231b = true;
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Native) {
            this.f4230a = ((AdFormat.Native) adFormat).getMediaAssetTypes();
        } else {
            this.f4230a = MediaAssetType.DEFAULT;
        }
    }

    private boolean b(h hVar) {
        return MediaAssetType.isAll(hVar.f4230a) || hVar.f4230a.containsAll(this.f4230a);
    }

    public boolean a(MediaAssetType mediaAssetType) {
        return this.f4230a.isEmpty() || this.f4230a.contains(mediaAssetType) || this.f4230a.contains(MediaAssetType.All);
    }

    public boolean c() {
        return this.f4231b;
    }

    void d(boolean z10) {
        this.f4231b = z10;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof h) && b((h) adRequestParameters);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) {
        return ae.f.m(placement);
    }
}
