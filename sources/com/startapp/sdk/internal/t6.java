package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t6 {
    public static void a(Context context, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd, t2 t2Var, s2 s2Var) {
        com.startapp.sdk.adsbase.f fVarA = diskAdCacheManager$DiskCachedAd.a();
        WeakHashMap weakHashMap = vi.f65408a;
        if (fVarA instanceof na) {
            na naVar = (na) fVarA;
            String strB = diskAdCacheManager$DiskCachedAd.b();
            if (strB == null || strB.equals("")) {
                a0.a(context, s2Var, null, true);
                return;
            }
            if (AdsCommonMetaData.k().G()) {
                ArrayList arrayListA = u0.a(strB, 0);
                ArrayList arrayList = new ArrayList();
                if (u0.a(context, arrayListA, 0, new HashSet(), arrayList).booleanValue()) {
                    ((Executor) com.startapp.sdk.components.a.a(context).A.a()).execute(new t0(context, arrayList).f65285c);
                    a0.a(context, s2Var, null, true);
                    return;
                }
            }
            p pVar = (p) com.startapp.sdk.components.a.a(context).M.a();
            pVar.f65058b.put(naVar.f64997b, strB);
            t2Var.f65292a.f65514o = naVar;
            ((rk) com.startapp.sdk.components.a.a(context).f64176c.a()).a(strB, new s6(context, s2Var, naVar));
            return;
        }
        if (!(fVarA instanceof wd)) {
            a0.a(context, s2Var, null, true);
            return;
        }
        wd wdVar = (wd) fVarA;
        List listA = wdVar.f64561a;
        if (listA == null) {
            a0.a(context, s2Var, null, true);
            return;
        }
        if (AdsCommonMetaData.k().G()) {
            listA = u0.a(context, listA, 0, new HashSet(), true);
        }
        if (listA.size() <= 0) {
            a0.a(context, s2Var, null, true);
            return;
        }
        t2Var.f65292a.f65514o = wdVar;
        ub ubVarA = ((vb) com.startapp.sdk.components.a.a(context).R.a()).a(wdVar.f65472b);
        ubVarA.getClass();
        ubVarA.f65343b = new ArrayList();
        ubVarA.f65344c = "";
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            rb rbVar = new rb((AdDetails) it.next());
            ubVarA.f65343b.add(rbVar);
            ubVarA.f65342a.a(rbVar.f65198a, ubVarA.f65343b.size() - 1, rbVar.f65206i);
        }
        a0.b(context, s2Var, wdVar, true);
    }
}
