package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4484p9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f44646a;

    /* JADX INFO: renamed from: com.ironsource.p9$a */
    public static final class a extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f44647b;

        a(Runnable runnable) {
            this.f44647b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            this.f44647b.run();
        }
    }

    public C4484p9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void c(Runnable runnable) {
        AbstractRunnableC4232ae aVar = runnable instanceof AbstractRunnableC4232ae ? (AbstractRunnableC4232ae) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f44646a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    @NotNull
    public final Handler a() {
        return this.f44646a;
    }

    public final void b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        c(runnable);
    }

    public C4484p9(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f44646a = handler;
    }

    public static /* synthetic */ void a(C4484p9 c4484p9, AbstractRunnableC4232ae abstractRunnableC4232ae, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4484p9.a(abstractRunnableC4232ae, j10);
    }

    public /* synthetic */ C4484p9(Handler handler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(@NotNull AbstractRunnableC4232ae task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f44646a.postDelayed(task, j10);
    }

    public final void a(@NotNull AbstractRunnableC4232ae task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f44646a.removeCallbacks(task);
    }

    public final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c(callback);
    }
}
