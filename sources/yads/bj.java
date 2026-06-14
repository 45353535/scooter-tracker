package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f31 f109019a;

    public /* synthetic */ bj() {
        this(new f31());
    }

    public final ArrayList a(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gi giVar = (gi) it.next();
            Object obj = giVar.f111215c;
            String str = giVar.f111214b;
            if (Intrinsics.areEqual("image", str) && (obj instanceof d31)) {
                this.f109019a.getClass();
                if (f31.a((d31) obj, map)) {
                    arrayList.add(giVar);
                }
            } else {
                if (Intrinsics.areEqual("media", str) && (obj instanceof am1)) {
                    am1 am1Var = (am1) obj;
                    if (am1Var.f108721c != null) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.monetization.ads.network.model.MediaValue");
                        List list2 = am1Var.f108721c;
                        d31 d31Var = list2 != null ? (d31) CollectionsKt.firstOrNull(list2) : null;
                        gb3 gb3Var = am1Var.f108720b;
                        ai1 ai1Var = am1Var.f108719a;
                        if (gb3Var == null && ai1Var == null) {
                            if (d31Var != null) {
                                this.f109019a.getClass();
                                if (f31.a(d31Var, map)) {
                                }
                            }
                        }
                        arrayList.add(giVar);
                    }
                }
                arrayList.add(giVar);
            }
        }
        return arrayList;
    }

    public bj(f31 f31Var) {
        this.f109019a = f31Var;
    }
}
