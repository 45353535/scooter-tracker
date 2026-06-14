package yads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wc2 f117064a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ul1 f117068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ol1 f117069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jj0 f117070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f117071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f117072i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f117074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e63 f117075l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fw2 f117073j = new fw2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f117066c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f117067d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f117065b = new ArrayList();

    public vl1(ul1 ul1Var, me meVar, Handler handler, wc2 wc2Var) {
        this.f117064a = wc2Var;
        this.f117068e = ul1Var;
        ol1 ol1Var = new ol1();
        this.f117069f = ol1Var;
        jj0 jj0Var = new jj0();
        this.f117070g = jj0Var;
        this.f117071h = new HashMap();
        this.f117072i = new HashSet();
        ol1Var.a(handler, meVar);
        jj0Var.a(handler, meVar);
    }

    public final f43 a(int i10, List list, fw2 fw2Var) {
        if (!list.isEmpty()) {
            this.f117073j = fw2Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                tl1 tl1Var = (tl1) list.get(i11 - i10);
                if (i11 > 0) {
                    tl1 tl1Var2 = (tl1) this.f117065b.get(i11 - 1);
                    tl1Var.f116289d = tl1Var2.f116286a.f112341h.f109134c.b() + tl1Var2.f116289d;
                    tl1Var.f116290e = false;
                    tl1Var.f116288c.clear();
                } else {
                    tl1Var.f116289d = 0;
                    tl1Var.f116290e = false;
                    tl1Var.f116288c.clear();
                }
                int iB = tl1Var.f116286a.f112341h.f109134c.b();
                for (int i12 = i11; i12 < this.f117065b.size(); i12++) {
                    ((tl1) this.f117065b.get(i12)).f116289d += iB;
                }
                this.f117065b.add(i11, tl1Var);
                this.f117067d.put(tl1Var.f116287b, tl1Var);
                if (this.f117074k) {
                    a(tl1Var);
                    if (this.f117066c.isEmpty()) {
                        this.f117072i.add(tl1Var);
                    } else {
                        sl1 sl1Var = (sl1) this.f117071h.get(tl1Var);
                        if (sl1Var != null) {
                            sl1Var.f115862a.disable(sl1Var.f115863b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final f43 a() {
        if (this.f117065b.isEmpty()) {
            return f43.f110599b;
        }
        int iB = 0;
        for (int i10 = 0; i10 < this.f117065b.size(); i10++) {
            tl1 tl1Var = (tl1) this.f117065b.get(i10);
            tl1Var.f116289d = iB;
            iB += tl1Var.f116286a.f112341h.f109134c.b();
        }
        return new sd2(this.f117065b, this.f117073j);
    }

    public final void a(ml1 ml1Var, f43 f43Var) {
        ((cn0) this.f117068e).f109471i.f116471a.sendEmptyMessage(22);
    }

    public final void a(tl1 tl1Var) {
        jh1 jh1Var = tl1Var.f116286a;
        ll1 ll1Var = new ll1() { // from class: yads.ur0
            @Override // yads.ll1
            public final void a(ml1 ml1Var, f43 f43Var) {
                this.f116745a.a(ml1Var, f43Var);
            }
        };
        rl1 rl1Var = new rl1(this, tl1Var);
        this.f117071h.put(tl1Var, new sl1(jh1Var, ll1Var, rl1Var));
        jh1Var.addEventListener(w83.b((Handler.Callback) null), rl1Var);
        jh1Var.addDrmEventListener(w83.b((Handler.Callback) null), rl1Var);
        jh1Var.prepareSource(ll1Var, this.f117075l, this.f117064a);
    }

    public final void a(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            tl1 tl1Var = (tl1) this.f117065b.remove(i12);
            this.f117067d.remove(tl1Var.f116287b);
            int i13 = -tl1Var.f116286a.f112341h.f109134c.b();
            for (int i14 = i12; i14 < this.f117065b.size(); i14++) {
                ((tl1) this.f117065b.get(i14)).f116289d += i13;
            }
            tl1Var.f116290e = true;
            if (this.f117074k && tl1Var.f116288c.isEmpty()) {
                sl1 sl1Var = (sl1) this.f117071h.remove(tl1Var);
                sl1Var.getClass();
                sl1Var.f115862a.releaseSource(sl1Var.f115863b);
                sl1Var.f115862a.removeEventListener(sl1Var.f115864c);
                sl1Var.f115862a.removeDrmEventListener(sl1Var.f115864c);
                this.f117072i.remove(tl1Var);
            }
        }
    }
}
