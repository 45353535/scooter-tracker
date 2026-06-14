package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import com.bytedance.sdk.component.adexpress.dynamic.mzz.ud;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    public static float qdl(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<ud.qdl> qdl(float f10, List<ud.qdl> list) {
        ArrayList<ud.qdl> arrayList = new ArrayList();
        Iterator<ud.qdl> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((ud.qdl) it.next().clone());
        }
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        for (ud.qdl qdlVar : arrayList) {
            if (qdlVar.f16398ud) {
                i10 = (int) (i10 + qdlVar.qdl);
            } else {
                i11 = (int) (i11 + qdlVar.qdl);
                z10 = false;
            }
        }
        if (!z10 || f10 <= i10) {
            float f11 = i10;
            float f12 = f10 < f11 ? f10 / f11 : 1.0f;
            float f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = false;
                for (ud.qdl qdlVar2 : arrayList) {
                    if (!qdlVar2.f16398ud) {
                        float f14 = qdlVar2.lnr;
                        if (f14 != 0.0f && qdlVar2.qdl * f13 > f14) {
                            qdlVar2.qdl = f14;
                            qdlVar2.f16398ud = true;
                            z11 = true;
                        }
                    }
                    arrayList2.add(qdlVar2);
                }
                if (z11) {
                    return qdl(f10, arrayList2);
                }
            }
            int i12 = 0;
            for (ud.qdl qdlVar3 : arrayList) {
                if (qdlVar3.f16398ud) {
                    qdlVar3.qdl = qdl(qdlVar3.qdl * f12);
                } else {
                    qdlVar3.qdl = qdl(qdlVar3.qdl * f13);
                }
                i12 = (int) (i12 + qdlVar3.qdl);
            }
            float f15 = i12;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int size = 0; size < arrayList.size() && f16 > 0.0f; size = (size + 1) % arrayList.size()) {
                    ud.qdl qdlVar4 = (ud.qdl) arrayList.get(size);
                    if ((f10 < f11 && qdlVar4.f16398ud) || (f10 > f11 && !qdlVar4.f16398ud)) {
                        qdlVar4.qdl += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
