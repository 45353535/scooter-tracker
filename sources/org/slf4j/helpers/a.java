package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements yh.d, Serializable {
    private void r(zh.b bVar, yh.g gVar, String str, Throwable th2) {
        q(bVar, gVar, str, null, th2);
    }

    @Override // yh.d
    public void h(String str, Throwable th2) {
        if (k()) {
            r(zh.b.DEBUG, null, str, th2);
        }
    }

    @Override // yh.d
    public void i(String str) {
        if (l()) {
            r(zh.b.TRACE, null, str, null);
        }
    }

    @Override // yh.d
    public /* synthetic */ boolean m(zh.b bVar) {
        return yh.c.a(this, bVar);
    }

    @Override // yh.d
    public void n(String str) {
        if (j()) {
            r(zh.b.WARN, null, str, null);
        }
    }

    public abstract String o();

    protected abstract void q(zh.b bVar, yh.g gVar, String str, Object[] objArr, Throwable th2);

    protected Object readResolve() throws ObjectStreamException {
        return yh.f.k(o());
    }
}
