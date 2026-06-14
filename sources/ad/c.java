package ad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yc.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f4234a;

    public c(b stateGroupController) {
        Intrinsics.checkNotNullParameter(stateGroupController, "stateGroupController");
        this.f4234a = stateGroupController;
    }

    @Override // yc.e
    public boolean a(List params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(params, 10));
        Iterator it = params.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return !this.f4234a.a(arrayList);
    }
}
