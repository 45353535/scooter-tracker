package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import com.ironsource.A5;
import com.ironsource.C4462o4;
import com.ironsource.C4573ue;
import com.ironsource.C4645z1;
import com.ironsource.C4649z5;
import com.ironsource.Ee;
import com.ironsource.EnumC4556te;
import com.ironsource.Ib;
import com.ironsource.Ic;
import com.ironsource.Ie;
import com.ironsource.InterfaceC4412l7;
import com.ironsource.InterfaceC4656zc;
import com.ironsource.J1;
import com.ironsource.U9;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class u implements InterfaceC4656zc {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static u f44262z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ie f44263a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private NetworkStateReceiver f44278p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CountDownTimer f44279q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f44282t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Ee f44283u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f44285w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44264b = e.f44302f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4412l7 f44265c = Ib.U().k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f44266d = "appKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f44267e = getClass().getSimpleName();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f44274l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f44276n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<Ic> f44280r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f44281s = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f44287y = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Handler f44275m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44268f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44269g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44270h = 62;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f44271i = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44272j = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AtomicBoolean f44277o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44273k = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f44284v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private U9 f44286x = new U9();

    class a extends f {
        a() {
            super();
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x02a7 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:2:0x0000, B:4:0x0010, B:7:0x0023, B:9:0x002f, B:10:0x003e, B:12:0x0082, B:14:0x0095, B:16:0x00d2, B:17:0x00fb, B:19:0x012b, B:21:0x0131, B:22:0x0158, B:24:0x0183, B:26:0x018d, B:27:0x019a, B:28:0x01ae, B:30:0x01b4, B:31:0x01ce, B:33:0x01ee, B:68:0x02f6, B:34:0x0213, B:36:0x021b, B:37:0x022d, B:39:0x0233, B:40:0x023f, B:42:0x0246, B:43:0x0251, B:45:0x0257, B:46:0x0261, B:48:0x0265, B:50:0x0271, B:52:0x028e, B:53:0x0297, B:55:0x029b, B:67:0x02ec, B:57:0x02a7, B:59:0x02af, B:61:0x02ba, B:62:0x02be, B:63:0x02c8, B:65:0x02ce, B:66:0x02da), top: B:72:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 781
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.u.a.run():void");
        }
    }

    class b implements Runnable {

        class a extends CountDownTimer {
            a(long j10, long j11) {
                super(j10, j11);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                u uVar = u.this;
                if (uVar.f44274l) {
                    return;
                }
                uVar.f44274l = true;
                Iterator it = uVar.f44280r.iterator();
                while (it.hasNext()) {
                    ((Ic) it.next()).h("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                if (j10 <= 45000) {
                    u uVar = u.this;
                    uVar.f44284v = true;
                    Iterator it = uVar.f44280r.iterator();
                    while (it.hasNext()) {
                        ((Ic) it.next()).a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.f44279q = new a(60000L, 15000L).start();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44291a;

        static {
            int[] iArr = new int[d.values().length];
            f44291a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44291a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44291a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f44297a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f44298b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f44299c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f44300d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f44301e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f44302f = 5;
    }

    abstract class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44304b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f44303a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected r.b f44305c = new a();

        class a implements r.b {
            a() {
            }

            @Override // com.ironsource.mediationsdk.r.b
            public void a(String str) {
                f fVar = f.this;
                fVar.f44303a = false;
                fVar.f44304b = str;
            }
        }

        f() {
        }
    }

    private u() {
    }

    public static synchronized u c() {
        try {
            if (f44262z == null) {
                f44262z = new u();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44262z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (Ib.U().g().f()) {
            Ib.U().q().a(new C4649z5(A5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.f44273k;
    }

    public void a(Context context, Ee ee2) {
        this.f44286x.i(ee2.g().h());
        this.f44286x.c(ee2.g().d());
        C4645z1 c4645z1B = ee2.c().b();
        this.f44286x.a(c4645z1B.a());
        this.f44286x.d(c4645z1B.c().b());
        this.f44286x.b(c4645z1B.k().b());
        this.f44286x.a(Boolean.valueOf(IronSourceUtils.c(context)));
        J1 j1F = ee2.c().b().f();
        this.f44286x.b(j1F.b());
        Ib.O().o().a(j1F.c());
    }

    public int b() {
        return this.f44264b;
    }

    public synchronized boolean d() {
        return this.f44284v;
    }

    void f() {
        b(d.INIT_FAILED);
    }

    public synchronized void g() {
        int iA = a(a());
        this.f44264b = iA;
        this.f44286x.c(iA);
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        C4573ue.f45559a.a(EnumC4556te.values()[dVar.ordinal()]);
    }

    private static int a(d dVar) {
        int i10 = c.f44291a[dVar.ordinal()];
        if (i10 == 1) {
            return e.f44300d;
        }
        if (i10 == 2) {
            return e.f44301e;
        }
        if (i10 != 3) {
            return e.f44297a;
        }
        return e.f44298b;
    }

    public synchronized void a(Context context, String str, String str2, IronSource.a... aVarArr) {
        try {
            try {
                AtomicBoolean atomicBoolean = this.f44277o;
                if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                    b(d.INIT_IN_PROGRESS);
                    this.f44281s = str2;
                    this.f44282t = str;
                    if (IronSourceUtils.g(context)) {
                        this.f44275m.post(this.f44287y);
                    } else {
                        this.f44276n = true;
                        if (this.f44278p == null) {
                            this.f44278p = new NetworkStateReceiver(context, this);
                        }
                        context.registerReceiver(this.f44278p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                    }
                } else {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f44267e + ": Multiple calls to init are not allowed", 2);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.ironsource.InterfaceC4656zc
    public void a(boolean z10) {
        if (this.f44276n && z10) {
            CountDownTimer countDownTimer = this.f44279q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f44276n = false;
            this.f44273k = true;
            Ib.U().q().a(new C4649z5(A5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.b(false)));
            this.f44275m.post(this.f44287y);
        }
    }

    public synchronized d a() {
        return d.values()[C4573ue.f45559a.a().ordinal()];
    }
}
