package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002\u001a\u0015\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001aO\u0010\u001c\u001a\u00020\u0018*\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0012\u001a\u00020\bH\u0003¢\u0006\u0002\u0010(\u001aR\u0010)\u001a\u00020\u0018*\u00020\u00182\u0006\u0010*\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007\u001aF\u0010)\u001a\u00020\u0018*\u00020\u00182\u0006\u0010*\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"DefaultScrollMotionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScaleFactor", "", "ModifierLocalScrollableContainer", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "getModifierLocalScrollableContainer", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "NoOpScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollableNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollLogic", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "enabled", "awaitScrollEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseWheelScroll", "Landroidx/compose/ui/Modifier;", "scrollingLogicState", "mouseWheelScrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "pointerScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "controller", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "scrollable", "state", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;

    @NotNull
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float pixels) {
            return pixels;
        }
    };

    @NotNull
    private static final ProvidableModifierLocal<Boolean> ModifierLocalScrollableContainer = ModifierLocalKt.modifierLocalOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$ModifierLocalScrollableContainer$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    @NotNull
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r10, function2);
        }

        @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @Nullable
        public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b bVar) {
            return (E) MotionDurationScale.DefaultImpls.get(this, bVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element
        public /* synthetic */ CoroutineContext.b getKey() {
            return androidx.compose.ui.c.a(this);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext minusKey(@NotNull CoroutineContext.b bVar) {
            return MotionDurationScale.DefaultImpls.minusKey(this, bVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
        }
    };

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {313}, m = "awaitScrollEvent")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return ScrollableKt.awaitScrollEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", l = {291}, m = "invokeSuspend")
    static final class C14141 extends k implements Function2<PointerInputScope, Continuation, Object> {
        final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
        final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", l = {293}, m = "invokeSuspend")
        static final class C00301 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
            final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
            final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00301(ScrollConfig scrollConfig, State<ScrollingLogic> state, Continuation continuation) {
                super(2, continuation);
                this.$mouseWheelScrollConfig = scrollConfig;
                this.$scrollingLogicState = state;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00301 c00301 = new C00301(this.$mouseWheelScrollConfig, this.$scrollingLogicState, continuation);
                c00301.L$0 = obj;
                return c00301;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((C00301) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[EDGE_INSN: B:24:0x004c->B:18:0x004c BREAK  A[LOOP:0: B:13:0x003a->B:17:0x0049], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = pf.b.g()
                    int r1 = r8.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r8.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.d.b(r9)
                    goto L2e
                L13:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1b:
                    kotlin.d.b(r9)
                    java.lang.Object r9 = r8.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
                    r1 = r9
                L23:
                    r8.L$0 = r1
                    r8.label = r2
                    java.lang.Object r9 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r1, r8)
                    if (r9 != r0) goto L2e
                    return r0
                L2e:
                    androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
                    java.util.List r3 = r9.getChanges()
                    int r4 = r3.size()
                    r5 = 0
                    r6 = r5
                L3a:
                    if (r6 >= r4) goto L4c
                    java.lang.Object r7 = r3.get(r6)
                    androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                    boolean r7 = r7.isConsumed()
                    if (r7 == 0) goto L49
                    goto L23
                L49:
                    int r6 = r6 + 1
                    goto L3a
                L4c:
                    androidx.compose.foundation.gestures.ScrollConfig r3 = r8.$mouseWheelScrollConfig
                    androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r8.$scrollingLogicState
                    long r6 = r1.mo2822getSizeYbymL2g()
                    long r6 = r3.mo236calculateMouseWheelScroll8xgXZGE(r1, r9, r6)
                    java.lang.Object r3 = r4.getValue()
                    androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
                    float r4 = r3.m326toFloatk4lQ0M(r6)
                    float r4 = r3.reverseIfNeeded(r4)
                    androidx.compose.foundation.gestures.ScrollableState r3 = r3.getScrollableState()
                    float r3 = r3.dispatchRawDelta(r4)
                    r4 = 0
                    int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                    if (r3 != 0) goto L74
                    goto L23
                L74:
                    java.util.List r9 = r9.getChanges()
                    int r3 = r9.size()
                L7c:
                    if (r5 >= r3) goto L23
                    java.lang.Object r4 = r9.get(r5)
                    androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                    r4.consume()
                    int r5 = r5 + 1
                    goto L7c
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.C14141.C00301.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14141(ScrollConfig scrollConfig, State<ScrollingLogic> state, Continuation continuation) {
            super(2, continuation);
            this.$mouseWheelScrollConfig = scrollConfig;
            this.$scrollingLogicState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14141 c14141 = new C14141(this.$mouseWheelScrollConfig, this.$scrollingLogicState, continuation);
            c14141.L$0 = obj;
            return c14141;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((C14141) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C00301 c00301 = new C00301(this.$mouseWheelScrollConfig, this.$scrollingLogicState, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(c00301, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C14161 implements NestedScrollConnection {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ State<ScrollingLogic> $scrollLogic;

        C14161(State<ScrollingLogic> state, boolean z10) {
            this.$scrollLogic = state;
            this.$enabled = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo314onPostFlingRZ2iAVY(long r3, long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
                r3.<init>(r2, r7)
            L18:
                java.lang.Object r4 = r3.result
                java.lang.Object r7 = pf.b.g()
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L37
                if (r0 != r1) goto L2f
                long r5 = r3.J$0
                java.lang.Object r3 = r3.L$0
                androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt.C14161) r3
                kotlin.d.b(r4)
                goto L54
            L2f:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L37:
                kotlin.d.b(r4)
                boolean r4 = r2.$enabled
                if (r4 == 0) goto L5f
                androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.$scrollLogic
                java.lang.Object r4 = r4.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                r3.L$0 = r2
                r3.J$0 = r5
                r3.label = r1
                java.lang.Object r4 = r4.m319doFlingAnimationQWom1Mo(r5, r3)
                if (r4 != r7) goto L53
                return r7
            L53:
                r3 = r2
            L54:
                androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
                long r0 = r4.getPackedValue()
                long r4 = androidx.compose.ui.unit.Velocity.m4179minusAH228Gc(r5, r0)
                goto L66
            L5f:
                androidx.compose.ui.unit.Velocity$Companion r3 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r4 = r3.m4187getZero9UxMQ8M()
                r3 = r2
            L66:
                androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m4167boximpl(r4)
                androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r3 = r3.$scrollLogic
                r4.getPackedValue()
                java.lang.Object r3 = r3.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
                r5 = 0
                r3.registerNestedFling(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.C14161.mo314onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public long mo315onPostScrollDzOQY0M(long consumed, long available, int source) {
            return this.$enabled ? this.$scrollLogic.getValue().m321performRawScrollMKHz9U(available) : Offset.INSTANCE.m1387getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public /* synthetic */ Object mo316onPreFlingQWom1Mo(long j10, Continuation continuation) {
            return androidx.compose.ui.input.nestedscroll.a.c(this, j10, continuation);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public long mo317onPreScrollOzD1aCk(long available, int source) {
            if (NestedScrollSource.m2813equalsimpl0(source, NestedScrollSource.INSTANCE.m2819getFlingWNlRxjI())) {
                this.$scrollLogic.getValue().registerNestedFling(true);
            }
            return Offset.INSTANCE.m1387getZeroF1C5BW0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.d.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
        L38:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.ui.input.pointer.b.t(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
            int r2 = r6.getType()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
            int r4 = r4.m2867getScroll7fucELk()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventType.m2858equalsimpl0(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    @NotNull
    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return ModifierLocalScrollableContainer;
    }

    private static final Modifier mouseWheelScroll(Modifier modifier, State<ScrollingLogic> state, ScrollConfig scrollConfig) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, state, scrollConfig, new C14141(scrollConfig, state, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final Modifier pointerScrollable(Modifier modifier, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z10, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect, boolean z11, Composer composer, int i10) {
        boolean z12;
        composer.startReplaceableGroup(-2012025036);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012025036, i10, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:241)");
        }
        composer.startReplaceableGroup(-1730186281);
        FlingBehavior flingBehavior2 = flingBehavior == null ? ScrollableDefaults.INSTANCE.flingBehavior(composer, 6) : flingBehavior;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new NestedScrollDispatcher(), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new ScrollingLogic(orientation, z10, mutableState, scrollableState, flingBehavior2, overscrollEffect), composer, 0);
        Object objValueOf = Boolean.valueOf(z11);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(objValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            z12 = z11;
            objRememberedValue2 = scrollableNestedScrollConnection(stateRememberUpdatedState, z12);
            composer.updateRememberedValue(objRememberedValue2);
        } else {
            z12 = z11;
        }
        composer.endReplaceableGroup();
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) objRememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new ScrollDraggableState(stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        ScrollDraggableState scrollDraggableState = (ScrollDraggableState) objRememberedValue3;
        ScrollConfig scrollConfigPlatformScrollConfig = AndroidScrollable_androidKt.platformScrollConfig(composer, 0);
        C14151 c14151 = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull PointerInputChange down) {
                Intrinsics.checkNotNullParameter(down, "down");
                return Boolean.valueOf(!PointerType.m2964equalsimpl0(down.getType(), PointerType.INSTANCE.m2969getMouseT8wyACA()));
            }
        };
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(stateRememberUpdatedState);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(stateRememberUpdatedState.getValue().shouldScrollImmediately());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        Function0 function0 = (Function0) objRememberedValue4;
        composer.startReplaceableGroup(511388516);
        boolean zChanged3 = composer.changed(mutableState) | composer.changed(stateRememberUpdatedState);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new ScrollableKt$pointerScrollable$3$1(mutableState, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier modifierNestedScroll = NestedScrollModifierKt.nestedScroll(mouseWheelScroll(DraggableKt.draggable(modifier, scrollDraggableState, c14151, orientation, (64 & 8) != 0 ? true : z12, (64 & 16) != 0 ? null : mutableInteractionSource, function0, (64 & 64) != 0 ? new DraggableKt.AnonymousClass6(null) : null, (64 & 128) != 0 ? new DraggableKt.AnonymousClass7(null) : (Function3) objRememberedValue5, (64 & 256) != 0 ? false : false), stateRememberUpdatedState, scrollConfigPlatformScrollConfig), nestedScrollConnection, (NestedScrollDispatcher) mutableState.getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierNestedScroll;
    }

    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier, @NotNull ScrollableState state, @NotNull Orientation orientation, boolean z10, boolean z11, @Nullable FlingBehavior flingBehavior, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return scrollable(modifier, state, orientation, null, z10, z11, flingBehavior, mutableInteractionSource);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z10, boolean z11, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z12, z11, (i10 & 16) != 0 ? null : flingBehavior, (i10 & 32) != 0 ? null : mutableInteractionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection scrollableNestedScrollConnection(State<ScrollingLogic> state, boolean z10) {
        return new C14161(state, z10);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier, @NotNull final ScrollableState state, @NotNull final Orientation orientation, @Nullable final OverscrollEffect overscrollEffect, final boolean z10, final boolean z11, @Nullable final FlingBehavior flingBehavior, @Nullable final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("scrollable");
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("overscrollEffect", overscrollEffect);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.ScrollableKt.scrollable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-629830927);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-629830927, i10, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:155)");
                }
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.e.f93267b, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                Object[] objArr = {coroutineScope, orientation, state, Boolean.valueOf(z11)};
                Orientation orientation2 = orientation;
                ScrollableState scrollableState = state;
                boolean z12 = z11;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    zChanged |= composer.changed(objArr[i11]);
                }
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ContentInViewModifier(coroutineScope, orientation2, scrollableState, z12);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifier2 = Modifier.INSTANCE;
                Modifier modifierPointerScrollable = ScrollableKt.pointerScrollable(FocusableKt.focusGroup(modifier2).then(((ContentInViewModifier) objRememberedValue2).getModifier()), mutableInteractionSource, orientation, z11, state, flingBehavior, overscrollEffect, z10, composer, 0);
                if (z10) {
                    modifier2 = ModifierLocalScrollableContainerProvider.INSTANCE;
                }
                Modifier modifierThen = modifierPointerScrollable.then(modifier2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z10, boolean z11, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return scrollable(modifier, scrollableState, orientation, overscrollEffect, z12, z11, (i10 & 32) != 0 ? null : flingBehavior, (i10 & 64) != 0 ? null : mutableInteractionSource);
    }
}
