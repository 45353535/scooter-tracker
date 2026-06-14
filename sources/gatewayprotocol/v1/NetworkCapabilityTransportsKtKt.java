package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.NetworkCapabilityTransportsKt;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/NetworkCapabilityTransportsKt$Dsl;", "", "block", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "-initializenetworkCapabilityTransports", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "networkCapabilityTransports", MenuActionType.COPY, "(Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NetworkCapabilityTransportsKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializenetworkCapabilityTransports, reason: not valid java name */
    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports m7720initializenetworkCapabilityTransports(@NotNull Function1<? super NetworkCapabilityTransportsKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.INSTANCE;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builderNewBuilder = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        NetworkCapabilityTransportsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports copy(@NotNull NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports, @NotNull Function1<? super NetworkCapabilityTransportsKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(networkCapabilityTransports, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        NetworkCapabilityTransportsKt.Dsl.Companion companion = NetworkCapabilityTransportsKt.Dsl.INSTANCE;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder = networkCapabilityTransports.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        NetworkCapabilityTransportsKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
