package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import com.my.target.u5;

/* JADX INFO: loaded from: classes11.dex */
public final class z2 extends u5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile z2 f61160b;

    public static z2 a() {
        z2 z2Var;
        z2 z2Var2 = f61160b;
        if (z2Var2 != null) {
            return z2Var2;
        }
        synchronized (z2.class) {
            try {
                z2Var = f61160b;
                if (z2Var == null) {
                    z2Var = new z2();
                    f61160b = z2Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z2Var;
    }

    public void b(final String str, final u5.a aVar, final Context context) {
        f0.c(new Runnable() { // from class: k5.m4
            @Override // java.lang.Runnable
            public final void run() {
                this.f86089b.a(str, aVar, context);
            }
        });
    }

    public final /* synthetic */ void a(String str, u5.a aVar, Context context) {
        if (a(str, aVar)) {
            gb.a("ImageLoader: can't load. Image already loading");
        } else {
            a(str, (Bitmap) l2.a().a(str, (String) null, context.getApplicationContext()).c());
        }
    }
}
