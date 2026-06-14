package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"DragMultiplier", "", "rememberPullRefreshState", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "refreshing", "", "onRefresh", "Lkotlin/Function0;", "", "refreshThreshold", "Landroidx/compose/ui/unit/Dp;", "refreshingOffset", "rememberPullRefreshState-UuyPYSY", "(ZLkotlin/jvm/functions/Function0;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PullRefreshStateKt {
    private static final float DragMultiplier = 0.5f;

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m1207rememberPullRefreshStateUuyPYSY(final boolean z10, @NotNull Function0<Unit> onRefresh, float f10, float f11, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        composer.startReplaceableGroup(-174977512);
        if ((i11 & 4) != 0) {
            f10 = PullRefreshDefaults.INSTANCE.m1200getRefreshThresholdD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f11 = PullRefreshDefaults.INSTANCE.m1201getRefreshingOffsetD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-174977512, i10, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:55)");
        }
        if (Dp.m3950compareTo0680j_4(f10, Dp.m3951constructorimpl(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onRefresh, composer, (i10 >> 3) & 14);
        final s0 s0Var = new s0();
        final s0 s0Var2 = new s0();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        s0Var.f93329b = density.mo308toPx0680j_4(f10);
        s0Var2.f93329b = density.mo308toPx0680j_4(f11);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(coroutineScope);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new PullRefreshState(coroutineScope, stateRememberUpdatedState, s0Var2.f93329b, s0Var.f93329b);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        final PullRefreshState pullRefreshState = (PullRefreshState) objRememberedValue2;
        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshStateKt$rememberPullRefreshState$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                pullRefreshState.setRefreshing$material_release(z10);
                pullRefreshState.setThreshold$material_release(s0Var.f93329b);
                pullRefreshState.setRefreshingOffset$material_release(s0Var2.f93329b);
            }
        }, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pullRefreshState;
    }
}
