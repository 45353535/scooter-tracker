package q;

import android.content.Context;
import java.io.Closeable;
import q.p;
import vh.c0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q {
    public static final p a(vh.g gVar, Context context) {
        return new s(gVar, c0.i.m(context), null);
    }

    public static final p b(vh.g gVar, Context context, p.a aVar) {
        return new s(gVar, c0.i.m(context), aVar);
    }

    public static final p c(c0 c0Var, vh.l lVar, String str, Closeable closeable) {
        return new o(c0Var, lVar, str, closeable, null);
    }

    public static /* synthetic */ p d(c0 c0Var, vh.l lVar, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = vh.l.f106875b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return c(c0Var, lVar, str, closeable);
    }
}
