package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.C4250be;
import com.ironsource.C4462o4;
import com.ironsource.S9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class IronSourceThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f43047a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Handler f43049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final S9 f43050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final S9 f43051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final S9 f43052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Lazy f43053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Lazy f43054h;

    @NotNull
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Handler f43048b = new Handler(Looper.getMainLooper());

    static final class a extends Lambda implements Function0<C4250be> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43055a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4250be invoke() {
            return new C4250be(0, null, null, 7, null);
        }
    }

    static final class b extends Lambda implements Function0<S9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43056a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9 invoke() {
            S9 s92 = new S9("managersThread");
            s92.start();
            s92.a();
            return s92;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        f43049c = new Handler(handlerThread.getLooper());
        S9 s92 = new S9("mediationBackground");
        s92.start();
        s92.a();
        f43050d = s92;
        S9 s93 = new S9("adapterBackground");
        s93.start();
        s93.a();
        f43051e = s93;
        S9 s94 = new S9("publisher-callbacks");
        s94.start();
        s94.a();
        f43052f = s94;
        f43053g = i.a(a.f43055a);
        f43054h = i.a(b.f43056a);
    }

    private IronSourceThreadManager() {
    }

    private final C4250be a() {
        return (C4250be) f43053g.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j10);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j10);
    }

    public final void executeTasks(boolean z10, boolean z11, @NotNull List<? extends Runnable> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z10) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z11) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        for (final Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.b
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            C4462o4.d().a(e10);
        }
    }

    @NotNull
    public final Handler getInitHandler() {
        return f43049c;
    }

    @NotNull
    public final S9 getSharedManagersThread() {
        return (S9) f43054h.getValue();
    }

    @NotNull
    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f43047a;
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            f43051e.b(action);
        }
    }

    public final void removeMediationBackgroundTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            f43050d.b(action);
        }
    }

    public final void removeUiThreadTask(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        f43048b.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z10) {
        f43047a = z10;
    }

    private final boolean a(Runnable runnable) {
        return f43047a && a().getQueue().contains(runnable);
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f43047a) {
            a().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f43051e.a(action, j10);
        }
    }

    public final void postMediationBackgroundTask(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f43047a) {
            a().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f43050d.a(action, j10);
        }
    }

    public final void postOnUiThreadTask(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        f43048b.postDelayed(action, j10);
    }

    public final void postPublisherCallback(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        f43052f.a(action, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }
}
