package yads;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class ok1 implements oq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ok1 f114343d = new ok1(new nk1());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nq f114344e = new nq() { // from class: yads.a00
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return ok1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f114345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114346c;

    public ok1(nk1 nk1Var) {
        this.f114345b = nk1Var.f113949a;
        this.f114346c = nk1Var.f113950b;
    }

    public static ok1 a(Bundle bundle) {
        nk1 nk1Var = new nk1();
        nk1Var.f113949a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
        nk1Var.f113950b = bundle.getString(Integer.toString(1, 36));
        nk1Var.f113951c = bundle.getBundle(Integer.toString(2, 36));
        return new ok1(nk1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok1)) {
            return false;
        }
        ok1 ok1Var = (ok1) obj;
        return w83.a(this.f114345b, ok1Var.f114345b) && w83.a(this.f114346c, ok1Var.f114346c);
    }

    public final int hashCode() {
        Uri uri = this.f114345b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f114346c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
