package yads;

import android.net.Uri;
import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e43 implements oq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f110183s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f110184t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final rk1 f110185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final nq f110186v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f110188c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f110190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f110191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f110192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f110193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f110194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f110195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f110196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kk1 f110197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f110198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f110199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f110200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f110201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f110202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f110203r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f110187b = f110183s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rk1 f110189d = f110185u;

    static {
        mk1 mk1Var;
        ek1 ek1Var = new ek1();
        hk1 hk1Var = new hk1();
        List list = Collections.EMPTY_LIST;
        nk2 nk2Var = nk2.f113952f;
        ok1 ok1Var = ok1.f114343d;
        Uri uri = Uri.EMPTY;
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
        f110185u = new rk1("com.monetization.ads.exoplayer2.Timeline", new gk1(ek1Var), mk1Var, new kk1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), vk1.H, ok1Var);
        f110186v = new nq() { // from class: yads.g6
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return e43.a(bundle);
            }
        };
    }

    public static e43 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        rk1 rk1Var = bundle2 != null ? (rk1) rk1.f115473h.fromBundle(bundle2) : null;
        long j10 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
        long j12 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
        boolean z10 = bundle.getBoolean(Integer.toString(5, 36), false);
        boolean z11 = bundle.getBoolean(Integer.toString(6, 36), false);
        Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
        kk1 kk1Var = bundle3 != null ? (kk1) kk1.f112730h.fromBundle(bundle3) : null;
        boolean z12 = bundle.getBoolean(Integer.toString(8, 36), false);
        long j13 = bundle.getLong(Integer.toString(9, 36), 0L);
        long j14 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
        int i10 = bundle.getInt(Integer.toString(11, 36), 0);
        int i11 = bundle.getInt(Integer.toString(12, 36), 0);
        long j15 = bundle.getLong(Integer.toString(13, 36), 0L);
        e43 e43Var = new e43();
        e43Var.a(f110184t, rk1Var, null, j10, j11, j12, z10, z11, kk1Var, j13, j14, i10, i11, j15);
        e43Var.f110198m = z12;
        return e43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e43.class.equals(obj.getClass())) {
            e43 e43Var = (e43) obj;
            if (w83.a(this.f110187b, e43Var.f110187b) && w83.a(this.f110189d, e43Var.f110189d) && w83.a(this.f110190e, e43Var.f110190e) && w83.a(this.f110197l, e43Var.f110197l) && this.f110191f == e43Var.f110191f && this.f110192g == e43Var.f110192g && this.f110193h == e43Var.f110193h && this.f110194i == e43Var.f110194i && this.f110195j == e43Var.f110195j && this.f110198m == e43Var.f110198m && this.f110199n == e43Var.f110199n && this.f110200o == e43Var.f110200o && this.f110201p == e43Var.f110201p && this.f110202q == e43Var.f110202q && this.f110203r == e43Var.f110203r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f110189d.hashCode() + ((this.f110187b.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.f110190e;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        kk1 kk1Var = this.f110197l;
        int iHashCode3 = (iHashCode2 + (kk1Var != null ? kk1Var.hashCode() : 0)) * 31;
        long j10 = this.f110191f;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f110192g;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f110193h;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f110194i ? 1 : 0)) * 31) + (this.f110195j ? 1 : 0)) * 31) + (this.f110198m ? 1 : 0)) * 31;
        long j13 = this.f110199n;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f110200o;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f110201p) * 31) + this.f110202q) * 31;
        long j15 = this.f110203r;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }

    public final boolean a() {
        boolean z10 = this.f110196k;
        kk1 kk1Var = this.f110197l;
        if (z10 == (kk1Var != null)) {
            return kk1Var != null;
        }
        throw new IllegalStateException();
    }

    public final e43 a(Object obj, rk1 rk1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, kk1 kk1Var, long j13, long j14, int i10, int i11, long j15) {
        mk1 mk1Var;
        this.f110187b = obj;
        this.f110189d = rk1Var != null ? rk1Var : f110185u;
        this.f110188c = (rk1Var == null || (mk1Var = rk1Var.f115475c) == null) ? null : mk1Var.f113137g;
        this.f110190e = obj2;
        this.f110191f = j10;
        this.f110192g = j11;
        this.f110193h = j12;
        this.f110194i = z10;
        this.f110195j = z11;
        this.f110196k = kk1Var != null;
        this.f110197l = kk1Var;
        this.f110199n = j13;
        this.f110200o = j14;
        this.f110201p = i10;
        this.f110202q = i11;
        this.f110203r = j15;
        this.f110198m = false;
        return this;
    }
}
