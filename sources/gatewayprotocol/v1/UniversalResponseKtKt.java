package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0012*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010!\u001a\u0004\u0018\u00010\u001e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0017\u0010%\u001a\u0004\u0018\u00010\"*\u00020\r8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0017\u0010)\u001a\u0004\u0018\u00010\n*\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0017\u0010-\u001a\u0004\u0018\u00010**\u00020&8F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0017\u00101\u001a\u0004\u0018\u00010.*\u00020&8F¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "", "block", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "-initializeuniversalResponse", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "universalResponse", MenuActionType.COPY, "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "getInitializationResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "initializationResponseOrNull", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "getAdResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adResponseOrNull", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "getAdPlayerConfigResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adPlayerConfigResponseOrNull", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "getAdDataRefreshResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adDataRefreshResponseOrNull", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "getPrivacyUpdateResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateResponseOrNull", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "getAudienceManagementResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "audienceManagementResponseOrNull", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "payloadOrNull", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "getMutableDataOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "mutableDataOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UniversalResponseKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeuniversalResponse, reason: not valid java name */
    public static final UniversalResponseOuterClass.UniversalResponse m7743initializeuniversalResponse(@NotNull Function1<? super UniversalResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final UniversalResponseOuterClass.UniversalResponse copy(@NotNull UniversalResponseOuterClass.UniversalResponse universalResponse, @NotNull Function1<? super UniversalResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(universalResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Builder builder = universalResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UniversalResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshResponse()) {
            return payloadOrBuilder.getAdDataRefreshResponse();
        }
        return null;
    }

    @Nullable
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigResponse()) {
            return payloadOrBuilder.getAdPlayerConfigResponse();
        }
        return null;
    }

    @Nullable
    public static final AdResponseOuterClass.AdResponse getAdResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdResponse()) {
            return payloadOrBuilder.getAdResponse();
        }
        return null;
    }

    @Nullable
    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAudienceManagementResponse()) {
            return payloadOrBuilder.getAudienceManagementResponse();
        }
        return null;
    }

    @Nullable
    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasError()) {
            return universalResponseOrBuilder.getError();
        }
        return null;
    }

    @Nullable
    public static final InitializationResponseOuterClass.InitializationResponse getInitializationResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationResponse()) {
            return payloadOrBuilder.getInitializationResponse();
        }
        return null;
    }

    @Nullable
    public static final MutableDataOuterClass.MutableData getMutableDataOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasMutableData()) {
            return universalResponseOrBuilder.getMutableData();
        }
        return null;
    }

    @Nullable
    public static final UniversalResponseOuterClass.UniversalResponse.Payload getPayloadOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder universalResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(universalResponseOrBuilder, "<this>");
        if (universalResponseOrBuilder.hasPayload()) {
            return universalResponseOrBuilder.getPayload();
        }
        return null;
    }

    @Nullable
    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder payloadOrBuilder) {
        Intrinsics.checkNotNullParameter(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateResponse()) {
            return payloadOrBuilder.getPrivacyUpdateResponse();
        }
        return null;
    }

    @NotNull
    public static final UniversalResponseOuterClass.UniversalResponse.Payload copy(@NotNull UniversalResponseOuterClass.UniversalResponse.Payload payload, @NotNull Function1<? super UniversalResponseKt.PayloadKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalResponseKt.PayloadKt.Dsl.Companion companion = UniversalResponseKt.PayloadKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder = payload.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UniversalResponseKt.PayloadKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
