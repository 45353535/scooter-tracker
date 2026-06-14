package yads;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class qy1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f115213c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile qy1 f115214d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f115215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f115216b;

    public qy1(Handler handler) {
        this.f115215a = handler;
    }

    public final void a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f115216b) {
                view.setAlpha(view.getAlpha() / 2);
                this.f115216b = true;
            }
            this.f115215a.postDelayed(new Runnable() { // from class: yads.mi0
                @Override // java.lang.Runnable
                public final void run() {
                    qy1.a(this.f113507b, view);
                }
            }, 100L);
        }
    }

    public static final void a(qy1 qy1Var, View view) {
        if (qy1Var.f115216b) {
            view.setAlpha(view.getAlpha() * 2);
            qy1Var.f115216b = false;
        }
    }
}
