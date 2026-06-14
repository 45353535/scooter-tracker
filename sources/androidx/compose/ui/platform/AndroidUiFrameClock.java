package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\b0\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "choreographer", "Landroid/view/Choreographer;", "(Landroid/view/Choreographer;)V", "getChoreographer", "()Landroid/view/Choreographer;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @NotNull
    private final Choreographer choreographer;

    public AndroidUiFrameClock(@NotNull Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.choreographer = choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, function2);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b bVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, bVar);
    }

    @NotNull
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.b getKey() {
        return androidx.compose.runtime.c.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b bVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, bVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull final Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation) {
        CoroutineContext.Element element = continuation.getContext().get(kotlin.coroutines.d.M8);
        final AndroidUiDispatcher androidUiDispatcher = element instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) element : null;
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                Object objB;
                CancellableContinuation cancellableContinuation = eVar;
                Function1<Long, R> function12 = function1;
                try {
                    Result.Companion companion = Result.f93230c;
                    objB = Result.b(function12.invoke(Long.valueOf(j10)));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(kotlin.d.a(th2));
                }
                cancellableContinuation.resumeWith(objB);
            }
        };
        if (androidUiDispatcher == null || !Intrinsics.areEqual(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(frameCallback);
            eVar.v(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th2) {
                    this.this$0.getChoreographer().removeFrameCallback(frameCallback);
                }
            });
        } else {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            eVar.v(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th2) {
                    androidUiDispatcher.removeFrameCallback$ui_release(frameCallback);
                }
            });
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }
}
