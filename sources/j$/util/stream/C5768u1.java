package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5768u1 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F0 f85367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f85369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f85370d;

    public C5768u1(F0 f02, Object obj, int i10) {
        this.f85369c = i10;
        this.f85367a = f02;
        this.f85368b = 0;
        this.f85370d = obj;
    }

    public C5768u1(C5768u1 c5768u1, F0 f02, int i10, byte b10) {
        super(c5768u1);
        this.f85367a = f02;
        this.f85368b = i10;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C5768u1 c5768u1A = this;
        while (c5768u1A.f85367a.q() != 0) {
            c5768u1A.setPendingCount(c5768u1A.f85367a.q() - 1);
            int i10 = 0;
            int iCount = 0;
            while (i10 < c5768u1A.f85367a.q() - 1) {
                C5768u1 c5768u1A2 = c5768u1A.a(i10, c5768u1A.f85368b + iCount);
                iCount = (int) (c5768u1A2.f85367a.count() + ((long) iCount));
                c5768u1A2.fork();
                i10++;
            }
            c5768u1A = c5768u1A.a(i10, c5768u1A.f85368b + iCount);
        }
        switch (c5768u1A.f85369c) {
            case 0:
                ((E0) c5768u1A.f85367a).r(c5768u1A.f85368b, c5768u1A.f85370d);
                break;
            default:
                c5768u1A.f85367a.i((Object[]) c5768u1A.f85370d, c5768u1A.f85368b);
                break;
        }
        c5768u1A.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5768u1(C5768u1 c5768u1, F0 f02, int i10) {
        this(c5768u1, f02, i10, (byte) 0);
        this.f85369c = 1;
        this.f85370d = (Object[]) c5768u1.f85370d;
    }

    public final C5768u1 a(int i10, int i11) {
        switch (this.f85369c) {
            case 0:
                return new C5768u1(this, ((E0) this.f85367a).b(i10), i11);
            default:
                return new C5768u1(this, this.f85367a.b(i10), i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5768u1(C5768u1 c5768u1, E0 e02, int i10) {
        this(c5768u1, e02, i10, (byte) 0);
        this.f85369c = 0;
        this.f85370d = c5768u1.f85370d;
    }
}
