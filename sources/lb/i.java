package lb;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i {
    private static int a(k kVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int nextEventTimeIndex = kVar.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = kVar.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || kVar.getEventTime(nextEventTimeIndex + (-1)) != j10) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    private static void b(k kVar, int i10, q9.l lVar) {
        long eventTime = kVar.getEventTime(i10);
        List cues = kVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i10 == kVar.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = kVar.getEventTime(i10 + 1) - kVar.getEventTime(i10);
        if (eventTime2 > 0) {
            lVar.accept(new e(cues, eventTime, eventTime2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(lb.k r11, lb.t.b r12, q9.l r13) {
        /*
            long r0 = r12.f94121a
            int r0 = a(r11, r0)
            long r1 = r12.f94121a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3a
            int r1 = r11.getEventTimeCount()
            if (r0 >= r1) goto L3a
            long r3 = r12.f94121a
            java.util.List r6 = r11.getCues(r3)
            long r3 = r11.getEventTime(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3a
            long r7 = r12.f94121a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3a
            lb.e r5 = new lb.e
            long r9 = r3 - r7
            r5.<init>(r6, r7, r9)
            r13.accept(r5)
            r1 = 1
            goto L3b
        L3a:
            r1 = r2
        L3b:
            r3 = r0
        L3c:
            int r4 = r11.getEventTimeCount()
            if (r3 >= r4) goto L48
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3c
        L48:
            boolean r3 = r12.f94122b
            if (r3 == 0) goto L74
            if (r1 == 0) goto L50
            int r0 = r0 + (-1)
        L50:
            if (r2 >= r0) goto L58
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L50
        L58:
            if (r1 == 0) goto L74
            lb.e r3 = new lb.e
            long r1 = r12.f94121a
            java.util.List r4 = r11.getCues(r1)
            long r5 = r11.getEventTime(r0)
            long r1 = r12.f94121a
            long r11 = r11.getEventTime(r0)
            long r7 = r1 - r11
            r3.<init>(r4, r5, r7)
            r13.accept(r3)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.i.c(lb.k, lb.t$b, q9.l):void");
    }
}
