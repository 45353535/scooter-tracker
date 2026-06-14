package wd;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements e {
    private final void c(Runnable runnable, boolean z10) {
        pd.b bVar = runnable instanceof pd.b ? (pd.b) runnable : null;
        if (bVar != null) {
            try {
                bVar.a(z10);
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
        }
        try {
            d(runnable);
            Unit unit2 = Unit.f93236a;
        } catch (Throwable unused2) {
        }
    }

    @Override // wd.e
    public /* synthetic */ boolean a(Runnable runnable, long j10) {
        return d.c(this, runnable, j10);
    }

    @Override // wd.e
    public /* synthetic */ boolean b(Runnable runnable) {
        return d.b(this, runnable);
    }

    @Override // wd.e
    public void cancel(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        c(task, true);
    }

    protected abstract void d(Runnable runnable);

    protected abstract void e(Runnable runnable, long j10);

    @Override // wd.e
    public /* synthetic */ void execute(Runnable runnable) {
        d.a(this, runnable);
    }

    @Override // wd.e
    public void schedule(Runnable task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        c(task, false);
        e(task, j10);
    }
}
