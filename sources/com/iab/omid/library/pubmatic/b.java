package com.iab.omid.library.pubmatic;

import android.content.Context;
import com.iab.omid.library.pubmatic.internal.i;
import com.iab.omid.library.pubmatic.internal.j;
import com.iab.omid.library.pubmatic.utils.e;
import com.iab.omid.library.pubmatic.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35689a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.5.6-Pubmatic";
    }

    void c() {
        g.a();
        com.iab.omid.library.pubmatic.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.pubmatic.internal.b.g().a(context);
        com.iab.omid.library.pubmatic.utils.a.a(context);
        com.iab.omid.library.pubmatic.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.pubmatic.internal.g.b().a(context);
        com.iab.omid.library.pubmatic.internal.a.a().a(context);
        j.b().a(context);
    }

    boolean b() {
        return this.f35689a;
    }

    void a(boolean z10) {
        this.f35689a = z10;
    }
}
