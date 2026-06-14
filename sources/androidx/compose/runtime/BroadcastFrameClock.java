package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0012\u001a\u00020\u00042\f\b\u0002\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aJ+\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "onNewAwaiters", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "awaiters", "", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "failureCause", "", "hasAwaiters", "", "getHasAwaiters", "()Z", "lock", "", "spareList", MenuActionType.CANCEL, "cancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", C4240b4.g.f42582e, "cause", "sendFrame", "timeNanos", "", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FrameAwaiter", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @NotNull
    private List<FrameAwaiter<?>> awaiters;

    @Nullable
    private Throwable failureCause;

    @NotNull
    private final Object lock;

    @Nullable
    private final Function0<Unit> onNewAwaiters;

    @NotNull
    private List<FrameAwaiter<?>> spareList;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "onFrame", "Lkotlin/Function1;", "", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "getContinuation", "()Lkotlin/coroutines/Continuation;", "getOnFrame", "()Lkotlin/jvm/functions/Function1;", "resume", "", "timeNanos", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class FrameAwaiter<R> {

        @NotNull
        private final Continuation continuation;

        @NotNull
        private final Function1<Long, R> onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(@NotNull Function1<? super Long, ? extends R> onFrame, @NotNull Continuation continuation) {
            Intrinsics.checkNotNullParameter(onFrame, "onFrame");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.onFrame = onFrame;
            this.continuation = continuation;
        }

        @NotNull
        public final Continuation getContinuation() {
            return this.continuation;
        }

        @NotNull
        public final Function1<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long timeNanos) {
            Object objB;
            Continuation continuation = this.continuation;
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(this.onFrame.invoke(Long.valueOf(timeNanos)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            continuation.resumeWith(objB);
        }
    }

    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable cause) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                List<FrameAwaiter<?>> list = this.awaiters;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Continuation continuation = list.get(i10).getContinuation();
                    Result.Companion companion = Result.f93230c;
                    continuation.resumeWith(Result.b(kotlin.d.a(cause)));
                }
                this.awaiters.clear();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void cancel(@NotNull CancellationException cancellationException) {
        Intrinsics.checkNotNullParameter(cancellationException, "cancellationException");
        fail(cancellationException);
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

    public final boolean getHasAwaiters() {
        boolean z10;
        synchronized (this.lock) {
            z10 = !this.awaiters.isEmpty();
        }
        return z10;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.b getKey() {
        return c.a(this);
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

    public final void sendFrame(long timeNanos) {
        synchronized (this.lock) {
            try {
                List<FrameAwaiter<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).resume(timeNanos);
                }
                list.clear();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation) {
        FrameAwaiter frameAwaiter;
        e eVar = new e(pf.b.d(continuation), 1);
        eVar.I();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.lock) {
            Throwable th2 = this.failureCause;
            if (th2 != null) {
                Result.Companion companion = Result.f93230c;
                eVar.resumeWith(Result.b(kotlin.d.a(th2)));
            } else {
                ref$ObjectRef.f93280b = new FrameAwaiter(function1, eVar);
                boolean zIsEmpty = this.awaiters.isEmpty();
                List list = this.awaiters;
                Object obj = ref$ObjectRef.f93280b;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (FrameAwaiter) obj;
                }
                list.add(frameAwaiter);
                eVar.v(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
                        invoke2(th3);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Throwable th3) {
                        BroadcastFrameClock.FrameAwaiter frameAwaiter2;
                        Object obj2 = this.this$0.lock;
                        BroadcastFrameClock broadcastFrameClock = this.this$0;
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        synchronized (obj2) {
                            try {
                                List list2 = broadcastFrameClock.awaiters;
                                Object obj3 = ref$ObjectRef2.f93280b;
                                if (obj3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                                    frameAwaiter2 = null;
                                } else {
                                    frameAwaiter2 = (BroadcastFrameClock.FrameAwaiter) obj3;
                                }
                                list2.remove(frameAwaiter2);
                                Unit unit = Unit.f93236a;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                });
                if (zIsEmpty && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th3) {
                        fail(th3);
                    }
                }
            }
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    public BroadcastFrameClock(@Nullable Function0<Unit> function0) {
        this.onNewAwaiters = function0;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0);
    }
}
