package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.PrivacyUpdateRequestKt;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/PrivacyUpdateRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "-initializeprivacyUpdateRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "privacyUpdateRequest", MenuActionType.COPY, "(Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PrivacyUpdateRequestKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeprivacyUpdateRequest, reason: not valid java name */
    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest m7725initializeprivacyUpdateRequest(@NotNull Function1<? super PrivacyUpdateRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.INSTANCE;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builderNewBuilder = PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PrivacyUpdateRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest copy(@NotNull PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest, @NotNull Function1<? super PrivacyUpdateRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(privacyUpdateRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.INSTANCE;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder = privacyUpdateRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        PrivacyUpdateRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
