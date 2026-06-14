package com.appodeal.ads;

import android.os.Handler;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hd implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te f13402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc f13403c;

    public hd(te teVar, uc ucVar) {
        this.f13402b = teVar;
        this.f13403c = ucVar;
    }

    public final void a() {
        try {
            Handler handler = b6.f13134a;
            Intrinsics.checkNotNullParameter("ApdAdObjectLoader", "name");
            this.f13403c.c(com.appodeal.ads.context.o.f13205b, this.f13402b, new bd(this));
        } catch (Throwable th2) {
            Log.log(th2);
            if (th2 instanceof JSONException) {
                b(LoadingError.IncorrectAdunit);
            } else {
                b(LoadingError.InternalError);
            }
        }
    }

    public abstract void b(LoadingError loadingError);

    public abstract void d();

    public final void e() {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.cd
            @Override // java.lang.Runnable
            public final void run() {
                this.f13182b.a();
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            d();
            e();
        } catch (Exception e10) {
            Log.log(e10);
            if (e10 instanceof JSONException) {
                b(LoadingError.IncorrectAdunit);
            } else {
                b(LoadingError.InternalError);
            }
        }
    }
}
