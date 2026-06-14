package jg;

import eg.e1;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f85919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f85920b;

    static {
        t tVar = new t();
        f85919a = tVar;
        f0.f("kotlinx.coroutines.fast.service.loader", true);
        f85920b = tVar.a();
    }

    private t() {
    }

    private final e1 a() {
        Object next;
        e1 e1VarE;
        try {
            List listC0 = kotlin.sequences.k.c0(kotlin.sequences.k.h(ServiceLoader.load(s.class, s.class.getClassLoader()).iterator()));
            Iterator it = listC0.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iA = ((s) next).a();
                    do {
                        Object next2 = it.next();
                        int iA2 = ((s) next2).a();
                        if (iA < iA2) {
                            next = next2;
                            iA = iA2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            s sVar = (s) next;
            if (sVar != null && (e1VarE = u.e(sVar, listC0)) != null) {
                return e1VarE;
            }
            u.b(null, null, 3, null);
            return null;
        } catch (Throwable th2) {
            u.b(th2, null, 2, null);
            return null;
        }
    }
}
