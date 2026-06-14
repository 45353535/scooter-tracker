package o0;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96247a = c.a.a(CampaignEx.JSON_KEY_AD_K, "x", "y");

    public static k0.e a(p0.c cVar, d0.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.beginArray();
            while (cVar.hasNext()) {
                arrayList.add(z.a(cVar, iVar));
            }
            cVar.endArray();
            u.b(arrayList);
        } else {
            arrayList.add(new r0.a(s.e(cVar, q0.p.e())));
        }
        return new k0.e(arrayList);
    }

    static k0.o b(p0.c cVar, d0.i iVar) {
        cVar.beginObject();
        k0.e eVarA = null;
        k0.b bVarE = null;
        boolean z10 = false;
        k0.b bVarE2 = null;
        while (cVar.o() != c.b.END_OBJECT) {
            int iQ = cVar.q(f96247a);
            if (iQ == 0) {
                eVarA = a(cVar, iVar);
            } else if (iQ != 1) {
                if (iQ != 2) {
                    cVar.s();
                    cVar.skipValue();
                } else if (cVar.o() == c.b.STRING) {
                    cVar.skipValue();
                    z10 = true;
                } else {
                    bVarE = d.e(cVar, iVar);
                }
            } else if (cVar.o() == c.b.STRING) {
                cVar.skipValue();
                z10 = true;
            } else {
                bVarE2 = d.e(cVar, iVar);
            }
        }
        cVar.endObject();
        if (z10) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new k0.i(bVarE2, bVarE);
    }
}
