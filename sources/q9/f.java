package q9;

import android.os.Looper;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f98779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f98780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f98781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f98782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f98783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f98784f;

    public interface a {
        void a(Object obj, Object obj2);
    }

    public f(Object obj, Looper looper, Looper looper2, h hVar, a aVar) {
        this.f98779a = hVar.createHandler(looper, null);
        this.f98780b = hVar.createHandler(looper2, null);
        this.f98782d = obj;
        this.f98783e = obj;
        this.f98781c = aVar;
    }

    public static /* synthetic */ void a(f fVar, Object obj) {
        int i10 = fVar.f98784f - 1;
        fVar.f98784f = i10;
        if (i10 == 0) {
            fVar.h(obj);
        }
    }

    public static /* synthetic */ void b(f fVar, Object obj) {
        if (fVar.f98784f == 0) {
            fVar.h(obj);
        }
    }

    public static /* synthetic */ void c(final f fVar, Function function) {
        final Object objApply = function.apply(fVar.f98783e);
        fVar.f98783e = objApply;
        fVar.f98780b.post(new Runnable() { // from class: q9.e
            @Override // java.lang.Runnable
            public final void run() {
                f.a(this.f98777b, objApply);
            }
        });
    }

    private void h(Object obj) {
        Object obj2 = this.f98782d;
        this.f98782d = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f98781c.a(obj2, obj);
    }

    public Object d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f98780b.getLooper()) {
            return this.f98782d;
        }
        q9.a.g(looperMyLooper == this.f98779a.getLooper());
        return this.f98783e;
    }

    public void e(Runnable runnable) {
        this.f98779a.post(runnable);
    }

    public void f(final Object obj) {
        this.f98783e = obj;
        this.f98780b.post(new Runnable() { // from class: q9.c
            @Override // java.lang.Runnable
            public final void run() {
                f.b(this.f98763b, obj);
            }
        });
    }

    public void g(Function function, final Function function2) {
        q9.a.g(Looper.myLooper() == this.f98780b.getLooper());
        this.f98784f++;
        this.f98779a.post(new Runnable() { // from class: q9.d
            @Override // java.lang.Runnable
            public final void run() {
                f.c(this.f98769b, function2);
            }
        });
        h(function.apply(this.f98782d));
    }
}
