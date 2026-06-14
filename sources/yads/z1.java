package yads;

import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f118487b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile z1 f118488c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f118489a = new HashMap();

    public final x1 a(long j10) {
        x1 x1Var;
        synchronized (f118487b) {
            x1Var = (x1) this.f118489a.remove(Long.valueOf(j10));
        }
        return x1Var;
    }

    public final void a(long j10, x1 x1Var) {
        synchronized (f118487b) {
            this.f118489a.put(Long.valueOf(j10), x1Var);
            Unit unit = Unit.f93236a;
        }
    }
}
