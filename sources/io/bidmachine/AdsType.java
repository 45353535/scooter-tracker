package io.bidmachine;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.NativeDataAssetType;
import com.explorestack.protobuf.adcom.NativeImageAssetType;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import com.explorestack.protobuf.adcom.VideoPlacementType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.MediaAssetType;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Banner' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes12.dex */
public final class AdsType {
    public static final AdsType Banner;
    public static final AdsType Interstitial;
    public static final AdsType Rewarded;

    @NonNull
    private final ApiRequest.ApiAuctionDataBinder binder;

    @NonNull
    private final String name;

    @NonNull
    private final w8.n[] placementBuilders;

    @NonNull
    private final Executor placementCreateExecutor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));
    public static final AdsType Native = new AdsType(LogConstants.KEY_NATIVE, 3, "native", new ApiRequest.ApiAuctionDataBinder(), new w8.n[]{new w8.n() { // from class: w8.l

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f107545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f107546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f107547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f107548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f107549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f107550h;

        static {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f107545c = builderNewBuilder;
            builderNewBuilder.setId(123);
            builderNewBuilder.setReq(true);
            builderNewBuilder.setTitle(Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.newBuilder().setLen(104).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder2 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f107546d = builderNewBuilder2;
            builderNewBuilder2.setId(127);
            builderNewBuilder2.setReq(true);
            builderNewBuilder2.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_DESC).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder3 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f107547e = builderNewBuilder3;
            builderNewBuilder3.setId(8);
            builderNewBuilder3.setReq(true);
            builderNewBuilder3.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_CTA_TEXT).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder4 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f107548f = builderNewBuilder4;
            builderNewBuilder4.setId(7);
            builderNewBuilder4.setReq(false);
            builderNewBuilder4.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_RATING).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder5 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f107549g = builderNewBuilder5;
            builderNewBuilder5.setId(101);
            builderNewBuilder5.setReq(false);
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder6 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f107550h = builderNewBuilder6;
            builderNewBuilder6.setId(102);
            builderNewBuilder6.setReq(false);
        }

        {
            AdContentType adContentType = AdContentType.All;
        }

        static Placement.DisplayPlacement.NativeFormat.AssetFormat i(od.n nVar) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(124);
            builderNewBuilder.setReq(nVar.getAdRequestParameters().a(MediaAssetType.Icon));
            builderNewBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
            return builderNewBuilder.build();
        }

        static Placement.DisplayPlacement.NativeFormat.AssetFormat j(od.n nVar) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(128);
            builderNewBuilder.setReq(nVar.getAdRequestParameters().a(MediaAssetType.Image));
            builderNewBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
            return builderNewBuilder.build();
        }

        static Placement.DisplayPlacement.NativeFormat.AssetFormat l(od.n nVar) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(4);
            builderNewBuilder.setReq(nVar.getAdRequestParameters().a(MediaAssetType.Video));
            builderNewBuilder.setVideo(Placement.VideoPlacement.newBuilder().setSkip(false).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setLinearValue(1).build());
            return builderNewBuilder.build();
        }

        @Override // w8.n
        public zb.b b(Ad ad2) {
            zb.b bVarC = c(ad2);
            return (bVarC == null && ad2.hasDisplay() && ad2.getDisplay().hasNative()) ? new k(ad2) : bVarC;
        }

        @Override // w8.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Message.Builder e(ContextProvider contextProvider, od.n nVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10) {
            Placement.DisplayPlacement.Builder builderAddAllMime = Placement.DisplayPlacement.newBuilder().setInstl(false).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES));
            Placement.DisplayPlacement.NativeFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.newBuilder();
            builderNewBuilder.addAsset(f107545c);
            builderNewBuilder.addAsset(f107546d);
            builderNewBuilder.addAsset(f107547e);
            builderNewBuilder.addAsset(f107548f);
            builderNewBuilder.addAsset(i(nVar));
            builderNewBuilder.addAsset(j(nVar));
            builderNewBuilder.addAsset(l(nVar));
            builderNewBuilder.addAsset(f107549g);
            builderNewBuilder.addAsset(f107550h);
            builderAddAllMime.setNativefmt(builderNewBuilder);
            HeaderBiddingPlacement.Builder builderD = d(contextProvider, nVar, adsType, collection, list, i10);
            if (adPlacementConfig == null && builderD != null) {
                builderAddAllMime.addExtProto(Any.pack(builderD.build()));
                return builderAddAllMime;
            }
            if (adPlacementConfig != null) {
                builderAddAllMime.addExtProto(Any.pack(f(adPlacementConfig, builderD)));
            }
            return builderAddAllMime;
        }
    }});
    private static final /* synthetic */ AdsType[] $VALUES = $values();

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w8.n f79100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContextProvider f79101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ od.d f79102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Collection f79103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f79104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ AdPlacementConfig f79105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f79106h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f79107i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f79108j;

        b(w8.n nVar, ContextProvider contextProvider, od.d dVar, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10, List list2, CountDownLatch countDownLatch) {
            this.f79100b = nVar;
            this.f79101c = contextProvider;
            this.f79102d = dVar;
            this.f79103e = collection;
            this.f79104f = list;
            this.f79105g = adPlacementConfig;
            this.f79106h = i10;
            this.f79107i = list2;
            this.f79108j = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Message.Builder builderE = this.f79100b.e(this.f79101c, this.f79102d, AdsType.this, this.f79103e, this.f79104f, this.f79105g, this.f79106h);
                synchronized (this.f79107i) {
                    this.f79107i.add(builderE);
                }
                this.f79108j.countDown();
            } catch (Exception e10) {
                io.bidmachine.core.a.p(e10);
                this.f79108j.countDown();
            }
        }
    }

    private static /* synthetic */ AdsType[] $values() {
        return new AdsType[]{Banner, Interstitial, Rewarded, Native};
    }

    static {
        final boolean z10 = false;
        final boolean z11 = true;
        Banner = new AdsType("Banner", 0, "banner", new ApiRequest.ApiAuctionDataBinder(), new w8.n[]{new w8.b(z10) { // from class: io.bidmachine.AdsType.a
            @Override // w8.b
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Size i(ContextProvider contextProvider, od.g gVar) {
                return gVar.getAdRequestParameters().a().toSize();
            }
        }});
        Interstitial = new AdsType("Interstitial", 1, "interstitial", new ApiRequest.ApiAuctionDataBinder(), new w8.n[]{new w8.b(true), new w8.n(z11) { // from class: w8.p

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f107554c;

            {
                super(AdContentType.Video);
                this.f107554c = z11;
            }

            @Override // w8.n
            public zb.b b(Ad ad2) {
                if (!ad2.hasVideo()) {
                    return null;
                }
                zb.b bVarC = c(ad2);
                if (bVarC != null) {
                    return bVarC;
                }
                Ad.Video video = ad2.getVideo();
                o oVar = new o(ad2);
                oVar.l(video.getAdm());
                return oVar;
            }

            @Override // w8.n
            public Message.Builder e(ContextProvider contextProvider, od.d dVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10) {
                Size sizeI = i(contextProvider, dVar);
                Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.f107554c).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(sizeI.getWidth()).setH(sizeI.getHeight()).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
                HeaderBiddingPlacement.Builder builderD = d(contextProvider, dVar, adsType, collection, list, i10);
                if (adPlacementConfig == null && builderD != null) {
                    linearValue.addExtProto(Any.pack(builderD.build()));
                    return linearValue;
                }
                if (adPlacementConfig != null) {
                    linearValue.addExtProto(Any.pack(f(adPlacementConfig, builderD)));
                }
                return linearValue;
            }

            public Size i(ContextProvider contextProvider, od.d dVar) {
                return io.bidmachine.core.h.B(contextProvider.getContext());
            }
        }});
        Rewarded = new AdsType("Rewarded", 2, "rewarded", new ApiRequest.ApiAuctionDataBinder(), new w8.n[]{new w8.b(true), new w8.n(z10) { // from class: w8.p

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f107554c;

            {
                super(AdContentType.Video);
                this.f107554c = z10;
            }

            @Override // w8.n
            public zb.b b(Ad ad2) {
                if (!ad2.hasVideo()) {
                    return null;
                }
                zb.b bVarC = c(ad2);
                if (bVarC != null) {
                    return bVarC;
                }
                Ad.Video video = ad2.getVideo();
                o oVar = new o(ad2);
                oVar.l(video.getAdm());
                return oVar;
            }

            @Override // w8.n
            public Message.Builder e(ContextProvider contextProvider, od.d dVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10) {
                Size sizeI = i(contextProvider, dVar);
                Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.f107554c).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(sizeI.getWidth()).setH(sizeI.getHeight()).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
                HeaderBiddingPlacement.Builder builderD = d(contextProvider, dVar, adsType, collection, list, i10);
                if (adPlacementConfig == null && builderD != null) {
                    linearValue.addExtProto(Any.pack(builderD.build()));
                    return linearValue;
                }
                if (adPlacementConfig != null) {
                    linearValue.addExtProto(Any.pack(f(adPlacementConfig, builderD)));
                }
                return linearValue;
            }

            public Size i(ContextProvider contextProvider, od.d dVar) {
                return io.bidmachine.core.h.B(contextProvider.getContext());
            }
        }});
    }

    private AdsType(@NonNull String str, @NonNull int i10, @NonNull String str2, ApiRequest.ApiAuctionDataBinder apiAuctionDataBinder, w8.n[] nVarArr) {
        this.name = str2;
        this.binder = apiAuctionDataBinder;
        this.placementBuilders = nVarArr;
    }

    public static AdsType valueOf(String str) {
        return (AdsType) Enum.valueOf(AdsType.class, str);
    }

    public static AdsType[] values() {
        return (AdsType[]) $VALUES.clone();
    }

    void collectPlacements(@NonNull ContextProvider contextProvider, @NonNull AdRequest adRequest, @NonNull od.d dVar, @NonNull Collection<NetworkConfig> collection, @NonNull List<Message.Builder> list, @NonNull List<NetworkAdUnit> list2, @Nullable AdPlacementConfig adPlacementConfig, int i10) {
        AdsType adsType = this;
        CountDownLatch countDownLatch = new CountDownLatch(adsType.placementBuilders.length);
        w8.n[] nVarArr = adsType.placementBuilders;
        int length = nVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            w8.n nVar = nVarArr[i11];
            if (adRequest.isPlacementBuilderMatch(nVar)) {
                adsType.placementCreateExecutor.execute(adsType.new b(nVar, contextProvider, dVar, collection, list2, adPlacementConfig, i10, list, countDownLatch));
            } else {
                countDownLatch.countDown();
            }
            i11++;
            adsType = this;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            io.bidmachine.core.a.p(e10);
        }
    }

    @Nullable
    zb.b createAdObjectParams(@NonNull Ad ad2) {
        for (w8.n nVar : this.placementBuilders) {
            zb.b bVarB = nVar.b(ad2);
            if (bVarB != null) {
                return bVarB;
            }
        }
        return null;
    }

    @Nullable
    NetworkAdapter findNetworkAdapter(@NonNull Ad ad2) {
        HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = obtainHeaderBiddingAd(ad2);
        NetworkAdapter adapter = headerBiddingAdObtainHeaderBiddingAd != null ? NetworkRegistry.getAdapter(headerBiddingAdObtainHeaderBiddingAd.getBidder()) : null;
        if (adapter == null) {
            if (this == Native) {
                return NetworkRegistry.getAdapter(NastAdapter.KEY);
            }
            if (ad2.hasDisplay()) {
                return NetworkRegistry.getAdapter("mraid");
            }
            if (ad2.hasVideo()) {
                return NetworkRegistry.getAdapter("vast");
            }
        }
        return adapter;
    }

    @NonNull
    ApiRequest.ApiAuctionDataBinder getBinder() {
        return this.binder;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public boolean isFullscreen() {
        return this == Interstitial || this == Rewarded;
    }

    @Nullable
    HeaderBiddingAd obtainHeaderBiddingAd(@NonNull Ad ad2) {
        for (w8.n nVar : this.placementBuilders) {
            HeaderBiddingAd headerBiddingAdH = nVar.h(ad2);
            if (headerBiddingAdH != null) {
                return headerBiddingAdH;
            }
        }
        return null;
    }
}
