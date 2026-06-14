package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import io.presage.Presage;
import io.presage.common.PresageSdk;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ca extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1218 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1219 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1220 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1221 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1222 = 4437560584879617831L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1223 = 792353447269362345L;

    public ca(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Presage m5654() {
        int i10 = f1218 + 81;
        f1221 = i10 % 128;
        if (i10 % 2 == 0) {
            return Presage.getInstance();
        }
        int i11 = 12 / 0;
        return Presage.getInstance();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ Presage m5655() {
        Presage presageM5654;
        int i10 = f1221 + 31;
        f1218 = i10 % 128;
        if (i10 % 2 == 0) {
            presageM5654 = m5654();
            int i11 = 91 / 0;
        } else {
            presageM5654 = m5654();
        }
        int i12 = f1218 + 33;
        f1221 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 58 / 0;
        }
        return presageM5654;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5659(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        f1221 = (f1218 + 85) % 128;
        m5661(presageOptinVideo, presageOptinVideoCallback);
        f1221 = (f1218 + 9) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5660(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f1221 = (f1218 + 3) % 128;
        m5657(presageInterstitial, presageInterstitialCallback);
        f1218 = (f1221 + 107) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5656("ț믐銻祍㼱ㅥኳ萺䇂ᢼ礛Ώ⚡련ໄᤁ\ue2a8\udd0a", (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 65132), "㜧㬆懗㶕", Color.argb(0, 0, 0, 0), "仑㻓涟擾").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ca.m5655();
            }
        });
        map.put(m5658("\ueada虣㎃곭塻\uf5b6曖ሒ辢㣺퐖䅘\uf2f4渫᭗뒫‸\udd5a事喝靤\u0091뷈", 27823 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                ca.m5660((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m5656("蔉朼鼞↢鞛祛\uf755଼쎵鶦섊㲑╺涁뭂섍없셶맡\ue830梫", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "㜧㬆懗㶕", ((byte) KeyEvent.getModifierMetaStateMask()) - 1725439885, "爙⟠抙ಲ").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                ca.m5659((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        f1218 = (f1221 + 31) % 128;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return r0.split(m5658("\uea84", 14243 - android.view.KeyEvent.normalizeMetaState(0)).intern())[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.ca.f1218 + 117;
        com.ironsource.adqualitysdk.sdk.i.ca.f1221 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r0 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ca.f1221 = (com.ironsource.adqualitysdk.sdk.i.ca.f1218 + 15) % 128;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String mo5025() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ca.f1221
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1218 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            java.lang.String r0 = r4.mo5107()
            r2 = 92
            int r2 = r2 / r1
            if (r0 == 0) goto L3c
            goto L1d
        L17:
            java.lang.String r0 = r4.mo5107()
            if (r0 == 0) goto L3c
        L1d:
            int r2 = com.ironsource.adqualitysdk.sdk.i.ca.f1218
            int r2 = r2 + 15
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1221 = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r1)
            int r2 = 14243 - r2
            java.lang.String r3 = "\uea84"
            java.lang.String r2 = m5658(r3, r2)
            java.lang.String r2 = r2.intern()
            java.lang.String[] r0 = r0.split(r2)
            r0 = r0[r1]
            return r0
        L3c:
            int r0 = com.ironsource.adqualitysdk.sdk.i.ca.f1218
            int r0 = r0 + 117
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1221 = r2
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L4c
            r0 = 51
            int r0 = r0 / r1
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.mo5025():java.lang.String");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5658(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            try {
                f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2042 = 0;
                while (true) {
                    int i11 = f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f1223);
                        f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5656(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2697) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2699 = 0;
                while (true) {
                    int i11 = j.f2699;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2698 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2699;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1222) ^ ((long) f1220)) ^ ((long) f1219));
                        j.f2699 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m5657(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f1221 = (f1218 + 23) % 128;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        f1221 = (f1218 + 21) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo5107() {
        f1218 = (f1221 + 51) % 128;
        try {
            try {
                String str = (String) Class.forName(m5658("\ueac0\uef97\ue025\ue52aﾟ\uf059\uf53c쿿쁆씕\udfad킱픊꿙ꂪꕹ뿗냦땲迌胓蕚鸾邍镙渥惡敋縛烠疢与䃨䖭帟僾喢\u2e69\u20cd▍㹌㌿㖍ๆ̡כṕ", 1361 - View.resolveSize(0, 0)).intern()).getMethod(m5658("\ueac8", 22469 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), null).invoke(null, null);
                int i10 = f1218 + 57;
                f1221 = i10 % 128;
                if (i10 % 2 == 0) {
                    return str;
                }
                throw null;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            return PresageSdk.getAdsSdkVersion();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m5661(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        f1218 = (f1221 + 57) % 128;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        f1218 = (f1221 + 73) % 128;
    }
}
