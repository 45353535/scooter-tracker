package lg;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f94276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f94277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f94278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f94279g = p();

    public f(int i10, int i11, long j10, String str) {
        this.f94275c = i10;
        this.f94276d = i11;
        this.f94277e = j10;
        this.f94278f = str;
    }

    private final a p() {
        return new a(this.f94275c, this.f94276d, this.f94277e, this.f94278f);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        a.w(this.f94279g, runnable, false, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        a.w(this.f94279g, runnable, false, true, 2, null);
    }

    @Override // kotlinx.coroutines.s
    public Executor m() {
        return this.f94279g;
    }

    public final void w(Runnable runnable, boolean z10, boolean z11) {
        this.f94279g.s(runnable, z10, z11);
    }
}
