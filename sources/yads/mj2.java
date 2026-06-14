package yads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mj2 implements oq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nq f113535b = new nq() { // from class: yads.un
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return mj2.a(bundle);
        }
    };

    public static mj2 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        if (i10 == 0) {
            return (mj2) gz0.f111407e.fromBundle(bundle);
        }
        if (i10 == 1) {
            return (mj2) ra2.f115390d.fromBundle(bundle);
        }
        if (i10 == 2) {
            return (mj2) w03.f117264e.fromBundle(bundle);
        }
        if (i10 == 3) {
            return (mj2) q33.f114868e.fromBundle(bundle);
        }
        throw new IllegalArgumentException(he2.a("Unknown RatingType: ", i10));
    }
}
