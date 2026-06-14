package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.t5;
import io.sentry.v7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.r1, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f82305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f82306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.a f82307d = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v7 f82308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile b f82309f;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f82310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f82311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f82312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f82313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f82314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f82315f;

        a(NetworkCapabilities networkCapabilities, w0 w0Var, long j10) {
            io.sentry.util.w.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.w.c(w0Var, "BuildInfoProvider is required");
            this.f82310a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f82311b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = w0Var.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f82312c = signalStrength > -100 ? signalStrength : 0;
            this.f82314e = networkCapabilities.hasTransport(4);
            String strX0 = io.sentry.android.core.internal.util.g.x0(networkCapabilities);
            this.f82315f = strX0 == null ? "" : strX0;
            this.f82313d = j10;
        }

        boolean a(a aVar) {
            int iAbs = Math.abs(this.f82312c - aVar.f82312c);
            int iAbs2 = Math.abs(this.f82310a - aVar.f82310a);
            int iAbs3 = Math.abs(this.f82311b - aVar.f82311b);
            boolean z10 = io.sentry.l.l((double) Math.abs(this.f82313d - aVar.f82313d)) < 5000.0d;
            return this.f82314e == aVar.f82314e && this.f82315f.equals(aVar.f82315f) && (z10 || iAbs <= 5) && (z10 || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.f82310a)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.f82310a)) * 0.1d) ? 0 : -1)) <= 0) && (z10 || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.f82311b)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.f82311b)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    static final class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.sentry.b1 f82316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final w0 f82317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        NetworkCapabilities f82318c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f82319d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final t5 f82320e;

        b(io.sentry.b1 b1Var, w0 w0Var, t5 t5Var) {
            this.f82316a = (io.sentry.b1) io.sentry.util.w.c(b1Var, "Scopes are required");
            this.f82317b = (w0) io.sentry.util.w.c(w0Var, "BuildInfoProvider is required");
            this.f82320e = (t5) io.sentry.util.w.c(t5Var, "SentryDateProvider is required");
        }

        private io.sentry.e a(String str) {
            io.sentry.e eVar = new io.sentry.e();
            eVar.y("system");
            eVar.u("network.event");
            eVar.v("action", str);
            eVar.w(g7.INFO);
            return eVar;
        }

        private a b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2, long j10, long j11) {
            if (networkCapabilities == null) {
                return new a(networkCapabilities2, this.f82317b, j11);
            }
            a aVar = new a(networkCapabilities, this.f82317b, j10);
            a aVar2 = new a(networkCapabilities2, this.f82317b, j11);
            if (aVar.a(aVar2)) {
                return null;
            }
            return aVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.f82316a.e(a("NETWORK_AVAILABLE"));
            this.f82318c = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            long jG = this.f82320e.a().g();
            a aVarB = b(this.f82318c, networkCapabilities, this.f82319d, jG);
            if (aVarB == null) {
                return;
            }
            this.f82318c = networkCapabilities;
            this.f82319d = jG;
            io.sentry.e eVarA = a("NETWORK_CAPABILITIES_CHANGED");
            eVarA.v("download_bandwidth", Integer.valueOf(aVarB.f82310a));
            eVarA.v("upload_bandwidth", Integer.valueOf(aVarB.f82311b));
            eVarA.v("vpn_active", Boolean.valueOf(aVarB.f82314e));
            eVarA.v("network_type", aVarB.f82315f);
            int i10 = aVarB.f82312c;
            if (i10 != 0) {
                eVarA.v("signal_strength", Integer.valueOf(i10));
            }
            io.sentry.i0 i0Var = new io.sentry.i0();
            i0Var.k("android:networkCapabilities", aVarB);
            this.f82316a.a(eVarA, i0Var);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.f82316a.e(a("NETWORK_LOST"));
            this.f82318c = null;
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, w0 w0Var) {
        this.f82305b = (Context) io.sentry.util.w.c(c1.f(context), "Context is required");
        this.f82306c = (w0) io.sentry.util.w.c(w0Var, "BuildInfoProvider is required");
    }

    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        io.sentry.util.w.c(b1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82308e = v7Var;
        ILogger logger = v7Var.getLogger();
        g7 g7Var = g7.DEBUG;
        logger.c(g7Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f82306c.d() < 24) {
                v7Var.getLogger().c(g7Var, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            io.sentry.g1 g1VarD = this.f82307d.d();
            try {
                this.f82309f = new b(b1Var, this.f82306c, v7Var.getDateProvider());
                if (io.sentry.android.core.internal.util.g.n0(this.f82305b, v7Var.getLogger(), this.f82306c, this.f82309f)) {
                    v7Var.getLogger().c(g7Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.o.a("NetworkBreadcrumbs");
                } else {
                    v7Var.getLogger().c(g7Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.g1 g1VarD = this.f82307d.d();
        try {
            b bVar = this.f82309f;
            this.f82309f = null;
            if (g1VarD != null) {
                g1VarD.close();
            }
            if (bVar != null) {
                io.sentry.android.core.internal.util.g.D0(bVar);
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
