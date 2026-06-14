package com.fyber.inneractive.sdk.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h0 f21334g = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f21335a = new PriorityBlockingQueue(100, new k0());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f21336b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f21337c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f21338d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f21334g);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f21339e = new i0(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1 f21340f = new j1();

    public final void a(t0 t0Var) {
        p0 p0Var;
        if (!this.f21335a.offer(t0Var)) {
            IAlog.a("Request queue is full! current request is dropped! %s", t0Var.r());
            return;
        }
        i1 i1Var = i1.QUEUED;
        t0Var.f21379f = i1Var;
        if (i1Var != i1.QUEUED_FOR_RETRY || (p0Var = t0Var.f21377d) == null) {
            return;
        }
        p0Var.a("sdkRequestEndedButWillBeRetried");
    }

    public final void b(t0 t0Var) {
        j1 j1Var = this.f21340f;
        j1Var.getClass();
        String str = t0Var.f21380g;
        IAlog.a("%s : NetworkRequestWatchdog : finalize request: %s", IAlog.a(j1Var), str);
        n1 n1Var = (n1) j1Var.f21326a.get(str);
        if (n1Var != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(n1Var.f21351d);
        }
        j1Var.f21326a.remove(str);
    }

    public final boolean c(t0 t0Var) {
        if (!t0Var.u()) {
            return false;
        }
        t0Var.f21379f = i1.QUEUED_FOR_RETRY;
        p0 p0Var = t0Var.f21377d;
        if (p0Var != null) {
            p0Var.a("sdkRequestEndedButWillBeRetried");
        }
        long jG = t0Var.g();
        IAlog.e("retryNetworkRequest queue up in main thread - %s with delay of %d", t0Var.getClass().getName(), Long.valueOf(jG));
        this.f21337c.postDelayed(new j0(this, t0Var), jG);
        return true;
    }

    public static void a(t0 t0Var, l lVar, o0 o0Var) {
        try {
            if (t0Var.f21374a || t0Var.h() == null || o0Var == null || lVar == null || lVar.f21328a != 200) {
                return;
            }
            t0Var.a(o0Var, t0Var.h(), lVar.f21332e);
        } catch (Exception e10) {
            IAlog.a("Failed cache network response data for url: %s msg: %s", t0Var.r(), e10.getMessage());
        }
    }

    public static void a(t0 t0Var, o0 o0Var) {
        try {
            if (t0Var.f21374a || o0Var == null) {
                return;
            }
            t0Var.a(o0Var.f21352a, (Exception) null, false);
        } catch (Exception e10) {
            IAlog.a("failed notifying the listener request complete for url: %s msg: %s", t0Var.r(), e10.getMessage());
            if (t0Var.f21374a) {
                return;
            }
            t0Var.a((Object) null, e10, false);
        }
    }

    public final o0 a(t0 t0Var, l lVar) throws Exception {
        if (lVar != null) {
            try {
                if (!t0Var.f21374a) {
                    int i10 = lVar.f21328a;
                    if (i10 != 200 && (i10 < 300 || i10 >= 304)) {
                        if (i10 == 304) {
                            t0Var.a((Object) null, (Exception) new g(), false);
                            return null;
                        }
                        t0Var.a((Object) null, (Exception) new k1(lVar.f21329b, lVar.f21328a), false);
                        return null;
                    }
                    return t0Var.a(lVar, lVar.f21331d, i10);
                }
            } catch (t1 e10) {
                IAlog.a("failed parsing network request but will retry url: %s msg: %s", t0Var.r(), e10.getMessage());
                if (c(t0Var)) {
                    throw e10;
                }
                throw new s1(e10);
            } catch (Exception e11) {
                IAlog.a("failed parsing network request url: %s msg: %s", t0Var.r(), e11.getMessage());
                throw e11;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.network.l a(com.fyber.inneractive.sdk.network.t0 r7, com.fyber.inneractive.sdk.network.a r8) throws java.lang.Exception {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.String r3 = "failed sending network request for url: %s msg: %s"
            boolean r4 = r7.f21374a     // Catch: java.lang.Exception -> Le java.net.SocketTimeoutException -> L10 com.fyber.inneractive.sdk.network.b -> L12 java.net.UnknownHostException -> L14 com.fyber.inneractive.sdk.network.t1 -> L16
            if (r4 != 0) goto L22
            if (r8 == 0) goto L18
            java.lang.String r8 = r8.f21281a     // Catch: java.lang.Exception -> Le java.net.SocketTimeoutException -> L10 com.fyber.inneractive.sdk.network.b -> L12 java.net.UnknownHostException -> L14 com.fyber.inneractive.sdk.network.t1 -> L16
            goto L1a
        Le:
            r8 = move-exception
            goto L24
        L10:
            r8 = move-exception
            goto L36
        L12:
            r8 = move-exception
            goto L36
        L14:
            r8 = move-exception
            goto L36
        L16:
            r8 = move-exception
            goto L59
        L18:
            java.lang.String r8 = ""
        L1a:
            a()     // Catch: java.lang.Exception -> Le java.net.SocketTimeoutException -> L10 com.fyber.inneractive.sdk.network.b -> L12 java.net.UnknownHostException -> L14 com.fyber.inneractive.sdk.network.t1 -> L16
            com.fyber.inneractive.sdk.network.l r7 = r7.a(r8)     // Catch: java.lang.Exception -> Le java.net.SocketTimeoutException -> L10 com.fyber.inneractive.sdk.network.b -> L12 java.net.UnknownHostException -> L14 com.fyber.inneractive.sdk.network.t1 -> L16
            return r7
        L22:
            r7 = 0
            return r7
        L24:
            java.lang.String r7 = r7.r()
            java.lang.String r4 = r8.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r4
            com.fyber.inneractive.sdk.util.IAlog.a(r3, r2)
            throw r8
        L36:
            java.lang.String r4 = r7.r()
            java.lang.String r5 = r8.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            r2[r0] = r5
            com.fyber.inneractive.sdk.util.IAlog.a(r3, r2)
            boolean r7 = r6.c(r7)
            if (r7 == 0) goto L53
            com.fyber.inneractive.sdk.network.t1 r7 = new com.fyber.inneractive.sdk.network.t1
            r7.<init>(r8)
            throw r7
        L53:
            com.fyber.inneractive.sdk.network.s1 r7 = new com.fyber.inneractive.sdk.network.s1
            r7.<init>(r8)
            throw r7
        L59:
            java.lang.String r3 = r7.r()
            java.lang.String r4 = r8.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r3
            r2[r0] = r4
            java.lang.String r0 = "failed sending network request but will retry url: %s msg: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r2)
            boolean r7 = r6.c(r7)
            if (r7 == 0) goto L73
            throw r8
        L73:
            com.fyber.inneractive.sdk.network.s1 r7 = new com.fyber.inneractive.sdk.network.s1
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.l0.a(com.fyber.inneractive.sdk.network.t0, com.fyber.inneractive.sdk.network.a):com.fyber.inneractive.sdk.network.l");
    }

    public static void a() throws b {
        NetworkInfo activeNetworkInfo;
        Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.k) IAConfigManager.O.M.a(com.fyber.inneractive.sdk.config.global.features.k.class)).c("should_use_is_network_connected");
        boolean z10 = false;
        if (boolC != null ? boolC.booleanValue() : false) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) com.fyber.inneractive.sdk.util.o.f23888a.getSystemService("connectivity");
                activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            } catch (Throwable unused) {
                IAlog.b("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            }
            if (com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    z10 = true;
                }
            }
            if (!z10) {
                throw new b("No network connection");
            }
        }
    }
}
