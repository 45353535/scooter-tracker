package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c20 implements oq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f109181b = 0;

    static {
        v31 v31Var = y31.f118068c;
        new c20(nk2.f113952f);
        new nq() { // from class: yads.r4
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return c20.a(bundle);
            }
        };
    }

    public c20(List list) {
        y31.a((Collection) list);
    }

    public static final c20 a(Bundle bundle) {
        nk2 nk2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            v31 v31Var = y31.f118068c;
            nk2VarA = nk2.f113952f;
        } else {
            nk2VarA = pq.a(a20.f108519t, parcelableArrayList);
        }
        return new c20(nk2VarA);
    }
}
