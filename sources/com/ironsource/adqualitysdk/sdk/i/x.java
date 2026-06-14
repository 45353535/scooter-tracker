package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3187 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3188 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3189 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f3190 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f3191 = 203967174;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, u> f3194 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, ac> f3192 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, z> f3193 = new HashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m7341(x xVar) {
        int i10 = f3189 + 81;
        f3188 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, z> map = xVar.f3193;
        if (i11 != 0) {
            int i12 = 99 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m7342(JSONObject jSONObject) {
        int i10 = f3188 + 37;
        f3189 = i10 % 128;
        int i11 = i10 % 2;
        String strM7344 = m7344(jSONObject);
        if (i11 == 0) {
            int i12 = 94 / 0;
        }
        int i13 = f3188 + 57;
        f3189 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 62 / 0;
        }
        return strM7344;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m7345(x xVar) {
        int i10 = (f3189 + 71) % 128;
        f3188 = i10;
        Map<String, u> map = xVar.f3194;
        int i11 = i10 + 81;
        f3189 = i11 % 128;
        if (i11 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m7347(final JSONObject jSONObject, final l lVar, final jh jhVar, final is isVar) {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                String strM7342 = x.m7342(jSONObject);
                u uVar = (u) x.m7345(x.this).get(strM7342);
                if (uVar == null) {
                    uVar = new u(jSONObject, isVar);
                    x.m7345(x.this).put(strM7342, uVar);
                } else {
                    uVar.m7359(isVar);
                    uVar.m7320(jSONObject);
                }
                uVar.m7339((r) lVar);
                uVar.m7319((jg) jhVar);
            }
        });
        f3189 = (f3188 + 77) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7350() {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                ArrayList arrayList = new ArrayList(x.m7345(x.this).values());
                x.m7345(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).m7314();
                }
            }
        });
        f3188 = (f3189 + 45) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Map m7343(x xVar) {
        int i10 = f3189;
        f3188 = (i10 + 37) % 128;
        Map<String, ac> map = xVar.f3192;
        f3188 = (i10 + 9) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m7346() {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                ArrayList arrayList = new ArrayList(x.m7343(x.this).values());
                x.m7343(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ac) it.next()).m4576();
                }
            }
        });
        int i10 = f3189 + 107;
        f3188 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 56 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7351(final JSONObject jSONObject, final p pVar, final it itVar) {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                String strM7342 = x.m7342(jSONObject);
                z zVar = (z) x.m7341(x.this).get(strM7342);
                if (zVar == null) {
                    zVar = new z(jSONObject, itVar);
                    x.m7341(x.this).put(strM7342, zVar);
                } else {
                    zVar.m7401(jSONObject, itVar);
                }
                zVar.m7339(pVar);
            }
        });
        f3189 = (f3188 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m7352(final JSONObject jSONObject, final v vVar) {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                String strM7342 = x.m7342(jSONObject);
                ac acVar = (ac) x.m7343(x.this).get(strM7342);
                if (acVar == null) {
                    acVar = new ac(jSONObject);
                    x.m7343(x.this).put(strM7342, acVar);
                } else {
                    acVar.m4575(jSONObject);
                }
                acVar.m7339((r) vVar);
            }
        });
        f3188 = (f3189 + 83) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m7340(char c10, int i10, String str, String str2, String str3) {
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
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr.clone();
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f3190) ^ ((long) f3191)) ^ ((long) f3187));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7344(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jSONObject.optString(m7340((char) (32995 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "ఴ┛ᡝ࿎ዽ퍍Ƅ夾陊湣쿠ꖝꘈ\ue27e", "Წ\ud93a\ue374\ue180", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(m7340((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37335), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1335743573, "闲", "喙鷔흏鞑", "\u0000\u0000\u0000\u0000").intern());
        sb2.append(jSONObject.optString(m7340((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46574), KeyEvent.keyCodeFromString(""), "⏽꿐\uf517ﺸ叡悳呾낾翈嵶瀃\uf298⧝ɤ", "\u0099♂\uee71隵", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(jSONObject.optString(m7340((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 44505), TextUtils.lastIndexOf("", '0', 0, 0) - 1526815515, "뎈廿ਕЭ㐩뎄鱍\ueb46눝臭\ue16cᰴ唙", "\ue491ﺤ\ud8a4ꊭ", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(jSONObject.optString(m7340((char) (TextUtils.indexOf("", "", 0) + 12898), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 574562106, "躄⨧䆴\uf837䶗烂\ued2c\uebaa셆勿넻负풪\ueb04뻥", "㯻㼟戢⨲", "\u0000\u0000\u0000\u0000").intern()));
        String string = sb2.toString();
        int i10 = f3189 + 27;
        f3188 = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m7349(JSONObject jSONObject, p pVar) {
        int i10 = f3189 + 89;
        f3188 = i10 % 128;
        int i11 = i10 % 2;
        m7351(jSONObject, pVar, null);
        if (i11 != 0) {
            throw null;
        }
        f3188 = (f3189 + 103) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m7348() {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                ArrayList arrayList = new ArrayList(x.m7341(x.this).values());
                x.m7341(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).m7399();
                }
            }
        });
        f3188 = (f3189 + 71) % 128;
    }
}
