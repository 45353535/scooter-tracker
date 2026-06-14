package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\"\u001a\u0004\u0018\u00010\u001f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0017\u0010&\u001a\u0004\u0018\u00010#*\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010*\u001a\u0004\u0018\u00010'*\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0017\u0010.\u001a\u0004\u0018\u00010+*\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0017\u00102\u001a\u0004\u0018\u00010/*\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0017\u00106\u001a\u0004\u0018\u000103*\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0017\u0010:\u001a\u0004\u0018\u000107*\u00020\n8F¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "", "block", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "-initializeheaderBiddingToken", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "headerBiddingToken", MenuActionType.COPY, "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "getClientInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clientInfoOrNull", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestampsOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestampsOrNull", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignStateOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionTokenOrNull", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "getInitializationDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "initializationDataOrNull", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testDataOrNull", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "getTokenCountersOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "tokenCountersOrNull", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HeaderBiddingTokenKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeheaderBiddingToken, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken m7710initializeheaderBiddingToken(@NotNull Function1<? super HeaderBiddingTokenKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.INSTANCE;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken copy(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken, @NotNull Function1<? super HeaderBiddingTokenKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(headerBiddingToken, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.INSTANCE;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder = headerBiddingToken.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasCampaignState()) {
            return headerBiddingTokenOrBuilder.getCampaignState();
        }
        return null;
    }

    @Nullable
    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasClientInfo()) {
            return headerBiddingTokenOrBuilder.getClientInfo();
        }
        return null;
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasDynamicDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasInitializationData()) {
            return headerBiddingTokenOrBuilder.getInitializationData();
        }
        return null;
    }

    @Nullable
    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasLimitedSessionToken()) {
            return headerBiddingTokenOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    @Nullable
    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasMediationInfo()) {
            return headerBiddingTokenOrBuilder.getMediationInfo();
        }
        return null;
    }

    @Nullable
    public static final PiiOuterClass.Pii getPiiOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasPii()) {
            return headerBiddingTokenOrBuilder.getPii();
        }
        return null;
    }

    @Nullable
    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasSessionCounters()) {
            return headerBiddingTokenOrBuilder.getSessionCounters();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasStaticDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final TestDataOuterClass.TestData getTestDataOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTestData()) {
            return headerBiddingTokenOrBuilder.getTestData();
        }
        return null;
    }

    @Nullable
    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTimestamps()) {
            return headerBiddingTokenOrBuilder.getTimestamps();
        }
        return null;
    }

    @Nullable
    public static final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(@NotNull HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        Intrinsics.checkNotNullParameter(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTokenCounters()) {
            return headerBiddingTokenOrBuilder.getTokenCounters();
        }
        return null;
    }
}
