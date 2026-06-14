package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a+\u0010\b\u001a\u00020\r*\u00020\r2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0018\u001a\u0004\u0018\u00010\n*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u001b\u001a\u0004\u0018\u00010\r*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "", "block", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "-initializedynamicDeviceInfo", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", MenuActionType.COPY, "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder;", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getNetworkCapabilityTransportsOrNull", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder;)Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "networkCapabilityTransportsOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder;", "getAndroidOrNull", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "androidOrNull", "getIosOrNull", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "iosOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DynamicDeviceInfoKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializedynamicDeviceInfo, reason: not valid java name */
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo m7705initializedynamicDeviceInfo(@NotNull Function1<? super DynamicDeviceInfoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo copy(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo, @NotNull Function1<? super DynamicDeviceInfoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(dynamicDeviceInfo, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder = dynamicDeviceInfo.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroidOrNull(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        Intrinsics.checkNotNullParameter(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasAndroid()) {
            return dynamicDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIosOrNull(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        Intrinsics.checkNotNullParameter(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasIos()) {
            return dynamicDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    @Nullable
    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransportsOrNull(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder androidOrBuilder) {
        Intrinsics.checkNotNullParameter(androidOrBuilder, "<this>");
        if (androidOrBuilder.hasNetworkCapabilityTransports()) {
            return androidOrBuilder.getNetworkCapabilityTransports();
        }
        return null;
    }

    @NotNull
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android copy(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2, @NotNull Function1<? super DynamicDeviceInfoKt.AndroidKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(android2, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder = android2.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios copy(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios, @NotNull Function1<? super DynamicDeviceInfoKt.IosKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(ios, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        DynamicDeviceInfoKt.IosKt.Dsl.Companion companion = DynamicDeviceInfoKt.IosKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder = ios.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
