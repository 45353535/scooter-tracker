package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/CampaignKt$Dsl;", "", "block", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "-initializecampaign", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "campaign", MenuActionType.COPY, "(Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignOrBuilder;", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getLoadTimestampOrNull", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "loadTimestampOrNull", "getShowTimestampOrNull", "showTimestampOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CampaignKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializecampaign, reason: not valid java name */
    public static final CampaignStateOuterClass.Campaign m7693initializecampaign(@NotNull Function1<? super CampaignKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
        CampaignStateOuterClass.Campaign.Builder builderNewBuilder = CampaignStateOuterClass.Campaign.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        CampaignKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final CampaignStateOuterClass.Campaign copy(@NotNull CampaignStateOuterClass.Campaign campaign, @NotNull Function1<? super CampaignKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(campaign, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
        CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        CampaignKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final TimestampsOuterClass.Timestamps getLoadTimestampOrNull(@NotNull CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        Intrinsics.checkNotNullParameter(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasLoadTimestamp()) {
            return campaignOrBuilder.getLoadTimestamp();
        }
        return null;
    }

    @Nullable
    public static final TimestampsOuterClass.Timestamps getShowTimestampOrNull(@NotNull CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        Intrinsics.checkNotNullParameter(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasShowTimestamp()) {
            return campaignOrBuilder.getShowTimestamp();
        }
        return null;
    }
}
