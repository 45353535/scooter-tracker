package yads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cr1 extends ay {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final rk1 f109534o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f109535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f109536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ml1[] f109537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f43[] f109538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f109539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dy f109540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f109541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ew1 f109542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f109543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[][] f109544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public br1 f109545n;

    static {
        ek1 ek1Var = new ek1();
        y31.g();
        nk2 nk2Var = nk2.f113952f;
        f109534o = new rk1("MergingMediaSource", new gk1(ek1Var), null, new kk1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), vk1.H, ok1.f114343d);
    }

    public cr1(ub0 ub0Var, ml1... ml1VarArr) {
        this.f109535d = false;
        this.f109536e = false;
        this.f109537f = ml1VarArr;
        this.f109540i = ub0Var;
        this.f109539h = new ArrayList(Arrays.asList(ml1VarArr));
        this.f109543l = -1;
        this.f109538g = new f43[ml1VarArr.length];
        this.f109544m = new long[0][];
        this.f109541j = new HashMap();
        this.f109542k = bw1.a().a().b();
    }

    @Override // yads.ay
    public final kl1 a(Object obj, kl1 kl1Var) {
        if (((Integer) obj).intValue() == 0) {
            return kl1Var;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r14 = r14 + 1;
     */
    @Override // yads.ay
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r12, yads.ml1 r13, yads.f43 r14) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cr1.a(java.lang.Object, yads.ml1, yads.f43):void");
    }

    @Override // yads.ml1
    public final bl1 createPeriod(kl1 kl1Var, ke keVar, long j10) {
        int length = this.f109537f.length;
        bl1[] bl1VarArr = new bl1[length];
        int iA = this.f109538g[0].a(kl1Var.f109962a);
        for (int i10 = 0; i10 < length; i10++) {
            bl1VarArr[i10] = this.f109537f[i10].createPeriod(kl1Var.a(this.f109538g[i10].a(iA)), keVar, j10 - this.f109544m[iA][i10]);
        }
        zq1 zq1Var = new zq1(this.f109540i, this.f109544m[iA], bl1VarArr);
        if (!this.f109536e) {
            return zq1Var;
        }
        Long l10 = (Long) this.f109541j.get(kl1Var.f109962a);
        l10.getClass();
        dv dvVar = new dv(zq1Var, true, 0L, l10.longValue());
        this.f109542k.a(kl1Var.f109962a, dvVar);
        return dvVar;
    }

    @Override // yads.ml1
    public final rk1 getMediaItem() {
        ml1[] ml1VarArr = this.f109537f;
        return ml1VarArr.length > 0 ? ml1VarArr[0].getMediaItem() : f109534o;
    }

    @Override // yads.ay, yads.ml1
    public final void maybeThrowSourceInfoRefreshError() throws br1 {
        br1 br1Var = this.f109545n;
        if (br1Var != null) {
            throw br1Var;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // yads.eo
    public final void prepareSourceInternal(e63 e63Var) {
        this.f108859c = e63Var;
        this.f108858b = w83.a((Handler.Callback) null);
        for (int i10 = 0; i10 < this.f109537f.length; i10++) {
            a(Integer.valueOf(i10), this.f109537f[i10]);
        }
    }

    @Override // yads.ml1
    public final void releasePeriod(bl1 bl1Var) {
        if (this.f109536e) {
            dv dvVar = (dv) bl1Var;
            ew1 ew1Var = this.f109542k;
            c0 c0Var = ew1Var.f110121b;
            if (c0Var == null) {
                c0Var = new c0(ew1Var);
                ew1Var.f110121b = c0Var;
            }
            Iterator it = c0Var.iterator();
            while (true) {
                o oVar = (o) it;
                if (!oVar.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) oVar.next();
                if (((dv) entry.getValue()).equals(dvVar)) {
                    ew1 ew1Var2 = this.f109542k;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ew1Var2.a().get(key);
                    if (collection != null) {
                        collection.remove(value);
                    }
                }
            }
            bl1Var = dvVar.f110077b;
        }
        zq1 zq1Var = (zq1) bl1Var;
        int i10 = 0;
        while (true) {
            ml1[] ml1VarArr = this.f109537f;
            if (i10 >= ml1VarArr.length) {
                return;
            }
            ml1 ml1Var = ml1VarArr[i10];
            bl1 bl1Var2 = zq1Var.f118763b[i10];
            if (bl1Var2 instanceof xq1) {
                bl1Var2 = ((xq1) bl1Var2).f117926b;
            }
            ml1Var.releasePeriod(bl1Var2);
            i10++;
        }
    }

    @Override // yads.ay, yads.eo
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f109538g, (Object) null);
        this.f109543l = -1;
        this.f109545n = null;
        this.f109539h.clear();
        Collections.addAll(this.f109539h, this.f109537f);
    }

    public cr1(ml1[] ml1VarArr, int i10) {
        this(new ub0(), ml1VarArr);
    }
}
