package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4217a extends Thread {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f42276l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final InterfaceC4235b f42277m = new C0443a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final InterfaceC4501q9 f42278n = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42282d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4235b f42279a = f42277m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4501q9 f42280b = f42278n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f42281c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f42283e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42284f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42285g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f42286h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42287i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42288j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f42289k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0443a implements InterfaceC4235b {
        C0443a() {
        }

        @Override // com.ironsource.InterfaceC4235b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4235b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$b */
    class b implements InterfaceC4501q9 {
        b() {
        }

        @Override // com.ironsource.InterfaceC4501q9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4217a c4217a = C4217a.this;
            c4217a.f42286h = (c4217a.f42286h + 1) % Integer.MAX_VALUE;
        }
    }

    public C4217a(int i10) {
        this.f42282d = i10;
    }

    public C4217a c() {
        this.f42283e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f42288j < this.f42287i) {
            int i11 = this.f42286h;
            this.f42281c.post(this.f42289k);
            try {
                Thread.sleep(this.f42282d);
                if (this.f42286h != i11) {
                    this.f42288j = 0;
                } else if (this.f42285g || !Debug.isDebuggerConnected()) {
                    this.f42288j++;
                    this.f42279a.a();
                    String str = C4462o4.f44540l;
                    if (str != null && !str.trim().isEmpty()) {
                        new M5(C4462o4.f44540l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.f42286h != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f42286h;
                }
            } catch (InterruptedException e10) {
                this.f42280b.a(e10);
                return;
            }
        }
        if (this.f42288j >= this.f42287i) {
            this.f42279a.b();
        }
    }

    public void a(int i10) {
        this.f42287i = i10;
    }

    public int b() {
        return this.f42287i;
    }

    public int a() {
        return this.f42288j;
    }

    public C4217a b(boolean z10) {
        this.f42284f = z10;
        return this;
    }

    public C4217a a(InterfaceC4235b interfaceC4235b) {
        if (interfaceC4235b == null) {
            this.f42279a = f42277m;
            return this;
        }
        this.f42279a = interfaceC4235b;
        return this;
    }

    public C4217a a(InterfaceC4501q9 interfaceC4501q9) {
        if (interfaceC4501q9 == null) {
            this.f42280b = f42278n;
            return this;
        }
        this.f42280b = interfaceC4501q9;
        return this;
    }

    public C4217a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f42283e = str;
        return this;
    }

    public C4217a a(boolean z10) {
        this.f42285g = z10;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }
}
