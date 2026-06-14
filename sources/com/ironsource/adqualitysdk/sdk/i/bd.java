package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bd extends cz implements cl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f791 = 6453402919862608218L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f792 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f793 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f794 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f795 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f796 = -301922893601565001L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f797;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f798;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f799;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, b> f800;

    interface b {
        /* JADX INFO: renamed from: ｋ */
        Object mo5027(List<Object> list, ch chVar);
    }

    public bd(String str) {
        this.f798 = str;
    }

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    static /* synthetic */ Object m5091(List list, Class cls) {
        f794 = (f795 + 77) % 128;
        Object objM6139 = cz.m6139(list, 0, cls);
        int i10 = f794 + 31;
        f795 = i10 % 128;
        if (i10 % 2 != 0) {
            return objM6139;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m5093(bd bdVar) {
        int i10 = f794 + 55;
        int i11 = i10 % 128;
        f795 = i11;
        int i12 = i10 % 2;
        String str = bdVar.f799;
        if (i12 == 0) {
            throw null;
        }
        f794 = (i11 + 99) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Class m5095(bd bdVar, String str) {
        f794 = (f795 + 125) % 128;
        Class clsM5092 = bdVar.m5092(str, false);
        int i10 = f794 + 97;
        f795 = i10 % 128;
        if (i10 % 2 != 0) {
            return clsM5092;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m5097() {
        int i10 = f794;
        int i11 = (i10 + 81) % 128;
        f795 = i11;
        if (this.f799 != null) {
            f794 = (i11 + 81) % 128;
            return true;
        }
        int i12 = i10 + 101;
        f795 = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public boolean mo5098() {
        int i10 = f795 + 95;
        int i11 = i10 % 128;
        f794 = i11;
        boolean z10 = !(i10 % 2 == 0);
        f795 = (i11 + 23) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public boolean mo5099() {
        int i10 = f795 + 75;
        f794 = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    abstract Map<String, b> mo5024();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m5101(String str) {
        int i10 = f794;
        this.f799 = str;
        int i11 = i10 + 103;
        f795 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 97 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    abstract String mo5025();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m5105() {
        try {
            if (TextUtils.isEmpty(this.f797)) {
                this.f797 = mo5025();
                f795 = (f794 + 119) % 128;
            } else {
                f794 = (f795 + 87) % 128;
                if (this.f797.equals(m5096("㕥ሳ턛粗밗茕ꍎ", (char) (Process.myPid() >> 22), "⅚雡ៃ妏", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 782668984, "렔ꚔȮ툛").intern())) {
                    this.f797 = mo5025();
                    f795 = (f794 + 119) % 128;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f797;
    }

    /* JADX INFO: renamed from: ﾒ */
    abstract Class mo5026(String str);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public String mo5107() {
        f795 = (f794 + 87) % 128;
        String str = this.f799;
        if (str != null) {
            return str;
        }
        String strM5105 = m5105();
        int i10 = f794 + 117;
        f795 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM5105;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5094(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f796);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object mo5100(String str, List<Object> list, ch chVar) {
        b bVar = this.f800.get(str);
        try {
        } catch (Exception e10) {
            String str2 = this.f798;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m5094("ᛲ꡴殧⫋\uec01꿢滴‘\ue35aꋭ搨❘\ue692려签㫈\ufdc9뼗纱ㇽ\uf315뉗疡㜽\uf64a覊䬥ੳ춏貚丮", 48817 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            sb2.append(str);
            sb2.append(m5096("괁", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 5119), "⅚雡ៃ妏", (-283108343) - View.MeasureSpec.makeMeasureSpec(0, 0), "क़“\uffefꐓ").intern());
            co.m5911(str2, sb2.toString(), e10);
        }
        if (bVar != null) {
            Object objMo5027 = bVar.mo5027(list, chVar);
            int i10 = f794 + 9;
            f795 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 33 / 0;
            }
            return objMo5027;
        }
        String str3 = this.f798;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m5094("ᛲ꡴殧⫋\uec01꿢滴‘\ue35aꋭ搨❘\ue692려签㫈\ufdc9뼗纱ㇽ\uf315뉗疡㜽\uf64a覊䬥ੳ춏貚丮", View.MeasureSpec.getMode(0) + 48817).intern());
        sb3.append(str);
        sb3.append(m5094("ᚐ쌆북陻䃾㵴ឝ쀕몋靴䆷㨡ᑇ캘뭞闧乷㣼ᔞ쾔렟銵伡", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54666).intern());
        co.m5911(str3, sb3.toString(), null);
        int i12 = f795 + 3;
        f794 = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5103() {
        Map<String, b> mapMo5024 = mo5024();
        this.f800 = mapMo5024;
        mapMo5024.put(m5094("ᛄ껝曝㻜\uf6fe躐䚁ẍ횫湛♷ﹷ뙱万،\ude39阩", View.MeasureSpec.getMode(0) + 47119).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bd.this.m5101((String) bd.m5091(list, String.class));
                return bd.m5093(bd.this);
            }
        });
        this.f800.put(m5096("ਰᰫ骎敇蚁\uf1af앂亟浘踂獒વ罍露䦴즉䕸嬦\ufb0a", (char) (38375 - Color.red(0)), "⅚雡ៃ妏", TextUtils.lastIndexOf("", '0', 0) - 1490347111, "飾⬛\ue7a7▕").intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return Boolean.valueOf(bd.this.m5097());
            }
        });
        this.f800.put(m5096("认혴\uf0b3뾾鿞氜泄後", (char) TextUtils.indexOf("", "", 0), "⅚雡ៃ妏", KeyEvent.getMaxKeyCode() >> 16, "蘕㛑ݶℍ").intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bd.m5095(bd.this, (String) list.get(0));
            }
        });
        int i10 = f794 + 77;
        f795 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Class m5102(String str) {
        f795 = (f794 + 73) % 128;
        Class clsM5092 = m5092(str, true);
        int i10 = f794 + 29;
        f795 = i10 % 128;
        if (i10 % 2 != 0) {
            return clsM5092;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Class m5104(String str) {
        int i10 = f795 + 29;
        f794 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                if (!Prode.m4529()) {
                    Class clsM5092 = m5092(str, false);
                    int i11 = f794 + 17;
                    f795 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 85 / 0;
                    }
                    return clsM5092;
                }
                return mo5026(str);
            }
            Prode.m4529();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Class m5092(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bd.m5092(java.lang.String, boolean):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final void m5106(hg hgVar, ch chVar, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hgVar);
            chVar.mo5832(str, arrayList);
            f795 = (f794 + 111) % 128;
        } catch (Throwable th2) {
            String str2 = this.f798;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m5094("ᛲ꿪撛㵕\uf279譼䇄ڐ\udfef", (Process.myPid() >> 22) + 47407).intern());
            sb2.append(this);
            co.m5911(str2, sb2.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5096(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f791) ^ ((long) f793)) ^ ((long) f792));
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
}
