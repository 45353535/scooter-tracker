package com.iab.omid.library.taurusx;

import android.content.Context;
import com.iab.omid.library.taurusx.internal.f;
import com.iab.omid.library.taurusx.internal.h;
import com.iab.omid.library.taurusx.utils.e;
import com.iab.omid.library.taurusx.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36095a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.4.8-Taurusx";
    }

    void c() {
        g.a();
        com.iab.omid.library.taurusx.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        h.c().a(context);
        com.iab.omid.library.taurusx.internal.b.g().a(context);
        com.iab.omid.library.taurusx.utils.a.a(context);
        com.iab.omid.library.taurusx.utils.c.a(context);
        e.a(context);
        f.b().a(context);
        com.iab.omid.library.taurusx.internal.a.a().a(context);
    }

    boolean b() {
        return this.f36095a;
    }

    void a(boolean z10) {
        this.f36095a = z10;
    }
}
