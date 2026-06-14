package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.p2;
import io.sentry.v7;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class AppState implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static AppState f82290f = new AppState();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile LifecycleObserver f82292c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f82291b = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t1 f82293d = new t1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f82294e = null;

    @ApiStatus.Internal
    public final class LifecycleObserver implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f82295b = new a();

        class a extends CopyOnWriteArrayList {
            a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean add(a aVar) {
                boolean zAdd = super.add(aVar);
                if (Boolean.FALSE.equals(AppState.this.f82294e)) {
                    aVar.m();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(AppState.this.f82294e)) {
                    aVar.n();
                }
                return zAdd;
            }
        }

        public LifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.b(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.d(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner lifecycleOwner) {
            AppState.this.w(false);
            Iterator it = this.f82295b.iterator();
            while (it.hasNext()) {
                ((a) it.next()).m();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner lifecycleOwner) {
            AppState.this.w(true);
            Iterator it = this.f82295b.iterator();
            while (it.hasNext()) {
                ((a) it.next()).n();
            }
        }
    }

    public interface a {
        void m();

        void n();
    }

    private AppState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(ILogger iLogger) {
        LifecycleObserver lifecycleObserver = this.f82292c;
        if (lifecycleObserver != null) {
            try {
                ProcessLifecycleOwner.get().getLifecycle().addObserver(lifecycleObserver);
            } catch (Throwable th2) {
                this.f82292c = null;
                iLogger.a(g7.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    private void m(final ILogger iLogger) {
        if (this.f82292c != null) {
            return;
        }
        try {
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
            this.f82292c = new LifecycleObserver();
            if (io.sentry.android.core.internal.util.l.e().a()) {
                h(iLogger);
            } else {
                this.f82293d.b(new Runnable() { // from class: io.sentry.android.core.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f82766b.h(iLogger);
                    }
                });
            }
        } catch (ClassNotFoundException unused) {
            iLogger.c(g7.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    public static AppState n() {
        return f82290f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver != null) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(lifecycleObserver);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        y();
    }

    public void f(a aVar) {
        io.sentry.g1 g1VarD = this.f82291b.d();
        try {
            m(p2.e());
            if (this.f82292c != null) {
                this.f82292c.f82295b.add(aVar);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Boolean o() {
        return this.f82294e;
    }

    public void p(v7 v7Var) {
        if (this.f82292c != null) {
            return;
        }
        io.sentry.g1 g1VarD = this.f82291b.d();
        try {
            m(v7Var != null ? v7Var.getLogger() : p2.e());
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void q(a aVar) {
        io.sentry.g1 g1VarD = this.f82291b.d();
        try {
            if (this.f82292c != null) {
                this.f82292c.f82295b.remove(aVar);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    void w(boolean z10) {
        this.f82294e = Boolean.valueOf(z10);
    }

    public void y() {
        if (this.f82292c == null) {
            return;
        }
        io.sentry.g1 g1VarD = this.f82291b.d();
        try {
            final LifecycleObserver lifecycleObserver = this.f82292c;
            this.f82292c.f82295b.clear();
            this.f82292c = null;
            if (g1VarD != null) {
                g1VarD.close();
            }
            if (io.sentry.android.core.internal.util.l.e().a()) {
                s(lifecycleObserver);
            } else {
                this.f82293d.b(new Runnable() { // from class: io.sentry.android.core.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f82794b.s(lifecycleObserver);
                    }
                });
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
