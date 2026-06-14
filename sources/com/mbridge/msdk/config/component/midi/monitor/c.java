package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f47143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f47144c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f47148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HandlerThread f47149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f47150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f47151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f47152k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f47154m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47145d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f47146e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f47147f = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47153l = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f47152k != null) {
                c.this.f47152k.a("播放超时：从创建到第一帧播放超过 " + c.this.f47143b + "ms");
            }
            c.this.g();
        }
    }

    public c(int i10, String str) {
        this.f47142a = 3;
        this.f47154m = str;
        this.f47143b = i10 > 0 ? i10 : 3000L;
        this.f47142a = i10 / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f47149h = handlerThread;
            handlerThread.start();
            this.f47148g = new Handler(this.f47149h.getLooper());
            d();
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f47148g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    private void d() {
        this.f47150i = new a();
        this.f47151j = new b();
    }

    public void e() {
        Runnable runnable;
        if (!this.f47145d || this.f47147f) {
            return;
        }
        this.f47147f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f47144c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f47148g;
        if (handler != null && (runnable = this.f47151j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f47143b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        g();
    }

    public void f() {
        Runnable runnable;
        if (this.f47148g == null) {
            g();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f47152k;
            if (aVar != null) {
                aVar.a(" playerHandler 异常 ");
            }
        }
        if (this.f47145d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f47145d = true;
        this.f47146e = false;
        this.f47147f = false;
        this.f47153l = 0;
        this.f47144c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f47143b + "ms");
        Handler handler = this.f47148g;
        if (handler != null && (runnable = this.f47151j) != null) {
            handler.postDelayed(runnable, this.f47143b);
        }
        a();
    }

    public void g() {
        if (this.f47145d) {
            this.f47145d = false;
            Handler handler = this.f47148g;
            if (handler != null) {
                Runnable runnable = this.f47150i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f47151j;
                if (runnable2 != null) {
                    this.f47148g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f47145d || this.f47146e || TextUtils.isEmpty(this.f47154m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                this.f47153l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.f47153l);
                if (this.f47153l >= this.f47142a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f47148g;
                if (handler == null || (runnable2 = this.f47150i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f47146e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strC);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f47152k;
            if (aVar != null) {
                aVar.b(strC);
            }
            Handler handler2 = this.f47148g;
            if (handler2 == null || (runnable3 = this.f47150i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "检查本地地址异常：" + e10.getMessage());
            Handler handler3 = this.f47148g;
            if (handler3 == null || (runnable = this.f47150i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    private String c() {
        try {
            if (this.f47154m.startsWith(AdPayload.FILE_SCHEME) || this.f47154m.startsWith("/")) {
                File file = new File(this.f47154m.replace(AdPayload.FILE_SCHEME, ""));
                if (file.exists() && file.isFile()) {
                    return this.f47154m;
                }
            }
            if (this.f47154m.startsWith("http")) {
                com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(this.f47154m);
                String strA = bVarE != null ? bVarE.a() : "";
                File file2 = new File(strA.replace(AdPayload.FILE_SCHEME, ""));
                if (file2.exists() && file2.isFile()) {
                    return strA;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "获取本地视频地址异常：" + e10.getMessage());
            return null;
        }
    }

    public void b() {
        try {
            g();
            Handler handler = this.f47148g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f47148g = null;
            }
            HandlerThread handlerThread = this.f47149h;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f47149h.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f47149h = null;
                }
                this.f47150i = null;
                this.f47151j = null;
                this.f47152k = null;
                this.f47145d = false;
                this.f47146e = false;
                this.f47147f = false;
                this.f47153l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f47149h = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorPlayerTimeout", "销毁MonitorPlayerTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.f47152k = aVar;
    }
}
