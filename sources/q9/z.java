package q9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import q9.z;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static z f98890f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f98891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f98892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f98893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f98894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f98895e;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final z f98896a;

            public a(z zVar) {
                this.f98896a = zVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f98896a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, z zVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) q9.a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(zVar);
                telephonyManager.registerTelephonyCallback(zVar.f98891a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                zVar.m(5);
            }
        }
    }

    public interface c {
        void onNetworkTypeChanged(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f98897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f98898b;

        public d(c cVar, Executor executor) {
            this.f98897a = new WeakReference(cVar);
            this.f98898b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = (c) dVar.f98897a.get();
            if (cVar != null) {
                cVar.onNetworkTypeChanged(z.this.g());
            }
        }

        public void b() {
            this.f98898b.execute(new Runnable() { // from class: q9.a0
                @Override // java.lang.Runnable
                public final void run() {
                    z.d.a(this.f98759b);
                }
            });
        }

        public boolean c() {
            return this.f98897a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            z.this.f98891a.execute(new Runnable() { // from class: q9.b0
                @Override // java.lang.Runnable
                public final void run() {
                    z.this.i(context);
                }
            });
        }
    }

    private z(final Context context) {
        Executor executorA = q9.b.a();
        this.f98891a = executorA;
        this.f98892b = new CopyOnWriteArrayList();
        this.f98893c = new Object();
        this.f98894d = 0;
        executorA.execute(new Runnable() { // from class: q9.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f98888b.j(context);
            }
        });
    }

    public static synchronized z e(Context context) {
        try {
            if (f98890f == null) {
                f98890f = new z(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f98890f;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
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
                return o0.f98837a >= 29 ? 9 : 0;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (o0.f98837a < 31 || iH != 5) {
            m(iH);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void l() {
        for (d dVar : this.f98892b) {
            if (dVar.c()) {
                this.f98892b.remove(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i10) {
        l();
        synchronized (this.f98893c) {
            try {
                if (this.f98895e && this.f98894d == i10) {
                    return;
                }
                this.f98895e = true;
                this.f98894d = i10;
                Iterator it = this.f98892b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int g() {
        int i10;
        synchronized (this.f98893c) {
            i10 = this.f98894d;
        }
        return i10;
    }

    public void k(c cVar, Executor executor) {
        boolean z10;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f98893c) {
            this.f98892b.add(dVar);
            z10 = this.f98895e;
        }
        if (z10) {
            dVar.b();
        }
    }
}
