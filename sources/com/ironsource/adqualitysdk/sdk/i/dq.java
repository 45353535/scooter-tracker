package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.material.TextFieldImplKt;
import com.ironsource.Sd;
import com.ironsource.adqualitysdk.sdk.i.dy;
import com.ironsource.mediationsdk.demandOnly.j;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class dq {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1840 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1841;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1842;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1843;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<ed, ed> f1844;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<fr, fr> f1845;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int f1846 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1847;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1848;

    interface b<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo6368(List<dy> list);
    }

    static {
        m6351();
        f1844 = new HashMap();
        f1845 = new HashMap();
        f1840 = (f1843 + 123) % 128;
    }

    public dq(String str, String str2) {
        this.f1847 = str;
        this.f1848 = str2;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private dy m6324(List<dy> list) {
        int i10 = f1840 + 87;
        f1843 = i10 % 128;
        try {
        } catch (Exception e10) {
            m6359(m6349((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1168, (char) Drawable.resolveOpacity(0, 0), 34 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), e10);
        }
        if (i10 % 2 != 0) {
            m6325(list);
            throw null;
        }
        if (!m6325(list)) {
            m6359(m6349(Color.alpha(0) + 1144, (char) (51780 - (ViewConfiguration.getTapTimeout() >> 16)), Color.rgb(0, 0, 0) + 16777240).intern(), (Throwable) null);
            return null;
        }
        int i11 = this.f1846;
        this.f1846 = i11 + 1;
        dy dyVar = list.get(i11);
        int i12 = f1840 + 17;
        f1843 = i12 % 128;
        if (i12 % 2 == 0) {
            return dyVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    private boolean m6325(List<dy> list) {
        f1840 = (f1843 + 105) % 128;
        if (this.f1846 >= list.size()) {
            return false;
        }
        int i10 = f1843 + 115;
        f1840 = i10 % 128;
        if (i10 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private dy m6326(List<dy> list) {
        f1843 = (f1840 + 75) % 128;
        try {
            if (m6325(list)) {
                f1840 = (f1843 + 73) % 128;
                return list.get(this.f1846);
            }
            f1840 = (f1843 + 11) % 128;
            return null;
        } catch (Exception e10) {
            m6359(m6349((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + Sd.a.f41743c, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8126), ExpandableListView.getPackedPositionType(0L) + 37).intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private Map<String, ed> m6327(List<dy> list) {
        HashMap map = new HashMap();
        Iterator it = m6356(list, m6349(764 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), View.getDefaultSize(0, 0) + 1).intern(), new b<Pair<String, ed>>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ Pair<String, ed> mo6368(List list2) {
                return dq.m6352(dq.this, list2);
            }
        }).iterator();
        int i10 = f1840 + 45;
        while (true) {
            f1843 = i10 % 128;
            if (!it.hasNext()) {
                return map;
            }
            f1843 = (f1840 + 95) % 128;
            Pair pair = (Pair) it.next();
            map.put(pair.first, pair.second);
            i10 = f1840 + 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023d  */
    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6328(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r24) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6328(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private List<ed> m6329(List<dy> list) {
        List<ed> listM6356 = m6356(list, m6349((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 773, (char) (4672 - Drawable.resolveOpacity(0, 0)), 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.4

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f1851 = 5;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f1852 = {'E', 'x', 'p', 'e', 'c', 't', 'd', ' ', 'l', 'a', 's', IOUtils.DIR_SEPARATOR_UNIX, 'v', 'r', 'b', 'u', 'i', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1853 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1854 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m6369(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2153) {
                    try {
                        char[] cArr2 = f1852;
                        char c10 = f1851;
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

            /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r6
  0x0025: PHI (r6v3 com.ironsource.adqualitysdk.sdk.i.ed) = (r6v1 com.ironsource.adqualitysdk.sdk.i.ed), (r6v6 com.ironsource.adqualitysdk.sdk.i.ed) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private com.ironsource.adqualitysdk.sdk.i.ed m6370(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r6) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.f1853
                    int r0 = r0 + 41
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.f1854 = r1
                    int r0 = r0 % 2
                    r1 = 0
                    if (r0 != 0) goto L1b
                    com.ironsource.adqualitysdk.sdk.i.dq r0 = com.ironsource.adqualitysdk.sdk.i.dq.this
                    com.ironsource.adqualitysdk.sdk.i.ed r6 = com.ironsource.adqualitysdk.sdk.i.dq.m6360(r0, r6)
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.dv
                    r2 = 16
                    int r2 = r2 / r1
                    if (r0 == 0) goto L25
                    goto L59
                L1b:
                    com.ironsource.adqualitysdk.sdk.i.dq r0 = com.ironsource.adqualitysdk.sdk.i.dq.this
                    com.ironsource.adqualitysdk.sdk.i.ed r6 = com.ironsource.adqualitysdk.sdk.i.dq.m6360(r0, r6)
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.dv
                    if (r0 != 0) goto L59
                L25:
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.ek
                    if (r0 == 0) goto L2a
                    goto L59
                L2a:
                    com.ironsource.adqualitysdk.sdk.i.dq r0 = com.ironsource.adqualitysdk.sdk.i.dq.this
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r3 = 0
                    int r3 = android.widget.ExpandableListView.getPackedPositionType(r3)
                    int r3 = 32 - r3
                    int r1 = android.view.View.combineMeasuredStates(r1, r1)
                    int r1 = 90 - r1
                    byte r1 = (byte) r1
                    java.lang.String r4 = "\u0001\u0002\u0003\u0004\u0000\t\u0001\b\t\u0002\t\u0005ÍÍ\f\r\b\u000e\t\f\u0014\n\b\f\u0004\u0000\u0001\u0012\r\u0002\u0007\b"
                    java.lang.String r1 = m6369(r4, r3, r1)
                    java.lang.String r1 = r1.intern()
                    r2.append(r1)
                    r2.append(r6)
                    java.lang.String r6 = r2.toString()
                    com.ironsource.adqualitysdk.sdk.i.dq.m6345(r0, r6)
                    r6 = 0
                    return r6
                L59:
                    int r0 = com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.f1854
                    int r0 = r0 + 85
                    int r0 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.f1853 = r0
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.AnonymousClass4.m6370(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ ed mo6368(List list2) {
                int i10 = f1853 + 61;
                f1854 = i10 % 128;
                if (i10 % 2 != 0) {
                    return m6370(list2);
                }
                m6370(list2);
                throw null;
            }
        });
        f1843 = (f1840 + 95) % 128;
        return listM6356;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6330(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r11) {
        /*
            r10 = this;
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r10.m6328(r11)
            int r1 = com.ironsource.adqualitysdk.sdk.i.dq.f1840
            int r1 = r1 + 39
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dq.f1843 = r1
        Lc:
            boolean r1 = r10.m6325(r11)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L97
            com.ironsource.adqualitysdk.sdk.i.dy r1 = r10.m6324(r11)
            java.lang.String r1 = r1.m6415()
            int r3 = r1.hashCode()
            r4 = 46
            r5 = 0
            if (r3 == r4) goto L4d
            r4 = 91
            if (r3 == r4) goto L2a
            goto L80
        L2a:
            int r3 = android.view.ViewConfiguration.getEdgeSlop()
            int r3 = r3 >> 16
            int r3 = r3 + 789
            int r4 = android.graphics.Color.alpha(r5)
            char r4 = (char) r4
            int r5 = android.graphics.drawable.Drawable.resolveOpacity(r5, r5)
            int r5 = 1 - r5
            java.lang.String r3 = m6349(r3, r4, r5)
            java.lang.String r3 = r3.intern()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L80
            r5 = r2
            goto L81
        L4d:
            java.lang.String r3 = ""
            int r4 = android.text.TextUtils.getCapsMode(r3, r5, r5)
            int r4 = r4 + 788
            r6 = 48
            int r3 = android.text.TextUtils.lastIndexOf(r3, r6)
            r6 = 48721(0xbe51, float:6.8273E-41)
            int r6 = r6 - r3
            char r3 = (char) r6
            long r6 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            java.lang.String r3 = m6349(r4, r3, r6)
            java.lang.String r3 = r3.intern()
            boolean r1 = r1.equals(r3)
            r1 = r1 ^ r2
            if (r1 == r2) goto L80
            int r1 = com.ironsource.adqualitysdk.sdk.i.dq.f1840
            int r1 = r1 + 25
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dq.f1843 = r1
            goto L81
        L80:
            r5 = -1
        L81:
            if (r5 == 0) goto L91
            if (r5 == r2) goto L8b
            int r11 = r10.f1846
            int r11 = r11 - r2
            r10.f1846 = r11
            return r0
        L8b:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r10.m6347(r0, r11)
            goto Lc
        L91:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r10.m6354(r0, r11)
            goto Lc
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6330(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private Pair<String, ed> m6331(List<dy> list) {
        f1840 = (f1843 + 39) % 128;
        dy dyVarM6324 = m6324(list);
        if (!dyVarM6324.m6417()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6349(1047 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (MotionEvent.axisFromString("") + 54412), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            sb2.append(dyVarM6324);
            m6359(sb2.toString(), (Throwable) null);
            f1843 = (f1840 + 95) % 128;
        }
        String strM6415 = dyVarM6324.m6415();
        m6346(list, m6349((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + j.a.f43957j, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.red(0) + 1).intern(), strM6415, m6349(1072 - KeyEvent.keyCodeFromString(""), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 48 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        return new Pair<>(strM6415, m6367(list));
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private fk m6332(List<dy> list) {
        ArrayList arrayList = new ArrayList();
        dy dyVarM6326 = m6326(list);
        f1840 = (f1843 + 1) % 128;
        while (!dyVarM6326.m6418(m6349(MotionEvent.axisFromString("") + 765, (char) TextUtils.getOffsetBefore("", 0), 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
            f1843 = (f1840 + 81) % 128;
            arrayList.add(m6362(list));
            dyVarM6326 = m6326(list);
        }
        this.f1846++;
        return (fk) m6355(new fk(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6333(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r19) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6333(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private fr m6334(List<dy> list) {
        m6365(list, m6349((ViewConfiguration.getFadingEdgeLength() >> 16) + 43, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -MotionEvent.axisFromString("")).intern(), m6349(726 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 39 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        fr frVarM6355 = m6355(new fn());
        int i10 = f1843 + 81;
        f1840 = i10 % 128;
        if (i10 % 2 != 0) {
            return frVarM6355;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[PHI: r1 r9
  0x005e: PHI (r1v10 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v6 com.ironsource.adqualitysdk.sdk.i.dm), (r1v12 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:14:0x005a, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:14:0x005a, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[PHI: r1 r9
  0x008e: PHI (r1v8 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v6 com.ironsource.adqualitysdk.sdk.i.dm), (r1v12 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:13:0x0058, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:13:0x0058, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[PHI: r1 r9
  0x00ae: PHI (r1v7 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v6 com.ironsource.adqualitysdk.sdk.i.dm), (r1v12 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:12:0x0056, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:12:0x0056, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6335(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r13) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6335(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6336(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r15) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6336(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private fr m6337(List<dy> list) {
        m6365(list, m6349(Color.argb(0, 0, 0, 0), (char) (14612 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m6349(399 - ImageFormat.getBitsPerPixel(0), (char) (42102 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        fk fkVarM6332 = m6332(list);
        m6365(list, m6349(444 - (Process.myPid() >> 22), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4).intern(), m6349((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 449, (char) (59340 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 53 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        m6365(list, m6349((ViewConfiguration.getFadingEdgeLength() >> 16) + 110, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m6349(502 - View.MeasureSpec.getSize(0), (char) KeyEvent.keyCodeFromString(""), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        dy dyVarM6324 = m6324(list);
        m6357(dyVarM6324, dy.d.f1934, fkVarM6332, m6349((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 543, (char) Color.alpha(0), 27 - Color.alpha(0)).intern());
        ek ekVar = (ek) m6342(new ek(dyVarM6324.m6415(), dm.m6298(this.f1848, dyVarM6324.m6416())));
        m6365(list, m6349((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 151, (char) KeyEvent.keyCodeFromString(""), 1 - Color.alpha(0)).intern(), m6349(570 - KeyEvent.keyCodeFromString(""), (char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollBarSize() >> 8) + 39).intern());
        m6365(list, m6349(ExpandableListView.getPackedPositionType(0L), (char) (14612 - (Process.myPid() >> 22)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m6349(610 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (25235 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 46 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        fr frVarM6355 = m6355(new fw(fkVarM6332, m6332(list), ekVar));
        int i10 = f1843 + 73;
        f1840 = i10 % 128;
        if (i10 % 2 != 0) {
            return frVarM6355;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private fr m6338(List<dy> list) {
        fr frVarM6355 = m6355(new fu(m6356(list, m6349(43 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Process.myPid() >> 22), KeyEvent.keyCodeFromString("") + 1).intern(), new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f1856 = {'E', 'x', 'p', 'e', 'c', 't', 'd', ' ', 'v', 'a', 'r', 'i', 'b', 'l', 'u', 'F'};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1857 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f1858 = 4;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1859;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m6371(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2153) {
                    try {
                        char[] cArr2 = f1856;
                        char c10 = f1858;
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

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private ed m6372(List<dy> list2) {
                f1859 = (f1857 + 43) % 128;
                ed edVarM6367 = dq.this.m6367(list2);
                if (edVarM6367 instanceof ek) {
                    return edVarM6367;
                }
                int i10 = f1857 + 17;
                f1859 = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z10 = edVarM6367 instanceof dw;
                    throw null;
                }
                if (edVarM6367 instanceof dw) {
                    return edVarM6367;
                }
                dq dqVar = dq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6371("\u0001\u0002\u0003\u0000\u0005\u0006\u0002\u0007\u0004\u000b\n\u000b\b\n\r\u000e\u0007\u000b\r\u000f\u0006\u0004\u000b\u0002\u0007\u0000\b\t\u0002\u0007r", 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 82)).intern());
                sb2.append(edVarM6367);
                dq.m6345(dqVar, sb2.toString());
                return null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ ed mo6368(List list2) {
                f1859 = (f1857 + 19) % 128;
                ed edVarM6372 = m6372(list2);
                int i10 = f1857 + 107;
                f1859 = i10 % 128;
                if (i10 % 2 == 0) {
                    return edVarM6372;
                }
                throw null;
            }
        })));
        int i10 = f1840 + 103;
        f1843 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 83 / 0;
        }
        return frVarM6355;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private fr m6339(List<dy> list) {
        m6365(list, m6349((-16777106) - Color.rgb(0, 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 1).intern(), m6349(TextUtils.indexOf((CharSequence) "", '0', 0) + 311, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 43 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
        ed edVarM6367 = m6367(list);
        m6365(list, m6349((ViewConfiguration.getScrollDefaultDelay() >> 16) + 151, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getOffsetAfter("", 0) + 1).intern(), m6349((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 352, (char) (4015 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 47).intern());
        fr frVarM6355 = m6355(new fv(edVarM6367, m6362(list)));
        f1840 = (f1843 + 63) % 128;
        return frVarM6355;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private fr m6340(List<dy> list) {
        m6365(list, m6349((KeyEvent.getMaxKeyCode() >> 16) + 43, (char) (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 1).intern(), m6349(691 - View.resolveSize(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53895), (ViewConfiguration.getPressedStateDuration() >> 16) + 35).intern());
        fr frVarM6355 = m6355(new fl());
        f1843 = (f1840 + 121) % 128;
        return frVarM6355;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private fr m6341(List<dy> list) {
        fr frVarM6355;
        f1840 = (f1843 + 1) % 128;
        if (m6326(list).m6418(m6349(43 - Color.red(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
            frVarM6355 = m6355(new fo(null));
        } else {
            frVarM6355 = m6355(new fo(m6367(list)));
            f1840 = (f1843 + 57) % 128;
        }
        m6346(list, m6349(TextUtils.getOffsetAfter("", 0) + 43, (char) Color.argb(0, 0, 0, 0), 1 - Color.argb(0, 0, 0, 0)).intern(), frVarM6355, m6349(655 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", ""), 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
        return frVarM6355;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6345(dq dqVar, String str) {
        f1840 = (f1843 + 81) % 128;
        dqVar.m6358(str);
        int i10 = f1840 + 103;
        f1843 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static void m6351() {
        char[] cArr = new char[1307];
        ByteBuffer.wrap("9o\u0000mûÀ÷>ò\u0087îûê]åþááÝGØ©Ô\u000bÐ7ËÏÇ\tÃi¾Þº<µ\u0091±º\u00ad]¨\u0081¤© O\u009bó\u0097\u001b\u0093r\u008e¯\u008a\u0017\u0086c\u0081Ä}8x\u009ft\u0080p6k\u009egîc@^¼Z\u0013VFQ¦M\u0019\u0000;\rÒöx\u0018Hãäï\u0016\u0000wûÍ÷#ò\u0083îñ\u0000rûÀ÷>ò\u009aîæêW\u0000bû×÷/ò\u008eîÿ\u0000cûÊ÷$ò\u009bîýêWå«áæ\u0000tû×÷3\u0004aÿÓó/ÈÙ3x?\u008d:(&I\"ã-\r)\u0017\u0015»\u0010B\u001cá\u0018\u0083\u0003i\u000f¡\u000b\u0092vzr\u008a}%y\u000eeä`6l\u001dhéS\u0013_\u00ad[ÝF\u0013B¾NÝIkµ\u0096\u0000(m\u0015\u0096¿\u009a\u0016\u009fà\u0083\u009c\u0087$\u0088Ö\u008c\u009a°9µÔ¹`½\u001f¦àªn®\u0012Ó¸×YØåÜ\u0082ÀcÅúÉ\u0090ÍröÉúkþ\rãÒçtë\u0007ì¨\u0010N\u0015§\u0019¾\u001d@\u0006¶\n\u0092\u000eh3\u00827*;x\u0000)\u0000iûÃ÷jò\u009cîàêXåªáæÝEØ¨Ô\u001cÐcË\u009cÇ\u0002Ãi¾Åº4µ\u009c±î\u00adV¨\u008b¤ç \u000e\u009b \u0097\u0010\u0093r\u008e·\u008a\u000b\u0086h\u0081\u0091}4x\u009et\u0080p,k\u0084güc]^½Z\u001bV\u0003QïMEI;D\u0090\u0000eûÉ÷9ò\u008a\u0000fûÊ÷8òÏîçêMå¿á÷ÝMØ Ô\u0017ÐyËÈÇAÃu¾Ãº?µ\u0080±ö\u00ad[¨Ä¤ë K\u009bó\u0097\u001e\u0093r\u008e®\u008a\u000b\u0086c\u0081Æ}3x\u009ft\u0080p'k\u0093g¯cU^ùZYV\u000bQïý\u0005\u0006©\n[\u000f¬\u0013\u0094\u00175\u0018Ó\u001c\u0084 \"%Ú)x-\u001b6±:\">\u0016C G\\HãL\u0095P8U§Y\u008f]#fÔj;n\tsÈwp{\u0007|ò\u0080\u0012\u0085£\u0089ä\u000eÃõyù\u0092ü*àWäûë\u0013ïCÓ¤Ö\u0004Ú¦ÞËÅbÉ¨ÍÙ°t´\u0095»6¿X£³¦;ªM®í\u0095\n\u0099¸\u009dÕ\u0080N\u0084®\u0088Î\u008fysÚv ze~\u009de.i\u0003\u0000wûÍ÷#ò\u0083îñê\u0019å\u00adá÷ÝIØ¹Ô\u0017ÐzËÙÇ\u000fÃr¾\u008bº#µ\u009d±õ\u00adJ¨\u0088¤í \u000e\u009b±\u0097\u001d\u0093=\u008e¤\u008a\b\u0086`\u0081Ý}9x\u008ctÅp!kÊgícM^ùZ\u001fV\u0003QïMEI5\u000fØôbø\u008cý,á^å¶ê\u0002îXÒæ×\u0016Û¸ßÕÄvÈ ÌÝ±$µ\u009cº5¾[¢ô§\"«R¯è\u0094\u0013\u0098¹\u009c\u0092\u0081\u001e\u0085 \u0089Ì\u008ekr\u0095w0{/\u007f\u0088d h\u0000lòQ\u0018U¢Yå^\u0003B§F\u009dK?OÛ3\u00878.¤\u0002_¡SEV¹J\u0091N;AÉE\u0081y;|Öpat\u000fo¾c7g\u001d\u001a¨\u001eU\u0011÷\u0015Ì\t+\f÷\u0000ß\u0004;?Ê3c7\u001b*Û.d\"\u0014%£Ù\u0000Ü¥Ð¿Ô]ÏïÃ\u0090Ç&úÊþ(òrõÅéfíCàè\u0000cûÄ÷>ò\u008cîüç¿\u001c\u001c\u0010ø\u0015\u0004\t,\r\u0086\u0002t\u0006<:\u0086?k3Ü7²,\u0003 \u008a$¾Y\b]ôRKV=J\u0090O\u000fC G\u0080|8pÕt¹iemÀa¨f\r\u009aø\u009fT\u0093K\u0097ì\u008cX\u0080d\u0084\u009e¹2½Ö±\u0089¶wªÅ®±£\\§äÛ¾Ð\fÔôÉ^Í3Á\u0094Æzú;\u0000cûÄ÷>ò\u008cîüê\u0019åµáæÝQØºÔ\u001dÐeËØÇAÃu¾Ãº?µ\u0080±ö\u00ad[¨Ä¤ë K\u009bó\u0097\u001e\u0093r\u008e®\u008a\u000b\u0086c\u0081Æ}3x\u009ft\u0080p'k\u0093g¯cU^ùZYV\u000bQï\u0000mûÌ÷9ò\u009cîýêWå¹á£ÝKØ¬Ô\u0006ÐtËÔÇAÃp¾Êº\"µ\u009c±û\u00ad]¨\u0088¤ì \u000e\u009b½\u0097\u0019\u0093p\u008e§\u0000cûÄ÷>ò\u008cîüê\u0019å®áâÝZØ¬Ô\u001fÐ7ËÏÇ\tÃi¾Þº<µ\u0091±º\u00ad]¨\u0081¤© H\u009b¼\u0097\u0014\u0093q\u008e\u00ad\u008a\u0010\u0086i\u0081Õ}vx\u0099tÙpek\u008bg¯c\u0013^ðZYbð\u0099W\u0095\u00ad\u0090\u001f\u008co\u0088\u008a\u0087>\u0083d¿Úº*¶\u0084²é©J¥\u009c¡áÜ\u0018Ø®×\u0013ÓzÏØÊWÆxÂØù`õ\u0088ñáì<è\u0084äðãW\u001f«\u001a\f\u0016\u0013\u0012þ\t\u0010\u0005r\u0001Ô<#8\u00894Õ3{/Ù+ú&Y\"è^»\u0000rûÀ÷>ò\u009aîæêWåþáðÝ\\Ø¬Ô\u0006ÐrËÑÇ\u0004Ãh¾ßºpµ\u0086±ò\u00adP¨\u0091¤å J\u009bó\u0097\u001d\u0093s\u008e¦\u008aG\u0086{\u0081Ø}\"x\u0093t\u0080pbkÑg¨Òê)_%§ \u0006<w8\u00917%3\u007f\u000fÁ\n1\u0006\u009f\u0002ò\u0019Q\u0015\u0087\u0011úl\u0003h«g\u0015c}\u007fÂz\u0000ver\u0086I>E\u009eAñ\\jX\u0098TíSM¯¶ªS¦\u000f¢ö¹E\u0000cûÊ÷$ò\u009bîýêWå«áæÝ\bØ¾Ô\u0006ÐvËÈÇ\u0004Ãk¾Îº>µ\u0081±º\u00adL¨\u008c¤æ [\u009b¿\u0097\u001c\u0093=\u008e§\u008a\t\u0086h\u0081\u0091}!x\u0092tÔp-kÊg¨c\u000f^þ\u0000}\u0082>y\u009b\u0000|ûÙ\u0000=û\u0098\u00053þ\u008au:\u0012~\u0000<û\u0098\u0000>û\u0098\u009e\u008bG\u0087 \u009b[>\u0000-û\u0088\u0000*CÄ\u0000%¾|\u0000[\u0000=\u0007&\u0000mûÌ÷9ò\u009cîýêWå¹á£ÝKØ¡Ô\u001dÐdËÕÇ\u000fÃa¾\u008bºwµÜ±½\u0000]ò\u0096\t\b\u0005ì\u0000T\u001c'\u0018\u009f\u0017~\u00134/\u008e*j&\u0091\"»9\u000f5Ç1·L\tHçGYC+_Ü\u001egåùé\u001dì¥ðÖônû\u008fÿÅÃ\u007fÆ\u009bÊ`ÎQÕáÙ8ÝQ ÷¤B\u0000CûÄ÷?ò\u0088îüêMåþáæÝPØ®Ô\u0017ÐgËÈÇ\bÃi¾Åûk\u0000ó\f\u0014\t¤\u0015Ù\u0011c\u001e\u0095\u001aÉ&&#\u008a/8+\\0ü<;8AEãA\u0017N¾JÆV1S¨_Ò[t`Ýl1h\\u\u0098qi\u0000rûÀ÷,ò\u0083îñêZåªáêÝGØ£ÔRÐtËÐÇ\u0000Ãu¾Øºpµ\u009b±û\u00adR¨\u0081¤ú \u000e\u009b \u0097\u0010\u0093r\u008e·\u008a\u000b\u0086h\u0081\u0091}4x\u009et\u0080p#k\u0085gãcX^¶Z\tVFQ¬MMIpDÎ@|<h7È3=.\u009f*ö&[!«\u001dí\u0019F\u0014 \u0010S\f?\u0007\u0095\u0003Lÿ)ú\u0082öxñÑ\u0097Ëlh`\u0090e$yO}ór\u000fvKJäOUC¹GÇ\\kP¬TÒ)w-È\"/&G:§??3]7ù\f\u0018\u0000¥\u0004Á\u0019Z\u001d¨\u0011Ý\u0016}ê\u0086ïcã?ç üu\u0000nûÐ÷&ò\u0083\u0000sûÐ÷:ò\u008aîæeÝ\u009e~\u0092\u0094\u0097$\u008bH\u008f·\u0080\u0003\u0084E¸é½\u0016±°µÝ®2¢\u00ad¦ÍÛ%ß\u0098Ð4ÔXÈýÍ%ÁPÅåþ\u0019òööÑë\u0015ïéãÃä?\u0018\u0095\u001d0\u0011z\u0015\u0083\u000e+\u0002E\u0006º;\u001e?¾3û4\t( ,Ý!m%\u009bYÀRfÔÎ/V#±&\u0001:|>Æ105l\t\u0083\f\u0015\u0000\u008d\u0004î\u001f^\u0013\u0084\u0017êj\u0000n¹a\u000beey\u0094|\bpmtÑOx\u0000:\u0000jûÖ÷%ò\u0081î´êRå»áúÝ\bØ¾Ô\u001aÐxËÉÇ\rÃb¾\u008bº2µ\u0090±º\u00adY¨\u008b¤å B\u009b¼\u0097\u000f\u0093x\u008e¦\u008aG\u0086n\u0081È}vx\u009at\u0080p3k\u008bgãcA^¼Z^VBQ®M\u0019IwDÅ@|<&7\u009c3l\u0000,\u0000lûÌ÷9ò\u009bî´êJå¶áìÝ]Ø¡Ô\u0016Ð7ËÙÇ\u000fÃb¾\u008bº'µ\u009c±î\u00adW¨Ä¤®\u0003ÄÊ\u00111\u008f=k8Ó$  \u0018/ù+³\u0017\t\u0012í\u001e\u0016\u001a6\u0001\u0096\rA\tbt\u0080pr\u007f\u0091{ªg\u0014bËn¨j\u0004Qä\u0000EûÝ÷)ò\u008aîäêMå·áìÝFØíÔ\u0005Ð\u007fËÕÇ\rÃc¾\u008bº7µ\u0090±î\u00adK¨\u008d¤ç I\u009bó\u0097\u0016\u0093x\u008eº\u008a\u0013\u0086,\u0081Å}9x\u0090tÅp+\u001fúäbè\u0096í5ñ[õòú\bþSÂùÇRËºÏÀÔjØ²ÜÜ¡4¥\u009fª/®@²ë·2»X¿ö\u0084L\u0088¦\u008cÖ\u0091]\u0095¶\u0099Ö\u009evb\u009dgdkko\u0095t>xU|åÂF9¢5J0ý,\u0097(-'\u0098\u0000EûÝ÷:ò\u008aî÷êMå»áçÝ\b\u0000 ûÇ÷?ò\u009bî´êKå»áàÝMØ¤Ô\u0004ÐrËØÇAÔR/ú#\u0018\u0000PûÄ÷8ò\u009cîñêKåñ\u0000PûÄ÷8ò\u009cîýêWå¹á£ÝNØ¬Ô\u001bÐ{ËÙÇ\u0005Ã&¾Ïº%µ\u0090±º\u00adK¨\u008b¤© K\u009b¡\u0097\n\u0093r\u008e°\u008a\u0014".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1307);
        f1841 = cArr;
        f1842 = -5462852528441525339L;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Pair m6352(dq dqVar, List list) {
        int i10 = f1843 + 115;
        f1840 = i10 % 128;
        int i11 = i10 % 2;
        Pair<String, ed> pairM6331 = dqVar.m6331(list);
        if (i11 == 0) {
            int i12 = 78 / 0;
        }
        return pairM6331;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ ed m6360(dq dqVar, List list) {
        f1840 = (f1843 + 81) % 128;
        ed edVarM6328 = dqVar.m6328(list);
        f1843 = (f1840 + 47) % 128;
        return edVarM6328;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.i.ed m6367(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r12) {
        /*
            r11 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dq.f1840
            int r0 = r0 + 13
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dq.f1843 = r0
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r11.m6333(r12)
            boolean r1 = r11.m6325(r12)
            if (r1 == 0) goto Lc3
            java.lang.String r1 = r11.f1848
            int r2 = r0.m6433()
            com.ironsource.adqualitysdk.sdk.i.dm r1 = com.ironsource.adqualitysdk.sdk.i.dm.m6298(r1, r2)
            com.ironsource.adqualitysdk.sdk.i.dy r2 = r11.m6324(r12)
            java.lang.String r2 = r2.m6415()
            int r3 = r2.hashCode()
            r4 = 1216(0x4c0, float:1.704E-42)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L6a
            r4 = 3968(0xf80, float:5.56E-42)
            if (r3 == r4) goto L33
            goto L94
        L33:
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            int r3 = 768 - r3
            int r4 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r4 = r4 >> 16
            char r4 = (char) r4
            int r7 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r7 = r7 >> 16
            int r7 = r7 + 2
            java.lang.String r3 = m6349(r3, r4, r7)
            java.lang.String r3 = r3.intern()
            boolean r2 = r2.equals(r3)
            r2 = r2 ^ r6
            if (r2 == r6) goto L94
            int r2 = com.ironsource.adqualitysdk.sdk.i.dq.f1843
            int r2 = r2 + 25
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.dq.f1840 = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L68
            goto L95
        L68:
            r5 = r6
            goto L95
        L6a:
            int r3 = android.graphics.Color.alpha(r5)
            int r3 = 765 - r3
            int r4 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r4 = r4 >> 8
            r7 = 33304(0x8218, float:4.6669E-41)
            int r7 = r7 - r4
            char r4 = (char) r7
            long r7 = android.os.SystemClock.currentThreadTimeMillis()
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            int r7 = 3 - r7
            java.lang.String r3 = m6349(r3, r4, r7)
            java.lang.String r3 = r3.intern()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L94
            goto L95
        L94:
            r5 = -1
        L95:
            if (r5 == 0) goto Lad
            if (r5 == r6) goto L9f
            int r12 = r11.f1846
            int r12 = r12 - r6
            r11.f1846 = r12
            return r0
        L9f:
            com.ironsource.adqualitysdk.sdk.i.fa r2 = new com.ironsource.adqualitysdk.sdk.i.fa
            com.ironsource.adqualitysdk.sdk.i.ed r12 = r11.m6367(r12)
            r2.<init>(r0, r12, r1)
            com.ironsource.adqualitysdk.sdk.i.ed r12 = m6342(r2)
            return r12
        Lad:
            com.ironsource.adqualitysdk.sdk.i.em r2 = new com.ironsource.adqualitysdk.sdk.i.em
            com.ironsource.adqualitysdk.sdk.i.ed r12 = r11.m6367(r12)
            r2.<init>(r0, r12, r1)
            com.ironsource.adqualitysdk.sdk.i.ed r12 = m6342(r2)
            int r0 = com.ironsource.adqualitysdk.sdk.i.dq.f1843
            int r0 = r0 + 39
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dq.f1840 = r0
            return r12
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6367(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ed m6342(ed edVar) {
        f1843 = (f1840 + 117) % 128;
        ed edVar2 = f1844.get(edVar);
        if (edVar2 != null) {
            return edVar2;
        }
        int i10 = f1843 + 11;
        f1840 = i10 % 128;
        if (i10 % 2 != 0) {
            f1844.put(edVar, edVar);
            return edVar;
        }
        f1844.put(edVar, edVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fr m6348(List<dy> list) {
        fr frVarM6362;
        f1843 = (f1840 + 9) % 128;
        m6365(list, m6349(110 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Process.myPid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern(), m6349(View.MeasureSpec.makeMeasureSpec(0, 0) + 111, (char) (28028 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40).intern());
        ed edVarM6367 = m6367(list);
        m6346(list, m6349(152 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), edVarM6367, m6349((ViewConfiguration.getWindowTouchSlop() >> 8) + 152, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 43 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        fr frVarM63622 = m6362(list);
        if (!m6325(list) || (!m6326(list).m6418(m6349(TextUtils.indexOf("", "") + 196, (char) TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 4).intern()))) {
            frVarM6362 = null;
        } else {
            f1843 = (f1840 + 25) % 128;
            this.f1846++;
            frVarM6362 = m6362(list);
            f1843 = (f1840 + 51) % 128;
        }
        return m6355(new fq(edVarM6367, frVarM63622, frVarM6362));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static fr m6355(fr frVar) {
        f1843 = (f1840 + 17) % 128;
        fr frVar2 = f1845.get(frVar);
        if (frVar2 != null) {
            return frVar2;
        }
        int i10 = f1843 + 7;
        f1840 = i10 % 128;
        if (i10 % 2 != 0) {
            f1845.put(frVar, frVar);
            return frVar;
        }
        f1845.put(frVar, frVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fr m6362(List<dy> list) {
        byte b10;
        int i10 = f1843 + 101;
        f1840 = i10 % 128;
        if (i10 % 2 == 0) {
            m6324(list).m6415().hashCode();
            throw null;
        }
        String strM6415 = m6324(list).m6415();
        byte b11 = -1;
        switch (strM6415.hashCode()) {
            case -934396624:
                if (strM6415.equals(m6349(55 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), View.getDefaultSize(0, 0) + 6).intern())) {
                    b11 = 4;
                }
                break;
            case -567202649:
                if (strM6415.equals(m6349(66 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 8 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b11 = 6;
                }
                break;
            case 59:
                if (strM6415.equals(m6349((KeyEvent.getMaxKeyCode() >> 16) + 43, (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern())) {
                    int i11 = f1840 + 101;
                    f1843 = i11 % 128;
                    b10 = i11 % 2 != 0 ? (byte) 1 : (byte) 0;
                    b11 = b10;
                }
                break;
            case 123:
                if (strM6415.equals(m6349(AndroidCharacter.getMirror('0') - '0', (char) (TextUtils.indexOf("", "", 0) + 14612), ExpandableListView.getPackedPositionType(0L) + 1).intern())) {
                    b11 = 7;
                }
                break;
            case 3357:
                if (strM6415.equals(m6349((Process.myTid() >> 22) + 44, (char) (3514 - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2).intern())) {
                    f1840 = (f1843 + 7) % 128;
                    b11 = 1;
                }
                break;
            case 101577:
                if (strM6415.equals(m6349(46 - TextUtils.getOffsetBefore("", 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6190), MotionEvent.axisFromString("") + 4).intern())) {
                    f1840 = (f1843 + 97) % 128;
                    b11 = 2;
                }
                break;
            case 115131:
                if (strM6415.equals(m6349(((byte) KeyEvent.getModifierMetaStateMask()) + 74, (char) View.resolveSize(0, 0), 3 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    b11 = 8;
                }
                break;
            case 116519:
                if (strM6415.equals(m6349(75 - ExpandableListView.getPackedPositionChild(0L), (char) (1047 - ExpandableListView.getPackedPositionType(0L)), 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    f1840 = (f1843 + 123) % 128;
                    b10 = 9;
                    b11 = b10;
                }
                break;
            case 94001407:
                if (strM6415.equals(m6349((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 60, (char) Color.argb(0, 0, 0, 0), TextUtils.getTrimmedLength("") + 5).intern())) {
                    b11 = 5;
                }
                break;
            case 113101617:
                if (strM6415.equals(m6349(MotionEvent.axisFromString("") + 50, (char) (ViewConfiguration.getTouchSlop() >> 8), 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    f1843 = (f1840 + 69) % 128;
                    b11 = 3;
                }
                break;
        }
        switch (b11) {
            case 0:
                return m6355(new fp(null));
            case 1:
                return m6348(list);
            case 2:
                return m6344(list);
            case 3:
                fr frVarM6339 = m6339(list);
                f1840 = (f1843 + 81) % 128;
                return frVarM6339;
            case 4:
                return m6341(list);
            case 5:
                return m6340(list);
            case 6:
                return m6334(list);
            case 7:
                return m6332(list);
            case 8:
                return m6337(list);
            case 9:
                return m6338(list);
            default:
                this.f1846--;
                ed edVarM6367 = m6367(list);
                m6346(list, m6349((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern(), edVarM6367, m6349(79 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (51380 - Color.argb(0, 0, 0, 0)), 31 - Drawable.resolveOpacity(0, 0)).intern());
                return m6355(new fp(edVarM6367));
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private fr m6344(List<dy> list) {
        m6365(list, m6349(110 - TextUtils.getCapsMode("", 0, 0), (char) TextUtils.getOffsetAfter("", 0), -ExpandableListView.getPackedPositionChild(0L)).intern(), m6349(MotionEvent.axisFromString("") + 201, (char) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 42).intern());
        ed edVarM6343 = m6343(list, m6349((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0) + 1).intern());
        ed edVarM6367 = m6367(list);
        m6346(list, m6349(43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 1 - View.combineMeasuredStates(0, 0)).intern(), edVarM6367, m6349(241 - Color.alpha(0), (char) (TextUtils.indexOf("", "", 0) + 64867), 33 - KeyEvent.normalizeMetaState(0)).intern());
        fr frVarM6355 = m6355(new fs(edVarM6343, edVarM6367, m6343(list, m6349((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + TextFieldImplKt.AnimationDuration, (char) TextUtils.indexOf("", "", 0, 0), 1 - Color.red(0)).intern()), m6362(list)));
        int i10 = f1840 + 25;
        f1843 = i10 % 128;
        if (i10 % 2 == 0) {
            return frVarM6355;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final fk m6366(List<dy> list) {
        f1843 = (f1840 + 55) % 128;
        this.f1846 = 0;
        m6365(list, m6349((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (14611 - TextUtils.indexOf((CharSequence) "", '0', 0)), -ImageFormat.getBitsPerPixel(0)).intern(), m6349(1 - KeyEvent.getDeadChar(0, 0), (char) View.combineMeasuredStates(0, 0), 42 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        fk fkVarM6332 = m6332(list);
        int i10 = f1840 + 75;
        f1843 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 43 / 0;
        }
        return fkVarM6332;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m6353(dy dyVar) {
        dm dmVarM6298 = dm.m6298(this.f1848, dyVar.m6416());
        if (dyVar.m6412()) {
            try {
                try {
                    return m6342(new fg(Integer.valueOf(Integer.parseInt(dyVar.m6415())), dmVarM6298));
                } catch (Exception unused) {
                    return m6342(new fe(Long.valueOf(Long.parseLong(dyVar.m6415())), dmVarM6298));
                }
            } catch (Exception unused2) {
            }
        } else {
            if (dyVar.m6410()) {
                ed edVarM6342 = m6342(new fh(Double.valueOf(Double.parseDouble(dyVar.m6415())), dmVarM6298));
                f1843 = (f1840 + 71) % 128;
                return edVarM6342;
            }
            if (dyVar.m6408()) {
                ed edVarM63422 = m6342(new ff(Boolean.valueOf(Boolean.parseBoolean(dyVar.m6415())), dmVarM6298));
                int i10 = f1843 + 3;
                f1840 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 70 / 0;
                }
                return edVarM63422;
            }
        }
        return m6342(new fm(dyVar.m6415(), dmVarM6298));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed m6343(List<dy> list, String str) {
        ed edVarM6367;
        if (m6326(list).m6418(str)) {
            edVarM6367 = null;
        } else {
            edVarM6367 = m6367(list);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6349((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 274, (char) (Drawable.resolveOpacity(0, 0) + 3756), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36).intern());
            sb2.append(str);
            m6346(list, str, edVarM6367, sb2.toString());
            f1840 = (f1843 + 53) % 128;
        }
        int i10 = f1840 + 85;
        f1843 = i10 % 128;
        if (i10 % 2 == 0) {
            return edVarM6367;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed m6347(ed edVar, List<dy> list) {
        f1843 = (f1840 + 43) % 128;
        ed edVarM6367 = m6367(list);
        m6346(list, m6349(811 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.rgb(0, 0, 0) + 16777217).intern(), edVarM6367, m6349(956 - ExpandableListView.getPackedPositionType(0L), (char) (38840 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 35).intern());
        dy dyVarM6324 = m6324(list);
        dm dmVarM6298 = dm.m6298(this.f1848, dyVarM6324.m6416());
        if (dyVarM6324.m6418(m6349((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 790, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern())) {
            ed edVarM6342 = m6342(new ej(edVar, edVarM6367, m6367(list), dmVarM6298));
            int i10 = f1840 + 119;
            f1843 = i10 % 128;
            if (i10 % 2 == 0) {
                return edVarM6342;
            }
            throw null;
        }
        this.f1846--;
        return m6342(new ei(edVar, edVarM6367, dmVarM6298));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6346(List<dy> list, String str, Object obj, String str2) {
        int i10 = f1843 + 5;
        f1840 = i10 % 128;
        if (i10 % 2 == 0) {
            m6364(m6324(list), str, obj, str2);
            int i11 = 84 / 0;
        } else {
            m6364(m6324(list), str, obj, str2);
        }
        f1840 = (f1843 + 47) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m6354(ed edVar, List<dy> list) {
        int i10 = f1843 + 75;
        f1840 = i10 % 128;
        List<ed> listM6329 = null;
        if (i10 % 2 != 0) {
            dy dyVarM6324 = m6324(list);
            if (!dyVarM6324.m6407()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6349(865 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (64301 - MotionEvent.axisFromString("")), TextUtils.getCapsMode("", 0, 0) + 28).intern());
                sb2.append(dyVarM6324);
                m6359(sb2.toString(), (Throwable) null);
                f1843 = (f1840 + 49) % 128;
            }
            String strM6415 = dyVarM6324.m6415();
            dy dyVarM63242 = m6324(list);
            if (dyVarM63242.m6418(m6349(772 - ImageFormat.getBitsPerPixel(0), (char) (29958 - Color.argb(0, 0, 0, 0)), 1 - KeyEvent.keyCodeFromString("")).intern())) {
                listM6329 = m6329(list);
                m6346(list, m6349(Color.rgb(0, 0, 0) + 16777326, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), listM6329, m6349(892 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62).intern());
            } else if (!dyVarM63242.m6418(m6349(Color.green(0) + 110, (char) Color.argb(0, 0, 0, 0), TextUtils.getOffsetBefore("", 0) + 1).intern())) {
                this.f1846--;
                return m6342(new ec(edVar, strM6415, dm.m6298(strM6415, dyVarM63242.m6416())));
            }
            return m6342(new ee(edVar, strM6415, listM6329, m6350(list, m6349(View.getDefaultSize(0, 0) + 151, (char) (Color.rgb(0, 0, 0) + 16777216), -((byte) KeyEvent.getModifierMetaStateMask())).intern()), dm.m6298(strM6415, dyVarM63242.m6416())));
        }
        m6324(list).m6407();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<ed> m6350(List<dy> list, String str) {
        List<ed> listM6356 = m6356(list, str, new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* synthetic */ ed mo6368(List list2) {
                return dq.this.m6367(list2);
            }
        });
        int i10 = f1843 + 45;
        f1840 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM6356;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6349(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1841[i10 + i12]) ^ (((long) i12) * f1842)) ^ ((long) c10));
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m6361(com.ironsource.adqualitysdk.sdk.i.dy r9, java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r10) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m6361(com.ironsource.adqualitysdk.sdk.i.dy, java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> List<T> m6356(List<dy> list, String str, b<T> bVar) {
        ArrayList arrayList = new ArrayList();
        if (!m6324(list).m6418(str)) {
            f1843 = (f1840 + 39) % 128;
            this.f1846--;
            arrayList.add(bVar.mo6368(list));
            dy dyVarM6324 = m6324(list);
            while (dyVarM6324.m6418(m6349(TextUtils.indexOf((CharSequence) "", '0') + 1121, (char) (ViewConfiguration.getTapTimeout() >> 16), 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                f1843 = (f1840 + 1) % 128;
                arrayList.add(bVar.mo6368(list));
                dyVarM6324 = m6324(list);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6349(1122 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22).intern());
            sb2.append(str);
            sb2.append(m6349(Color.alpha(0) + 1143, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 995), 1 - KeyEvent.keyCodeFromString("")).intern());
            m6364(dyVarM6324, str, arrayList, sb2.toString());
        }
        int i10 = f1843 + 119;
        f1840 = i10 % 128;
        if (i10 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6365(List<dy> list, String str, String str2) {
        f1843 = (f1840 + 31) % 128;
        m6346(list, str, null, str2);
        f1840 = (f1843 + 77) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6364(dy dyVar, String str, Object obj, String str2) {
        f1840 = (f1843 + 19) % 128;
        if (!dyVar.m6418(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6349(MotionEvent.axisFromString("") + 1144, (char) (995 - KeyEvent.getDeadChar(0, 0)), 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb2.append(str);
            sb2.append(m6349(Color.green(0) + 1143, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 995), -Process.getGidForName("")).intern());
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m6349((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1143, (char) (996 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 1).intern());
            sb3.append(dyVar.m6415());
            sb3.append(m6349(1144 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-16776221) - Color.rgb(0, 0, 0)), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
            m6358(m6363(string, sb3.toString(), obj, str2));
        }
        int i10 = f1840 + 91;
        f1843 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6363(String str, String str2, Object obj, String str3) {
        String string;
        String string2 = "";
        if (obj == null) {
            f1843 = (f1840 + 85) % 128;
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6349((ViewConfiguration.getJumpTapTimeout() >> 16) + 1239, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49766), ExpandableListView.getPackedPositionGroup(0L) + 7).intern());
            sb2.append(obj);
            string = sb2.toString();
            f1843 = (f1840 + 57) % 128;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m6349(1247 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), 9 - TextUtils.getCapsMode("", 0, 0)).intern());
        sb3.append(str);
        sb3.append(string);
        sb3.append(m6349((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1255, (char) View.MeasureSpec.getSize(0), 14 - KeyEvent.getDeadChar(0, 0)).intern());
        sb3.append(str2);
        if (str3 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m6349(1269 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.lastIndexOf("", '0', 0) + 54387), 3 - KeyEvent.getDeadChar(0, 0)).intern());
            sb4.append(str3);
            string2 = sb4.toString();
        }
        sb3.append(string2);
        return sb3.toString();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6357(dy dyVar, dy.d dVar, Object obj, String str) {
        if (!dyVar.m6414().equals(dVar)) {
            int i10 = f1843 + 77;
            f1840 = i10 % 128;
            int i11 = i10 % 2;
            m6358(m6363(dVar.toString(), dyVar.m6414().toString(), obj, str));
            if (i11 == 0) {
                int i12 = 71 / 0;
            }
        }
        f1843 = (f1840 + 113) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6358(String str) {
        f1843 = (f1840 + 73) % 128;
        m6359(str, (Throwable) null);
        f1843 = (f1840 + 99) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6359(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6349(1272 - Gravity.getAbsoluteGravity(0, 0), (char) Color.red(0), 7 - KeyEvent.normalizeMetaState(0)).intern());
        sb2.append(this.f1847);
        sb2.append(m6349((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 786, (char) (17387 - View.MeasureSpec.getMode(0)), 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb2.append(this.f1848);
        co.m5911(sb2.toString(), str, th2);
        throw new RuntimeException(m6349(1279 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28).intern(), th2);
    }
}
