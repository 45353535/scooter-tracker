package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class S7 implements Kf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f41733c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final S9 f41735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final S9 f41736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final S9 f41737g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final S7 f41731a = new S7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Handler f41732b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Lazy f41734d = lf.i.a(a.f41738a);

    static final class a extends Lambda implements Function0<C4250be> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41738a = new a();

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

    static {
        S9 s92 = new S9("isadplayer-background");
        s92.start();
        s92.a();
        f41735e = s92;
        S9 s93 = new S9("isadplayer-publisher-callbacks");
        s93.start();
        s93.a();
        f41736f = s93;
        S9 s94 = new S9("isadplayer-release");
        s94.start();
        s94.a();
        f41737g = s94;
    }

    private S7() {
    }

    private final boolean f(Runnable runnable) {
        return f41733c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z10) {
        f41733c = z10;
    }

    public final void b(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void c(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void d(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void e(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            f41737g.b(action);
        }
    }

    private final C4250be b() {
        return (C4250be) f41734d.getValue();
    }

    public static /* synthetic */ void c(S7 s72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        s72.d(runnable, j10);
    }

    @Override // com.ironsource.Kf
    public void a(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final boolean d() {
        return f41733c;
    }

    public static /* synthetic */ void a(S7 s72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        s72.b(runnable, j10);
    }

    public final void b(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        f41735e.a(action, j10);
    }

    public final void c(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        f41736f.a(action, j10);
    }

    public final void d(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        f41732b.postDelayed(action, j10);
    }

    public static /* synthetic */ void b(S7 s72, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        s72.c(runnable, j10);
    }

    @Override // com.ironsource.Kf
    public void a(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f41733c) {
            b().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f41737g.a(action, j10);
        }
    }

    @NotNull
    public final ThreadPoolExecutor c() {
        return b();
    }

    @Nullable
    public final Looper a() {
        return f41735e.getLooper();
    }
}
