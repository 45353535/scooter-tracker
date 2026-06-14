package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class qf0 implements oq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114982d;

    static {
        new nq() { // from class: yads.uf0
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return qf0.a(bundle);
            }
        };
    }

    public qf0(int i10, int i11, int i12) {
        this.f114980b = i10;
        this.f114981c = i11;
        this.f114982d = i12;
    }

    public static qf0 a(Bundle bundle) {
        return new qf0(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return this.f114980b == qf0Var.f114980b && this.f114981c == qf0Var.f114981c && this.f114982d == qf0Var.f114982d;
    }

    public final int hashCode() {
        return ((((this.f114980b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f114981c) * 31) + this.f114982d;
    }
}
