package yads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ft implements e23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f110850a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f110851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f110852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dt f110853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f110854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f110855f;

    public ft() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f110850a.add(new dt());
        }
        this.f110851b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f110851b.add(new et(new ga0() { // from class: yads.t6
                @Override // yads.ga0
                public final void a(ha0 ha0Var) {
                    this.f116081a.a((et) ha0Var);
                }
            }));
        }
        this.f110852c = new PriorityQueue();
    }

    public abstract void a(dt dtVar);

    @Override // yads.ba0
    public final Object b() {
        if (this.f110853d != null) {
            throw new IllegalStateException();
        }
        if (this.f110850a.isEmpty()) {
            return null;
        }
        dt dtVar = (dt) this.f110850a.pollFirst();
        this.f110853d = dtVar;
        return dtVar;
    }

    public abstract gt c();

    @Override // yads.ba0
    /* JADX INFO: renamed from: d */
    public j23 a() {
        if (this.f110851b.isEmpty()) {
            return null;
        }
        while (!this.f110852c.isEmpty()) {
            dt dtVar = (dt) this.f110852c.peek();
            int i10 = w83.f117341a;
            if (dtVar.f110672f > this.f110854e) {
                break;
            }
            dt dtVar2 = (dt) this.f110852c.poll();
            if (dtVar2.b(4)) {
                j23 j23Var = (j23) this.f110851b.pollFirst();
                j23Var.f112430b = 4 | j23Var.f112430b;
                dtVar2.b();
                this.f110850a.add(dtVar2);
                return j23Var;
            }
            a(dtVar2);
            if (f()) {
                gt gtVarC = c();
                j23 j23Var2 = (j23) this.f110851b.pollFirst();
                long j10 = dtVar2.f110672f;
                j23Var2.f111527c = j10;
                j23Var2.f112227d = gtVarC;
                j23Var2.f112228e = j10;
                dtVar2.b();
                this.f110850a.add(dtVar2);
                return j23Var2;
            }
            dtVar2.b();
            this.f110850a.add(dtVar2);
        }
        return null;
    }

    public final j23 e() {
        return (j23) this.f110851b.pollFirst();
    }

    public abstract boolean f();

    @Override // yads.ba0
    public void flush() {
        this.f110855f = 0L;
        this.f110854e = 0L;
        while (!this.f110852c.isEmpty()) {
            dt dtVar = (dt) this.f110852c.poll();
            int i10 = w83.f117341a;
            dtVar.b();
            this.f110850a.add(dtVar);
        }
        dt dtVar2 = this.f110853d;
        if (dtVar2 != null) {
            dtVar2.b();
            this.f110850a.add(dtVar2);
            this.f110853d = null;
        }
    }

    @Override // yads.ba0
    public void release() {
    }

    @Override // yads.ba0
    public final void a(i23 i23Var) {
        if (i23Var != this.f110853d) {
            throw new IllegalArgumentException();
        }
        dt dtVar = (dt) i23Var;
        if (dtVar.b(Integer.MIN_VALUE)) {
            dtVar.b();
            this.f110850a.add(dtVar);
        } else {
            long j10 = this.f110855f;
            this.f110855f = 1 + j10;
            dtVar.f110049k = j10;
            this.f110852c.add(dtVar);
        }
        this.f110853d = null;
    }

    public final void a(j23 j23Var) {
        j23Var.f112430b = 0;
        j23Var.f112227d = null;
        this.f110851b.add(j23Var);
    }

    @Override // yads.e23
    public final void a(long j10) {
        this.f110854e = j10;
    }
}
