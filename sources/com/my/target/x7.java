package com.my.target;

import android.content.Context;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class x7 extends s {
    public static x7 a() {
        return new x7();
    }

    @Override // com.my.target.s
    public y7 a(y7 y7Var, j jVar, n nVar, Context context) {
        if (jVar.e() > 0 && !y7Var.m() && y7Var.j() != null) {
            w1 w1VarB = w1.b(context);
            int i10 = jVar.i();
            if (w1VarB != null) {
                w1VarB.a(i10, y7Var.j().toString(), false);
            } else {
                gb.a("NativeAppwallAdResultProcessor: Unable to open disk cache and save data for slotId " + i10);
            }
        }
        int iF = jVar.f();
        if (iF == 0 || iF == 1) {
            ArrayList arrayList = new ArrayList();
            for (s7 s7Var : y7Var.c()) {
                ImageData imageDataY = s7Var.Y();
                ImageData imageDataO = s7Var.O();
                ImageData imageDataS = s7Var.S();
                ImageData imageDataQ = s7Var.q();
                ImageData imageDataU = s7Var.U();
                ImageData imageDataL = s7Var.L();
                ImageData imageDataT = s7Var.T();
                ImageData imageDataR = s7Var.R();
                if (imageDataY != null) {
                    arrayList.add(imageDataY);
                }
                if (imageDataO != null) {
                    arrayList.add(imageDataO);
                }
                if (imageDataS != null) {
                    arrayList.add(imageDataS);
                }
                if (imageDataQ != null) {
                    arrayList.add(imageDataQ);
                }
                if (imageDataU != null) {
                    arrayList.add(imageDataU);
                }
                if (imageDataL != null) {
                    arrayList.add(imageDataL);
                }
                if (imageDataT != null) {
                    arrayList.add(imageDataT);
                }
                if (imageDataR != null) {
                    arrayList.add(imageDataR);
                }
            }
            if (arrayList.size() > 0) {
                a3.a(arrayList).a(jVar.i(), (String) null).a(context);
            }
        }
        return y7Var;
    }
}
