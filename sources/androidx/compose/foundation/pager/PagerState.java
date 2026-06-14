package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import com.taurusx.tax.f.y;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;
import zf.a;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u007f2\u00020\u0001:\u0001\u007fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010#\u001a\u00020\bH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R+\u00105\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010.\"\u0004\b3\u00104R/\u0010:\u001a\u0004\u0018\u00010$2\b\u0010/\u001a\u0004\u0018\u00010$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00108\"\u0004\b9\u0010'R+\u0010?\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u0010+\"\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010F\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010+R+\u0010J\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bH\u0010+\"\u0004\bI\u0010>R+\u0010N\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u00101\u001a\u0004\bL\u0010+\"\u0004\bM\u0010>R\u001b\u0010Q\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010D\u001a\u0004\bP\u0010+R\u001b\u0010T\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010D\u001a\u0004\bS\u0010+R\u001b\u0010W\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010D\u001a\u0004\bV\u0010.R\u0014\u0010[\u001a\u00020X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010+R\u0014\u0010d\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010.R\u0016\u0010g\u001a\u0004\u0018\u00010]8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010.R\u0014\u0010k\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010+R\u0014\u0010o\u001a\u00020l8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bp\u0010+R\u0016\u0010s\u001a\u0004\u0018\u00010]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\br\u0010fR\u0011\u0010w\u001a\u00020t8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010|\u001a\u00020x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010zR\u0014\u0010~\u001a\u00020x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010z\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initialPage", "", "initialPageOffsetFraction", "<init>", "(IF)V", "", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceInPageRange", "(I)I", "page", "pageOffsetFraction", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "updateOnScrollStopped$foundation_release", "()V", "updateOnScrollStopped", "Landroidx/compose/foundation/lazy/LazyListState;", "newState", "loadNewState$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "loadNewState", "I", "getInitialPage", "()I", "F", "getInitialPageOffsetFraction", "()F", "<set-?>", "snapRemainingScrollOffset$delegate", "Landroidx/compose/runtime/MutableState;", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset", "lazyListState$delegate", "getLazyListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "setLazyListState", "lazyListState", "pageSpacing$delegate", "getPageSpacing$foundation_release", "setPageSpacing$foundation_release", "(I)V", "pageSpacing", "Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "awaitLazyListStateSet", "Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "currentPage$delegate", "Landroidx/compose/runtime/State;", "getCurrentPage", "currentPage", "animationTargetPage$delegate", "getAnimationTargetPage", "setAnimationTargetPage", "animationTargetPage", "settledPageState$delegate", "getSettledPageState", "setSettledPageState", "settledPageState", "settledPage$delegate", "getSettledPage", "settledPage", "targetPage$delegate", "getTargetPage", "targetPage", "currentPageOffsetFraction$delegate", "getCurrentPageOffsetFraction", "currentPageOffsetFraction", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getVisiblePages", "()Ljava/util/List;", "visiblePages", "getPageAvailableSpace", "pageAvailableSpace", "getPositionThresholdFraction", "positionThresholdFraction", "getClosestPageToSnappedPosition", "()Landroidx/compose/foundation/lazy/LazyListItemInfo;", "closestPageToSnappedPosition", "getDistanceToSnapPosition", "distanceToSnapPosition", "getPageSize$foundation_release", "pageSize", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "getPageCount$foundation_release", "pageCount", "getFirstVisiblePage$foundation_release", "firstVisiblePage", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "isScrollInProgress", "()Z", "getCanScrollForward", "canScrollForward", "getCanScrollBackward", "canScrollBackward", y.f66058y, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PagerState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<PagerState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, PagerState, List<? extends Object>>() { // from class: androidx.compose.foundation.pager.PagerState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final List<Object> invoke(@NotNull SaverScope listSaver, @NotNull PagerState it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf(Integer.valueOf(it.getCurrentPage()), Float.valueOf(it.getCurrentPageOffsetFraction()));
        }
    }, new Function1<List, PagerState>() { // from class: androidx.compose.foundation.pager.PagerState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ PagerState invoke(List list) {
            return invoke2((List<? extends Object>) list);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final PagerState invoke2(@NotNull List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = it.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new PagerState(iIntValue, ((Float) obj2).floatValue());
        }
    });

    /* JADX INFO: renamed from: animationTargetPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animationTargetPage;

    @NotNull
    private final AwaitLazyListStateSet awaitLazyListStateSet;

    /* JADX INFO: renamed from: currentPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final State currentPage;

    /* JADX INFO: renamed from: currentPageOffsetFraction$delegate, reason: from kotlin metadata */
    @NotNull
    private final State currentPageOffsetFraction;
    private final int initialPage;
    private final float initialPageOffsetFraction;

    /* JADX INFO: renamed from: lazyListState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState lazyListState;

    /* JADX INFO: renamed from: pageSpacing$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState pageSpacing;

    /* JADX INFO: renamed from: settledPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final State settledPage;

    /* JADX INFO: renamed from: settledPageState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState settledPageState;

    /* JADX INFO: renamed from: snapRemainingScrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState snapRemainingScrollOffset;

    /* JADX INFO: renamed from: targetPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final State targetPage;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/pager/PagerState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<PagerState, ?> getSaver() {
            return PagerState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {292, 317, 329}, m = "animateScrollToPage")
    static final class AnonymousClass1 extends d {
        float F$0;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
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
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {334, 335}, m = "awaitScrollDependencies")
    static final class C14811 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14811(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.awaitScrollDependencies(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {263, 269}, m = "scrollToPage")
    static final class C14821 extends d {
        float F$0;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14821(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.scrollToPage(0, 0.0f, this);
        }
    }

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i10, float f10, AnimationSpec animationSpec, Continuation continuation, int i11, Object obj) throws Throwable {
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return pagerState.animateScrollToPage(i10, f10, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r6.waitForFirstLayout(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object awaitScrollDependencies(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.pager.PagerState.C14811
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = (androidx.compose.foundation.pager.PagerState.C14811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = new androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r6)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.d.b(r6)
            goto L4d
        L3c:
            kotlin.d.b(r6)
            androidx.compose.foundation.pager.AwaitLazyListStateSet r6 = r5.awaitLazyListStateSet
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.waitFinalLazyListSetting(r0)
            if (r6 != r1) goto L4c
            goto L62
        L4c:
            r2 = r5
        L4d:
            androidx.compose.foundation.lazy.LazyListState r6 = r2.getLazyListState()
            if (r6 == 0) goto L66
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r6 = r6.getAwaitLayoutModifier()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.waitForFirstLayout(r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.awaitScrollDependencies(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i10) {
        if (getPageCount$foundation_release() > 0) {
            return g.n(i10, 0, getPageCount$foundation_release() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getAnimationTargetPage() {
        return ((Number) this.animationTargetPage.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LazyListItemInfo getClosestPageToSnappedPosition() {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        if (visiblePages.isEmpty()) {
            lazyListItemInfo = null;
        } else {
            LazyListItemInfo lazyListItemInfo2 = visiblePages.get(0);
            float f10 = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo2, PagerStateKt.getSnapAlignmentStartToStart()));
            int lastIndex = CollectionsKt.getLastIndex(visiblePages);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    LazyListItemInfo lazyListItemInfo3 = visiblePages.get(i10);
                    float f11 = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo3, PagerStateKt.getSnapAlignmentStartToStart()));
                    if (Float.compare(f10, f11) < 0) {
                        lazyListItemInfo2 = lazyListItemInfo3;
                        f10 = f11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            lazyListItemInfo = lazyListItemInfo2;
        }
        return lazyListItemInfo;
    }

    private final Density getDensity() {
        Density density$foundation_release;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (density$foundation_release = lazyListState.getDensity$foundation_release()) == null) ? PagerStateKt.UnitDensity : density$foundation_release;
    }

    private final float getDistanceToSnapPosition() {
        LazyListItemInfo closestPageToSnappedPosition = getClosestPageToSnappedPosition();
        if (closestPageToSnappedPosition != null) {
            return LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), closestPageToSnappedPosition, PagerStateKt.getSnapAlignmentStartToStart());
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LazyListState getLazyListState() {
        return (LazyListState) this.lazyListState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageAvailableSpace() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPositionThresholdFraction() {
        return Math.min(getDensity().mo308toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getSettledPageState() {
        return ((Number) this.settledPageState.getValue()).intValue();
    }

    private final List<LazyListItemInfo> getVisiblePages() {
        return getLayoutInfo$foundation_release().getVisibleItemsInfo();
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i10, float f10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return pagerState.scrollToPage(i10, f10, continuation);
    }

    private final void setAnimationTargetPage(int i10) {
        this.animationTargetPage.setValue(Integer.valueOf(i10));
    }

    private final void setLazyListState(LazyListState lazyListState) {
        this.lazyListState.setValue(lazyListState);
    }

    private final void setSettledPageState(int i10) {
        this.settledPageState.setValue(Integer.valueOf(i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(r15, r13, r14, r4) == r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateScrollToPage(int r12, float r13, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.AnimationSpec<java.lang.Float> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.dispatchRawDelta(delta);
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollBackward();
        }
        return true;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollForward();
        }
        return true;
    }

    public final int getCurrentPage() {
        return ((Number) this.currentPage.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.currentPageOffsetFraction.getValue()).floatValue();
    }

    @Nullable
    public final LazyListItemInfo getFirstVisiblePage$foundation_release() {
        LazyListItemInfo lazyListItemInfoPrevious;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        ListIterator<LazyListItemInfo> listIterator = visiblePages.listIterator(visiblePages.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfoPrevious = null;
                break;
            }
            lazyListItemInfoPrevious = listIterator.previous();
            if (LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfoPrevious, PagerStateKt.getSnapAlignmentStartToStart()) <= 0.0f) {
                break;
            }
        }
        return lazyListItemInfoPrevious;
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final float getInitialPageOffsetFraction() {
        return this.initialPageOffsetFraction;
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        InteractionSource interactionSource;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (interactionSource = lazyListState.getInteractionSource()) == null) ? PagerStateKt.EmptyInteractionSources : interactionSource;
    }

    @NotNull
    public final LazyListLayoutInfo getLayoutInfo$foundation_release() {
        LazyListLayoutInfo layoutInfo;
        LazyListState lazyListState = getLazyListState();
        return (lazyListState == null || (layoutInfo = lazyListState.getLayoutInfo()) == null) ? PagerStateKt.EmptyLayoutInfo : layoutInfo;
    }

    public final int getPageCount$foundation_release() {
        return getLayoutInfo$foundation_release().getTotalItemsCount();
    }

    public final int getPageSize$foundation_release() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) getVisiblePages());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getSize();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getPageSpacing$foundation_release() {
        return ((Number) this.pageSpacing.getValue()).intValue();
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getSnapRemainingScrollOffset$foundation_release() {
        return ((Number) this.snapRemainingScrollOffset.getValue()).floatValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.isScrollInProgress();
        }
        return false;
    }

    public final void loadNewState$foundation_release(@NotNull LazyListState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        setLazyListState(newState);
        this.awaitLazyListStateSet.onStateLoaded();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState == null) {
            return Unit.f93236a;
        }
        Object objScroll = lazyListState.scroll(mutatePriority, function2, continuation);
        return objScroll == b.g() ? objScroll : Unit.f93236a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r11.scrollToItem(r9, r10, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object scrollToPage(int r9, float r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.pager.PagerState.C14821
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState.C14821) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$scrollToPage$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r11)
            goto L80
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            float r10 = r0.F$0
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.d.b(r11)
            goto L53
        L40:
            kotlin.d.b(r11)
            r0.L$0 = r8
            r0.I$0 = r9
            r0.F$0 = r10
            r0.label = r4
            java.lang.Object r11 = r8.awaitScrollDependencies(r0)
            if (r11 != r1) goto L52
            goto L7f
        L52:
            r2 = r8
        L53:
            double r4 = (double) r10
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 > 0) goto L8b
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L8b
            int r9 = r2.coerceInPageRange(r9)
            int r11 = r2.getPageAvailableSpace()
            float r11 = (float) r11
            float r11 = r11 * r10
            int r10 = zf.a.d(r11)
            androidx.compose.foundation.lazy.LazyListState r11 = r2.getLazyListState()
            if (r11 == 0) goto L83
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r9 = r11.scrollToItem(r9, r10, r0)
            if (r9 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        L83:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        L8b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "pageOffsetFraction "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r10 = " is not within the range -0.5 to 0.5"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scrollToPage(int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setPageSpacing$foundation_release(int i10) {
        this.pageSpacing.setValue(Integer.valueOf(i10));
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f10) {
        this.snapRemainingScrollOffset.setValue(Float.valueOf(f10));
    }

    public final void updateOnScrollStopped$foundation_release() {
        setSettledPageState(getCurrentPage());
    }

    public PagerState(int i10, float f10) {
        this.initialPage = i10;
        this.initialPageOffsetFraction = f10;
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5").toString());
        }
        this.snapRemainingScrollOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.lazyListState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.pageSpacing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.awaitLazyListStateSet = new AwaitLazyListStateSet();
        this.currentPage = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$currentPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                LazyListItemInfo closestPageToSnappedPosition = this.this$0.getClosestPageToSnappedPosition();
                return Integer.valueOf(closestPageToSnappedPosition != null ? closestPageToSnappedPosition.getIndex() : this.this$0.getInitialPage());
            }
        });
        this.animationTargetPage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
        this.settledPageState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i10), null, 2, null);
        this.settledPage = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                int iCoerceInPageRange;
                if (this.this$0.getPageCount$foundation_release() == 0) {
                    iCoerceInPageRange = 0;
                } else {
                    PagerState pagerState = this.this$0;
                    iCoerceInPageRange = pagerState.coerceInPageRange(pagerState.getSettledPageState());
                }
                return Integer.valueOf(iCoerceInPageRange);
            }
        });
        this.targetPage = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                int iD;
                if (!this.this$0.isScrollInProgress()) {
                    iD = this.this$0.getCurrentPage();
                } else if (this.this$0.getAnimationTargetPage() != -1) {
                    iD = this.this$0.getAnimationTargetPage();
                } else if (this.this$0.getSnapRemainingScrollOffset$foundation_release() == 0.0f) {
                    iD = Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction()) ? this.this$0.getCurrentPage() + ((int) Math.signum(this.this$0.getCurrentPageOffsetFraction())) : this.this$0.getCurrentPage();
                } else {
                    iD = a.d(this.this$0.getSnapRemainingScrollOffset$foundation_release() / this.this$0.getPageAvailableSpace()) + this.this$0.getCurrentPage();
                }
                return Integer.valueOf(this.this$0.coerceInPageRange(iD));
            }
        });
        this.currentPageOffsetFraction = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.foundation.pager.PagerState$currentPageOffsetFraction$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                LazyListItemInfo closestPageToSnappedPosition = this.this$0.getClosestPageToSnappedPosition();
                int offset = closestPageToSnappedPosition != null ? closestPageToSnappedPosition.getOffset() : 0;
                float pageAvailableSpace = this.this$0.getPageAvailableSpace();
                return Float.valueOf(pageAvailableSpace == 0.0f ? this.this$0.getInitialPageOffsetFraction() : g.m((-offset) / pageAvailableSpace, -0.5f, 0.5f));
            }
        });
    }

    public /* synthetic */ PagerState(int i10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10);
    }
}
