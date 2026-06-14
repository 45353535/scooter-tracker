package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aG\u0010\r\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aC\u0010\r\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a;\u0010\r\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\r\u0010\u0011\u001a\u0087\u0001\u0010%\u001a\u00020\u00132\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0005¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00130!¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a3\u0010+\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130!2\u0006\u0010(\u001a\u00020\u0006H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a#\u00101\u001a\u0002002\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102\u001aK\u00107\u001a\b\u0012\u0004\u0012\u00020\u0000062\u0006\u0010-\u001a\u00020\t2\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0005H\u0002¢\u0006\u0004\b7\u00108\"&\u0010:\u001a\u0014\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u0017\u0010<\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010=\"\u0017\u0010>\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006?"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "isSkipHalfExpanded", "Landroidx/compose/material/ModalBottomSheetState;", "ModalBottomSheetState", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/material/ModalBottomSheetState;", "skipHalfExpanded", "rememberModalBottomSheetState", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "sheetState", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalBottomSheetLayout-BzaUkTc", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetLayout", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", "Landroidx/compose/material/SwipeableV2State;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "(Landroidx/compose/material/SwipeableV2State;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Lkotlin/Function2;", "animateTo", "snapTo", "Landroidx/compose/material/AnchorChangeHandler;", "ModalBottomSheetAnchorChangeHandler", "(Landroidx/compose/material/ModalBottomSheetState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/AnchorChangeHandler;", "Landroidx/compose/ui/unit/Density;", "PositionalThreshold", "Lkotlin/jvm/functions/Function2;", "VelocityThreshold", "F", "MaxModalBottomSheetWidth", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ModalBottomSheetKt {

    @NotNull
    private static final Function2<Density, Float, Float> PositionalThreshold = new Function2<Density, Float, Float>() { // from class: androidx.compose.material.ModalBottomSheetKt$PositionalThreshold$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Density density, Float f10) {
            return invoke(density, f10.floatValue());
        }

        @NotNull
        public final Float invoke(@NotNull Density density, float f10) {
            Intrinsics.checkNotNullParameter(density, "$this$null");
            return Float.valueOf(density.mo308toPx0680j_4(Dp.m3951constructorimpl(56)));
        }
    };
    private static final float VelocityThreshold = Dp.m3951constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m3951constructorimpl(640);

    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001a\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ SwipeableV2State<?> $state;

        AnonymousClass1(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
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
                boolean r3 = r7 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.AnonymousClass1.mo314onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
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
                boolean r0 = r8 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.AnonymousClass1.mo316onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
        public long mo317onPreScrollOzD1aCk(long available, int source) {
            float fOffsetToFloat = offsetToFloat(available);
            return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m2813equalsimpl0(source, NestedScrollSource.INSTANCE.m2818getDragWNlRxjI())) ? Offset.INSTANCE.m1387getZeroF1C5BW0() : toOffset(this.$state.dispatchRawDelta(fOffsetToFloat));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
        return new AnonymousClass1(swipeableV2State, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchorChangeHandler<ModalBottomSheetValue> ModalBottomSheetAnchorChangeHandler(final ModalBottomSheetState modalBottomSheetState, final Function2<? super ModalBottomSheetValue, ? super Float, Unit> function2, final Function1<? super ModalBottomSheetValue, Unit> function1) {
        return new AnchorChangeHandler<ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetAnchorChangeHandler.1

            /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeHandler$1$WhenMappings */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                    try {
                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchorChangeHandler
            public final void onAnchorsChanged(@NotNull ModalBottomSheetValue previousTarget, @NotNull Map<ModalBottomSheetValue, Float> previousAnchors, @NotNull Map<ModalBottomSheetValue, Float> newAnchors) {
                ModalBottomSheetValue modalBottomSheetValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f10 = previousAnchors.get(previousTarget);
                int i10 = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i10 == 1) {
                    modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new m();
                    }
                    modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                    if (!newAnchors.containsKey(modalBottomSheetValue)) {
                        modalBottomSheetValue = ModalBottomSheetValue.Expanded;
                        if (!newAnchors.containsKey(modalBottomSheetValue)) {
                            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        }
                    }
                }
                if (Intrinsics.areEqual(((Number) MapsKt.getValue(newAnchors, modalBottomSheetValue)).floatValue(), f10)) {
                    return;
                }
                if (modalBottomSheetState.isAnimationRunning$material_release()) {
                    function2.invoke(modalBottomSheetValue, Float.valueOf(modalBottomSheetState.getLastVelocity$material_release()));
                } else {
                    function1.invoke(modalBottomSheetValue);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalBottomSheetLayout-BzaUkTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1054ModalBottomSheetLayoutBzaUkTc(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.material.ModalBottomSheetState r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r27, float r28, long r29, long r31, long r33, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m1054ModalBottomSheetLayoutBzaUkTc(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z10) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        return new ModalBottomSheetState(initialValue, animationSpec, z10, confirmValueChange);
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, animationSpec, function1, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1055Scrim3JVO9M(final long j10, final Function0<Unit> function0, final boolean z10, Composer composer, final int i10) {
        int i11;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(-526532668);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i11, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:547)");
            }
            if (j10 != Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
                final State stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, composerStartRestartGroup, 48, 12);
                final String strM1122getString4foXLRw = Strings_androidKt.m1122getString4foXLRw(Strings.INSTANCE.m1116getCloseSheetUdPEhr4(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1010553415);
                if (z10) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) objRememberedValue);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    boolean zChanged2 = composerStartRestartGroup.changed(strM1122getString4foXLRw) | composerStartRestartGroup.changed(function0);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                SemanticsPropertiesKt.setContentDescription(semantics, strM1122getString4foXLRw);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                } else {
                    modifierSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
                Color colorM1594boximpl = Color.m1594boximpl(j10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged3 = composerStartRestartGroup.changed(colorM1594boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            b.K(Canvas, j10, 0L, 0L, ModalBottomSheetKt.Scrim_3J_VO9M$lambda$1(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                ModalBottomSheetKt.m1055Scrim3JVO9M(j10, function0, z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull final ModalBottomSheetValue initialValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final Function1<? super ModalBottomSheetValue, Boolean> function1, final boolean z10, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-126412120);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.rememberModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:313)");
        }
        composer.startMovableGroup(170046719, initialValue);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m1261rememberSaveable(new Object[]{initialValue, animationSpec, Boolean.valueOf(z10), function1}, (Saver) ModalBottomSheetState.Companion.Saver(animationSpec, function1, z10), (String) null, (Function0) new Function0<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt.rememberModalBottomSheetState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModalBottomSheetState invoke() {
                return ModalBottomSheetKt.ModalBottomSheetState(initialValue, animationSpec, function1, z10);
            }
        }, composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, boolean z10, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-409288536);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-409288536, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:362)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, z10, composer, (i10 & 14) | 64 | ((i10 >> 3) & 896) | ((i10 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetStateRememberModalBottomSheetState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final ModalBottomSheetState rememberModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-1928569212);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928569212, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:389)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, false, composer, (i10 & 14) | 3136 | (i10 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetStateRememberModalBottomSheetState;
    }
}
