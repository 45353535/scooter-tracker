package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.Extras;
import io.bidmachine.protobuf.SdkAnalyticConfig;
import io.bidmachine.protobuf.TokenConfiguration;
import io.bidmachine.protobuf.sdk.AssetCache;
import io.bidmachine.protobuf.sdk.Configuration;
import io.bidmachine.protobuf.sdk.ConfigurationOrBuilder;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class InitResponse extends h0 implements InitResponseOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 5;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 6;
    public static final int AD_CACHE_PLACEMENT_CONTROL_FIELD_NUMBER = 8;
    public static final int AD_NETWORKS_FIELD_NUMBER = 4;
    public static final int AD_NETWORKS_LOADING_TIMEOUT_FIELD_NUMBER = 9;
    public static final int AD_REQUEST_TMAX_FIELD_NUMBER = 7;
    public static final int ASSET_CACHE_CONFIGURATION_FIELD_NUMBER = 16;
    public static final int ENDPOINT_FIELD_NUMBER = 1;
    public static final int EVENT_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int EXTRAS_FIELD_NUMBER = 14;
    public static final int SDK_ANALYTIC_CONFIG_FIELD_NUMBER = 10;
    public static final int SDK_ANALYTIC_CONFIG_V2_FIELD_NUMBER = 15;
    public static final int SESSION_RESET_AFTER_FIELD_NUMBER = 3;
    public static final int SHOW_WITHOUT_INTERNET_FIELD_NUMBER = 13;
    public static final int TOKEN_CONFIGURATIONS_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    private int adCacheControl_;
    private int adCacheMaxAge_;
    private w0 adCachePlacementControl_;
    private int adNetworksLoadingTimeout_;
    private List<AdNetwork> adNetworks_;
    private int adRequestTmax_;
    private AssetCache.Configuration assetCacheConfiguration_;
    private volatile Object endpoint_;
    private AdExtension.EventConfiguration eventConfiguration_;
    private List<Ad.Event> event_;
    private Extras extras_;
    private byte memoizedIsInitialized;
    private Configuration sdkAnalyticConfigV2_;
    private SdkAnalyticConfig sdkAnalyticConfig_;
    private int sessionResetAfter_;
    private boolean showWithoutInternet_;
    private List<TokenConfiguration> tokenConfigurations_;
    private static final InitResponse DEFAULT_INSTANCE = new InitResponse();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.InitResponse.1
        @Override // com.explorestack.protobuf.p1
        public InitResponse parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new InitResponse(lVar, wVar);
        }
    };

    private static final class AdCachePlacementControlDefaultEntryHolder {
        static final u0 defaultEntry = u0.n(InitProto.internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor, z2.b.f19481l, "", z2.b.f19483n, AdCachePlacementControl.getDefaultInstance());

        private AdCachePlacementControlDefaultEntryHolder() {
        }
    }

    public static InitResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 internalGetAdCachePlacementControl() {
        w0 w0Var = this.adCachePlacementControl_;
        return w0Var == null ? w0.g(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : w0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitResponse) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean containsAdCachePlacementControl(String str) {
        str.getClass();
        return internalGetAdCachePlacementControl().i().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitResponse)) {
            return super.equals(obj);
        }
        InitResponse initResponse = (InitResponse) obj;
        if (!getEndpoint().equals(initResponse.getEndpoint()) || !getEventList().equals(initResponse.getEventList()) || getSessionResetAfter() != initResponse.getSessionResetAfter() || !getAdNetworksList().equals(initResponse.getAdNetworksList()) || this.adCacheControl_ != initResponse.adCacheControl_ || getAdCacheMaxAge() != initResponse.getAdCacheMaxAge() || getAdRequestTmax() != initResponse.getAdRequestTmax() || !internalGetAdCachePlacementControl().equals(initResponse.internalGetAdCachePlacementControl()) || getAdNetworksLoadingTimeout() != initResponse.getAdNetworksLoadingTimeout() || hasSdkAnalyticConfig() != initResponse.hasSdkAnalyticConfig()) {
            return false;
        }
        if ((hasSdkAnalyticConfig() && !getSdkAnalyticConfig().equals(initResponse.getSdkAnalyticConfig())) || hasEventConfiguration() != initResponse.hasEventConfiguration()) {
            return false;
        }
        if ((hasEventConfiguration() && !getEventConfiguration().equals(initResponse.getEventConfiguration())) || !getTokenConfigurationsList().equals(initResponse.getTokenConfigurationsList()) || getShowWithoutInternet() != initResponse.getShowWithoutInternet() || hasExtras() != initResponse.hasExtras()) {
            return false;
        }
        if ((hasExtras() && !getExtras().equals(initResponse.getExtras())) || hasSdkAnalyticConfigV2() != initResponse.hasSdkAnalyticConfigV2()) {
            return false;
        }
        if ((!hasSdkAnalyticConfigV2() || getSdkAnalyticConfigV2().equals(initResponse.getSdkAnalyticConfigV2())) && hasAssetCacheConfiguration() == initResponse.hasAssetCacheConfiguration()) {
            return (!hasAssetCacheConfiguration() || getAssetCacheConfiguration().equals(initResponse.getAssetCacheConfiguration())) && this.unknownFields.equals(initResponse.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCacheControl getAdCacheControl() {
        AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
        return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCacheControlValue() {
        return this.adCacheControl_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCacheMaxAge() {
        return this.adCacheMaxAge_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    @Deprecated
    public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
        return getAdCachePlacementControlMap();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCachePlacementControlCount() {
        return internalGetAdCachePlacementControl().i().size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
        return internalGetAdCachePlacementControl().i();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
        str.getClass();
        Map mapI = internalGetAdCachePlacementControl().i();
        return mapI.containsKey(str) ? (AdCachePlacementControl) mapI.get(str) : adCachePlacementControl;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
        str.getClass();
        Map mapI = internalGetAdCachePlacementControl().i();
        if (mapI.containsKey(str)) {
            return (AdCachePlacementControl) mapI.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdNetwork getAdNetworks(int i10) {
        return this.adNetworks_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdNetworksCount() {
        return this.adNetworks_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<AdNetwork> getAdNetworksList() {
        return this.adNetworks_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdNetworksLoadingTimeout() {
        return this.adNetworksLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdNetworkOrBuilder getAdNetworksOrBuilder(int i10) {
        return this.adNetworks_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
        return this.adNetworks_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdRequestTmax() {
        return this.adRequestTmax_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AssetCache.Configuration getAssetCacheConfiguration() {
        AssetCache.Configuration configuration = this.assetCacheConfiguration_;
        return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AssetCache.ConfigurationOrBuilder getAssetCacheConfigurationOrBuilder() {
        return getAssetCacheConfiguration();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public String getEndpoint() {
        Object obj = this.endpoint_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.endpoint_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ByteString getEndpointBytes() {
        Object obj = this.endpoint_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.endpoint_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Ad.Event getEvent(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdExtension.EventConfiguration getEventConfiguration() {
        AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
        return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
        return getEventConfiguration();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getEventCount() {
        return this.event_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<Ad.Event> getEventList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Ad.EventOrBuilder getEventOrBuilder(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Extras getExtras() {
        Extras extras = this.extras_;
        return extras == null ? Extras.getDefaultInstance() : extras;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ExtrasOrBuilder getExtrasOrBuilder() {
        return getExtras();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public SdkAnalyticConfig getSdkAnalyticConfig() {
        SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
        return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
        return getSdkAnalyticConfig();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Configuration getSdkAnalyticConfigV2() {
        Configuration configuration = this.sdkAnalyticConfigV2_;
        return configuration == null ? Configuration.getDefaultInstance() : configuration;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder() {
        return getSdkAnalyticConfigV2();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getEndpointBytes().isEmpty() ? h0.computeStringSize(1, this.endpoint_) : 0;
        for (int i11 = 0; i11 < this.event_.size(); i11++) {
            iComputeStringSize += n.G(2, this.event_.get(i11));
        }
        int i12 = this.sessionResetAfter_;
        if (i12 != 0) {
            iComputeStringSize += n.Y(3, i12);
        }
        for (int i13 = 0; i13 < this.adNetworks_.size(); i13++) {
            iComputeStringSize += n.G(4, this.adNetworks_.get(i13));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            iComputeStringSize += n.l(5, this.adCacheControl_);
        }
        int i14 = this.adCacheMaxAge_;
        if (i14 != 0) {
            iComputeStringSize += n.Y(6, i14);
        }
        int i15 = this.adRequestTmax_;
        if (i15 != 0) {
            iComputeStringSize += n.Y(7, i15);
        }
        for (Map.Entry entry : internalGetAdCachePlacementControl().i().entrySet()) {
            iComputeStringSize += n.G(8, AdCachePlacementControlDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
        }
        int i16 = this.adNetworksLoadingTimeout_;
        if (i16 != 0) {
            iComputeStringSize += n.Y(9, i16);
        }
        if (this.sdkAnalyticConfig_ != null) {
            iComputeStringSize += n.G(10, getSdkAnalyticConfig());
        }
        if (this.eventConfiguration_ != null) {
            iComputeStringSize += n.G(11, getEventConfiguration());
        }
        for (int i17 = 0; i17 < this.tokenConfigurations_.size(); i17++) {
            iComputeStringSize += n.G(12, this.tokenConfigurations_.get(i17));
        }
        boolean z10 = this.showWithoutInternet_;
        if (z10) {
            iComputeStringSize += n.e(13, z10);
        }
        if (this.extras_ != null) {
            iComputeStringSize += n.G(14, getExtras());
        }
        if (this.sdkAnalyticConfigV2_ != null) {
            iComputeStringSize += n.G(15, getSdkAnalyticConfigV2());
        }
        if (this.assetCacheConfiguration_ != null) {
            iComputeStringSize += n.G(16, getAssetCacheConfiguration());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getSessionResetAfter() {
        return this.sessionResetAfter_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean getShowWithoutInternet() {
        return this.showWithoutInternet_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public TokenConfiguration getTokenConfigurations(int i10) {
        return this.tokenConfigurations_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getTokenConfigurationsCount() {
        return this.tokenConfigurations_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<TokenConfiguration> getTokenConfigurationsList() {
        return this.tokenConfigurations_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i10) {
        return this.tokenConfigurations_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList() {
        return this.tokenConfigurations_;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasAssetCacheConfiguration() {
        return this.assetCacheConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasEventConfiguration() {
        return this.eventConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasExtras() {
        return this.extras_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasSdkAnalyticConfig() {
        return this.sdkAnalyticConfig_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasSdkAnalyticConfigV2() {
        return this.sdkAnalyticConfigV2_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getEndpoint().hashCode();
        if (getEventCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getEventList().hashCode();
        }
        int sessionResetAfter = (((iHashCode * 37) + 3) * 53) + getSessionResetAfter();
        if (getAdNetworksCount() > 0) {
            sessionResetAfter = (((sessionResetAfter * 37) + 4) * 53) + getAdNetworksList().hashCode();
        }
        int adCacheMaxAge = (((((((((((sessionResetAfter * 37) + 5) * 53) + this.adCacheControl_) * 37) + 6) * 53) + getAdCacheMaxAge()) * 37) + 7) * 53) + getAdRequestTmax();
        if (!internalGetAdCachePlacementControl().i().isEmpty()) {
            adCacheMaxAge = (((adCacheMaxAge * 37) + 8) * 53) + internalGetAdCachePlacementControl().hashCode();
        }
        int adNetworksLoadingTimeout = (((adCacheMaxAge * 37) + 9) * 53) + getAdNetworksLoadingTimeout();
        if (hasSdkAnalyticConfig()) {
            adNetworksLoadingTimeout = (((adNetworksLoadingTimeout * 37) + 10) * 53) + getSdkAnalyticConfig().hashCode();
        }
        if (hasEventConfiguration()) {
            adNetworksLoadingTimeout = (((adNetworksLoadingTimeout * 37) + 11) * 53) + getEventConfiguration().hashCode();
        }
        if (getTokenConfigurationsCount() > 0) {
            adNetworksLoadingTimeout = (((adNetworksLoadingTimeout * 37) + 12) * 53) + getTokenConfigurationsList().hashCode();
        }
        int iD = (((adNetworksLoadingTimeout * 37) + 13) * 53) + j0.d(getShowWithoutInternet());
        if (hasExtras()) {
            iD = (((iD * 37) + 14) * 53) + getExtras().hashCode();
        }
        if (hasSdkAnalyticConfigV2()) {
            iD = (((iD * 37) + 15) * 53) + getSdkAnalyticConfigV2().hashCode();
        }
        if (hasAssetCacheConfiguration()) {
            iD = (((iD * 37) + 16) * 53) + getAssetCacheConfiguration().hashCode();
        }
        int iHashCode2 = (iD * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable.d(InitResponse.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.h0
    protected w0 internalGetMapField(int i10) {
        if (i10 == 8) {
            return internalGetAdCachePlacementControl();
        }
        throw new RuntimeException("Invalid map field number: " + i10);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new InitResponse();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (!getEndpointBytes().isEmpty()) {
            h0.writeString(nVar, 1, this.endpoint_);
        }
        for (int i10 = 0; i10 < this.event_.size(); i10++) {
            nVar.J0(2, this.event_.get(i10));
        }
        int i11 = this.sessionResetAfter_;
        if (i11 != 0) {
            nVar.W0(3, i11);
        }
        for (int i12 = 0; i12 < this.adNetworks_.size(); i12++) {
            nVar.J0(4, this.adNetworks_.get(i12));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            nVar.v0(5, this.adCacheControl_);
        }
        int i13 = this.adCacheMaxAge_;
        if (i13 != 0) {
            nVar.W0(6, i13);
        }
        int i14 = this.adRequestTmax_;
        if (i14 != 0) {
            nVar.W0(7, i14);
        }
        h0.serializeStringMapTo(nVar, internalGetAdCachePlacementControl(), AdCachePlacementControlDefaultEntryHolder.defaultEntry, 8);
        int i15 = this.adNetworksLoadingTimeout_;
        if (i15 != 0) {
            nVar.W0(9, i15);
        }
        if (this.sdkAnalyticConfig_ != null) {
            nVar.J0(10, getSdkAnalyticConfig());
        }
        if (this.eventConfiguration_ != null) {
            nVar.J0(11, getEventConfiguration());
        }
        for (int i16 = 0; i16 < this.tokenConfigurations_.size(); i16++) {
            nVar.J0(12, this.tokenConfigurations_.get(i16));
        }
        boolean z10 = this.showWithoutInternet_;
        if (z10) {
            nVar.n0(13, z10);
        }
        if (this.extras_ != null) {
            nVar.J0(14, getExtras());
        }
        if (this.sdkAnalyticConfigV2_ != null) {
            nVar.J0(15, getSdkAnalyticConfigV2());
        }
        if (this.assetCacheConfiguration_ != null) {
            nVar.J0(16, getAssetCacheConfiguration());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements InitResponseOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private w0 adCachePlacementControl_;
        private v1 adNetworksBuilder_;
        private int adNetworksLoadingTimeout_;
        private List<AdNetwork> adNetworks_;
        private int adRequestTmax_;
        private a2 assetCacheConfigurationBuilder_;
        private AssetCache.Configuration assetCacheConfiguration_;
        private int bitField0_;
        private Object endpoint_;
        private v1 eventBuilder_;
        private a2 eventConfigurationBuilder_;
        private AdExtension.EventConfiguration eventConfiguration_;
        private List<Ad.Event> event_;
        private a2 extrasBuilder_;
        private Extras extras_;
        private a2 sdkAnalyticConfigBuilder_;
        private a2 sdkAnalyticConfigV2Builder_;
        private Configuration sdkAnalyticConfigV2_;
        private SdkAnalyticConfig sdkAnalyticConfig_;
        private int sessionResetAfter_;
        private boolean showWithoutInternet_;
        private v1 tokenConfigurationsBuilder_;
        private List<TokenConfiguration> tokenConfigurations_;

        private void ensureAdNetworksIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adNetworks_ = new ArrayList(this.adNetworks_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureEventIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.event_ = new ArrayList(this.event_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureTokenConfigurationsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.tokenConfigurations_ = new ArrayList(this.tokenConfigurations_);
                this.bitField0_ |= 8;
            }
        }

        private v1 getAdNetworksFieldBuilder() {
            if (this.adNetworksBuilder_ == null) {
                this.adNetworksBuilder_ = new v1(this.adNetworks_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adNetworks_ = null;
            }
            return this.adNetworksBuilder_;
        }

        private a2 getAssetCacheConfigurationFieldBuilder() {
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfigurationBuilder_ = new a2(getAssetCacheConfiguration(), getParentForChildren(), isClean());
                this.assetCacheConfiguration_ = null;
            }
            return this.assetCacheConfigurationBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        private a2 getEventConfigurationFieldBuilder() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfigurationBuilder_ = new a2(getEventConfiguration(), getParentForChildren(), isClean());
                this.eventConfiguration_ = null;
            }
            return this.eventConfigurationBuilder_;
        }

        private v1 getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
                this.eventBuilder_ = new v1(this.event_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.event_ = null;
            }
            return this.eventBuilder_;
        }

        private a2 getExtrasFieldBuilder() {
            if (this.extrasBuilder_ == null) {
                this.extrasBuilder_ = new a2(getExtras(), getParentForChildren(), isClean());
                this.extras_ = null;
            }
            return this.extrasBuilder_;
        }

        private a2 getSdkAnalyticConfigFieldBuilder() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfigBuilder_ = new a2(getSdkAnalyticConfig(), getParentForChildren(), isClean());
                this.sdkAnalyticConfig_ = null;
            }
            return this.sdkAnalyticConfigBuilder_;
        }

        private a2 getSdkAnalyticConfigV2FieldBuilder() {
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2Builder_ = new a2(getSdkAnalyticConfigV2(), getParentForChildren(), isClean());
                this.sdkAnalyticConfigV2_ = null;
            }
            return this.sdkAnalyticConfigV2Builder_;
        }

        private v1 getTokenConfigurationsFieldBuilder() {
            if (this.tokenConfigurationsBuilder_ == null) {
                this.tokenConfigurationsBuilder_ = new v1(this.tokenConfigurations_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.tokenConfigurations_ = null;
            }
            return this.tokenConfigurationsBuilder_;
        }

        private w0 internalGetAdCachePlacementControl() {
            w0 w0Var = this.adCachePlacementControl_;
            return w0Var == null ? w0.g(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : w0Var;
        }

        private w0 internalGetMutableAdCachePlacementControl() {
            onChanged();
            if (this.adCachePlacementControl_ == null) {
                this.adCachePlacementControl_ = w0.p(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
            }
            if (!this.adCachePlacementControl_.m()) {
                this.adCachePlacementControl_ = this.adCachePlacementControl_.f();
            }
            return this.adCachePlacementControl_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
                getAdNetworksFieldBuilder();
                getTokenConfigurationsFieldBuilder();
            }
        }

        public Builder addAdNetworks(AdNetwork adNetwork) {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var != null) {
                v1Var.e(adNetwork);
                return this;
            }
            adNetwork.getClass();
            ensureAdNetworksIsMutable();
            this.adNetworks_.add(adNetwork);
            onChanged();
            return this;
        }

        public AdNetwork.Builder addAdNetworksBuilder() {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().c(AdNetwork.getDefaultInstance());
        }

        public Builder addAllAdNetworks(Iterable<? extends AdNetwork> iterable) {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureAdNetworksIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.adNetworks_);
            onChanged();
            return this;
        }

        public Builder addAllEvent(Iterable<? extends Ad.Event> iterable) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureEventIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.event_);
            onChanged();
            return this;
        }

        public Builder addAllTokenConfigurations(Iterable<? extends TokenConfiguration> iterable) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureTokenConfigurationsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.tokenConfigurations_);
            onChanged();
            return this;
        }

        public Builder addEvent(Ad.Event event) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.e(event);
                return this;
            }
            event.getClass();
            ensureEventIsMutable();
            this.event_.add(event);
            onChanged();
            return this;
        }

        public Ad.Event.Builder addEventBuilder() {
            return (Ad.Event.Builder) getEventFieldBuilder().c(Ad.Event.getDefaultInstance());
        }

        public Builder addTokenConfigurations(TokenConfiguration tokenConfiguration) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var != null) {
                v1Var.e(tokenConfiguration);
                return this;
            }
            tokenConfiguration.getClass();
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.add(tokenConfiguration);
            onChanged();
            return this;
        }

        public TokenConfiguration.Builder addTokenConfigurationsBuilder() {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().c(TokenConfiguration.getDefaultInstance());
        }

        public Builder clearAdCacheControl() {
            this.adCacheControl_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCacheMaxAge() {
            this.adCacheMaxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCachePlacementControl() {
            internalGetMutableAdCachePlacementControl().l().clear();
            return this;
        }

        public Builder clearAdNetworks() {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.adNetworks_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearAdNetworksLoadingTimeout() {
            this.adNetworksLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdRequestTmax() {
            this.adRequestTmax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAssetCacheConfiguration() {
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfiguration_ = null;
                onChanged();
                return this;
            }
            this.assetCacheConfiguration_ = null;
            this.assetCacheConfigurationBuilder_ = null;
            return this;
        }

        public Builder clearEndpoint() {
            this.endpoint_ = InitResponse.getDefaultInstance().getEndpoint();
            onChanged();
            return this;
        }

        public Builder clearEvent() {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.event_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearEventConfiguration() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
                onChanged();
                return this;
            }
            this.eventConfiguration_ = null;
            this.eventConfigurationBuilder_ = null;
            return this;
        }

        public Builder clearExtras() {
            if (this.extrasBuilder_ == null) {
                this.extras_ = null;
                onChanged();
                return this;
            }
            this.extras_ = null;
            this.extrasBuilder_ = null;
            return this;
        }

        public Builder clearSdkAnalyticConfig() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
                onChanged();
                return this;
            }
            this.sdkAnalyticConfig_ = null;
            this.sdkAnalyticConfigBuilder_ = null;
            return this;
        }

        public Builder clearSdkAnalyticConfigV2() {
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2_ = null;
                onChanged();
                return this;
            }
            this.sdkAnalyticConfigV2_ = null;
            this.sdkAnalyticConfigV2Builder_ = null;
            return this;
        }

        public Builder clearSessionResetAfter() {
            this.sessionResetAfter_ = 0;
            onChanged();
            return this;
        }

        public Builder clearShowWithoutInternet() {
            this.showWithoutInternet_ = false;
            onChanged();
            return this;
        }

        public Builder clearTokenConfigurations() {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.tokenConfigurations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean containsAdCachePlacementControl(String str) {
            str.getClass();
            return internalGetAdCachePlacementControl().i().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCacheControl getAdCacheControl() {
            AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
            return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCacheControlValue() {
            return this.adCacheControl_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCacheMaxAge() {
            return this.adCacheMaxAge_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        @Deprecated
        public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
            return getAdCachePlacementControlMap();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCachePlacementControlCount() {
            return internalGetAdCachePlacementControl().i().size();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
            return internalGetAdCachePlacementControl().i();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
            str.getClass();
            Map mapI = internalGetAdCachePlacementControl().i();
            return mapI.containsKey(str) ? (AdCachePlacementControl) mapI.get(str) : adCachePlacementControl;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetAdCachePlacementControl().i();
            if (mapI.containsKey(str)) {
                return (AdCachePlacementControl) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdNetwork getAdNetworks(int i10) {
            v1 v1Var = this.adNetworksBuilder_;
            return v1Var == null ? this.adNetworks_.get(i10) : (AdNetwork) v1Var.n(i10);
        }

        public AdNetwork.Builder getAdNetworksBuilder(int i10) {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().k(i10);
        }

        public List<AdNetwork.Builder> getAdNetworksBuilderList() {
            return getAdNetworksFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdNetworksCount() {
            v1 v1Var = this.adNetworksBuilder_;
            return v1Var == null ? this.adNetworks_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<AdNetwork> getAdNetworksList() {
            v1 v1Var = this.adNetworksBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.adNetworks_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdNetworksLoadingTimeout() {
            return this.adNetworksLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdNetworkOrBuilder getAdNetworksOrBuilder(int i10) {
            v1 v1Var = this.adNetworksBuilder_;
            return v1Var == null ? this.adNetworks_.get(i10) : (AdNetworkOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
            v1 v1Var = this.adNetworksBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.adNetworks_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdRequestTmax() {
            return this.adRequestTmax_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AssetCache.Configuration getAssetCacheConfiguration() {
            a2 a2Var = this.assetCacheConfigurationBuilder_;
            if (a2Var != null) {
                return (AssetCache.Configuration) a2Var.e();
            }
            AssetCache.Configuration configuration = this.assetCacheConfiguration_;
            return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
        }

        public AssetCache.Configuration.Builder getAssetCacheConfigurationBuilder() {
            onChanged();
            return (AssetCache.Configuration.Builder) getAssetCacheConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AssetCache.ConfigurationOrBuilder getAssetCacheConfigurationOrBuilder() {
            a2 a2Var = this.assetCacheConfigurationBuilder_;
            if (a2Var != null) {
                return (AssetCache.ConfigurationOrBuilder) a2Var.f();
            }
            AssetCache.Configuration configuration = this.assetCacheConfiguration_;
            return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public String getEndpoint() {
            Object obj = this.endpoint_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.endpoint_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ByteString getEndpointBytes() {
            Object obj = this.endpoint_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.endpoint_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Ad.Event getEvent(int i10) {
            v1 v1Var = this.eventBuilder_;
            return v1Var == null ? this.event_.get(i10) : (Ad.Event) v1Var.n(i10);
        }

        public Ad.Event.Builder getEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().k(i10);
        }

        public List<Ad.Event.Builder> getEventBuilderList() {
            return getEventFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdExtension.EventConfiguration getEventConfiguration() {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var != null) {
                return (AdExtension.EventConfiguration) a2Var.e();
            }
            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        public AdExtension.EventConfiguration.Builder getEventConfigurationBuilder() {
            onChanged();
            return (AdExtension.EventConfiguration.Builder) getEventConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var != null) {
                return (AdExtension.EventConfigurationOrBuilder) a2Var.f();
            }
            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getEventCount() {
            v1 v1Var = this.eventBuilder_;
            return v1Var == null ? this.event_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<Ad.Event> getEventList() {
            v1 v1Var = this.eventBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.event_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Ad.EventOrBuilder getEventOrBuilder(int i10) {
            v1 v1Var = this.eventBuilder_;
            return v1Var == null ? this.event_.get(i10) : (Ad.EventOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
            v1 v1Var = this.eventBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.event_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Extras getExtras() {
            a2 a2Var = this.extrasBuilder_;
            if (a2Var != null) {
                return (Extras) a2Var.e();
            }
            Extras extras = this.extras_;
            return extras == null ? Extras.getDefaultInstance() : extras;
        }

        public Extras.Builder getExtrasBuilder() {
            onChanged();
            return (Extras.Builder) getExtrasFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ExtrasOrBuilder getExtrasOrBuilder() {
            a2 a2Var = this.extrasBuilder_;
            if (a2Var != null) {
                return (ExtrasOrBuilder) a2Var.f();
            }
            Extras extras = this.extras_;
            return extras == null ? Extras.getDefaultInstance() : extras;
        }

        @Deprecated
        public Map<String, AdCachePlacementControl> getMutableAdCachePlacementControl() {
            return internalGetMutableAdCachePlacementControl().l();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public SdkAnalyticConfig getSdkAnalyticConfig() {
            a2 a2Var = this.sdkAnalyticConfigBuilder_;
            if (a2Var != null) {
                return (SdkAnalyticConfig) a2Var.e();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        public SdkAnalyticConfig.Builder getSdkAnalyticConfigBuilder() {
            onChanged();
            return (SdkAnalyticConfig.Builder) getSdkAnalyticConfigFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
            a2 a2Var = this.sdkAnalyticConfigBuilder_;
            if (a2Var != null) {
                return (SdkAnalyticConfigOrBuilder) a2Var.f();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Configuration getSdkAnalyticConfigV2() {
            a2 a2Var = this.sdkAnalyticConfigV2Builder_;
            if (a2Var != null) {
                return (Configuration) a2Var.e();
            }
            Configuration configuration = this.sdkAnalyticConfigV2_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        public Configuration.Builder getSdkAnalyticConfigV2Builder() {
            onChanged();
            return (Configuration.Builder) getSdkAnalyticConfigV2FieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder() {
            a2 a2Var = this.sdkAnalyticConfigV2Builder_;
            if (a2Var != null) {
                return (ConfigurationOrBuilder) a2Var.f();
            }
            Configuration configuration = this.sdkAnalyticConfigV2_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getSessionResetAfter() {
            return this.sessionResetAfter_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean getShowWithoutInternet() {
            return this.showWithoutInternet_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public TokenConfiguration getTokenConfigurations(int i10) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            return v1Var == null ? this.tokenConfigurations_.get(i10) : (TokenConfiguration) v1Var.n(i10);
        }

        public TokenConfiguration.Builder getTokenConfigurationsBuilder(int i10) {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().k(i10);
        }

        public List<TokenConfiguration.Builder> getTokenConfigurationsBuilderList() {
            return getTokenConfigurationsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getTokenConfigurationsCount() {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            return v1Var == null ? this.tokenConfigurations_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<TokenConfiguration> getTokenConfigurationsList() {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.tokenConfigurations_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i10) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            return v1Var == null ? this.tokenConfigurations_.get(i10) : (TokenConfigurationOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList() {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.tokenConfigurations_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasAssetCacheConfiguration() {
            return (this.assetCacheConfigurationBuilder_ == null && this.assetCacheConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasEventConfiguration() {
            return (this.eventConfigurationBuilder_ == null && this.eventConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasExtras() {
            return (this.extrasBuilder_ == null && this.extras_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasSdkAnalyticConfig() {
            return (this.sdkAnalyticConfigBuilder_ == null && this.sdkAnalyticConfig_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasSdkAnalyticConfigV2() {
            return (this.sdkAnalyticConfigV2Builder_ == null && this.sdkAnalyticConfigV2_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable.d(InitResponse.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMapField(int i10) {
            if (i10 == 8) {
                return internalGetAdCachePlacementControl();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMutableMapField(int i10) {
            if (i10 == 8) {
                return internalGetMutableAdCachePlacementControl();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAssetCacheConfiguration(AssetCache.Configuration configuration) {
            a2 a2Var = this.assetCacheConfigurationBuilder_;
            if (a2Var != null) {
                a2Var.g(configuration);
                return this;
            }
            AssetCache.Configuration configuration2 = this.assetCacheConfiguration_;
            if (configuration2 != null) {
                this.assetCacheConfiguration_ = AssetCache.Configuration.newBuilder(configuration2).mergeFrom(configuration).buildPartial();
            } else {
                this.assetCacheConfiguration_ = configuration;
            }
            onChanged();
            return this;
        }

        public Builder mergeEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var != null) {
                a2Var.g(eventConfiguration);
                return this;
            }
            AdExtension.EventConfiguration eventConfiguration2 = this.eventConfiguration_;
            if (eventConfiguration2 != null) {
                this.eventConfiguration_ = AdExtension.EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
            } else {
                this.eventConfiguration_ = eventConfiguration;
            }
            onChanged();
            return this;
        }

        public Builder mergeExtras(Extras extras) {
            a2 a2Var = this.extrasBuilder_;
            if (a2Var != null) {
                a2Var.g(extras);
                return this;
            }
            Extras extras2 = this.extras_;
            if (extras2 != null) {
                this.extras_ = Extras.newBuilder(extras2).mergeFrom(extras).buildPartial();
            } else {
                this.extras_ = extras;
            }
            onChanged();
            return this;
        }

        public Builder mergeSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            a2 a2Var = this.sdkAnalyticConfigBuilder_;
            if (a2Var != null) {
                a2Var.g(sdkAnalyticConfig);
                return this;
            }
            SdkAnalyticConfig sdkAnalyticConfig2 = this.sdkAnalyticConfig_;
            if (sdkAnalyticConfig2 != null) {
                this.sdkAnalyticConfig_ = SdkAnalyticConfig.newBuilder(sdkAnalyticConfig2).mergeFrom(sdkAnalyticConfig).buildPartial();
            } else {
                this.sdkAnalyticConfig_ = sdkAnalyticConfig;
            }
            onChanged();
            return this;
        }

        public Builder mergeSdkAnalyticConfigV2(Configuration configuration) {
            a2 a2Var = this.sdkAnalyticConfigV2Builder_;
            if (a2Var != null) {
                a2Var.g(configuration);
                return this;
            }
            Configuration configuration2 = this.sdkAnalyticConfigV2_;
            if (configuration2 != null) {
                this.sdkAnalyticConfigV2_ = Configuration.newBuilder(configuration2).mergeFrom(configuration).buildPartial();
            } else {
                this.sdkAnalyticConfigV2_ = configuration;
            }
            onChanged();
            return this;
        }

        public Builder putAdCachePlacementControl(String str, AdCachePlacementControl adCachePlacementControl) {
            str.getClass();
            adCachePlacementControl.getClass();
            internalGetMutableAdCachePlacementControl().l().put(str, adCachePlacementControl);
            return this;
        }

        public Builder putAllAdCachePlacementControl(Map<String, AdCachePlacementControl> map) {
            internalGetMutableAdCachePlacementControl().l().putAll(map);
            return this;
        }

        public Builder removeAdCachePlacementControl(String str) {
            str.getClass();
            internalGetMutableAdCachePlacementControl().l().remove(str);
            return this;
        }

        public Builder removeAdNetworks(int i10) {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureAdNetworksIsMutable();
            this.adNetworks_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeEvent(int i10) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureEventIsMutable();
            this.event_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeTokenConfigurations(int i10) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setAdCacheControl(AdCacheControl adCacheControl) {
            adCacheControl.getClass();
            this.adCacheControl_ = adCacheControl.getNumber();
            onChanged();
            return this;
        }

        public Builder setAdCacheControlValue(int i10) {
            this.adCacheControl_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdCacheMaxAge(int i10) {
            this.adCacheMaxAge_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdNetworks(int i10, AdNetwork adNetwork) {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, adNetwork);
                return this;
            }
            adNetwork.getClass();
            ensureAdNetworksIsMutable();
            this.adNetworks_.set(i10, adNetwork);
            onChanged();
            return this;
        }

        public Builder setAdNetworksLoadingTimeout(int i10) {
            this.adNetworksLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdRequestTmax(int i10) {
            this.adRequestTmax_ = i10;
            onChanged();
            return this;
        }

        public Builder setAssetCacheConfiguration(AssetCache.Configuration configuration) {
            a2 a2Var = this.assetCacheConfigurationBuilder_;
            if (a2Var != null) {
                a2Var.i(configuration);
                return this;
            }
            configuration.getClass();
            this.assetCacheConfiguration_ = configuration;
            onChanged();
            return this;
        }

        public Builder setEndpoint(String str) {
            str.getClass();
            this.endpoint_ = str;
            onChanged();
            return this;
        }

        public Builder setEndpointBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.endpoint_ = byteString;
            onChanged();
            return this;
        }

        public Builder setEvent(int i10, Ad.Event event) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, event);
                return this;
            }
            event.getClass();
            ensureEventIsMutable();
            this.event_.set(i10, event);
            onChanged();
            return this;
        }

        public Builder setEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var != null) {
                a2Var.i(eventConfiguration);
                return this;
            }
            eventConfiguration.getClass();
            this.eventConfiguration_ = eventConfiguration;
            onChanged();
            return this;
        }

        public Builder setExtras(Extras extras) {
            a2 a2Var = this.extrasBuilder_;
            if (a2Var != null) {
                a2Var.i(extras);
                return this;
            }
            extras.getClass();
            this.extras_ = extras;
            onChanged();
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            a2 a2Var = this.sdkAnalyticConfigBuilder_;
            if (a2Var != null) {
                a2Var.i(sdkAnalyticConfig);
                return this;
            }
            sdkAnalyticConfig.getClass();
            this.sdkAnalyticConfig_ = sdkAnalyticConfig;
            onChanged();
            return this;
        }

        public Builder setSdkAnalyticConfigV2(Configuration configuration) {
            a2 a2Var = this.sdkAnalyticConfigV2Builder_;
            if (a2Var != null) {
                a2Var.i(configuration);
                return this;
            }
            configuration.getClass();
            this.sdkAnalyticConfigV2_ = configuration;
            onChanged();
            return this;
        }

        public Builder setSessionResetAfter(int i10) {
            this.sessionResetAfter_ = i10;
            onChanged();
            return this;
        }

        public Builder setShowWithoutInternet(boolean z10) {
            this.showWithoutInternet_ = z10;
            onChanged();
            return this;
        }

        public Builder setTokenConfigurations(int i10, TokenConfiguration tokenConfiguration) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, tokenConfiguration);
                return this;
            }
            tokenConfiguration.getClass();
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.set(i10, tokenConfiguration);
            onChanged();
            return this;
        }

        private Builder() {
            this.endpoint_ = "";
            List list = Collections.EMPTY_LIST;
            this.event_ = list;
            this.adNetworks_ = list;
            this.adCacheControl_ = 0;
            this.tokenConfigurations_ = list;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitResponse build() {
            InitResponse initResponseBuildPartial = buildPartial();
            if (initResponseBuildPartial.isInitialized()) {
                return initResponseBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) initResponseBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitResponse buildPartial() {
            InitResponse initResponse = new InitResponse(this);
            initResponse.endpoint_ = this.endpoint_;
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                initResponse.event_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = DesugarCollections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                initResponse.event_ = this.event_;
            }
            initResponse.sessionResetAfter_ = this.sessionResetAfter_;
            v1 v1Var2 = this.adNetworksBuilder_;
            if (v1Var2 != null) {
                initResponse.adNetworks_ = v1Var2.f();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.adNetworks_ = DesugarCollections.unmodifiableList(this.adNetworks_);
                    this.bitField0_ &= -3;
                }
                initResponse.adNetworks_ = this.adNetworks_;
            }
            initResponse.adCacheControl_ = this.adCacheControl_;
            initResponse.adCacheMaxAge_ = this.adCacheMaxAge_;
            initResponse.adRequestTmax_ = this.adRequestTmax_;
            initResponse.adCachePlacementControl_ = internalGetAdCachePlacementControl();
            initResponse.adCachePlacementControl_.n();
            initResponse.adNetworksLoadingTimeout_ = this.adNetworksLoadingTimeout_;
            a2 a2Var = this.sdkAnalyticConfigBuilder_;
            if (a2Var == null) {
                initResponse.sdkAnalyticConfig_ = this.sdkAnalyticConfig_;
            } else {
                initResponse.sdkAnalyticConfig_ = (SdkAnalyticConfig) a2Var.a();
            }
            a2 a2Var2 = this.eventConfigurationBuilder_;
            if (a2Var2 == null) {
                initResponse.eventConfiguration_ = this.eventConfiguration_;
            } else {
                initResponse.eventConfiguration_ = (AdExtension.EventConfiguration) a2Var2.a();
            }
            v1 v1Var3 = this.tokenConfigurationsBuilder_;
            if (v1Var3 != null) {
                initResponse.tokenConfigurations_ = v1Var3.f();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.tokenConfigurations_ = DesugarCollections.unmodifiableList(this.tokenConfigurations_);
                    this.bitField0_ &= -9;
                }
                initResponse.tokenConfigurations_ = this.tokenConfigurations_;
            }
            initResponse.showWithoutInternet_ = this.showWithoutInternet_;
            a2 a2Var3 = this.extrasBuilder_;
            if (a2Var3 == null) {
                initResponse.extras_ = this.extras_;
            } else {
                initResponse.extras_ = (Extras) a2Var3.a();
            }
            a2 a2Var4 = this.sdkAnalyticConfigV2Builder_;
            if (a2Var4 == null) {
                initResponse.sdkAnalyticConfigV2_ = this.sdkAnalyticConfigV2_;
            } else {
                initResponse.sdkAnalyticConfigV2_ = (Configuration) a2Var4.a();
            }
            a2 a2Var5 = this.assetCacheConfigurationBuilder_;
            if (a2Var5 == null) {
                initResponse.assetCacheConfiguration_ = this.assetCacheConfiguration_;
            } else {
                initResponse.assetCacheConfiguration_ = (AssetCache.Configuration) a2Var5.a();
            }
            onBuilt();
            return initResponse;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public InitResponse getDefaultInstanceForType() {
            return InitResponse.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(r2 r2Var) {
            return (Builder) super.setUnknownFields(r2Var);
        }

        public AdNetwork.Builder addAdNetworksBuilder(int i10) {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().b(i10, AdNetwork.getDefaultInstance());
        }

        public Ad.Event.Builder addEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().b(i10, Ad.Event.getDefaultInstance());
        }

        public TokenConfiguration.Builder addTokenConfigurationsBuilder(int i10) {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().b(i10, TokenConfiguration.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(r2 r2Var) {
            return (Builder) super.mergeUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.endpoint_ = "";
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                this.event_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                v1Var.g();
            }
            this.sessionResetAfter_ = 0;
            v1 v1Var2 = this.adNetworksBuilder_;
            if (v1Var2 == null) {
                this.adNetworks_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
            } else {
                v1Var2.g();
            }
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            this.adRequestTmax_ = 0;
            internalGetMutableAdCachePlacementControl().a();
            this.adNetworksLoadingTimeout_ = 0;
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
            } else {
                this.sdkAnalyticConfig_ = null;
                this.sdkAnalyticConfigBuilder_ = null;
            }
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            v1 v1Var3 = this.tokenConfigurationsBuilder_;
            if (v1Var3 == null) {
                this.tokenConfigurations_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
            } else {
                v1Var3.g();
            }
            this.showWithoutInternet_ = false;
            if (this.extrasBuilder_ == null) {
                this.extras_ = null;
            } else {
                this.extras_ = null;
                this.extrasBuilder_ = null;
            }
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2_ = null;
            } else {
                this.sdkAnalyticConfigV2_ = null;
                this.sdkAnalyticConfigV2Builder_ = null;
            }
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfiguration_ = null;
                return this;
            }
            this.assetCacheConfiguration_ = null;
            this.assetCacheConfigurationBuilder_ = null;
            return this;
        }

        public Builder setAssetCacheConfiguration(AssetCache.Configuration.Builder builder) {
            a2 a2Var = this.assetCacheConfigurationBuilder_;
            if (a2Var == null) {
                this.assetCacheConfiguration_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setEventConfiguration(AdExtension.EventConfiguration.Builder builder) {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var == null) {
                this.eventConfiguration_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setExtras(Extras.Builder builder) {
            a2 a2Var = this.extrasBuilder_;
            if (a2Var == null) {
                this.extras_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig.Builder builder) {
            a2 a2Var = this.sdkAnalyticConfigBuilder_;
            if (a2Var == null) {
                this.sdkAnalyticConfig_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setSdkAnalyticConfigV2(Configuration.Builder builder) {
            a2 a2Var = this.sdkAnalyticConfigV2Builder_;
            if (a2Var == null) {
                this.sdkAnalyticConfigV2_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder addAdNetworks(int i10, AdNetwork adNetwork) {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var == null) {
                adNetwork.getClass();
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i10, adNetwork);
                onChanged();
                return this;
            }
            v1Var.d(i10, adNetwork);
            return this;
        }

        public Builder addEvent(int i10, Ad.Event event) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(i10, event);
                onChanged();
                return this;
            }
            v1Var.d(i10, event);
            return this;
        }

        public Builder addTokenConfigurations(int i10, TokenConfiguration tokenConfiguration) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var == null) {
                tokenConfiguration.getClass();
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(i10, tokenConfiguration);
                onChanged();
                return this;
            }
            v1Var.d(i10, tokenConfiguration);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof InitResponse) {
                return mergeFrom((InitResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAdNetworks(int i10, AdNetwork.Builder builder) {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder setEvent(int i10, Ad.Event.Builder builder) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                ensureEventIsMutable();
                this.event_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder setTokenConfigurations(int i10, TokenConfiguration.Builder builder) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.endpoint_ = "";
            List list = Collections.EMPTY_LIST;
            this.event_ = list;
            this.adNetworks_ = list;
            this.adCacheControl_ = 0;
            this.tokenConfigurations_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(InitResponse initResponse) {
            if (initResponse == InitResponse.getDefaultInstance()) {
                return this;
            }
            if (!initResponse.getEndpoint().isEmpty()) {
                this.endpoint_ = initResponse.endpoint_;
                onChanged();
            }
            if (this.eventBuilder_ == null) {
                if (!initResponse.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = initResponse.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(initResponse.event_);
                    }
                    onChanged();
                }
            } else if (!initResponse.event_.isEmpty()) {
                if (!this.eventBuilder_.t()) {
                    this.eventBuilder_.a(initResponse.event_);
                } else {
                    this.eventBuilder_.h();
                    this.eventBuilder_ = null;
                    this.event_ = initResponse.event_;
                    this.bitField0_ &= -2;
                    this.eventBuilder_ = h0.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                }
            }
            if (initResponse.getSessionResetAfter() != 0) {
                setSessionResetAfter(initResponse.getSessionResetAfter());
            }
            if (this.adNetworksBuilder_ == null) {
                if (!initResponse.adNetworks_.isEmpty()) {
                    if (this.adNetworks_.isEmpty()) {
                        this.adNetworks_ = initResponse.adNetworks_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdNetworksIsMutable();
                        this.adNetworks_.addAll(initResponse.adNetworks_);
                    }
                    onChanged();
                }
            } else if (!initResponse.adNetworks_.isEmpty()) {
                if (!this.adNetworksBuilder_.t()) {
                    this.adNetworksBuilder_.a(initResponse.adNetworks_);
                } else {
                    this.adNetworksBuilder_.h();
                    this.adNetworksBuilder_ = null;
                    this.adNetworks_ = initResponse.adNetworks_;
                    this.bitField0_ &= -3;
                    this.adNetworksBuilder_ = h0.alwaysUseFieldBuilders ? getAdNetworksFieldBuilder() : null;
                }
            }
            if (initResponse.adCacheControl_ != 0) {
                setAdCacheControlValue(initResponse.getAdCacheControlValue());
            }
            if (initResponse.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(initResponse.getAdCacheMaxAge());
            }
            if (initResponse.getAdRequestTmax() != 0) {
                setAdRequestTmax(initResponse.getAdRequestTmax());
            }
            internalGetMutableAdCachePlacementControl().o(initResponse.internalGetAdCachePlacementControl());
            if (initResponse.getAdNetworksLoadingTimeout() != 0) {
                setAdNetworksLoadingTimeout(initResponse.getAdNetworksLoadingTimeout());
            }
            if (initResponse.hasSdkAnalyticConfig()) {
                mergeSdkAnalyticConfig(initResponse.getSdkAnalyticConfig());
            }
            if (initResponse.hasEventConfiguration()) {
                mergeEventConfiguration(initResponse.getEventConfiguration());
            }
            if (this.tokenConfigurationsBuilder_ == null) {
                if (!initResponse.tokenConfigurations_.isEmpty()) {
                    if (this.tokenConfigurations_.isEmpty()) {
                        this.tokenConfigurations_ = initResponse.tokenConfigurations_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureTokenConfigurationsIsMutable();
                        this.tokenConfigurations_.addAll(initResponse.tokenConfigurations_);
                    }
                    onChanged();
                }
            } else if (!initResponse.tokenConfigurations_.isEmpty()) {
                if (!this.tokenConfigurationsBuilder_.t()) {
                    this.tokenConfigurationsBuilder_.a(initResponse.tokenConfigurations_);
                } else {
                    this.tokenConfigurationsBuilder_.h();
                    this.tokenConfigurationsBuilder_ = null;
                    this.tokenConfigurations_ = initResponse.tokenConfigurations_;
                    this.bitField0_ &= -9;
                    this.tokenConfigurationsBuilder_ = h0.alwaysUseFieldBuilders ? getTokenConfigurationsFieldBuilder() : null;
                }
            }
            if (initResponse.getShowWithoutInternet()) {
                setShowWithoutInternet(initResponse.getShowWithoutInternet());
            }
            if (initResponse.hasExtras()) {
                mergeExtras(initResponse.getExtras());
            }
            if (initResponse.hasSdkAnalyticConfigV2()) {
                mergeSdkAnalyticConfigV2(initResponse.getSdkAnalyticConfigV2());
            }
            if (initResponse.hasAssetCacheConfiguration()) {
                mergeAssetCacheConfiguration(initResponse.getAssetCacheConfiguration());
            }
            mergeUnknownFields(((h0) initResponse).unknownFields);
            onChanged();
            return this;
        }

        public Builder addAdNetworks(AdNetwork.Builder builder) {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addEvent(Ad.Event.Builder builder) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                ensureEventIsMutable();
                this.event_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addTokenConfigurations(TokenConfiguration.Builder builder) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addAdNetworks(int i10, AdNetwork.Builder builder) {
            v1 v1Var = this.adNetworksBuilder_;
            if (v1Var == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        public Builder addEvent(int i10, Ad.Event.Builder builder) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                ensureEventIsMutable();
                this.event_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        public Builder addTokenConfigurations(int i10, TokenConfiguration.Builder builder) {
            v1 v1Var = this.tokenConfigurationsBuilder_;
            if (v1Var == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.InitResponse.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.InitResponse.access$2500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.InitResponse r3 = (io.bidmachine.protobuf.InitResponse) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.InitResponse r4 = (io.bidmachine.protobuf.InitResponse) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.InitResponse.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.InitResponse$Builder");
        }
    }

    public static Builder newBuilder(InitResponse initResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initResponse);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteBuffer, wVar);
    }

    private InitResponse(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (InitResponse) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static InitResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public InitResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static InitResponse parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private InitResponse() {
        this.memoizedIsInitialized = (byte) -1;
        this.endpoint_ = "";
        List list = Collections.EMPTY_LIST;
        this.event_ = list;
        this.adNetworks_ = list;
        this.adCacheControl_ = 0;
        this.tokenConfigurations_ = list;
    }

    public static InitResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static InitResponse parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(bArr, wVar);
    }

    public static InitResponse parseFrom(InputStream inputStream) throws IOException {
        return (InitResponse) h0.parseWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (InitResponse) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static InitResponse parseFrom(l lVar) throws IOException {
        return (InitResponse) h0.parseWithIOException(PARSER, lVar);
    }

    private InitResponse(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 10:
                            this.endpoint_ = lVar.J();
                            break;
                        case 18:
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.event_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.event_.add((Ad.Event) lVar.A(Ad.Event.parser(), wVar));
                            break;
                        case 24:
                            this.sessionResetAfter_ = lVar.L();
                            break;
                        case 34:
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.adNetworks_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.adNetworks_.add((AdNetwork) lVar.A(AdNetwork.parser(), wVar));
                            break;
                        case 40:
                            this.adCacheControl_ = lVar.t();
                            break;
                        case 48:
                            this.adCacheMaxAge_ = lVar.L();
                            break;
                        case 56:
                            this.adRequestTmax_ = lVar.L();
                            break;
                        case 66:
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 == 0) {
                                this.adCachePlacementControl_ = w0.p(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            u0 u0Var = (u0) lVar.A(AdCachePlacementControlDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                            this.adCachePlacementControl_.l().put(u0Var.i(), u0Var.k());
                            break;
                        case 72:
                            this.adNetworksLoadingTimeout_ = lVar.L();
                            break;
                        case 82:
                            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
                            SdkAnalyticConfig.Builder builder = sdkAnalyticConfig != null ? sdkAnalyticConfig.toBuilder() : null;
                            SdkAnalyticConfig sdkAnalyticConfig2 = (SdkAnalyticConfig) lVar.A(SdkAnalyticConfig.parser(), wVar);
                            this.sdkAnalyticConfig_ = sdkAnalyticConfig2;
                            if (builder != null) {
                                builder.mergeFrom(sdkAnalyticConfig2);
                                this.sdkAnalyticConfig_ = builder.buildPartial();
                            }
                            break;
                        case 90:
                            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
                            AdExtension.EventConfiguration.Builder builder2 = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                            AdExtension.EventConfiguration eventConfiguration2 = (AdExtension.EventConfiguration) lVar.A(AdExtension.EventConfiguration.parser(), wVar);
                            this.eventConfiguration_ = eventConfiguration2;
                            if (builder2 != null) {
                                builder2.mergeFrom(eventConfiguration2);
                                this.eventConfiguration_ = builder2.buildPartial();
                            }
                            break;
                        case 98:
                            int i14 = (i10 == true ? 1 : 0) & 8;
                            i10 = i10;
                            if (i14 == 0) {
                                this.tokenConfigurations_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 8;
                            }
                            this.tokenConfigurations_.add((TokenConfiguration) lVar.A(TokenConfiguration.parser(), wVar));
                            break;
                        case 104:
                            this.showWithoutInternet_ = lVar.q();
                            break;
                        case 114:
                            Extras extras = this.extras_;
                            Extras.Builder builder3 = extras != null ? extras.toBuilder() : null;
                            Extras extras2 = (Extras) lVar.A(Extras.parser(), wVar);
                            this.extras_ = extras2;
                            if (builder3 != null) {
                                builder3.mergeFrom(extras2);
                                this.extras_ = builder3.buildPartial();
                            }
                            break;
                        case 122:
                            Configuration configuration = this.sdkAnalyticConfigV2_;
                            Configuration.Builder builder4 = configuration != null ? configuration.toBuilder() : null;
                            Configuration configuration2 = (Configuration) lVar.A(Configuration.parser(), wVar);
                            this.sdkAnalyticConfigV2_ = configuration2;
                            if (builder4 != null) {
                                builder4.mergeFrom(configuration2);
                                this.sdkAnalyticConfigV2_ = builder4.buildPartial();
                            }
                            break;
                        case 130:
                            AssetCache.Configuration configuration3 = this.assetCacheConfiguration_;
                            AssetCache.Configuration.Builder builder5 = configuration3 != null ? configuration3.toBuilder() : null;
                            AssetCache.Configuration configuration4 = (AssetCache.Configuration) lVar.A(AssetCache.Configuration.parser(), wVar);
                            this.assetCacheConfiguration_ = configuration4;
                            if (builder5 != null) {
                                builder5.mergeFrom(configuration4);
                                this.assetCacheConfiguration_ = builder5.buildPartial();
                            }
                            break;
                        default:
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                z10 = true;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.event_ = DesugarCollections.unmodifiableList(this.event_);
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.adNetworks_ = DesugarCollections.unmodifiableList(this.adNetworks_);
                }
                if (((i10 == true ? 1 : 0) & 8) != 0) {
                    this.tokenConfigurations_ = DesugarCollections.unmodifiableList(this.tokenConfigurations_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.event_ = DesugarCollections.unmodifiableList(this.event_);
        }
        if (((i10 == true ? 1 : 0) & 2) != 0) {
            this.adNetworks_ = DesugarCollections.unmodifiableList(this.adNetworks_);
        }
        if (((i10 == true ? 1 : 0) & 8) != 0) {
            this.tokenConfigurations_ = DesugarCollections.unmodifiableList(this.tokenConfigurations_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static InitResponse parseFrom(l lVar, w wVar) throws IOException {
        return (InitResponse) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
