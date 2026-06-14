package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\"\u001a\u0004\u0018\u00010\u001f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "-initializeadRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "adRequest", MenuActionType.COPY, "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignStateOrNull", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSizeOrNull", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AdRequestKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeadRequest, reason: not valid java name */
    public static final AdRequestOuterClass.AdRequest m7686initializeadRequest(@NotNull Function1<? super AdRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
        AdRequestOuterClass.AdRequest.Builder builderNewBuilder = AdRequestOuterClass.AdRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        AdRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final AdRequestOuterClass.AdRequest copy(@NotNull AdRequestOuterClass.AdRequest adRequest, @NotNull Function1<? super AdRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(adRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
        AdRequestOuterClass.AdRequest.Builder builder = adRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AdRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final AdRequestOuterClass.BannerSize getBannerSizeOrNull(@NotNull AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasBannerSize()) {
            return adRequestOrBuilder.getBannerSize();
        }
        return null;
    }

    @Nullable
    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(@NotNull AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasCampaignState()) {
            return adRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasMediationInfo()) {
            return adRequestOrBuilder.getMediationInfo();
        }
        return null;
    }

    @Nullable
    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasSessionCounters()) {
            return adRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
