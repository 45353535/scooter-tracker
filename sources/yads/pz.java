package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pz {
    public static qz a(String str) {
        Object next;
        Iterator<E> it = qz.f115229l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((qz) next).f115230b, str)) {
                break;
            }
        }
        return (qz) next;
    }
}
