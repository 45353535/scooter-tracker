package c0;

import android.content.Context;
import r.a;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f6454a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static r.a f6455b;

    private r() {
    }

    public final synchronized r.a a(Context context) {
        r.a aVarA;
        aVarA = f6455b;
        if (aVarA == null) {
            aVarA = new a.C1179a().b(uf.i.B(i.m(context), "image_cache")).a();
            f6455b = aVarA;
        }
        return aVarA;
    }
}
