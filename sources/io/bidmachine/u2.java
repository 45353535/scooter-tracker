package io.bidmachine;

import ac.p;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdFormat;
import io.bidmachine.AdRequest;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.protobuf.TokenConfiguration;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.User;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l9.d;
import md.d;
import u8.d;

/* JADX INFO: loaded from: classes12.dex */
abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final nd.l f81986a = new BidMachineTrackingObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f81987b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f81988c = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements ExpirationListener {
        private b() {
        }

        @Override // io.bidmachine.ExpirationListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onExpired(final BidToken bidToken) {
            io.bidmachine.core.a.b("BidTokenManager", new ce.b() { // from class: io.bidmachine.v2
                @Override // ce.b
                public final Object get() {
                    return String.format("BidToken expired - %s", bidToken.getId());
                }
            });
            u2.p(bidToken);
            bidToken.destroyAdRequest();
        }
    }

    public static /* synthetic */ void e(Placement.Builder builder, CustomParams customParams) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        customParams.fillStructBuilder(builderNewBuilder);
        if (builderNewBuilder.getFieldsCount() > 0) {
            builder.setCustomData(builderNewBuilder);
        }
    }

    static String f(Context context, AdPlacementConfig adPlacementConfig) {
        AdsType adsType = adPlacementConfig.getAdFormat().getAdsType();
        RequestTokenPayload requestTokenPayloadG = g(context, adPlacementConfig);
        if (requestTokenPayloadG == null) {
            r(adsType, ae.a.i("Failed to create RequestTokenPayload"));
            return "";
        }
        try {
            String strEncodeToString = Base64.encodeToString(requestTokenPayloadG.toByteArray(), 2);
            s(adsType);
            return strEncodeToString;
        } catch (Exception e10) {
            r(adsType, ae.a.l("Failed to encode RequestTokenPayload", e10));
            q(requestTokenPayloadG.getTokenHashValue());
            return "";
        }
    }

    private static RequestTokenPayload g(Context context, AdPlacementConfig adPlacementConfig) {
        try {
            AdFormat adFormat = adPlacementConfig.getAdFormat();
            AdsType adsType = adFormat.getAdsType();
            j2 j2VarE = j2.e();
            RequestTokenPayload.Builder builderNewBuilder = RequestTokenPayload.newBuilder();
            final Placement.Builder placementBuilder = builderNewBuilder.getPlacementBuilder();
            placementBuilder.setAdFormat(ae.f.b(adFormat));
            placementBuilder.setAdType(adsType.getName());
            io.bidmachine.core.h.F(adPlacementConfig.getPlacementId(), new Executable() { // from class: io.bidmachine.r2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    placementBuilder.setPlacementId(StringValue.of((String) obj));
                }
            });
            io.bidmachine.core.h.F(adPlacementConfig.getCustomParams(), new Executable() { // from class: io.bidmachine.s2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    u2.e(placementBuilder, (CustomParams) obj);
                }
            });
            App.Builder builderNewBuilder2 = App.newBuilder();
            j2VarE.h().build(context, builderNewBuilder2);
            builderNewBuilder.setAppData(builderNewBuilder2);
            User.Builder builderH = h(j2VarE);
            if (builderH != null) {
                builderNewBuilder.setUserData(builderH);
            }
            SDK.Builder sdkver = SDK.newBuilder().setSdk(BidMachine.NAME).setSdkver("3.5.0");
            m9.c.c(sdkver);
            builderNewBuilder.setPlacementData(sdkver);
            j2VarE.i().b(context, builderNewBuilder, j2VarE.w());
            j2VarE.s().h(context, builderNewBuilder, adsType);
            o(context, builderNewBuilder, adPlacementConfig);
            Struct.Builder builderNewBuilder3 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                builderNewBuilder3.putAllFields(privateStruct.getFieldsMap());
            }
            if (builderNewBuilder3.getFieldsCount() > 0) {
                builderNewBuilder.setExt(builderNewBuilder3.build());
            }
            return builderNewBuilder.build();
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            return null;
        }
    }

    private static User.Builder h(j2 j2Var) {
        try {
            d6 d6VarW = j2Var.w();
            User.Builder builderNewBuilder = User.newBuilder();
            d6VarW.j(builderNewBuilder);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void i(HeaderBiddingPlacement.Builder builder, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                builder.addAllAdUnits(((HeaderBiddingPlacement) ((Any) it.next()).unpack(HeaderBiddingPlacement.class)).getAdUnitsList());
            } catch (Throwable unused) {
            }
        }
    }

    static AdRequest j(ResponsePayload responsePayload) {
        if (responsePayload == null) {
            return null;
        }
        final String strK = k(responsePayload);
        io.bidmachine.core.a.b("BidTokenManager", new ce.b() { // from class: io.bidmachine.p2
            @Override // ce.b
            public final Object get() {
                return String.format("BidTokenId from bidPayload - %s", strK);
            }
        });
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        BidToken bidTokenQ = q(strK);
        if (bidTokenQ != null) {
            return bidTokenQ.getAdRequest();
        }
        io.bidmachine.core.a.b("BidTokenManager", new ce.b() { // from class: io.bidmachine.q2
            @Override // ce.b
            public final Object get() {
                return String.format("BidToken is null by bidTokenId - %s", strK);
            }
        });
        return null;
    }

    private static String k(ResponsePayload responsePayload) {
        try {
            Value value = responsePayload.getResponseCache().getResponse().getExt().getFieldsMap().get("tokenHashValue");
            if (value == null) {
                return null;
            }
            return value.getStringValue();
        } catch (Throwable unused) {
            return null;
        }
    }

    static TokenConfiguration l(AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        return (TokenConfiguration) f81987b.get(adFormat);
    }

    private static AdRequest m(AdPlacementConfig adPlacementConfig) {
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        AdRequest.AdRequestBuilderImpl cVar = adFormat instanceof AdFormat.Banner ? new d.c(adPlacementConfig) : adFormat instanceof AdFormat.Interstitial ? new d.b(adPlacementConfig) : adFormat instanceof AdFormat.Rewarded ? new d.b(adPlacementConfig) : adFormat instanceof AdFormat.Native ? new p.b(adPlacementConfig) : null;
        if (cVar == null) {
            return null;
        }
        return cVar.build();
    }

    private static TokenConfiguration n(AdFormat adFormat) {
        TokenConfiguration tokenConfigurationL = l(adFormat);
        return tokenConfigurationL == null ? TokenConfiguration.newBuilder().setExpirationTime(300).build() : tokenConfigurationL;
    }

    private static void o(Context context, RequestTokenPayload.Builder builder, AdPlacementConfig adPlacementConfig) {
        try {
            AdRequest adRequestM = m(adPlacementConfig);
            if (adRequestM == null) {
                return;
            }
            NetworkRegistry.registerAndInitializeCoreNetworks(context);
            TokenConfiguration tokenConfigurationN = n(adPlacementConfig.getAdFormat());
            HeaderBiddingPlacement.Builder builderNewBuilder = HeaderBiddingPlacement.newBuilder();
            for (Message.Builder builder2 : adRequestM.collectPlacementFormats(context, tokenConfigurationN.getAdNetworksList(), null)) {
                if (builder2 instanceof Placement.DisplayPlacement.Builder) {
                    i(builderNewBuilder, ((Placement.DisplayPlacement.Builder) builder2).getExtProtoList());
                } else if (builder2 instanceof Placement.VideoPlacement.Builder) {
                    i(builderNewBuilder, ((Placement.VideoPlacement.Builder) builder2).getExtProtoList());
                }
            }
            if (builderNewBuilder.getAdUnitsList().isEmpty()) {
                return;
            }
            final BidToken bidToken = new BidToken(adRequestM, tokenConfigurationN.getExpirationTime(), new b());
            u(bidToken);
            builder.getPlacementBuilder().setHbPlacement(builderNewBuilder);
            builder.setTokenHashValue(bidToken.getId());
            io.bidmachine.core.a.b("BidTokenManager", new ce.b() { // from class: io.bidmachine.t2
                @Override // ce.b
                public final Object get() {
                    return String.format("BidTokenId - %s", bidToken.getId());
                }
            });
        } catch (Throwable unused) {
            q(builder.getTokenHashValue());
        }
    }

    static BidToken p(BidToken bidToken) {
        return q(bidToken.getId());
    }

    static BidToken q(String str) {
        BidToken bidToken = (BidToken) f81988c.remove(str);
        if (bidToken != null) {
            bidToken.stopExpiration();
        }
        return bidToken;
    }

    private static void r(AdsType adsType, ae.a aVar) {
        v(adsType, aVar);
    }

    private static void s(AdsType adsType) {
        v(adsType, null);
    }

    static void t(List list) {
        f81987b.clear();
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TokenConfiguration tokenConfiguration = (TokenConfiguration) it.next();
            AdFormat adFormatByRemoteName = AdFormat.byRemoteName(tokenConfiguration.getType());
            if (adFormatByRemoteName != null) {
                f81987b.put(adFormatByRemoteName, tokenConfiguration);
            }
        }
    }

    static void u(BidToken bidToken) {
        f81988c.put(bidToken.getId(), bidToken);
        bidToken.startExpiration();
    }

    private static void v(AdsType adsType, ae.a aVar) {
        f81986a.eventFinish(TrackEventType.GetBidToken, adsType, null, aVar);
    }
}
