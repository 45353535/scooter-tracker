package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"detectMoves", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "pointerEventPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "onMove", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PointerMoveDetectorKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", l = {41}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", l = {44}, m = "invokeSuspend")
        static final class AnonymousClass1 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
            final /* synthetic */ CoroutineContext $currentContext;
            final /* synthetic */ Function1<Offset, Unit> $onMove;
            final /* synthetic */ PointerEventPass $pointerEventPass;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineContext coroutineContext, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation continuation) {
                super(2, continuation);
                this.$currentContext = coroutineContext;
                this.$pointerEventPass = pointerEventPass;
                this.$onMove = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0040 -> B:14:0x0043). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = pf.b.g()
                    int r1 = r7.label
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r7.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    java.lang.Object r3 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.d.b(r8)
                    goto L43
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    kotlin.d.b(r8)
                    java.lang.Object r8 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    r3 = r8
                L2c:
                    kotlin.coroutines.CoroutineContext r8 = r7.$currentContext
                    boolean r8 = kotlinx.coroutines.z.r(r8)
                    if (r8 == 0) goto La3
                    androidx.compose.ui.input.pointer.PointerEventPass r8 = r7.$pointerEventPass
                    r7.L$0 = r3
                    r7.L$1 = r1
                    r7.label = r2
                    java.lang.Object r8 = r3.awaitPointerEvent(r8, r7)
                    if (r8 != r0) goto L43
                    return r0
                L43:
                    androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                    int r4 = r8.getType()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                    int r6 = r5.m2864getMove7fucELk()
                    boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m2858equalsimpl0(r4, r6)
                    if (r6 == 0) goto L57
                    r6 = r2
                    goto L5f
                L57:
                    int r6 = r5.m2862getEnter7fucELk()
                    boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m2858equalsimpl0(r4, r6)
                L5f:
                    if (r6 == 0) goto L63
                    r4 = r2
                    goto L6b
                L63:
                    int r5 = r5.m2863getExit7fucELk()
                    boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m2858equalsimpl0(r4, r5)
                L6b:
                    if (r4 == 0) goto L2c
                    java.util.List r8 = r8.getChanges()
                    java.lang.Object r8 = kotlin.collections.CollectionsKt.first(r8)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                    long r4 = r8.getPosition()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m1360boximpl(r4)
                    long r4 = r8.getPackedValue()
                    java.lang.Object r6 = r1.f93280b
                    boolean r4 = androidx.compose.ui.geometry.Offset.m1367equalsimpl(r4, r6)
                    if (r4 != 0) goto L8c
                    goto L8d
                L8c:
                    r8 = 0
                L8d:
                    if (r8 == 0) goto L2c
                    kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r4 = r7.$onMove
                    long r5 = r8.getPackedValue()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m1360boximpl(r5)
                    r1.f93280b = r8
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m1360boximpl(r5)
                    r4.invoke(r8)
                    goto L2c
                La3:
                    kotlin.Unit r8 = kotlin.Unit.f93236a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation continuation) {
            super(2, continuation);
            this.$this_detectMoves = pointerInputScope;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                CoroutineContext context = getContext();
                PointerInputScope pointerInputScope = this.$this_detectMoves;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Nullable
    public static final Object detectMoves(@NotNull PointerInputScope pointerInputScope, @NotNull PointerEventPass pointerEventPass, @NotNull Function1<? super Offset, Unit> function1, @NotNull Continuation continuation) {
        Object objG = i.g(new AnonymousClass2(pointerInputScope, pointerEventPass, function1, null), continuation);
        return objG == b.g() ? objG : Unit.f93236a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, function1, continuation);
    }
}
