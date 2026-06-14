package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f52312a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f52312a != null) {
            return f52312a;
        }
        synchronized (b.class) {
            try {
                if (f52312a == null) {
                    f52312a = new b();
                }
                bVar = f52312a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private void b(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar);
    }

    private void c(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar, map);
    }

    private void b(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar, map);
    }

    public void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int iG = cVar.g();
        if (iG == 1) {
            a(view, map);
            return;
        }
        if (iG == 2) {
            c(view, cVar, map);
            return;
        }
        if (iG == 3) {
            b(view, cVar);
        } else if (iG == 4) {
            b(view, cVar, map);
        } else {
            if (iG != 5) {
                return;
            }
            a(view, cVar);
        }
    }

    private void a(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar);
    }

    private void a(View view, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, map);
    }
}
