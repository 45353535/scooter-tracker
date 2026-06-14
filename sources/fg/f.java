package fg;

import android.os.Handler;
import android.os.Looper;
import eg.g1;
import eg.o0;
import eg.p0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.k;
import kotlinx.coroutines.z;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f72030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f72031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f72032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f72033e;

    private f(Handler handler, String str, boolean z10) {
        super(null);
        this.f72030b = handler;
        this.f72031c = str;
        this.f72032d = z10;
        this.f72033e = z10 ? this : new f(handler, str, true);
    }

    private final void n0(CoroutineContext coroutineContext, Runnable runnable) {
        z.c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0.b().dispatch(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(f fVar, Runnable runnable) {
        fVar.f72030b.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(CancellableContinuation cancellableContinuation, f fVar) {
        cancellableContinuation.A(fVar, Unit.f93236a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(f fVar, Runnable runnable, Throwable th2) {
        fVar.f72030b.removeCallbacks(runnable);
        return Unit.f93236a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f72030b.post(runnable)) {
            return;
        }
        n0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.k
    public void e(long j10, final CancellableContinuation cancellableContinuation) {
        final Runnable runnable = new Runnable() { // from class: fg.d
            @Override // java.lang.Runnable
            public final void run() {
                f.t0(cancellableContinuation, this);
            }
        };
        if (this.f72030b.postDelayed(runnable, kotlin.ranges.g.k(j10, 4611686018427387903L))) {
            cancellableContinuation.v(new Function1() { // from class: fg.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.u0(this.f72028b, runnable, (Throwable) obj);
                }
            });
        } else {
            n0(cancellableContinuation.getContext(), runnable);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f72030b == this.f72030b && fVar.f72032d == this.f72032d;
    }

    @Override // kotlinx.coroutines.k
    public p0 f(long j10, final Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f72030b.postDelayed(runnable, kotlin.ranges.g.k(j10, 4611686018427387903L))) {
            return new p0() { // from class: fg.c
                @Override // eg.p0
                public final void dispose() {
                    f.s0(this.f72024b, runnable);
                }
            };
        }
        n0(coroutineContext, runnable);
        return g1.f69152b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f72030b) ^ (this.f72032d ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return (this.f72032d && Intrinsics.areEqual(Looper.myLooper(), this.f72030b.getLooper())) ? false : true;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f w() {
        return this.f72033e;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String strP = p();
        if (strP != null) {
            return strP;
        }
        String string = this.f72031c;
        if (string == null) {
            string = this.f72030b.toString();
        }
        if (!this.f72032d) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str) {
        this(handler, str, false);
    }
}
