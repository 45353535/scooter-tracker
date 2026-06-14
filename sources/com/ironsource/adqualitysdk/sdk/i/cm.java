package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cm {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1384 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1387;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private dp f1388;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<cq> f1389 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private dh f1390;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private az f1391;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private db f1392;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Context f1393;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bd f1394;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1386 = {'n', 2941, 5708, 8509, 11270, 14313, 17130, 19894, 22665, 25496, 28543, 31313, 'E', 2898, 5753, 8470, 11324, 14281, 17132, 'D', 2901, 5739, 8469, 11314, 14272, 17133, 19840};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f1385 = -1433742800500225252L;

    public cm(Context context, dh dhVar, az azVar, db dbVar, bd bdVar) {
        this.f1390 = dhVar;
        this.f1391 = azVar;
        this.f1392 = dbVar;
        this.f1394 = bdVar;
        this.f1393 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized List<cq> m5878() {
        f1384 = (f1387 + 89) % 128;
        if (this.f1389 != null) {
            return new ArrayList(this.f1389);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = f1384 + 57;
        f1387 = i10 % 128;
        if (i10 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m5879(cm cmVar) {
        int i10 = f1384 + 51;
        int i11 = i10 % 128;
        f1387 = i11;
        int i12 = i10 % 2;
        List<cq> list = cmVar.f1389;
        if (i12 != 0) {
            int i13 = 90 / 0;
        }
        int i14 = i11 + 61;
        f1384 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 32 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hs m5880(dn dnVar) {
        f1384 = (f1387 + 61) % 128;
        if (dnVar == null) {
            return null;
        }
        hs hsVar = new hs(dnVar, m5880(this.f1390.m6202().get(dnVar.m6308())));
        int i10 = f1384 + 5;
        f1387 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 84 / 0;
        }
        return hsVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m5885(dp dpVar) {
        try {
            int i10 = f1387;
            int i11 = i10 + 33;
            f1384 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (dpVar != null) {
                this.f1388 = dpVar;
            }
            int i12 = i10 + 5;
            f1384 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 66 / 0;
                return;
            }
            return;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final synchronized boolean m5886() {
        boolean zMo5099;
        try {
            int i10 = f1387 + 47;
            f1384 = i10 % 128;
            if (i10 % 2 == 0) {
                zMo5099 = this.f1394.mo5099();
                int i11 = 71 / 0;
            } else {
                zMo5099 = this.f1394.mo5099();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zMo5099;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final Context m5887() {
        int i10 = (f1384 + 101) % 128;
        f1387 = i10;
        Context context = this.f1393;
        f1384 = (i10 + 25) % 128;
        return context;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final az m5888() {
        int i10 = f1384;
        az azVar = this.f1391;
        int i11 = i10 + 3;
        f1387 = i11 % 128;
        if (i11 % 2 == 0) {
            return azVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    protected final synchronized dp m5889() {
        dp dpVar;
        int i10 = f1384;
        dpVar = this.f1388;
        int i11 = i10 + 71;
        f1387 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        return dpVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m5890() {
        f1387 = (f1384 + 27) % 128;
        String strMo5107 = this.f1394.mo5107();
        int i10 = f1387 + 89;
        f1384 = i10 % 128;
        if (i10 % 2 != 0) {
            return strMo5107;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m5891() {
        int i10 = f1384 + 125;
        f1387 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1394.m5105();
        }
        int i11 = 14 / 0;
        return this.f1394.m5105();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m5892() {
        f1387 = (f1384 + 33) % 128;
        String strM6205 = this.f1390.m6205();
        f1384 = (f1387 + 101) % 128;
        return strM6205;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m5893() {
        f1387 = (f1384 + 113) % 128;
        String strM6206 = this.f1390.m6206();
        int i10 = f1384 + 15;
        f1387 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 57 / 0;
        }
        return strM6206;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m5894() {
        int i10 = f1387 + 103;
        f1384 = i10 % 128;
        if (i10 % 2 == 0) {
            TextUtils.isEmpty(m5891());
            throw null;
        }
        String strM5891 = m5891();
        if (TextUtils.isEmpty(strM5891) || m5884((ViewConfiguration.getScrollBarSize() >> 8) + 12, (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7).intern().equals(strM5891) || m5884((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, (char) Color.argb(0, 0, 0, 0), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern().equals(strM5891)) {
            return null;
        }
        String strM6209 = this.f1390.m6209(m5891());
        f1387 = (f1384 + 97) % 128;
        return strM6209;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[PHI: r1
  0x00af: PHI (r1v15 com.ironsource.adqualitysdk.sdk.i.dn) = (r1v14 com.ironsource.adqualitysdk.sdk.i.dn), (r1v23 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:22:0x00ad, B:18:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5897() {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cm.m5897():void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m5899() {
        f1384 = (f1387 + 49) % 128;
        String strM6210 = this.f1390.m6210();
        f1384 = (f1387 + 55) % 128;
        return strM6210;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5884(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1386[i10 + i12]) ^ (((long) i12) * f1385)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m5895() {
        int i10 = f1387 + 115;
        f1384 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1389.iterator();
            throw null;
        }
        Iterator<cq> it = this.f1389.iterator();
        while (it.hasNext()) {
            int i11 = f1387 + 87;
            f1384 = i11 % 128;
            if (i11 % 2 == 0) {
                it.next().m5969();
                throw null;
            }
            it.next().m5969();
        }
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                cm.m5879(cm.this).clear();
            }
        });
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m5896() {
        int i10 = f1384 + 111;
        f1387 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1390.m6207();
            throw null;
        }
        String strM6207 = this.f1390.m6207();
        int i11 = f1387 + 57;
        f1384 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM6207;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5881(cq cqVar) {
        f1384 = (f1387 + 91) % 128;
        this.f1389.add(cqVar);
        int i10 = f1387 + 15;
        f1384 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m5900() {
        f1387 = (f1384 + 121) % 128;
        String strM6208 = this.f1390.m6208();
        f1384 = (f1387 + 119) % 128;
        return strM6208;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5883(dp dpVar) {
        f1384 = (f1387 + 41) % 128;
        m5885(dpVar);
        int i10 = f1387 + 103;
        f1384 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m5882(dh dhVar, bd bdVar) {
        if (bdVar.mo5099()) {
            f1387 = (f1384 + 53) % 128;
            for (cq cqVar : m5878()) {
                f1387 = (f1384 + 111) % 128;
                dhVar.m6203().m6396().m6397(cqVar.m5976().m6626(), cqVar);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5898(String str, List<Object> list) {
        f1384 = (f1387 + 23) % 128;
        Iterator<cq> it = m5878().iterator();
        while (it.hasNext()) {
            f1384 = (f1387 + 7) % 128;
            it.next().m5982(str, list);
        }
    }
}
