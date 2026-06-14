package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import hg.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0003\u001f\"%\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u001e\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"2\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u001d\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Landroidx/compose/foundation/pager/PagerState;", "rememberPagerState", "(IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "(Lkotlin/jvm/functions/Function0;)V", "MinPageOffset", "F", "MaxPageOffset", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/Density;", "SnapAlignmentStartToStart", "Lkotlin/jvm/functions/Function3;", "getSnapAlignmentStartToStart", "()Lkotlin/jvm/functions/Function3;", "Landroidx/compose/ui/unit/Dp;", "DefaultPositionThreshold", "getDefaultPositionThreshold", "()F", "MaxPagesForAnimateScroll", "I", "androidx/compose/foundation/pager/PagerStateKt$EmptyLayoutInfo$1", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerStateKt$EmptyLayoutInfo$1;", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "UnitDensity", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "androidx/compose/foundation/pager/PagerStateKt$EmptyInteractionSources$1", "EmptyInteractionSources", "Landroidx/compose/foundation/pager/PagerStateKt$EmptyInteractionSources$1;", "", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PagerStateKt {
    private static final boolean DEBUG = false;
    private static final float MaxPageOffset = 0.5f;
    private static final int MaxPagesForAnimateScroll = 3;
    private static final float MinPageOffset = -0.5f;

    @NotNull
    private static final Function3<Density, Float, Float, Float> SnapAlignmentStartToStart = new Function3<Density, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerStateKt$SnapAlignmentStartToStart$1
        @NotNull
        public final Float invoke(@NotNull Density density, float f10, float f11) {
            Intrinsics.checkNotNullParameter(density, "$this$null");
            return Float.valueOf(0.0f);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Float invoke(Density density, Float f10, Float f11) {
            return invoke(density, f10.floatValue(), f11.floatValue());
        }
    };
    private static final float DefaultPositionThreshold = Dp.m3951constructorimpl(56);

    @NotNull
    private static final PagerStateKt$EmptyLayoutInfo$1 EmptyLayoutInfo = new LazyListLayoutInfo() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final int mainAxisItemSpacing;
        private final int totalItemsCount;
        private final int viewportEndOffset;
        private final int viewportStartOffset;

        @NotNull
        private final List<LazyListItemInfo> visibleItemsInfo = CollectionsKt.emptyList();

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public /* synthetic */ int getAfterContentPadding() {
            return b.a(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public /* synthetic */ int getBeforeContentPadding() {
            return b.b(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public int getMainAxisItemSpacing() {
            return this.mainAxisItemSpacing;
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public /* synthetic */ Orientation getOrientation() {
            return b.d(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public /* synthetic */ boolean getReverseLayout() {
            return b.e(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public int getTotalItemsCount() {
            return this.totalItemsCount;
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public int getViewportEndOffset() {
            return this.viewportEndOffset;
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        /* JADX INFO: renamed from: getViewportSize-YbymL2g */
        public /* synthetic */ long mo517getViewportSizeYbymL2g() {
            return b.f(this);
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        public int getViewportStartOffset() {
            return this.viewportStartOffset;
        }

        @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
        @NotNull
        public List<LazyListItemInfo> getVisibleItemsInfo() {
            return this.visibleItemsInfo;
        }
    };

    @NotNull
    private static final PagerStateKt$UnitDensity$1 UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo301roundToPxR2X_6o(long j10) {
            return a.a(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo302roundToPx0680j_4(float f10) {
            return a.b(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo303toDpGaN1DYA(long j10) {
            return a.c(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo304toDpu2uoSUM(float f10) {
            return a.d(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo306toDpSizekrfVVM(long j10) {
            return a.f(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo307toPxR2X_6o(long j10) {
            return a.g(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo308toPx0680j_4(float f10) {
            return a.h(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return a.i(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo309toSizeXkaWNTQ(long j10) {
            return a.j(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo310toSp0xMU5do(float f10) {
            return a.k(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo311toSpkPz2Gy4(float f10) {
            return a.l(this, f10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo305toDpu2uoSUM(int i10) {
            return a.e(this, i10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo312toSpkPz2Gy4(int i10) {
            return a.m(this, i10);
        }
    };

    @NotNull
    private static final PagerStateKt$EmptyInteractionSources$1 EmptyInteractionSources = new InteractionSource() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyInteractionSources$1
        @Override // androidx.compose.foundation.interaction.InteractionSource
        @NotNull
        public Flow getInteractions() {
            return i.u();
        }
    };

    @Nullable
    public static final Object animateToNextPage(@NotNull PagerState pagerState, @NotNull Continuation continuation) throws Throwable {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount$foundation_release()) {
            return Unit.f93236a;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, continuation, 6, null);
        return objAnimateScrollToPage$default == pf.b.g() ? objAnimateScrollToPage$default : Unit.f93236a;
    }

    @Nullable
    public static final Object animateToPreviousPage(@NotNull PagerState pagerState, @NotNull Continuation continuation) throws Throwable {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return Unit.f93236a;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, continuation, 6, null);
        return objAnimateScrollToPage$default == pf.b.g() ? objAnimateScrollToPage$default : Unit.f93236a;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    @NotNull
    public static final Function3<Density, Float, Float, Float> getSnapAlignmentStartToStart() {
        return SnapAlignmentStartToStart;
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final PagerState rememberPagerState(final int i10, final float f10, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(144687223);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            f10 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(144687223, i11, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:66)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerState, ?> saver = PagerState.INSTANCE.getSaver();
        Integer numValueOf = Integer.valueOf(i10);
        Float fValueOf = Float.valueOf(f10);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(fValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<PagerState>() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final PagerState invoke() {
                    return new PagerState(i10, f10);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PagerState pagerState = (PagerState) RememberSaveableKt.m1261rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerState;
    }
}
