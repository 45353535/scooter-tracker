package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1", f = "BackdropScaffold.kt", l = {394}, m = "invokeSuspend")
final class BackdropScaffoldKt$Scrim$dismissModifier$1$1 extends k implements Function2<PointerInputScope, Continuation, Object> {
    final /* synthetic */ Function0<Unit> $onDismiss;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$Scrim$dismissModifier$1$1(Function0<Unit> function0, Continuation continuation) {
        super(2, continuation);
        this.$onDismiss = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        BackdropScaffoldKt$Scrim$dismissModifier$1$1 backdropScaffoldKt$Scrim$dismissModifier$1$1 = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(this.$onDismiss, continuation);
        backdropScaffoldKt$Scrim$dismissModifier$1$1.L$0 = obj;
        return backdropScaffoldKt$Scrim$dismissModifier$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((BackdropScaffoldKt$Scrim$dismissModifier$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final Function0<Unit> function0 = this.$onDismiss;
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m907invokek4lQ0M(offset.getPackedValue());
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m907invokek4lQ0M(long j10) {
                    function0.invoke();
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, function1, this, 7, null) == objG) {
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
}
