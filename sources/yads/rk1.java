package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class rk1 implements oq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nq f115473h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk1 f115475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kk1 f115476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vk1 f115477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gk1 f115478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ok1 f115479g;

    static {
        y31.g();
        nk2 nk2Var = nk2.f113952f;
        ok1 ok1Var = ok1.f114343d;
        vk1 vk1Var = vk1.H;
        f115473h = new nq() { // from class: yads.kp0
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return rk1.a(bundle);
            }
        };
    }

    public rk1(String str, gk1 gk1Var, mk1 mk1Var, kk1 kk1Var, vk1 vk1Var, ok1 ok1Var) {
        this.f115474b = str;
        this.f115475c = mk1Var;
        this.f115476d = kk1Var;
        this.f115477e = vk1Var;
        this.f115478f = gk1Var;
        this.f115479g = ok1Var;
    }

    public final dk1 a() {
        dk1 dk1Var = new dk1();
        gk1 gk1Var = this.f115478f;
        gk1Var.getClass();
        dk1Var.f109946d = new ek1(gk1Var);
        dk1Var.f109943a = this.f115474b;
        dk1Var.f109952j = this.f115477e;
        kk1 kk1Var = this.f115476d;
        kk1Var.getClass();
        dk1Var.f109953k = new jk1(kk1Var);
        dk1Var.f109954l = this.f115479g;
        mk1 mk1Var = this.f115475c;
        if (mk1Var != null) {
            dk1Var.f109949g = mk1Var.f113135e;
            dk1Var.f109945c = mk1Var.f113132b;
            dk1Var.f109944b = mk1Var.f113131a;
            dk1Var.f109948f = mk1Var.f113134d;
            dk1Var.f109950h = mk1Var.f113136f;
            dk1Var.f109951i = mk1Var.f113137g;
            ik1 ik1Var = mk1Var.f113133c;
            dk1Var.f109947e = ik1Var != null ? new hk1(ik1Var) : new hk1();
        }
        return dk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk1)) {
            return false;
        }
        rk1 rk1Var = (rk1) obj;
        return w83.a(this.f115474b, rk1Var.f115474b) && this.f115478f.equals(rk1Var.f115478f) && w83.a(this.f115475c, rk1Var.f115475c) && w83.a(this.f115476d, rk1Var.f115476d) && w83.a(this.f115477e, rk1Var.f115477e) && w83.a(this.f115479g, rk1Var.f115479g);
    }

    public final int hashCode() {
        int iHashCode = this.f115474b.hashCode() * 31;
        mk1 mk1Var = this.f115475c;
        return this.f115479g.hashCode() + ((this.f115477e.hashCode() + ((this.f115478f.hashCode() + ((this.f115476d.hashCode() + ((iHashCode + (mk1Var != null ? mk1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public static rk1 a(Bundle bundle) {
        kk1 kk1Var;
        vk1 vk1Var;
        gk1 gk1Var;
        ok1 ok1Var;
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        if (bundle2 == null) {
            kk1Var = kk1.f112729g;
        } else {
            kk1Var = (kk1) kk1.f112730h.fromBundle(bundle2);
        }
        kk1 kk1Var2 = kk1Var;
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        if (bundle3 == null) {
            vk1Var = vk1.H;
        } else {
            vk1Var = (vk1) vk1.I.fromBundle(bundle3);
        }
        vk1 vk1Var2 = vk1Var;
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        if (bundle4 == null) {
            gk1Var = gk1.f111243h;
        } else {
            gk1Var = (gk1) fk1.f110744g.fromBundle(bundle4);
        }
        gk1 gk1Var2 = gk1Var;
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        if (bundle5 == null) {
            ok1Var = ok1.f114343d;
        } else {
            ok1Var = (ok1) ok1.f114344e.fromBundle(bundle5);
        }
        return new rk1(string, gk1Var2, null, kk1Var2, vk1Var2, ok1Var);
    }

    public static rk1 a(String str) {
        mk1 mk1Var;
        ek1 ek1Var = new ek1();
        hk1 hk1Var = new hk1();
        List list = Collections.EMPTY_LIST;
        nk2 nk2Var = nk2.f113952f;
        ok1 ok1Var = ok1.f114343d;
        Uri uri = str == null ? null : Uri.parse(str);
        if (hk1Var.f111617b != null && hk1Var.f111616a == null) {
            throw new IllegalStateException();
        }
        ik1 ik1Var = null;
        if (uri != null) {
            if (hk1Var.f111616a != null) {
                ik1Var = new ik1(hk1Var);
            }
            mk1Var = new mk1(uri, null, ik1Var, list, null, nk2Var, null);
        } else {
            mk1Var = null;
        }
        return new rk1("", new gk1(ek1Var), mk1Var, new kk1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), vk1.H, ok1Var);
    }
}
