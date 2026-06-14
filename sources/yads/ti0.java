package yads;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class ti0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hn2 f116250h = new hn2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qi0 f116251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f116252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f116254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f116256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f116257g;

    public ti0(Context context, ec0 ec0Var, fc0 fc0Var) {
        context.getApplicationContext();
        this.f116254d = true;
        this.f116257g = Collections.EMPTY_LIST;
        this.f116252b = new CopyOnWriteArraySet();
        Handler handlerB = w83.b(new Handler.Callback() { // from class: yads.vq0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f117154b.a(message);
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        qi0 qi0Var = new qi0(handlerThread, ec0Var, fc0Var, handlerB, this.f116254d);
        this.f116251a = qi0Var;
        int iC = new ln2(context, new jn2() { // from class: yads.wq0
            @Override // yads.jn2
            public final void a(ln2 ln2Var, int i10) {
                this.f117527a.a(ln2Var, i10);
            }
        }).c();
        this.f116255e = iC;
        this.f116253c = 1;
        qi0Var.obtainMessage(0, iC, 0).sendToTarget();
    }

    public final boolean a(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f116257g = DesugarCollections.unmodifiableList((List) message.obj);
            boolean zA = a();
            Iterator it = this.f116252b.iterator();
            while (it.hasNext()) {
                ((ri0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = this.f116252b.iterator();
                while (it2.hasNext()) {
                    ((ri0) it2.next()).getClass();
                }
            }
        } else if (i10 == 1) {
            int i11 = message.arg1;
            int i12 = message.arg2;
            int i13 = this.f116253c - i11;
            this.f116253c = i13;
            if (i12 == 0 && i13 == 0) {
                Iterator it3 = this.f116252b.iterator();
                while (it3.hasNext()) {
                    ((ri0) it3.next()).getClass();
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            pi0 pi0Var = (pi0) message.obj;
            this.f116257g = DesugarCollections.unmodifiableList(pi0Var.f114682c);
            oi0 oi0Var = pi0Var.f114680a;
            boolean zA2 = a();
            if (pi0Var.f114681b) {
                Iterator it4 = this.f116252b.iterator();
                while (it4.hasNext()) {
                    ((ri0) it4.next()).getClass();
                }
            } else {
                Iterator it5 = this.f116252b.iterator();
                while (it5.hasNext()) {
                    xk3 xk3Var = (xk3) ((ri0) it5.next());
                    xk3Var.getClass();
                    if (Intrinsics.areEqual(oi0Var.f114325a.f117459b, xk3Var.f117857a)) {
                        if (xk3.f117854d.contains(Integer.valueOf(oi0Var.f114326b))) {
                            gk2 gk2Var = xk3Var.f117858b;
                            KProperty kProperty = xk3.f117853c[0];
                            ne3 ne3Var = (ne3) gk2Var.f111244a.get();
                            if (ne3Var != null) {
                                ne3Var.a();
                            }
                        }
                        if (xk3.f117855e.contains(Integer.valueOf(oi0Var.f114326b))) {
                            gk2 gk2Var2 = xk3Var.f117858b;
                            KProperty kProperty2 = xk3.f117853c[0];
                            ne3 ne3Var2 = (ne3) gk2Var2.f111244a.get();
                            if (ne3Var2 != null) {
                                ne3Var2.c();
                            }
                        }
                        if (xk3.f117856f.contains(Integer.valueOf(oi0Var.f114326b))) {
                            this.f116252b.remove(xk3Var);
                        }
                    }
                }
            }
            if (zA2) {
                Iterator it6 = this.f116252b.iterator();
                while (it6.hasNext()) {
                    ((ri0) it6.next()).getClass();
                }
            }
        }
        return true;
    }

    public final void a(ln2 ln2Var, int i10) {
        hn2 hn2Var = ln2Var.f113167c;
        if (this.f116255e != i10) {
            this.f116255e = i10;
            this.f116253c++;
            this.f116251a.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean zA = a();
        Iterator it = this.f116252b.iterator();
        while (it.hasNext()) {
            ((ri0) it.next()).getClass();
        }
        if (zA) {
            Iterator it2 = this.f116252b.iterator();
            while (it2.hasNext()) {
                ((ri0) it2.next()).getClass();
            }
        }
    }

    public final boolean a() {
        boolean z10;
        if (this.f116254d || this.f116255e == 0) {
            z10 = false;
        } else {
            for (int i10 = 0; i10 < this.f116257g.size(); i10++) {
                if (((oi0) this.f116257g.get(i10)).f114326b == 0) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean z11 = this.f116256f != z10;
        this.f116256f = z10;
        return z11;
    }
}
