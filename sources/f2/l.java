package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.View;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f71923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f71924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final WeakHashMap f71925c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BroadcastReceiver f71926d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final IntentFilter f71927e;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (l.class) {
                boolean unused = l.f71924b = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap weakHashMap = l.f71925c;
            synchronized (weakHashMap) {
                try {
                    Iterator it = weakHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).a(l.f71924b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public interface b {
        void a(boolean z10);
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f71927e = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    private static synchronized void a(Context context) {
        if (!f71923a) {
            synchronized (l.class) {
                try {
                    if (!f71923a) {
                        f71924b = ((PowerManager) context.getSystemService("power")).isScreenOn();
                        context.getApplicationContext().registerReceiver(f71926d, f71927e);
                        f71923a = true;
                    }
                } finally {
                }
            }
        }
    }

    public static void b(View view) {
        if (f71923a) {
            WeakHashMap weakHashMap = f71925c;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }

    public static void c(View view, b bVar) {
        a(view.getContext());
        WeakHashMap weakHashMap = f71925c;
        synchronized (weakHashMap) {
            weakHashMap.put(view, bVar);
        }
    }

    public static boolean f(Context context) {
        a(context);
        return f71924b;
    }
}
