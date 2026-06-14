package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.ironsource.C4257c4;
import eg.f0;
import eg.i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.z;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ!\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0016J\b\u0010%\u001a\u00020&H\u0002J%\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\n\u0010,\u001a\u0004\u0018\u00010\u0015H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010.\u001a\u00020 H\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u001dH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J \u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0002J%\u00107\u001a\u0002082\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\"\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020=H\u0082\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\"\u0010;\u001a\u00020<*\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dH\u0082\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010@J#\u0010B\u001a\u00020\u000b*\u00020\u00152\b\b\u0002\u00101\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\u00020\u001dX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollState", "Landroidx/compose/foundation/gestures/ScrollableState;", "reverseDirection", "", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "animationState", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", C4257c4.f42802f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "focusedChildBoundsFromPreviousRemeasure", "Landroidx/compose/ui/geometry/Rect;", "isAnimationRunning", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "trackingFocusedChild", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "J", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "calculateScrollDelta", "", "computeDestination", "childBounds", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "findBringIntoViewRequest", "getFocusedChildBounds", "launchAnimation", "onPlaced", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "relocationDistance", "leadingEdge", "trailingEdge", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "compareTo", "", "Landroidx/compose/ui/geometry/Size;", "other", "compareTo-iLBOSCw", "(JJ)I", "compareTo-TemP2vQ", "isMaxVisible", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Request", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {

    @NotNull
    private final UpdatableAnimationState animationState;

    @NotNull
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests;

    @Nullable
    private LayoutCoordinates coordinates;

    @Nullable
    private LayoutCoordinates focusedChild;

    @Nullable
    private Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;

    @NotNull
    private final Modifier modifier;

    @NotNull
    private final Orientation orientation;
    private final boolean reverseDirection;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final ScrollableState scrollState;
    private boolean trackingFocusedChild;
    private long viewportSize;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier$Request;", "", "currentBounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Request {

        @NotNull
        private final CancellableContinuation continuation;

        @NotNull
        private final Function0<Rect> currentBounds;

        public Request(@NotNull Function0<Rect> currentBounds, @NotNull CancellableContinuation continuation) {
            Intrinsics.checkNotNullParameter(currentBounds, "currentBounds");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.currentBounds = currentBounds;
            this.continuation = continuation;
        }

        @NotNull
        public final CancellableContinuation getContinuation() {
            return this.continuation;
        }

        @NotNull
        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                kotlinx.coroutines.CancellableContinuation r0 = r4.continuation
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                eg.e0$a r1 = eg.e0.f69143c
                kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
                eg.e0 r0 = (eg.e0) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.m()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.CharsKt.checkRadix(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                kotlinx.coroutines.CancellableContinuation r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewModifier.Request.toString():java.lang.String");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", l = {193}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", l = {198}, m = "invokeSuspend")
        static final class C00261 extends k implements Function2<ScrollScope, Continuation, Object> {
            final /* synthetic */ Job $animationJob;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00261(ContentInViewModifier contentInViewModifier, Job job, Continuation continuation) {
                super(2, continuation);
                this.this$0 = contentInViewModifier;
                this.$animationJob = job;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00261 c00261 = new C00261(this.this$0, this.$animationJob, continuation);
                c00261.L$0 = obj;
                return c00261;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
                return ((C00261) create(scrollScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    final ScrollScope scrollScope = (ScrollScope) this.L$0;
                    this.this$0.animationState.setValue(this.this$0.calculateScrollDelta());
                    UpdatableAnimationState updatableAnimationState = this.this$0.animationState;
                    final ContentInViewModifier contentInViewModifier = this.this$0;
                    final Job job = this.$animationJob;
                    Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                            invoke(f10.floatValue());
                            return Unit.f93236a;
                        }

                        public final void invoke(float f10) {
                            float f11 = contentInViewModifier.reverseDirection ? 1.0f : -1.0f;
                            float fScrollBy = f11 * scrollScope.scrollBy(f11 * f10);
                            if (fScrollBy < f10) {
                                a0.f(job, "Scroll animation cancelled because scroll was not consumed (" + fScrollBy + " < " + f10 + ')', null, 2, null);
                            }
                        }
                    };
                    final ContentInViewModifier contentInViewModifier2 = this.this$0;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewModifier2.bringIntoViewRequests;
                            ContentInViewModifier contentInViewModifier3 = contentInViewModifier2;
                            while (true) {
                                if (!bringIntoViewRequestPriorityQueue.requests.isNotEmpty()) {
                                    break;
                                }
                                Rect rectInvoke = ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                if (!(rectInvoke == null ? true : ContentInViewModifier.m241isMaxVisibleO0kMr_c$default(contentInViewModifier3, rectInvoke, 0L, 1, null))) {
                                    break;
                                } else {
                                    ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.b(Unit.f93236a));
                                }
                            }
                            if (contentInViewModifier2.trackingFocusedChild) {
                                Rect focusedChildBounds = contentInViewModifier2.getFocusedChildBounds();
                                if (focusedChildBounds != null && ContentInViewModifier.m241isMaxVisibleO0kMr_c$default(contentInViewModifier2, focusedChildBounds, 0L, 1, null)) {
                                    contentInViewModifier2.trackingFocusedChild = false;
                                }
                            }
                            contentInViewModifier2.animationState.setValue(contentInViewModifier2.calculateScrollDelta());
                        }
                    };
                    this.label = 1;
                    if (updatableAnimationState.animateToZero(function1, function0, this) == objG) {
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

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = ContentInViewModifier.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Throwable th2;
            AnonymousClass1 anonymousClass1;
            ScrollableState scrollableState;
            C00261 c00261;
            AnonymousClass1 anonymousClass12;
            CancellationException cancellationException;
            Object objG = pf.b.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    Job jobO = z.o(((CoroutineScope) this.L$0).getCoroutineContext());
                    try {
                        ContentInViewModifier.this.isAnimationRunning = true;
                        scrollableState = ContentInViewModifier.this.scrollState;
                        c00261 = new C00261(ContentInViewModifier.this, jobO, null);
                        this.label = 1;
                        anonymousClass12 = this;
                    } catch (CancellationException e10) {
                        e = e10;
                        cancellationException = e;
                        throw cancellationException;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass1 = this;
                        th2 = th;
                        ContentInViewModifier.this.isAnimationRunning = false;
                        ContentInViewModifier.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                        ContentInViewModifier.this.trackingFocusedChild = false;
                        throw th2;
                    }
                    try {
                        if (c.e(scrollableState, null, c00261, anonymousClass12, 1, null) == objG) {
                            return objG;
                        }
                    } catch (CancellationException e11) {
                        e = e11;
                        cancellationException = e;
                        throw cancellationException;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        kotlin.d.b(obj);
                        anonymousClass12 = this;
                    } catch (CancellationException e12) {
                        cancellationException = e12;
                        throw cancellationException;
                    } catch (Throwable th4) {
                        th2 = th4;
                        anonymousClass1 = this;
                        ContentInViewModifier.this.isAnimationRunning = false;
                        ContentInViewModifier.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                        ContentInViewModifier.this.trackingFocusedChild = false;
                        throw th2;
                    }
                }
                ContentInViewModifier.this.bringIntoViewRequests.resumeAndRemoveAll();
                ContentInViewModifier.this.isAnimationRunning = false;
                ContentInViewModifier.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                ContentInViewModifier.this.trackingFocusedChild = false;
                return Unit.f93236a;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public ContentInViewModifier(@NotNull CoroutineScope scope, @NotNull Orientation orientation, @NotNull ScrollableState scrollState, boolean z10) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.scope = scope;
        this.orientation = orientation;
        this.scrollState = scrollState;
        this.reverseDirection = z10;
        this.bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
        this.viewportSize = IntSize.INSTANCE.m4116getZeroYbymL2g();
        this.animationState = new UpdatableAnimationState();
        this.modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier$modifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable LayoutCoordinates layoutCoordinates) {
                this.this$0.focusedChild = layoutCoordinates;
            }
        }), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta() {
        if (IntSize.m4109equalsimpl0(this.viewportSize, IntSize.INSTANCE.m4116getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM4121toSizeozmzZPI = IntSizeKt.m4121toSizeozmzZPI(this.viewportSize);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return relocationDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom(), Size.m1437getHeightimpl(jM4121toSizeozmzZPI));
        }
        if (i10 == 2) {
            return relocationDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight(), Size.m1440getWidthimpl(jM4121toSizeozmzZPI));
        }
        throw new m();
    }

    /* JADX INFO: renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m237compareToTemP2vQ(long j10, long j11) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return Intrinsics.compare(IntSize.m4110getHeightimpl(j10), IntSize.m4110getHeightimpl(j11));
        }
        if (i10 == 2) {
            return Intrinsics.compare(IntSize.m4111getWidthimpl(j10), IntSize.m4111getWidthimpl(j11));
        }
        throw new m();
    }

    /* JADX INFO: renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m238compareToiLBOSCw(long j10, long j11) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return Float.compare(Size.m1437getHeightimpl(j10), Size.m1437getHeightimpl(j11));
        }
        if (i10 == 2) {
            return Float.compare(Size.m1440getWidthimpl(j10), Size.m1440getWidthimpl(j11));
        }
        throw new m();
    }

    /* JADX INFO: renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m239computeDestinationO0kMr_c(Rect childBounds, long containerSize) {
        return childBounds.m1408translatek4lQ0M(Offset.m1380unaryMinusF1C5BW0(m242relocationOffsetBMxPBkI(childBounds, containerSize)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i10 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect rectInvoke = ((Request) content[i10]).getCurrentBounds().invoke();
                if (rectInvoke != null) {
                    if (m238compareToiLBOSCw(rectInvoke.m1404getSizeNHjbRc(), IntSizeKt.m4121toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect;
                    }
                    rect = rectInvoke;
                }
                i10--;
            } while (i10 >= 0);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.focusedChild) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m240isMaxVisibleO0kMr_c(Rect rect, long j10) {
        return Offset.m1368equalsimpl0(m242relocationOffsetBMxPBkI(rect, j10), Offset.INSTANCE.m1387getZeroF1C5BW0());
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    static /* synthetic */ boolean m241isMaxVisibleO0kMr_c$default(ContentInViewModifier contentInViewModifier, Rect rect, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = contentInViewModifier.viewportSize;
        }
        return contentInViewModifier.m240isMaxVisibleO0kMr_c(rect, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        if (this.isAnimationRunning) {
            throw new IllegalStateException("Check failed.");
        }
        i.d(this.scope, null, f0.f69149e, new AnonymousClass1(null), 1, null);
    }

    private final float relocationDistance(float leadingEdge, float trailingEdge, float containerSize) {
        if (leadingEdge >= 0.0f && trailingEdge <= containerSize) {
            return 0.0f;
        }
        if (leadingEdge < 0.0f && trailingEdge > containerSize) {
            return 0.0f;
        }
        float f10 = trailingEdge - containerSize;
        return Math.abs(leadingEdge) < Math.abs(f10) ? leadingEdge : f10;
    }

    /* JADX INFO: renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m242relocationOffsetBMxPBkI(Rect childBounds, long containerSize) {
        long jM4121toSizeozmzZPI = IntSizeKt.m4121toSizeozmzZPI(containerSize);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return OffsetKt.Offset(0.0f, relocationDistance(childBounds.getTop(), childBounds.getBottom(), Size.m1437getHeightimpl(jM4121toSizeozmzZPI)));
        }
        if (i10 == 2) {
            return OffsetKt.Offset(relocationDistance(childBounds.getLeft(), childBounds.getRight(), Size.m1440getWidthimpl(jM4121toSizeozmzZPI)), 0.0f);
        }
        throw new m();
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringChildIntoView(@NotNull Function0<Rect> function0, @NotNull Continuation continuation) {
        Rect rectInvoke = function0.invoke();
        if (rectInvoke == null || m241isMaxVisibleO0kMr_c$default(this, rectInvoke, 0L, 1, null)) {
            return Unit.f93236a;
        }
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        if (this.bringIntoViewRequests.enqueue(new Request(function0, eVar)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect calculateRectForParent(@NotNull Rect localRect) {
        Intrinsics.checkNotNullParameter(localRect, "localRect");
        if (IntSize.m4109equalsimpl0(this.viewportSize, IntSize.INSTANCE.m4116getZeroYbymL2g())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m239computeDestinationO0kMr_c(localRect, this.viewportSize);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.coordinates = coordinates;
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo243onRemeasuredozmzZPI(long size) {
        Rect focusedChildBounds;
        long j10 = this.viewportSize;
        this.viewportSize = size;
        if (m237compareToTemP2vQ(size, j10) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m240isMaxVisibleO0kMr_c(rect, j10) && !m240isMaxVisibleO0kMr_c(focusedChildBounds, size)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
