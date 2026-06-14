package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class iv extends BroadcastReceiver {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2617 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2618;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String f2619;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2620;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Context f2621;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f2622 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<iu> f2623 = new HashSet();

    static {
        m6808();
        f2619 = m6816(new int[]{1680840310, -1147872975, 167404258, -2010743116, -335671392, -1762109579, 1814456296, -1829633020, -1467497195, 1498107812}, 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        f2617 = (f2618 + 47) % 128;
    }

    public iv(Context context) {
        this.f2621 = context.getApplicationContext();
        k.m7097(f2619, m6816(new int[]{995112144, -839696886, 793125423, -823182672, -1891621481, -35567808, -1945032620, 1315422620, 1315402392, -1070529798, 1795521819, 622117249, -2128202635, 1774877377, -2024043855, 252286014}, AndroidCharacter.getMirror('0') - 18).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m6816(new int[]{-2122701851, 1546060630, 712174246, -318067401, 14123920, 1721127285, 247592397, -212372362, 804305082, 389616605, -1178561709, 1762587455, 334432064, 1298451654, -593429956, 100212106, 342276724, 1645800780}, 36 - TextUtils.indexOf("", "")).intern());
        this.f2621.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static void m6808() {
        f2620 = new int[]{1327670354, -1341658831, 542698013, 1787449947, -734461109, -14954278, 218993377, 1412001391, 55029058, -1538574215, 326963627, -820688930, -1586025059, -1868220713, 494196336, 1092001671, 175100163, -50875469};
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Set<iu> m6809() {
        HashSet hashSet = new HashSet(this.f2623);
        int i10 = f2617 + 99;
        f2618 = i10 % 128;
        if (i10 % 2 == 0) {
            return hashSet;
        }
        int i11 = 8 / 0;
        return hashSet;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m6811(iv ivVar, Context context) {
        f2618 = (f2617 + 23) % 128;
        boolean zM6814 = m6814(context);
        int i10 = f2617 + 37;
        f2618 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM6814;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6812() {
        int i10 = (f2617 + 89) % 128;
        f2618 = i10;
        String str = f2619;
        int i11 = i10 + 75;
        f2617 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6815(iv ivVar, boolean z10) {
        int i10 = f2618 + 125;
        f2617 = i10 % 128;
        int i11 = i10 % 2;
        ivVar.m6813(z10);
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.2

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f2624 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static char f2625 = 34772;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static char f2626 = 11765;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2627 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f2628 = 54483;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f2629 = 10665;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m6823(String str, int i10) {
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
                            int i11 = n.f3015;
                            if (i11 < cArr.length) {
                                cArr3[0] = cArr[i11];
                                cArr3[1] = cArr[i11 + 1];
                                int i12 = 58224;
                                for (int i13 = 0; i13 < 16; i13++) {
                                    char c10 = cArr3[1];
                                    char c11 = cArr3[0];
                                    char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2625)) ^ ((c11 >>> 5) + f2626)));
                                    cArr3[1] = c12;
                                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2628) ^ ((c12 + i12) ^ ((c12 << 4) + f2629))));
                                    i12 -= 40503;
                                }
                                int i14 = n.f3015;
                                cArr2[i14] = cArr3[0];
                                cArr2[i14 + 1] = cArr3[1];
                                n.f3015 = i14 + 2;
                            } else {
                                str2 = new String(cArr2, 0, i10);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:4:0x0011, B:11:0x004a, B:13:0x007b, B:15:0x009d, B:17:0x00a7, B:19:0x00b0, B:9:0x0030), top: B:26:0x000f }] */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void mo4564() {
                /*
                    Method dump skipped, instruction units count: 224
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iv.AnonymousClass2.mo4564():void");
            }
        });
        f2618 = (f2617 + 59) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m6818() {
        int i10 = f2618 + 75;
        f2617 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return this.f2622;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6821() {
        f2617 = (f2618 + 51) % 128;
        this.f2621.unregisterReceiver(this);
        int i10 = f2618 + 13;
        f2617 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 26 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m6813(boolean z10) {
        int i10 = f2618;
        this.f2622 = z10;
        int i11 = i10 + 3;
        f2617 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6817() {
        Iterator<iu> it = m6809().iterator();
        while (!(!it.hasNext())) {
            f2617 = (f2618 + 25) % 128;
            it.next().mo4682();
        }
        f2618 = (f2617 + 29) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m6820(iu iuVar) {
        f2617 = (f2618 + 77) % 128;
        this.f2623.remove(iuVar);
        int i10 = f2617 + 49;
        f2618 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m6822(iu iuVar) {
        f2617 = (f2618 + 55) % 128;
        this.f2623.add(iuVar);
        int i10 = f2617 + 115;
        f2618 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m6814(Context context) {
        int i10 = f2618 + 103;
        f2617 = i10 % 128;
        if (i10 % 2 != 0) {
            NetworkInfo networkInfoM6810 = m6810(context);
            if (networkInfoM6810 == null || !networkInfoM6810.isConnected()) {
                return false;
            }
            String str = f2619;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6816(new int[]{1680840310, -1147872975, 1401269269, -57271758}, 8 - KeyEvent.getDeadChar(0, 0)).intern());
            sb2.append(networkInfoM6810.getTypeName());
            sb2.append(m6816(new int[]{802974129, 1865419882, -1703191499, 2082952551, 1806828347, 721542486}, View.MeasureSpec.makeMeasureSpec(0, 0) + 11).intern());
            k.m7113(str, sb2.toString());
            f2618 = (f2617 + 61) % 128;
            return true;
        }
        m6810(context);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6816(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2620.clone();
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6819() {
        Iterator<iu> it;
        int i10 = f2618 + 121;
        f2617 = i10 % 128;
        if (i10 % 2 == 0) {
            it = m6809().iterator();
            int i11 = 82 / 0;
        } else {
            it = m6809().iterator();
        }
        while (it.hasNext()) {
            int i12 = f2618 + 91;
            f2617 = i12 % 128;
            int i13 = i12 % 2;
            it.next();
            if (i13 == 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static NetworkInfo m6810(Context context) {
        if (context != null) {
            f2617 = (f2618 + 47) % 128;
            return ((ConnectivityManager) context.getSystemService(m6816(new int[]{247592397, -212372362, -1244825590, -1813295031, -363167493, 1955524488}, 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())).getActiveNetworkInfo();
        }
        f2618 = (f2617 + 33) % 128;
        return null;
    }
}
