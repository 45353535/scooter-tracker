package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u0005R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "()V", "pendingFrameContinuation", "awaitFrameRequest", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFrameLocked", "Lkotlin/coroutines/Continuation;", "takeFrameRequestLocked", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ProduceFrameSignal {

    @Nullable
    private Object pendingFrameContinuation;

    @Nullable
    public final Object awaitFrameRequest(@NotNull Object obj, @NotNull Continuation continuation) {
        e eVar;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return Unit.f93236a;
            }
            Unit unit = Unit.f93236a;
            e eVar2 = new e(pf.b.d(continuation), 1);
            eVar2.I();
            synchronized (obj) {
                try {
                    if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                        this.pendingFrameContinuation = RecomposerKt.FramePending;
                        eVar = eVar2;
                    } else {
                        this.pendingFrameContinuation = eVar2;
                        eVar = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (eVar != null) {
                Result.Companion companion = Result.f93230c;
                eVar.resumeWith(Result.b(Unit.f93236a));
            }
            Object objC = eVar2.C();
            if (objC == pf.b.g()) {
                g.c(continuation);
            }
            return objC == pf.b.g() ? objC : Unit.f93236a;
        }
    }

    @Nullable
    public final Continuation requestFrameLocked() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof Continuation) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (Continuation) obj;
        }
        if (Intrinsics.areEqual(obj, RecomposerKt.ProduceAnotherFrame) ? true : Intrinsics.areEqual(obj, RecomposerKt.FramePending)) {
            return null;
        }
        if (obj == null) {
            this.pendingFrameContinuation = RecomposerKt.ProduceAnotherFrame;
            return null;
        }
        throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
    }

    public final void takeFrameRequestLocked() {
        if (this.pendingFrameContinuation != RecomposerKt.FramePending) {
            throw new IllegalStateException("frame not pending");
        }
        this.pendingFrameContinuation = null;
    }
}
