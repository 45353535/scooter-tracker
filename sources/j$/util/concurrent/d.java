package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        k kVar = this.f84872b;
        if (kVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = kVar.f84864b;
        Object obj2 = kVar.f84865c;
        this.f84852j = kVar;
        a();
        return new j(obj, obj2, this.f84851i);
    }
}
