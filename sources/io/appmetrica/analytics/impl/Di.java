package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Di implements InterfaceC5176ik {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Ci f75672e = new Ci();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f75673f = TimeUnit.SECONDS.toMillis(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5334p0 f75674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5048dk f75675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeProvider f75676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f75677d;

    @VisibleForTesting
    public Di(@NotNull C5334p0 c5334p0, @NotNull C5048dk c5048dk, @NotNull TimeProvider timeProvider) {
        this.f75674a = c5334p0;
        this.f75675b = c5048dk;
        this.f75676c = timeProvider;
        this.f75677d = C5186j4.l().g().b();
    }

    public final void a(@NotNull Ah ah2) {
        Callable ug2;
        ICommonExecutor iCommonExecutor = this.f75677d;
        if (ah2.f75524b) {
            C5048dk c5048dk = this.f75675b;
            ug2 = new C5188j6(c5048dk.f77025a, c5048dk.f77026b, c5048dk.f77027c, ah2);
        } else {
            C5048dk c5048dk2 = this.f75675b;
            ug2 = new Ug(c5048dk2.f77026b, c5048dk2.f77027c, ah2);
        }
        iCommonExecutor.submit(ug2);
    }

    public final void b(@NotNull Ah ah2) {
        long jUptimeMillis = this.f75676c.uptimeMillis();
        C5048dk c5048dk = this.f75675b;
        C5188j6 c5188j6 = new C5188j6(c5048dk.f77025a, c5048dk.f77026b, c5048dk.f77027c, ah2);
        if (this.f75674a.a()) {
            try {
                this.f75677d.submit(c5188j6).get(f75673f, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!c5188j6.f75626c) {
            try {
                c5188j6.a();
            } catch (Throwable unused2) {
            }
        }
        try {
            Thread.sleep(Math.max(0L, f75673f - (this.f75676c.uptimeMillis() - jUptimeMillis)));
        } catch (Throwable unused3) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5176ik
    public final void reportData(int i10, @NotNull Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f75677d;
        C5048dk c5048dk = this.f75675b;
        iCommonExecutor.submit(new Pn(c5048dk.f77026b, c5048dk.f77027c, i10, bundle));
    }

    public Di(@NotNull C5334p0 c5334p0, @NotNull C5048dk c5048dk) {
        this(c5334p0, c5048dk, new SystemTimeProvider());
    }

    public final void a(@NotNull Gf gf2) {
        ICommonExecutor iCommonExecutor = this.f75677d;
        C5048dk c5048dk = this.f75675b;
        iCommonExecutor.submit(new C5547xe(c5048dk.f77026b, c5048dk.f77027c, gf2));
    }

    public final void b(@NotNull Gf gf2) {
        ICommonExecutor iCommonExecutor = this.f75677d;
        C5048dk c5048dk = this.f75675b;
        iCommonExecutor.submit(new Ji(c5048dk.f77026b, c5048dk.f77027c, gf2));
    }
}
