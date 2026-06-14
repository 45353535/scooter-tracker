package w8;

import android.text.TextUtils;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.CustomParams;
import io.bidmachine.Executable;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.Placement;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdContentType f107552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f107553b = new g();

    n(AdContentType adContentType) {
        this.f107552a = adContentType;
    }

    public static /* synthetic */ void a(Placement.Builder builder, CustomParams customParams) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        customParams.fillStructBuilder(builderNewBuilder);
        if (builderNewBuilder.getFieldsCount() > 0) {
            builder.setCustomData(builderNewBuilder);
        }
    }

    public abstract zb.b b(Ad ad2);

    zb.b c(Ad ad2) {
        return this.f107553b.a(ad2);
    }

    HeaderBiddingPlacement.Builder d(ContextProvider contextProvider, od.d dVar, AdsType adsType, Collection collection, List list, int i10) {
        return this.f107553b.b(contextProvider, dVar, adsType, g(), collection, list, i10);
    }

    public abstract Message.Builder e(ContextProvider contextProvider, od.d dVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10);

    Placement f(AdPlacementConfig adPlacementConfig, HeaderBiddingPlacement.Builder builder) {
        final Placement.Builder builderNewBuilder = Placement.newBuilder();
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        builderNewBuilder.setAdFormat(ae.f.b(adFormat));
        builderNewBuilder.setAdType(adFormat.getAdsType().getName());
        String placementId = adPlacementConfig.getPlacementId();
        if (!TextUtils.isEmpty(placementId)) {
            builderNewBuilder.setPlacementId(StringValue.of(placementId));
        }
        io.bidmachine.core.h.F(adPlacementConfig.getCustomParams(), new Executable() { // from class: w8.m
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                n.a(builderNewBuilder, (CustomParams) obj);
            }
        });
        if (builder != null) {
            builderNewBuilder.setHbPlacement(builder);
        }
        return builderNewBuilder.build();
    }

    public AdContentType g() {
        return this.f107552a;
    }

    public HeaderBiddingAd h(Ad ad2) {
        return this.f107553b.c(ad2);
    }
}
