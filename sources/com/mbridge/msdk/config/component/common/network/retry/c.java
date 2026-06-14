package com.mbridge.msdk.config.component.common.network.retry;

import com.mbridge.msdk.foundation.tools.q0;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledFuture<?> f46825d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f46827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.nori.model.a f46828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.network.a f46829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f46830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f46831j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f46822a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f46823b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f46824c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f46826e = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f46832k = new AtomicInteger(0);

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f46833a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Retry-InstanceScheduler-" + System.currentTimeMillis() + TokenBuilder.TOKEN_DELIMITER + this.f46833a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    class b implements com.mbridge.msdk.config.component.common.network.retry.a {
        b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$c, reason: collision with other inner class name */
    class C0496c implements com.mbridge.msdk.config.component.common.network.retry.b {
        C0496c() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    class d implements com.mbridge.msdk.config.component.common.network.retry.a {
        d() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    class e implements com.mbridge.msdk.config.component.common.network.retry.b {
        e() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    private static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final f f46839b = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f46840a = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(), new ThreadPoolExecutor.DiscardOldestPolicy());

        class a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AtomicInteger f46841a = new AtomicInteger(1);

            a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Retry-NetworkThread-" + this.f46841a.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        }

        private f() {
        }

        public static f a() {
            return f46839b;
        }

        public ThreadPoolExecutor b() {
            return this.f46840a;
        }
    }

    public c(String str, com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.a aVar2, com.mbridge.msdk.config.component.common.network.result.a aVar3) {
        this.f46827f = str;
        this.f46828g = aVar;
        this.f46829h = aVar2;
        this.f46830i = aVar3;
        this.f46831j = aVar3.a();
        b();
    }

    private void d() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar;
        try {
            try {
                this.f46823b = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f46828g, this.f46830i, this.f46829h);
                h();
                this.f46823b.a(this.f46827f);
                aVar = this.f46823b;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f46830i.c(0);
                this.f46830i.b(0);
                this.f46830i.a(e10.getMessage());
                g();
                aVar = this.f46823b;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th2) {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f46823b;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f46824c) {
            q0.c("RequestRetry", "重试任务已被取消，停止执行");
            return;
        }
        String strI = this.f46828g.i();
        strI.getClass();
        if (strI.equals("TCP")) {
            f();
        } else if (strI.equals("HTTP")) {
            d();
        }
    }

    private void f() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar;
        try {
            try {
                this.f46822a = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f46828g, this.f46830i, this.f46829h);
                i();
                this.f46822a.a(this.f46827f);
                aVar = this.f46822a;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f46830i.c(0);
                this.f46830i.b(0);
                this.f46830i.a(e10.getMessage());
                g();
                aVar = this.f46822a;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th2) {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar2 = this.f46822a;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f46824c) {
            q0.c("RequestRetry", "重试任务已被取消，停止调度重试");
            return;
        }
        this.f46832k.incrementAndGet();
        if (this.f46832k.get() >= this.f46828g.g()) {
            q0.c("RequestRetry", "重试次数已达上限: " + this.f46832k.get());
            com.mbridge.msdk.config.component.common.network.a aVar = this.f46829h;
            if (aVar != null) {
                aVar.d(this.f46830i);
            }
            a();
            return;
        }
        q0.b("RequestRetry", "重试 次数 " + this.f46832k.get());
        try {
            ScheduledExecutorService scheduledExecutorService = this.f46826e;
            if (scheduledExecutorService != null) {
                this.f46825d = scheduledExecutorService.schedule(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46843b.c();
                    }
                }, this.f46828g.h(), TimeUnit.SECONDS);
                q0.c("RequestRetry", "已调度第 " + this.f46832k.get() + " 次重试");
            }
        } catch (Exception e10) {
            q0.b("RequestRetry", "调度重试任务失败: " + e10.getMessage());
            com.mbridge.msdk.config.component.common.network.a aVar2 = this.f46829h;
            if (aVar2 != null) {
                aVar2.d(this.f46830i);
            }
            a();
        }
    }

    private void h() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = this.f46823b;
        if (aVar != null) {
            aVar.a(new d());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f46831j;
        if (bVar != null) {
            bVar.a(new e());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f46822a;
        if (aVar != null) {
            aVar.a(new b());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f46831j;
        if (bVar != null) {
            bVar.a(new C0496c());
        }
    }

    private void j() {
        ScheduledExecutorService scheduledExecutorService = this.f46826e;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        try {
            q0.c("RequestRetry", "正在关闭独立调度器");
            this.f46826e.shutdown();
            if (this.f46826e.awaitTermination(5L, TimeUnit.SECONDS)) {
                q0.c("RequestRetry", "独立调度器已成功关闭");
            } else {
                q0.d("RequestRetry", "独立调度器未能在5秒内关闭，强制关闭");
                this.f46826e.shutdownNow();
            }
        } catch (InterruptedException e10) {
            q0.b("RequestRetry", "关闭独立调度器时被中断: " + e10.getMessage());
            this.f46826e.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f46824c) {
            return;
        }
        q0.c("RequestRetry", "取消所有重试任务");
        this.f46824c = true;
        ScheduledFuture<?> scheduledFuture = this.f46825d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f46825d.cancel(true);
            q0.c("RequestRetry", "已取消当前重试调度任务");
        }
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f46822a;
        if (aVar != null) {
            aVar.a();
            q0.c("RequestRetry", "已取消TCP连接");
        }
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f46823b;
        if (aVar2 != null) {
            aVar2.a();
            q0.c("RequestRetry", "已取消HTTP连接");
        }
        j();
    }

    private void b() {
        try {
            this.f46826e = Executors.newSingleThreadScheduledExecutor(new a());
            q0.c("RequestRetry", "创建独立调度器成功");
        } catch (Exception e10) {
            q0.b("RequestRetry", "创建独立调度器失败: " + e10.getMessage());
        }
    }

    public void c() {
        if (this.f46824c) {
            q0.c("RequestRetry", "重试任务已被取消，跳过执行");
        } else {
            f.a().b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46844b.e();
                }
            });
        }
    }
}
