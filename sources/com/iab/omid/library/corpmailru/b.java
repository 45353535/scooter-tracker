package com.iab.omid.library.corpmailru;

import android.content.Context;
import com.iab.omid.library.corpmailru.b.d;
import com.iab.omid.library.corpmailru.b.f;
import com.iab.omid.library.corpmailru.d.e;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34899a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.3.20-Corpmailru";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.corpmailru.b.b.a().a(context);
        com.iab.omid.library.corpmailru.d.b.a(context);
        d.a().a(context);
    }

    boolean b() {
        return this.f34899a;
    }

    void a(boolean z10) {
        this.f34899a = z10;
    }
}
