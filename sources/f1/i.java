package f1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f70055a;

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f70055a = context;
    }

    public final int a() {
        return yf.i(this.f70055a);
    }

    public final String b() {
        return yf.j(this.f70055a).g();
    }

    public final gf c() {
        Context context = this.f70055a;
        gf gfVar = !yf.g(context) ? gf.f69955d : yf.h(context) ? gf.f69956e : yf.f(context) ? gf.f69957f : gf.f69954c;
        eg.e("NETWORK TYPE: " + gfVar, null, 2, null);
        return gfVar;
    }

    public final boolean d() {
        return c() == gf.f69957f;
    }

    public final boolean e() {
        return yf.g(this.f70055a);
    }

    public final fg f() {
        return yf.j(this.f70055a);
    }
}
