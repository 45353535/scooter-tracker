package com.appodeal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ya {
    public static final ArrayList a(int i10) {
        la[] laVarArrValues = la.values();
        ArrayList arrayList = new ArrayList();
        for (la laVar : laVarArrValues) {
            if ((laVar.f13620c & i10) != 0) {
                arrayList.add(laVar);
            }
        }
        return arrayList;
    }
}
