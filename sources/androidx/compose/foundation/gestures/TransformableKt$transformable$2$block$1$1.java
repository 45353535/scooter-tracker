package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import gg.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1", f = "Transformable.kt", l = {91}, m = "invokeSuspend")
final class TransformableKt$transformable$2$block$1$1 extends k implements Function2<PointerInputScope, Continuation, Object> {
    final /* synthetic */ g $channel;
    final /* synthetic */ State<Boolean> $updatePanZoomLock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1", f = "Transformable.kt", l = {92}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ PointerInputScope $$this$null;
        final /* synthetic */ g $channel;
        final /* synthetic */ State<Boolean> $updatePanZoomLock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1$1", f = "Transformable.kt", l = {94}, m = "invokeSuspend")
        static final class C00381 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ g $channel;
            final /* synthetic */ State<Boolean> $updatePanZoomLock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00381(State<Boolean> state, g gVar, CoroutineScope coroutineScope, Continuation continuation) {
                super(2, continuation);
                this.$updatePanZoomLock = state;
                this.$channel = gVar;
                this.$$this$coroutineScope = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00381 c00381 = new C00381(this.$updatePanZoomLock, this.$channel, this.$$this$coroutineScope, continuation);
                c00381.L$0 = obj;
                return c00381;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((C00381) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                try {
                    try {
                        if (i10 == 0) {
                            kotlin.d.b(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            State<Boolean> state = this.$updatePanZoomLock;
                            g gVar = this.$channel;
                            this.label = 1;
                            if (TransformableKt.detectZoom(awaitPointerEventScope, state, gVar, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.d.b(obj);
                        }
                    } catch (CancellationException e10) {
                        if (!i.i(this.$$this$coroutineScope)) {
                            throw e10;
                        }
                    }
                    return Unit.f93236a;
                } finally {
                    this.$channel.e(TransformEvent.TransformStopped.INSTANCE);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, State<Boolean> state, g gVar, Continuation continuation) {
            super(2, continuation);
            this.$$this$null = pointerInputScope;
            this.$updatePanZoomLock = state;
            this.$channel = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$null, this.$updatePanZoomLock, this.$channel, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PointerInputScope pointerInputScope = this.$$this$null;
                C00381 c00381 = new C00381(this.$updatePanZoomLock, this.$channel, coroutineScope, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00381, this) == objG) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableKt$transformable$2$block$1$1(State<Boolean> state, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$updatePanZoomLock = state;
        this.$channel = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        TransformableKt$transformable$2$block$1$1 transformableKt$transformable$2$block$1$1 = new TransformableKt$transformable$2$block$1$1(this.$updatePanZoomLock, this.$channel, continuation);
        transformableKt$transformable$2$block$1$1.L$0 = obj;
        return transformableKt$transformable$2$block$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((TransformableKt$transformable$2$block$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.d.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$updatePanZoomLock, this.$channel, null);
            this.label = 1;
            if (i.g(anonymousClass1, this) == objG) {
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
