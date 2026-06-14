package o0;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c.a f96304a = c.a.a(CampaignEx.JSON_KEY_AD_K);

    static List a(p0.c cVar, d0.i iVar, float f10, n0 n0Var, boolean z10) {
        p0.c cVar2;
        d0.i iVar2;
        float f11;
        n0 n0Var2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == c.b.STRING) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.beginObject();
        while (cVar.hasNext()) {
            if (cVar.q(f96304a) != 0) {
                cVar.skipValue();
            } else if (cVar.o() == c.b.BEGIN_ARRAY) {
                cVar.beginArray();
                if (cVar.o() == c.b.NUMBER) {
                    p0.c cVar3 = cVar;
                    d0.i iVar3 = iVar;
                    float f12 = f10;
                    n0 n0Var3 = n0Var;
                    boolean z12 = z10;
                    r0.a aVarC = t.c(cVar3, iVar3, f12, n0Var3, false, z12);
                    cVar2 = cVar3;
                    iVar2 = iVar3;
                    f11 = f12;
                    n0Var2 = n0Var3;
                    z11 = z12;
                    arrayList.add(aVarC);
                } else {
                    cVar2 = cVar;
                    iVar2 = iVar;
                    f11 = f10;
                    n0Var2 = n0Var;
                    z11 = z10;
                    while (cVar2.hasNext()) {
                        arrayList.add(t.c(cVar2, iVar2, f11, n0Var2, true, z11));
                    }
                }
                cVar2.endArray();
                cVar = cVar2;
                iVar = iVar2;
                f10 = f11;
                n0Var = n0Var2;
                z10 = z11;
            } else {
                p0.c cVar4 = cVar;
                arrayList.add(t.c(cVar4, iVar, f10, n0Var, false, z10));
                cVar = cVar4;
            }
        }
        cVar.endObject();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i10;
        Object obj;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            r0.a aVar = (r0.a) list.get(i11);
            i11++;
            r0.a aVar2 = (r0.a) list.get(i11);
            aVar.f99192h = Float.valueOf(aVar2.f99191g);
            if (aVar.f99187c == null && (obj = aVar2.f99186b) != null) {
                aVar.f99187c = obj;
                if (aVar instanceof g0.i) {
                    ((g0.i) aVar).j();
                }
            }
        }
        r0.a aVar3 = (r0.a) list.get(i10);
        if ((aVar3.f99186b == null || aVar3.f99187c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
