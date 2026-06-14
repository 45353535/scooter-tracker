package yads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d22 {
    public final fj A;
    public final t53 B;
    public final m62 C;
    public final f20 D;
    public final gy1 E;
    public final String F;
    public final fv1 G;
    public final n53 H;
    public final w3 I;
    public final pu J;
    public final ni K;
    public yz1 L;
    public final a22 M;
    public final List N;
    public final r22 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f109702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rx1 f109703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w52 f109704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z32 f109705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y52 f109706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final es2 f109707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jy1 f109708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c4 f109709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t9 f109710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qz1 f109711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zv2 f109712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u12 f109713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u00 f109714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b33 f109715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g41 f109716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fq f109717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a02 f109718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mm1 f109719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ui f109720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l41 f109721t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final el2 f109722u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final tp f109723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ho0 f109724w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tw1 f109725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fk2 f109726y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final io0 f109727z;

    public /* synthetic */ d22(Context context, mp mpVar, rx1 rx1Var) {
        w52 w52VarH = mpVar.h();
        z32 z32VarG = mpVar.g();
        y52 y52VarI = mpVar.i();
        dx1 dx1VarD = mpVar.d();
        es2 es2VarJ = mpVar.j();
        jy1 jy1VarE = mpVar.e();
        s12 s12VarC = mpVar.c();
        g02 g02VarB = mpVar.b();
        rw1 rw1VarF = mpVar.f();
        ta taVarA = mpVar.a();
        c4 c4VarA = dx1VarD.a();
        qz qzVarA = c4VarA.a();
        t9 t9VarB = dx1VarD.b();
        qz1 qz1VarC = dx1VarD.c();
        List listB = y52VarI.b();
        String strA = y52VarI.a();
        zv2 zv2VarB = qz1VarC.b();
        u12 u12Var = new u12();
        u00 u00Var = new u00(u12Var);
        b33 b33Var = new b33();
        g41 g41Var = new g41();
        t72 t72Var = new t72();
        jb2 jb2VarA = jb2.f112281h.a(context);
        fl2 fl2Var = new fl2();
        fq fqVar = new fq();
        j41 j41Var = new j41();
        n5 n5VarA = jy1VarE.a();
        Object obj = a02.f108504b;
        a02 a02VarA = zz1.a();
        mm1 mm1Var = new mm1(context, c4VarA, es2VarJ);
        c9 c9Var = new c9(new j02(z32VarG), g02VarB);
        ui uiVar = new ui(listB);
        this(context, rx1Var, w52VarH, z32VarG, y52VarI, es2VarJ, jy1VarE, s12VarC, rw1VarF, taVarA, c4VarA, t9VarB, qz1VarC, listB, zv2VarB, u12Var, u00Var, b33Var, g41Var, t72Var, jb2VarA, fl2Var, fqVar, j41Var, a02VarA, mm1Var, c9Var, uiVar, new s22(uiVar), new l41(context, t9VarB, c4VarA, es2VarJ, y52VarI.c()), new el2(listB), new tp(n5VarA, qzVarA, t9VarB, strA, ((pr3) es2VarJ).a()), new ho0(context, es2VarJ, n5VarA, qzVarA, t9VarB, strA), new tw1(context, es2VarJ, n5VarA, qzVarA, strA), new fk2(context, es2VarJ, n5VarA, qzVarA, t9VarB, strA), new io0(listB), new fj(listB), new e5(new ry1(strA)), new t53(), new m62(c4VarA, t9VarB, listB), new f20(context, c4VarA, es2VarJ, rw1VarF != null ? rw1VarF.a() : null));
    }

    public final qz1 b() {
        return this.f109711j;
    }

    public final r22 c() {
        return this.O;
    }

    public final List d() {
        return this.N;
    }

    public final void destroy() {
        yz1 yz1Var = this.L;
        if (yz1Var != null) {
            for (hi hiVar : yz1Var.f118469c.values()) {
                if (hiVar != null) {
                    hiVar.destroy();
                }
            }
        }
    }

    public final z32 e() {
        return this.f109705d;
    }

    public final void f() {
        h();
        t53 t53Var = this.B;
        Context context = this.f109702a;
        u53 u53Var = t53Var.f116079d;
        if (u53Var != null) {
            ((z0) u53Var.f116531b).b(context, u53Var);
        }
        t53Var.f116079d = null;
        h02 h02Var = t53Var.f116080e;
        if (h02Var != null) {
            h02Var.b();
        }
        t53Var.f116080e = null;
        yz1 yz1Var = this.L;
        if (yz1Var != null) {
            this.f109704c.a(yz1Var);
            this.H.a(yz1Var);
            this.A.f110737b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r4 = this;
            yads.yz1 r0 = r4.L
            if (r0 == 0) goto L12
            android.view.View r0 = r0.b()
            if (r0 == 0) goto L12
            boolean r0 = r0.isAttachedToWindow()
            r1 = 1
            if (r0 != r1) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            boolean r0 = yads.lb1.f113032a
            if (r1 == 0) goto L22
            yads.n53 r0 = r4.H
            android.content.Context r1 = r4.f109702a
            yads.a22 r2 = r4.M
            yads.yz1 r3 = r4.L
            r0.a(r1, r2, r3)
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.d22.g():void");
    }

    public final void h() {
        boolean z10 = lb1.f113032a;
        this.H.a(this.M);
    }

    public abstract void loadImages();

    public final void a(View view, hg2 hg2Var, m02 m02Var, su suVar) throws wy1 {
        d22 d22Var;
        a02 a02Var = this.f109718q;
        a02Var.getClass();
        synchronized (a02.f108504b) {
            d22Var = (d22) a02Var.f108506a.get(view);
        }
        if (Intrinsics.areEqual(this, d22Var)) {
            return;
        }
        if (d22Var != null) {
            d22Var.f();
        }
        a(this, this.f109718q);
        this.f109718q.a(view, this);
        a(new yz1(m02Var, this.f109709h, this.f109707f, hg2Var, this.f109716o, suVar, this.f109708g, this.f109720s, this.O, this.f109713l, this.f109710i, this.f109706e, this.f109703b, this.f109719r, this.f109712k, this.D));
        a(view);
    }

    public final void b(yz1 yz1Var) {
        this.f109704c.a(yz1Var, this.J);
        boolean z10 = Intrinsics.areEqual(this.f109710i.b(), f22.f110586c.a()) || Intrinsics.areEqual(this.f109710i.b(), f22.f110587d.a());
        if (this.C.a() && !z10) {
            loadImages();
        }
        List list = this.f109722u.f110418a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            hi hiVarA = yz1Var.a((gi) obj);
            if (hiVarA != null && hiVarA.b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gi) it.next()).f111213a);
        }
        this.f109725x.a(arrayList2, xl2.f117887x);
        boolean z11 = lb1.f113032a;
        g();
    }

    public final void a(yz1 yz1Var) throws wy1 {
        yz1Var.a();
        this.f109726y.a();
        this.f109717p.getClass();
        Map map = yz1Var.f118469c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            hi hiVar = (hi) entry.getValue();
            if (hiVar != null && hiVar.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        this.f109725x.a(arrayList, xl2.f117886w);
        List list = this.f109727z.f112067a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((gi) obj).f111218f) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            hi hiVarA = yz1Var.a((gi) obj2);
            if (hiVarA == null || !hiVarA.b()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((gi) it2.next()).f111213a);
        }
        if (!arrayList4.isEmpty()) {
            ho0 ho0Var = this.f109724w;
            am2 am2VarA = ho0Var.f111645b.a();
            am2VarA.b("no_view_for_asset", "reason");
            am2VarA.b(arrayList4, POBCoreNativeConstants.NATIVE_ASSETS);
            Map map2 = ho0Var.f111644a.f116128u;
            if (map2 != null) {
                am2VarA.f108722a.putAll(map2);
            }
            c cVar = ho0Var.f111644a.f116116i;
            am2VarA.f108723b = cVar;
            ho0Var.f111646c.a(new zl2(xl2.A.a(), MapsKt.toMutableMap(am2VarA.f108722a), cVar));
        }
        this.L = yz1Var;
        this.A.a(yz1Var);
        ((xz1) this.f109705d).a(yz1Var);
        fn2 fn2VarB = ((xz1) this.f109705d).b();
        if (fn2VarB.a()) {
            this.f109704c.a(yz1Var);
            b(yz1Var);
            return;
        }
        String strB = fn2VarB.b();
        this.f109723v.a(strB);
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format("Resource for required view " + strB + " is not present", Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        throw new wy1(str);
    }

    public d22(Context context, rx1 rx1Var, w52 w52Var, z32 z32Var, y52 y52Var, es2 es2Var, jy1 jy1Var, s12 s12Var, rw1 rw1Var, ta taVar, c4 c4Var, t9 t9Var, qz1 qz1Var, List list, zv2 zv2Var, u12 u12Var, u00 u00Var, b33 b33Var, g41 g41Var, t72 t72Var, jb2 jb2Var, fl2 fl2Var, fq fqVar, j41 j41Var, a02 a02Var, mm1 mm1Var, c9 c9Var, ui uiVar, s22 s22Var, l41 l41Var, el2 el2Var, tp tpVar, ho0 ho0Var, tw1 tw1Var, fk2 fk2Var, io0 io0Var, fj fjVar, e5 e5Var, t53 t53Var, m62 m62Var, f20 f20Var) {
        this.f109702a = context;
        this.f109703b = rx1Var;
        this.f109704c = w52Var;
        this.f109705d = z32Var;
        this.f109706e = y52Var;
        this.f109707f = es2Var;
        this.f109708g = jy1Var;
        this.f109709h = c4Var;
        this.f109710i = t9Var;
        this.f109711j = qz1Var;
        this.f109712k = zv2Var;
        this.f109713l = u12Var;
        this.f109714m = u00Var;
        this.f109715n = b33Var;
        this.f109716o = g41Var;
        this.f109717p = fqVar;
        this.f109718q = a02Var;
        this.f109719r = mm1Var;
        this.f109720s = uiVar;
        this.f109721t = l41Var;
        this.f109722u = el2Var;
        this.f109723v = tpVar;
        this.f109724w = ho0Var;
        this.f109725x = tw1Var;
        this.f109726y = fk2Var;
        this.f109727z = io0Var;
        this.A = fjVar;
        this.B = t53Var;
        this.C = m62Var;
        this.D = f20Var;
        gy1 gy1VarA = jy1Var.b().a(context, c4Var, t9Var);
        this.E = gy1VarA;
        String strA = rb.a(this);
        this.F = strA;
        this.M = new a22(this);
        b22 b22Var = new b22(this);
        this.N = qz1Var.a();
        this.O = s22Var.a();
        j41Var.getClass();
        i41 i41VarA = j41.a(context, gy1VarA, l41Var, e5Var, g41Var);
        List listE = y52Var.e();
        i41VarA.a(listE, y52Var.c());
        w3 w3Var = new w3(context, es2Var, t9Var, c4Var, gy1VarA, b33Var);
        this.I = w3Var;
        this.J = new pu(w3Var, fl2Var, g41Var);
        fv1 fv1VarA = t72Var.a(context, c4Var, es2Var, l41Var, b22Var, strA, taVar);
        this.G = fv1VarA;
        s12Var.a(g41Var);
        g41Var.a(new r72(fv1VarA));
        n53 n53VarA = jy1Var.d().a(fv1VarA, new dl2(context, c9Var, t9Var, c4Var, es2Var, taVar, e5Var, g41Var, fl2Var, y52Var.d()), new u41(z32Var, listE), jb2Var);
        this.H = n53VarA;
        n53VarA.a(g41Var);
        n53VarA.a(t9Var, listE);
        this.K = new ni(list, w3Var, fl2Var, g41Var, rw1Var != null ? rw1Var.a() : null);
    }

    public void a(l00 l00Var) {
        this.E.f111398a.f112184b = l00Var;
    }

    public final void a(v02 v02Var) {
        this.I.f117295g.f113262e = v02Var;
        this.f109721t.f112965h = v02Var;
        f1 f1Var = this.E.f111399b;
        f1Var.f110578g = v02Var;
        f1Var.f110577f.f110150b.f111830k = v02Var;
        this.H.a(new b32(v02Var, this.A));
        this.f109723v.f116315c.f108700e = v02Var;
        this.f109724w.f111645b.f108700e = v02Var;
        this.f109725x.f116403b.f108700e = v02Var;
        this.f109726y.f110752c.f108700e = v02Var;
    }

    public final void a(View view) {
        z0 z0Var;
        t53 t53Var = this.B;
        c22 c22Var = new c22(this);
        t53Var.getClass();
        Context context = view.getContext();
        u53 u53Var = t53Var.f116079d;
        if (u53Var != null) {
            ((z0) u53Var.f116531b).b(context, u53Var);
        }
        Activity activity = null;
        t53Var.f116079d = null;
        h02 h02Var = t53Var.f116080e;
        if (h02Var != null) {
            h02Var.b();
        }
        t53Var.f116080e = null;
        a1 a1Var = t53Var.f116076a;
        Context context2 = view.getContext();
        a1Var.getClass();
        int i10 = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i11 = i10 + 1;
            if (i10 >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i10 = i11;
            }
        }
        if (activity != null) {
            t53Var.f116078c.getClass();
            Object obj = z0.f118474f;
            z0 z0Var2 = z0.f118475g;
            if (z0Var2 == null) {
                synchronized (z0.f118474f) {
                    z0Var = z0.f118475g;
                    if (z0Var == null) {
                        z0Var = new z0();
                        z0.f118475g = z0Var;
                    }
                }
                z0Var2 = z0Var;
            }
            u53 u53Var2 = new u53(activity, c22Var, z0Var2);
            t53Var.f116079d = u53Var2;
            z0Var2.a(activity, u53Var2);
        }
        t53Var.f116077b.getClass();
        h02 h02Var2 = new h02(view, c22Var, new c02());
        t53Var.f116080e = h02Var2;
        h02Var2.a();
    }

    public static void a(d22 d22Var, a02 a02Var) {
        boolean z10;
        a02Var.getClass();
        synchronized (a02.f108504b) {
            Iterator it = a02Var.f108506a.entrySet().iterator();
            z10 = false;
            while (it.hasNext()) {
                if (((d22) ((Map.Entry) it.next()).getValue()) == d22Var) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        if (z10) {
            d22Var.f();
        }
    }

    public final void a(View view, hg2 hg2Var, m02 m02Var, su suVar, gu guVar) {
        d22 d22Var;
        Object obj = a02.f108504b;
        a02 a02VarA = zz1.a();
        synchronized (a02.f108504b) {
            d22Var = (d22) a02VarA.f108506a.get(view);
        }
        if (Intrinsics.areEqual(this, d22Var)) {
            return;
        }
        if (d22Var != null) {
            d22Var.f();
        }
        a(this, a02VarA);
        a02VarA.a(view, this);
        yz1 yz1Var = new yz1(m02Var, this.f109709h, this.f109707f, hg2Var, this.f109716o, suVar, this.f109708g, this.f109720s, this.O, this.f109713l, this.f109710i, this.f109706e, this.f109703b, this.f109719r, this.f109712k, this.D);
        yz1Var.a();
        this.L = yz1Var;
        this.A.f110737b = yz1Var;
        ((xz1) this.f109705d).a(yz1Var);
        this.f109704c.a(yz1Var);
        ni niVar = this.K;
        guVar.f111338a = new mi(suVar, niVar.f113913a, niVar.f113914b, yz1Var, niVar.f113915c, niVar.f113916d, niVar.f113917e);
        b(yz1Var);
        a(view);
    }
}
