package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class iw {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2636 = {'9', 'k', 'f', 'd', 'g', 'g', 'W', IOUtils.DIR_SEPARATOR_WINDOWS, 'n', 'p', 's', 'u', 'l', 'Y', '*', 'a', 'g', 'a', 'g', 'h', 'B', 'J', 'q', 'G', 'H', 'o', 'q', 's', 'J', 'A', 'l', 't', 's', 'q', 'n', 'F', 'I', 'k', 'k', 's', 'm', 'l', 's', 'J', 'B', 'g', 'n', 'n', 'f', 'k', 'I', ':', 'S', 'O', '6', 'G', 'p', 'I', 'I', 'k', 'l', 'q', 'o', 'n', 'p', 'l', 'V', 'T', 'g', 'i', 'h', 'h', 'k', 'I', 'K', 'n', 'k', 'k', 'B', 'G', 'n', 'q', 'J', 'H', 'q', 'p', 'r', 'o', 'f', 'd', 'd', 277, 276, 262, 278, 274, 262, 243, 262, 268, 272, 279, 271, 266, 193, 272, 277, 193, 261, 262, 266, 275, 277, 193, 262, 271, 272, 262, 270, 272, 244, 271, 280, 272, 261, 277, 278, 265, 276, 193, 276, 258, 280, 193, 275, 262, 264, 258, 271, 258, 238, 268, 275, 272, 280, 277, 262, 239, 193, 271, 262, 265, 280, 193};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2637 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2638;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2639 = false;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final iv f2640;

    interface e {
        /* JADX INFO: renamed from: ﾇ */
        iq mo6831();
    }

    public iw(Context context) {
        this.f2640 = new iv(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ iv m6824(iw iwVar) {
        int i10 = f2638 + 37;
        f2637 = i10 % 128;
        int i11 = i10 % 2;
        iv ivVar = iwVar.f2640;
        if (i11 != 0) {
            return ivVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6826(final iy iyVar, final e eVar) {
        f2637 = (f2638 + 47) % 128;
        if (this.f2639) {
            k.m7098(m6825(new int[]{0, 14, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true).intern(), m6825(new int[]{91, 63, 161, 30}, null, true).intern());
            int i10 = f2638 + 5;
            f2637 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            return;
        }
        jx.m7070(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2643 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f2644 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f2645 = -2129765469319968211L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private void m6832(final iy iyVar2, final e eVar2) {
                iw.m6824(iw.this).m6822(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo4682() {
                        iw.m6824(iw.this).m6820(this);
                        iw.m6827(iw.this, iyVar2, eVar2);
                    }
                });
                f2644 = (f2643 + 55) % 128;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private void m6833(final iy iyVar2, e eVar2) {
                f2644 = (f2643 + 79) % 128;
                if (!iw.m6824(iw.this).m6818()) {
                    f2643 = (f2644 + 103) % 128;
                    m6832(iyVar2, eVar2);
                    return;
                }
                try {
                    final iq iqVarMo6831 = eVar2.mo6831();
                    if (iqVarMo6831 == null) {
                        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.3

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static int f2652 = 0;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static int f2653 = 1;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static long f2654 = 0;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static char f2655 = 55618;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static int f2656;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static String m6835(String str, char c10, String str2, int i11, String str3) {
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
                                        cArr5[2] = (char) (cArr5[2] + ((char) i11));
                                        int length = cArr3.length;
                                        char[] cArr6 = new char[length];
                                        j.f2699 = 0;
                                        while (true) {
                                            int i12 = j.f2699;
                                            if (i12 < length) {
                                                int i13 = (i12 + 2) % 4;
                                                int i14 = (i12 + 3) % 4;
                                                int i15 = cArr4[i12 % 4] * 32718;
                                                char c11 = cArr5[i13];
                                                char c12 = (char) ((i15 + c11) % 65535);
                                                j.f2698 = c12;
                                                cArr5[i14] = (char) (((cArr4[i14] * 32718) + c11) / 65535);
                                                cArr4[i14] = c12;
                                                int i16 = j.f2699;
                                                cArr6[i16] = (char) (((((long) (c12 ^ cArr3[i16])) ^ f2654) ^ ((long) f2656)) ^ ((long) f2655));
                                                j.f2699 = i16 + 1;
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

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() throws Exception {
                                int iM6805;
                                iq iqVar = iqVarMo6831;
                                if (iqVar != null) {
                                    iM6805 = iqVar.m6802().m6805();
                                    f2653 = (f2652 + 61) % 128;
                                } else {
                                    iM6805 = -1;
                                }
                                iy iyVar3 = iyVar2;
                                iq iqVar2 = iqVarMo6831;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m6835("堏\ud9a0\u007f覬ꂷ旆륐㍣睌샪죽ꨲ균㩖ᛀ墟柉\udc2aݾꞸ鴆뗚톕\ue753\ue0aa꽠粄뵶\ue40c䭝蹫꣎ߞ\ue7f3鮉坪䛬퍊쒨\ue2cf鮙솵㉬ﾕծ䘗\uda5eͼၫ頥솬笫鉣䱁\ue579틈떢⑥큚樂픒듭毴\uf175\u0b0d궝냫\ueece嶩", (char) (Color.argb(0, 0, 0, 0) + 4393), "\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0) - 1047993655, "즰裢⧁\uf111").intern());
                                sb2.append(iM6805);
                                iyVar3.mo4676(iqVar2, sb2.toString());
                                int i11 = f2652 + 93;
                                f2653 = i11 % 128;
                                if (i11 % 2 == 0) {
                                    throw null;
                                }
                            }
                        });
                        return;
                    }
                    String strM6849 = ix.m6849(iqVarMo6831);
                    String strIntern = m6834("溩滧쀄핒詌儍䅼追䙲늗样噻㾠寿ヱ纅ᓐп", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m6834("\ud9d7\ud990ᘡ蹀屣綳ᩮꌔ\uf102擠㌽竽補跗毧刯ꎸ퉈聄╵筴窱뤅ﲊሠϵ톾ퟞ\u2d9d⠫ڿ꼬안煝㽴蚶鰒馞垚姣럪껔貆ㅈ亻\uf775ꕖ\u085d晑Ῠ", View.MeasureSpec.getSize(0) + 1).intern());
                    sb2.append(strM6849);
                    k.m7097(strIntern, sb2.toString());
                    t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() throws Exception {
                            iyVar2.mo4675(iqVarMo6831);
                        }
                    });
                } catch (Exception e10) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m6834("䝵䜠졘桗舛⊅ﱬﱠ澭뫜핹◊ᙲ叭跦ഏ㴇\u0c75昁穅\ue5d0ⓖ弉ꎽ貜\uddc9㟻裫댼\uf648\ue0a0\uf049寭꽡", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                    sb3.append(e10.getLocalizedMessage());
                    iyVar2.mo4676(null, sb3.toString());
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                f2644 = (f2643 + 57) % 128;
                m6833(iyVar, eVar);
                f2643 = (f2644 + 1) % 128;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m6834(String str, int i11) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (h.f2308) {
                    try {
                        char[] cArrM6531 = h.m6531(f2645, cArr, i11);
                        h.f2309 = 4;
                        while (true) {
                            int i12 = h.f2309;
                            if (i12 < cArrM6531.length) {
                                h.f2307 = i12 - 4;
                                cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2645));
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
        });
        int i11 = f2638 + 45;
        f2637 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 26 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6827(iw iwVar, iy iyVar, e eVar) {
        f2638 = (f2637 + 99) % 128;
        iwVar.m6826(iyVar, eVar);
        int i10 = f2638 + 101;
        f2637 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 94 / 0;
        }
    }

    @TargetApi(3)
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6828(final String str, final JSONObject jSONObject, iy iyVar) {
        if (!TextUtils.isEmpty(str)) {
            m6826(iyVar, new e() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iw.e
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                public final iq mo6831() {
                    return ix.m6838(jSONObject, str);
                }
            });
            return;
        }
        f2638 = (f2637 + 23) % 128;
        k.m7096(m6825(new int[]{0, 14, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true).intern(), m6825(new int[]{14, 77, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false).intern());
        int i10 = f2638 + 61;
        f2637 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6829() {
        f2638 = (f2637 + 77) % 128;
        this.f2640.m6821();
        this.f2639 = true;
        f2637 = (f2638 + 23) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6825(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2636, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final iv m6830() {
        int i10 = f2638;
        iv ivVar = this.f2640;
        f2637 = (i10 + 115) % 128;
        return ivVar;
    }
}
