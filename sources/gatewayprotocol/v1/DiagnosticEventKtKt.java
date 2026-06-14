package gatewayprotocol.v1;

import com.my.target.common.menu.MenuActionType;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "", "block", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "-initializediagnosticEvent", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "diagnosticEvent", MenuActionType.COPY, "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder;", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestampsOrNull", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestampsOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticEventKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializediagnosticEvent, reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent m7699initializediagnosticEvent(@NotNull Function1<? super DiagnosticEventKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.INSTANCE;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent copy(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent, @NotNull Function1<? super DiagnosticEventKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(diagnosticEvent, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.INSTANCE;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder = diagnosticEvent.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        DiagnosticEventKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder diagnosticEventOrBuilder) {
        Intrinsics.checkNotNullParameter(diagnosticEventOrBuilder, "<this>");
        if (diagnosticEventOrBuilder.hasTimestamps()) {
            return diagnosticEventOrBuilder.getTimestamps();
        }
        return null;
    }
}
