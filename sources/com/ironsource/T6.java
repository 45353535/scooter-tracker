package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.InterfaceC4439mf;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class T6 implements InterfaceC4439mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f41795a;

    public interface a {

        /* JADX INFO: renamed from: com.ironsource.T6$a$a, reason: collision with other inner class name */
        public interface InterfaceC0440a {
            void cancel();
        }

        @NotNull
        InterfaceC0440a a(@NotNull Runnable runnable, long j10);
    }

    public static final class b extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f41796b;

        b(Runnable runnable) {
            this.f41796b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            this.f41796b.run();
        }
    }

    public T6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC4439mf
    @NotNull
    public InterfaceC4439mf.a a(@NotNull Runnable task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        return new InterfaceC4439mf.a(this.f41795a.a(a(task), kotlin.time.b.q(j10)));
    }

    public T6(@NotNull a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f41795a = handler;
    }

    public /* synthetic */ T6(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? U6.a(new Handler(Looper.getMainLooper())) : aVar);
    }

    @Override // com.ironsource.InterfaceC4439mf
    @NotNull
    public InterfaceC4439mf.a a(@NotNull InterfaceC4439mf.b task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        return a(task.a(), j10);
    }

    private final AbstractRunnableC4232ae a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC4232ae ? (AbstractRunnableC4232ae) runnable : new b(runnable);
    }
}
