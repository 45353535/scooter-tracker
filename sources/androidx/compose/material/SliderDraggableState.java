package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/material/SliderDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Lkotlin/Function1;", "", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)V", "Lkotlin/jvm/functions/Function1;", "getOnDelta", "()Lkotlin/jvm/functions/Function1;", "", "<set-?>", "isDragging$delegate", "Landroidx/compose/runtime/MutableState;", "isDragging", "()Z", "setDragging", "(Z)V", "dragScope", "Landroidx/compose/foundation/gestures/DragScope;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SliderDraggableState implements DraggableState {

    @NotNull
    private final DragScope dragScope;

    /* JADX INFO: renamed from: isDragging$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isDragging;

    @NotNull
    private final Function1<Float, Unit> onDelta;

    @NotNull
    private final MutatorMutex scrollMutex;

    /* JADX INFO: renamed from: androidx.compose.material.SliderDraggableState$drag$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SliderDraggableState$drag$2", f = "Slider.kt", l = {1182}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<DragScope, Continuation, Object> $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, Function2<? super DragScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$dragPriority = mutatePriority;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return SliderDraggableState.this.new AnonymousClass2(this.$dragPriority, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                SliderDraggableState.this.setDragging(true);
                MutatorMutex mutatorMutex = SliderDraggableState.this.scrollMutex;
                DragScope dragScope = SliderDraggableState.this.dragScope;
                MutatePriority mutatePriority = this.$dragPriority;
                Function2<DragScope, Continuation, Object> function2 = this.$block;
                this.label = 1;
                if (mutatorMutex.mutateWith(dragScope, mutatePriority, function2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            SliderDraggableState.this.setDragging(false);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SliderDraggableState(@NotNull Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.onDelta = onDelta;
        this.isDragging = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.dragScope = new DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float pixels) {
                this.this$0.getOnDelta().invoke(Float.valueOf(pixels));
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z10) {
        this.isDragging.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float delta) {
        this.onDelta.invoke(Float.valueOf(delta));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        Object objG = i.g(new AnonymousClass2(mutatePriority, function2, null), continuation);
        return objG == b.g() ? objG : Unit.f93236a;
    }

    @NotNull
    public final Function1<Float, Unit> getOnDelta() {
        return this.onDelta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }
}
