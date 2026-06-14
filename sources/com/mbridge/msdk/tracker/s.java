package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f52012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f52016e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f52020i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f52017f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f52018g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f52019h = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f52021j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f52022k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f52023l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f52024m = false;

    private static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f52027a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.f52027a = sVar;
        }

        private void a(String str) {
            Log.d("TrackManager", this.f52027a.f52016e.v() + " " + str + this.f52027a.f52018g.addAndGet(0) + " 数据库记录数：" + this.f52027a.f52012a.b());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    Log.e("TrackManager", this.f52027a.f52016e.v() + " removeMessages failed ", e10);
                }
            }
            if (this.f52027a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f52027a.f52017f.get(), this.f52027a.f52022k, this.f52027a.f52014c));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    Log.e("TrackManager", this.f52027a.f52016e.v() + " sendMessageDelayed failed ", e11);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 == 2 || i10 == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f52027a.a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            if (i10 != 6) {
                if (i10 != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.f51797a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.f52027a.k();
                b();
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.f51797a && !y.b(eVar)) {
                a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.g()));
            }
            if (y.a(eVar) || this.f52027a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private synchronized void a() {
            try {
                this.f52027a.h();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f51797a) {
                    Log.e("TrackManager", this.f52027a.f52016e.v() + " report failed ", e10);
                }
            }
        }
    }

    public s(k kVar) {
        this.f52012a = kVar.d();
        this.f52013b = kVar.i();
        this.f52014c = kVar.l();
        this.f52015d = kVar.j();
        this.f52016e = kVar;
    }

    private void l() {
        this.f52012a.c();
    }

    public void k() {
        synchronized (this.f52019h) {
            try {
                if (!this.f52023l) {
                    this.f52023l = true;
                    l();
                }
                if (!this.f52024m) {
                    this.f52024m = true;
                    this.f52018g.addAndGet(this.f52012a.b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private List<i> c() {
        return this.f52012a.a(this.f52013b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f52017f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.d("TrackManager", this.f52016e.v() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        a(listC);
        int size = listC.size();
        this.f52018g.addAndGet(-size);
        boolean zA = false;
        if (com.mbridge.msdk.tracker.a.f51797a) {
            Log.d("TrackManager", this.f52016e.v() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f52018g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f52012a.b());
        }
        try {
            zA = this.f52016e.a();
        } catch (IllegalStateException e10) {
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", this.f52016e.v() + " report environment check failed ", e10);
            }
        }
        if (!zA) {
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", this.f52016e.v() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o oVarM = this.f52016e.m();
        oVarM.a(new a(this.f52020i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f52016e.f().a(this.f52016e.u(), listC, this.f52016e.o());
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", this.f52016e.v() + " report decorate request params failed ", e11);
            }
        }
        oVarM.b(new t(listC), map, y.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f52017f.set(0);
    }

    public void b() {
        this.f52020i.removeMessages(1);
        Handler handler = this.f52020i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.f52018g.incrementAndGet();
    }

    protected boolean f() {
        return this.f52018g.addAndGet(0) >= this.f52013b;
    }

    boolean g() {
        return this.f52021j;
    }

    public void j() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f52020i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f52020i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f52014c);
        this.f52021j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f52012a.c(list);
    }

    public void a(e eVar) {
        if (this.f52020i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f52017f.get(), this.f52022k, this.f52014c);
        if (jA > this.f52014c) {
            Handler handler = this.f52020i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.f52020i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    private static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f52025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f52026b;

        public a(Handler handler, s sVar) {
            this.f52025a = handler;
            this.f52026b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.f52026b.b(tVar.a());
            this.f52026b.i();
            this.f52026b.f52022k = 0L;
            if (this.f52026b.f()) {
                Handler handler = this.f52025a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.d("TrackManager", this.f52026b.f52016e.v() + " report success " + tVar.a().size() + " 剩余事件数：" + this.f52026b.f52018g.addAndGet(0) + " 个，数据库记录数：" + this.f52026b.f52012a.b() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i10, String str) {
            this.f52026b.a(tVar.a(), str);
            this.f52026b.f52022k = System.currentTimeMillis();
            int iD = this.f52026b.d();
            if (iD <= 10) {
                this.f52025a.removeMessages(3);
                Handler handler = this.f52025a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), ((long) iD) * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.d("TrackManager", this.f52026b.f52016e.v() + " report failed " + tVar.a().size() + " 剩余事件数：" + this.f52026b.f52018g.addAndGet(0) + " 个，数据库记录数：" + this.f52026b.f52012a.b() + " 个 连续失败次数： " + iD);
            }
        }
    }

    private void a(List<i> list) {
        this.f52012a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f51797a) {
            return;
        }
        int iA = this.f52012a.a();
        if (com.mbridge.msdk.tracker.a.f51797a) {
            Log.d("TrackManager", this.f52016e.v() + " 删除无效数据的数量 = " + iA + " 当前剩余事件数 = " + this.f52018g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f52012a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i10 = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z10 = !iVar.l() && iVar.h() >= this.f52015d;
                boolean z11 = !iVar.m() && iVar.g() < System.currentTimeMillis();
                if (!z10 && !z11) {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i10++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.f52012a.a(list);
        this.f52018g.addAndGet(i10);
    }
}
