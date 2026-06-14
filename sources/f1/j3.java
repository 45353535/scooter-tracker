package f1;

import com.amazon.device.ads.DtbConstants;
import f1.ga;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f70147a;

    public j3(w2 w2Var) {
        this.f70147a = w2Var;
    }

    public List a(ga.b bVar) {
        HashMap mapA = this.f70147a.a();
        List<j1.d> listB = b(mapA);
        ArrayList arrayList = new ArrayList();
        HashSet hashSetD = d(bVar);
        if (hashSetD != null) {
            for (j1.d dVar : listB) {
                if (c(hashSetD, dVar)) {
                    arrayList.add(dVar);
                }
            }
        } else {
            if (mapA.containsKey(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY)) {
                arrayList.add((j1.d) mapA.get(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY));
            }
            if (mapA.containsKey("coppa")) {
                arrayList.add((j1.d) mapA.get("coppa"));
            }
            if (mapA.containsKey("lgpd")) {
                arrayList.add((j1.d) mapA.get("lgpd"));
            }
        }
        return arrayList;
    }

    public final List b(HashMap map) {
        HashMap map2 = new HashMap(map);
        map2.remove("gdpr");
        return new ArrayList(map2.values());
    }

    public final boolean c(HashSet hashSet, j1.d dVar) {
        if (hashSet.contains(dVar.a())) {
            return true;
        }
        eg.i("DataUseConsent " + dVar.a() + " is not whitelisted.", null);
        return false;
    }

    public final HashSet d(ga.b bVar) {
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }
}
