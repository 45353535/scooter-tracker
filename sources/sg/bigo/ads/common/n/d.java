package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<sg.bigo.ads.common.n.a> f102563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HandlerThread f102564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f102565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HandlerThread f102566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f102567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static HandlerThread f102568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f102569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static b f102570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static b f102571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final WeakHashMap<Object, a> f102572j = new WeakHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f102573k = false;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f102587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Integer f102588b;

        public a(Runnable runnable, Integer num) {
            this.f102587a = runnable;
            this.f102588b = num;
        }
    }

    static {
        t.a();
    }

    public static void a(int i10, Runnable runnable) {
        b(i10, runnable, 0L);
    }

    private static synchronized void b(int i10, final Runnable runnable, long j10) {
        final b bVar;
        if (runnable == null) {
            return;
        }
        try {
            if (f102570h == null) {
                j();
            }
            if (i10 == 0) {
                if (f102564b == null) {
                    g();
                }
                bVar = f102565c;
            } else if (i10 == 1) {
                if (f102566d == null) {
                    h();
                }
                bVar = f102567e;
            } else if (i10 != 3) {
                bVar = f102570h;
            } else {
                if (f102568f == null) {
                    i();
                }
                bVar = f102569g;
            }
            if (bVar == null) {
                return;
            }
            final Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = f102570h.getLooper();
            }
            final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.common.n.d.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Runnable f102575b = null;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f102576c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable3 = d.f102571i != null ? new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.f102570h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    sg.bigo.ads.common.t.a.a(0, "ThreadManager", "这里使用了ThreadManager.post函数运行了一个超过30s的任务");
                                }
                            });
                        }
                    } : null;
                    if (d.f102571i != null) {
                        d.f102571i.postDelayed(runnable3, 30000L);
                    }
                    synchronized (d.f102572j) {
                        d.f102572j.remove(runnable);
                    }
                    if (d.f102573k) {
                        runnable.run();
                    } else {
                        try {
                            runnable.run();
                        } catch (Throwable th2) {
                            sg.bigo.ads.common.t.a.a(2, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th2));
                            List<sg.bigo.ads.common.n.a> list = d.f102563a;
                            if (list != null) {
                                Iterator<sg.bigo.ads.common.n.a> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next().a(th2);
                                }
                            }
                        }
                    }
                    if (d.f102571i != null) {
                        d.f102571i.removeCallbacks(runnable3);
                    }
                    if (this.f102575b != null) {
                        if (this.f102576c || looperMyLooper == d.f102570h.getLooper()) {
                            d.f102570h.post(this.f102575b);
                        } else {
                            new Handler(looperMyLooper).post(this.f102575b);
                        }
                    }
                }
            };
            Runnable runnable3 = new Runnable() { // from class: sg.bigo.ads.common.n.d.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Runnable f102580a = null;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f102581b = false;

                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f102580a == null) {
                        runnable2.run();
                    } else if (this.f102581b || looperMyLooper == d.f102570h.getLooper()) {
                        d.f102570h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2.this.f102580a.run();
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                bVar.post(runnable2);
                            }
                        });
                    } else {
                        new Handler(looperMyLooper).post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass2.this.f102580a.run();
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                bVar.post(runnable2);
                            }
                        });
                    }
                }
            };
            WeakHashMap<Object, a> weakHashMap = f102572j;
            synchronized (weakHashMap) {
                weakHashMap.put(runnable, new a(runnable3, Integer.valueOf(i10)));
            }
            bVar.postDelayed(runnable3, j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void g() {
        if (f102564b == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
            f102564b = handlerThread;
            handlerThread.start();
            f102565c = new b("BGAd-Background", f102564b.getLooper());
        }
    }

    private static synchronized void h() {
        if (f102566d == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
            f102566d = handlerThread;
            handlerThread.start();
            f102567e = new b("BGAd-Work", f102566d.getLooper());
        }
    }

    private static synchronized void i() {
        if (f102568f == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
            f102568f = handlerThread;
            handlerThread.start();
            f102569g = new b("BGAd-Normal", f102568f.getLooper());
        }
    }

    private static synchronized void j() {
        if (f102570h == null) {
            f102570h = new b("BGAd-Background.Main + 38", Looper.getMainLooper());
        }
    }

    public static void a(int i10, Runnable runnable, long j10) {
        b(i10, runnable, j10);
    }

    public static void b(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            b(2, runnable, 0L);
        }
    }

    public static synchronized void a(Runnable runnable) {
        b bVar;
        if (runnable == null) {
            return;
        }
        try {
            WeakHashMap<Object, a> weakHashMap = f102572j;
            a aVar = weakHashMap.get(runnable);
            if (aVar == null) {
                return;
            }
            Runnable runnable2 = aVar.f102587a;
            if (runnable2 != null) {
                int iIntValue = aVar.f102588b.intValue();
                if (iIntValue == 0) {
                    bVar = f102565c;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                } else if (iIntValue == 1) {
                    bVar = f102567e;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                } else if (iIntValue == 2) {
                    bVar = f102570h;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                } else if (iIntValue == 3) {
                    bVar = f102569g;
                    if (bVar != null) {
                        bVar.removeCallbacks(runnable2);
                    }
                } else if (iIntValue == 1024) {
                    runnable2.run();
                }
                synchronized (weakHashMap) {
                    weakHashMap.remove(runnable);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static synchronized void a(@NonNull sg.bigo.ads.common.n.a aVar) {
        try {
            if (f102563a == null) {
                f102563a = new ArrayList();
            }
            f102563a.add(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean a() {
        return f102566d == Thread.currentThread();
    }
}
