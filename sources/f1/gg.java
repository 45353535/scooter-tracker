package f1;

import f1.bd;
import f1.z;
import f1.z2;
import h1.a;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class gg implements z.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x5 f69961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f69962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wf f69963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2 f69964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f69965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Cif f69966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1.a f69967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wc f69968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f69969j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f69970k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f69971l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f69972m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AtomicInteger f69973n = null;

    public gg(x5 x5Var, m mVar, wf wfVar, g2 g2Var, AtomicReference atomicReference, Cif cif, h1.a aVar, wc wcVar) {
        this.f69961b = x5Var;
        this.f69962c = mVar;
        this.f69963d = wfVar;
        this.f69964e = g2Var;
        this.f69965f = atomicReference;
        this.f69966g = cif;
        this.f69967h = aVar;
        this.f69968i = wcVar;
    }

    public final synchronized void a() {
        try {
            int i10 = this.f69969j;
            if (i10 == 2) {
                eg.d("Change state to COOLDOWN", null);
                this.f69969j = 4;
                this.f69972m = null;
            } else if (i10 == 3) {
                eg.d("Change state to COOLDOWN", null);
                this.f69969j = 4;
                AtomicInteger atomicInteger = this.f69973n;
                this.f69973n = null;
                if (atomicInteger != null) {
                    this.f69961b.e(atomicInteger);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // f1.z.a
    public synchronized void b(z zVar, JSONObject jSONObject) {
        try {
        } catch (Exception e10) {
            eg.i("prefetch onSuccess", e10);
        }
        if (this.f69969j != 2) {
            return;
        }
        if (zVar != this.f69972m) {
            return;
        }
        eg.d("Change state to DOWNLOAD_ASSETS", null);
        this.f69969j = 3;
        this.f69972m = null;
        this.f69973n = new AtomicInteger();
        if (jSONObject != null) {
            eg.d("Got Asset list for Prefetch from server: " + jSONObject, null);
            this.f69961b.c(r.f70880f, f9.g(jSONObject, ((ga) this.f69965f.get()).f69911o), this.f69973n, null, "");
            return;
        }
        return;
    }

    @Override // f1.z.a
    public synchronized void c(z zVar, g1.a aVar) {
        String strD = "Prefetch failure";
        if (aVar != null) {
            try {
                strD = aVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f69966g.mo4436e(new oc(z2.f.f71726d, strD, "", "", null));
        if (this.f69969j != 2) {
            return;
        }
        if (zVar != this.f69972m) {
            return;
        }
        this.f69972m = null;
        eg.d("Change state to COOLDOWN", null);
        this.f69969j = 4;
    }

    public final void d(ga gaVar) {
        boolean z10 = gaVar.f69914r;
        if (this.f69970k != 2 || z10) {
            return;
        }
        eg.d("Change state to IDLE", null);
        this.f69969j = 1;
        this.f69970k = 0;
        this.f69971l = 0L;
        this.f69972m = null;
        AtomicInteger atomicInteger = this.f69973n;
        this.f69973n = null;
        if (atomicInteger != null) {
            this.f69961b.e(atomicInteger);
        }
    }

    public synchronized void e() {
        ga gaVar;
        try {
            try {
                eg.l("Sdk Version = 9.10.2, Commit: 09decf9845eb8f00ac06b030676751feddd00887", null);
                gaVar = (ga) this.f69965f.get();
                d(gaVar);
            } catch (Exception e10) {
                if (this.f69969j == 2) {
                    eg.d("Change state to COOLDOWN", null);
                    this.f69969j = 4;
                    this.f69972m = null;
                }
                eg.i("prefetch", e10);
            }
            if (!gaVar.e() && !gaVar.d()) {
                if (this.f69969j == 3) {
                    if (this.f69973n.get() > 0) {
                        return;
                    }
                    eg.d("Change state to COOLDOWN", null);
                    this.f69969j = 4;
                    this.f69973n = null;
                }
                if (this.f69969j == 4) {
                    if (this.f69971l - System.nanoTime() > 0) {
                        eg.d("Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires", null);
                        return;
                    }
                    eg.d("Change state to IDLE", null);
                    this.f69969j = 1;
                    this.f69970k = 0;
                    this.f69971l = 0L;
                }
                if (this.f69969j != 1) {
                    return;
                }
                if (!gaVar.h()) {
                    eg.i("Did not prefetch because neither native nor webview are enabled.", null);
                    return;
                }
                URL urlA = this.f69967h.a(a.EnumC0890a.f72850e);
                z4 z4Var = new z4(bd.c.f69469c, h1.d.b(urlA), urlA.getPath(), this.f69964e.a(), r.f70879e, null, this, this.f69966g, this.f69968i);
                z4Var.G("cache_assets", this.f69962c.o());
                z4Var.f71691t = true;
                eg.d("Change state to AWAIT_PREFETCH_RESPONSE", null);
                this.f69969j = 2;
                this.f69970k = 2;
                this.f69971l = System.nanoTime() + TimeUnit.MINUTES.toNanos(gaVar.f69919w);
                this.f69972m = z4Var;
                this.f69963d.b(z4Var);
                return;
            }
            a();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
