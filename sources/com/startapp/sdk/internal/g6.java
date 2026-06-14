package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class g6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f64544f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4 f64546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f64547c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f64548d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f6 f64549e;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            arrayList.add(5);
        }
        if (i10 >= 27) {
            arrayList.add(6);
        }
        if (i10 >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        f64544f = iArr;
    }

    public g6(Context context, l4 l4Var) {
        this.f64545a = context;
        this.f64546b = l4Var;
    }

    public final void a() {
        if (this.f64548d.getAndSet(true)) {
            return;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f64545a.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.addDefaultNetworkActiveListener(new e6(this));
                this.f64546b.getClass();
                ConnectivityHelperMetadata connectivityHelperMetadataQ = MetaData.E().q();
                f6 n0Var = null;
                ConnectivityHelperMetadata.Transport transportA = connectivityHelperMetadataQ != null ? connectivityHelperMetadataQ.a() : null;
                if (transportA != null) {
                    if (i10 >= 24 && vi.a(i10, transportA.a())) {
                        n0Var = new i(this.f64545a, connectivityManager);
                    } else if (vi.a(i10, transportA.b())) {
                        n0Var = new n0(this.f64545a, connectivityManager);
                    }
                    if (n0Var != null) {
                        n0Var.b();
                        this.f64549e = n0Var;
                    }
                }
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    public final boolean b() {
        if (q0.a(this.f64545a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f64545a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnected();
                    }
                    return false;
                }
            } catch (Throwable th2) {
                if (!vi.a(th2, RemoteException.class)) {
                    g9.a(th2);
                }
            }
        }
        return true;
    }

    public final void a(n9 n9Var) {
        synchronized (this.f64547c) {
            try {
                if (!this.f64547c.contains(n9Var)) {
                    this.f64547c.add(n9Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 : f64544f) {
            try {
                if (networkCapabilities.hasTransport(i11)) {
                    i10 |= 1 << i11;
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }
}
