package io.sentry.cache.tape;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Iterable, Closeable {

    public interface a {
        void a(Object obj, OutputStream outputStream);

        Object b(byte[] bArr);
    }

    public static c n(d dVar, a aVar) {
        return new b(dVar, aVar);
    }

    public static c o() {
        return new io.sentry.cache.tape.a();
    }

    public void clear() {
        q(size());
    }

    public abstract void e(Object obj);

    public List m() {
        return p(size());
    }

    public List p(int i10) {
        int iMin = Math.min(i10, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator it = iterator();
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(it.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public abstract void q(int i10);

    public abstract int size();
}
