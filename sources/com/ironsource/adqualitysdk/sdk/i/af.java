package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.adqualitysdk.sdk.i.ah;
import com.ironsource.adqualitysdk.sdk.i.ja;
import com.ironsource.adqualitysdk.sdk.i.je;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class af {

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f166 = 1;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static int f168;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private String f170;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private q f171;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Context f172;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ae f173;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private iu f174;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private jo f175;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f177;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Handler f178;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f179;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private iw f182;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ja f183;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private al f184;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f185;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ah f186;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int[] f167 = {-1469469176, -974809611, -2002033642, 666463242, -211924936, 80851235, 1695927819, -277586470, 1209384732, -2064262749, 671764510, 1304361333, 73267262, -2075817937, -1343380381, 1170773375, -1004242352, 1285275974};

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static char[] f169 = {'9', 'k', 'f', 'n', 'v', 'r', 'f', 'g', 'g', 'J', '0', 'P', 'l', 'k', 'j', 'd', 'l', 'P', 'G', 'f', 'l', 'n', 'o', 'q', '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', 'W', 'X', 'p', 'b', 'a', 'X', 'Q', 'b', 'g', 'i', 'l', 'p', 'r', 'q', 'i', '9', 'm', 'f', 'k', 'o', 'R', 186, 209, 207, 207, 168, 159, 193, 195, 197, 202, 201, 162, 161, 202, 209, 207, 207, 168, 165, 200, 203, 210, 201, 195, 197, 185, 200, 201};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<ag> f181 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<je.d> f180 = new ArrayList();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f176 = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af$3, reason: invalid class name */
    class AnonymousClass3 implements ah.a {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ iy f214;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ JSONArray f216;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ List f217;

        AnonymousClass3(JSONArray jSONArray, List list, iy iyVar) {
            this.f216 = jSONArray;
            this.f217 = list;
            this.f214 = iyVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ah.a
        public void onEventGenerated(JSONObject jSONObject) {
            af.m4642(af.this).m4603(jSONObject);
            af.m4606(af.this).m6828(af.m4617(af.this).m4727(af.m4612(af.this)), jSONObject, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f218 = 1;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f219 = 0;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static short[] f220 = null;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static int f221 = -1825032449;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static byte[] f222 = {-36, 54, 57, 55, -63, -57, Utf8.REPLACEMENT_BYTE, -31, -68, Ascii.ETB, Ascii.CAN, -2, 32, -16, -25, Ascii.CAN, -29, 66, -65, Ascii.DC2, Ascii.CAN, 87, -86, -29, Ascii.DC4, -18, -18, -20, Ascii.US, -30, 67, -68, 17, Ascii.US, 19, 17, -1, 19, 66, -82, 80, -67, Ascii.DC4, 57, 104, 91, 124, -117, 113, 113, 115, UnsignedBytes.MAX_POWER_OF_TWO, 125, -36, 34, -117, -90, -87, 124, 52, -120, -121, 97, -65, 111, 120, -121, 124, -35, 54, 122, -123, 124, -39, 55, 119, 113, 115, 117, -39, 34, -120, -121, 96, -39, 55, 119, -117, -113, 122, -127, 118, 112, -110, 0, 0, 0, 0};

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f223 = 70;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f224 = -1800214918;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static String m4678(int i10, short s10, int i11, byte b10, int i12) {
                    String string;
                    synchronized (o.f3017) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            int i13 = f223;
                            int i14 = i12 + i13;
                            int i15 = i14 == -1 ? 1 : 0;
                            if (i15 != 0) {
                                byte[] bArr = f222;
                                i14 = bArr != null ? (byte) (bArr[f224 + i10] + i13) : (short) (f220[f224 + i10] + i13);
                            }
                            if (i14 > 0) {
                                o.f3018 = ((i10 + i14) - 2) + f224 + i15;
                                o.f3019 = b10;
                                char c10 = (char) (i11 + f221);
                                o.f3021 = c10;
                                sb2.append(c10);
                                o.f3020 = o.f3021;
                                o.f3022 = 1;
                                while (o.f3022 < i14) {
                                    byte[] bArr2 = f222;
                                    if (bArr2 != null) {
                                        int i16 = o.f3018;
                                        o.f3018 = i16 - 1;
                                        o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                                    } else {
                                        short[] sArr = f220;
                                        int i17 = o.f3018;
                                        o.f3018 = i17 - 1;
                                        o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                                    }
                                    sb2.append(o.f3021);
                                    o.f3020 = o.f3021;
                                    o.f3022++;
                                }
                            }
                            string = sb2.toString();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return string;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo4675(final iq iqVar) {
                    final int iM6805 = iqVar.m6802().m6805();
                    final String strM6806 = iqVar.m6802().m6806();
                    if (iM6805 >= 200 && iM6805 <= 299) {
                        k.m7099(m4678(1800214917 - TextUtils.lastIndexOf("", '0', 0, 0), (short) TextUtils.getCapsMode("", 0, 0), TextUtils.getCapsMode("", 0, 0) + 1825032514, (byte) (TextUtils.getOffsetBefore("", 0) - 52), (-61) - Color.green(0)).intern(), m4678(ExpandableListView.getPackedPositionType(0L) + 1800214926, (short) View.combineMeasuredStates(0, 0), 1825032520 - ExpandableListView.getPackedPositionGroup(0L), (byte) (16 - TextUtils.lastIndexOf("", '0', 0, 0)), (-33) - (Process.myTid() >> 22)).intern(), AnonymousClass3.this.f216);
                        Iterator it = AnonymousClass3.this.f217.iterator();
                        while (it.hasNext()) {
                            af.m4613(af.this).m6879(((ai) it.next()).m4709());
                        }
                        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() {
                                AnonymousClass3.this.f214.mo4675(iqVar);
                            }
                        });
                        return;
                    }
                    if (iM6805 == 403) {
                        synchronized (af.this) {
                            try {
                                for (final je.d dVar : af.m4615(af.this)) {
                                    t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.2
                                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                        /* JADX INFO: renamed from: ﾒ */
                                        public final void mo4564() {
                                            dVar.mo6931();
                                        }
                                    });
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        String strIntern = m4678((ViewConfiguration.getWindowTouchSlop() >> 8) + 1800214918, (short) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 1825032514, (byte) (View.MeasureSpec.getSize(0) - 52), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 61).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m4678(1800214962 - TextUtils.getOffsetAfter("", 0), (short) View.getDefaultSize(0, 0), 1825032532 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((-114) - (Process.myPid() >> 22)), TextUtils.indexOf("", "", 0) - 19).intern());
                        sb2.append(iM6805);
                        sb2.append(m4678((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1800215012, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 1825032480 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53), (-69) - KeyEvent.normalizeMetaState(0)).intern());
                        sb2.append(strM6806);
                        k.m7113(strIntern, sb2.toString());
                    }
                    t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.4

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static boolean f230 = true;

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static int f231 = 87;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f232 = 0;

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static int f233 = 1;

                        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                        private static boolean f234 = true;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static char[] f235 = {170, 198, 196, 188, 203, 191, 192, 197, 190, 'w', 206, 201, 202, 187, 156, 205, 133, 158, 199, 145};

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static String m4679(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
                            Object bytes = str2;
                            if (str2 != null) {
                                bytes = str2.getBytes("ISO-8859-1");
                            }
                            byte[] bArr = (byte[]) bytes;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (m.f3012) {
                                try {
                                    char[] cArr2 = f235;
                                    int i11 = f231;
                                    if (f234) {
                                        int length = bArr.length;
                                        m.f3014 = length;
                                        char[] cArr3 = new char[length];
                                        m.f3013 = 0;
                                        while (m.f3013 < m.f3014) {
                                            int i12 = m.f3013;
                                            int i13 = m.f3014 - 1;
                                            int i14 = m.f3013;
                                            cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                                            m.f3013 = i14 + 1;
                                        }
                                        return new String(cArr3);
                                    }
                                    if (f230) {
                                        int length2 = cArr.length;
                                        m.f3014 = length2;
                                        char[] cArr4 = new char[length2];
                                        m.f3013 = 0;
                                        while (m.f3013 < m.f3014) {
                                            int i15 = m.f3013;
                                            int i16 = m.f3014 - 1;
                                            int i17 = m.f3013;
                                            cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                                            m.f3013 = i17 + 1;
                                        }
                                        return new String(cArr4);
                                    }
                                    int length3 = iArr.length;
                                    m.f3014 = length3;
                                    char[] cArr5 = new char[length3];
                                    m.f3013 = 0;
                                    while (m.f3013 < m.f3014) {
                                        int i18 = m.f3013;
                                        int i19 = m.f3014 - 1;
                                        int i20 = m.f3013;
                                        cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                                        m.f3013 = i20 + 1;
                                    }
                                    return new String(cArr5);
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            iy iyVar = AnonymousClass3.this.f214;
                            iq iqVar2 = iqVar;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m4679(null, TextUtils.indexOf("", "", 0, 0) + 127, null, "\u008a\u0094\u0084\u008d\u0088\u0082\u0093\u008d\u0084\u008c\u008a\u0085\u0082\u0092\u008a\u0091\u0085\u0088\u0084\u0090\u008f\u008e\u0088\u0084\u008d\u008a\u0086\u0085\u0087\u008b\u008a\u0089\u0088\u0082\u008c\u008b\u008a\u0085\u0088\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                            sb3.append(iM6805);
                            sb3.append(m4679(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u008a").intern());
                            sb3.append(strM6806);
                            iyVar.mo4676(iqVar2, sb3.toString());
                            f233 = (f232 + 15) % 128;
                        }
                    });
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo4676(final iq iqVar, final String str) {
                    t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            AnonymousClass3.this.f214.mo4676(iqVar, str);
                        }
                    });
                    int i10 = f218 + 121;
                    f219 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }
            });
        }
    }

    public af(Context context, ao aoVar, al alVar, boolean z10, String str, q qVar) {
        this.f171 = qVar;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.af.5

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f244 = 167;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f245 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f246;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m4680(String str2, int i10, boolean z11, int i11, int i12) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
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
                            cArr2[i14] = (char) (cArr2[i14] - f244);
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
                        if (z11) {
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
                        str3 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                f245 = (f246 + 33) % 128;
                kd.m7166(m4680("\u000b\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb", 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, ExpandableListView.getPackedPositionType(0L) + 271).intern(), m4680("�\ufffb\u000f\u0001\u0002\u000eﾺ\uffff\u0012�\uffff\n\u000e\u0003\t\b\uffef\b", ImageFormat.getBitsPerPixel(0) + 19, false, TextUtils.getOffsetAfter("", 0) + 16, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 269).intern(), m4680("\b\ufff1\u000f\ufffe\u0000\u0002\uffff\ufffe\u0000", 9 - (Process.myPid() >> 22), false, -TextUtils.lastIndexOf("", '0', 0, 0), 266 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th2);
                af.this.m4660();
                af.m4633(af.this).uncaughtException(thread, th2);
                int i10 = f246 + 113;
                f245 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }
        });
        this.f184 = alVar;
        this.f172 = context;
        je jeVar = new je(context, m4646(new int[]{2142473509, 959875332, -974896525, 1353679588, -383335320, 509482092, 246021949, -1597145402, -1660798854, 916120805, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25).intern(), m4630(new int[]{0, 24, 0, 24}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true).intern());
        this.f183 = new ja(m4646(new int[]{-1566622052, -1321266843, -1680295992, 1459105824}, TextUtils.indexOf("", "") + 8).intern(), m4646(new int[]{285523246, 2125077745, 529671218, 1081736530}, 5 - MotionEvent.axisFromString("")).intern(), jeVar);
        int iM4632 = m4632(jeVar);
        this.f186 = new ah(context, aoVar, iM4632, m4629(jeVar), ar.m4771().mo4776());
        this.f182 = new iw(context);
        this.f185 = false;
        HandlerThread handlerThread = new HandlerThread(m4646(new int[]{-911160412, 496095674, 444534958, 1214402569, 1847194611, 1965971865, -1123958610, -841576584}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14).intern());
        handlerThread.start();
        this.f178 = new Handler(handlerThread.getLooper());
        this.f173 = new ae(iM4632);
        this.f177 = !z10;
        this.f170 = str;
        m4631(true);
        m4621();
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    static /* synthetic */ iw m4606(af afVar) {
        int i10 = f168;
        f166 = (i10 + 23) % 128;
        iw iwVar = afVar.f182;
        int i11 = i10 + 71;
        f166 = i11 % 128;
        if (i11 % 2 != 0) {
            return iwVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private int m4608() {
        int i10 = f166 + 1;
        f168 = i10 % 128;
        if (i10 % 2 != 0) {
            m4611();
            throw null;
        }
        if (m4611() != null && !ar.m4771().mo4788()) {
            return m4611().m4852();
        }
        int i11 = f168 + 81;
        f166 = i11 % 128;
        if (i11 % 2 != 0) {
            return 100;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ ah m4609(af afVar) {
        int i10 = (f168 + 63) % 128;
        f166 = i10;
        ah ahVar = afVar.f186;
        f168 = (i10 + 99) % 128;
        return ahVar;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    static /* synthetic */ String m4612(af afVar) {
        int i10 = f166 + 3;
        f168 = i10 % 128;
        if (i10 % 2 != 0) {
            afVar.m4607();
            throw null;
        }
        String strM4607 = afVar.m4607();
        f166 = (f168 + 99) % 128;
        return strM4607;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    static /* synthetic */ ja m4613(af afVar) {
        int i10 = (f168 + 97) % 128;
        f166 = i10;
        ja jaVar = afVar.f183;
        int i11 = i10 + 105;
        f168 = i11 % 128;
        if (i11 % 2 == 0) {
            return jaVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ List m4615(af afVar) {
        int i10 = f166 + 45;
        int i11 = i10 % 128;
        f168 = i11;
        int i12 = i10 % 2;
        List<je.d> list = afVar.f180;
        if (i12 != 0) {
            int i13 = 26 / 0;
        }
        f166 = (i11 + 29) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    static /* synthetic */ al m4617(af afVar) {
        int i10 = (f166 + 95) % 128;
        f168 = i10;
        al alVar = afVar.f184;
        int i11 = i10 + 55;
        f166 = i11 % 128;
        if (i11 % 2 != 0) {
            return alVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ int m4619(af afVar) {
        f166 = (f168 + 71) % 128;
        int iM4608 = afVar.m4608();
        int i10 = f168 + 73;
        f166 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 53 / 0;
        }
        return iM4608;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ void m4622(af afVar) {
        int i10 = f166 + 85;
        f168 = i10 % 128;
        afVar.m4652(i10 % 2 != 0);
        int i11 = f168 + 125;
        f166 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ void m4624(af afVar) {
        int i10 = f166 + 23;
        f168 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m4645(true);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ void m4625(af afVar) {
        int i10 = f168 + 71;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m4618();
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ void m4627(af afVar) {
        int i10 = f168 + 1;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m4626();
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ q m4628(af afVar) {
        int i10 = f166;
        f168 = (i10 + 61) % 128;
        q qVar = afVar.f171;
        int i11 = i10 + 23;
        f168 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 52 / 0;
        }
        return qVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Thread.UncaughtExceptionHandler m4633(af afVar) {
        int i10 = f168 + 59;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = afVar.f176;
        if (i11 != 0) {
            return uncaughtExceptionHandler;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m4639(af afVar) {
        f166 = (f168 + 109) % 128;
        afVar.m4620();
        int i10 = f168 + 41;
        f166 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ ae m4642(af afVar) {
        int i10 = f168;
        int i11 = i10 + 105;
        f166 = i11 % 128;
        int i12 = i11 % 2;
        ae aeVar = afVar.f173;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 3;
        f166 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 61 / 0;
        }
        return aeVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4647(af afVar) {
        f168 = (f166 + 111) % 128;
        afVar.m4631(false);
        int i10 = f168 + 121;
        f166 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 3 / 0;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af$2, reason: invalid class name */
    final class AnonymousClass2 implements iy, ja.a {
        AnonymousClass2() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iy
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo4675(iq iqVar) {
            af.m4622(af.this);
            af.m4647(af.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ja.a
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void mo4677(List<jb> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<jb> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new ai(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ai aiVar = (ai) priorityQueue.poll(); aiVar != null; aiVar = (ai) priorityQueue.poll()) {
                            if (af.m4637(af.this, aiVar)) {
                                if (TextUtils.isEmpty(aiVar.m4708())) {
                                    aiVar.m4707(af.m4609(af.this).m7002().m4755());
                                }
                                arrayList.add(aiVar);
                            } else {
                                af.m4613(af.this).m6879(aiVar.m4709());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        af.m4640(af.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    af.m4622(af.this);
                    return;
                }
            }
            af.m4622(af.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iy
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo4676(iq iqVar, String str) {
            af.m4622(af.this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return m4611().m4843();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m4771().mo4788() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m4771().mo4788() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r0 = m4611().m4844();
        com.ironsource.adqualitysdk.sdk.i.af.f166 = (com.ironsource.adqualitysdk.sdk.i.af.f168 + 33) % 128;
     */
    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m4607() {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.af.f168
            int r0 = r0 + 97
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f166 = r1
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L19
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m4771()
            boolean r0 = r0.mo4788()
            int r1 = r1 / 0
            if (r0 == 0) goto L23
            goto L34
        L19:
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m4771()
            boolean r0 = r0.mo4788()
            if (r0 != 0) goto L34
        L23:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r2.m4611()
            java.lang.String r0 = r0.m4844()
            int r1 = com.ironsource.adqualitysdk.sdk.i.af.f168
            int r1 = r1 + 33
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f166 = r1
            return r0
        L34:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r2.m4611()
            java.lang.String r0 = r0.m4843()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.af.m4607():java.lang.String");
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m4610() {
        boolean z10;
        int i10 = f168;
        z10 = this.f185;
        int i11 = i10 + 77;
        f166 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized as m4611() {
        as asVarMo4784;
        f168 = (f166 + 9) % 128;
        asVarMo4784 = ar.m4771().mo4784();
        int i10 = f166 + 71;
        f168 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return asVarMo4784;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m4614() {
        int i10 = f168 + 109;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        m4643(0);
        int i12 = f168 + 11;
        f166 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m4616() {
        int i10 = f168 + 69;
        f166 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return this.f179;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized void m4618() {
        try {
            f168 = (f166 + 31) % 128;
            if (m4610()) {
                f168 = (f166 + 79) % 128;
                if (!TextUtils.isEmpty(this.f186.m7002().m4755())) {
                    int i10 = f166 + 69;
                    f168 = i10 % 128;
                    if (i10 % 2 != 0) {
                        m4616();
                        throw null;
                    }
                    if (!m4616()) {
                        m4652(true);
                        k.m7113(m4646(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, View.getDefaultSize(0, 0) + 9).intern(), m4646(new int[]{82263556, 2010123041, -389681155, 835751152, 285523246, 2125077745, 161422540, 1021833377, 426856860, -1468095046, -2077565810, -1220588072, 83087957, 956410176}, (Process.myPid() >> 22) + 25).intern());
                        this.f183.m6876(m4611().m4851(), new AnonymousClass2());
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m4620() {
        int i10 = f166 + 3;
        f168 = i10 % 128;
        int i11 = i10 % 2;
        m4631(false);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m4621() {
        this.f174 = new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.7
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo4682() {
                af.m4639(af.this);
            }
        };
        this.f182.m6830().m6822(this.f174);
        this.f175 = new jo(new jm() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f193 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f194 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f195 = 32422;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f196 = 57520;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f197 = 53499;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f198 = 1063;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static JSONObject m4665(Activity activity) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(m4667("ꢕ\ue8e5⧺쳸\ue1d0ᕌ\n斦", 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), activity.getClass().getName());
                    f194 = (f193 + 47) % 128;
                } catch (JSONException unused) {
                    k.m7098(m4667("鮱猗\udc15銙ԫ㓆\uf685৺旡\uda2a", View.combineMeasuredStates(0, 0) + 9).intern(), m4667("떊쨳✠秥L࿖\uf488甧럌鄐ೄ쑺\u0e73\uf191ሥ︋\ud88e溎⧫憌ࠍ薶\ue601\udce2㿙곲", 25 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                }
                f194 = (f193 + 51) % 128;
                return jSONObject;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            static /* synthetic */ JSONObject m4666(Activity activity) {
                f194 = (f193 + 7) % 128;
                JSONObject jSONObjectM4665 = m4665(activity);
                int i10 = f193 + 99;
                f194 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 84 / 0;
                }
                return jSONObjectM4665;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo4668(final Activity activity) {
                t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10.3

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f200 = 139;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f201 = 0;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f202 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m4670(String str, int i10, boolean z10, int i11, int i12) {
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
                                    cArr2[i14] = (char) (cArr2[i14] - f200);
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        f202 = (f201 + 5) % 128;
                        af.m4628(af.this).onEvent(m4670("\ufff7\t\u0007\ufff3\u0000\u0003\u0007\b\ufffa\u0003", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, false, TextUtils.indexOf((CharSequence) "", '0') + 9, 247 - Color.argb(0, 0, 0, 0)).intern());
                        af.this.m4656(m4670("\ufff7\t\u0007\ufff3\u0000\u0003\u0007\b\ufffa\u0003", Drawable.resolveOpacity(0, 0) + 10, false, 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 247).intern(), AnonymousClass10.m4666(activity));
                        int i10 = f201 + 87;
                        f202 = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                    }
                });
                f193 = (f194 + 95) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo4669(final Activity activity) {
                t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10.5

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f205 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f206 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static long f207 = -7819346487344341121L;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m4671(String str, int i10) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (h.f2308) {
                            try {
                                char[] cArrM6531 = h.m6531(f207, cArr, i10);
                                h.f2309 = 4;
                                while (true) {
                                    int i11 = h.f2309;
                                    if (i11 < cArrM6531.length) {
                                        h.f2307 = i11 - 4;
                                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f207));
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        f205 = (f206 + 11) % 128;
                        af.m4628(af.this).onEvent(m4671("㣳ヿ笊儯㢕濯얗伧䕼\ueddb䞂촳썸毼솓䬨䅢\ue9e8", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                        af.this.m4656(m4671("㣳ヿ笊儯㢕濯얗伧䕼\ueddb䞂촳썸毼솓䬨䅢\ue9e8", 1 - Drawable.resolveOpacity(0, 0)).intern(), AnonymousClass10.m4666(activity));
                        int i10 = f205 + 25;
                        f206 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 14 / 0;
                        }
                    }
                });
                int i10 = f194 + 91;
                f193 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 90 / 0;
                }
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m4667(String str, int i10) {
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
                                    char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f196)) ^ ((c11 >>> 5) + f197)));
                                    cArr3[1] = c12;
                                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + f198) ^ ((c12 + i12) ^ ((c12 << 4) + f195))));
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
        });
        jj.m6964().m6967(new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.af.12
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo4672(Activity activity) {
                af.this.m4660();
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo4673(Activity activity) {
                af.m4627(af.this);
            }
        });
        ar.m4771().mo4795(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.af.11
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4605() {
                af.m4624(af.this);
            }
        });
        f166 = (f168 + 103) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m4623() {
        if (this.f174 != null) {
            int i10 = f166 + 17;
            f168 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f182.m6830().m6820(this.f174);
                throw null;
            }
            this.f182.m6830().m6820(this.f174);
        }
        this.f175.m6992();
        this.f175 = null;
        int i11 = f168 + 27;
        f166 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m4626() {
        if (this.f177) {
            f168 = (f166 + 7) % 128;
            m4657();
            f166 = (f168 + 69) % 128;
        }
        this.f177 = false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m4637(af afVar, ai aiVar) {
        int i10 = f168 + 21;
        f166 = i10 % 128;
        if (i10 % 2 == 0) {
            afVar.m4638(aiVar);
            throw null;
        }
        boolean zM4638 = afVar.m4638(aiVar);
        f168 = (f166 + 57) % 128;
        return zM4638;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m4640(af afVar, List list, iy iyVar) {
        f168 = (f166 + 121) % 128;
        afVar.m4635((List<ai>) list, iyVar);
        f168 = (f166 + 89) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m4645(boolean z10) {
        try {
            int i10 = f166 + 123;
            f168 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f185 = true;
                m4631(false);
            } else {
                this.f185 = true;
                m4631(true);
            }
            f168 = (f166 + 3) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4648(af afVar, int i10) {
        int i11 = f166 + 17;
        f168 = i11 % 128;
        int i12 = i11 % 2;
        afVar.m4643(i10);
        if (i12 != 0) {
            int i13 = 38 / 0;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m4654() {
        String strM4629 = m4629(new je(this.f172, m4646(new int[]{2142473509, 959875332, -974896525, 1353679588, -383335320, 509482092, 246021949, -1597145402, -1660798854, 916120805, -803478886, -227126831, -1523557290, 1147115770}, 25 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m4630(new int[]{0, 24, 0, 24}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true).intern()));
        f166 = (f168 + 113) % 128;
        return strM4629;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4655() {
        t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.9

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f265 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f266 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static boolean f267 = true;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f268 = {221, 217, 200, 220, 206, 215, 205};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static boolean f269 = true;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f270 = 105;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m4684(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (m.f3012) {
                    try {
                        char[] cArr2 = f268;
                        int i11 = f270;
                        if (f267) {
                            int length = bArr.length;
                            m.f3014 = length;
                            char[] cArr3 = new char[length];
                            m.f3013 = 0;
                            while (m.f3013 < m.f3014) {
                                int i12 = m.f3013;
                                int i13 = m.f3014 - 1;
                                int i14 = m.f3013;
                                cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                                m.f3013 = i14 + 1;
                            }
                            return new String(cArr3);
                        }
                        if (f269) {
                            int length2 = cArr.length;
                            m.f3014 = length2;
                            char[] cArr4 = new char[length2];
                            m.f3013 = 0;
                            while (m.f3013 < m.f3014) {
                                int i15 = m.f3013;
                                int i16 = m.f3014 - 1;
                                int i17 = m.f3013;
                                cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                                m.f3013 = i17 + 1;
                            }
                            return new String(cArr4);
                        }
                        int length3 = iArr.length;
                        m.f3014 = length3;
                        char[] cArr5 = new char[length3];
                        m.f3013 = 0;
                        while (m.f3013 < m.f3014) {
                            int i18 = m.f3013;
                            int i19 = m.f3014 - 1;
                            int i20 = m.f3013;
                            cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                            m.f3013 = i20 + 1;
                        }
                        return new String(cArr5);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                af.m4628(af.this).onEvent(m4684(null, 126 - ExpandableListView.getPackedPositionChild(0L), null, "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern());
                af.this.m4656(m4684(null, 127 - TextUtils.indexOf("", "", 0), null, "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern(), new JSONObject());
                int i10 = f266 + 71;
                f265 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }
        });
        f166 = (f168 + 61) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m4641(af afVar, int i10) {
        f168 = (f166 + 103) % 128;
        boolean zM4653 = afVar.m4653(i10);
        int i11 = f166 + 23;
        f168 = i11 % 128;
        if (i11 % 2 == 0) {
            return zM4653;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4649(af afVar, JSONObject jSONObject, ir irVar) {
        f166 = (f168 + 117) % 128;
        afVar.m4651(jSONObject, irVar);
        int i10 = f168 + 107;
        f166 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4656(String str, JSONObject jSONObject) {
        int i10 = f168 + 67;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        m4644(str, jSONObject, null);
        if (i11 == 0) {
            int i12 = 4 / 0;
        }
        int i13 = f166 + 91;
        f168 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m4658(je.d dVar) {
        f168 = (f166 + 35) % 128;
        this.f180.add(dVar);
        f168 = (f166 + 105) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4629(je jeVar) {
        f168 = (f166 + 83) % 128;
        String strM6925 = jeVar.m6925(m4646(new int[]{880499219, 219661264, 1061739848, -731476431, 541997271, 1086220609, 2040148884, 1234529969}, (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern());
        if (!TextUtils.isEmpty(strM6925)) {
            return strM6925;
        }
        f168 = (f166 + 23) % 128;
        String string = UUID.randomUUID().toString();
        jeVar.m6926(m4646(new int[]{880499219, 219661264, 1061739848, -731476431, 541997271, 1086220609, 2040148884, 1234529969}, 16 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), string);
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4657() {
        t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.8

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f259 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f260 = 8001735609835121508L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f261;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f262;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f263;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m4683(String str, char c10, String str2, int i10, String str3) {
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
                                cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f260) ^ ((long) f261)) ^ ((long) f263));
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

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                af.m4628(af.this).onEvent(m4683("\uf018펥므ㄘ纫\u0ff2餫\udcca䅾\udf18쨧⺏\ue747", (char) (11543 - (KeyEvent.getMaxKeyCode() >> 16)), "\ueb64拐\ue024漋", (-383233332) - ((Process.getThreadPriority(0) + 20) >> 6), "챤⡒៩भ").intern());
                af.this.m4656(m4683("\uf018펥므ㄘ纫\u0ff2餫\udcca䅾\udf18쨧⺏\ue747", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 11543), "\ueb64拐\ue024漋", TextUtils.indexOf("", "", 0, 0) - 383233332, "챤⡒៩भ").intern(), new JSONObject());
                int i10 = f259 + 95;
                f262 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i10 = f166 + 59;
        f168 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m4659() {
        try {
            f166 = (f168 + 61) % 128;
            this.f185 = false;
            Handler handler = this.f178;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                f166 = (f168 + 19) % 128;
            }
            this.f182.m6829();
            m4623();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4662() {
        synchronized (this) {
            try {
                Handler handler = this.f178;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                m4631(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m4634(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(m4646(new int[]{-1967768556, -1946163968, 81328616, 1125925523}, (-16777211) - Color.rgb(0, 0, 0)).intern(), str);
            jSONObject2.put(m4630(new int[]{50, 5, 0, 2}, "\u0001\u0000\u0000\u0001\u0001", false).intern(), str2);
            jSONObject2.put(m4646(new int[]{551549932, 1373315991, -1205271376, 2138843809}, View.resolveSizeAndState(0, 0, 0) + 6).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject2.put(m4646(new int[]{-389804321, -275172463, -1757591635, -1094520480}, KeyEvent.keyCodeFromString("") + 5).intern(), str4);
            }
            if (jSONObject != null) {
                int i10 = f168 + 1;
                f166 = i10 % 128;
                if (i10 % 2 == 0) {
                    jz.m7083(jSONObject2, jSONObject);
                    int i11 = 15 / 0;
                } else {
                    jz.m7083(jSONObject2, jSONObject);
                }
            }
        } catch (JSONException e10) {
            k.m7118(m4646(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9).intern(), m4630(new int[]{55, 26, 95, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false).intern(), e10);
        }
        int i12 = f166 + 57;
        f168 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 15 / 0;
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m4661(ag agVar) {
        f166 = (f168 + 117) % 128;
        this.f181.add(agVar);
        f166 = (f168 + 75) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4660() {
        f168 = (f166 + 11) % 128;
        try {
            this.f177 = true;
            m4655();
            m4662();
            f168 = (f166 + 65) % 128;
        } catch (Exception e10) {
            kd.m7160(m4646(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, TextUtils.getOffsetAfter("", 0) + 9).intern(), m4630(new int[]{24, 26, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", false).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4663(String str, JSONObject jSONObject, JSONObject jSONObject2, final ir irVar) {
        String strIntern = m4646(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, TextUtils.getTrimmedLength("") + 9).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m4646(new int[]{83096655, 245550014, 289056553, -1579412729, -640605648, -181917106, 1761504619, 1903179779, 285092908, -348226072, 1376643555, 797126243}, 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        sb2.append(str);
        sb2.append(m4646(new int[]{1849786485, 1620937760, 930804328, 1175772035, 793480345, 1919279341, -757807160, 1382205472, 953336447, -1759961253}, 17 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        k.m7099(strIntern, sb2.toString(), jSONObject);
        try {
            if (m4611().m4848().contains(str)) {
                String strIntern2 = m4646(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getEdgeSlop() >> 16) + 9).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m4646(new int[]{-950026680, -1992704577, 1373818390, 1537277856, -389681155, 835751152, 285523246, 2125077745, 1548619636, -186787108, -406479645, 1509108356, 1077145615, -1077114738, 1513703436, -1612471642}, 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
                sb3.append(str);
                sb3.append(m4646(new int[]{1145460262, 2124375549, 1922823439, -364277260, -1940569395, 1856846010, 1976509113, -1978719714, 2048614725, 1304313963, -1874846112, -2043772260}, 21 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
                k.m7113(strIntern2, sb3.toString());
                int i10 = f168 + 27;
                f166 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                return;
            }
            String strIntern3 = m4646(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, '9' - AndroidCharacter.getMirror('0')).intern();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m4646(new int[]{83096655, 245550014, 289056553, -1579412729, -640605648, -181917106, 1761504619, 1903179779, 285092908, -348226072, 1849786485, 1620937760, -1334808229, -277208604, 21539249, 1861875140}, TextUtils.indexOf((CharSequence) "", '0', 0) + 33).intern());
            sb4.append(str);
            k.m7113(strIntern3, sb4.toString());
            this.f186.m4694(str, jSONObject, jSONObject2, this.f182.m6830().m6818(), new ah.a() { // from class: com.ironsource.adqualitysdk.sdk.i.af.6
                @Override // com.ironsource.adqualitysdk.sdk.i.ah.a
                public void onEventGenerated(JSONObject jSONObject3) {
                    af.m4642(af.this).m4603(jSONObject3);
                    af.m4649(af.this, jSONObject3, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.6.3

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static short[] f250 = null;

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static int f251 = 1;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f252 = 0;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static byte[] f253 = {-88, 66, 77, 67, -75, -77, 75, -107, -86, 83, -96, 90, -84, -87, 86, -85, 121, UnsignedBytes.MAX_POWER_OF_TWO, -86, Ascii.SUB, -77, -109, 83, 92, -70, 100, -76, -93, 92, -89, 6, -25, 80, Ascii.FS, -5, 86, -88, 85, 120, 0, 0};

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static int f254 = 167662927;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int f255 = 27;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f256 = -284125767;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m4681(int i11, short s10, int i12, byte b10, int i13) {
                            String string;
                            synchronized (o.f3017) {
                                try {
                                    StringBuilder sb5 = new StringBuilder();
                                    int i14 = f255;
                                    int i15 = i13 + i14;
                                    int i16 = i15 == -1 ? 1 : 0;
                                    if (i16 != 0) {
                                        byte[] bArr = f253;
                                        i15 = bArr != null ? (byte) (bArr[f256 + i11] + i14) : (short) (f250[f256 + i11] + i14);
                                    }
                                    if (i15 > 0) {
                                        o.f3018 = ((i11 + i15) - 2) + f256 + i16;
                                        o.f3019 = b10;
                                        char c10 = (char) (i12 + f254);
                                        o.f3021 = c10;
                                        sb5.append(c10);
                                        o.f3020 = o.f3021;
                                        o.f3022 = 1;
                                        while (o.f3022 < i15) {
                                            byte[] bArr2 = f253;
                                            if (bArr2 != null) {
                                                int i17 = o.f3018;
                                                o.f3018 = i17 - 1;
                                                o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i17] + s10)) ^ o.f3019));
                                            } else {
                                                short[] sArr = f250;
                                                int i18 = o.f3018;
                                                o.f3018 = i18 - 1;
                                                o.f3021 = (char) (o.f3020 + (((short) (sArr[i18] + s10)) ^ o.f3019));
                                            }
                                            sb5.append(o.f3021);
                                            o.f3020 = o.f3021;
                                            o.f3022++;
                                        }
                                    }
                                    string = sb5.toString();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return string;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            f252 = (f251 + 111) % 128;
                            af.m4647(af.this);
                            ir irVar2 = irVar;
                            if (irVar2 != null) {
                                f251 = (f252 + 109) % 128;
                                try {
                                    irVar2.mo4564();
                                } catch (Exception e10) {
                                    kd.m7168(m4681(TextUtils.indexOf("", "", 0, 0) + 284125767, (short) Color.green(0), (-167662862) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (Color.red(0) - 72), Color.blue(0) - 18).intern(), m4681(Color.blue(0) + 284125775, (short) TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) - 167662857, (byte) (TextUtils.indexOf("", "", 0) + 85), 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), e10, false, false, true);
                                }
                            }
                        }
                    });
                }
            });
        } catch (Exception e10) {
            kd.m7168(m4646(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, 9 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m4646(new int[]{-125987093, 2062639908, 2049619959, -170090790, 2075892157, -122529565, -40209718, -175130338, 1982882234, -2045069041}, 18 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), e10, false, false, true);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m4631(boolean z10) {
        int i10 = (f166 + 109) % 128;
        f168 = i10;
        if (!z10) {
            this.f183.m6877(new ja.d() { // from class: com.ironsource.adqualitysdk.sdk.i.af.14
                @Override // com.ironsource.adqualitysdk.sdk.i.ja.d
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo4674(int i11) {
                    af.m4648(af.this, af.m4641(af.this, i11) ? 0 : af.m4619(af.this));
                }
            });
            return;
        }
        int i11 = i10 + 47;
        f166 = i11 % 128;
        if (i11 % 2 != 0) {
            m4614();
        } else {
            m4614();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4644(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i10 = f168 + 3;
        f166 = i10 % 128;
        int i11 = i10 % 2;
        m4663(str, jSONObject, jSONObject2, null);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m4643(int i10) {
        this.f178.removeCallbacksAndMessages(null);
        this.f178.postDelayed(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.1

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f187 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f188 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f189 = 3506;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f190;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f191;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4664(String str, char c10, String str2, int i11, String str3) {
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
                                cArr6[i16] = (char) (((((long) (c12 ^ cArr3[i16])) ^ f191) ^ ((long) f188)) ^ ((long) f189));
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
            public final void mo4564() {
                int i11 = f187 + 95;
                f190 = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        af.m4625(af.this);
                    } else {
                        af.m4625(af.this);
                        int i12 = 26 / 0;
                    }
                } catch (Throwable th2) {
                    k.m7104(m4664("壶쉠㫖⫩㫪ଶ彐ｚ뇫", (char) (Process.getGidForName("") + 1), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1842376590, "狺⾐쒒о").intern(), m4664("㊠ᕲ擇뱩祜崢ꈢꗹ덃멦꺙\uf637슟쁕⡄ㅎ㹴깕뿇魲\uf289⎧ꀪ褩숩폩永ⵉ낽\uf4e8Ⲓ", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 9590), "\u0000\u0000\u0000\u0000", 1189248938 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "ꫳ\ue27f癆줥").intern(), th2);
                    af.m4622(af.this);
                }
            }
        }, i10);
        f168 = (f166 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4630(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f169, i10, cArr, 0, i11);
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
    private synchronized void m4652(boolean z10) {
        int i10 = f168 + 117;
        f166 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f179 = z10;
            throw null;
        }
        this.f179 = z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int m4632(je jeVar) {
        String strM6925 = jeVar.m6925(m4646(new int[]{-1627444297, 1930145964, 216365417, -156356161, -753046412, 1138589857}, 10 - Color.alpha(0)).intern());
        int i10 = 1;
        if (!TextUtils.isEmpty(strM6925)) {
            int i11 = f168 + 109;
            f166 = i11 % 128;
            i10 = i11 % 2 == 0 ? Integer.parseInt(strM6925) / 0 : Integer.parseInt(strM6925) + 1;
        }
        jeVar.m6926(m4646(new int[]{-1627444297, 1930145964, 216365417, -156356161, -753046412, 1138589857}, 9 - TextUtils.lastIndexOf("", '0', 0)).intern(), String.valueOf(i10));
        f168 = (f166 + 15) % 128;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4 >= m4611().m4851()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 >= m4611().m4851()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.af.f168 + 51;
        com.ironsource.adqualitysdk.sdk.i.af.f166 = r4 % 128;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m4653(int r4) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.af.f166
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f168 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1b
            com.ironsource.adqualitysdk.sdk.i.as r0 = r3.m4611()
            int r0 = r0.m4851()
            r2 = 67
            int r2 = r2 / r1
            if (r4 < r0) goto L34
            goto L25
        L1b:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r3.m4611()
            int r0 = r0.m4851()
            if (r4 < r0) goto L34
        L25:
            int r4 = com.ironsource.adqualitysdk.sdk.i.af.f168
            int r4 = r4 + 51
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f166 = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L32
            return r1
        L32:
            r4 = 1
            return r4
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.af.m4653(int):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4651(JSONObject jSONObject, ir irVar) {
        m4650(jSONObject);
        ai aiVar = new ai(ja.m6867(jSONObject));
        aiVar.m4705(m4611().m4849());
        this.f183.m6878(aiVar.m4709(), irVar);
        m4636(aiVar.m4704());
        t.m7288(irVar);
        int i10 = f168 + 31;
        f166 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 3 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m4638(ai aiVar) {
        f168 = (f166 + 123) % 128;
        boolean zMo4801 = ar.m4771().mo4801(aiVar.m4706(), this.f170);
        int i10 = f168 + 35;
        f166 = i10 % 128;
        if (i10 % 2 != 0) {
            return zMo4801;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[EXC_TOP_SPLITTER, PHI: r2 r8
  0x0062: PHI (r2v12 com.ironsource.adqualitysdk.sdk.i.ai) = (r2v11 com.ironsource.adqualitysdk.sdk.i.ai), (r2v16 com.ironsource.adqualitysdk.sdk.i.ai) binds: [B:11:0x0060, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r8v1 org.json.JSONObject) = (r8v0 org.json.JSONObject), (r8v3 org.json.JSONObject) binds: [B:11:0x0060, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4635(java.util.List<com.ironsource.adqualitysdk.sdk.i.ai> r12, com.ironsource.adqualitysdk.sdk.i.iy r13) {
        /*
            r11 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r1 = r12.iterator()
            int r2 = com.ironsource.adqualitysdk.sdk.i.af.f166
            r3 = 81
            int r2 = r2 + r3
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f168 = r2
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L95
            int r2 = com.ironsource.adqualitysdk.sdk.i.af.f166
            int r2 = r2 + 17
            int r4 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f168 = r4
            int r2 = r2 % 2
            r4 = 85
            r5 = 3
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            com.ironsource.adqualitysdk.sdk.i.ai r2 = (com.ironsource.adqualitysdk.sdk.i.ai) r2
            org.json.JSONObject r8 = r2.m4704()
            int[] r9 = new int[]{r3, r5, r4, r7}
            java.lang.String r9 = m4630(r9, r6, r7)
            java.lang.String r9 = r9.intern()
            boolean r9 = r8.has(r9)
            if (r9 != 0) goto L77
            goto L62
        L46:
            java.lang.Object r2 = r1.next()
            com.ironsource.adqualitysdk.sdk.i.ai r2 = (com.ironsource.adqualitysdk.sdk.i.ai) r2
            org.json.JSONObject r8 = r2.m4704()
            int[] r9 = new int[]{r3, r5, r4, r7}
            java.lang.String r9 = m4630(r9, r6, r7)
            java.lang.String r9 = r9.intern()
            boolean r9 = r8.has(r9)
            if (r9 != 0) goto L77
        L62:
            int[] r4 = new int[]{r3, r5, r4, r7}     // Catch: org.json.JSONException -> L77
            java.lang.String r4 = m4630(r4, r6, r7)     // Catch: org.json.JSONException -> L77
            java.lang.String r4 = r4.intern()     // Catch: org.json.JSONException -> L77
            java.lang.String r5 = com.ironsource.adqualitysdk.sdk.i.ih.f2559     // Catch: org.json.JSONException -> L77
            long r9 = r8.optLong(r5)     // Catch: org.json.JSONException -> L77
            r8.put(r4, r9)     // Catch: org.json.JSONException -> L77
        L77:
            com.ironsource.adqualitysdk.sdk.i.ae r4 = r11.f173
            boolean r4 = r4.m4603(r8)
            if (r4 == 0) goto L90
            int r4 = com.ironsource.adqualitysdk.sdk.i.af.f168
            int r4 = r4 + 41
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f166 = r4
            com.ironsource.adqualitysdk.sdk.i.ja r4 = r11.f183
            com.ironsource.adqualitysdk.sdk.i.jb r2 = r2.m4709()
            r4.m6878(r2, r6)
        L90:
            r0.put(r8)
            goto L12
        L95:
            com.ironsource.adqualitysdk.sdk.i.ah r1 = r11.f186
            com.ironsource.adqualitysdk.sdk.i.iw r2 = r11.f182
            com.ironsource.adqualitysdk.sdk.i.iv r2 = r2.m6830()
            boolean r2 = r2.m6818()
            com.ironsource.adqualitysdk.sdk.i.af$3 r3 = new com.ironsource.adqualitysdk.sdk.i.af$3
            r3.<init>(r0, r12, r13)
            r1.m4693(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.af.m4635(java.util.List, com.ironsource.adqualitysdk.sdk.i.iy):void");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m4650(JSONObject jSONObject) {
        int i10 = f168 + 113;
        f166 = i10 % 128;
        if (i10 % 2 != 0) {
            Iterator<String> it = m4611().m4850().iterator();
            while (!(!it.hasNext())) {
                int i11 = f168 + 73;
                f166 = i11 % 128;
                if (i11 % 2 == 0) {
                    jSONObject.remove(it.next());
                    throw null;
                }
                jSONObject.remove(it.next());
            }
            return;
        }
        m4611().m4850().iterator();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4646(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f167.clone();
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4636(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (s.m7239().m7267()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f181);
            }
            t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.4
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ag) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }
}
