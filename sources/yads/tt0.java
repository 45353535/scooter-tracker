package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class tt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f116372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m42 f116373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q52 f116374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f116375d;

    public /* synthetic */ tt0(Context context, v5 v5Var) {
        this(v5Var, new m42(context), new q52());
    }

    public final void a() {
        synchronized (this.f116375d) {
            this.f116373b.a();
            Unit unit = Unit.f93236a;
        }
    }

    public tt0(v5 v5Var, m42 m42Var, q52 q52Var) {
        this.f116372a = v5Var;
        this.f116373b = m42Var;
        this.f116374c = q52Var;
        this.f116375d = new Object();
    }
}
