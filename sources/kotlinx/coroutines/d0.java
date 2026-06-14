package kotlinx.coroutines;

import eg.g1;
import eg.p0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends kotlin.coroutines.a implements Job {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f93604b = new d0();

    private d0() {
        super(Job.N8);
    }

    @Override // kotlinx.coroutines.Job
    public mg.a M() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public p0 U(boolean z10, boolean z11, Function1 function1) {
        return g1.f69152b;
    }

    @Override // kotlinx.coroutines.Job
    public CancellationException W() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job, gg.x
    public void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    public Sequence getChildren() {
        return kotlin.sequences.k.j();
    }

    @Override // kotlinx.coroutines.Job
    public eg.n h(eg.o oVar) {
        return g1.f69152b;
    }

    @Override // kotlinx.coroutines.Job
    public Object i0(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public boolean n() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public p0 q(Function1 function1) {
        return g1.f69152b;
    }

    @Override // kotlinx.coroutines.Job
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }
}
