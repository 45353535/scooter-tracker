package com.my.target;

import android.content.Context;
import com.my.target.u5;

/* JADX INFO: loaded from: classes11.dex */
public final class rb extends u5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile rb f60774b;

    public static rb a() {
        rb rbVar;
        rb rbVar2 = f60774b;
        if (rbVar2 != null) {
            return rbVar2;
        }
        synchronized (z2.class) {
            try {
                rbVar = f60774b;
                if (rbVar == null) {
                    rbVar = new rb();
                    f60774b = rbVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rbVar;
    }

    public void b(final String str, final u5.a aVar, final Context context) {
        f0.c(new Runnable() { // from class: k5.f2
            @Override // java.lang.Runnable
            public final void run() {
                this.f86030b.a(str, aVar, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, u5.a aVar, Context context) {
        if (a(str, aVar)) {
            gb.a("VideoLoader: can't load. Video already loading");
        } else {
            a(str, (String) q2.a().a(str, null, context.getApplicationContext()).c());
        }
    }
}
