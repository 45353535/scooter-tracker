package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import com.inmobi.media.Sn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f37738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f37739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f37740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3878m9 f37741d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f37743f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Pn f37745h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37748k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f37742e = new ArrayList(50);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f37744g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f37746i = lf.i.a(new Function0() { // from class: w3.l4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Sn.a(this.f107163b);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f37747j = lf.i.a(new Function0() { // from class: w3.m4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Sn.b(this.f107183b);
        }
    });

    public Sn(WeakHashMap weakHashMap, Handler handler, byte b10, InterfaceC3878m9 interfaceC3878m9) {
        this.f37738a = weakHashMap;
        this.f37739b = handler;
        this.f37740c = b10;
        this.f37741d = interfaceC3878m9;
    }

    public static final On a(Sn sn) {
        return new On(sn, sn.f37744g);
    }

    public static final Runnable b(final Sn sn) {
        return new Runnable() { // from class: w3.k4
            @Override // java.lang.Runnable
            public final void run() {
                Sn.c(this.f107138b);
            }
        };
    }

    public static final void c(Sn sn) {
        sn.f37739b.post((On) sn.f37746i.getValue());
    }

    public abstract int c();

    public final void d() {
        InterfaceC3878m9 interfaceC3878m9 = this.f37741d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("VisibilityTracker", "pause " + this);
        }
        ((On) this.f37746i.getValue()).run();
        this.f37739b.removeCallbacksAndMessages(null);
        this.f37748k = false;
        this.f37744g.set(true);
    }

    public final void e() {
        InterfaceC3878m9 interfaceC3878m9 = this.f37741d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("VisibilityTracker", "resume " + this);
        }
        this.f37744g.set(false);
        if (this.f37748k || this.f37744g.get()) {
            return;
        }
        this.f37748k = true;
        eg.i.d(A9.f36558d, null, null, new Rn(this, null), 3, null);
    }

    public final void a(View rootView, View view, View view2, int i10) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3878m9 interfaceC3878m9 = this.f37741d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("VisibilityTracker", "add view to tracker - minPercent - " + i10 + "  " + this);
        }
        Qn qn = (Qn) this.f37738a.get(view);
        if (qn == null) {
            qn = new Qn();
            this.f37738a.put(view, qn);
            this.f37743f++;
        }
        qn.f37622a = i10;
        long j10 = this.f37743f;
        qn.f37623b = j10;
        qn.f37624c = rootView;
        long j11 = 50;
        if (j10 % j11 == 0) {
            long j12 = j10 - j11;
            for (Map.Entry entry : this.f37738a.entrySet()) {
                View view3 = (View) entry.getKey();
                if (((Qn) entry.getValue()).f37623b < j12) {
                    this.f37742e.add(view3);
                }
            }
            Iterator it = this.f37742e.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                a((View) it.next());
            }
            this.f37742e.clear();
        }
        if (this.f37738a.size() == 1) {
            e();
        }
    }

    public final void b() {
        InterfaceC3878m9 interfaceC3878m9 = this.f37741d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.f37745h = null;
        this.f37744g.set(true);
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3878m9 interfaceC3878m9 = this.f37741d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((Qn) this.f37738a.remove(view)) != null) {
            this.f37743f--;
            if (this.f37738a.isEmpty()) {
                d();
            }
        }
    }

    public final void a() {
        InterfaceC3878m9 interfaceC3878m9 = this.f37741d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("VisibilityTracker", "clear " + this);
        }
        this.f37738a.clear();
        this.f37739b.removeMessages(0);
        this.f37748k = false;
    }
}
