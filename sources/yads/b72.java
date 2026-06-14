package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b72 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b72 f108921e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f108922a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f108923b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f108924c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108925d = 0;

    public b72(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new a72(this), intentFilter);
    }

    public static int b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type == 9) {
                    return 7;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? 8 : 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return w83.f117341a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f108924c) {
            i10 = this.f108925d;
        }
        return i10;
    }

    public final /* synthetic */ void a(z62 z62Var) {
        z62Var.a(a());
    }

    public final void a(int i10) {
        synchronized (this.f108924c) {
            try {
                if (this.f108925d == i10) {
                    return;
                }
                this.f108925d = i10;
                for (WeakReference weakReference : this.f108923b) {
                    z62 z62Var = (z62) weakReference.get();
                    if (z62Var != null) {
                        z62Var.a(i10);
                    } else {
                        this.f108923b.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(final z62 z62Var) {
        for (WeakReference weakReference : this.f108923b) {
            if (weakReference.get() == null) {
                this.f108923b.remove(weakReference);
            }
        }
        this.f108923b.add(new WeakReference(z62Var));
        this.f108922a.post(new Runnable() { // from class: yads.g3
            @Override // java.lang.Runnable
            public final void run() {
                this.f111040b.a(z62Var);
            }
        });
    }

    public static synchronized b72 a(Context context) {
        try {
            if (f108921e == null) {
                f108921e = new b72(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f108921e;
    }
}
