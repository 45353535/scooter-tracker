package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"lazyListBeyondBoundsModifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyListBeyondBoundsModifierKt {
    @Composable
    @NotNull
    public static final Modifier lazyListBeyondBoundsModifier(@NotNull Modifier modifier, @NotNull LazyListState state, @NotNull LazyListBeyondBoundsInfo beyondBoundsInfo, boolean z10, @NotNull Orientation orientation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        composer.startReplaceableGroup(-62057177);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-62057177, i10, -1, "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)");
        }
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(state);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyListBeyondBoundsState(state);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        LazyListBeyondBoundsState lazyListBeyondBoundsState = (LazyListBeyondBoundsState) objRememberedValue;
        Object[] objArr = {lazyListBeyondBoundsState, beyondBoundsInfo, Boolean.valueOf(z10), layoutDirection, orientation};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged2 = false;
        for (int i11 = 0; i11 < 5; i11++) {
            zChanged2 |= composer.changed(objArr[i11]);
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object lazyLayoutBeyondBoundsModifierLocal = new LazyLayoutBeyondBoundsModifierLocal(lazyListBeyondBoundsState, beyondBoundsInfo, z10, layoutDirection, orientation);
            composer.updateRememberedValue(lazyLayoutBeyondBoundsModifierLocal);
            objRememberedValue2 = lazyLayoutBeyondBoundsModifierLocal;
        }
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then((Modifier) objRememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }
}
