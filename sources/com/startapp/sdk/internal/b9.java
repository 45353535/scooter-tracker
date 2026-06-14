package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class b9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f64312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9 f64313b;

    public b9(c9 c9Var, Bitmap bitmap) {
        this.f64313b = c9Var;
        this.f64312a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c9 c9Var;
        c9 c9Var2 = this.f64313b;
        Bitmap bitmap = this.f64312a;
        d9 d9Var = c9Var2.f64354d;
        d9Var.f64415g--;
        if (bitmap != null) {
            d9Var.f64412d.put(c9Var2.f64352b, bitmap);
            List3DActivity list3DActivity = c9Var2.f64354d.f64414f;
            if (list3DActivity != null) {
                list3DActivity.a(c9Var2.f64351a);
            }
            d9 d9Var2 = c9Var2.f64354d;
            if (d9Var2.f64416h.isEmpty() || (c9Var = (c9) d9Var2.f64416h.poll()) == null) {
                return;
            }
            ((Executor) d9Var2.f64409a.a()).execute(c9Var);
        }
    }
}
