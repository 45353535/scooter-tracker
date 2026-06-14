package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.jc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class iz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2669 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2670;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f2671;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String f2672;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2673;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private je f2674;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private iw f2675;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<Runnable> f2676 = new ArrayList();

    static {
        m6853();
        f2672 = m6852(new int[]{1266975715, -1449402714, 1843604259, -697687125, 132449138, -1260791608, -576055396, 1306205703, -1866143178, 2059488178, 1207583196, 1209526275, 572684741, 1188270581, -526816565, -363126219, -799026435, 63199240, 573207097, -146954207, 1543926893, 1455605071, 1199699856, 1196792807, 1444576168, 1865948453, 1127852407, 1212879414, -1684496068, 270357911, 1266927628, 2105559770, -984470594, -1611639142, 1972910697, 1847046555}, 70 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        int i10 = f2670 + 93;
        f2669 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public iz(Context context, iw iwVar, String str) {
        this.f2674 = new je(context, m6852(new int[]{517619062, -1831862112, 686499006, 251667173, 20914338, 240550458, 1943777681, -61446972, 1548753051, 768621586, -1200815215, -414716274}, TextUtils.lastIndexOf("", '0') + 25).intern(), m6852(new int[]{-964332785, 1682472256, 2010953171, 2011532084, -1615299659, 1596623536, -504167231, -287159301, 709675888, -539290917}, TextUtils.lastIndexOf("", '0', 0) + 18).intern());
        this.f2675 = iwVar;
        this.f2673 = str;
        ar.m4771().mo4795(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4605() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(iz.m6850(iz.this));
                    iz.m6850(iz.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ List m6850(iz izVar) {
        int i10 = f2669 + 77;
        f2670 = i10 % 128;
        int i11 = i10 % 2;
        List<Runnable> list = izVar.f2676;
        if (i11 != 0) {
            int i12 = 63 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m6853() {
        f2671 = new int[]{121065588, -1754757506, 784996495, -1333470162, 354179686, -1782335970, 1737442105, 1110840147, -187628996, -703601206, -1825364032, 379884011, -371244155, 1672869358, 1701816979, -663646964, 1200330019, 572066613};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ je m6855(iz izVar) {
        int i10 = f2669;
        f2670 = (i10 + 111) % 128;
        je jeVar = izVar.f2674;
        int i11 = i10 + 1;
        f2670 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 31 / 0;
        }
        return jeVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ iw m6857(iz izVar) {
        int i10 = f2670;
        f2669 = (i10 + 25) % 128;
        iw iwVar = izVar.f2675;
        int i11 = i10 + 53;
        f2669 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 22 / 0;
        }
        return iwVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6851(final jc jcVar, final ip ipVar) {
        String strMo6897 = jcVar.mo6897();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6858());
        sb2.append(m6852(new int[]{-587791989, 1845260723}, View.combineMeasuredStates(0, 0) + 1).intern());
        sb2.append(strMo6897);
        final String string = sb2.toString();
        final String strM6894 = jcVar.m6894();
        if (ar.m4771().mo4804()) {
            f2670 = (f2669 + 87) % 128;
            if (!ar.m4771().mo4798()) {
                int i10 = f2669 + 125;
                f2670 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f2674.m6925(strM6894);
                    throw null;
                }
                if (this.f2674.m6925(strM6894) != null) {
                    return;
                }
            }
            jx.m7070(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.5

                /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                private static int f2681 = 1;

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static char f2682 = 65152;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static char f2683 = 31284;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f2684 = 37033;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f2685 = 0;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static char f2686 = 33852;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
                
                    if (r5.m6802().m6805() == 200) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
                
                    if (java.nio.charset.Charset.forName(m6865("嫑맰멧㿎ᇲ풔뒃㜎", android.graphics.Color.green(0) + 8).intern()).newEncoder().canEncode(r5) == false) goto L30;
                 */
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private void m6863(java.lang.String r10, com.ironsource.adqualitysdk.sdk.i.jc r11, java.lang.String r12, com.ironsource.adqualitysdk.sdk.i.ip r13) {
                    /*
                        Method dump skipped, instruction units count: 444
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iz.AnonymousClass5.m6863(java.lang.String, com.ironsource.adqualitysdk.sdk.i.jc, java.lang.String, com.ironsource.adqualitysdk.sdk.i.ip):void");
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    int i11 = f2681 + 101;
                    f2685 = i11 % 128;
                    if (i11 % 2 == 0) {
                        m6863(string, jcVar, strM6894, ipVar);
                    } else {
                        m6863(string, jcVar, strM6894, ipVar);
                        throw null;
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m6864(String str) throws JSONException {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString(m6865("\ue16b㢂츏㕆", 3 - View.MeasureSpec.getMode(0)).intern());
                    if (!TextUtils.isEmpty(strOptString)) {
                        return jx.m7067(strOptString, iz.m6856(), jSONObject.optString(m6865("酫쳉", 1 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()), jSONObject.optString(m6865("᩸㏽䅛⦮", (Process.myTid() >> 22) + 4).intern()));
                    }
                    int i11 = f2685;
                    int i12 = i11 + 109;
                    f2681 = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    int i13 = i11 + 73;
                    f2681 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 86 / 0;
                    }
                    return str;
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m6865(String str, int i11) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (n.f3016) {
                        try {
                            char[] cArr2 = new char[cArr.length];
                            n.f3015 = 0;
                            char[] cArr3 = new char[2];
                            while (true) {
                                int i12 = n.f3015;
                                if (i12 < cArr.length) {
                                    cArr3[0] = cArr[i12];
                                    cArr3[1] = cArr[i12 + 1];
                                    int i13 = 58224;
                                    for (int i14 = 0; i14 < 16; i14++) {
                                        char c10 = cArr3[1];
                                        char c11 = cArr3[0];
                                        char c12 = (char) (c10 - (((c11 + i13) ^ ((c11 << 4) + f2684)) ^ ((c11 >>> 5) + f2683)));
                                        cArr3[1] = c12;
                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2686) ^ ((c12 + i13) ^ ((c12 << 4) + f2682))));
                                        i13 -= 40503;
                                    }
                                    int i15 = n.f3015;
                                    cArr2[i15] = cArr3[0];
                                    cArr2[i15 + 1] = cArr3[1];
                                    n.f3015 = i15 + 2;
                                } else {
                                    str2 = new String(cArr2, 0, i11);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private void m6862(final jc jcVar2, final ip ipVar2) {
                    iz.m6857(iz.this).m6830().m6822(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo4682() {
                            iz.m6857(iz.this).m6830().m6820(this);
                            iz.m6854(iz.this, jcVar2, ipVar2);
                        }
                    });
                    f2681 = (f2685 + 71) % 128;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m6854(iz izVar, jc jcVar, ip ipVar) {
        f2670 = (f2669 + 49) % 128;
        izVar.m6851(jcVar, ipVar);
        f2670 = (f2669 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6856() {
        int i10 = (f2670 + 113) % 128;
        f2669 = i10;
        String str = f2672;
        int i11 = i10 + 57;
        f2670 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized String m6858() {
        String str;
        try {
            int i10 = f2669;
            int i11 = i10 + 33;
            f2670 = i11 % 128;
            if (i11 % 2 != 0) {
                str = this.f2673;
                int i12 = 30 / 0;
            } else {
                str = this.f2673;
            }
            f2670 = (i10 + 45) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.iz.f2670 = (com.ironsource.adqualitysdk.sdk.i.iz.f2669 + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2.f2674.m6925(r3.m6894()) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r2.f2674.m6925(r3.m6894()) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.iz.f2669 = (com.ironsource.adqualitysdk.sdk.i.iz.f2670 + 19) % 128;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6859(com.ironsource.adqualitysdk.sdk.i.jc r3) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.iz.f2670
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2669 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L1d
            java.lang.String r3 = r3.m6894()
            com.ironsource.adqualitysdk.sdk.i.je r0 = r2.f2674
            java.lang.String r3 = r0.m6925(r3)
            r0 = 64
            int r0 = r0 / r1
            if (r3 == 0) goto L33
            goto L29
        L1d:
            java.lang.String r3 = r3.m6894()
            com.ironsource.adqualitysdk.sdk.i.je r0 = r2.f2674
            java.lang.String r3 = r0.m6925(r3)
            if (r3 == 0) goto L33
        L29:
            int r3 = com.ironsource.adqualitysdk.sdk.i.iz.f2670
            int r3 = r3 + 19
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2669 = r3
            r3 = 1
            return r3
        L33:
            int r3 = com.ironsource.adqualitysdk.sdk.i.iz.f2669
            int r3 = r3 + 17
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2670 = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iz.m6859(com.ironsource.adqualitysdk.sdk.i.jc):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6861(String str, String str2, ip ipVar) {
        jc.d dVar = new jc.d(str, str2);
        if (ar.m4771().mo4785().m4768()) {
            f2670 = (f2669 + 39) % 128;
            String strM4770 = ar.m4771().mo4785().m4770(str);
            if (!(!TextUtils.isEmpty(strM4770))) {
                int i10 = f2669 + 119;
                f2670 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 80 / 0;
                }
                return null;
            }
            dVar = new jc.b(str, str2, strM4770);
        }
        return m6860(dVar, ipVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6852(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2671.clone();
                e.f1937 = 0;
                while (true) {
                    int i11 = e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1939 = (c10 << 16) + c11;
                        e.f1938 = (c12 << 16) + c13;
                        e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1939 ^ iArr2[i13];
                            e.f1939 = i14;
                            e.f1938 = e.m6422(i14) ^ e.f1938;
                            int i15 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i15;
                        }
                        int i16 = e.f1939;
                        e.f1939 = e.f1938;
                        e.f1938 = i16;
                        e.f1938 = i16 ^ iArr2[16];
                        e.f1939 ^= iArr2[17];
                        int i17 = e.f1937;
                        int i18 = e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m6423(iArr2);
                        int i20 = e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6860(final jc jcVar, final ip ipVar) {
        boolean z10;
        if (TextUtils.isEmpty(jcVar.m6892()) || TextUtils.isEmpty(jcVar.m6895())) {
            return null;
        }
        String strM6894 = jcVar.m6894();
        synchronized (this) {
            try {
                if (ar.m4771().mo4791()) {
                    z10 = true;
                } else {
                    this.f2676.add(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            iz.m6854(iz.this, jcVar, ipVar);
                        }
                    });
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            m6851(jcVar, ipVar);
        }
        return this.f2674.m6925(strM6894);
    }
}
