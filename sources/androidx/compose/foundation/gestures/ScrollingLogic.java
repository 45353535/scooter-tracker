package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020!H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010$J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u000e\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J'\u00101\u001a\u00020**\u0002022\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u000205ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020**\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010-J\n\u00108\u001a\u00020:*\u00020:J\u0017\u0010;\u001a\u00020**\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010-J\u0017\u0010=\u001a\u00020!*\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010-J\u0017\u0010?\u001a\u00020:*\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0017\u0010?\u001a\u00020:*\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010AJ\u001a\u0010C\u001a\u00020**\u00020:ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020!*\u00020!2\u0006\u0010G\u001a\u00020:ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;)V", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "isNestedFlinging", "Landroidx/compose/runtime/MutableState;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "getReverseDirection", "()Z", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "shouldDispatchOverscroll", "getShouldDispatchOverscroll", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "", "initialVelocity", "onDragStopped-sF-c-tU", "performRawScroll", "Landroidx/compose/ui/geometry/Offset;", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "registerNestedFling", "isFlinging", "shouldScrollImmediately", "dispatchScroll", "Landroidx/compose/foundation/gestures/ScrollScope;", "availableDelta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "", "singleAxisOffset", "singleAxisOffset-MK-Hz9U", "singleAxisVelocity", "singleAxisVelocity-AH228Gc", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "update", "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollingLogic {

    @NotNull
    private final FlingBehavior flingBehavior;

    @NotNull
    private final MutableState<Boolean> isNestedFlinging;

    @NotNull
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;

    @NotNull
    private final Orientation orientation;

    @Nullable
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;

    @NotNull
    private final ScrollableState scrollableState;

    public ScrollingLogic(@NotNull Orientation orientation, boolean z10, @NotNull State<NestedScrollDispatcher> nestedScrollDispatcher, @NotNull ScrollableState scrollableState, @NotNull FlingBehavior flingBehavior, @Nullable OverscrollEffect overscrollEffect) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z10;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscrollEffect;
        this.isNestedFlinging = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: renamed from: dispatchScroll-3eAAhYA, reason: not valid java name */
    public final long m318dispatchScroll3eAAhYA(@NotNull final ScrollScope dispatchScroll, long j10, final int i10) {
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        long jM323singleAxisOffsetMKHz9U = m323singleAxisOffsetMKHz9U(j10);
        Function1<Offset, Offset> function1 = new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$dispatchScroll$performScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                return Offset.m1360boximpl(m329invokeMKHz9U(offset.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-MK-Hz9U, reason: not valid java name */
            public final long m329invokeMKHz9U(long j11) {
                NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
                long jM2809dispatchPreScrollOzD1aCk = value.m2809dispatchPreScrollOzD1aCk(j11, i10);
                long jM1375minusMKHz9U = Offset.m1375minusMKHz9U(j11, jM2809dispatchPreScrollOzD1aCk);
                ScrollingLogic scrollingLogic = this.this$0;
                long jM322reverseIfNeededMKHz9U = scrollingLogic.m322reverseIfNeededMKHz9U(scrollingLogic.m327toOffsettuRUvjQ(dispatchScroll.scrollBy(scrollingLogic.m326toFloatk4lQ0M(scrollingLogic.m322reverseIfNeededMKHz9U(jM1375minusMKHz9U)))));
                return Offset.m1376plusMKHz9U(Offset.m1376plusMKHz9U(jM2809dispatchPreScrollOzD1aCk, jM322reverseIfNeededMKHz9U), value.m2807dispatchPostScrollDzOQY0M(jM322reverseIfNeededMKHz9U, Offset.m1375minusMKHz9U(jM1375minusMKHz9U, jM322reverseIfNeededMKHz9U), i10));
            }
        };
        return (this.overscrollEffect == null || !getShouldDispatchOverscroll()) ? function1.invoke(Offset.m1360boximpl(jM323singleAxisOffsetMKHz9U)).getPackedValue() : this.overscrollEffect.mo165applyToScrollRhakbz0(jM323singleAxisOffsetMKHz9U, i10, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m319doFlingAnimationQWom1Mo(long r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L14
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r4.result
            java.lang.Object r0 = pf.b.g()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r12 = r4.L$0
            kotlin.jvm.internal.u0 r12 = (kotlin.jvm.internal.u0) r12
            kotlin.d.b(r14)
            goto L5b
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.d.b(r14)
            kotlin.jvm.internal.u0 r7 = new kotlin.jvm.internal.u0
            r7.<init>()
            r7.f93333b = r12
            androidx.compose.foundation.gestures.ScrollableState r1 = r11.scrollableState
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r3 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r6 = r11
            r8 = r12
            r5 = r3
            r5.<init>(r6, r7, r8, r10)
            r4.L$0 = r7
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.c.e(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5a
            return r0
        L5a:
            r12 = r7
        L5b:
            long r12 = r12.f93333b
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.ui.unit.Velocity.m4167boximpl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m319doFlingAnimationQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @NotNull
    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r2.mo164applyToFlingBMRW4eQ(r6, r8, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r8.invoke(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: onDragStopped-sF-c-tU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m320onDragStoppedsFctU(long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            kotlin.d.b(r8)
            goto L71
        L39:
            kotlin.d.b(r8)
            r5.registerNestedFling(r4)
            long r6 = r5.m324singleAxisVelocityAH228Gc(r6)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r8 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r8.<init>(r5, r2)
            androidx.compose.foundation.OverscrollEffect r2 = r5.overscrollEffect
            if (r2 == 0) goto L62
            boolean r2 = r5.getShouldDispatchOverscroll()
            if (r2 == 0) goto L62
            androidx.compose.foundation.OverscrollEffect r2 = r5.overscrollEffect
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r2.mo164applyToFlingBMRW4eQ(r6, r8, r0)
            if (r6 != r1) goto L60
            goto L70
        L60:
            r6 = r5
            goto L71
        L62:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m4167boximpl(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r8.invoke(r6, r0)
            if (r6 != r1) goto L60
        L70:
            return r1
        L71:
            r7 = 0
            r6.registerNestedFling(r7)
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m320onDragStoppedsFctU(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m321performRawScrollMKHz9U(long scroll) {
        return this.scrollableState.isScrollInProgress() ? Offset.INSTANCE.m1387getZeroF1C5BW0() : m327toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m326toFloatk4lQ0M(scroll)))));
    }

    public final void registerNestedFling(boolean isFlinging) {
        this.isNestedFlinging.setValue(Boolean.valueOf(isFlinging));
    }

    public final float reverseIfNeeded(float f10) {
        return this.reverseDirection ? f10 * (-1) : f10;
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m322reverseIfNeededMKHz9U(long j10) {
        return this.reverseDirection ? Offset.m1378timestuRUvjQ(j10, -1.0f) : j10;
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress() || this.isNestedFlinging.getValue().booleanValue()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    /* JADX INFO: renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m323singleAxisOffsetMKHz9U(long j10) {
        return this.orientation == Orientation.Horizontal ? Offset.m1365copydBAh8RU$default(j10, 0.0f, 0.0f, 1, null) : Offset.m1365copydBAh8RU$default(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    public final long m324singleAxisVelocityAH228Gc(long j10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4172copyOhffZ5M$default(j10, 0.0f, 0.0f, 1, null) : Velocity.m4172copyOhffZ5M$default(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m325toFloatTH1AsA0(long j10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4176getXimpl(j10) : Velocity.m4177getYimpl(j10);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m326toFloatk4lQ0M(long j10) {
        return this.orientation == Orientation.Horizontal ? Offset.m1371getXimpl(j10) : Offset.m1372getYimpl(j10);
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m327toOffsettuRUvjQ(float f10) {
        return f10 == 0.0f ? Offset.INSTANCE.m1387getZeroF1C5BW0() : this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f10, 0.0f) : OffsetKt.Offset(0.0f, f10);
    }

    /* JADX INFO: renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m328updateQWom1Mo(long j10, float f10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4172copyOhffZ5M$default(j10, f10, 0.0f, 2, null) : Velocity.m4172copyOhffZ5M$default(j10, 0.0f, f10, 1, null);
    }
}
