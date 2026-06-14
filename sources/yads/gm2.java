package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv0 f111277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y31 f111278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f111280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lj2 f111281e;

    public gm2(yv0 yv0Var, y31 y31Var, zu2 zu2Var, ArrayList arrayList) {
        fi.a(!y31Var.isEmpty());
        this.f111277a = yv0Var;
        this.f111278b = y31.a((Collection) y31Var);
        this.f111280d = DesugarCollections.unmodifiableList(arrayList);
        this.f111281e = zu2Var.a(this);
        this.f111279c = zu2Var.a();
    }

    public abstract String c();

    public abstract v20 d();

    public abstract lj2 e();
}
