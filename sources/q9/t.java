package q9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import n9.n;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f98863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f98864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f98865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f98866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f98867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f98868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f98869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f98870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f98871i;

    public interface a {
        void invoke(Object obj);
    }

    public interface b {
        void a(Object obj, n9.n nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f98872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n.b f98873b = new n.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f98874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f98875d;

        public c(Object obj) {
            this.f98872a = obj;
        }

        public void a(int i10, a aVar) {
            if (this.f98875d) {
                return;
            }
            if (i10 != -1) {
                this.f98873b.a(i10);
            }
            this.f98874c = true;
            aVar.invoke(this.f98872a);
        }

        public void b(b bVar) {
            if (this.f98875d || !this.f98874c) {
                return;
            }
            n9.n nVarE = this.f98873b.e();
            this.f98873b = new n.b();
            this.f98874c = false;
            bVar.a(this.f98872a, nVarE);
        }

        public void c(b bVar) {
            this.f98875d = true;
            if (this.f98874c) {
                this.f98874c = false;
                bVar.a(this.f98872a, this.f98873b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f98872a.equals(((c) obj).f98872a);
        }

        public int hashCode() {
            return this.f98872a.hashCode();
        }
    }

    public t(Looper looper, h hVar, b bVar) {
        this(new CopyOnWriteArraySet(), looper, hVar, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator it = this.f98866d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f98865c);
            if (this.f98864b.hasMessages(1)) {
                break;
            }
        }
        return true;
    }

    private void l() {
        if (this.f98871i) {
            q9.a.g(Thread.currentThread() == this.f98864b.getLooper().getThread());
        }
    }

    public void c(Object obj) {
        q9.a.e(obj);
        synchronized (this.f98869g) {
            try {
                if (this.f98870h) {
                    return;
                }
                this.f98866d.add(new c(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t d(Looper looper, h hVar, b bVar) {
        return new t(this.f98866d, looper, hVar, bVar, this.f98871i);
    }

    public t e(Looper looper, b bVar) {
        return d(looper, this.f98863a, bVar);
    }

    public void f() {
        l();
        if (this.f98868f.isEmpty()) {
            return;
        }
        if (!this.f98864b.hasMessages(1)) {
            q qVar = this.f98864b;
            qVar.a(qVar.obtainMessage(1));
        }
        boolean zIsEmpty = this.f98867e.isEmpty();
        this.f98867e.addAll(this.f98868f);
        this.f98868f.clear();
        if (zIsEmpty) {
            while (!this.f98867e.isEmpty()) {
                ((Runnable) this.f98867e.peekFirst()).run();
                this.f98867e.removeFirst();
            }
        }
    }

    public void h(final int i10, final a aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f98866d);
        this.f98868f.add(new Runnable() { // from class: q9.s
            @Override // java.lang.Runnable
            public final void run() {
                t.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f98869g) {
            this.f98870h = true;
        }
        Iterator it = this.f98866d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f98865c);
        }
        this.f98866d.clear();
    }

    public void j(Object obj) {
        l();
        for (c cVar : this.f98866d) {
            if (cVar.f98872a.equals(obj)) {
                cVar.c(this.f98865c);
                this.f98866d.remove(cVar);
            }
        }
    }

    public void k(int i10, a aVar) {
        h(i10, aVar);
        f();
    }

    private t(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, h hVar, b bVar, boolean z10) {
        this.f98863a = hVar;
        this.f98866d = copyOnWriteArraySet;
        this.f98865c = bVar;
        this.f98869g = new Object();
        this.f98867e = new ArrayDeque();
        this.f98868f = new ArrayDeque();
        this.f98864b = hVar.createHandler(looper, new Handler.Callback() { // from class: q9.r
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f98859b.g(message);
            }
        });
        this.f98871i = z10;
    }
}
