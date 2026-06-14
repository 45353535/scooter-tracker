package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bw;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;

/* JADX INFO: loaded from: classes10.dex */
public final class gq {

    public static class c extends gl {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2239 = 66;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2240 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2241 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6486() {
            bw.a aVar = new bw.a(mo6489());
            int i10 = f2240 + 101;
            f2241 = i10 % 128;
            if (i10 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6487() {
            f2241 = (f2240 + 113) % 128;
            String strIntern = m6515("\u000f\u0003￫￤\ufff3\f\u0001\u0012\u0007\u0005\u0014\u000e￩￭ￎ\u000b\u0004\u0013\rￎ\f\u0001\u0012\u0007\u0005\u0014\u000e\t\rￎ\r", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31, true, TextUtils.indexOf("", "") + 2, TextUtils.indexOf((CharSequence) "", '0', 0) + 163).intern();
            int i10 = f2241 + 75;
            f2240 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 28 / 0;
            }
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6488() {
            int i10 = (f2241 + 73) % 128;
            f2240 = i10;
            f2241 = (i10 + 65) % 128;
            return MIntegralSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6489() {
            int i10 = f2240 + 105;
            f2241 = i10 % 128;
            String strIntern = (i10 % 2 == 0 ? m6515("￼\ufffa\t\u0003\ufffe\u0002\u0001\ufff6\u0007", 12 >>> TextUtils.getTrimmedLength(""), false, 56 - TextUtils.getOffsetBefore("", 1), Color.blue(0) * 22603) : m6515("￼\ufffa\t\u0003\ufffe\u0002\u0001\ufff6\u0007", TextUtils.getTrimmedLength("") + 9, true, TextUtils.getOffsetBefore("", 0) + 6, 173 - Color.blue(0))).intern();
            f2241 = (f2240 + 71) % 128;
            return strIntern;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m6515(String str, int i10, boolean z10, int i11, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (b.f730) {
                try {
                    char[] cArr2 = new char[i10];
                    b.f728 = 0;
                    while (true) {
                        int i13 = b.f728;
                        if (i13 >= i10) {
                            break;
                        }
                        b.f729 = cArr[i13];
                        cArr2[b.f728] = (char) (b.f729 + i12);
                        int i14 = b.f728;
                        cArr2[i14] = (char) (cArr2[i14] - f2239);
                        b.f728 = i14 + 1;
                    }
                    if (i11 > 0) {
                        b.f731 = i11;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = b.f731;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = b.f731;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i10];
                        b.f728 = 0;
                        while (true) {
                            int i17 = b.f728;
                            if (i17 >= i10) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i10 - i17) - 1];
                            b.f728 = i17 + 1;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public static class d extends gl {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2242 = 3189224698054276520L;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2243 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2244 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6486() {
            bw.b bVar = new bw.b(mo6489());
            f2243 = (f2244 + 71) % 128;
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6487() {
            int i10 = f2244 + 89;
            f2243 = i10 % 128;
            return m6516("竎违\uea9b窭\udb43祥Ʀ뮕갃쏷⬙\uecb2ퟪ굒牮핕弄瘦藏㿰\u2060徸꼉恉䮇⥱\uf68c䤾絝\uf2f1ᧀ", i10 % 2 != 0 ? View.MeasureSpec.makeMeasureSpec(1, 0) : View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6488() {
            int i10 = f2244 + 11;
            f2243 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 0;
            }
            return MBridgeSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6489() {
            int i10 = f2243 + 21;
            f2244 = i10 % 128;
            int i11 = i10 % 2 == 0 ? 1 : 0;
            return m6516("엯糮谔얂録य未\uf3beጪチ䶖\ua4cb棃", KeyEvent.getDeadChar(i11, i11)).intern();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m6516(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2308) {
                try {
                    char[] cArrM6531 = h.m6531(f2242, cArr, i10);
                    h.f2309 = 4;
                    while (true) {
                        int i11 = h.f2309;
                        if (i11 < cArrM6531.length) {
                            h.f2307 = i11 - 4;
                            cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2242));
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
    }

    public gq() {
    }

    public gq(Context context) {
        context.getApplicationContext();
    }
}
