package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class td0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f116201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m42 f116202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q52 f116203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f116204d;

    public /* synthetic */ td0(Context context, v5 v5Var) {
        this(v5Var, new m42(context), new q52());
    }

    public final void a(String str) {
        ti0 ti0Var;
        synchronized (this.f116204d) {
            try {
                m42 m42Var = this.f116202b;
                if (m42Var.f113318b.containsKey(str) && (ti0Var = m42Var.f113317a) != null) {
                    ti0Var.f116253c++;
                    ti0Var.f116251a.obtainMessage(3, 1, 0, str).sendToTarget();
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public td0(v5 v5Var, m42 m42Var, q52 q52Var) {
        this.f116201a = v5Var;
        this.f116202b = m42Var;
        this.f116203c = q52Var;
        this.f116204d = new Object();
    }

    public final void a(dx1 dx1Var, t42 t42Var, m30 m30Var) {
        synchronized (this.f116204d) {
            qz1 qz1Var = dx1Var.f110104a;
            q52 q52Var = this.f116203c;
            q52Var.getClass();
            List<Pair> listC0 = kotlin.sequences.k.c0(kotlin.sequences.k.Q(kotlin.sequences.k.Q(kotlin.sequences.k.R(kotlin.sequences.k.K(CollectionsKt.asSequence(qz1Var.f115232a), new n52(q52Var)), o52.f114204b), l52.f112974b), m52.f113323b));
            if (listC0.isEmpty()) {
                t42Var.a();
                return;
            }
            sd0 sd0Var = new sd0(this.f116201a, listC0.size(), t42Var, m30Var);
            this.f116201a.a(u5.f116512p, null);
            for (Pair pair : listC0) {
                this.f116202b.a((String) pair.component1(), sd0Var, (String) pair.component2());
            }
            Unit unit = Unit.f93236a;
        }
    }
}
