package wh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import vh.c0;
import vh.k;
import vh.l;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {
    public static final void a(l lVar, c0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (c0 c0VarJ = dir; c0VarJ != null && !lVar.j(c0VarJ); c0VarJ = c0VarJ.j()) {
            arrayDeque.addFirst(c0VarJ);
        }
        if (z10 && arrayDeque.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            lVar.f((c0) it.next());
        }
    }

    public static final boolean b(l lVar, c0 path) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return lVar.m(path) != null;
    }

    public static final k c(l lVar, c0 path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        k kVarM = lVar.m(path);
        if (kVarM != null) {
            return kVarM;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
