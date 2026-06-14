package yads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cc0 implements c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f109331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f109332b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c30 f109333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nt0 f109334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ri f109335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bz f109336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c30 f109337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n73 f109338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z20 f109339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wj2 f109340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c30 f109341k;

    public cc0(Context context, c30 c30Var) {
        this.f109331a = context.getApplicationContext();
        this.f109333c = (c30) fi.a(c30Var);
    }

    public final void a(c30 c30Var) {
        for (int i10 = 0; i10 < this.f109332b.size(); i10++) {
            c30Var.a((e63) this.f109332b.get(i10));
        }
    }

    @Override // yads.c30
    public final Map c() {
        c30 c30Var = this.f109341k;
        return c30Var == null ? Collections.EMPTY_MAP : c30Var.c();
    }

    @Override // yads.c30
    public final void close() {
        c30 c30Var = this.f109341k;
        if (c30Var != null) {
            try {
                c30Var.close();
            } finally {
                this.f109341k = null;
            }
        }
    }

    @Override // yads.c30
    public final Uri e() {
        c30 c30Var = this.f109341k;
        if (c30Var == null) {
            return null;
        }
        return c30Var.e();
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) {
        c30 c30Var = this.f109341k;
        c30Var.getClass();
        return c30Var.c(bArr, i10, i11);
    }

    @Override // yads.c30
    public final void a(e63 e63Var) {
        e63Var.getClass();
        this.f109333c.a(e63Var);
        this.f109332b.add(e63Var);
        nt0 nt0Var = this.f109334d;
        if (nt0Var != null) {
            nt0Var.a(e63Var);
        }
        ri riVar = this.f109335e;
        if (riVar != null) {
            riVar.a(e63Var);
        }
        bz bzVar = this.f109336f;
        if (bzVar != null) {
            bzVar.a(e63Var);
        }
        c30 c30Var = this.f109337g;
        if (c30Var != null) {
            c30Var.a(e63Var);
        }
        n73 n73Var = this.f109338h;
        if (n73Var != null) {
            n73Var.a(e63Var);
        }
        z20 z20Var = this.f109339i;
        if (z20Var != null) {
            z20Var.a(e63Var);
        }
        wj2 wj2Var = this.f109340j;
        if (wj2Var != null) {
            wj2Var.a(e63Var);
        }
    }

    @Override // yads.c30
    public final long a(h30 h30Var) {
        if (this.f109341k == null) {
            String scheme = h30Var.f111452a.getScheme();
            Uri uri = h30Var.f111452a;
            int i10 = w83.f117341a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !C4240b4.i.f42616b.equals(scheme2)) {
                if ("asset".equals(scheme)) {
                    if (this.f109335e == null) {
                        ri riVar = new ri(this.f109331a);
                        this.f109335e = riVar;
                        a(riVar);
                    }
                    this.f109341k = this.f109335e;
                } else if ("content".equals(scheme)) {
                    if (this.f109336f == null) {
                        bz bzVar = new bz(this.f109331a);
                        this.f109336f = bzVar;
                        a(bzVar);
                    }
                    this.f109341k = this.f109336f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.f109337g == null) {
                        try {
                            c30 c30Var = (c30) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f109337g = c30Var;
                            a(c30Var);
                        } catch (ClassNotFoundException unused) {
                            uf1.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.f109337g == null) {
                            this.f109337g = this.f109333c;
                        }
                    }
                    this.f109341k = this.f109337g;
                } else if ("udp".equals(scheme)) {
                    if (this.f109338h == null) {
                        n73 n73Var = new n73(0);
                        this.f109338h = n73Var;
                        a(n73Var);
                    }
                    this.f109341k = this.f109338h;
                } else if ("data".equals(scheme)) {
                    if (this.f109339i == null) {
                        z20 z20Var = new z20();
                        this.f109339i = z20Var;
                        a(z20Var);
                    }
                    this.f109341k = this.f109339i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f109341k = this.f109333c;
                } else {
                    if (this.f109340j == null) {
                        wj2 wj2Var = new wj2(this.f109331a);
                        this.f109340j = wj2Var;
                        a(wj2Var);
                    }
                    this.f109341k = this.f109340j;
                }
            } else {
                String path = h30Var.f111452a.getPath();
                if (path != null && path.startsWith("/android_asset/")) {
                    if (this.f109335e == null) {
                        ri riVar2 = new ri(this.f109331a);
                        this.f109335e = riVar2;
                        a(riVar2);
                    }
                    this.f109341k = this.f109335e;
                } else {
                    if (this.f109334d == null) {
                        nt0 nt0Var = new nt0();
                        this.f109334d = nt0Var;
                        a(nt0Var);
                    }
                    this.f109341k = this.f109334d;
                }
            }
            return this.f109341k.a(h30Var);
        }
        throw new IllegalStateException();
    }
}
