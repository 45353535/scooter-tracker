package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes10.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f46949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b<T> f46950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.c f46951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f46952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f46953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Future f46954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, List<String>> f46955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.h f46956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f46957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f46958j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f46960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.e f46961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f46962n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f46964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f46965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f46966r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f46959k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f46963o = 0;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f46967a;

        a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f46967a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f46956h != null) {
                    d.this.f46956h.a(this.f46967a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f46969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a f46970b;

        b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f46969a = bVar;
            this.f46970b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f46959k >= d.this.f46958j) {
                    d.this.a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
                    if (d.this.f46956h != null) {
                        d.this.f46956h.a(this.f46969a, this.f46970b);
                    }
                    d.this.b();
                    return;
                }
                d.this.a(com.mbridge.msdk.config.component.load.downloader.e.RETRY);
                d.this.f46959k++;
                d.this.a(0L);
                d.this.b(0L);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f46972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DownloadProgress f46973b;

        c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f46972a = bVar;
            this.f46973b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f46956h != null) {
                    d.this.f46956h.a(this.f46972a, this.f46973b);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    class RunnableC0497d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f46975a;

        RunnableC0497d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f46975a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f46956h != null) {
                    d.this.f46956h.c(this.f46975a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f46977a;

        e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f46977a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f46956h != null) {
                    d.this.f46956h.b(this.f46977a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f46979a;

        f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f46979a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f46953e != null && !d.this.f46953e.isEmpty()) {
                    String str = (String) d.this.f46953e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f46979a.a("responseHeaders", str);
                    }
                }
                if (d.this.f46956h != null) {
                    d.this.f46956h.d(this.f46979a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    d(com.mbridge.msdk.config.component.load.downloader.core.e<T> eVar) {
        this.f46955g = eVar.f46986f;
        this.f46951c = eVar.f46983c;
        this.f46957i = eVar.f46987g;
        this.f46949a = eVar.f46981a;
        this.f46964p = eVar.f46990j;
        this.f46950b = eVar.f46982b;
        this.f46966r = eVar.f46991k;
        this.f46956h = eVar.f46984d;
        this.f46958j = eVar.f46988h;
        this.f46962n = eVar.f46989i;
        this.f46953e = eVar.f46985e;
    }

    public String f() {
        com.mbridge.msdk.config.component.load.downloader.b<T> bVar = this.f46950b;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public long g() {
        return this.f46952d;
    }

    public long h() {
        return this.f46957i;
    }

    public int i() {
        return this.f46960l;
    }

    public com.mbridge.msdk.config.component.load.downloader.e j() {
        return this.f46961m;
    }

    public long k() {
        return this.f46962n;
    }

    public long l() {
        return this.f46963o;
    }

    public long m() {
        return this.f46966r;
    }

    public void n() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }

    public void b(long j10) {
        this.f46963o = j10;
    }

    public long c() {
        return this.f46949a;
    }

    public com.mbridge.msdk.config.component.load.downloader.b<T> d() {
        return this.f46950b;
    }

    public com.mbridge.msdk.config.component.load.downloader.c e() {
        return this.f46951c;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f46961m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
        }
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f46961m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC0497d(bVar));
        }
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f46961m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.COMPLETED);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a();
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f46961m = com.mbridge.msdk.config.component.load.downloader.e.CANCELLED;
        Future future = this.f46954f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public String a(String str, String str2) {
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f46953e) && this.f46953e.containsKey(str) && !TextUtils.isEmpty(str)) {
            String str3 = this.f46953e.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return str2;
    }

    public void a(long j10) {
        this.f46952d = j10;
    }

    public void a(int i10) {
        this.f46960l = i10;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.e eVar) {
        this.f46961m = eVar;
    }

    public void a(String str) {
        this.f46965q = str;
    }

    private void a() {
        this.f46956h = null;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.f46961m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, DownloadProgress downloadProgress) {
        if (this.f46961m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }

    public void a(Future future) {
        this.f46954f = future;
    }
}
