package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f60657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l8 f60658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ab f60659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public za f60660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f60661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f60662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f60663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f60664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f60665i;

    public interface a {
        void a();
    }

    public q8(s5 s5Var, l8 l8Var, Context context) {
        this.f60665i = true;
        this.f60658b = l8Var;
        if (context != null) {
            this.f60661e = context.getApplicationContext();
        }
        if (s5Var == null) {
            return;
        }
        za zaVarX = s5Var.x();
        this.f60660d = zaVarX;
        this.f60659c = zaVarX.b();
        this.f60662f = s5Var.r();
        this.f60664h = s5Var.o();
        this.f60665i = s5Var.J();
    }

    public static q8 a(s5 s5Var, l8 l8Var, Context context) {
        return new q8(s5Var, l8Var, context);
    }

    public static q8 b() {
        return new q8(null, null, null);
    }

    public void c() {
        if (a()) {
            return;
        }
        this.f60659c = this.f60660d.b();
        this.f60657a = false;
    }

    public void d() {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, "closedByUser", -1, this.f60661e);
    }

    public void e() {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, "playbackCompleted", 1, this.f60661e);
    }

    public void f() {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, "playbackPaused", 1, this.f60661e);
        l8 l8Var = this.f60658b;
        if (l8Var != null) {
            l8Var.a(0);
        }
    }

    public void g() {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, "error", 1, this.f60661e);
        bb.b(this.f60660d, "playbackError", 1, this.f60661e);
        l8 l8Var = this.f60658b;
        if (l8Var != null) {
            l8Var.a(3);
        }
    }

    public void h() {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, "playbackTimeout", 1, this.f60661e);
    }

    public void i() {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, "playbackResumed", 1, this.f60661e);
        l8 l8Var = this.f60658b;
        if (l8Var != null) {
            l8Var.a(1);
        }
    }

    public void j() {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, "playbackStopped", 1, this.f60661e);
    }

    public void a(Context context) {
        this.f60661e = context;
    }

    public void b(float f10, float f11) {
        if (e2.a(f10, f11) == 0) {
            return;
        }
        if (!a()) {
            if (e2.a(0.0f, f10) == 0) {
                bb.b(this.f60660d, "volumeOn", 1, this.f60661e);
            } else if (e2.a(0.0f, f11) == 0) {
                bb.b(this.f60660d, "volumeOff", 1, this.f60661e);
            }
        }
        l8 l8Var = this.f60658b;
        if (l8Var != null) {
            l8Var.a(f11);
        }
    }

    public void a(a aVar) {
        this.f60663g = aVar;
    }

    public void a(s5 s5Var) {
        if (s5Var != null) {
            if (s5Var.x() != this.f60660d) {
                this.f60657a = false;
            }
            this.f60660d = s5Var.x();
            this.f60659c = s5Var.x().b();
            this.f60665i = s5Var.J();
        } else {
            this.f60660d = null;
            this.f60659c = null;
        }
        this.f60662f = null;
        this.f60664h = 0.0f;
    }

    public void b(boolean z10) {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, z10 ? "volumeOn" : "volumeOff", -1, this.f60661e);
        l8 l8Var = this.f60658b;
        if (l8Var != null) {
            l8Var.a(z10 ? 1.0f : 0.0f);
        }
    }

    public void a(l8 l8Var) {
        this.f60658b = l8Var;
    }

    public void a(float f10, float f11) {
        if (a()) {
            return;
        }
        if (!this.f60657a) {
            bb.b(this.f60660d, "playbackStarted", 1, this.f60661e);
            a aVar = this.f60663g;
            if (aVar != null) {
                aVar.a();
            }
            this.f60657a = true;
        }
        if (!this.f60659c.f59176a.isEmpty()) {
            ab abVarA = ab.a(new ArrayList(), this.f60659c.f59177b);
            Iterator it = this.f60659c.f59176a.iterator();
            while (it.hasNext()) {
                w8 w8Var = (w8) it.next();
                if (e2.a(w8Var.e(), f10) != 1) {
                    abVarA.f59176a.add(w8Var);
                    it.remove();
                }
            }
            bb.b(abVarA, 1, this.f60661e);
        }
        l8 l8Var = this.f60658b;
        if (l8Var != null) {
            l8Var.b(f10, f11);
        }
        if (this.f60664h <= 0.0f || f11 <= 0.0f || TextUtils.isEmpty(this.f60662f) || !this.f60665i || Math.abs(f11 - this.f60664h) <= 1.5f) {
            return;
        }
        q5.a("Bad value").f("Media duration error: expected " + this.f60664h + ", but was " + f11).d(this.f60662f).b(this.f60661e);
        this.f60665i = false;
    }

    public void a(boolean z10) {
        if (a()) {
            return;
        }
        bb.b(this.f60660d, z10 ? "fullscreenOn" : "fullscreenOff", 1, this.f60661e);
        l8 l8Var = this.f60658b;
        if (l8Var != null) {
            l8Var.a(z10);
        }
    }

    public final boolean a() {
        return this.f60661e == null || this.f60660d == null || this.f60659c == null;
    }
}
