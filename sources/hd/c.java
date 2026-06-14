package hd;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b implements e {
    public c(List list) {
        super(list);
    }

    @Override // hd.e
    public String prepareCreativeForMeasure(String str) {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            str = ((e) it.next()).prepareCreativeForMeasure(str);
        }
        return str;
    }
}
