package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a=\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"calculateNearestItemsRange", "Lkotlin/ranges/IntRange;", "firstVisibleItem", "", "slidingWindowSize", "extraItemCount", "rememberLazyNearestItemsRangeState", "Landroidx/compose/runtime/State;", "firstVisibleItemIndex", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyNearestItemsRangeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange calculateNearestItemsRange(int i10, int i11, int i12) {
        int i13 = (i10 / i11) * i11;
        return g.v(Math.max(i13 - i12, 0), i13 + i11 + i12);
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final State<IntRange> rememberLazyNearestItemsRangeState(@NotNull Function0<Integer> firstVisibleItemIndex, @NotNull Function0<Integer> slidingWindowSize, @NotNull Function0<Integer> extraItemCount, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(firstVisibleItemIndex, "firstVisibleItemIndex");
        Intrinsics.checkNotNullParameter(slidingWindowSize, "slidingWindowSize");
        Intrinsics.checkNotNullParameter(extraItemCount, "extraItemCount");
        composer.startReplaceableGroup(429733345);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(429733345, i10, -1, "androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState (LazyNearestItemsRange.kt:41)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(firstVisibleItemIndex) | composer.changed(slidingWindowSize) | composer.changed(extraItemCount);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calculateNearestItemsRange(firstVisibleItemIndex.invoke().intValue(), slidingWindowSize.invoke().intValue(), extraItemCount.invoke().intValue()), null, 2, null);
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    composer.updateRememberedValue(objMutableStateOf$default);
                    objRememberedValue = objMutableStateOf$default;
                } catch (Throwable th2) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th3;
            }
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Object[] objArr = {firstVisibleItemIndex, slidingWindowSize, extraItemCount, mutableState};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged2 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zChanged2 |= composer.changed(objArr[i11]);
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1 = new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(firstVisibleItemIndex, slidingWindowSize, extraItemCount, mutableState, null);
            composer.updateRememberedValue(lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1);
            objRememberedValue2 = lazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1;
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(mutableState, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue2, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
