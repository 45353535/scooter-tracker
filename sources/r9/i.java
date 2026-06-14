package r9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f99335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f99336b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f99337c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityQueue f99338d = new PriorityQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f99339e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f99340f;

    private static final class a implements Comparable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f99342c = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f99341b = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f99342c, aVar.f99342c);
        }

        public void c(long j10, d0 d0Var) {
            q9.a.a(j10 != -9223372036854775807L);
            q9.a.g(this.f99341b.isEmpty());
            this.f99342c = j10;
            this.f99341b.add(d0Var);
        }
    }

    public interface b {
        void a(long j10, d0 d0Var);
    }

    public i(b bVar) {
        this.f99335a = bVar;
    }

    private d0 c(d0 d0Var) {
        d0 d0Var2 = this.f99336b.isEmpty() ? new d0() : (d0) this.f99336b.pop();
        d0Var2.S(d0Var.a());
        System.arraycopy(d0Var.e(), d0Var.f(), d0Var2.e(), 0, d0Var2.a());
        return d0Var2;
    }

    private void e(int i10) {
        while (this.f99338d.size() > i10) {
            a aVar = (a) o0.i((a) this.f99338d.poll());
            for (int i11 = 0; i11 < aVar.f99341b.size(); i11++) {
                this.f99335a.a(aVar.f99342c, (d0) aVar.f99341b.get(i11));
                this.f99336b.push((d0) aVar.f99341b.get(i11));
            }
            aVar.f99341b.clear();
            a aVar2 = this.f99340f;
            if (aVar2 != null && aVar2.f99342c == aVar.f99342c) {
                this.f99340f = null;
            }
            this.f99337c.push(aVar);
        }
    }

    public void a(long j10, d0 d0Var) {
        int i10 = this.f99339e;
        if (i10 == 0 || (i10 != -1 && this.f99338d.size() >= this.f99339e && j10 < ((a) o0.i((a) this.f99338d.peek())).f99342c)) {
            this.f99335a.a(j10, d0Var);
            return;
        }
        d0 d0VarC = c(d0Var);
        a aVar = this.f99340f;
        if (aVar != null && j10 == aVar.f99342c) {
            aVar.f99341b.add(d0VarC);
            return;
        }
        a aVar2 = this.f99337c.isEmpty() ? new a() : (a) this.f99337c.pop();
        aVar2.c(j10, d0VarC);
        this.f99338d.add(aVar2);
        this.f99340f = aVar2;
        int i11 = this.f99339e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f99338d.clear();
    }

    public void d() {
        e(0);
    }

    public int f() {
        return this.f99339e;
    }

    public void g(int i10) {
        q9.a.g(i10 >= 0);
        this.f99339e = i10;
        e(i10);
    }
}
