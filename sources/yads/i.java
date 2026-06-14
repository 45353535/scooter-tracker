package yads;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends a0 {
    public i(Map map) {
        super(map);
    }

    @Override // yads.e0
    public final n a() {
        n nVar = this.f110124e;
        if (nVar != null) {
            return nVar;
        }
        n nVarB = ((ew1) this).b();
        this.f110124e = nVarB;
        return nVarB;
    }

    @Override // yads.e0
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f108502f.get(obj);
        if (collection == null) {
            List list = (List) ((ew1) this).f110507h.get();
            if (list.add(obj2)) {
                this.f108503g++;
                this.f108502f.put(obj, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.f108503g++;
        return true;
    }
}
