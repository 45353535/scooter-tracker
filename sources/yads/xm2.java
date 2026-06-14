package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class xm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f117897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f117898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f117899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f117900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dr f117901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final po f117902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wn2 f117903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n62[] f117904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kr f117905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f117906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f117907k;

    public xm2(dr drVar, po poVar, int i10) {
        this(drVar, poVar, i10, new cm0(new Handler(Looper.getMainLooper())));
    }

    public final void a(km2 km2Var) {
        km2Var.f112769i = this;
        synchronized (this.f117898b) {
            this.f117898b.add(km2Var);
        }
        km2Var.f112768h = Integer.valueOf(this.f117897a.incrementAndGet());
        km2Var.a("add-to-queue");
        a(km2Var, 0);
        if (km2Var.f112770j) {
            this.f117899c.add(km2Var);
        } else {
            this.f117900d.add(km2Var);
        }
    }

    public xm2(dr drVar, po poVar, int i10, cm0 cm0Var) {
        this.f117897a = new AtomicInteger();
        this.f117898b = new HashSet();
        this.f117899c = new PriorityBlockingQueue();
        this.f117900d = new PriorityBlockingQueue();
        this.f117906j = new ArrayList();
        this.f117907k = new ArrayList();
        this.f117901e = drVar;
        this.f117902f = poVar;
        this.f117904h = new n62[i10];
        this.f117903g = cm0Var;
    }

    public final void a(wm2 wm2Var) {
        synchronized (this.f117898b) {
            try {
                for (km2 km2Var : this.f117898b) {
                    if (wm2Var.a(km2Var)) {
                        km2Var.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(km2 km2Var, int i10) {
        pm2 pm2Var;
        synchronized (this.f117907k) {
            try {
                Iterator it = this.f117907k.iterator();
                while (it.hasNext()) {
                    ((mm2) ((vm2) it.next())).getClass();
                    ho hoVar = km2Var instanceof ho ? (ho) km2Var : null;
                    if (hoVar != null && i10 == 3 && (pm2Var = hoVar.f111643u) != null) {
                        pm2Var.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        kr krVar = this.f117905i;
        if (krVar != null) {
            krVar.f112813f = true;
            krVar.interrupt();
        }
        for (n62 n62Var : this.f117904h) {
            if (n62Var != null) {
                n62Var.f113741f = true;
                n62Var.interrupt();
            }
        }
        kr krVar2 = new kr(this.f117899c, this.f117900d, this.f117901e, this.f117903g);
        this.f117905i = krVar2;
        krVar2.start();
        for (int i10 = 0; i10 < this.f117904h.length; i10++) {
            n62 n62Var2 = new n62(this.f117900d, this.f117902f, this.f117901e, this.f117903g);
            this.f117904h[i10] = n62Var2;
            n62Var2.start();
        }
    }
}
