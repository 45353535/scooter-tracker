package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f47206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47207b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f47208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HandlerThread f47209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f47210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f47211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f47212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.b f47213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.b f47214i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f47211f != null && !b.this.f47212g.h()) {
                b.this.a();
                b.this.f47211f.d(b.this.f47212g);
            }
            b.this.e();
        }
    }

    public b(long j10) {
        if (this.f47206a < 0) {
            this.f47206a = 30L;
        } else {
            this.f47206a = j10;
        }
    }

    public void d() {
        Runnable runnable;
        if (this.f47207b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f47207b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.f47209d = handlerThread;
            handlerThread.start();
            this.f47208c = new Handler(this.f47209d.getLooper());
            c();
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f47208c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.f47208c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f47211f;
            if (aVar != null) {
                aVar.d(this.f47212g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.f47206a + "ms");
        Handler handler = this.f47208c;
        if (handler == null || (runnable = this.f47210e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.f47206a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.f47207b) {
            this.f47207b = false;
            Handler handler = this.f47208c;
            if (handler != null && (runnable = this.f47210e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    private void c() {
        this.f47210e = new a();
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.f47213h = bVar;
    }

    public void b() {
        try {
            e();
            Handler handler = this.f47208c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f47208c = null;
            }
            HandlerThread handlerThread = this.f47209d;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f47209d.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f47209d = null;
                }
                this.f47210e = null;
                this.f47207b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f47209d = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorNetworkTimeout", "销毁MonitorNetworkTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.f47214i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.f47213h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.f47213h.a();
            }
            if (this.f47214i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.f47214i.a();
            }
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "取消任务时发生异常：" + e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.f47212g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f47211f = aVar;
    }
}
