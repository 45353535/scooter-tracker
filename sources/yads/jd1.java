package yads;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f112315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy f112316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f112317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2 f112319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c4 f112320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final es2 f112321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kd1 f112322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m30 f112323i;

    public /* synthetic */ jd1(Context context, t9 t9Var, wy wyVar, b2 b2Var, int i10, q2 q2Var, c4 c4Var, es2 es2Var) {
        this(t9Var, wyVar, b2Var, i10, q2Var, c4Var, es2Var, new kd1(), new n30(context, es2Var, new vn2().b(t9Var, c4Var)).a());
    }

    public final id1 a(Context context, ViewGroup viewGroup, jz1 jz1Var, l00 l00Var, y3 y3Var, dp2 dp2Var, w33 w33Var, xg0 xg0Var, oh0 oh0Var, h7 h7Var) {
        c4 c4Var = this.f112320f;
        es2 es2Var = this.f112321g;
        t9 t9Var = this.f112315a;
        f2 f2Var = this.f112319e;
        int i10 = this.f112318d;
        List listA = (t9Var.f116108a == qz.f115223f ? new mp2(new ip2(c4Var, es2Var, f2Var, i10)) : new zb1(es2Var, new yb1(c4Var, es2Var, f2Var, i10), new px1())).a(context, this.f112315a, jz1Var, this.f112316b, this.f112317c, this.f112323i, y3Var, dp2Var, w33Var, xg0Var, oh0Var, h7Var);
        kd1 kd1Var = this.f112322h;
        t9 t9Var2 = this.f112315a;
        wy wyVar = this.f112316b;
        kd1Var.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            t9 t9Var3 = t9Var2;
            wy wyVar2 = wyVar;
            arrayList.add(((hx0) it.next()).a(context, t9Var3, jz1Var, wyVar2, l00Var));
            t9Var2 = t9Var3;
            wyVar = wyVar2;
        }
        return new id1(context, viewGroup, new hd1(arrayList), new fd1(), new ed1());
    }

    public jd1(t9 t9Var, wy wyVar, b2 b2Var, int i10, q2 q2Var, c4 c4Var, es2 es2Var, kd1 kd1Var, m30 m30Var) {
        this.f112315a = t9Var;
        this.f112316b = wyVar;
        this.f112317c = b2Var;
        this.f112318d = i10;
        this.f112319e = q2Var;
        this.f112320f = c4Var;
        this.f112321g = es2Var;
        this.f112322h = kd1Var;
        this.f112323i = m30Var;
    }

    public final ArrayList a(Context context, ExtendedNativeAdView extendedNativeAdView, jz1 jz1Var, l00 l00Var, d7 d7Var, dp2 dp2Var, nh2 nh2Var, g7 g7Var, ArrayList arrayList, oh0 oh0Var, a7 a7Var, vv vvVar) {
        id1 id1VarA;
        if (jz1Var instanceof i12) {
            i12 i12Var = (i12) jz1Var;
            List list = a7Var.f108586a;
            ArrayList arrayListI = i12Var.i();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayListI.size();
            for (int i10 = 0; i10 < size; i10++) {
                h7 h7Var = (h7) CollectionsKt.getOrNull(list, i10);
                arrayList2.add(a(context, extendedNativeAdView, (jz1) arrayListI.get(i10), new a23(l00Var), d7Var, dp2Var, new w33(nh2Var, new b7(list), new f7(h7Var != null ? h7Var.f111499a : 0L), new c7(a7Var, i10), vvVar), g7Var, arrayList != null ? (oh0) CollectionsKt.getOrNull(arrayList, i10) : null, h7Var));
            }
            h7 h7Var2 = (h7) CollectionsKt.getOrNull(list, arrayListI.size());
            id1VarA = oh0Var != null ? a(context, extendedNativeAdView, i12Var, l00Var, d7Var, dp2Var, new w33(nh2Var, new b7(list), new f7(h7Var2 != null ? h7Var2.f111499a : 0L), new s92(), vvVar), g7Var, oh0Var, h7Var2) : null;
            if (id1VarA != null) {
                arrayList2.add(id1VarA);
            }
            return arrayList2;
        }
        List list2 = a7Var.f108586a;
        ArrayList arrayList3 = new ArrayList();
        b7 b7Var = new b7(list2);
        h7 h7Var3 = (h7) CollectionsKt.firstOrNull(list2);
        arrayList3.add(a(context, extendedNativeAdView, jz1Var, l00Var, d7Var, dp2Var, new w33(nh2Var, b7Var, new f7(h7Var3 != null ? h7Var3.f111499a : 0L), new c7(a7Var, 0), vvVar), g7Var, arrayList != null ? (oh0) CollectionsKt.firstOrNull((List) arrayList) : null, (h7) CollectionsKt.firstOrNull(list2)));
        h7 h7Var4 = (h7) CollectionsKt.getOrNull(list2, 1);
        id1VarA = oh0Var != null ? a(context, extendedNativeAdView, jz1Var, l00Var, d7Var, dp2Var, new w33(nh2Var, new b7(list2), new f7(h7Var4 != null ? h7Var4.f111499a : 0L), new s92()), g7Var, oh0Var, h7Var4) : null;
        if (id1VarA != null) {
            arrayList3.add(id1VarA);
        }
        return arrayList3;
    }
}
