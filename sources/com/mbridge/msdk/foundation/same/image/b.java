package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f48659a;

    protected b(Context context) {
    }

    public void a() {
    }

    public void b() {
    }

    public boolean c(String str) {
        if (v0.k(str)) {
            return false;
        }
        return d.a().d(str);
    }

    public void a(String str) {
    }

    public Bitmap b(String str) {
        if (v0.k(str)) {
            return null;
        }
        return d.a().c(str);
    }

    public static b a(Context context) {
        if (f48659a == null) {
            f48659a = new b(context);
        }
        return f48659a;
    }

    public void a(String str, c cVar) {
        d.a().b(str, null, cVar);
    }
}
