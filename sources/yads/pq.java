package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pq {
    public static nk2 a(nq nqVar, ArrayList arrayList) {
        v31 v31Var = y31.f118068c;
        uw.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            oq oqVarFromBundle = nqVar.fromBundle(bundle);
            oqVarFromBundle.getClass();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, r31.a(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = oqVarFromBundle;
            i10++;
            i11 = i12;
        }
        return y31.b(i11, objArrCopyOf);
    }
}
