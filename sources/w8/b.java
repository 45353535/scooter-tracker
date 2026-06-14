package w8;

import android.text.TextUtils;
import android.util.Size;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class b extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f107524c;

    public b(boolean z10) {
        super(AdContentType.Static);
        this.f107524c = z10;
    }

    @Override // w8.n
    public zb.b b(Ad ad2) {
        if (!ad2.hasDisplay()) {
            return null;
        }
        Ad.Display display = ad2.getDisplay();
        zb.b bVarC = c(ad2);
        zb.b bVar = bVarC;
        if (bVarC == null) {
            if (TextUtils.isEmpty(display.getAdm())) {
                return null;
            }
            a aVar = new a(ad2);
            aVar.l(display.getAdm());
            bVar = aVar;
        }
        bVar.k(display.getW());
        bVar.j(display.getH());
        return bVar;
    }

    @Override // w8.n
    public Message.Builder e(ContextProvider contextProvider, od.d dVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10) {
        Size sizeI = i(contextProvider, dVar);
        Placement.DisplayPlacement.Builder h10 = Placement.DisplayPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_MRAID_2_0).addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).setW(sizeI.getWidth()).setH(sizeI.getHeight());
        if (this.f107524c) {
            h10.setInstl(true);
            h10.setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN);
        }
        HeaderBiddingPlacement.Builder builderD = d(contextProvider, dVar, adsType, collection, list, i10);
        if (adPlacementConfig == null && builderD != null) {
            h10.addExtProto(Any.pack(builderD.build()));
            return h10;
        }
        if (adPlacementConfig != null) {
            h10.addExtProto(Any.pack(f(adPlacementConfig, builderD)));
        }
        return h10;
    }

    public Size i(ContextProvider contextProvider, od.d dVar) {
        return io.bidmachine.core.h.B(contextProvider.getContext());
    }
}
