package yads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class fz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw1 f110985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hg2 f110986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w52 f110987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n21 f110988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k31 f110989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yw1 f110990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f110991g;

    public /* synthetic */ fz1(Context context, rw1 rw1Var, hg2 hg2Var, w52 w52Var) {
        this(rw1Var, hg2Var, w52Var, new n21(context), new k31(), new yw1(hg2Var), new CopyOnWriteArraySet());
    }

    public fz1(rw1 rw1Var, hg2 hg2Var, w52 w52Var, n21 n21Var, k31 k31Var, yw1 yw1Var, Set set) {
        this.f110985a = rw1Var;
        this.f110986b = hg2Var;
        this.f110987c = w52Var;
        this.f110988d = n21Var;
        this.f110989e = k31Var;
        this.f110990f = yw1Var;
        this.f110991g = set;
    }
}
