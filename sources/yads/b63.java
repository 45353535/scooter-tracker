package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class b63 implements oq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b63 f108915c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y31 f108916b;

    static {
        v31 v31Var = y31.f118068c;
        f108915c = new b63(nk2.f113952f);
        new nq() { // from class: yads.f3
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return b63.a(bundle);
            }
        };
    }

    public b63(y31 y31Var) {
        this.f108916b = y31.a((Collection) y31Var);
    }

    public final boolean a(int i10) {
        for (int i11 = 0; i11 < this.f108916b.size(); i11++) {
            a63 a63Var = (a63) this.f108916b.get(i11);
            if (a63Var.b() && a63Var.a() == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b63.class != obj.getClass()) {
            return false;
        }
        return this.f108916b.equals(((b63) obj).f108916b);
    }

    public final int hashCode() {
        return this.f108916b.hashCode();
    }

    public static b63 a(Bundle bundle) {
        nk2 nk2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            v31 v31Var = y31.f118068c;
            nk2VarA = nk2.f113952f;
        } else {
            nk2VarA = pq.a(a63.f108580g, parcelableArrayList);
        }
        return new b63(nk2VarA);
    }
}
