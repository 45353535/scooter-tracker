package yads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a41 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f108548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f108549c;

    public a41(b41 b41Var) {
        sk2 sk2Var = (sk2) b41Var;
        Object[] objArr = new Object[sk2Var.size()];
        Object[] objArr2 = new Object[sk2Var.size()];
        w73 it = sk2Var.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i10] = entry.getKey();
            objArr2[i10] = entry.getValue();
            i10++;
        }
        this.f108548b = objArr;
        this.f108549c = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f108548b;
        int i10 = 0;
        if (objArr instanceof d41) {
            d41 d41Var = (d41) objArr;
            s31 s31Var = (s31) this.f108549c;
            Object[] objArrCopyOf = new Object[d41Var.size() * 2];
            w73 it = d41Var.iterator();
            w73 it2 = s31Var.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                int i11 = i10 + 1;
                int i12 = i11 * 2;
                if (i12 > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, r31.a(objArrCopyOf.length, i12));
                }
                uw.a(next, next2);
                int i13 = i10 * 2;
                objArrCopyOf[i13] = next;
                objArrCopyOf[i13 + 1] = next2;
                i10 = i11;
            }
            return sk2.a(i10, objArrCopyOf);
        }
        Object[] objArr2 = this.f108549c;
        Object[] objArrCopyOf2 = new Object[objArr.length * 2];
        int i14 = 0;
        while (i10 < objArr.length) {
            Object[] objArr3 = objArr[i10];
            Object obj = objArr2[i10];
            int i15 = i14 + 1;
            int i16 = i15 * 2;
            if (i16 > objArrCopyOf2.length) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, r31.a(objArrCopyOf2.length, i16));
            }
            uw.a(objArr3, obj);
            int i17 = i14 * 2;
            objArrCopyOf2[i17] = objArr3;
            objArrCopyOf2[i17 + 1] = obj;
            i10++;
            i14 = i15;
            objArrCopyOf2 = objArrCopyOf2;
        }
        return sk2.a(i14, objArrCopyOf2);
    }
}
