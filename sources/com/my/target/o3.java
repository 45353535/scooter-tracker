package com.my.target;

import android.content.Context;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class o3 extends s {
    public static o3 a() {
        return new o3();
    }

    @Override // com.my.target.s
    public p3 a(p3 p3Var, j jVar, n nVar, Context context) {
        ArrayList arrayListC = p3Var.c();
        int size = arrayListC.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListC.get(i11);
            i11++;
            ((v5) obj).c();
        }
        ArrayList arrayList = new ArrayList();
        int size2 = arrayListC.size();
        while (i10 < size2) {
            Object obj2 = arrayListC.get(i10);
            i10++;
            Iterator it = ((v5) obj2).d().iterator();
            while (it.hasNext()) {
                c cVarA = ((s5) it.next()).a();
                if (cVarA != null) {
                    ImageData imageDataC = cVarA.c();
                    imageDataC.useCache(true);
                    arrayList.add(imageDataC);
                }
            }
        }
        if (arrayList.size() > 0) {
            a3.a(arrayList).a(context);
        }
        return p3Var;
    }
}
