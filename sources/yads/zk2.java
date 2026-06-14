package yads;

import android.os.SystemClock;
import android.view.View;
import com.ironsource.N6;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zk2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9 f118730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ al2 f118731c;

    public zk2(al2 al2Var, c9 c9Var) {
        this.f118731c = al2Var;
        this.f118730b = c9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r16;
        List listListOf;
        hi hiVarA;
        String str;
        dm1 dm1VarD;
        boolean z10 = false;
        if (this.f118731c.f108717d) {
            return;
        }
        c9 c9Var = this.f118730b;
        if (c9Var.f109283a.a()) {
            g02 g02Var = c9Var.f109284b;
            g02Var.f111013c.getClass();
            hr2 hr2VarA = g02Var.f111014d.a(g02Var.f111011a);
            if (hr2VarA == null || !hr2VarA.A || (((zw1) g02Var.f111012b).a(false) instanceof f93)) {
                al2 al2Var = this.f118731c;
                al2Var.f108717d = true;
                dl2 dl2Var = al2Var.f108715b;
                fl2 fl2Var = dl2Var.f109969c;
                if (fl2Var != null) {
                    fl2Var.f110780a = Long.valueOf(SystemClock.elapsedRealtime());
                }
                cl2 cl2Var = dl2Var.f109970d;
                Iterator it = cl2Var.f109458a.iterator();
                while (it.hasNext()) {
                    cl2Var.f109459b.a((String) it.next(), x53.f117719i);
                }
                bl2 bl2Var = cl2Var.f109460c;
                am2 am2VarA = bl2Var.f109039f.a(bl2Var.f109035b, bl2Var.f109034a);
                am2VarA.b(wl2.f117511a, N6.G1);
                b32 b32Var = bl2Var.f109040g;
                if (b32Var != null) {
                    Map map = b32Var.f108899a.a().f108722a;
                    fj fjVar = b32Var.f108900b;
                    fjVar.getClass();
                    HashMap map2 = new HashMap();
                    for (gi giVar : fjVar.f110736a) {
                        String str2 = giVar.f111213a;
                        boolean z11 = z10;
                        yz1 yz1Var = fjVar.f110737b;
                        if (yz1Var == null || (hiVarA = yz1Var.a(giVar)) == null || !hiVarA.b()) {
                            z10 = z11;
                        } else {
                            HashMap map3 = new HashMap();
                            fi3 fi3VarC = hiVarA.c();
                            if (fi3VarC != null) {
                                map3.put("width", Integer.valueOf(s73.a(fi3VarC.f110734a)));
                                map3.put("height", Integer.valueOf(s73.a(fi3VarC.f110735b)));
                            }
                            di1 di1Var = hiVarA instanceof di1 ? (di1) hiVarA : null;
                            if (di1Var != null) {
                                em1 em1Var = di1Var.f109935b;
                                dm1 dm1Var = (em1Var == null || (dm1VarD = em1Var.d()) == null) ? di1Var.f109934a != null ? dm1.f109977f : null : dm1VarD;
                                if (dm1Var != null && (str = dm1Var.f109980b) != null) {
                                    map3.put("value_type", str);
                                }
                            }
                            map2.put(str2, map3);
                            z10 = z11;
                        }
                    }
                    r16 = z10;
                    yz1 yz1Var2 = fjVar.f110737b;
                    View viewA = yz1Var2 != null ? yz1Var2.f118468b.a() : null;
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    if (viewA != null) {
                        mapCreateMapBuilder.put("width", Integer.valueOf(s73.a(viewA.getWidth())));
                        mapCreateMapBuilder.put("height", Integer.valueOf(s73.a(viewA.getHeight())));
                    }
                    Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                    if (!mapBuild.isEmpty()) {
                        map2.put("superview", mapBuild);
                    }
                    am2VarA.f108722a.putAll(MapsKt.plus(map, MapsKt.mapOf(TuplesKt.to(POBCoreNativeConstants.NATIVE_ASSETS, MapsKt.mapOf(TuplesKt.to("rendered", map2))))));
                } else {
                    r16 = 0;
                }
                mx2 mx2Var = bl2Var.f109034a.f109197d.f114071a;
                if (mx2Var != null) {
                    am2VarA.b(mx2Var.a().f113267b, "size_type");
                    am2VarA.b(Integer.valueOf(mx2Var.getWidth()), "width");
                    am2VarA.b(Integer.valueOf(mx2Var.getHeight()), "height");
                }
                hr2 hr2Var = bl2Var.f109038e;
                if (hr2Var != null) {
                    am2VarA.b(hr2Var.O, "banner_size_calculation_type");
                }
                int iOrdinal = bl2Var.f109036c.ordinal();
                if (iOrdinal == 0) {
                    xl2[] xl2VarArr = new xl2[2];
                    xl2VarArr[r16] = xl2.f117876m;
                    xl2VarArr[1] = xl2.f117875l;
                    listListOf = CollectionsKt.listOf((Object[]) xl2VarArr);
                } else if (iOrdinal == 1) {
                    listListOf = CollectionsKt.listOf(xl2.f117876m);
                } else {
                    if (iOrdinal != 2) {
                        throw new lf.m();
                    }
                    listListOf = CollectionsKt.listOf(xl2.f117875l);
                }
                Iterator it2 = listListOf.iterator();
                while (it2.hasNext()) {
                    bl2Var.f109037d.a(new zl2(((xl2) it2.next()).f117890b, MapsKt.toMutableMap(am2VarA.f108722a), am2VarA.f108723b));
                }
                e5 e5Var = dl2Var.f109967a;
                String str3 = e5Var.f110204a.f115645a;
                if (str3 != null && str3.length() != 0) {
                    d5 d5Var = e5Var.f110205b;
                    d5Var.getClass();
                    synchronized (d5.f109760c) {
                        d5Var.f109762a.remove(str3);
                        d5Var.f109762a.add(str3);
                    }
                }
                dl2Var.f109968b.f();
                return;
            }
        }
        al2 al2Var2 = this.f118731c;
        al2Var2.f108716c.postDelayed(new zk2(al2Var2, this.f118730b), 300L);
    }
}
