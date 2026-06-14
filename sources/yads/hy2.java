package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hy2 extends xz1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h12 f111803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vt2 f111804f;

    public hy2(h12 h12Var, zw1 zw1Var, vt2 vt2Var, t9 t9Var) {
        super(zw1Var, t9Var);
        this.f111803e = h12Var;
        this.f111804f = vt2Var;
    }

    @Override // yads.xz1
    public final h93 a(int i10, Context context, boolean z10) {
        hr2 hr2VarA = this.f111804f.a(context);
        h93 h93VarA = (hr2VarA == null || hr2VarA.f111745p) ? super.a(i10, context, z10) : new f93(CollectionsKt.emptyList());
        if (h93VarA instanceof f93) {
            List list = this.f111803e.f111436a;
            ArrayList<d22> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof d22) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                for (d22 d22Var : arrayList) {
                    z32 z32Var = d22Var.f109705d;
                    y52 y52Var = d22Var.f109706e;
                    hr2 hr2VarA2 = this.f111804f.a(context);
                    boolean z11 = hr2VarA2 != null ? hr2VarA2.f111745p : true;
                    Iterator it = y52Var.f118095b.iterator();
                    while (it.hasNext()) {
                        int i11 = z11 ? ((cw2) it.next()).f109627c : i10;
                        if ((z10 ? ((xz1) z32Var).a(i11, context, true) : ((xz1) z32Var).a(i11, context, false)) instanceof e93) {
                            break;
                        }
                    }
                }
            }
            return new e93(d93.f109846d, null, null);
        }
        return h93VarA;
    }
}
