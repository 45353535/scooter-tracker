package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdRequestKt {

    @NotNull
    public static final AdRequestKt INSTANCE = new AdRequestKt();

    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0092\u0001\u0093\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010h\u001a\u00020iH\u0001J\u0006\u0010j\u001a\u00020kJ\u0006\u0010l\u001a\u00020kJ\u0006\u0010m\u001a\u00020kJ\u0006\u0010n\u001a\u00020kJ\u0006\u0010o\u001a\u00020kJ\u0006\u0010p\u001a\u00020kJ\u0006\u0010q\u001a\u00020kJ\u0006\u0010r\u001a\u00020kJ\u0006\u0010s\u001a\u00020kJ\u0006\u0010t\u001a\u00020kJ\u0006\u0010u\u001a\u00020kJ\u0006\u0010v\u001a\u00020kJ\u0006\u0010w\u001a\u00020kJ\u0006\u0010x\u001a\u00020kJ\u0006\u0010y\u001a\u00020kJ\u0006\u0010z\u001a\u00020GJ\u0006\u0010{\u001a\u00020GJ\u0006\u0010|\u001a\u00020GJ\u0006\u0010}\u001a\u00020GJ\u0006\u0010~\u001a\u00020GJ\u0006\u0010\u007f\u001a\u00020GJ\u0007\u0010\u0080\u0001\u001a\u00020GJ\u0007\u0010\u0081\u0001\u001a\u00020GJ\u0007\u0010\u0082\u0001\u001a\u00020GJ\u0007\u0010\u0083\u0001\u001a\u00020GJ\u0007\u0010\u0084\u0001\u001a\u00020GJ%\u0010\u0085\u0001\u001a\u00020k*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.H\u0007¢\u0006\u0003\b\u0086\u0001J6\u0010\u0087\u0001\u001a\u00020k*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0007\u0010\u0088\u0001\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020/H\u0007¢\u0006\u0003\b\u0089\u0001J;\u0010\u008a\u0001\u001a\u00020k*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0014\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0\u008c\u0001H\u0007¢\u0006\u0003\b\u008d\u0001J.\u0010\u008e\u0001\u001a\u00020k*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0007\u0010\u0088\u0001\u001a\u00020/H\u0007¢\u0006\u0003\b\u008f\u0001J7\u0010\u0090\u0001\u001a\u00020k*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0007\u0010\u0088\u0001\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020/H\u0087\n¢\u0006\u0003\b\u0091\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R#\u0010-\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.8G¢\u0006\u0006\u001a\u0004\b1\u00102R$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020>8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010D\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R$\u0010H\u001a\u00020G2\u0006\u0010\u0005\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010M\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u00106\"\u0004\bO\u00108R$\u0010Q\u001a\u00020P2\u0006\u0010\u0005\u001a\u00020P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u00020V2\u0006\u0010\u0005\u001a\u00020V8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\\\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u00106\"\u0004\b^\u00108R$\u0010_\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010\u000f\"\u0004\ba\u0010\u0011R\u0017\u0010b\u001a\u0004\u0018\u00010\u001b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0017\u0010e\u001a\u0004\u0018\u00010>*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006\u0094\u0001"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;)V", "value", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "", "adFormatValue", "getAdFormatValue", "()I", "setAdFormatValue", "(I)V", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;", "adRequestType", "getAdRequestType", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;", "setAdRequestType", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;)V", "adRequestTypeValue", "getAdRequestTypeValue", "setAdRequestTypeValue", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSize", "getBannerSize", "()Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "setBannerSize", "(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;)V", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignState", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/AdRequestKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "Lcom/google/protobuf/ByteString;", "impressionOpportunityId", "getImpressionOpportunityId", "()Lcom/google/protobuf/ByteString;", "setImpressionOpportunityId", "(Lcom/google/protobuf/ByteString;)V", "mediationAdUnitId", "getMediationAdUnitId", "()Ljava/lang/String;", "setMediationAdUnitId", "(Ljava/lang/String;)V", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfo", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "placementId", "getPlacementId", "setPlacementId", "", "requestImpressionConfiguration", "getRequestImpressionConfiguration", "()Z", "setRequestImpressionConfiguration", "(Z)V", "scarSignal", "getScarSignal", "setScarSignal", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "tcf", "getTcf", "setTcf", "webviewVersion", "getWebviewVersion", "setWebviewVersion", "bannerSizeOrNull", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/AdRequestKt$Dsl;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "mediationInfoOrNull", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdRequestKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "_build", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "clearAdFormat", "", "clearAdRequestType", "clearBannerSize", "clearCampaignState", "clearDynamicDeviceInfo", "clearImpressionOpportunityId", "clearMediationAdUnitId", "clearMediationInfo", "clearPlacementId", "clearRequestImpressionConfiguration", "clearScarSignal", "clearSessionCounters", "clearStaticDeviceInfo", "clearTcf", "clearWebviewVersion", "hasAdFormat", "hasAdRequestType", "hasBannerSize", "hasCampaignState", "hasDynamicDeviceInfo", "hasMediationAdUnitId", "hasMediationInfo", "hasSessionCounters", "hasStaticDeviceInfo", "hasTcf", "hasWebviewVersion", "clear", "clearExtras", "put", C4240b4.i.W, "putExtras", "putAll", "map", "", "putAllExtras", "remove", "removeExtras", "set", "setExtras", y.f66058y, "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdRequestOuterClass.AdRequest.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.AdRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(AdRequestOuterClass.AdRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ AdRequestOuterClass.AdRequest _build() {
            AdRequestOuterClass.AdRequest adRequestBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(adRequestBuild, "_builder.build()");
            return adRequestBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdRequestType() {
            this._builder.clearAdRequestType();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearRequestImpressionConfiguration() {
            this._builder.clearRequestImpressionConfiguration();
        }

        public final void clearScarSignal() {
            this._builder.clearScarSignal();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @NotNull
        public final AdRequestOuterClass.AdRequestType getAdRequestType() {
            AdRequestOuterClass.AdRequestType adRequestType = this._builder.getAdRequestType();
            Intrinsics.checkNotNullExpressionValue(adRequestType, "_builder.getAdRequestType()");
            return adRequestType;
        }

        public final int getAdRequestTypeValue() {
            return this._builder.getAdRequestTypeValue();
        }

        @NotNull
        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            Intrinsics.checkNotNullExpressionValue(bannerSize, "_builder.getBannerSize()");
            return bannerSize;
        }

        @Nullable
        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return AdRequestKtKt.getBannerSizeOrNull(dsl._builder);
        }

        @NotNull
        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            Intrinsics.checkNotNullExpressionValue(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            Intrinsics.checkNotNullExpressionValue(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            Intrinsics.checkNotNullExpressionValue(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        @NotNull
        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            Intrinsics.checkNotNullExpressionValue(mediationAdUnitId, "_builder.getMediationAdUnitId()");
            return mediationAdUnitId;
        }

        @NotNull
        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            Intrinsics.checkNotNullExpressionValue(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        @Nullable
        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return AdRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }

        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            Intrinsics.checkNotNullExpressionValue(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final boolean getRequestImpressionConfiguration() {
            return this._builder.getRequestImpressionConfiguration();
        }

        @NotNull
        public final ByteString getScarSignal() {
            ByteString scarSignal = this._builder.getScarSignal();
            Intrinsics.checkNotNullExpressionValue(scarSignal, "_builder.getScarSignal()");
            return scarSignal;
        }

        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            Intrinsics.checkNotNullExpressionValue(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        @NotNull
        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            Intrinsics.checkNotNullExpressionValue(tcf, "_builder.getTcf()");
            return tcf;
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdRequestType() {
            return this._builder.hasAdRequestType();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllExtras(map);
        }

        public final void putExtras(@NotNull DslMap<String, String, ExtrasProxy> dslMap, @NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeExtras(key);
        }

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setAdRequestType(@NotNull AdRequestOuterClass.AdRequestType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdRequestType(value);
        }

        public final void setAdRequestTypeValue(int i10) {
            this._builder.setAdRequestTypeValue(i10);
        }

        public final void setBannerSize(@NotNull AdRequestOuterClass.BannerSize value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBannerSize(value);
        }

        public final void setCampaignState(@NotNull CampaignStateOuterClass.CampaignState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setImpressionOpportunityId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setMediationAdUnitId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void setMediationInfo(@NotNull MediationInfoOuterClass.MediationInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void setPlacementId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setRequestImpressionConfiguration(boolean z10) {
            this._builder.setRequestImpressionConfiguration(z10);
        }

        public final void setScarSignal(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setScarSignal(value);
        }

        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setTcf(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTcf(value);
        }

        public final void setWebviewVersion(int i10) {
            this._builder.setWebviewVersion(i10);
        }

        private Dsl(AdRequestOuterClass.AdRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdRequestKt() {
    }
}
