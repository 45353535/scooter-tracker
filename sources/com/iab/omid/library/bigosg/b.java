package com.iab.omid.library.bigosg;

import android.content.Context;
import com.iab.omid.library.bigosg.b.d;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.e;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34513a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.3.0-Bigosg";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.bigosg.b.b.a().a(context);
        com.iab.omid.library.bigosg.d.b.a(context);
        d.a().a(context);
    }

    boolean b() {
        return this.f34513a;
    }

    void a(boolean z10) {
        this.f34513a = z10;
    }

    boolean a(String str) {
        return true;
    }
}
