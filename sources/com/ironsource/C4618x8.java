package com.ironsource;

import android.util.Log;
import com.ironsource.Xd;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4618x8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4618x8 f45821b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private L5 f45822a;

    private C4618x8() {
    }

    private static C4618x8 a() {
        if (f45821b == null) {
            f45821b = new C4618x8();
        }
        return f45821b;
    }

    public static void a(F5 f52, C4584v8 c4584v8) {
        if (f52 != null) {
            try {
                a().f45822a = new L5(f52, c4584v8);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public static void a(Xd.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(Xd.a aVar, Map<String, Object> map) {
        L5 l52 = a().f45822a;
        if (l52 == null) {
            Log.d(D5.f40554a, D5.U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f42094b));
        }
        l52.a(aVar.f42093a, map);
    }
}
