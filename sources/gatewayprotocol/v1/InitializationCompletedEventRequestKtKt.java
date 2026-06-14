package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/InitializationCompletedEventRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "-initializeinitializationCompletedEventRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationCompletedEventRequest", MenuActionType.COPY, "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InitializationCompletedEventRequestKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeinitializationCompletedEventRequest, reason: not valid java name */
    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest m7711initializeinitializationCompletedEventRequest(@NotNull Function1<? super InitializationCompletedEventRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InitializationCompletedEventRequestKt.Dsl.Companion companion = InitializationCompletedEventRequestKt.Dsl.INSTANCE;
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builderNewBuilder = InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        InitializationCompletedEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest copy(@NotNull InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest, @NotNull Function1<? super InitializationCompletedEventRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(initializationCompletedEventRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        InitializationCompletedEventRequestKt.Dsl.Companion companion = InitializationCompletedEventRequestKt.Dsl.INSTANCE;
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder = initializationCompletedEventRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        InitializationCompletedEventRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder initializationCompletedEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(initializationCompletedEventRequestOrBuilder, "<this>");
        if (initializationCompletedEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return initializationCompletedEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder initializationCompletedEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(initializationCompletedEventRequestOrBuilder, "<this>");
        if (initializationCompletedEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return initializationCompletedEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
