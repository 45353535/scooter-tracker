package io.bidmachine.ads.networks.adaptiverendering;

import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f\"\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\f\"\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f\"\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\f\"\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lid/a0;", "Lae/a;", "baseBMError", "toBMError", "(Lid/a0;Lae/a;)Lae/a;", "Lid/t;", "", "", "", "toEventParams", "(Lid/t;)Ljava/util/Map;", "KEY_ADAPTIVE_RENDERING_CONTEXT", "Ljava/lang/String;", "KEY_NAME", "KEY_WEIGHT", "KEY_THRESHOLD", "KEY_ALGORITHMS", "KEY_ALGORITHM", "KEY_RESULT", "KEY_DURATION", "KEY_PHASE", "KEY_COMPONENT", "bidmachine-android-sdk_bh_3_5_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingAdapterKt {

    @NotNull
    private static final String KEY_ADAPTIVE_RENDERING_CONTEXT = "adaptive_rendering_context";

    @NotNull
    private static final String KEY_ALGORITHM = "algorithm";

    @NotNull
    private static final String KEY_ALGORITHMS = "algorithms";

    @NotNull
    private static final String KEY_COMPONENT = "component";

    @NotNull
    private static final String KEY_DURATION = "duration";

    @NotNull
    private static final String KEY_NAME = "name";

    @NotNull
    private static final String KEY_PHASE = "phase";

    @NotNull
    private static final String KEY_RESULT = "result";

    @NotNull
    private static final String KEY_THRESHOLD = "threshold";

    @NotNull
    private static final String KEY_WEIGHT = "weight";

    @NotNull
    public static final ae.a toBMError(@NotNull id.a0 a0Var, @NotNull ae.a baseBMError) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(baseBMError, "baseBMError");
        return new ae.a(baseBMError, -1, a0Var.b());
    }

    @Nullable
    public static final Map<String, Object> toEventParams(@NotNull id.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        try {
            ListValue listValueC = ae.g.c(tVar.c(), new Function1<id.q, Value>() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingAdapterKt$toEventParams$algorithmsListValue$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Value invoke(@NotNull id.q brokenCreativeAlgorithmResult) {
                    Intrinsics.checkNotNullParameter(brokenCreativeAlgorithmResult, "brokenCreativeAlgorithmResult");
                    id.p pVarA = brokenCreativeAlgorithmResult.a();
                    Struct.Builder builderNewBuilder = Struct.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                    Struct structBuild = ae.g.f(ae.g.f(ae.g.g(builderNewBuilder, "name", pVarA.b().getKey()), "weight", Float.valueOf(pVarA.c())), "threshold", Float.valueOf(pVarA.a())).build();
                    Intrinsics.checkNotNullExpressionValue(structBuild, "brokenCreativeAlgorithmR…build()\n                }");
                    Struct.Builder builderNewBuilder2 = Struct.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
                    return ae.g.i(ae.g.f(ae.g.f(ae.g.e(builderNewBuilder2, "algorithm", structBuild), "result", Integer.valueOf(io.bidmachine.core.i.b(brokenCreativeAlgorithmResult.c()))), "duration", Long.valueOf(brokenCreativeAlgorithmResult.b())));
                }
            });
            Struct.Builder builderNewBuilder = Struct.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            Value valueI = ae.g.i(ae.g.d(ae.g.f(ae.g.g(ae.g.f(ae.g.f(builderNewBuilder, "result", Double.valueOf(tVar.e())), "phase", Integer.valueOf(tVar.b())), KEY_COMPONENT, tVar.a()), "duration", Long.valueOf(tVar.d())), KEY_ALGORITHMS, listValueC));
            HashMap map = new HashMap();
            map.put(KEY_ADAPTIVE_RENDERING_CONTEXT, valueI);
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }
}
