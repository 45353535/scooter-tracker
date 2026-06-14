package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u31 extends q31 {
    public final u31 a(Object obj) {
        obj.getClass();
        a(this.f114866b + 1);
        Object[] objArr = this.f114865a;
        int i10 = this.f114866b;
        this.f114866b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u31 a(List list) {
        if (list instanceof Collection) {
            a(list.size() + this.f114866b);
            if (list instanceof s31) {
                this.f114866b = ((s31) list).a(this.f114866b, this.f114865a);
                return this;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final nk2 a() {
        this.f114867c = true;
        return y31.b(this.f114866b, this.f114865a);
    }
}
