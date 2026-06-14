package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeaderBiddingTokenKt {

    @NotNull
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    @Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u0000 ½\u00012\u00020\u0001:\u0004½\u0001¾\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0001J\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001J\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001J\b\u0010\u008f\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0090\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0091\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0092\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0093\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0094\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0095\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0096\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0097\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0098\u0001\u001a\u00030\u008d\u0001J\b\u0010\u0099\u0001\u001a\u00030\u008d\u0001J\b\u0010\u009a\u0001\u001a\u00030\u008d\u0001J\b\u0010\u009b\u0001\u001a\u00030\u008d\u0001J\b\u0010\u009c\u0001\u001a\u00030\u008d\u0001J\b\u0010\u009d\u0001\u001a\u00030\u008d\u0001J\b\u0010\u009e\u0001\u001a\u00030\u008d\u0001J\b\u0010\u009f\u0001\u001a\u00030\u008d\u0001J\u0007\u0010 \u0001\u001a\u00020<J\u0007\u0010¡\u0001\u001a\u00020<J\u0007\u0010¢\u0001\u001a\u00020<J\u0007\u0010£\u0001\u001a\u00020<J\u0007\u0010¤\u0001\u001a\u00020<J\u0007\u0010¥\u0001\u001a\u00020<J\u0007\u0010¦\u0001\u001a\u00020<J\u0007\u0010§\u0001\u001a\u00020<J\u0007\u0010¨\u0001\u001a\u00020<J\u0007\u0010©\u0001\u001a\u00020<J\u0007\u0010ª\u0001\u001a\u00020<J\u0007\u0010«\u0001\u001a\u00020<J\u0007\u0010¬\u0001\u001a\u00020<J\u0007\u0010\u00ad\u0001\u001a\u00020<J\u0007\u0010®\u0001\u001a\u00020<J\u0007\u0010¯\u0001\u001a\u00020<J&\u0010°\u0001\u001a\u00030\u008d\u0001*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0007¢\u0006\u0003\b±\u0001J7\u0010²\u0001\u001a\u00030\u008d\u0001*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0007\u0010³\u0001\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020&H\u0007¢\u0006\u0003\b´\u0001J<\u0010µ\u0001\u001a\u00030\u008d\u0001*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0014\u0010¶\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0·\u0001H\u0007¢\u0006\u0003\b¸\u0001J/\u0010¹\u0001\u001a\u00030\u008d\u0001*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0007\u0010³\u0001\u001a\u00020&H\u0007¢\u0006\u0003\bº\u0001J8\u0010»\u0001\u001a\u00030\u008d\u0001*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0007\u0010³\u0001\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020&H\u0087\n¢\u0006\u0003\b¼\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R#\u0010$\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8G¢\u0006\u0006\u001a\u0004\b(\u0010)R$\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010C\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010H\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010?\"\u0004\bJ\u0010AR$\u0010L\u001a\u00020K2\u0006\u0010\u0005\u001a\u00020K8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010R\u001a\u00020Q2\u0006\u0010\u0005\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010X\u001a\u00020W2\u0006\u0010\u0005\u001a\u00020W8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u00020Q2\u0006\u0010\u0005\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010T\"\u0004\b_\u0010VR$\u0010a\u001a\u00020`2\u0006\u0010\u0005\u001a\u00020`8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010g\u001a\u00020f2\u0006\u0010\u0005\u001a\u00020f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010m\u001a\u00020l2\u0006\u0010\u0005\u001a\u00020l8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010r\u001a\u00020Q2\u0006\u0010\u0005\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010T\"\u0004\bt\u0010VR$\u0010u\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010\u000f\"\u0004\bw\u0010\u0011R\u0017\u0010x\u001a\u0004\u0018\u00010**\u00020\u00008F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0017\u0010{\u001a\u0004\u0018\u000100*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u000106*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010B*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u00010`*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010l*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006¿\u0001"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;)V", "value", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "", "adFormatValue", "getAdFormatValue", "()I", "setAdFormatValue", "(I)V", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignState", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clientInfo", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "initializationData", "getInitializationData", "()Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "setInitializationData", "(Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionToken", "getLimitedSessionToken", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfo", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "", "offerwallEnabled", "getOfferwallEnabled", "()Z", "setOfferwallEnabled", "(Z)V", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "pii", "getPii", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "setPii", "(Lgatewayprotocol/v1/PiiOuterClass$Pii;)V", "scarSignalsCollected", "getScarSignalsCollected", "setScarSignalsCollected", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "Lcom/google/protobuf/ByteString;", "sessionToken", "getSessionToken", "()Lcom/google/protobuf/ByteString;", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "tcf", "getTcf", "setTcf", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testData", "getTestData", "()Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "tokenCounters", "getTokenCounters", "()Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "setTokenCounters", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;)V", "tokenId", "getTokenId", "setTokenId", "tokenNumber", "getTokenNumber", "setTokenNumber", "initializationDataOrNull", "getInitializationDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "limitedSessionTokenOrNull", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "mediationInfoOrNull", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "piiOrNull", "getPiiOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "testDataOrNull", "getTestDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "tokenCountersOrNull", "getTokenCountersOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "_build", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "clearAdFormat", "", "clearCampaignState", "clearClientInfo", "clearDynamicDeviceInfo", "clearInitializationData", "clearLimitedSessionToken", "clearMediationInfo", "clearOfferwallEnabled", "clearPii", "clearScarSignalsCollected", "clearSessionCounters", "clearSessionToken", "clearStaticDeviceInfo", "clearTcf", "clearTestData", "clearTimestamps", "clearTokenCounters", "clearTokenId", "clearTokenNumber", "hasAdFormat", "hasCampaignState", "hasClientInfo", "hasDynamicDeviceInfo", "hasInitializationData", "hasLimitedSessionToken", "hasMediationInfo", "hasOfferwallEnabled", "hasPii", "hasScarSignalsCollected", "hasSessionCounters", "hasStaticDeviceInfo", "hasTcf", "hasTestData", "hasTimestamps", "hasTokenCounters", "clear", "clearExtras", "put", C4240b4.i.W, "putExtras", "putAll", "map", "", "putAllExtras", "remove", "removeExtras", "set", "setExtras", y.f66058y, "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "builder", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingTokenBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(headerBiddingTokenBuild, "_builder.build()");
            return headerBiddingTokenBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearOfferwallEnabled() {
            this._builder.clearOfferwallEnabled();
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
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
        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            Intrinsics.checkNotNullExpressionValue(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        @NotNull
        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            Intrinsics.checkNotNullExpressionValue(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
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
        public final InitializationDataOuterClass.InitializationData getInitializationData() {
            InitializationDataOuterClass.InitializationData initializationData = this._builder.getInitializationData();
            Intrinsics.checkNotNullExpressionValue(initializationData, "_builder.getInitializationData()");
            return initializationData;
        }

        @Nullable
        public final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(dsl._builder);
        }

        @NotNull
        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
            Intrinsics.checkNotNullExpressionValue(limitedSessionToken, "_builder.getLimitedSessionToken()");
            return limitedSessionToken;
        }

        @Nullable
        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(dsl._builder);
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
            return HeaderBiddingTokenKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final boolean getOfferwallEnabled() {
            return this._builder.getOfferwallEnabled();
        }

        @NotNull
        public final PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this._builder.getPii();
            Intrinsics.checkNotNullExpressionValue(pii, "_builder.getPii()");
            return pii;
        }

        @Nullable
        public final PiiOuterClass.Pii getPiiOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            Intrinsics.checkNotNullExpressionValue(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @NotNull
        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            Intrinsics.checkNotNullExpressionValue(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
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

        @NotNull
        public final TestDataOuterClass.TestData getTestData() {
            TestDataOuterClass.TestData testData = this._builder.getTestData();
            Intrinsics.checkNotNullExpressionValue(testData, "_builder.getTestData()");
            return testData;
        }

        @Nullable
        public final TestDataOuterClass.TestData getTestDataOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTestDataOrNull(dsl._builder);
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            Intrinsics.checkNotNullExpressionValue(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        @NotNull
        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = this._builder.getTokenCounters();
            Intrinsics.checkNotNullExpressionValue(tokenCounters, "_builder.getTokenCounters()");
            return tokenCounters;
        }

        @Nullable
        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(@NotNull Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            Intrinsics.checkNotNullExpressionValue(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasOfferwallEnabled() {
            return this._builder.hasOfferwallEnabled();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
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

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
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

        public final void setCampaignState(@NotNull CampaignStateOuterClass.CampaignState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void setClientInfo(@NotNull ClientInfoOuterClass.ClientInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setClientInfo(value);
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

        public final void setInitializationData(@NotNull InitializationDataOuterClass.InitializationData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInitializationData(value);
        }

        public final void setLimitedSessionToken(@NotNull UniversalRequestOuterClass.LimitedSessionToken value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLimitedSessionToken(value);
        }

        public final void setMediationInfo(@NotNull MediationInfoOuterClass.MediationInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void setOfferwallEnabled(boolean z10) {
            this._builder.setOfferwallEnabled(z10);
        }

        public final void setPii(@NotNull PiiOuterClass.Pii value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPii(value);
        }

        public final void setScarSignalsCollected(boolean z10) {
            this._builder.setScarSignalsCollected(z10);
        }

        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setSessionToken(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionToken(value);
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setTcf(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTcf(value);
        }

        public final void setTestData(@NotNull TestDataOuterClass.TestData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTestData(value);
        }

        public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamps(value);
        }

        public final void setTokenCounters(@NotNull HeaderBiddingTokenOuterClass.TokenCounters value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTokenCounters(value);
        }

        public final void setTokenId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTokenId(value);
        }

        public final void setTokenNumber(int i10) {
            this._builder.setTokenNumber(i10);
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }
    }

    private HeaderBiddingTokenKt() {
    }
}
