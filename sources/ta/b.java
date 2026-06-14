package ta;

import j$.util.Objects;
import oa.b0;
import oa.e;
import oa.f;
import oa.s;
import oa.y;

/* JADX INFO: loaded from: classes12.dex */
final class b extends e {

    /* JADX INFO: renamed from: ta.b$b, reason: collision with other inner class name */
    private static final class C1307b implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f105015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f105016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y.a f105017c;

        private long b(s sVar) {
            while (sVar.getPeekPosition() < sVar.getLength() - 6 && !y.h(sVar, this.f105015a, this.f105016b, this.f105017c)) {
                sVar.advancePeekPosition(1);
            }
            if (sVar.getPeekPosition() < sVar.getLength() - 6) {
                return this.f105017c.f96675a;
            }
            sVar.advancePeekPosition((int) (sVar.getLength() - sVar.getPeekPosition()));
            return this.f105015a.f96473j;
        }

        @Override // oa.e.f
        public e.C1111e a(s sVar, long j10) {
            long position = sVar.getPosition();
            long jB = b(sVar);
            long peekPosition = sVar.getPeekPosition();
            sVar.advancePeekPosition(Math.max(6, this.f105015a.f96466c));
            long jB2 = b(sVar);
            return (jB > j10 || jB2 <= j10) ? jB2 <= j10 ? e.C1111e.f(jB2, sVar.getPeekPosition()) : e.C1111e.d(jB, position) : e.C1111e.e(peekPosition);
        }

        @Override // oa.e.f
        public /* synthetic */ void onSeekFinished() {
            f.a(this);
        }

        private C1307b(b0 b0Var, int i10) {
            this.f105015a = b0Var;
            this.f105016b = i10;
            this.f105017c = new y.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final b0 b0Var, int i10, long j10, long j11) {
        super(new e.d() { // from class: ta.a
            @Override // oa.e.d
            public final long timeUsToTargetTime(long j12) {
                return b0Var.i(j12);
            }
        }, new C1307b(b0Var, i10), b0Var.f(), 0L, b0Var.f96473j, j10, j11, b0Var.d(), Math.max(6, b0Var.f96466c));
        Objects.requireNonNull(b0Var);
    }
}
