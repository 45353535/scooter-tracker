package yads;

import android.content.Context;
import android.view.View;
import com.ironsource.C4240b4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oy1 extends d22 implements jz1 {
    public final rw1 P;
    public final fz1 Q;
    public final hg2 R;
    public final v02 S;

    public oy1(Context context, rw1 rw1Var, fz1 fz1Var, hg2 hg2Var, mp mpVar, rx1 rx1Var) {
        super(context, mpVar, rx1Var);
        this.P = rw1Var;
        this.Q = fz1Var;
        this.R = hg2Var;
        v02 v02VarA = a(rw1Var, mpVar.d().a());
        this.S = v02VarA;
        a(v02VarA);
    }

    @Override // yads.jz1
    public final void a(e02 e02Var, gu guVar) {
        View view = e02Var.f110133c;
        m02 m02Var = new m02(e02Var);
        hg2 hg2Var = this.R;
        su.f115947a.getClass();
        a(view, hg2Var, m02Var, ru.f115596b, guVar);
    }

    @Override // yads.jz1
    public final k00 getAdAssets() {
        t00 t00Var;
        pv pvVar;
        z00 z00Var;
        t00 t00Var2;
        List list;
        fz1 fz1Var = this.Q;
        yw1 yw1Var = fz1Var.f110990f;
        rw1 rw1Var = fz1Var.f110985a;
        yw1Var.getClass();
        List<gi> list2 = rw1Var.f115624b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (gi giVar : list2) {
            Pair pair = TuplesKt.to(giVar.f111213a, giVar.f111215c);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Object obj = linkedHashMap.get("media");
        a10 a10Var = null;
        am1 am1Var = obj instanceof am1 ? (am1) obj : null;
        Object obj2 = linkedHashMap.get("favicon");
        d31 d31Var = obj2 instanceof d31 ? (d31) obj2 : null;
        Object obj3 = linkedHashMap.get("icon");
        d31 d31Var2 = obj3 instanceof d31 ? (d31) obj3 : null;
        Object obj4 = linkedHashMap.get("close_button");
        qv qvVar = obj4 instanceof qv ? (qv) obj4 : null;
        Object obj5 = linkedHashMap.get("age");
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = linkedHashMap.get("body");
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = linkedHashMap.get("call_to_action");
        String str3 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = linkedHashMap.get(C4240b4.j.D);
        String str4 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = linkedHashMap.get("price");
        String str5 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = linkedHashMap.get("rating");
        String str6 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = linkedHashMap.get("review_count");
        String str7 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = linkedHashMap.get("sponsored");
        String str8 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = linkedHashMap.get("title");
        String str9 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = linkedHashMap.get("warning");
        String str10 = obj14 instanceof String ? (String) obj14 : null;
        boolean z10 = linkedHashMap.get("feedback") != null;
        d31 d31Var3 = (am1Var == null || (list = am1Var.f108721c) == null) ? null : (d31) CollectionsKt.firstOrNull(list);
        ty1 ty1Var = yw1Var.f118415b;
        hg2 hg2Var = yw1Var.f118414a;
        ty1Var.getClass();
        m00 m00VarA = ty1.a(hg2Var, d31Var3);
        ty1 ty1Var2 = yw1Var.f118415b;
        hg2 hg2Var2 = yw1Var.f118414a;
        ty1Var2.getClass();
        m00 m00VarA2 = ty1.a(hg2Var2, d31Var);
        ty1 ty1Var3 = yw1Var.f118415b;
        hg2 hg2Var3 = yw1Var.f118414a;
        ty1Var3.getClass();
        m00 m00VarA3 = ty1.a(hg2Var3, d31Var2);
        gz1 gz1Var = yw1Var.f118416c;
        gz1Var.getClass();
        if (am1Var != null) {
            gb3 gb3Var = am1Var.f108720b;
            List list3 = am1Var.f108721c;
            ai1 ai1Var = am1Var.f108719a;
            if (gb3Var != null) {
                me3 me3Var = gz1Var.f111410a;
                xb3 xb3Var = (xb3) CollectionsKt.first(gb3Var.f111136a);
                me3Var.getClass();
                int i10 = ((a52) xb3Var.f117779d).f108565c;
                t00Var2 = new t00(i10 != 0 ? r1.f108564b / i10 : 1.7777778f);
            } else if (list3 == null || list3.size() <= 1) {
                if (ai1Var != null) {
                    t00Var2 = new t00(ai1Var.f108694b);
                }
                t00Var = null;
            } else {
                gz1Var.f111411b.getClass();
                t00Var2 = new t00((float) sv1.a(list3));
            }
            t00Var = t00Var2;
        } else {
            t00Var = null;
        }
        yw1Var.f118418e.getClass();
        if (qvVar != null && (pvVar = qvVar.f115174a) != null) {
            int iOrdinal = pvVar.ordinal();
            if (iOrdinal == 0) {
                z00Var = z00.f118481b;
            } else {
                if (iOrdinal != 1) {
                    throw new lf.m();
                }
                z00Var = z00.f118482c;
            }
            a10Var = new a10(z00Var, qvVar.f115175b);
        }
        yw1Var.f118417d.getClass();
        return new k00(t00Var, m00VarA2, m00VarA3, m00VarA, a10Var, str, str2, str3, str4, str5, w02.a(str6), str7, str8, str9, str10, z10);
    }

    @Override // yads.jz1
    public final xn2 getAdType() {
        return this.Q.f110985a.f115623a;
    }

    @Override // yads.jz1
    public final String getCampaignId() {
        return this.P.f115635m;
    }

    @Override // yads.jz1
    public final String getCreativeId() {
        return this.P.f115634l;
    }

    @Override // yads.jz1
    public final String getInfo() {
        return this.Q.f110985a.f115626d;
    }

    @Override // yads.d22, yads.jz1
    public final void loadImages() {
        fz1 fz1Var = this.Q;
        List listListOf = CollectionsKt.listOf(fz1Var.f110985a);
        k31 k31Var = fz1Var.f110989e;
        k31Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, k31Var.a(((rw1) it.next()).f115624b));
        }
        fz1Var.f110988d.a(linkedHashSet, new ez1(fz1Var));
    }

    @Override // yads.jz1
    public final void a(e02 e02Var) throws wy1 {
        this.S.f116827f = e02Var.f110135e;
        View view = e02Var.f110133c;
        m02 m02Var = new m02(e02Var);
        hg2 hg2Var = this.R;
        su.f115947a.getClass();
        a(view, hg2Var, m02Var, ru.f115596b);
    }

    public oy1(Context context, rw1 rw1Var, fz1 fz1Var, hg2 hg2Var, mp mpVar, rx1 rx1Var, int i10) {
        this(context, rw1Var, fz1Var, hg2Var, mpVar, rx1Var);
    }

    public final v02 a(rw1 rw1Var, c4 c4Var) {
        xn2 xn2Var = rw1Var.f115623a;
        return new v02(c4Var, xn2Var.f117917b, this.f109710i, this.f109711j, new ax2(rw1Var, new vn2(), new l9(), new iy()), null);
    }

    @Override // yads.jz1
    public final ec a() {
        return this.Q.f110985a.f115633k;
    }
}
