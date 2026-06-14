package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a+\u0010\b\u001a\u00020\r*\u00020\r2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\n*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "", "block", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "-initializestaticDeviceInfo", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", MenuActionType.COPY, "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;", "getAndroidOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "androidOrNull", "getIosOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "iosOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StaticDeviceInfoKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializestaticDeviceInfo, reason: not valid java name */
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo m7733initializestaticDeviceInfo(@NotNull Function1<? super StaticDeviceInfoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo copy(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo, @NotNull Function1<? super StaticDeviceInfoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(staticDeviceInfo, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroidOrNull(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        Intrinsics.checkNotNullParameter(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasAndroid()) {
            return staticDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIosOrNull(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        Intrinsics.checkNotNullParameter(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasIos()) {
            return staticDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    @NotNull
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android copy(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2, @NotNull Function1<? super StaticDeviceInfoKt.AndroidKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(android2, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder = android2.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios copy(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios, @NotNull Function1<? super StaticDeviceInfoKt.IosKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(ios, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        StaticDeviceInfoKt.IosKt.Dsl.Companion companion = StaticDeviceInfoKt.IosKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder = ios.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        StaticDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
