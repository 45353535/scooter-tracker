package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\r\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ%\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086\bø\u0001\u0001¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "()V", "_isOpen", "", "awaiters", "", "Lkotlin/coroutines/Continuation;", "", "isOpen", "()Z", "lock", "spareList", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeLatch", "openLatch", "withClosed", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Latch {

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private List<Continuation> awaiters = new ArrayList();

    @NotNull
    private List<Continuation> spareList = new ArrayList();
    private boolean _isOpen = true;

    @Nullable
    public final Object await(@NotNull Continuation continuation) {
        if (isOpen()) {
            return Unit.f93236a;
        }
        final e eVar = new e(pf.b.d(continuation), 1);
        eVar.I();
        synchronized (this.lock) {
            this.awaiters.add(eVar);
        }
        eVar.v(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Latch$await$2$2
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
                Object obj = this.this$0.lock;
                Latch latch = this.this$0;
                CancellableContinuation cancellableContinuation = eVar;
                synchronized (obj) {
                    latch.awaiters.remove(cancellableContinuation);
                    Unit unit = Unit.f93236a;
                }
            }
        });
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            Unit unit = Unit.f93236a;
        }
    }

    public final boolean isOpen() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this._isOpen;
        }
        return z10;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            try {
                if (isOpen()) {
                    return;
                }
                List<Continuation> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Continuation continuation = list.get(i10);
                    Result.Companion companion = Result.f93230c;
                    continuation.resumeWith(Result.b(Unit.f93236a));
                }
                list.clear();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <R> R withClosed(@NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        closeLatch();
        try {
            return block.invoke();
        } finally {
            z.b(1);
            openLatch();
            z.a(1);
        }
    }
}
