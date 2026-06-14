package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f47021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f47022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f47023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.b f47024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.d f47025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f47026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.resource.stream.a f47027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f47028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f47029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f47030j;

    private n(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f47022b = dVar;
        this.f47024d = bVar;
        this.f47021a = cVar;
        this.f47023c = bVar2;
    }

    private boolean a(int i10, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        return i10 == 206;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9  */
    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.load.downloader.core.n.run():com.mbridge.msdk.config.component.load.downloader.d");
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new n(dVar, bVar, cVar, bVar2);
    }

    private com.mbridge.msdk.config.component.load.downloader.d a(String str, String str2, a0 a0Var, int i10) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        boolean zA = a(i10, this.f47024d);
        boolean z10 = (a0Var == null || this.f47022b == null || i10 != 206 || a0Var.d() == null || this.f47022b.l() <= 0 || a0Var.d().k() == this.f47022b.l() - this.f47022b.g()) ? false : true;
        if (!zA && z10) {
            this.f47022b.a(0L);
            this.f47022b.b(0L);
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f47021a)) {
                this.f47021a.remove(str2, str);
            }
            this.f47024d = null;
            com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(this.f47023c.e()));
        }
        b0 b0VarD = a0Var.d();
        this.f47028h = b0VarD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(b0VarD)) {
            dVar.a(new IOException("response body is null"));
            this.f47022b.b(0L);
            this.f47022b.a(0L);
            return dVar;
        }
        long jK = this.f47028h.k();
        String strA = a0Var.a("Content-Type", "");
        this.f47029i = strA;
        this.f47022b.a(strA);
        if (jK <= 0) {
            dVar.a(new IOException("response content length is null"));
            return dVar;
        }
        if (this.f47022b.l() == 0) {
            this.f47022b.b(jK);
        }
        InputStream inputStreamD = this.f47028h.d();
        this.f47026f = inputStreamD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(inputStreamD)) {
            dVar.a(new IOException("response inputStream is null"));
            return dVar;
        }
        this.f47023c.a(this.f47022b.l());
        this.f47022b.c(this.f47023c);
        return a(str, str2);
    }

    private void a(String str, String str2, Exception exc) {
        try {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f47021a) && com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f47022b)) {
                if (!s0.a().a("r_f_s_d_e", true)) {
                    this.f47021a.remove(str2, str);
                    com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(str));
                }
                this.f47022b.a(0L);
                this.f47022b.b(0L);
            }
        } catch (Exception e10) {
            q0.b(IDownloadTask.TAG, e10.getMessage(), e10);
        }
        this.f47025e.a(exc);
    }

    private com.mbridge.msdk.config.component.load.downloader.d a(String str, String str2) throws IllegalAccessException, IOException {
        String str3;
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        this.f47030j = System.currentTimeMillis();
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f47024d)) {
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f47023c.d(), str, this.f47030j, 0L, System.currentTimeMillis(), this.f47022b.l(), this.f47029i, 0, "");
            str3 = str;
            this.f47024d = bVarA;
            this.f47021a.a(bVarA);
        } else {
            str3 = str;
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA2 = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f47024d.c(), this.f47024d.e(), this.f47024d.b(), this.f47024d.i(), this.f47024d.h(), this.f47024d.g(), this.f47029i, 0, this.f47024d.d());
            this.f47024d = bVarA2;
            this.f47021a.a(bVarA2, str3);
        }
        com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVarB = com.mbridge.msdk.config.component.load.downloader.resource.a.a().b(new File(str3));
        this.f47027g = aVarB;
        aVarB.seek(this.f47022b.g());
        byte[] bArr = new byte[l.c().a()];
        while (true) {
            int i10 = this.f47026f.read(bArr);
            if (i10 == -1) {
                break;
            }
            this.f47027g.write(bArr, 0, i10);
            d dVar2 = this.f47022b;
            dVar2.a(dVar2.g() + ((long) i10));
            this.f47027g.flushAndSync();
            int iA = com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f47022b.l(), this.f47022b.g());
            a(this.f47022b, this.f47023c, this.f47022b.g(), this.f47022b.l(), iA);
            if (this.f47023c.c() != 100 && iA >= this.f47023c.c()) {
                break;
            }
            if (this.f47022b.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
                dVar.a(true);
                break;
            }
        }
        l.c().b().a(str2, str3, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f47023c.d(), this.f47023c.e(), this.f47030j, System.currentTimeMillis(), 0L, this.f47022b.l(), this.f47029i, 0, ""));
        try {
            if (this.f47022b.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED && this.f47022b.l() == this.f47022b.g()) {
                String strC = com.mbridge.msdk.config.component.common.file.a.c(this.f47023c.e());
                this.f47023c.a(strC);
                this.f47021a.a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f47023c.d(), this.f47023c.e(), this.f47030j, System.currentTimeMillis(), System.currentTimeMillis(), this.f47022b.l(), this.f47029i, 1, strC), this.f47023c.e());
            }
        } catch (Throwable th2) {
            q0.b(IDownloadTask.TAG, th2.getMessage(), th2);
        }
        if (!dVar.b()) {
            dVar.b(true);
        }
        return dVar;
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, long j10, long j11, int i10) {
        if (dVar.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            if (bVar != null) {
                bVar.a(i10);
                bVar.a(j11);
            }
            dVar.a(bVar, new DownloadProgress(j10, j11, i10));
        }
    }
}
