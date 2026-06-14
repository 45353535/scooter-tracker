package c9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.View;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final WeakHashMap f6545a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BroadcastReceiver f6546b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final IntentFilter f6547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f6548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f6549e;

    public interface a {
        void a(boolean z10);
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (d.class) {
                boolean unused = d.f6549e = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap weakHashMap = d.f6545a;
            synchronized (weakHashMap) {
                try {
                    Iterator it = weakHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a(d.f6549e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f6547c = intentFilter;
        f6548d = false;
        f6549e = false;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    private static synchronized void a(Context context) {
        if (!f6548d) {
            synchronized (d.class) {
                try {
                    if (!f6548d) {
                        f6549e = ((PowerManager) context.getSystemService("power")).isScreenOn();
                        context.getApplicationContext().registerReceiver(f6546b, f6547c);
                        f6548d = true;
                    }
                } finally {
                }
            }
        }
    }

    public static void d(View view, a aVar) {
        a(view.getContext());
        WeakHashMap weakHashMap = f6545a;
        synchronized (weakHashMap) {
            weakHashMap.put(view, aVar);
        }
    }

    public static boolean e(Context context) {
        a(context);
        return f6549e;
    }

    public static void f(View view) {
        if (f6548d) {
            WeakHashMap weakHashMap = f6545a;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }
}
