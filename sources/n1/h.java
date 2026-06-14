package n1;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l1.d f95052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l1.a f95053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.a f95054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1.b f95055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l1.c f95056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q1.a f95057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f95058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f95059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f95060l;

    public h(a aVar, boolean z10, boolean z11, r1.a aVar2, l1.a aVar3) {
        super(aVar, aVar2);
        this.f95058j = false;
        this.f95059k = false;
        this.f95060l = new AtomicBoolean(false);
        this.f95053e = aVar3;
        this.f95058j = z10;
        this.f95055g = new u1.b();
        this.f95054f = new a2.a(aVar.g());
        this.f95059k = z11;
        if (z11) {
            this.f95052d = new l1.d(aVar.g(), this, this);
        }
    }

    @Override // n1.f, n1.a
    public final void a(ComponentName componentName, IBinder iBinder) {
        r1.a aVar;
        boolean zJ = this.f95050b.j();
        if (!zJ && (aVar = this.f95051c) != null) {
            aVar.onOdtUnsupported();
        }
        if (this.f95052d != null && this.f95050b.j() && this.f95059k) {
            this.f95052d.a();
        }
        if (zJ || this.f95058j) {
            super.a(componentName, iBinder);
        }
    }

    @Override // n1.f, n1.a
    public final void b() {
        if (this.f95056h == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            t1.a aVar = t1.b.f104802b.f104803a;
            if (aVar != null) {
                aVar.i("%s : initializing new Ignite authentication session", objArr);
            }
            a2.a aVar2 = this.f95054f;
            aVar2.getClass();
            try {
                aVar2.f3771b.c();
            } catch (IOException e10) {
                e = e10;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e12) {
                e = e12;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e13) {
                e = e13;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e14) {
                e = e14;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e15) {
                e = e15;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e16) {
                e = e16;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e17) {
                e = e17;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e18) {
                e = e18;
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_INIT_ENCRYPTION));
            } catch (Exception e19) {
                p1.b.b(p1.d.ENCRYPTION_EXCEPTION, x1.a.a(e19, p1.c.FAILED_INIT_ENCRYPTION));
            }
            String strA = this.f95054f.a();
            this.f95055g.getClass();
            l1.c cVarA = u1.b.a(strA);
            this.f95056h = cVarA;
            if (cVarA.f93866b > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                t1.b.a("%s : One DT resolved from cache", "OneDTAuthenticator");
                l1.c cVar = this.f95056h;
                l1.a aVar3 = this.f95053e;
                if (aVar3 != null) {
                    t1.b.a("%s : setting one dt entity", "IgniteManager");
                    aVar3.f93863b = cVar;
                }
            } else {
                this.f95060l.set(true);
            }
        }
        if (this.f95059k && this.f95052d == null) {
            t1.b.b("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.f95058j && !this.f95060l.get()) {
            if (this.f95059k) {
                this.f95052d.a();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            t1.a aVar4 = t1.b.f104802b.f104803a;
            if (aVar4 != null) {
                aVar4.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f95050b.b();
        }
    }

    @Override // n1.f, n1.a
    public final void c(String str) {
        super.c(str);
        if (this.f95050b.h() && this.f95060l.get() && this.f95050b.j()) {
            this.f95060l.set(false);
            m();
        }
    }

    @Override // n1.f, n1.a
    public final String d() {
        a aVar = this.f95050b;
        if (aVar instanceof f) {
            return aVar.d();
        }
        return null;
    }

    @Override // n1.f, n1.a
    public final void destroy() {
        this.f95053e = null;
        l1.d dVar = this.f95052d;
        if (dVar != null) {
            v1.a aVar = dVar.f93867a;
            if (aVar != null && aVar.f105677b) {
                dVar.f93868b.unregisterReceiver(aVar);
                dVar.f93867a.f105677b = false;
            }
            v1.a aVar2 = dVar.f93867a;
            if (aVar2 != null) {
                aVar2.f105676a = null;
                dVar.f93867a = null;
            }
            dVar.f93869c = null;
            dVar.f93868b = null;
            dVar.f93870d = null;
            this.f95052d = null;
        }
        q1.a aVar3 = this.f95057i;
        if (aVar3 != null) {
            m1.b bVar = aVar3.f98676b;
            if (bVar != null) {
                bVar.f94398c.clear();
                aVar3.f98676b = null;
            }
            aVar3.f98677c = null;
            aVar3.f98675a = null;
            this.f95057i = null;
        }
        this.f95051c = null;
        this.f95050b.destroy();
    }

    @Override // n1.f, n1.a
    public final String i() {
        a aVar = this.f95050b;
        if (aVar instanceof f) {
            return aVar.i();
        }
        return null;
    }

    @Override // n1.f, n1.a
    public final boolean j() {
        return this.f95050b.j();
    }

    @Override // n1.f, n1.a
    public final void l() {
        b();
    }

    public final void m() {
        IIgniteServiceAPI iIgniteServiceAPIK = this.f95050b.k();
        if (iIgniteServiceAPIK == null) {
            t1.b.b("%s : service is unavailable", "OneDTAuthenticator");
            p1.b.b(p1.d.ONE_DT_REQUEST_ERROR, "error_code", p1.c.IGNITE_SERVICE_UNAVAILABLE.d());
            return;
        }
        if (this.f95057i == null) {
            this.f95057i = new q1.a(iIgniteServiceAPIK, this);
        }
        if (TextUtils.isEmpty(this.f95050b.e())) {
            p1.b.b(p1.d.ONE_DT_REQUEST_ERROR, "error_code", p1.c.IGNITE_SERVICE_INVALID_SESSION.d());
            t1.b.b("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        q1.a aVar = this.f95057i;
        String strE = this.f95050b.e();
        aVar.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", strE);
            aVar.f98677c.getProperty("onedtid", bundle, new Bundle(), aVar.f98676b);
        } catch (RemoteException e10) {
            p1.b.a(p1.d.ONE_DT_REQUEST_ERROR, e10);
            t1.b.b("%s : request failed : %s", "OneDTPropertyHandler", e10.toString());
        }
    }
}
