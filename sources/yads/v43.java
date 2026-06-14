package yads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class v43 implements oq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v43 f116871e = new v43(new u43[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final nq f116872f = new nq() { // from class: yads.pr0
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return v43.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk2 f116874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116875d;

    public v43(u43... u43VarArr) {
        this.f116874c = y31.b(u43VarArr);
        this.f116873b = u43VarArr.length;
        a();
    }

    public final u43 a(int i10) {
        return (u43) this.f116874c.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v43.class == obj.getClass()) {
            v43 v43Var = (v43) obj;
            if (this.f116873b == v43Var.f116873b && this.f116874c.equals(v43Var.f116874c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f116875d == 0) {
            this.f116875d = this.f116874c.hashCode();
        }
        return this.f116875d;
    }

    public static v43 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return parcelableArrayList == null ? new v43(new u43[0]) : new v43((u43[]) pq.a(u43.f116493g, parcelableArrayList).toArray(new u43[0]));
    }

    public final void a() {
        int i10 = 0;
        while (i10 < this.f116874c.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f116874c.size(); i12++) {
                if (((u43) this.f116874c.get(i10)).equals(this.f116874c.get(i12))) {
                    uf1.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }
}
