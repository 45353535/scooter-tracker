package com.iab.omid.library.startio;

import android.content.Context;
import com.iab.omid.library.startio.internal.i;
import com.iab.omid.library.startio.utils.e;
import com.iab.omid.library.startio.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35965a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.4.12-Startio";
    }

    void c() {
        g.a();
        com.iab.omid.library.startio.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.startio.internal.b.g().a(context);
        com.iab.omid.library.startio.utils.a.a(context);
        com.iab.omid.library.startio.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.startio.internal.g.b().a(context);
        com.iab.omid.library.startio.internal.a.a().a(context);
    }

    boolean b() {
        return this.f35965a;
    }

    void a(boolean z10) {
        this.f35965a = z10;
    }
}
