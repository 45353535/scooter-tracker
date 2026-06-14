package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Handler;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import io.sentry.ILogger;
import io.sentry.android.core.AppState;
import io.sentry.android.core.c1;
import io.sentry.android.core.w0;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.n0;
import io.sentry.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements n0, AppState.a, AutoCloseable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile ConnectivityManager f82563o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f82568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7 f82569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f82570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.transport.p f82571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f82572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f82573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.util.a f82574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile ConnectivityManager.NetworkCallback f82575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile NetworkCapabilities f82576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile Network f82577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile long f82578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f82579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final io.sentry.util.a f82562n = new io.sentry.util.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final io.sentry.util.a f82564p = new io.sentry.util.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final List f82565q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f82566r = {1, 0, 3, 2};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f82567s = new int[2];

    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        private void a() {
            g.this.f82579m.set(false);
            g1 g1VarD = g.this.f82574h.d();
            try {
                g.this.f82576j = null;
                g.this.f82577k = null;
                g gVar = g.this;
                gVar.f82578l = gVar.f82571e.getCurrentTimeMillis();
                g.this.f82569c.getLogger().c(g7.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = g.this.f82572f.iterator();
                while (it.hasNext()) {
                    ((n0.b) it.next()).f(n0.a.DISCONNECTED);
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

        private boolean b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i10 : g.f82567s) {
                if (i10 != 0 && networkCapabilities.hasCapability(i10) != networkCapabilities2.hasCapability(i10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean c(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i10 : g.f82566r) {
                if (networkCapabilities.hasTransport(i10) != networkCapabilities2.hasTransport(i10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean d(NetworkCapabilities networkCapabilities) {
            NetworkCapabilities networkCapabilities2 = g.this.f82576j;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                return true;
            }
            if (networkCapabilities2 == null && networkCapabilities == null) {
                return false;
            }
            return b(networkCapabilities2, networkCapabilities) || c(networkCapabilities2, networkCapabilities);
        }

        private void e(Network network, NetworkCapabilities networkCapabilities) {
            if (d(networkCapabilities)) {
                g.this.H0(networkCapabilities);
                n0.a aVarT0 = g.this.t0();
                g1 g1VarD = g.this.f82574h.d();
                try {
                    Iterator it = g.this.f82572f.iterator();
                    while (it.hasNext()) {
                        ((n0.b) it.next()).f(aVarT0);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            g.this.f82577k = network;
            if (g.this.f82579m.getAndSet(true)) {
                return;
            }
            g1 g1VarD = g.f82564p.d();
            try {
                Iterator it = g.f82565q.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network.equals(g.this.f82577k)) {
                e(network, networkCapabilities);
                g1 g1VarD = g.f82564p.d();
                try {
                    Iterator it = g.f82565q.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(g.this.f82577k)) {
                a();
                g1 g1VarD = g.f82564p.d();
                try {
                    Iterator it = g.f82565q.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            a();
            g1 g1VarD = g.f82564p.d();
            try {
                Iterator it = g.f82565q.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
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

    public g(Context context, v7 v7Var, w0 w0Var, io.sentry.transport.p pVar) {
        this(context, v7Var, w0Var, pVar, null);
    }

    private boolean A0() {
        return this.f82571e.getCurrentTimeMillis() - this.f82578l < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    }

    private boolean B0(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return false;
        }
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        if (this.f82570d.d() >= 23) {
            zHasCapability = zHasCapability && networkCapabilities.hasCapability(16);
        }
        if (!zHasCapability) {
            return false;
        }
        for (int i10 : f82566r) {
            if (networkCapabilities.hasTransport(i10)) {
                return true;
            }
        }
        return false;
    }

    static boolean C0(Context context, ILogger iLogger, w0 w0Var, Handler handler, ConnectivityManager.NetworkCallback networkCallback) {
        if (w0Var.d() < 24) {
            iLogger.c(g7.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerZ0 = z0(context, iLogger);
        if (connectivityManagerZ0 == null) {
            return false;
        }
        if (!t.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(g7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            if (handler != null) {
                connectivityManagerZ0.registerDefaultNetworkCallback(networkCallback, handler);
                return true;
            }
            connectivityManagerZ0.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th2) {
            iLogger.a(g7.WARNING, "registerDefaultNetworkCallback failed", th2);
            return false;
        }
    }

    public static void D0(ConnectivityManager.NetworkCallback networkCallback) {
        g1 g1VarD = f82564p.d();
        try {
            f82565q.remove(networkCallback);
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

    private void E0(Runnable runnable) {
        try {
            this.f82569c.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            this.f82569c.getLogger().a(g7.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    static void F0(Context context, ILogger iLogger, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManagerZ0 = z0(context, iLogger);
        if (connectivityManagerZ0 == null) {
            return;
        }
        try {
            connectivityManagerZ0.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th2) {
            iLogger.a(g7.WARNING, "unregisterNetworkCallback failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(boolean z10) {
        g1 g1VarD = this.f82574h.d();
        if (z10) {
            try {
                this.f82572f.clear();
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
        ConnectivityManager.NetworkCallback networkCallback = this.f82575i;
        this.f82575i = null;
        if (networkCallback != null) {
            F0(this.f82568b, this.f82569c.getLogger(), networkCallback);
        }
        this.f82576j = null;
        this.f82577k = null;
        this.f82578l = 0L;
        if (g1VarD != null) {
            g1VarD.close();
        }
        this.f82569c.getLogger().c(g7.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(NetworkCapabilities networkCapabilities) {
        g1 g1VarD = this.f82574h.d();
        try {
            if (networkCapabilities != null) {
                this.f82576j = networkCapabilities;
            } else {
                if (!t.a(this.f82568b, "android.permission.ACCESS_NETWORK_STATE")) {
                    this.f82569c.getLogger().c(g7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f82576j = null;
                    this.f82578l = this.f82571e.getCurrentTimeMillis();
                    if (g1VarD != null) {
                        g1VarD.close();
                        return;
                    }
                    return;
                }
                if (this.f82570d.d() < 23) {
                    this.f82576j = null;
                    this.f82578l = this.f82571e.getCurrentTimeMillis();
                    if (g1VarD != null) {
                        g1VarD.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager connectivityManagerZ0 = z0(this.f82568b, this.f82569c.getLogger());
                if (connectivityManagerZ0 != null) {
                    Network activeNetwork = connectivityManagerZ0.getActiveNetwork();
                    this.f82576j = activeNetwork != null ? connectivityManagerZ0.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f82576j = null;
                }
            }
            this.f82578l = this.f82571e.getCurrentTimeMillis();
            this.f82569c.getLogger().c(g7.DEBUG, "Cache updated - Status: " + t0() + ", Type: " + y0(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f82569c.getLogger().a(g7.WARNING, "Failed to update connection status cache", th2);
                this.f82576j = null;
                this.f82578l = this.f82571e.getCurrentTimeMillis();
            } catch (Throwable th3) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (g1VarD != null) {
            g1VarD.close();
        }
    }

    public static /* synthetic */ void e(g gVar) {
        gVar.G0(true);
        g1 g1VarD = f82564p.d();
        try {
            f82565q.clear();
            if (g1VarD != null) {
                g1VarD.close();
            }
            g1VarD = f82562n.d();
            try {
                f82563o = null;
                if (g1VarD != null) {
                    g1VarD.close();
                }
                AppState.n().q(gVar);
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ void f(g gVar) {
        g1 g1VarD;
        gVar.H0(null);
        n0.a aVarT0 = gVar.t0();
        if (aVarT0 == n0.a.DISCONNECTED) {
            gVar.f82579m.set(false);
            g1VarD = f82564p.d();
            try {
                Iterator it = f82565q.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } finally {
            }
        }
        g1VarD = gVar.f82574h.d();
        try {
            Iterator it2 = gVar.f82572f.iterator();
            while (it2.hasNext()) {
                ((n0.b) it2.next()).f(aVarT0);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            gVar.r0();
        } finally {
        }
    }

    public static boolean n0(Context context, ILogger iLogger, w0 w0Var, ConnectivityManager.NetworkCallback networkCallback) {
        if (w0Var.d() < 24) {
            iLogger.c(g7.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!t.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(g7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        g1 g1VarD = f82564p.d();
        try {
            f82565q.add(networkCallback);
            if (g1VarD == null) {
                return true;
            }
            g1VarD.close();
            return true;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        if (c1.r() && this.f82575i == null) {
            g1 g1VarD = this.f82574h.d();
            try {
                if (this.f82575i != null) {
                    if (g1VarD != null) {
                        g1VarD.close();
                        return;
                    }
                    return;
                }
                a aVar = new a();
                if (C0(this.f82568b, this.f82569c.getLogger(), this.f82570d, this.f82573g, aVar)) {
                    this.f82575i = aVar;
                    this.f82569c.getLogger().c(g7.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.f82569c.getLogger().c(g7.WARNING, "Failed to register network callback", new Object[0]);
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

    private static n0.a s0(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!t.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(g7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return n0.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? n0.a.CONNECTED : n0.a.DISCONNECTED;
            }
            iLogger.c(g7.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return n0.a.DISCONNECTED;
        } catch (Throwable th2) {
            iLogger.a(g7.WARNING, "Could not retrieve Connection Status", th2);
            return n0.a.UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n0.a t0() {
        if (this.f82576j != null) {
            return B0(this.f82576j) ? n0.a.CONNECTED : n0.a.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerZ0 = z0(this.f82568b, this.f82569c.getLogger());
        return connectivityManagerZ0 != null ? s0(this.f82568b, connectivityManagerZ0, this.f82569c.getLogger()) : n0.a.UNKNOWN;
    }

    public static String u0(Context context, ILogger iLogger, w0 w0Var) {
        boolean zHasTransport;
        boolean zHasTransport2;
        ConnectivityManager connectivityManagerZ0 = z0(context, iLogger);
        if (connectivityManagerZ0 == null) {
            return null;
        }
        boolean z10 = false;
        if (!t.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(g7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            zHasTransport = true;
            if (w0Var.d() >= 23) {
                Network activeNetwork = connectivityManagerZ0.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(g7.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerZ0.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(g7.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport2 = networkCapabilities.hasTransport(1);
                zHasTransport = networkCapabilities.hasTransport(0);
                z10 = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerZ0.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(g7.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport2 = false;
                } else if (type != 1) {
                    if (type != 9) {
                        zHasTransport2 = false;
                    } else {
                        zHasTransport2 = false;
                        z10 = true;
                    }
                    zHasTransport = zHasTransport2;
                } else {
                    zHasTransport2 = true;
                    zHasTransport = false;
                }
            }
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Failed to retrieve network info", th2);
        }
        if (z10) {
            return X3.f42021e;
        }
        if (zHasTransport2) {
            return X3.f42018b;
        }
        if (zHasTransport) {
            return X3.f42023g;
        }
        return null;
    }

    public static String x0(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return X3.f42021e;
        }
        if (networkCapabilities.hasTransport(1)) {
            return X3.f42018b;
        }
        if (networkCapabilities.hasTransport(0)) {
            return X3.f42023g;
        }
        return null;
    }

    private String y0() {
        NetworkCapabilities networkCapabilities = this.f82576j;
        return networkCapabilities != null ? x0(networkCapabilities) : u0(this.f82568b, this.f82569c.getLogger(), this.f82570d);
    }

    private static ConnectivityManager z0(Context context, ILogger iLogger) {
        if (f82563o != null) {
            return f82563o;
        }
        g1 g1VarD = f82562n.d();
        try {
            if (f82563o != null) {
                ConnectivityManager connectivityManager = f82563o;
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return connectivityManager;
            }
            f82563o = (ConnectivityManager) context.getSystemService("connectivity");
            if (f82563o == null) {
                iLogger.c(g7.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f82563o;
            if (g1VarD != null) {
                g1VarD.close();
            }
            return connectivityManager2;
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

    @Override // io.sentry.n0
    public n0.a A() {
        if (!A0()) {
            H0(null);
        }
        return t0();
    }

    @Override // io.sentry.n0
    public void N(n0.b bVar) {
        g1 g1VarD = this.f82574h.d();
        try {
            this.f82572f.remove(bVar);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        E0(new Runnable() { // from class: io.sentry.android.core.internal.util.c
            @Override // java.lang.Runnable
            public final void run() {
                g.e(this.f82539b);
            }
        });
    }

    @Override // io.sentry.n0
    public String getConnectionType() {
        if (!A0()) {
            H0(null);
        }
        return y0();
    }

    @Override // io.sentry.android.core.AppState.a
    public void m() {
        if (this.f82575i != null) {
            return;
        }
        E0(new Runnable() { // from class: io.sentry.android.core.internal.util.d
            @Override // java.lang.Runnable
            public final void run() {
                g.f(this.f82541b);
            }
        });
    }

    @Override // io.sentry.n0
    public boolean m0(n0.b bVar) {
        g1 g1VarD = this.f82574h.d();
        try {
            this.f82572f.add(bVar);
            if (g1VarD != null) {
                g1VarD.close();
            }
            r0();
            return this.f82575i != null;
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

    @Override // io.sentry.android.core.AppState.a
    public void n() {
        if (this.f82575i == null) {
            return;
        }
        E0(new Runnable() { // from class: io.sentry.android.core.internal.util.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f82536b.G0(false);
            }
        });
    }

    public g(Context context, v7 v7Var, w0 w0Var, io.sentry.transport.p pVar, Handler handler) {
        this.f82574h = new io.sentry.util.a();
        this.f82578l = 0L;
        this.f82579m = new AtomicBoolean(false);
        this.f82568b = c1.f(context);
        this.f82569c = v7Var;
        this.f82570d = w0Var;
        this.f82571e = pVar;
        this.f82573g = handler;
        this.f82572f = new ArrayList();
        int[] iArr = f82567s;
        iArr[0] = 12;
        if (w0Var.d() >= 23) {
            iArr[1] = 16;
        }
        E0(new Runnable() { // from class: io.sentry.android.core.internal.util.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f82544b.r0();
            }
        });
        AppState.n().f(this);
    }
}
