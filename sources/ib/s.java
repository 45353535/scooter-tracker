package ib;

import oa.q0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f74131a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f74131a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static q0 b(oa.s sVar) {
        return c(sVar, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static oa.q0 c(oa.s r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.s.c(oa.s, boolean, boolean):oa.q0");
    }

    public static q0 d(oa.s sVar, boolean z10) {
        return c(sVar, false, z10);
    }
}
