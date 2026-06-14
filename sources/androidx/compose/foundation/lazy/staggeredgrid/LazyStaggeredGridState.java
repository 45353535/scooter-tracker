package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.f.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ª\u00012\u00020\u0001:\u0002ª\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010&\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100#\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J%\u0010*\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010+J#\u0010/\u001a\u00020\u0010*\u00020\"2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00104\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\u000eJ\u0017\u0010:\u001a\u00020\u00102\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109R\u001b\u0010?\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010B\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u001a\u0010D\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00170H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010L\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR+\u0010W\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010J\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010[\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010J\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010c\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\"\u0010g\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010T\"\u0004\bj\u0010VR\u001a\u0010l\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010r\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\"\u0010v\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010>\"\u0004\by\u0010zR\"\u0010{\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b{\u0010h\u001a\u0004\b|\u0010T\"\u0004\b}\u0010VR&\u0010~\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R,\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010wR%\u0010\u008e\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0014\u0010£\u0001\u001a\u00020\u00178F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010\u001c\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010>R\u0015\u0010¨\u0001\u001a\u00030¥\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010©\u0001\u001a\u00020P8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010T\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006«\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "<init>", "([I[I)V", "", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "", "distance", "onScroll", "(F)F", "delta", "", "notifyPrefetch", "(F)V", "", "prefetchHandlesUsed", "clearLeftoverPrefetchHandles", "(Ljava/util/Set;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "info", "cancelPrefetchIfVisibleItemsChanged", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V", "itemIndex", "laneCount", "fillNearestIndices", "(II)[I", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateScrollToItem", "snapToItemInternal$foundation_release", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "snapToItemInternal", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;)V", "updateScrollPositionIfTheFirstItemWasMoved", "dispatchRawDelta", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "result", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", "applyMeasureResult", "firstVisibleItemIndex$delegate", "Landroidx/compose/runtime/State;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "firstVisibleItemScrollOffset$delegate", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "<set-?>", "canScrollForward$delegate", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "prefetchingEnabled", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollToBeConsumed", "F", "getScrollToBeConsumed$foundation_release", "()F", "measurePassCount", "I", "getMeasurePassCount$foundation_release", "setMeasurePassCount$foundation_release", "(I)V", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "laneWidthsPrefixSum", "[I", "getLaneWidthsPrefixSum$foundation_release", "()[I", "setLaneWidthsPrefixSum$foundation_release", "([I)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "setSpanProvider$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V", "prefetchBaseIndex", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentItemPrefetchHandles", "Ljava/util/Map;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfo", "getLaneCount$foundation_release", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "isScrollInProgress", y.f66058y, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridState implements ScrollableState {

    @NotNull
    private final LazyStaggeredGridAnimateScrollScope animateScrollScope;

    /* JADX INFO: renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState canScrollForward;

    @NotNull
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;

    @NotNull
    private Density density;

    /* JADX INFO: renamed from: firstVisibleItemIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final State firstVisibleItemIndex;

    /* JADX INFO: renamed from: firstVisibleItemScrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final State firstVisibleItemScrollOffset;
    private boolean isVertical;

    @NotNull
    private final LazyStaggeredGridLaneInfo laneInfo;

    @NotNull
    private int[] laneWidthsPrefixSum;

    @NotNull
    private final MutableState<LazyStaggeredGridLayoutInfo> layoutInfoState;
    private int measurePassCount;

    @NotNull
    private final MutableInteractionSource mutableInteractionSource;

    @NotNull
    private final LazyLayoutPinnedItemList pinnedItems;
    private int prefetchBaseIndex;

    @NotNull
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;

    @Nullable
    private Remeasurement remeasurement;

    @NotNull
    private final RemeasurementModifier remeasurementModifier;

    @NotNull
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;

    @NotNull
    private final ScrollableState scrollableState;

    @Nullable
    private LazyStaggeredGridSpanProvider spanProvider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new Function2<SaverScope, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final List<int[]> invoke(@NotNull SaverScope listSaver, @NotNull LazyStaggeredGridState state) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(state, "state");
            return CollectionsKt.listOf((Object[]) new int[][]{state.getScrollPosition().getIndices(), state.getScrollPosition().getOffsets()});
        }
    }, new Function1<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ LazyStaggeredGridState invoke(List<? extends int[]> list) {
            return invoke2((List<int[]>) list);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyStaggeredGridState invoke2(@NotNull List<int[]> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new LazyStaggeredGridState(it.get(0), it.get(1), null);
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<ScrollScope, Continuation, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        private /* synthetic */ Object L$0;
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
            AnonymousClass2 anonymousClass2 = LazyStaggeredGridState.this.new AnonymousClass2(this.$index, this.$scrollOffset, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
            d.b(obj);
            LazyStaggeredGridState.this.snapToItemInternal$foundation_release((ScrollScope) this.L$0, this.$index, this.$scrollOffset);
            return Unit.f93236a;
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i10, i11, continuation);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo info) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = info.getVisibleItemsInfo();
        if (this.prefetchBaseIndex == -1 || visibleItemsInfo.isEmpty()) {
            return;
        }
        int index = ((LazyStaggeredGridItemInfo) CollectionsKt.first((List) visibleItemsInfo)).getIndex();
        int index2 = ((LazyStaggeredGridItemInfo) CollectionsKt.last((List) visibleItemsInfo)).getIndex();
        int i10 = this.prefetchBaseIndex;
        if (index > i10 || i10 > index2) {
            this.prefetchBaseIndex = -1;
            Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
            while (it.hasNext()) {
                ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
            }
            this.currentItemPrefetchHandles.clear();
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> prefetchHandlesUsed) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!prefetchHandlesUsed.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int itemIndex, int laneCount) {
        int[] iArr = new int[laneCount];
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
        if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(itemIndex)) {
            ArraysKt.fill$default(iArr, itemIndex, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(itemIndex + laneCount);
        int lane = this.laneInfo.getLane(itemIndex);
        int iMin = lane == -1 ? 0 : Math.min(lane, laneCount);
        int i10 = iMin - 1;
        int iFindPreviousItemIndex = itemIndex;
        while (true) {
            if (-1 >= i10) {
                break;
            }
            iFindPreviousItemIndex = this.laneInfo.findPreviousItemIndex(iFindPreviousItemIndex, i10);
            iArr[i10] = iFindPreviousItemIndex;
            if (iFindPreviousItemIndex == -1) {
                ArraysKt.fill$default(iArr, -1, 0, i10, 2, (Object) null);
                break;
            }
            i10--;
        }
        iArr[iMin] = itemIndex;
        for (int i11 = iMin + 1; i11 < laneCount; i11++) {
            itemIndex = this.laneInfo.findNextItemIndex(itemIndex, i11);
            iArr[i11] = itemIndex;
        }
        return iArr;
    }

    private final void notifyPrefetch(float delta) {
        LazyStaggeredGridLayoutInfo value = this.layoutInfoState.getValue();
        if (value.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z10 = delta < 0.0f;
        int index = z10 ? ((LazyStaggeredGridItemInfo) CollectionsKt.last((List) value.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridItemInfo) CollectionsKt.first((List) value.getVisibleItemsInfo())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = this.laneWidthsPrefixSum.length;
        for (int i10 = 0; i10 < length; i10++) {
            index = z10 ? this.laneInfo.findNextItemIndex(index, i10) : this.laneInfo.findPreviousItemIndex(index, i10);
            if (index < 0 || index >= value.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(index));
            if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
                boolean z11 = lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(index);
                int i11 = z11 ? 0 : i10;
                int laneCount$foundation_release = z11 ? getLaneCount$foundation_release() : 1;
                int[] iArr = this.laneWidthsPrefixSum;
                int i12 = iArr[(laneCount$foundation_release + i11) - 1] - (i11 == 0 ? 0 : iArr[i11 - 1]);
                this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m620schedulePrefetch0kLqBqw(index, this.isVertical ? Constraints.INSTANCE.m3929fixedWidthOenEA2s(i12) : Constraints.INSTANCE.m3928fixedHeightOenEA2s(i12)));
            }
        }
        clearLeftoverPrefetchHandles(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float distance) {
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
            Remeasurement remeasurement = this.remeasurement;
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

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i10, i11, continuation);
    }

    private void setCanScrollBackward(boolean z10) {
        this.canScrollBackward.setValue(Boolean.valueOf(z10));
    }

    private void setCanScrollForward(boolean z10) {
        this.canScrollForward.setValue(Boolean.valueOf(z10));
    }

    @Nullable
    public final Object animateScrollToItem(int i10, int i11, @NotNull Continuation continuation) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i10, i11, continuation);
        return objAnimateScrollToItem == b.g() ? objAnimateScrollToItem : Unit.f93236a;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyStaggeredGridMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.scrollToBeConsumed -= result.getConsumedScroll();
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        this.layoutInfoState.setValue(result);
        cancelPrefetchIfVisibleItemsChanged(result);
        this.scrollPosition.updateFromMeasureResult(result);
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
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
    /* JADX INFO: renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final int getFirstVisibleItemIndex() {
        return ((Number) this.firstVisibleItemIndex.getValue()).intValue();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return ((Number) this.firstVisibleItemScrollOffset.getValue()).intValue();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final int getLaneCount$foundation_release() {
        return this.laneWidthsPrefixSum.length;
    }

    @NotNull
    /* JADX INFO: renamed from: getLaneInfo$foundation_release, reason: from getter */
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: getLaneWidthsPrefixSum$foundation_release, reason: from getter */
    public final int[] getLaneWidthsPrefixSum() {
        return this.laneWidthsPrefixSum;
    }

    @NotNull
    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: getMeasurePassCount$foundation_release, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    @NotNull
    /* JADX INFO: renamed from: getMutableInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    @NotNull
    /* JADX INFO: renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
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

    @NotNull
    /* JADX INFO: renamed from: getScrollPosition$foundation_release, reason: from getter */
    public final LazyStaggeredGridScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    /* JADX INFO: renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    @Nullable
    /* JADX INFO: renamed from: getSpanProvider$foundation_release, reason: from getter */
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* JADX INFO: renamed from: isVertical$foundation_release, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        return objScroll == b.g() ? objScroll : Unit.f93236a;
    }

    @Nullable
    public final Object scrollToItem(int i10, int i11, @NotNull Continuation continuation) {
        Object objE = c.e(this, null, new AnonymousClass2(i10, i11, null), continuation, 1, null);
        return objE == b.g() ? objE : Unit.f93236a;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    public final void setLaneWidthsPrefixSum$foundation_release(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.laneWidthsPrefixSum = iArr;
    }

    public final void setMeasurePassCount$foundation_release(int i10) {
        this.measurePassCount = i10;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    public final void setSpanProvider$foundation_release(@Nullable LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.spanProvider = lazyStaggeredGridSpanProvider;
    }

    public final void setVertical$foundation_release(boolean z10) {
        this.isVertical = z10;
    }

    public final void snapToItemInternal$foundation_release(@NotNull ScrollScope scrollScope, int i10, int i11) {
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i10);
        if (lazyStaggeredGridItemInfoFindVisibleItem != null) {
            boolean z10 = this.isVertical;
            long offset = lazyStaggeredGridItemInfoFindVisibleItem.getOffset();
            scrollScope.scrollBy((z10 ? IntOffset.m4070getYimpl(offset) : IntOffset.m4069getXimpl(offset)) + i11);
        } else {
            this.scrollPosition.requestPosition(i10, i11);
            Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyLayoutItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider);
    }

    private LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.firstVisibleItemIndex = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$firstVisibleItemIndex$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                Integer num;
                int[] indices = this.this$0.getScrollPosition().getIndices();
                if (indices.length == 0) {
                    num = null;
                } else {
                    int i10 = indices[0];
                    if (i10 == -1) {
                        i10 = 0;
                    }
                    Integer numValueOf = Integer.valueOf(i10);
                    IntIterator it = new IntRange(1, ArraysKt.getLastIndex(indices)).iterator();
                    while (it.hasNext()) {
                        int i11 = indices[it.nextInt()];
                        if (i11 == -1) {
                            i11 = 0;
                        }
                        Integer numValueOf2 = Integer.valueOf(i11);
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                }
                return Integer.valueOf(num != null ? num.intValue() : 0);
            }
        });
        this.firstVisibleItemScrollOffset = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$firstVisibleItemScrollOffset$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                int[] offsets = this.this$0.getScrollPosition().getOffsets();
                LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
                int firstVisibleItemIndex = lazyStaggeredGridState.getFirstVisibleItemIndex();
                int[] indices = lazyStaggeredGridState.getScrollPosition().getIndices();
                int length = offsets.length;
                int iMin = Integer.MAX_VALUE;
                for (int i10 = 0; i10 < length; i10++) {
                    if (indices[i10] == firstVisibleItemIndex) {
                        iMin = Math.min(iMin, offsets[i10]);
                    }
                }
                return Integer.valueOf(iMin != Integer.MAX_VALUE ? iMin : 0);
            }
        });
        this.scrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.layoutInfoState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyStaggeredGridLayoutInfo.INSTANCE, null, 2, null);
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.animateScrollScope = new LazyStaggeredGridAnimateScrollScope(this);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
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
                this.this$0.remeasurement = remeasurement;
            }

            @Override // androidx.compose.ui.Modifier
            public /* synthetic */ Modifier then(Modifier modifier) {
                return a.a(this, modifier);
            }
        };
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState();
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            @NotNull
            public final Float invoke(float f10) {
                return Float.valueOf(-this.this$0.onScroll(-f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }
        });
        this.laneWidthsPrefixSum = new int[0];
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
    }

    public /* synthetic */ LazyStaggeredGridState(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public LazyStaggeredGridState(int i10, int i11) {
        this(new int[]{i10}, new int[]{i11});
    }
}
