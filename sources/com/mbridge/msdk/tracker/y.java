package com.mbridge.msdk.tracker;

import android.database.Cursor;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
class y {
    public static long a(int i10, long j10, long j11) {
        if (i10 <= 0 || j10 == 0 || i10 <= 10) {
            return j11;
        }
        if (i10 <= 20) {
            return 60000L;
        }
        if (i10 <= 30) {
            return UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        }
        if (i10 <= 40) {
            return 180000L;
        }
        return i10 <= 50 ? 240000L : 300000L;
    }

    static boolean b(Object obj) {
        return obj == null;
    }

    static boolean a(Object obj) {
        return obj != null;
    }

    static boolean b(List<?> list) {
        return list == null || list.isEmpty();
    }

    static boolean a(List<i> list) {
        if (b((List<?>) list)) {
            return false;
        }
        for (i iVar : list) {
            if (!b(iVar)) {
                e eVarD = iVar.d();
                if (!b(eVarD) && eVarD.h() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.util.List<com.mbridge.msdk.tracker.i> b(android.database.Cursor r19) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.y.b(android.database.Cursor):java.util.List");
    }

    static boolean a(e eVar) {
        return a((Object) eVar) && eVar.h() == 1;
    }

    static void a(Cursor cursor) {
        try {
            if (!a((Object) cursor) || cursor.isClosed()) {
                return;
            }
            cursor.close();
        } catch (Exception unused) {
        }
    }
}
