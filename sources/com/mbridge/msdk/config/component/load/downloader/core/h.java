package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.config.component.load.downloader.c f47004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f47006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f47007d;

    h(d<?> dVar) {
        this.f47006c = dVar;
        this.f47004a = dVar.e();
        this.f47005b = dVar.i();
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "开始下载任务");
        if (this.f47006c.j() != com.mbridge.msdk.config.component.load.downloader.e.RETRY) {
            this.f47006c.d(this.f47006c.d());
        }
        this.f47006c.a(com.mbridge.msdk.config.component.load.downloader.e.RUNNING);
        this.f47007d = this.f47006c.d();
        q0.a(IDownloadTask.TAG, "filePath ： " + this.f47007d.e());
        com.mbridge.msdk.config.component.load.downloader.d dVarRun = g.a(this.f47006c, this.f47007d, l.c().b()).run();
        if (dVarRun.c()) {
            this.f47006c.e(this.f47007d);
        } else if (dVarRun.a() != null) {
            this.f47006c.a(this.f47007d, dVarRun.a());
        } else if (dVarRun.b()) {
            this.f47006c.b(this.f47007d);
        }
    }
}
