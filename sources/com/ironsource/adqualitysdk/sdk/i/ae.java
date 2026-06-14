package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
final class ae {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f151 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f152 = -6192151443298679407L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f153 = {'E', 'r', 'o', ' ', 's', 'y', 'n', 'c', 'h', 'i', 'z', 'g', 'e', 'v', 't', 'd', 'l', 'a', 'T', 'u', 'F', 'G', 'H', 'I', 'J'};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f154 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f155 = 5;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private int f156;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f157;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private long f158;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Boolean f159 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long f160;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private long f161;

    ae(int i10) {
        this.f156 = i10;
        ar.m4771().mo4795(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.1

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f162 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f163 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f164 = 3266625835755888475L;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4604(String str, int i11) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (h.f2308) {
                    try {
                        char[] cArrM6531 = h.m6531(f164, cArr, i11);
                        h.f2309 = 4;
                        while (true) {
                            int i12 = h.f2309;
                            if (i12 < cArrM6531.length) {
                                h.f2307 = i12 - 4;
                                cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f164));
                                h.f2309++;
                            } else {
                                str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo4605() {
                as asVarMo4784 = ar.m4771().mo4784();
                long jM4845 = asVarMo4784.m4845();
                if (jM4845 == 0) {
                    f162 = (f163 + 71) % 128;
                    ae.m4596(ae.this, Boolean.FALSE);
                    jM4845 = asVarMo4784.m4847();
                    kd.m7160(m4604("ũꭟĽꡓ矅瑭ᚈ\ue9b1籶\uf7ec鐐法﯁焿ᆤ\uef42祎ﲨ黛懿\uf4b7總ᱏ\ue461爇", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), m4604("열淶얱᪼鍼닟ꑸം룪ㄑ⛷衯㼌랢ꍗ\u0be1뷄㨀Ⱘ蕎つ뢎꺿Ï뚞㿤⬜艱㔈ꉼ뗯ᶀꡳ\u20cd㙷鼔⻤", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), null, false);
                    f162 = (f163 + 51) % 128;
                } else {
                    ae.m4596(ae.this, Boolean.TRUE);
                }
                ae.m4589(ae.this, asVarMo4784.m4846());
                ae.m4599(ae.this, asVarMo4784.m4847());
                ae aeVar = ae.this;
                ae.m4595(aeVar, jM4845 - ae.m4592(aeVar));
                ae aeVar2 = ae.this;
                ae.m4600(aeVar2, jM4845 - ae.m4598(aeVar2));
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ long m4589(ae aeVar, long j10) {
        int i10 = f154;
        int i11 = i10 + 109;
        f151 = i11 % 128;
        int i12 = i11 % 2;
        aeVar.f157 = j10;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 37;
        f151 = i13 % 128;
        if (i13 % 2 != 0) {
            return j10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ long m4592(ae aeVar) {
        int i10 = f154 + 53;
        int i11 = i10 % 128;
        f151 = i11;
        if (i10 % 2 == 0) {
            long j10 = aeVar.f157;
            throw null;
        }
        long j11 = aeVar.f157;
        f154 = (i11 + 25) % 128;
        return j11;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ long m4595(ae aeVar, long j10) {
        int i10 = f154 + 57;
        f151 = i10 % 128;
        int i11 = i10 % 2;
        aeVar.f160 = j10;
        if (i11 == 0) {
            int i12 = 1 / 0;
        }
        return j10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ long m4598(ae aeVar) {
        int i10 = f154 + 23;
        f151 = i10 % 128;
        if (i10 % 2 != 0) {
            return aeVar.f161;
        }
        long j10 = aeVar.f161;
        int i11 = 66 / 0;
        return j10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ long m4600(ae aeVar, long j10) {
        int i10 = (f151 + 1) % 128;
        f154 = i10;
        aeVar.f158 = j10;
        int i11 = i10 + 123;
        f151 = i11 % 128;
        if (i11 % 2 != 0) {
            return j10;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[Catch: JSONException -> 0x00fc, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00fc, blocks: (B:4:0x0014, B:9:0x0057, B:12:0x005e, B:15:0x00d7, B:17:0x00e4, B:18:0x00f6, B:14:0x00a6, B:7:0x0038), top: B:21:0x0012 }] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4590(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ae.m4590(org.json.JSONObject):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m4594(JSONObject jSONObject) {
        int i10 = f154 + 23;
        f151 = i10 % 128;
        if (i10 % 2 != 0 ? !jSONObject.has(m4601("增士䅧麜쒂闑\udc32", 1 - Color.green(0)).intern()) : !jSONObject.has(m4601("增士䅧麜쒂闑\udc32", Color.green(1)).intern())) {
            if (!jSONObject.has(m4602("\u0013\t©", 3 - TextUtils.getTrimmedLength(""), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 59)).intern())) {
                int i11 = f154 + 15;
                f151 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 28 / 0;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Boolean m4596(ae aeVar, Boolean bool) {
        int i10 = f154 + 55;
        f151 = i10 % 128;
        int i11 = i10 % 2;
        aeVar.f159 = bool;
        if (i11 == 0) {
            int i12 = 68 / 0;
        }
        return bool;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ long m4599(ae aeVar, long j10) {
        int i10 = f151;
        f154 = (i10 + 71) % 128;
        aeVar.f161 = j10;
        int i11 = i10 + 5;
        f154 = i11 % 128;
        if (i11 % 2 == 0) {
            return j10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4601(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f152, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f152));
                        h.f2309++;
                    } else {
                        str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m4597(JSONObject jSONObject) {
        f154 = (f151 + 63) % 128;
        if (Math.abs((this.f161 - this.f157) - (jSONObject.optLong(m4602("\u0013\n{", 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 8)).intern()) - jSONObject.optLong(m4601("宭寘轷\u0a92ﳮ㠰", 1 - Gravity.getAbsoluteGravity(0, 0)).intern()))) <= 10) {
            f154 = (f151 + 93) % 128;
            return true;
        }
        int i10 = f151 + 37;
        f154 = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final boolean m4603(JSONObject jSONObject) {
        if (!m4594(jSONObject)) {
            int i10 = (f151 + 53) % 128;
            f154 = i10;
            if (this.f159 != null) {
                f151 = (i10 + 89) % 128;
                try {
                    m4590(jSONObject);
                    return true;
                } catch (Exception e10) {
                    kd.m7160(m4601("ꐀꑔᾬ\u09d4驔겢눷ʛ㱴ǵ⎜髮裸⠞㕈脡\ue6af剡伇\uef64ﵾ䒜曓헒쬦", KeyEvent.getDeadChar(0, 0) + 1).intern(), m4602("\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0007\b\u0006\u0003\u0001\u0007\u0005\u000e\u0005\u0007\r\u0001\r\u000e\u000b\u0007Ë", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, (byte) (87 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), e10, false);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: JSONException -> 0x00e4, TRY_ENTER, TryCatch #1 {JSONException -> 0x00e4, blocks: (B:3:0x0008, B:8:0x003e, B:14:0x0046, B:16:0x0066, B:29:0x00bb, B:30:0x00cb, B:31:0x00d3, B:20:0x007c, B:25:0x00a6, B:23:0x0090), top: B:37:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4593(org.json.JSONObject r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ae.m4593(org.json.JSONObject, boolean):void");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4602(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f153;
                char c10 = f155;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2158 = 0;
                    while (true) {
                        int i11 = g.f2158;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2157 = cArr[i11];
                        g.f2155 = cArr[g.f2158 + 1];
                        if (g.f2157 == g.f2155) {
                            cArr3[g.f2158] = (char) (g.f2157 - b10);
                            cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                        } else {
                            g.f2156 = g.f2157 / c10;
                            g.f2154 = g.f2157 % c10;
                            g.f2159 = g.f2155 / c10;
                            g.f2152 = g.f2155 % c10;
                            if (g.f2154 == g.f2152) {
                                g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                int i12 = (g.f2156 * c10) + g.f2154;
                                int i13 = (g.f2159 * c10) + g.f2152;
                                int i14 = g.f2158;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2156 == g.f2159) {
                                g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                int i15 = (g.f2156 * c10) + g.f2154;
                                int i16 = (g.f2159 * c10) + g.f2152;
                                int i17 = g.f2158;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2156 * c10) + g.f2152;
                                int i19 = (g.f2159 * c10) + g.f2154;
                                int i20 = g.f2158;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2158 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4591(JSONObject jSONObject, boolean z10) {
        long jOptLong;
        if (jSONObject.has(m4602("\t\u0013µ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3, (byte) (66 - KeyEvent.keyCodeFromString(""))).intern())) {
            int i10 = f154 + 117;
            f151 = i10 % 128;
            if (i10 % 2 != 0) {
                if (z10) {
                    jOptLong = jSONObject.optLong(m4601("닡늒㩪鞸뾎鳮탻", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()) + this.f160;
                    f154 = (f151 + 91) % 128;
                } else {
                    jOptLong = jSONObject.optLong(m4602("\t\u0013µ", ExpandableListView.getPackedPositionGroup(0L) + 3, (byte) (66 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern()) + this.f158;
                }
                try {
                    jSONObject.put(m4602("\t\u0013µ", TextUtils.lastIndexOf("", '0') + 4, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 66)).intern(), jOptLong);
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            throw null;
        }
    }
}
