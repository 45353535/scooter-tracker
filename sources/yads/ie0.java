package yads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ie0 extends c53 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public ie0() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    public final void a() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    public final void b(boolean z10) {
        this.I = z10;
    }

    public final void c(boolean z10) {
        this.F = z10;
    }

    public final void d(boolean z10) {
        this.G = z10;
    }

    public final void e(boolean z10) {
        this.M = z10;
    }

    public final void f(boolean z10) {
        this.D = z10;
    }

    public final void g(boolean z10) {
        this.B = z10;
    }

    public final void h(boolean z10) {
        this.C = z10;
    }

    public final void i(boolean z10) {
        this.J = z10;
    }

    public final void j(boolean z10) {
        this.E = z10;
    }

    public final void k(boolean z10) {
        this.K = z10;
    }

    public final void l(boolean z10) {
        this.A = z10;
    }

    public final void m(boolean z10) {
        this.L = z10;
    }

    @Override // yads.c53
    public final void b(Context context) {
        Point pointC = w83.c(context);
        a(pointC.x, pointC.y);
    }

    public ie0(Context context) {
        super(context);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    public ie0(Bundle bundle) {
        super(bundle);
        a();
        je0 je0Var = je0.R;
        l(bundle.getBoolean(d53.a(1000), je0Var.C));
        g(bundle.getBoolean(d53.a(1001), je0Var.D));
        h(bundle.getBoolean(d53.a(1002), je0Var.E));
        f(bundle.getBoolean(d53.a(1014), je0Var.F));
        j(bundle.getBoolean(d53.a(1003), je0Var.G));
        c(bundle.getBoolean(d53.a(1004), je0Var.H));
        d(bundle.getBoolean(d53.a(1005), je0Var.I));
        a(bundle.getBoolean(d53.a(1006), je0Var.J));
        b(bundle.getBoolean(d53.a(1015), je0Var.K));
        i(bundle.getBoolean(d53.a(1016), je0Var.L));
        k(bundle.getBoolean(d53.a(1007), je0Var.M));
        m(bundle.getBoolean(d53.a(1008), je0Var.N));
        e(bundle.getBoolean(d53.a(1009), je0Var.O));
        this.N = new SparseArray();
        a(bundle);
        this.O = a(bundle.getIntArray(d53.a(1013)));
    }

    public static SparseBooleanArray a(int[] iArr) {
        if (iArr == null) {
            return new SparseBooleanArray();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
        for (int i10 : iArr) {
            sparseBooleanArray.append(i10, true);
        }
        return sparseBooleanArray;
    }

    public final void a(boolean z10) {
        this.H = z10;
    }

    @Override // yads.c53
    public final void a(Context context) {
        super.a(context);
    }

    public final void a(Bundle bundle) {
        nk2 nk2VarA;
        SparseArray sparseArray;
        int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1011, 36));
        if (parcelableArrayList == null) {
            v31 v31Var = y31.f118068c;
            nk2VarA = nk2.f113952f;
        } else {
            nk2VarA = pq.a(v43.f116872f, parcelableArrayList);
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
        if (sparseParcelableArray == null) {
            sparseArray = new SparseArray();
        } else {
            nq nqVar = ke0.f112690e;
            SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
            for (int i10 = 0; i10 < sparseParcelableArray.size(); i10++) {
                sparseArray2.put(sparseParcelableArray.keyAt(i10), nqVar.fromBundle((Bundle) sparseParcelableArray.valueAt(i10)));
            }
            sparseArray = sparseArray2;
        }
        if (intArray == null || intArray.length != nk2VarA.f113954e) {
            return;
        }
        for (int i11 = 0; i11 < intArray.length; i11++) {
            int i12 = intArray[i11];
            v43 v43Var = (v43) nk2VarA.get(i11);
            ke0 ke0Var = (ke0) sparseArray.get(i11);
            Map map = (Map) this.N.get(i12);
            if (map == null) {
                map = new HashMap();
                this.N.put(i12, map);
            }
            if (!map.containsKey(v43Var) || !w83.a(map.get(v43Var), ke0Var)) {
                map.put(v43Var, ke0Var);
            }
        }
    }

    @Override // yads.c53
    public final c53 a(int i10, int i11) {
        this.f109234i = i10;
        this.f109235j = i11;
        this.f109236k = true;
        return this;
    }
}
