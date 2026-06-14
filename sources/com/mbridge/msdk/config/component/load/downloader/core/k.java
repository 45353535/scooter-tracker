package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f47010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.b f47012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d<?> f47013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b<?> f47014e;

    private k(d<?> dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b<?> bVar2) {
        this.f47013d = dVar;
        this.f47012c = bVar;
        this.f47010a = cVar;
        this.f47011b = str;
        this.f47014e = bVar2;
    }

    static m a(d<?> dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b<?> bVar2) {
        return new k(dVar, bVar, cVar, str, bVar2);
    }

    private void b(com.mbridge.msdk.config.component.load.downloader.d dVar, File file) {
        long length = file.length();
        long jLastModified = file.lastModified();
        this.f47013d.b(this.f47012c.g());
        this.f47013d.a(file.length());
        l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f47012c.c(), file.getAbsolutePath(), this.f47012c.b(), this.f47012c.i(), jLastModified, this.f47012c.g(), this.f47012c.a(), this.f47012c.f(), this.f47012c.d()), this.f47014e.e());
        dVar.b(a(length));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f47012c)) {
            return null;
        }
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        File file = new File(this.f47014e.e());
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            this.f47013d.a(0L);
            this.f47010a.remove(this.f47011b);
            dVar.b(false);
            return dVar;
        }
        long jC = com.mbridge.msdk.config.component.load.downloader.resource.a.a().c(file);
        if (jC == this.f47012c.g()) {
            this.f47013d.b(this.f47012c.g());
            this.f47013d.a(jC);
            dVar.b(a(jC));
            return dVar;
        }
        boolean zA = a();
        q0.a(IDownloadTask.TAG, "数据库记录和文件大小不一致，是否以文件大小为基准进行断点续传： " + zA);
        if (zA) {
            b(dVar, file);
            return dVar;
        }
        a(dVar, file);
        return dVar;
    }

    private boolean a() {
        try {
            return Boolean.parseBoolean(this.f47013d.a("do_us_fi_re", Boolean.toString(true)));
        } catch (Exception unused) {
            q0.a(IDownloadTask.TAG, "类型转换错误： do_us_fi_re");
            return false;
        }
    }

    private void a(com.mbridge.msdk.config.component.load.downloader.d dVar, File file) {
        this.f47013d.a(0L);
        this.f47013d.b(0L);
        this.f47010a.remove(this.f47011b);
        com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(file);
        dVar.b(false);
    }

    private boolean a(long j10) {
        return com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f47012c.g(), j10) >= this.f47014e.c();
    }
}
