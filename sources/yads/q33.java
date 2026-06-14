package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class q33 extends mj2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nq f114868e = new nq() { // from class: yads.hd0
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return q33.b(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f114869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f114870d;

    public q33() {
        this.f114869c = false;
        this.f114870d = false;
    }

    public static q33 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new q33(bundle.getBoolean(Integer.toString(2, 36), false)) : new q33();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q33)) {
            return false;
        }
        q33 q33Var = (q33) obj;
        return this.f114870d == q33Var.f114870d && this.f114869c == q33Var.f114869c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f114869c), Boolean.valueOf(this.f114870d)});
    }

    public q33(boolean z10) {
        this.f114869c = true;
        this.f114870d = z10;
    }
}
