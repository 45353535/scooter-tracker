package com.appodeal.ads.adapters.iab.unified;

import android.graphics.Rect;
import com.appodeal.ads.utils.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f12268b;

    public m(q qVar) {
        this.f12268b = qVar;
    }

    public static final void a(q qVar) {
        q qVar2 = q.f12273u;
        qVar.f12277e = false;
        qVar.a();
        qVar.c(g.f12259b);
        Timer timer = qVar.f12286n;
        if (timer != null) {
            timer.cancel();
        }
        qVar.f12286n = null;
        qVar.f12278f = true;
        qVar.f12276d = false;
    }

    public static final void b(q qVar) {
        q qVar2 = q.f12273u;
        qVar.j();
        if (!qVar.f12277e || qVar.f12279g) {
            Timer timer = qVar.f12286n;
            if (timer != null) {
                timer.cancel();
            }
            qVar.f12286n = null;
        }
    }

    public static final void d(q qVar) {
        q qVar2 = q.f12273u;
        qVar.k();
    }

    public static final void e(q qVar) {
        q qVar2 = q.f12273u;
        qVar.f12277e = false;
        qVar.a();
        qVar.c(g.f12259b);
        Timer timer = qVar.f12286n;
        if (timer != null) {
            timer.cancel();
        }
        qVar.f12286n = null;
        qVar.f12278f = true;
        qVar.f12276d = false;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            if (this.f12268b.f12278f) {
                final q qVar = this.f12268b;
                qVar.post(new Runnable() { // from class: com.appodeal.ads.adapters.iab.unified.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.a(qVar);
                    }
                });
                return;
            }
            q qVar2 = this.f12268b;
            qVar2.getClass();
            boolean globalVisibleRect = qVar2.getGlobalVisibleRect(new Rect());
            boolean zIsShown = qVar2.isShown();
            boolean zHasWindowFocus = qVar2.hasWindowFocus();
            if (globalVisibleRect && zIsShown && zHasWindowFocus) {
                final q qVar3 = this.f12268b;
                qVar3.post(new Runnable() { // from class: com.appodeal.ads.adapters.iab.unified.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.d(qVar3);
                    }
                });
            } else {
                final q qVar4 = this.f12268b;
                qVar4.post(new Runnable() { // from class: com.appodeal.ads.adapters.iab.unified.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.b(qVar4);
                    }
                });
            }
        } catch (Throwable th2) {
            Log.log(th2);
            final q qVar5 = this.f12268b;
            qVar5.post(new Runnable() { // from class: com.appodeal.ads.adapters.iab.unified.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.e(qVar5);
                }
            });
        }
    }
}
