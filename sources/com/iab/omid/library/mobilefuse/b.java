package com.iab.omid.library.mobilefuse;

import android.content.Context;
import com.iab.omid.library.mobilefuse.internal.i;
import com.iab.omid.library.mobilefuse.internal.j;
import com.iab.omid.library.mobilefuse.utils.e;
import com.iab.omid.library.mobilefuse.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35554a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.4.13-Mobilefuse";
    }

    void c() {
        g.a();
        com.iab.omid.library.mobilefuse.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.mobilefuse.internal.b.g().a(context);
        com.iab.omid.library.mobilefuse.utils.a.a(context);
        com.iab.omid.library.mobilefuse.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.mobilefuse.internal.g.b().a(context);
        com.iab.omid.library.mobilefuse.internal.a.a().a(context);
        j.b().a(context);
    }

    boolean b() {
        return this.f35554a;
    }

    void a(boolean z10) {
        this.f35554a = z10;
    }
}
