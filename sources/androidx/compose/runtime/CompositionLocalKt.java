package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a<\u0010\u0000\u001a\u00020\u00012\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\n2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u000b\u001a0\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005\u001a \u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005¨\u0006\u0013"}, d2 = {"CompositionLocalProvider", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroidx/compose/runtime/CompositionLocalContext;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/CompositionLocalContext;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "compositionLocalOf", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "defaultFactory", "staticCompositionLocalOf", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CompositionLocalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@NotNull final ProvidedValue<?>[] values, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1390796515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        composerStartRestartGroup.startProviders(values);
        content.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 3) & 14));
        composerStartRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                ProvidedValue<?>[] providedValueArr = values;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @NotNull
    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(@NotNull SnapshotMutationPolicy<T> policy, @NotNull Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new DynamicProvidableCompositionLocal(policy, defaultFactory);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, function0);
    }

    @NotNull
    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(@NotNull Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new StaticProvidableCompositionLocal(defaultFactory);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@NotNull final CompositionLocalContext context, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1853897736);
        int i11 = (i10 & 14) == 0 ? (composerStartRestartGroup.changed(context) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853897736, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:246)");
            }
            PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocals$runtime_release = context.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<CompositionLocal<Object>, State<Object>> entry : compositionLocals$runtime_release.entrySet()) {
                CompositionLocal<Object> key = entry.getKey();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList.add(((ProvidableCompositionLocal) key).provides(entry.getValue().getValue()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), content, composerStartRestartGroup, (i11 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                CompositionLocalKt.CompositionLocalProvider(context, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }
}
