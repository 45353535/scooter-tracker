package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a×\u0002\u00108\u001a\u00020\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00122\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001c¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001c¢\u0006\u0002\b\u00172\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020%2\u001b\b\u0002\u0010+\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005¢\u0006\u0002\b\u00172\b\b\u0002\u0010,\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020#2\b\b\u0002\u0010.\u001a\u00020%2\b\b\u0002\u0010/\u001a\u00020'2\b\b\u0002\u00100\u001a\u00020'2\b\b\u0002\u00101\u001a\u00020'2\b\b\u0002\u00102\u001a\u00020'2\b\b\u0002\u00103\u001a\u00020'2\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a\u0084\u0001\u0010?\u001a\u00020\u00162\u0006\u00109\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00062\u001a\u0010<\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020;\u0012\u0006\u0012\u0004\u0018\u00010\u00030:2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\b\u0017H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>\u001aª\u0001\u0010G\u001a\u00020\u00162\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001c¢\u0006\u0002\b\u00172\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\b\u00172\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\b\u00172\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001c¢\u0006\u0002\b\u00172\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00160\u001c¢\u0006\u0002\b\u00172\u0006\u0010*\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010D\u001a\u00020\bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010F\u001a#\u0010L\u001a\u00020K2\n\u00109\u001a\u0006\u0012\u0002\b\u00030H2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bL\u0010M\u001aE\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000P2\u0006\u00109\u001a\u00020\b2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00052\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u0005H\u0002¢\u0006\u0004\bQ\u0010R\"\u0017\u0010S\u001a\u00020%8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bS\u0010T\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006U"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomSheetState;", "BottomSheetScaffoldState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/BottomSheetState;", "rememberBottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/material/DrawerState;", "drawerState", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffold", "state", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "anchors", "BottomSheet-0cLKjW4", "(Landroidx/compose/material/BottomSheetState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheet", "body", "", "bottomSheet", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-KCBPh4w", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILkotlin/jvm/functions/Function0;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldLayout", "Landroidx/compose/material/SwipeableV2State;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "(Landroidx/compose/material/SwipeableV2State;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "animateTo", "snapTo", "Landroidx/compose/material/AnchorChangeHandler;", "BottomSheetScaffoldAnchorChangeHandler", "(Landroidx/compose/material/BottomSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/AnchorChangeHandler;", "FabSpacing", "F", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m3951constructorimpl(16);

    /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C15041 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ SwipeableV2State<?> $state;

        C15041(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
            this.$state = swipeableV2State;
            this.$orientation = orientation;
        }

        private final float offsetToFloat(long j10) {
            return this.$orientation == Orientation.Horizontal ? Offset.m1371getXimpl(j10) : Offset.m1372getYimpl(j10);
        }

        private final long toOffset(float f10) {
            Orientation orientation = this.$orientation;
            float f11 = orientation == Orientation.Horizontal ? f10 : 0.0f;
            if (orientation != Orientation.Vertical) {
                f10 = 0.0f;
            }
            return OffsetKt.Offset(f11, f10);
        }

        private final float velocityToFloat(long j10) {
            return this.$orientation == Orientation.Horizontal ? Velocity.m4176getXimpl(j10) : Velocity.m4177getYimpl(j10);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo314onPostFlingRZ2iAVY(long r3, long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
                r3.<init>(r2, r7)
            L18:
                java.lang.Object r4 = r3.result
                java.lang.Object r7 = pf.b.g()
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.J$0
                kotlin.d.b(r4)
                goto L47
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                kotlin.d.b(r4)
                androidx.compose.material.SwipeableV2State<?> r4 = r2.$state
                float r0 = r2.velocityToFloat(r5)
                r3.J$0 = r5
                r3.label = r1
                java.lang.Object r3 = r4.settle(r0, r3)
                if (r3 != r7) goto L47
                return r7
            L47:
                androidx.compose.ui.unit.Velocity r3 = androidx.compose.ui.unit.Velocity.m4167boximpl(r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.C15041.mo314onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
        public long mo315onPostScrollDzOQY0M(long consumed, long available, int source) {
            return NestedScrollSource.m2813equalsimpl0(source, NestedScrollSource.INSTANCE.m2818getDragWNlRxjI()) ? toOffset(this.$state.dispatchRawDelta(offsetToFloat(available))) : Offset.INSTANCE.m1387getZeroF1C5BW0();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: onPreFling-QWom1Mo */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo316onPreFlingQWom1Mo(long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
                r0.<init>(r5, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r6 = r0.J$0
                kotlin.d.b(r8)
                goto L62
            L2b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L33:
                kotlin.d.b(r8)
                float r8 = r5.velocityToFloat(r6)
                androidx.compose.material.SwipeableV2State<?> r2 = r5.$state
                float r2 = r2.requireOffset()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L5c
                androidx.compose.material.SwipeableV2State<?> r4 = r5.$state
                float r4 = r4.getMinOffset()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L5c
                androidx.compose.material.SwipeableV2State<?> r2 = r5.$state
                r0.J$0 = r6
                r0.label = r3
                java.lang.Object r8 = r2.settle(r8, r0)
                if (r8 != r1) goto L62
                return r1
            L5c:
                androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r6 = r6.m4187getZero9UxMQ8M()
            L62:
                androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m4167boximpl(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.C15041.mo316onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
        public long mo317onPreScrollOzD1aCk(long available, int source) {
            float fOffsetToFloat = offsetToFloat(available);
            return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m2813equalsimpl0(source, NestedScrollSource.INSTANCE.m2818getDragWNlRxjI())) ? Offset.INSTANCE.m1387getZeroF1C5BW0() : toOffset(this.$state.dispatchRawDelta(fOffsetToFloat));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomSheet-0cLKjW4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m920BottomSheet0cLKjW4(androidx.compose.material.BottomSheetState r28, final boolean r29, final kotlin.jvm.functions.Function2<? super androidx.compose.material.BottomSheetValue, ? super androidx.compose.ui.unit.IntSize, java.lang.Float> r30, final androidx.compose.ui.graphics.Shape r31, final float r32, final long r33, final long r35, androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m920BottomSheet0cLKjW4(androidx.compose.material.BottomSheetState, boolean, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, float, long, long, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_]]")
    /* JADX INFO: renamed from: BottomSheetScaffold-bGncdBI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m921BottomSheetScaffoldbGncdBI(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r43, @org.jetbrains.annotations.Nullable androidx.compose.material.BottomSheetScaffoldState r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, int r48, boolean r49, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r50, float r51, long r52, long r54, float r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, boolean r58, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r59, float r60, long r61, long r63, long r65, long r67, long r69, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r71, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r72, final int r73, final int r74, final int r75, final int r76) {
        /*
            Method dump skipped, instruction units count: 1561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m921BottomSheetScaffoldbGncdBI(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, kotlin.jvm.functions.Function3, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchorChangeHandler<BottomSheetValue> BottomSheetScaffoldAnchorChangeHandler(final BottomSheetState bottomSheetState, final Function1<? super BottomSheetValue, Unit> function1, final Function1<? super BottomSheetValue, Unit> function12) {
        return new AnchorChangeHandler<BottomSheetValue>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffoldAnchorChangeHandler.1

            /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1$WhenMappings */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BottomSheetValue.values().length];
                    try {
                        iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchorChangeHandler
            public final void onAnchorsChanged(@NotNull BottomSheetValue previousTarget, @NotNull Map<BottomSheetValue, Float> previousAnchors, @NotNull Map<BottomSheetValue, Float> newAnchors) {
                BottomSheetValue bottomSheetValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f10 = previousAnchors.get(previousTarget);
                int i10 = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i10 == 1) {
                    bottomSheetValue = BottomSheetValue.Collapsed;
                } else {
                    if (i10 != 2) {
                        throw new m();
                    }
                    bottomSheetValue = BottomSheetValue.Expanded;
                    if (!newAnchors.containsKey(bottomSheetValue)) {
                        bottomSheetValue = BottomSheetValue.Collapsed;
                    }
                }
                if (Intrinsics.areEqual(((Number) MapsKt.getValue(newAnchors, bottomSheetValue)).floatValue(), f10)) {
                    return;
                }
                if (bottomSheetState.isAnimationRunning$material_release()) {
                    function1.invoke(bottomSheetValue);
                } else {
                    function12.invoke(bottomSheetValue);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][_]]")
    /* JADX INFO: renamed from: BottomSheetScaffoldLayout-KCBPh4w, reason: not valid java name */
    public static final void m922BottomSheetScaffoldLayoutKCBPh4w(final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final float f10, final int i10, final Function0<Float> function0, final BottomSheetState bottomSheetState, Composer composer, final int i11) {
        float f11;
        char c10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1621720523);
        int i12 = (i11 & 14) == 0 ? (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            f11 = f10;
            i12 |= composerStartRestartGroup.changed(f11) ? 131072 : 65536;
        } else {
            f11 = f10;
        }
        if ((i11 & 3670016) == 0) {
            c10 = 4;
            i12 |= composerStartRestartGroup.changed(i10) ? 1048576 : 524288;
        } else {
            c10 = 4;
        }
        if ((i11 & 29360128) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i11 & 234881024) == 0) {
            i12 |= composerStartRestartGroup.changed(bottomSheetState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i12 & 191739611) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621720523, i12, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:476)");
            }
            Dp dpM3949boximpl = Dp.m3949boximpl(f11);
            FabPosition fabPositionM1025boximpl = FabPosition.m1025boximpl(i10);
            Object[] objArr = new Object[9];
            objArr[0] = function32;
            objArr[1] = function0;
            objArr[2] = function2;
            objArr[3] = function3;
            objArr[c10] = dpM3949boximpl;
            objArr[5] = function22;
            objArr[6] = fabPositionM1025boximpl;
            objArr[7] = function23;
            objArr[8] = bottomSheetState;
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i13 = 0;
            boolean zChanged = false;
            for (int i14 = 9; i13 < i14; i14 = 9) {
                zChanged |= composerStartRestartGroup.changed(objArr[i13]);
                i13++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final float f12 = f11;
                final int i15 = i12;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function24 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BottomSheetValue.values().length];
                            try {
                                iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m926invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m926invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j10) {
                        Placeable placeableMo3011measureBRTryo0;
                        int height;
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        int iM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(j10);
                        final int iM3918getMaxHeightimpl = Constraints.m3918getMaxHeightimpl(j10);
                        long jM3910copyZbe2FdA$default = Constraints.m3910copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = BottomSheetScaffoldLayoutSlot.Sheet;
                        final Function3<Integer, Composer, Integer, Unit> function33 = function32;
                        final int i16 = i15;
                        final Placeable placeableMo3011measureBRTryo02 = SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot, ComposableLambdaKt.composableLambdaInstance(-2120029209, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i17) {
                                if ((i17 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2120029209, i17, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:491)");
                                }
                                function33.invoke(Integer.valueOf(iM3918getMaxHeightimpl), composer2, Integer.valueOf((i16 >> 3) & 112));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })).get(0).mo3011measureBRTryo0(jM3910copyZbe2FdA$default);
                        final int iD = zf.a.d(function0.invoke().floatValue());
                        final Function2<Composer, Integer, Unit> function25 = function2;
                        if (function25 != null) {
                            final int i17 = i15;
                            placeableMo3011measureBRTryo0 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(1477114206, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$topBarPlaceable$1$1
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i18) {
                                    if ((i18 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1477114206, i18, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:496)");
                                    }
                                    function25.invoke(composer2, Integer.valueOf(i17 & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            })).get(0).mo3011measureBRTryo0(jM3910copyZbe2FdA$default);
                        } else {
                            placeableMo3011measureBRTryo0 = null;
                        }
                        int height2 = placeableMo3011measureBRTryo0 != null ? placeableMo3011measureBRTryo0.getHeight() : 0;
                        long jM3910copyZbe2FdA$default2 = Constraints.m3910copyZbe2FdA$default(jM3910copyZbe2FdA$default, 0, 0, 0, iM3918getMaxHeightimpl - height2, 7, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = BottomSheetScaffoldLayoutSlot.Body;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function3;
                        final float f13 = f12;
                        final int i18 = i15;
                        final Placeable placeableMo3011measureBRTryo03 = SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot2, ComposableLambdaKt.composableLambdaInstance(2078633916, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i19) {
                                if ((i19 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2078633916, i19, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:501)");
                                }
                                function34.invoke(PaddingKt.m415PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f13, 7, null), composer2, Integer.valueOf(i18 & 112));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })).get(0).mo3011measureBRTryo0(jM3910copyZbe2FdA$default2);
                        Function2<Composer, Integer, Unit> function26 = function22;
                        final Placeable placeableMo3011measureBRTryo04 = function26 != null ? SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Fab, function26).get(0).mo3011measureBRTryo0(jM3910copyZbe2FdA$default) : null;
                        int width = placeableMo3011measureBRTryo04 != null ? placeableMo3011measureBRTryo04.getWidth() : 0;
                        int height3 = placeableMo3011measureBRTryo04 != null ? placeableMo3011measureBRTryo04.getHeight() : 0;
                        final int iMo302roundToPx0680j_4 = FabPosition.m1028equalsimpl0(i10, FabPosition.INSTANCE.m1032getCenter5ygKITE()) ? (iM3919getMaxWidthimpl - width) / 2 : (iM3919getMaxWidthimpl - width) - SubcomposeLayout.mo302roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
                        int i19 = height3 / 2;
                        final int iMo302roundToPx0680j_42 = SubcomposeLayout.mo308toPx0680j_4(f12) < ((float) i19) ? (iD - height3) - SubcomposeLayout.mo302roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing) : iD - i19;
                        final Placeable placeableMo3011measureBRTryo05 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, function23).get(0).mo3011measureBRTryo0(jM3910copyZbe2FdA$default);
                        final int width2 = (iM3919getMaxWidthimpl - placeableMo3011measureBRTryo05.getWidth()) / 2;
                        int i20 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getCurrentValue().ordinal()];
                        if (i20 == 1) {
                            height = iMo302roundToPx0680j_42 - placeableMo3011measureBRTryo05.getHeight();
                        } else {
                            if (i20 != 2) {
                                throw new m();
                            }
                            height = iM3918getMaxHeightimpl - placeableMo3011measureBRTryo05.getHeight();
                        }
                        final int i21 = height;
                        final Placeable placeable = placeableMo3011measureBRTryo0;
                        final int i22 = height2;
                        return MeasureScope.CC.p(SubcomposeLayout, iM3919getMaxWidthimpl, iM3918getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo03, 0, i22, 0.0f, 4, null);
                                Placeable placeable2 = placeable;
                                if (placeable2 != null) {
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable2, 0, 0, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo02, 0, iD, 0.0f, 4, null);
                                Placeable placeable3 = placeableMo3011measureBRTryo04;
                                if (placeable3 != null) {
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable3, iMo302roundToPx0680j_4, iMo302roundToPx0680j_42, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo05, width2, i21, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function24);
                objRememberedValue = function24;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
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

            public final void invoke(@Nullable Composer composer2, int i16) {
                BottomSheetScaffoldKt.m922BottomSheetScaffoldLayoutKCBPh4w(function2, function3, function32, function22, function23, f10, i10, function0, bottomSheetState, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
            }
        });
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState BottomSheetScaffoldState(@NotNull BottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        return new BottomSheetState(initialValue, animationSpec, confirmStateChange);
    }

    public static /* synthetic */ BottomSheetState BottomSheetScaffoldState$default(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        return BottomSheetScaffoldState(bottomSheetValue, animationSpec, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
        return new C15041(swipeableV2State, orientation);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable DrawerState drawerState, @Nullable BottomSheetState bottomSheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10, int i11) {
        Composer composer2;
        composer.startReplaceableGroup(-1353009744);
        if ((i11 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i11 & 2) != 0) {
            composer2 = composer;
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer2, 6, 6);
        } else {
            composer2 = composer;
        }
        if ((i11 & 4) != 0) {
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1353009744, i10, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:239)");
        }
        composer2.startReplaceableGroup(1618982084);
        boolean zChanged = composer2.changed(drawerState) | composer2.changed(bottomSheetState) | composer2.changed(snackbarHostState);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        composer2.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState rememberBottomSheetState(@NotNull final BottomSheetValue initialValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final Function1<? super BottomSheetValue, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.rememberBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i10, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:197)");
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m1261rememberSaveable(new Object[]{animationSpec}, (Saver) BottomSheetState.INSTANCE.Saver(animationSpec, function1), (String) null, (Function0) new Function0<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.rememberBottomSheetState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BottomSheetState invoke() {
                return new BottomSheetState(initialValue, animationSpec, function1);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetState;
    }
}
