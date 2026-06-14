package yads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class j21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v21 f112220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f112221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m31 f112222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f112223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f112224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vq1 f112225f;

    public j21(v21 v21Var, Set set, m31 m31Var, Handler handler, AtomicInteger atomicInteger, vq1 vq1Var) {
        this.f112220a = v21Var;
        this.f112221b = set;
        this.f112222c = m31Var;
        this.f112223d = handler;
        this.f112224e = atomicInteger;
        this.f112225f = vq1Var;
    }

    public final void a(Map map) {
        if (this.f112224e.decrementAndGet() == 0) {
            this.f112222c.a(map);
        }
    }

    public final boolean a(d31 d31Var) {
        int iA = d31Var.a();
        int iB = d31Var.b();
        this.f112225f.getClass();
        if (vq1.a() >= (iA * iB * 4) + 1048576.0f) {
            return true;
        }
        boolean z10 = lb1.f113032a;
        return false;
    }

    public final void a() {
        final HashMap map = new HashMap();
        for (final d31 d31Var : this.f112221b) {
            final String str = d31Var.f109733c;
            final int i10 = d31Var.f109732b;
            final int i11 = d31Var.f109731a;
            boolean z10 = lb1.f113032a;
            if (a(d31Var)) {
                this.f112223d.post(new Runnable() { // from class: yads.la
                    @Override // java.lang.Runnable
                    public final void run() {
                        j21.a(this.f113015b, str, i11, i10, map, d31Var);
                    }
                });
            } else {
                a(map);
            }
        }
    }

    public static final void a(j21 j21Var, String str, int i10, int i11, Map map, d31 d31Var) {
        j21Var.f112220a.a(str, new i21(j21Var, map, d31Var), i10, i11);
    }
}
