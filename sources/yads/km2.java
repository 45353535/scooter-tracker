package yads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class km2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj3 f112762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f112765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f112766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public on2 f112767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f112768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xm2 f112769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f112770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f112771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f112772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f112773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f112774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zd0 f112775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public cr f112776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f112777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public im2 f112778r;

    public km2(int i10, String str, on2 on2Var) {
        this.f112762b = qj3.f115033c ? new qj3() : null;
        this.f112766f = new Object();
        this.f112770j = true;
        this.f112771k = false;
        this.f112772l = false;
        this.f112773m = false;
        this.f112774n = false;
        this.f112776p = null;
        this.f112763c = i10;
        this.f112764d = str;
        this.f112767g = on2Var;
        a(new zd0());
        this.f112765e = b(str);
    }

    public oj3 a(oj3 oj3Var) {
        return oj3Var;
    }

    public abstract qn2 a(r62 r62Var);

    public abstract void a(Object obj);

    public byte[] b() {
        return null;
    }

    public final void c(String str) {
        xm2 xm2Var = this.f112769i;
        if (xm2Var != null) {
            synchronized (xm2Var.f117898b) {
                xm2Var.f117898b.remove(this);
            }
            synchronized (xm2Var.f117906j) {
                Iterator it = xm2Var.f117906j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            xm2Var.a(this, 5);
        }
        if (qj3.f115033c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new hm2(this, str, id2));
                return;
            }
            this.f112762b.a(str, id2);
            qj3 qj3Var = this.f112762b;
            toString();
            qj3Var.a();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        km2 km2Var = (km2) obj;
        int iF = f();
        int iF2 = km2Var.f();
        return iF == iF2 ? this.f112768h.intValue() - km2Var.f112768h.intValue() : pf0.a(iF2) - pf0.a(iF);
    }

    public Map d() {
        return Collections.EMPTY_MAP;
    }

    public final int e() {
        return this.f112763c;
    }

    public int f() {
        return 2;
    }

    public String g() {
        return this.f112764d;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f112766f) {
            z10 = this.f112772l;
        }
        return z10;
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f112766f) {
            z10 = this.f112771k;
        }
        return z10;
    }

    public final void j() {
        im2 im2Var;
        synchronized (this.f112766f) {
            im2Var = this.f112778r;
        }
        if (im2Var != null) {
            ((kk3) im2Var).b(this);
        }
    }

    public final void k() {
        this.f112770j = false;
    }

    public final void l() {
        this.f112774n = true;
    }

    public final void m() {
        this.f112773m = true;
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f112765e);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i() ? "[X] " : "[ ] ");
        sb2.append(g());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(jm2.a(f()));
        sb2.append(" ");
        sb2.append(this.f112768h);
        return sb2.toString();
    }

    public static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void a() {
        synchronized (this.f112766f) {
            this.f112771k = true;
            this.f112767g = null;
        }
    }

    public final void a(qn2 qn2Var) {
        im2 im2Var;
        synchronized (this.f112766f) {
            im2Var = this.f112778r;
        }
        if (im2Var != null) {
            ((kk3) im2Var).a(this, qn2Var);
        }
    }

    public final void a(int i10) {
        xm2 xm2Var = this.f112769i;
        if (xm2Var != null) {
            xm2Var.a(this, i10);
        }
    }

    public final void a(im2 im2Var) {
        synchronized (this.f112766f) {
            this.f112778r = im2Var;
        }
    }

    public final void a(zd0 zd0Var) {
        this.f112775o = zd0Var;
    }

    public final void a(String str) {
        if (qj3.f115033c) {
            this.f112762b.a(str, Thread.currentThread().getId());
        }
    }

    public final String c() {
        String strG = g();
        int i10 = this.f112763c;
        if (i10 == 0 || i10 == -1) {
            return strG;
        }
        return Integer.toString(i10) + '-' + strG;
    }
}
