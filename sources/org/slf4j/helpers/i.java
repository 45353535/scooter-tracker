package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
abstract class i implements yh.d, Serializable {
    i() {
    }

    @Override // yh.d
    public /* synthetic */ boolean m(zh.b bVar) {
        return yh.c.a(this, bVar);
    }

    public abstract String o();

    protected Object readResolve() throws ObjectStreamException {
        return yh.f.k(o());
    }
}
