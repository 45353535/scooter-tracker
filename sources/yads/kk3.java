package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class kk3 implements im2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f112736a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn2 f112737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kr f112738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue f112739d;

    public kk3(kr krVar, PriorityBlockingQueue priorityBlockingQueue, wn2 wn2Var) {
        this.f112737b = wn2Var;
        this.f112738c = krVar;
        this.f112739d = priorityBlockingQueue;
    }

    public final synchronized boolean a(km2 km2Var) {
        try {
            String strC = km2Var.c();
            if (!this.f112736a.containsKey(strC)) {
                this.f112736a.put(strC, null);
                km2Var.a((im2) this);
                if (rj3.f115467a) {
                    boolean z10 = lb1.f113032a;
                }
                return false;
            }
            List arrayList = (List) this.f112736a.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            km2Var.a("waiting-for-response");
            arrayList.add(km2Var);
            this.f112736a.put(strC, arrayList);
            if (rj3.f115467a) {
                boolean z11 = lb1.f113032a;
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(km2 km2Var) {
        BlockingQueue blockingQueue;
        try {
            String strC = km2Var.c();
            List list = (List) this.f112736a.remove(strC);
            if (list != null && !list.isEmpty()) {
                if (rj3.f115467a) {
                    list.size();
                    boolean z10 = lb1.f113032a;
                }
                km2 km2Var2 = (km2) list.remove(0);
                this.f112736a.put(strC, list);
                km2Var2.a((im2) this);
                if (this.f112738c != null && (blockingQueue = this.f112739d) != null) {
                    try {
                        blockingQueue.put(km2Var2);
                    } catch (InterruptedException unused) {
                        boolean z11 = lb1.f113032a;
                        Thread.currentThread().interrupt();
                        kr krVar = this.f112738c;
                        krVar.f112813f = true;
                        krVar.interrupt();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(km2 km2Var, qn2 qn2Var) {
        List list;
        cr crVar = qn2Var.f115101b;
        if (crVar != null) {
            if (crVar.f109527e >= System.currentTimeMillis()) {
                String strC = km2Var.c();
                synchronized (this) {
                    list = (List) this.f112736a.remove(strC);
                }
                if (list != null) {
                    if (rj3.f115467a) {
                        list.size();
                        boolean z10 = lb1.f113032a;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((cm0) this.f112737b).a((km2) it.next(), qn2Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(km2Var);
    }
}
