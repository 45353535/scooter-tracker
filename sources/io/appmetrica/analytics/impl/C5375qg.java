package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5375qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f78080a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5424sg f78081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yo f78083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f78084e;

    public C5375qg(Context context, yo yoVar) {
        this.f78084e = context;
        this.f78083d = yoVar;
        this.f78081b = yoVar.b();
        this.f78082c = yoVar.c();
    }

    public final void a() {
        if (this.f78082c) {
            return;
        }
        Context context = this.f78084e;
        Va vaA = Ag.a(context, C5468ua.H.f78355d.a());
        InterfaceC5549xg interfaceC5549xg = (InterfaceC5549xg) new C5198jg(this, new Ag(vaA), new Ga(context), new Bg(context)).f77528f.getValue();
        try {
            vaA.a(interfaceC5549xg);
        } catch (Throwable th2) {
            interfaceC5549xg.a(th2);
        }
    }

    public final synchronized void a(C5474ug c5474ug) {
        this.f78080a.add(c5474ug);
        if (this.f78082c) {
            c5474ug.a(this.f78081b);
        }
    }

    public final synchronized void a(C5424sg c5424sg) {
        Iterator it = this.f78080a.iterator();
        while (it.hasNext()) {
            ((C5474ug) it.next()).a(c5424sg);
        }
    }
}
