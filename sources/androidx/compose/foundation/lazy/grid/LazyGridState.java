package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ¤\u00012\u00020\u0001:\u0002¤\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0006J?\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\"\u0010 J%\u0010$\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R+\u0010D\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00104\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010K\u001a\u00020E2\u0006\u0010:\u001a\u00020E8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bF\u00104\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010R\u001a\u00020L2\u0006\u0010:\u001a\u00020L8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bM\u00104\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010U\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010AR\"\u0010X\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010O\"\u0004\b[\u0010QR\u0016\u0010\\\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010VR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR/\u0010h\u001a\u0004\u0018\u00010b2\b\u0010:\u001a\u0004\u0018\u00010b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bc\u00104\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010j\u001a\u00020i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010o\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rRj\u0010}\u001a \u0012\u0004\u0012\u00020t\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020w0v0u0s2$\u0010:\u001a \u0012\u0004\u0012\u00020t\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020w0v0u0s8@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bx\u00104\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R4\u0010\u0084\u0001\u001a\u0004\u0018\u00010~2\b\u0010:\u001a\u0004\u0018\u00010~8@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0004\b\u007f\u00104\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R/\u0010\u0090\u0001\u001a\u00020L2\u0006\u0010:\u001a\u00020L8V@RX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u008d\u0001\u00104\u001a\u0005\b\u008e\u0001\u0010O\"\u0005\b\u008f\u0001\u0010QR/\u0010\u0094\u0001\u001a\u00020L2\u0006\u0010:\u001a\u00020L8V@RX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u0091\u0001\u00104\u001a\u0005\b\u0092\u0001\u0010O\"\u0005\b\u0093\u0001\u0010QR \u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010AR\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010AR\u0014\u0010\u009e\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0015\u0010¢\u0001\u001a\u00030\u009f\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010£\u0001\u001a\u00020L8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010O\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¥\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "<init>", "(II)V", "", "delta", "", "notifyPrefetch", "(F)V", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "info", "cancelPrefetchIfVisibleItemsChanged", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V", FirebaseAnalytics.Param.INDEX, "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "(F)F", "distance", "onScroll$foundation_release", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;)V", "updateScrollPositionIfTheFirstItemWasMoved", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<set-?>", "scrollToBeConsumed", "F", "getScrollToBeConsumed$foundation_release", "()F", "slotsPerLine$delegate", "getSlotsPerLine$foundation_release", "()I", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine", "Landroidx/compose/ui/unit/Density;", "density$delegate", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "", "isVertical$delegate", "isVertical$foundation_release", "()Z", "setVertical$foundation_release", "(Z)V", "isVertical", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "numMeasurePasses", "I", "getNumMeasurePasses$foundation_release", "prefetchingEnabled", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "lineToPrefetch", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentLinePrefetchHandles", "Landroidx/compose/runtime/collection/MutableVector;", "wasScrollingForward", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement$delegate", "getRemeasurement", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever$delegate", "getPrefetchInfoRetriever$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setPrefetchInfoRetriever$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator$delegate", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "setPlacementAnimator$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;)V", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "isScrollInProgress", y.f66058y, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final List<Integer> invoke(@NotNull SaverScope listSaver, @NotNull LazyGridState it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.getFirstVisibleItemIndex()), Integer.valueOf(it.getFirstVisibleItemScrollOffset())});
        }
    }, new Function1<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ LazyGridState invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyGridState invoke2(@NotNull List<Integer> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyGridState(it.get(0).intValue(), it.get(1).intValue());
        }
    });

    @NotNull
    private final LazyGridAnimateScrollScope animateScrollScope;

    @NotNull
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState canScrollForward;

    @NotNull
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;

    /* JADX INFO: renamed from: density$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState density;

    @NotNull
    private final MutableInteractionSource internalInteractionSource;

    /* JADX INFO: renamed from: isVertical$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isVertical;

    @NotNull
    private final MutableState<LazyGridLayoutInfo> layoutInfoState;
    private int lineToPrefetch;
    private int numMeasurePasses;

    @NotNull
    private final LazyLayoutPinnedItemList pinnedItems;

    /* JADX INFO: renamed from: placementAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState placementAnimator;

    /* JADX INFO: renamed from: prefetchInfoRetriever$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState prefetchInfoRetriever;

    @NotNull
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: remeasurement$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState remeasurement;

    @NotNull
    private final RemeasurementModifier remeasurementModifier;

    @NotNull
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;

    @NotNull
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: slotsPerLine$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState slotsPerLine;
    private boolean wasScrollingForward;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {273, 274}, m = "scroll")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyGridState.this.scroll(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<ScrollScope, Continuation, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10, int i11, Continuation continuation) {
            super(2, continuation);
            this.$index = i10;
            this.$scrollOffset = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return LazyGridState.this.new AnonymousClass2(this.$index, this.$scrollOffset, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            LazyGridState.this.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return Unit.f93236a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridState() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyGridState.animateScrollToItem(i10, i11, continuation);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyGridLayoutInfo info) {
        int row;
        if (this.lineToPrefetch == -1 || info.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last((List) info.getVisibleItemsInfo());
            row = (isVertical$foundation_release() ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first((List) info.getVisibleItemsInfo());
            row = (isVertical$foundation_release() ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
            int size = mutableVector.getSize();
            if (size > 0) {
                LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    content[i10].cancel();
                    i10++;
                } while (i10 < size);
            }
            this.currentLinePrefetchHandles.clear();
        }
    }

    private final Remeasurement getRemeasurement() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    private final void notifyPrefetch(float delta) {
        int row;
        int index;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector;
        int size;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.prefetchState;
        if (this.prefetchingEnabled) {
            LazyGridLayoutInfo layoutInfo = getLayoutInfo();
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return;
            }
            boolean z10 = delta < 0.0f;
            if (z10) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo());
                row = (isVertical$foundation_release() ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
                index = ((LazyGridItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo());
                row = (isVertical$foundation_release() ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
                index = ((LazyGridItemInfo) CollectionsKt.first((List) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (row == this.lineToPrefetch || index < 0 || index >= layoutInfo.getTotalItemsCount()) {
                return;
            }
            if (this.wasScrollingForward != z10 && (size = (mutableVector = this.currentLinePrefetchHandles).getSize()) > 0) {
                LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                int i10 = 0;
                do {
                    content[i10].cancel();
                    i10++;
                } while (i10 < size);
            }
            this.wasScrollingForward = z10;
            this.lineToPrefetch = row;
            this.currentLinePrefetchHandles.clear();
            List<Pair<Integer, Constraints>> listInvoke = getPrefetchInfoRetriever$foundation_release().invoke(LineIndex.m598boximpl(LineIndex.m600constructorimpl(row)));
            int size2 = listInvoke.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Pair<Integer, Constraints> pair = listInvoke.get(i11);
                this.currentLinePrefetchHandles.add(lazyLayoutPrefetchState.m620schedulePrefetch0kLqBqw(pair.getFirst().intValue(), pair.getSecond().getValue()));
            }
        }
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyGridState.scrollToItem(i10, i11, continuation);
    }

    private void setCanScrollBackward(boolean z10) {
        this.canScrollBackward.setValue(Boolean.valueOf(z10));
    }

    private void setCanScrollForward(boolean z10) {
        this.canScrollForward.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    @Nullable
    public final Object animateScrollToItem(int i10, int i11, @NotNull Continuation continuation) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i10, i11, continuation);
        return objAnimateScrollToItem == b.g() ? objAnimateScrollToItem : Unit.f93236a;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        LazyGridMeasuredLine firstVisibleLine = result.getFirstVisibleLine();
        setCanScrollBackward(((firstVisibleLine != null ? firstVisibleLine.getIndex() : 0) == 0 && result.getFirstVisibleLineScrollOffset() == 0) ? false : true);
        this.numMeasurePasses++;
        cancelPrefetchIfVisibleItemsChanged(result);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @NotNull
    /* JADX INFO: renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return (Density) this.density.getValue();
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.m589getIndexVZbfaAc();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    /* JADX INFO: renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: getNumMeasurePasses$foundation_release, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    @NotNull
    /* JADX INFO: renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return (LazyGridItemPlacementAnimator) this.placementAnimator.getValue();
    }

    @NotNull
    public final Function1<LineIndex, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (Function1) this.prefetchInfoRetriever.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getSlotsPerLine$foundation_release() {
        return ((Number) this.slotsPerLine.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVertical$foundation_release() {
        return ((Boolean) this.isVertical.getValue()).booleanValue();
    }

    public final float onScroll$foundation_release(float distance) {
        if ((distance < 0.0f && !getCanScrollForward()) || (distance > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f10 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f10;
        if (Math.abs(f10) > 0.5f) {
            float f11 = this.scrollToBeConsumed;
            Remeasurement remeasurement = getRemeasurement();
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
            if (this.prefetchingEnabled) {
                notifyPrefetch(f11 - this.scrollToBeConsumed);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f12 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.scroll(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object scroll(@org.jetbrains.annotations.NotNull androidx.compose.foundation.MutatePriority r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            kotlin.d.b(r8)
            goto L5a
        L45:
            kotlin.d.b(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            goto L6b
        L59:
            r2 = r5
        L5a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.scroll(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object scrollToItem(int i10, int i11, @NotNull Continuation continuation) {
        Object objE = c.e(this, null, new AnonymousClass2(i10, i11, null), continuation, 1, null);
        return objE == b.g() ? objE : Unit.f93236a;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density.setValue(density);
    }

    public final void setPlacementAnimator$foundation_release(@Nullable LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.placementAnimator.setValue(lazyGridItemPlacementAnimator);
    }

    public final void setPrefetchInfoRetriever$foundation_release(@NotNull Function1<? super LineIndex, ? extends List<Pair<Integer, Constraints>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.prefetchInfoRetriever.setValue(function1);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    public final void setSlotsPerLine$foundation_release(int i10) {
        this.slotsPerLine.setValue(Integer.valueOf(i10));
    }

    public final void setVertical$foundation_release(boolean z10) {
        this.isVertical.setValue(Boolean.valueOf(z10));
    }

    public final void snapToItemIndexInternal$foundation_release(int index, int scrollOffset) {
        this.scrollPosition.m590requestPositionyO3Fmg4(ItemIndex.m552constructorimpl(index), scrollOffset);
        LazyGridItemPlacementAnimator placementAnimator$foundation_release = getPlacementAnimator$foundation_release();
        if (placementAnimator$foundation_release != null) {
            placementAnimator$foundation_release.reset();
        }
        Remeasurement remeasurement = getRemeasurement();
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyGridItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider);
    }

    public LazyGridState(int i10, int i11) {
        this.scrollPosition = new LazyGridScrollPosition(i10, i11);
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyGridLayoutInfo.INSTANCE, null, 2, null);
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.density = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DensityKt.Density(1.0f, 1.0f), null, 2, null);
        this.isVertical = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            @NotNull
            public final Float invoke(float f10) {
                return Float.valueOf(-this.this$0.onScroll$foundation_release(-f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ boolean all(Function1 function1) {
                return androidx.compose.ui.b.a(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ boolean any(Function1 function1) {
                return androidx.compose.ui.b.b(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                return androidx.compose.ui.b.c(this, obj, function2);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                return androidx.compose.ui.b.d(this, obj, function2);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement) {
                Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
                this.this$0.setRemeasurement(remeasurement);
            }

            @Override // androidx.compose.ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return androidx.compose.ui.a.a(this, modifier);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.prefetchInfoRetriever = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function1<LineIndex, List<? extends Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchInfoRetriever$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ List<? extends Pair<? extends Integer, ? extends Constraints>> invoke(LineIndex lineIndex) {
                return m592invokebKFJvoY(lineIndex.m610unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-bKFJvoY, reason: not valid java name */
            public final List<Pair<Integer, Constraints>> m592invokebKFJvoY(int i12) {
                return CollectionsKt.emptyList();
            }
        }, null, 2, null);
        this.placementAnimator = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animateScrollScope = new LazyGridAnimateScrollScope(this);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyGridState(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
