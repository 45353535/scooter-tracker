package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberLazyStaggeredGridState", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridStateKt {
    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState(final int i10, final int i11, @Nullable Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(161145796);
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(161145796, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:62)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyStaggeredGridState, Object> saver = LazyStaggeredGridState.INSTANCE.getSaver();
        Integer numValueOf = Integer.valueOf(i10);
        Integer numValueOf2 = Integer.valueOf(i11);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(numValueOf2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final LazyStaggeredGridState invoke() {
                    return new LazyStaggeredGridState(i10, i11);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) RememberSaveableKt.m1261rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridState;
    }
}
