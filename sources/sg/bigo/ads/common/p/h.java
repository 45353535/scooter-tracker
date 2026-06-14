package sg.bigo.ads.common.p;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends sg.bigo.ads.common.p.a {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f102684a = new h(0);
    }

    private h() {
        this.f102607b = new sg.bigo.ads.common.h.a.a();
    }

    @Override // sg.bigo.ads.common.p.a
    protected final String a() {
        return "ImageLoader";
    }

    @Override // sg.bigo.ads.common.p.a
    protected final int b() {
        return this.f102607b.a();
    }

    @Override // sg.bigo.ads.common.p.a
    protected final String c(Context context, String str) {
        return o.e(context) + File.separator + str;
    }

    /* synthetic */ h(byte b10) {
        this();
    }

    @Override // sg.bigo.ads.common.p.a
    protected final sg.bigo.ads.common.c a(Context context, String str) {
        return c.a(context).f102669b.get(str);
    }

    @Override // sg.bigo.ads.common.p.a
    protected final String b(Context context) {
        return o.e(context);
    }

    @Override // sg.bigo.ads.common.p.a
    protected final void a(Context context) {
        c.a(context).f102669b.evictAll();
    }

    @Override // sg.bigo.ads.common.p.a
    protected final void b(Context context, String str) {
        c.a(context).f102669b.remove(str);
    }

    @Override // sg.bigo.ads.common.p.a
    protected final void a(Context context, String str, sg.bigo.ads.common.c cVar) {
        c cVarA = c.a(context);
        if (cVar.f102292a.isRecycled()) {
            return;
        }
        cVarA.f102669b.put(str, cVar);
        sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "The left cache size: " + (c.f102668a.get() - cVarA.f102669b.size()));
    }
}
