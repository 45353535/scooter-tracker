package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class vt2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f117186j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile vt2 f117187k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile hr2 f117188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f117189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f117190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f117191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f117192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f117193f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f117194g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f117195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f117196i;

    public final boolean a() {
        boolean z10;
        synchronized (f117186j) {
            z10 = this.f117196i;
        }
        return z10;
    }

    public final Boolean b() {
        Boolean bool;
        synchronized (f117186j) {
            bool = this.f117190c;
        }
        return bool;
    }

    public final boolean c() {
        boolean z10;
        synchronized (f117186j) {
            z10 = this.f117192e;
        }
        return z10;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (f117186j) {
            bool = this.f117189b;
        }
        return bool;
    }

    public final hr2 a(Context context) {
        hr2 hr2VarA;
        hr2 hr2Var = this.f117188a;
        if (hr2Var != null) {
            return hr2Var;
        }
        synchronized (f117186j) {
            hr2VarA = this.f117188a;
            if (hr2VarA == null) {
                ly.f113268a.getClass();
                hr2VarA = ((oy) ky.a(context)).a();
                this.f117188a = hr2VarA;
            }
        }
        return hr2VarA;
    }

    public final void a(Context context, hr2 hr2Var) {
        synchronized (f117186j) {
            this.f117188a = hr2Var;
            ly.f113268a.getClass();
            ((oy) ky.a(context)).a(hr2Var);
            Unit unit = Unit.f93236a;
        }
    }
}
