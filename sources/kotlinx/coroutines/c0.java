package kotlinx.coroutines;

import eg.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jg.e0 f93596a = new jg.e0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jg.e0 f93597b = new jg.e0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final jg.e0 f93598c = new jg.e0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final jg.e0 f93599d = new jg.e0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final jg.e0 f93600e = new jg.e0("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p f93601f = new p(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p f93602g = new p(true);

    public static final Object g(Object obj) {
        return obj instanceof y0 ? new v((y0) obj) : obj;
    }

    public static final Object h(Object obj) {
        y0 y0Var;
        v vVar = obj instanceof v ? (v) obj : null;
        return (vVar == null || (y0Var = vVar.f93643a) == null) ? obj : y0Var;
    }
}
