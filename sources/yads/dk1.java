package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f109943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f109944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f109945c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f109949g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f109951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public vk1 f109952j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ek1 f109946d = new ek1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hk1 f109947e = new hk1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f109948f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y31 f109950h = y31.g();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public jk1 f109953k = new jk1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ok1 f109954l = ok1.f114343d;

    public final rk1 a() {
        mk1 mk1Var;
        hk1 hk1Var = this.f109947e;
        if (hk1Var.f111617b != null && hk1Var.f111616a == null) {
            throw new IllegalStateException();
        }
        Uri uri = this.f109944b;
        if (uri != null) {
            ik1 ik1Var = null;
            String str = this.f109945c;
            if (hk1Var.f111616a != null) {
                ik1Var = new ik1(hk1Var);
            }
            mk1Var = new mk1(uri, str, ik1Var, this.f109948f, this.f109949g, this.f109950h, this.f109951i);
        } else {
            mk1Var = null;
        }
        String str2 = this.f109943a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ek1 ek1Var = this.f109946d;
        ek1Var.getClass();
        gk1 gk1Var = new gk1(ek1Var);
        kk1 kk1VarA = this.f109953k.a();
        vk1 vk1Var = this.f109952j;
        if (vk1Var == null) {
            vk1Var = vk1.H;
        }
        return new rk1(str3, gk1Var, mk1Var, kk1VarA, vk1Var, this.f109954l);
    }

    public final dk1 a(Uri uri) {
        this.f109944b = uri;
        return this;
    }
}
