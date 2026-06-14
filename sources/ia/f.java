package ia;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f73975a = new ArrayList();

    private int b(long j10) {
        for (int i10 = 0; i10 < this.f73975a.size(); i10++) {
            if (j10 < ((lb.e) this.f73975a.get(i10)).f94093b) {
                return i10;
            }
        }
        return this.f73975a.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // ia.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(lb.e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f94093b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            q9.a.a(r0)
            long r5 = r10.f94093b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f94095d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList r2 = r9.f73975a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f94093b
            java.util.ArrayList r3 = r9.f73975a
            java.lang.Object r3 = r3.get(r2)
            lb.e r3 = (lb.e) r3
            long r7 = r3.f94093b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList r11 = r9.f73975a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList r3 = r9.f73975a
            java.lang.Object r3 = r3.get(r2)
            lb.e r3 = (lb.e) r3
            long r5 = r3.f94093b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList r11 = r9.f73975a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.f.a(lb.e, long):boolean");
    }

    @Override // ia.a
    public void clear() {
        this.f73975a.clear();
    }

    @Override // ia.a
    public void discardCuesBeforeTimeUs(long j10) {
        int iB = b(j10);
        if (iB == 0) {
            return;
        }
        long j11 = ((lb.e) this.f73975a.get(iB - 1)).f94095d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iB--;
        }
        this.f73975a.subList(0, iB).clear();
    }

    @Override // ia.a
    public ImmutableList getCuesAtTimeUs(long j10) {
        int iB = b(j10);
        if (iB == 0) {
            return ImmutableList.of();
        }
        lb.e eVar = (lb.e) this.f73975a.get(iB - 1);
        long j11 = eVar.f94095d;
        return (j11 == -9223372036854775807L || j10 < j11) ? eVar.f94092a : ImmutableList.of();
    }

    @Override // ia.a
    public long getNextCueChangeTimeUs(long j10) {
        if (this.f73975a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((lb.e) this.f73975a.get(0)).f94093b) {
            return ((lb.e) this.f73975a.get(0)).f94093b;
        }
        for (int i10 = 1; i10 < this.f73975a.size(); i10++) {
            lb.e eVar = (lb.e) this.f73975a.get(i10);
            if (j10 < eVar.f94093b) {
                long j11 = ((lb.e) this.f73975a.get(i10 - 1)).f94095d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= eVar.f94093b) ? eVar.f94093b : j11;
            }
        }
        long j12 = ((lb.e) Iterables.getLast(this.f73975a)).f94095d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // ia.a
    public long getPreviousCueChangeTimeUs(long j10) {
        if (this.f73975a.isEmpty() || j10 < ((lb.e) this.f73975a.get(0)).f94093b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f73975a.size(); i10++) {
            long j11 = ((lb.e) this.f73975a.get(i10)).f94093b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                lb.e eVar = (lb.e) this.f73975a.get(i10 - 1);
                long j12 = eVar.f94095d;
                return (j12 == -9223372036854775807L || j12 > j10) ? eVar.f94093b : j12;
            }
        }
        lb.e eVar2 = (lb.e) Iterables.getLast(this.f73975a);
        long j13 = eVar2.f94095d;
        return (j13 == -9223372036854775807L || j10 < j13) ? eVar2.f94093b : j13;
    }
}
