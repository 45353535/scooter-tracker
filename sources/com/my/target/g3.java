package com.my.target;

import android.content.Context;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class g3 extends s {
    public static g3 a() {
        return new g3();
    }

    @Override // com.my.target.s
    public h3 a(h3 h3Var, j jVar, n nVar, Context context) {
        ImageData imageDataA;
        ImageData imageDataE;
        ArrayList arrayListC = h3Var.c();
        int size = arrayListC.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListC.get(i11);
            i11++;
            ((w3) obj).c();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListC2 = h3Var.c();
        int size2 = arrayListC2.size();
        while (i10 < size2) {
            Object obj2 = arrayListC2.get(i10);
            i10++;
            for (k0 k0Var : ((w3) obj2).d()) {
                c cVarA = k0Var.a();
                if (cVarA != null) {
                    ImageData imageDataC = cVarA.c();
                    imageDataC.useCache(true);
                    arrayList.add(imageDataC);
                }
                o1 o1VarQ = k0Var.Q();
                if (o1VarQ != null && (imageDataE = o1VarQ.e()) != null) {
                    imageDataE.useCache(true);
                    arrayList.add(imageDataE);
                }
                u8 u8VarU = k0Var.U();
                if (u8VarU != null && (imageDataA = u8VarU.a()) != null) {
                    imageDataA.useCache(true);
                    arrayList.add(imageDataA);
                }
            }
        }
        if (arrayList.size() > 0) {
            a3.a(arrayList).a(jVar.i(), (String) null).a(context);
        }
        return h3Var;
    }
}
