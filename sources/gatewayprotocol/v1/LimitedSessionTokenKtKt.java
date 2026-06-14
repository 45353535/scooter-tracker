package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl;", "", "block", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "-initializelimitedSessionToken", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionToken", MenuActionType.COPY, "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LimitedSessionTokenKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializelimitedSessionToken, reason: not valid java name */
    public static final UniversalRequestOuterClass.LimitedSessionToken m7716initializelimitedSessionToken(@NotNull Function1<? super LimitedSessionTokenKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        LimitedSessionTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final UniversalRequestOuterClass.LimitedSessionToken copy(@NotNull UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken, @NotNull Function1<? super LimitedSessionTokenKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(limitedSessionToken, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builder = limitedSessionToken.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        LimitedSessionTokenKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
