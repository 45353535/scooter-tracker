package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "-initializetransactionEventRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEventRequest", MenuActionType.COPY, "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransactionEventRequestKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializetransactionEventRequest, reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionEventRequest m7738initializetransactionEventRequest(@NotNull Function1<? super TransactionEventRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.INSTANCE;
        TransactionEventRequestOuterClass.TransactionEventRequest.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        TransactionEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final TransactionEventRequestOuterClass.TransactionEventRequest copy(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, @NotNull Function1<? super TransactionEventRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(transactionEventRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.INSTANCE;
        TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder = transactionEventRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        TransactionEventRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(transactionEventRequestOrBuilder, "<this>");
        if (transactionEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return transactionEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(transactionEventRequestOrBuilder, "<this>");
        if (transactionEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return transactionEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
