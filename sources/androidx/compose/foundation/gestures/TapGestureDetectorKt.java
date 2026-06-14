package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008e\u0001\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u0003*\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a^\u0010\u0015\u001a\u00020\u0003*\u00020\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0019\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u0019\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u0011*\u00020\u000eH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0010\u001a#\u0010\u001e\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"<\u0010 \u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Lkotlin/coroutines/Continuation;", "", "onPress", "onTap", "detectTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "firstUp", "awaitSecondDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireUnconsumed", "awaitFirstDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForUpOrCancellation", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NoPressGesture", "Lkotlin/jvm/functions/Function3;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TapGestureDetectorKt {

    @NotNull
    private static final Function3<PressGestureScope, Offset, Continuation, Object> NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {212}, m = "invokeSuspend")
    static final class C14172 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
        final /* synthetic */ PointerInputChange $firstUp;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14172(PointerInputChange pointerInputChange, Continuation continuation) {
            super(2, continuation);
            this.$firstUp = pointerInputChange;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14172 c14172 = new C14172(this.$firstUp, continuation);
            c14172.L$0 = obj;
            return c14172;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((C14172) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
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
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.J$0
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.d.b(r12)
                r5 = r1
                goto L47
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                kotlin.d.b(r12)
                java.lang.Object r12 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
                androidx.compose.ui.input.pointer.PointerInputChange r1 = r11.$firstUp
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.ViewConfiguration r1 = r12.getViewConfiguration()
                long r5 = r1.getDoubleTapMinTimeMillis()
                long r3 = r3 + r5
                r5 = r12
            L35:
                r11.L$0 = r5
                r11.J$0 = r3
                r11.label = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C14172.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {195}, m = "consumeUntilUp")
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
            return TapGestureDetectorKt.consumeUntilUp(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
    static final class C14182 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function3<PressGestureScope, Offset, Continuation, Object> $onPress;
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ PointerInputScope $this_detectTapAndPress;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
        static final class AnonymousClass1 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function3<PressGestureScope, Offset, Continuation, Object> $onPress;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
            static final class C00311 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00311(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00311(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        this.label = 1;
                        if (pressGestureScopeImpl.reset(this) == objG) {
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

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((C00311) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
            static final class C00322 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3<PressGestureScope, Offset, Continuation, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00322(Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00322(this.$onPress, this.$pressScope, this.$down, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        Function3<PressGestureScope, Offset, Continuation, Object> function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM1360boximpl = Offset.m1360boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, offsetM1360boximpl, this) == objG) {
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

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((C00322) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass3(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.$pressScope.cancel();
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class AnonymousClass4 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass4(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.$pressScope.release();
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineScope coroutineScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, Function1<? super Offset, Unit> function1, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.$onPress = function3;
                this.$onTap = function1;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
            
                if (r0 == r6) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
                /*
                    r16 = this;
                    r3 = r16
                    java.lang.Object r6 = pf.b.g()
                    int r0 = r3.label
                    r7 = 2
                    r8 = 1
                    r9 = 0
                    if (r0 == 0) goto L29
                    if (r0 == r8) goto L1f
                    if (r0 != r7) goto L17
                    kotlin.d.b(r17)
                    r0 = r17
                    goto L79
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1f:
                    java.lang.Object r0 = r3.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                    kotlin.d.b(r17)
                    r1 = r17
                    goto L4f
                L29:
                    kotlin.d.b(r17)
                    java.lang.Object r0 = r3.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                    kotlinx.coroutines.CoroutineScope r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                    r13.<init>(r1, r9)
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    eg.g.d(r10, r11, r12, r13, r14, r15)
                    r3.L$0 = r0
                    r3.label = r8
                    r1 = 0
                    r2 = 0
                    r4 = 3
                    r5 = 0
                    java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                    if (r1 != r6) goto L4f
                    goto L78
                L4f:
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                    r1.consume()
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation, java.lang.Object> r2 = r3.$onPress
                    kotlin.jvm.functions.Function3 r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                    if (r2 == r4) goto L6e
                    kotlinx.coroutines.CoroutineScope r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation, java.lang.Object> r2 = r3.$onPress
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r3.$pressScope
                    r13.<init>(r2, r4, r1, r9)
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    eg.g.d(r10, r11, r12, r13, r14, r15)
                L6e:
                    r3.L$0 = r9
                    r3.label = r7
                    java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r0, r9, r3, r8, r9)
                    if (r0 != r6) goto L79
                L78:
                    return r6
                L79:
                    androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                    if (r0 != 0) goto L8e
                    kotlinx.coroutines.CoroutineScope r10 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r3.$pressScope
                    r13.<init>(r0, r9)
                    r14 = 3
                    r15 = 0
                    r11 = 0
                    r12 = 0
                    eg.g.d(r10, r11, r12, r13, r14, r15)
                    goto Lb0
                L8e:
                    r0.consume()
                    kotlinx.coroutines.CoroutineScope r4 = r3.$$this$coroutineScope
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r7 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r3.$pressScope
                    r7.<init>(r1, r9)
                    r8 = 3
                    r9 = 0
                    r5 = 0
                    r6 = 0
                    eg.g.d(r4, r5, r6, r7, r8, r9)
                    kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r1 = r3.$onTap
                    if (r1 == 0) goto Lb0
                    long r4 = r0.getPosition()
                    androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m1360boximpl(r4)
                    r1.invoke(r0)
                Lb0:
                    kotlin.Unit r0 = kotlin.Unit.f93236a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C14182.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14182(PointerInputScope pointerInputScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, Function1<? super Offset, Unit> function1, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
            super(2, continuation);
            this.$this_detectTapAndPress = pointerInputScope;
            this.$onPress = function3;
            this.$onTap = function1;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14182 c14182 = new C14182(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, continuation);
            c14182.L$0 = obj;
            return c14182;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.$onPress, this.$onTap, this.$pressScope, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == objG) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C14182) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {99}, m = "invokeSuspend")
    static final class C14192 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
        final /* synthetic */ Function1<Offset, Unit> $onLongPress;
        final /* synthetic */ Function3<PressGestureScope, Offset, Continuation, Object> $onPress;
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PointerInputScope $this_detectTapGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend")
        static final class AnonymousClass1 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
            final /* synthetic */ Function1<Offset, Unit> $onLongPress;
            final /* synthetic */ Function3<PressGestureScope, Offset, Continuation, Object> $onPress;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {103}, m = "invokeSuspend")
            static final class C00331 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00331(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00331(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        this.label = 1;
                        if (pressGestureScopeImpl.reset(this) == objG) {
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

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((C00331) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class AnonymousClass10 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass10(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass10(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.$pressScope.release();
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {106}, m = "invokeSuspend")
            static final class C00342 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3<PressGestureScope, Offset, Continuation, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00342(Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00342(this.$onPress, this.$pressScope, this.$down, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        Function3<PressGestureScope, Offset, Continuation, Object> function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM1360boximpl = Offset.m1360boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, offsetM1360boximpl, this) == objG) {
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

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((C00342) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {115}, m = "invokeSuspend")
            static final class AnonymousClass3 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass3(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass3) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                        return obj;
                    }
                    kotlin.d.b(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.label = 1;
                    Object objWaitForUpOrCancellation$default = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                    return objWaitForUpOrCancellation$default == objG ? objG : objWaitForUpOrCancellation$default;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class AnonymousClass4 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass4(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.$pressScope.cancel();
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class AnonymousClass5 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass5(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.$pressScope.release();
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            static final class AnonymousClass6 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass6(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass6(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.$pressScope.release();
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
            static final class AnonymousClass7 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass7(this.$pressScope, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        this.label = 1;
                        if (pressGestureScopeImpl.reset(this) == objG) {
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

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {151}, m = "invokeSuspend")
            static final class AnonymousClass8 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ Function3<PressGestureScope, Offset, Continuation, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass8(Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$secondDown = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass8(this.$onPress, this.$pressScope, this.$secondDown, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        Function3<PressGestureScope, Offset, Continuation, Object> function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM1360boximpl = Offset.m1360boximpl(this.$secondDown.getPosition());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, offsetM1360boximpl, this) == objG) {
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

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
            static final class AnonymousClass9 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
                final /* synthetic */ Function1<Offset, Unit> $onTap;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ Ref$ObjectRef $upOrCancel;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                static final class C00351 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ PressGestureScopeImpl $pressScope;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00351(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                        super(2, continuation);
                        this.$pressScope = pressGestureScopeImpl;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new C00351(this.$pressScope, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        pf.b.g();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                        this.$pressScope.release();
                        return Unit.f93236a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((C00351) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                static final class C00362 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ PressGestureScopeImpl $pressScope;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00362(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                        super(2, continuation);
                        this.$pressScope = pressGestureScopeImpl;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new C00362(this.$pressScope, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        pf.b.g();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                        this.$pressScope.cancel();
                        return Unit.f93236a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((C00362) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass9(CoroutineScope coroutineScope, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Ref$ObjectRef ref$ObjectRef, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                    super(2, continuation);
                    this.$$this$coroutineScope = coroutineScope;
                    this.$onDoubleTap = function1;
                    this.$onTap = function12;
                    this.$upOrCancel = ref$ObjectRef;
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$$this$coroutineScope, this.$onDoubleTap, this.$onTap, this.$upOrCancel, this.$pressScope, continuation);
                    anonymousClass9.L$0 = obj;
                    return anonymousClass9;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass9) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        pointerInputChange.consume();
                        i.d(this.$$this$coroutineScope, null, null, new C00351(this.$pressScope, null), 3, null);
                        this.$onDoubleTap.invoke(Offset.m1360boximpl(pointerInputChange.getPosition()));
                        return Unit.f93236a;
                    }
                    i.d(this.$$this$coroutineScope, null, null, new C00362(this.$pressScope, null), 3, null);
                    Function1<Offset, Unit> function1 = this.$onTap;
                    if (function1 == null) {
                        return null;
                    }
                    function1.invoke(Offset.m1360boximpl(((PointerInputChange) this.$upOrCancel.f93280b).getPosition()));
                    return Unit.f93236a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineScope coroutineScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.$onPress = function3;
                this.$onLongPress = function1;
                this.$onDoubleTap = function12;
                this.$onTap = function13;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:44:0x0145, code lost:
            
                if (androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(r4, r19) != r6) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01f4, code lost:
            
                if (r2.withTimeout(r0, r8, r19) == r6) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x0228, code lost:
            
                if (androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(r2, r19) == r6) goto L78;
             */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00f9 A[Catch: PointerEventTimeoutCancellationException -> 0x010a, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x010a, blocks: (B:34:0x00f3, B:36:0x00f9, B:38:0x010e), top: B:84:0x00f3 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x010e A[Catch: PointerEventTimeoutCancellationException -> 0x010a, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x010a, blocks: (B:34:0x00f3, B:36:0x00f9, B:38:0x010e), top: B:84:0x00f3 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01fd  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C14192.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14192(PointerInputScope pointerInputScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation continuation) {
            super(2, continuation);
            this.$this_detectTapGestures = pointerInputScope;
            this.$onPress = function3;
            this.$onLongPress = function1;
            this.$onDoubleTap = function12;
            this.$onTap = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14192 c14192 = new C14192(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
            c14192.L$0 = obj;
            return c14192;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
                PointerInputScope pointerInputScope = this.$this_detectTapGestures;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == objG) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C14192) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
    static final class C14202 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14202(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
        }
    }

    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z10, Continuation continuation) {
        return awaitFirstDown(awaitPointerEventScope, z10, PointerEventPass.Main, continuation);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, Continuation continuation) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new C14172(pointerInputChange, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.d.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.d.b(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.b.t(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object detectTapAndPress(@NotNull PointerInputScope pointerInputScope, @NotNull Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, @Nullable Function1<? super Offset, Unit> function1, @NotNull Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new C14182(pointerInputScope, function3, function1, new PressGestureScopeImpl(pointerInputScope), null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function3 = NoPressGesture;
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return detectTapAndPress(pointerInputScope, function3, function1, continuation);
    }

    @Nullable
    public static final Object detectTapGestures(@NotNull PointerInputScope pointerInputScope, @Nullable Function1<? super Offset, Unit> function1, @Nullable Function1<? super Offset, Unit> function12, @NotNull Function3<? super PressGestureScope, ? super Offset, ? super Continuation, ? extends Object> function3, @Nullable Function1<? super Offset, Unit> function13, @NotNull Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new C14192(pointerInputScope, function3, function12, function1, function13, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        if ((i10 & 2) != 0) {
            function12 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = NoPressGesture;
        }
        if ((i10 & 8) != 0) {
            function13 = null;
        }
        return detectTapGestures(pointerInputScope, function1, function12, function3, function13, continuation);
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitFirstDown(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, boolean r10, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerEventPass r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            kotlin.d.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            kotlin.d.b(r12)
        L42:
            r0.L$0 = r9
            r0.L$1 = r11
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r10 == 0) goto L6c
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r7)
            goto L70
        L6c:
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = r5
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, PointerEventPass pointerEventPass, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z10, pointerEventPass, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object waitForUpOrCancellation(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerEventPass r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
