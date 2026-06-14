package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.ar;
import com.ironsource.adqualitysdk.sdk.i.je;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class s extends IronSourceAdQuality {

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private static int f3023 = 1;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static long f3024;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private static char[] f3025;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f3026;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static s f3027;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private je f3028;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private an f3029;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private iz f3030;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private am f3031;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private iw f3033;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private at f3034;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private af f3036;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private ISAdQualityAdListener f3037;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Context f3038;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ISAdQualityConfig f3043;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final ao f3046 = new ao();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3045 = false;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f3044 = false;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3041 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f3042 = false;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f3040 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private ISAdQualityLogLevel f3039 = ISAdQualityLogLevel.INFO;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f3032 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private final al f3035 = new al();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1, reason: invalid class name */
    final class AnonymousClass1 implements av {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ boolean f3048;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ Context f3049;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ boolean f3050;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ String f3051;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ boolean f3052;

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1$3, reason: invalid class name */
        final class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1$3$4, reason: invalid class name */
            final class AnonymousClass4 extends ir {

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static long f3054 = 2703359542927637431L;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f3055 = 1;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f3056;

                AnonymousClass4() {
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    s.m7214(s.this).m6920(m7270("矚\uf3ef蛽瞼㨲젴\uf1f2襰館\ud91a\ue0de顁ꨑ\ueaf4펈ꪊ묫\ufbca", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new je.b() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.3.4.1

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f3058 = 0;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static long f3059 = -378883568601775516L;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3060 = 1;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m7271(String str, int i10) {
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
                                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f3059);
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

                        /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r5
  0x001e: PHI (r5v6 boolean) = (r5v1 boolean), (r5v7 boolean) binds: [B:8:0x001c, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // com.ironsource.adqualitysdk.sdk.i.je.b
                        /* JADX INFO: renamed from: ﻛ */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void mo6930(java.lang.String r5) {
                            /*
                                r4 = this;
                                int r0 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C04551.f3058
                                int r0 = r0 + 65
                                int r1 = r0 % 128
                                com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C04551.f3060 = r1
                                int r0 = r0 % 2
                                r1 = 0
                                if (r0 != 0) goto L18
                                boolean r5 = android.text.TextUtils.isEmpty(r5)
                                r0 = 73
                                int r0 = r0 / r1
                                r0 = 1
                                if (r5 == r0) goto L1e
                                goto L52
                            L18:
                                boolean r5 = android.text.TextUtils.isEmpty(r5)
                                if (r5 == 0) goto L52
                            L1e:
                                com.ironsource.adqualitysdk.sdk.i.s$1$3$4 r0 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.s$1$3 r0 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.this
                                com.ironsource.adqualitysdk.sdk.i.s$1 r0 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.this
                                com.ironsource.adqualitysdk.sdk.i.s r0 = com.ironsource.adqualitysdk.sdk.i.s.this
                                com.ironsource.adqualitysdk.sdk.i.je r0 = com.ironsource.adqualitysdk.sdk.i.s.m7214(r0)
                                java.lang.String r2 = ""
                                int r1 = android.text.TextUtils.indexOf(r2, r2, r1, r1)
                                int r1 = r1 + 2039
                                java.lang.String r2 = "䈂䗿䷫嗦嶖旑淇痗綯ֿඑᖜᶕ▁"
                                java.lang.String r1 = m7271(r2, r1)
                                java.lang.String r1 = r1.intern()
                                int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
                                int r2 = r2 >> 16
                                int r2 = 28643 - r2
                                java.lang.String r3 = "䈂ⷦ鷎\u0dbeﶍ"
                                java.lang.String r2 = m7271(r3, r2)
                                java.lang.String r2 = r2.intern()
                                r3 = 0
                                r0.m6924(r1, r2, r3)
                            L52:
                                com.ironsource.adqualitysdk.sdk.i.s$1$3$4$1$4 r0 = new com.ironsource.adqualitysdk.sdk.i.s$1$3$4$1$4
                                r0.<init>()
                                com.ironsource.adqualitysdk.sdk.i.t.m7279(r0)
                                int r5 = com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C04551.f3060
                                int r5 = r5 + 93
                                int r5 = r5 % 128
                                com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C04551.f3058 = r5
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.s.AnonymousClass1.AnonymousClass3.AnonymousClass4.C04551.mo6930(java.lang.String):void");
                        }
                    });
                    int i10 = f3055 + 39;
                    f3056 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m7270(String str, int i10) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (h.f2308) {
                        try {
                            char[] cArrM6531 = h.m6531(f3054, cArr, i10);
                            h.f2309 = 4;
                            while (true) {
                                int i11 = h.f2309;
                                if (i11 < cArrM6531.length) {
                                    h.f2307 = i11 - 4;
                                    cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f3054));
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

            AnonymousClass3() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                if (anonymousClass1.f3048) {
                    s.m7227(s.this).m4916(AnonymousClass1.this.f3049, new AnonymousClass4());
                }
            }
        }

        AnonymousClass1(boolean z10, Context context, boolean z11, String str, boolean z12) {
            this.f3048 = z10;
            this.f3049 = context;
            this.f3050 = z11;
            this.f3051 = str;
            this.f3052 = z12;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.av
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4605() {
            t.m7283(new AnonymousClass3());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$5, reason: invalid class name */
    final class AnonymousClass5 extends ir {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char[] f3077 = {'M', 150, 162, 170, 179, 187, 182, 186, 190, 198, 182, 155, '$', '[', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'q', 'k', 'j', 'C', 'K', 'p', 'n', 'n', 'D', '@', 'h', 'p', 'H', 'E', 'h', 'o', 'L', 'F', 175, 218, 224, 224, 197, 190, 209, 214, 203, 205, 224, 217, 217, 183, 177, 219, 219, 221, 184, 182, 224, 222, 214, 218, 202, 159, 141, 142, 142, 176, 218, 224, 224, 197, 190, 209, 214, 203, 205, 224, 217, 217, 183, 177, 219, 219, 221, 184, 175, 218, 220, 215, 179, 180, 216, 176, 183, 222, 219, 180, 180, 198, 159, 141, 142, 142, 161, 183, 184, 184, 189, 182, 185, 169, 142, 142, 175, 209, 209, 216, 214, 207, 216, 219, 211, 175, 175, 208, 174, 179, 217, 215, 221, '7', 'h', '[', 'Z', 'j', 'o', 'f', 'g', 'i', 'k', 'p', 'l', 'f', 'I', 'N', 'q', 'P', '7', 'Z', 'v', 'd', 206, 202, 210, 218, 227, 235, 230, 234, 238, 246, 230, 203, 199, 181, 201, 243, 234, 233, 243, 238, 235, 234, 195, 195, 234, 240, 201, 202, 243, 239, 211, 173, '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'q', 'k', 'j', 'C', '4', 'N', 'J', 'R', 'Z', 'c', 'k', 'f', 'j', 'n', 'v', 'L', '9', 'K', 'G'};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ String f3078;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ ISAdQualityConfig f3079;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ Activity f3081;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ Application f3082;

        AnonymousClass5(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f3079 = iSAdQualityConfig;
            this.f3078 = str;
            this.f3082 = application;
            this.f3081 = activity;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m7274(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                    System.arraycopy(f3077, i10, cArr, 0, i11);
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

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4564() {
            try {
                String userId = this.f3079.getUserId();
                s.m7244(s.this, this.f3079.getLogLevel());
                String strIntern = m7274("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7274("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", false, new int[]{12, 26, 0, 0}).intern());
                sb2.append(this.f3078);
                k.m7109(strIntern, sb2.toString());
                ij.m6785(this.f3082.getApplicationContext()).m6789();
                s.m7235(s.this, this.f3079.isTestMode());
                if (this.f3079.isTestMode()) {
                    k.m7102(m7274("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern(), m7274("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true, new int[]{38, 94, 109, 74}).intern());
                }
                try {
                    Class.forName(m7274("\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false, new int[]{Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 20, 0, 6}).intern());
                } catch (Throwable unused) {
                }
                Activity activity = this.f3081;
                if (activity != null) {
                    jw.m7049(activity);
                } else {
                    jw.m7045(this.f3082);
                }
                s.m7237(s.this).m4753(this.f3078);
                s.m7237(s.this).m4759(this.f3079.getInitializationSource());
                s.m7237(s.this).m4754(this.f3079.getCoppa());
                s.m7237(s.this).m4756(this.f3079.getDeviceIdType());
                s.m7237(s.this).m4757(this.f3079.getMetaData());
                Context applicationContext = this.f3082.getApplicationContext();
                s.m7229(s.this, applicationContext);
                s.m7246(s.this, new iw(applicationContext));
                s sVar = s.this;
                s.m7254(s.this);
                s.m7238(sVar, new je(applicationContext, al.m4720(), "B0r1sW@sH3re"));
                ar.m4771().mo4797(applicationContext, s.m7231(s.this), s.m7254(s.this), new ar.c() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.1

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int[] f3083 = {161392192, 1499823339, -721695532, 1269414944, -1536597178, 1972528928, 1184997248, -2043409729, -1004510380, 458687647, -227969981, -1984234855, -432624880, 1761999894, -2057114334, -1735393248, -353286572, -2044858911};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f3084 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f3085;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m7275(int[] iArr, int i10) {
                        String str;
                        synchronized (e.f1936) {
                            try {
                                char[] cArr = new char[4];
                                char[] cArr2 = new char[iArr.length << 1];
                                int[] iArr2 = (int[]) f3083.clone();
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo4839() {
                        f3084 = (f3085 + 19) % 128;
                        s.m7243(s.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m7275(new int[]{-2023492544, 119760403, 1112005157, -1552877142, 650114569, -547908151, -1274178265, -1666651247, -1022986945, -1222045747, -2093729363, -2114175799, -1121388671, -1634671810, 1720117596, -983965390, 1489073122, 215868034}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35).intern());
                        int i10 = f3085 + 117;
                        f3084 = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4840() {
                        s sVar2;
                        ISAdQualityInitError iSAdQualityInitError;
                        String strM7275;
                        int i10 = f3084 + 45;
                        f3085 = i10 % 128;
                        if (i10 % 2 != 0) {
                            sVar2 = s.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            strM7275 = m7275(new int[]{1747955636, 701275797, -340711641, 167662369, 1304856093, -1186197523, -1810694215, -1744796554, 1015162854, 1270649485, -1305307675, -1285633435}, (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)) + 10);
                        } else {
                            sVar2 = s.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            strM7275 = m7275(new int[]{1747955636, 701275797, -340711641, 167662369, 1304856093, -1186197523, -1810694215, -1744796554, 1015162854, 1270649485, -1305307675, -1285633435}, 21 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        }
                        s.m7243(sVar2, iSAdQualityInitError, strM7275.intern());
                        int i11 = f3085 + 27;
                        f3084 = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                    }
                }, s.m7264(s.this));
                s.m7232(s.this, new iz(applicationContext, s.m7231(s.this), s.m7254(s.this).m4726()));
                final String strM7074 = jy.m7074(applicationContext);
                ar.m4771().mo4802(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.2

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static char f3088 = 62599;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f3089 = 1;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f3090 = 0;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static char f3091 = 31914;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char f3092 = 32823;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char f3093 = 15337;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m7276(String str, int i10) {
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
                                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3093)) ^ ((c11 >>> 5) + f3088)));
                                            cArr3[1] = c12;
                                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3091) ^ ((c12 + i12) ^ ((c12 << 4) + f3092))));
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4605() {
                        f3090 = (f3089 + 101) % 128;
                        if (!ar.m4771().mo4801(m7276("\ue28e맦ᨣꡠ䁊\ua6fc", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5).intern(), strM7074)) {
                            s.m7248(s.this);
                            f3089 = (f3090 + 121) % 128;
                        }
                        int i10 = f3089 + 13;
                        f3090 = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                    }
                });
                ar.m4771().mo4800(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4605() {
                        ar.m4771().mo4796(s.m7222(s.this));
                    }
                });
                s.m7242(s.this, applicationContext);
                s.m7245(s.this, new af(applicationContext, s.m7237(s.this), s.m7254(s.this), this.f3081 != null, strM7074, new q() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.q
                    public void onEvent(final String str) {
                        t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.3.4

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static short[] f3097 = null;

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static int f3098 = 0;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static byte[] f3099 = {Ascii.FF, -52, -61, 37, -37, -1, -54, -27, -7, Ascii.NAK, -117, 86, -57, -53, Ascii.FS, -61, Ascii.CAN, Ascii.NAK, -52, -61, 37, -69, 0};

                            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                            private static int f3100 = 1;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static int f3101 = -2103921642;

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static int f3102 = 40;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static int f3103 = -1720684892;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static String m7277(int i10, int i11, byte b10, int i12, short s10) {
                                String string;
                                synchronized (o.f3017) {
                                    try {
                                        StringBuilder sb3 = new StringBuilder();
                                        int i13 = f3102;
                                        int i14 = i12 + i13;
                                        int i15 = i14 == -1 ? 1 : 0;
                                        if (i15 != 0) {
                                            byte[] bArr = f3099;
                                            i14 = bArr != null ? (byte) (bArr[f3101 + i10] + i13) : (short) (f3097[f3101 + i10] + i13);
                                        }
                                        if (i14 > 0) {
                                            o.f3018 = ((i10 + i14) - 2) + f3101 + i15;
                                            o.f3019 = b10;
                                            char c10 = (char) (i11 + f3103);
                                            o.f3021 = c10;
                                            sb3.append(c10);
                                            o.f3020 = o.f3021;
                                            o.f3022 = 1;
                                            while (o.f3022 < i14) {
                                                byte[] bArr2 = f3099;
                                                if (bArr2 != null) {
                                                    int i16 = o.f3018;
                                                    o.f3018 = i16 - 1;
                                                    o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                                                } else {
                                                    short[] sArr = f3097;
                                                    int i17 = o.f3018;
                                                    o.f3018 = i17 - 1;
                                                    o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                                                }
                                                sb3.append(o.f3021);
                                                o.f3020 = o.f3021;
                                                o.f3022++;
                                            }
                                        }
                                        string = sb3.toString();
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                return string;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() {
                                f3100 = (f3098 + 25) % 128;
                                s.m7227(s.this).m4914(m7277((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2103921642, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1720684992, (byte) ((Process.myPid() >> 22) - 38), Color.blue(0) - 17, (short) (17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), Collections.singletonList(str));
                                f3100 = (f3098 + 59) % 128;
                            }
                        });
                    }
                }));
                if (!this.f3079.isUserIdSet()) {
                    s.m7237(s.this).m4746();
                    userId = s.m7223(s.this).m4654();
                }
                if (s.this.m7267()) {
                    s.m7223(s.this).m4661(new ag() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.ag
                        public void onEventReceived(JSONObject jSONObject) {
                            in.m6798(s.m7225(s.this), ih.f2531, jSONObject, new Object[0]);
                        }
                    });
                }
                s.m7223(s.this).m4658(new je.d() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.je.d
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo6931() {
                        s.m7248(s.this);
                    }
                });
                s.m7230(s.this, new at(s.m7222(s.this), s.m7223(s.this), strM7074, new bb(), new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.10
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                        s.m7243(s.this, iSAdQualityInitError, str);
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitSuccess() {
                        s.m7220(s.this);
                    }
                }));
                s.m7227(s.this).m4918(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.6
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m7218(s.this) != null) {
                            s.m7218(s.this).adClosed(str, iSAdQualityAdType);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m7218(s.this) != null) {
                            s.m7218(s.this).adDisplayed(str, iSAdQualityAdType);
                        }
                    }
                });
                s.m7256(s.this, new am(s.m7227(s.this)));
                s.m7257(s.this, new an(s.m7223(s.this)));
                String strIntern2 = m7274("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m7274("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000", false, new int[]{152, 33, 128, 0}).intern());
                sb3.append(s.m7254(s.this).m4725());
                k.m7113(strIntern2, sb3.toString());
                s sVar2 = s.this;
                Context context = this.f3081;
                if (context == null) {
                    context = applicationContext;
                }
                s.m7250(sVar2, context, userId);
                s.m7249(s.this, applicationContext);
                s.m7215(s.this);
                s.m7212(s.this);
            } catch (Throwable th2) {
                String strIntern3 = m7274("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{185, 34, 0, 0}).intern();
                kd.m7168(m7274("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern(), strIntern3, th2, true, false, true);
                s.m7243(s.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern3);
            }
        }
    }

    static {
        m7228();
        f3027 = null;
        int i10 = f3023 + 31;
        f3026 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private s() {
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    static /* synthetic */ Set m7210(s sVar) {
        int i10 = f3026;
        f3023 = (i10 + 15) % 128;
        Set<ISAdQualityInitListener> set = sVar.f3032;
        int i11 = i10 + 7;
        f3023 = i11 % 128;
        if (i11 % 2 != 0) {
            return set;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    static /* synthetic */ an m7211(s sVar) {
        int i10 = f3026;
        f3023 = (i10 + 17) % 128;
        an anVar = sVar.f3029;
        int i11 = i10 + 59;
        f3023 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 65 / 0;
        }
        return anVar;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ void m7212(s sVar) {
        f3023 = (f3026 + 57) % 128;
        sVar.m7236(false);
        int i10 = f3026 + 69;
        f3023 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    static /* synthetic */ je m7214(s sVar) {
        int i10 = f3023;
        int i11 = i10 + 23;
        f3026 = i11 % 128;
        int i12 = i11 % 2;
        je jeVar = sVar.f3028;
        if (i12 != 0) {
            int i13 = 58 / 0;
        }
        int i14 = i10 + 43;
        f3026 = i14 % 128;
        if (i14 % 2 == 0) {
            return jeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    static /* synthetic */ void m7215(s sVar) {
        int i10 = f3026 + 77;
        f3023 = i10 % 128;
        sVar.m7252(i10 % 2 != 0);
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ boolean m7217(s sVar) {
        f3026 = (f3023 + 11) % 128;
        boolean zM7216 = sVar.m7216();
        int i10 = f3023 + 71;
        f3026 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM7216;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    static /* synthetic */ ISAdQualityAdListener m7218(s sVar) {
        int i10 = f3023 + 107;
        f3026 = i10 % 128;
        int i11 = i10 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = sVar.f3037;
        if (i11 == 0) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ void m7220(s sVar) {
        int i10 = f3023 + 31;
        f3026 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7219();
        if (i11 != 0) {
            int i12 = 56 / 0;
        }
        int i13 = f3026 + 13;
        f3023 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ iz m7222(s sVar) {
        int i10 = f3023;
        f3026 = (i10 + 121) % 128;
        iz izVar = sVar.f3030;
        int i11 = i10 + 59;
        f3026 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 63 / 0;
        }
        return izVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ af m7223(s sVar) {
        int i10 = f3023;
        f3026 = (i10 + 89) % 128;
        af afVar = sVar.f3036;
        f3026 = (i10 + 125) % 128;
        return afVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    static /* synthetic */ Context m7225(s sVar) {
        int i10 = (f3026 + 39) % 128;
        f3023 = i10;
        Context context = sVar.f3038;
        f3026 = (i10 + 115) % 128;
        return context;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static void m7228() {
        char[] cArr = new char[1654];
        ByteBuffer.wrap("vV<\u0081ãÄ\u0096\u001c]z\u0000k¶°}è \u001e×^\u009ad@\u0083÷Çº=a\u0007\u0014uÚ¡\u0081ë4\u0001ûA®zT¢\u001bèÎ\u000euB8:î®\u0095ïX\u001d\u000fR²|x´/ËÒR\u0099DLjò¬¹\u009el\u001c\u0013QÆd\u008c¾3\u009dæ\u0012\u00adFP6\u0006¦ÍÚpO'Vêl\u0090¸GÞ\nN±`dw*³ÑÓ\u0084\u001bKIþg¤¿k\u0096\u001e-Å/\u0088b>©åÑ¨\b_?\u0002eÈ\u00ad\u007fØ\"\u00040Õz=¥_Ð\u0086\u001bÁFùð3;{f\u0085\u0091òÜÒ\u0006\u0010\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷°BJ\u008dyØk\"ñmÿ¸\u000f\u0003\u0018Nk\u0098·ãë.\u001byVÄt\u000e¸YÓ¤Mïi:C\u0084\u009fÏÒ\u001aNeK°zú°EÑ\u0090\nÛR&}pö»Ê\u0006\u001eQ\u001d\u009c~æ¿1Á|QÇ_\u0012{\\¨\u0000IJ\u009e\u0095Ûà\u0003+evtÀ¯\u000b÷V\u0001¡Aì{6\u009c\u0081ØÌ\"\u0017\u0018bj¬¾÷ôB\u001e\u008d^Øe\"½m÷¸\u0011\u0003]N%\u0098³ãó.\u001ey\\Äg\u000e·YÙ¤MïY:f\u0084¸ÏÍ\u001a\u000be_2Äx\u0013§VÒ\u008e\u0019èDùò\"9zd\u008c\u0093ÌÞö\u0004b³Bþ %ðP®\u009e4Å~p\u008e¿Îêà\u0010=_\u007f\u008a\u008f1Ï|íª\u007fÑ\u007f\u001c\u0084KÀöã<1kI\u0096ÀÝÔ\bë¶7ý\f(\u0081WÓ\u0082¥È=wW¢\u0087éÒ\u0014ñB/\u0089K4\u0099c\u0090®èÔ4\u0003EN\u0085õ\u0093 én;\u0095KÀ\u009a\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷°BJ\u008d~ØW\"\u0090mú¸:\u0003MNd\u0098¾ãö.\u0018y@Ä&\u000e\u0080Yä¤&ï\u001a:p\u0084µÏÒ\u001aNeH°`ú EÖ\u0090\u000bÛS&~p¸»\u008d\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷ÔB9\u008dvØ`\"\u0080më¸\n\u0003TNl\u0098¦ãæ.LyjÄB\u000e\u0098Y\u0080¤\u001aïS:s\u0084¼Ï\u0081\u001a\u0000eN°dú¹E\u0082\u0090\u0000ÛN&)p³»Î\u0006\u0000QI\u009csæ÷1Ñ|\u0002Ç[\u0012y\\ø§Ìò\u0016=\u0011\\Y\u0016¶Éî¼ZwZ*;\u009c½Wï\n\u001bý[°qj´Ýê\u0090\u001aKV>|ðê«ª\u001ePÑL\u0084n~»1Ïä\u0014_[\u0012?Ä«¿är\u0018%\u0004\u0098hRé\u0005Øø\u0012³\u0000fsØ»\u0093×F\u00189\u0001ì}¦½\u0019\u0098Ì\u0010\u0087Kzc,¸çÀZD@p\n§Õâ :k\\6M\u0080\u0096KÎ\u00168áx¬Bv¥Áá\u008c\u001bW/\"Mì\u0088·×\u0002sÍo\u0098Qb\u009a-Âø3Ce\u000eEØË£Õn=9u\u0084KN\u008e\u0019öä#¯mz\u0010\u0000IJ\u009e\u0095Ûà\u0003+evtÀ¯\u000b÷V\u0001¡Aì{6\u009c\u0081ØÌ\"\u0017\u0016bt¬±÷îBJ\u008dYØa\"§mû¸\u0019\u0003\u0018Nl\u0098¼ãö.\u0018yPÄg\u000e¿YÉ¤\u0017ï_:c\u0084ôÏ\u008c\u001aNeU°gúõEÌ\u0090\nÛY&mpö»×\u0006\u001fQ\u001d\u009cyæ¿1Ñ|\u0005ÇZ\u0012d\\¯§Ëò\\k¦!qþ4\u008bì@\u008a\u001d\u009b«@`\u0018=îÊ®\u0087\u0094]\u0000ê §Â|\u0092\tÌÇH\u009c\u0013)öæø³\u0098IV\u0006\u0004Óðh³%\u0085óJ\u0088\u001e#'i¬¶ïÃ\u000f\b^U&ã\u0088(øu>\u0082GÏd\u0015¤¢òï\u001a4HA$\u008f§Ôöa\f®Dûe\u0001¹Në\u009b\u0001\u0000sJ¨\u0095èà\u0011+Qvs\u0000sJ©\u0095ñ`\u001f\u0000tJ½\u0095Åà\u0013+G¡ ëñ4¦AY\u008a\u000b×3cW)Íö\u0084\u0083dH+\u0015V£Ëh\u00895~Â1\u008f\u001aUÖâÑ¯>Z\u008f\u0010uÏ\"ºÂq\u008c,ë\u009awQ9\f×û\u008b¶¼llÛ8\u0096ÄMÜ8\u00adöu\u00ad \u0018Î\u0000EJ¿\u0095èà\b+Fv!À½\u000bþV\u001c¡Aìk6¡\u0081ûÌI\u0017Cbp¬µ÷ïB#\u008dSØ$ÉÆ\u0083)\\q)ÅâÅ¿¤\t(Âv\u009f\u008chÞ%àÿ/H9\u0005\u0099ÞÀ«ãe'>8\u008b\u0086DÖ\u0011¡ëy¤;q§Êî\u0087ÁQ3*Kç\u009c°Ý\rïÇ?\u0090Qm\u0091&\u009fóÑM\u0015\u0006oÓË¬Éyì3#\u008c\u0007Y\u0099\u0012Ñïù¹'rBÏ\u009a\u0098ÏUá/|\u0000YJ¢\u0095ïàG+YvtÀ½\u000bïVH¡\\ìl6¦\u0081èÌ\u0000\u0017Wbo¬¹÷çB\u000f\u008d\u0017ØM\"\u0082mß¸\u000f\u0003iNp\u0098³ãó.\u0005yMÄ\u007f\u000eóYó¤)ïq:'\u0084¶ÏÄ\u001a\beT°zú°E\u0082\u0090\fÛ]&epº»Ê\u0006\u001eQZ\u009c*æð1Ç|\u0019Ç_\u0012e\\¿§Àò'=L\u0088iÒ«\u001dïh\u0017³g\u0000NJ¨\u0095íàG+AvrÀ«\u000béVH¡\\ìf6ï\u0081ÿÌ\b\u0017Xb$¬¤÷½B\b\u008dRØ$\"¿më¸\u0007\u0003TN%\u0098½ãí.Ly\\Äk\u000e£YÔ¤\u0014¾Cô\u0099+Î^.\u0095`È&~èµèè\u001d\u001fVRv\u0088é?Ór+©\u0010Ül\u0012¥I»ü\u00023Dfn\u009c»Ó¶\u0006M½nðo&±]ø\u0090\u0019ÇZz °¸çÇ\u001a\u0000QY\u0084!:¡qÒ¤\u001aÛX\u000e.D§ûË.IeJ\u0098nÎ£\u0005Ö¸VïZ\",X§\u008fÃÂ\u001byQ¬iâþ\u0019ÍL\u001b\u0083W6'l±£ÕÖ\u0019\r*@+ö©-Ò`\u0017\u00975Ê(\u0000\u0094·êêS!0Tf\u008aúÁæt#«\u0004Þr\u0014\u008aKÙþ\u00105.h~\u009e¬ÕÔ\b^¿\u0010òP(\u0092_\u0084\u0000aJ£\u0095ãà\u0013+\\vhÀ \u000büVE¡Lìm6º\u0081±Ì\u001e\u0017Wbm¬¤\u0000EJ\u009f\u0095Èà(+fv Àî\u000bÂV\u0007¡@ì%6½\u0081ùÌI\u0017Cbp¬¹÷óB\r\u008d\u0017Øp\"¹mû¸K\u0003\\N`\u0098´ãþ.\u0019yUÄr\u000eóYÕ¤\u001eï_:u\u0084ôÏè\u001a*e\u001b\u009dñ×2\b\u0015}Ô¶\u008eë¿]b\u0096!Ë\u0097<\u0087q¼«{\u001c&Q\u0096\u008a\u009aÿ©1}j'ß\u0095\u0010\u009cE´¿.ð1%Õ\u009e\u0094Ó©\u0005-~!³\u0093ä\u0093Y·\u0093eÄ\u000e9Çr\u0080§ø\u0019~R\r\u0087Ôø\u0096-÷gCØ9\r\u0090F\u0085»¹í{&\\\u009bÊÌ\u0083\u0001¶{`¬[áÛZ\u0092\u008f±Áu:ZoÙ \u008f\u0015óOO\u0080*õí.ûc\u0083Õp\u000e\u0019CÇ´÷é¥#}\u0094WÉù\u0002Ùw\u009b©-û@±»nö\u001b\fÐ\r\u008dQ;\u0084ðÃ\u00ad\u0015Z}\u0017nÍ·zé7\u0019ì[\u0099cWé\f×¹7ve#=Ù½\u0096ôC\u0017øSµ<c\u0082\u0018ÂÕU\u0082I?lõð¢\u0099\u0000aJ©\u0095ëà8+]voÀ§\u000bïV7¡Wìn6 \u0081þ}\u009e7Tè\u0019\u009d¾V°\u000b\u0093½Jv\u001f+ÖÜ¦\u0000tJ¿\u0095ûà\u0004+QvcÀ¯\u000bøV\u0003¡\u001bìi6¹\u0081²Ì\r\u0017Tb-¬±÷óB\u000b\u008d[Ø}\"¥m÷¸\b\u0003KDë\u000e:Ñm¤\u0092oÀ2ø\u0084{Op\u0012\u0095åÎ¨èr2Åp\u0088ÜS\u009a&úè&³d\u0006\u009eÉÖ\u009cèf )eü\u0080\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìk6¡\u0081èÌ\f\u0017Dbm¬±÷ñBJ\u008dCØa\"¢mê¸K\u0003UNj\u0098¶ãú.Ly\u0014Ä&\u000e\u009aYó¤,ï^:V\u0084¡ÏÀ\u001a\u0002eR°|ú¬E\u0082\u0090<Ûx&Bpö»Ô\u0006\u0011QN\u009c*æ¤1Ì|\u0004ÇJ\u0012o\\·§Òò\u001c=\u0011\u0000MJ¸\u0095éà\u0013+\u0014vrÀ«\u000bïVH¡\\ìl6»\u0081ùÌ\u001b\u0017Xbb¬¼÷½B\u001e\u008dRØw\"¥m¾¸\u0006\u0003WNa\u0098·ã¿.\u000ey\\Ä`\u000e¼YÒ¤\bï\u001a:n\u0084ºÏÈ\u001a\u001aeR°iú¹EË\u0090\u0015ÛU&gp±»\u0082\u00052Oð\u0090\u00adåF.\bs;Åù\u000eæSR¤\bé%3ù\u0084¡ÉN\u0012Kg1©àòºGP\u0088\u000bÝ9'¬h\u008f½y\u0006?K\u0002\u009dÄæ\u009e+f|5Á\u0016\u000bÈ\\²¡pê.?\u0011\u0081Ã\u009cÐÖ:\te|\u009d·Çêó\\x\u0097yÊ\u0091=\u0083pæª<\u001dmP\u0096\u008bÓþá0#kyÞÜ\u0011ÃDó¾3ñ|$\u0098\u009fÜÒê\u0004d\u007f{²\u009fåÌXõ\u0092,Å@8\u009esÞ\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìc6«\u0081¼Ì\u0005\u0017_bp¬¤÷øB\u0004\u008dRØv\"ñm³¸K\u0003qNV\u0098\u0093ãû.=yLÄg\u000e¿YÉ¤\u0019ïC:'\u0084\u0087Ïå\u001a%e\u001b°\u007fú´EÑ\u0090OÛO&ap£»×\u0006\u0014QR\u009c}æ¹1\u008a\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u0006¡Qì\"6¬\u0081éÌ\u001a\u0017Bbl¬½÷½B\u0007\u008dRØ`\"¸mÿ¸\u001f\u0003QNj\u0098¼ã¿.\u001ey\\Äp\u000e¶YÎ¤\u0018ï_:'\u0084ùÏ\u0081\u001a'eh°Iú±Eó\u0090\u001aÛ]&ep¿»×\u0006\tQ\u001d\u009cYæ\u00931ï|QÇI\u0012j\\«§\u0085ò\u0001=W\u0088yÒ\u00ad\u001dÂh\u001c³7þcHô\u008e\u0003Äì\u001b´n\u0000¥\u0000øaNý\u0085¾ØF/\u0011bb¸ì\u000f©BZ\u0099\u0002ì,\"ýyýÌG\u0003\u0012V ¬øã¿6_\u008d\u0011À*\u0016ümÿ ^÷\u001cJ0\u0080ö×\u008e*Xa\u001f´g\n¹AÁ\u0094gë(>\ttñË³\u001eZU\u001d¨%þÿ5\u0097\u0088Iß]\u0012\u0019hÓ¿¯ò\u0011I\u0017\u009c8Ò¸)\u008b|]³\u000b\u0006l\\ð\u0093\u0088æZ=tp$Æû\u001d\u008bP]§{ú+0ÿ\u0087Æ\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìq6ª\u0081ûÌ\u0004\u0017Sbm¬¤÷½BG\u008d\u0017ØM\"\u0082mß¸\u000f\u0003iNp\u0098³ãó.\u0005yMÄ\u007f\u000eóYó¤)ïq:'\u0084£ÏÀ\u001a\u001de\u001b°{ú½E×\u0090\u001bÛX&fp¡»Í\u0006^Z\u0080\u0010oÏ7º\u0083q\u0083,â\u009a~Q=\fßûÖ¶¢lcÛ1\u0096ÌM\u009c8§ö3\u00ads\u0018\u0089×½\u0082\u0094xS79âùY\u008e\u0014§Â}¹5tÛ#\u0083\u009eåTC\u0003'þåµÙ`³Þv\u0095\u0011@\u008d?\u008bê£ c\u001f\u0015ÊÈ\u0081\u0090|½*{áN\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìa6 \u0081òÌ\u000f\u0017_bd¬ð÷°BJ\u008d~ØW\"\u0090mú¸:\u0003MNd\u0098¾ãö.\u0018y@Ä&\u000e\u0080Yä¤&ï\u001a:n\u0084§Ï\u0081\u001a\u000feW°zú°EÃ\u0090\u000bÛE&)p¿»Í\u0006\u0019QI\u009ccæ¶1È|\u0018ÇD\u0012n\\¼§\u008bÆ·\u008ctS*&Öí\u0098°º\u0006OÍ5\u0090Äg\u008e*\u0083ðxG,\nÞÑ\u009c¤\u0082jm1,\u0084ÚK\u008f\u001e³äh".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1654);
        f3025 = cArr;
        f3024 = 7154453121027623629L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Context m7229(s sVar, Context context) {
        int i10 = f3026 + 71;
        f3023 = i10 % 128;
        int i11 = i10 % 2;
        sVar.f3038 = context;
        if (i11 != 0) {
            return context;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ao m7237(s sVar) {
        f3023 = (f3026 + 87) % 128;
        ao aoVarM7224 = sVar.m7224();
        f3023 = (f3026 + 111) % 128;
        return aoVarM7224;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ af m7245(s sVar, af afVar) {
        int i10 = f3026;
        f3023 = (i10 + 77) % 128;
        sVar.f3036 = afVar;
        int i11 = i10 + 77;
        f3023 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 63 / 0;
        }
        return afVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ al m7254(s sVar) {
        int i10 = f3026;
        int i11 = i10 + 109;
        f3023 = i11 % 128;
        int i12 = i11 % 2;
        al alVar = sVar.f3035;
        if (i12 == 0) {
            int i13 = 5 / 0;
        }
        int i14 = i10 + 77;
        f3023 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 41 / 0;
        }
        return alVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ am m7256(s sVar, am amVar) {
        int i10 = f3026 + 3;
        f3023 = i10 % 128;
        int i11 = i10 % 2;
        sVar.f3031 = amVar;
        if (i11 != 0) {
            return amVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        String str2;
        try {
            if (!m7253(str)) {
                return;
            }
            boolean zEquals = str.equals(m7224().m4755());
            boolean z10 = !zEquals;
            boolean zMo6969 = jj.m6964().mo6969();
            if (!zEquals && zMo6969) {
                this.f3036.m4655();
                f3023 = (f3026 + 33) % 128;
            }
            str2 = str;
            try {
                m7241(this.f3038, str2, z10, true, zMo6969);
                f3023 = (f3026 + 39) % 128;
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            str2 = str;
        }
        String strIntern = m7258((char) (12436 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m7258((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 599 - ExpandableListView.getPackedPositionChild(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20).intern());
        sb2.append(str2);
        kd.m7168(strIntern, sb2.toString(), e, true, false, true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        f3023 = (f3026 + 43) % 128;
        initialize(context, str, null);
        f3023 = (f3026 + 29) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        f3023 = (f3026 + 103) % 128;
        if (m7266()) {
            f3023 = (f3026 + 53) % 128;
            k.m7102(m7258((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12436), View.MeasureSpec.getMode(0) + 74, 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m7258((char) TextUtils.getCapsMode("", 0, 0), 1337 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 67).intern());
        } else if (!m7216()) {
            k.m7102(m7258((char) (12435 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "", 0, 0) + 74, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m7258((char) (36416 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1404 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 73).intern());
        } else {
            this.f3031.m4739(iSAdQualityCustomMediationRevenue);
            f3023 = (f3026 + 57) % 128;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f3026 + 87;
        f3023 = i10 % 128;
        if (i10 % 2 == 0) {
            m7266();
            throw null;
        }
        if (!m7266()) {
            this.f3037 = iSAdQualityAdListener;
        } else {
            k.m7102(m7258((char) (12484 - AndroidCharacter.getMirror('0')), 74 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myPid() >> 22) + 12).intern(), m7258((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1285, TextUtils.getCapsMode("", 0, 0) + 53).intern());
            f3023 = (f3026 + 95) % 128;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        f3026 = (f3023 + 95) % 128;
        if (!(!m7266())) {
            f3023 = (f3026 + 71) % 128;
            k.m7102(m7258((char) (KeyEvent.keyCodeFromString("") + 12436), 74 - View.MeasureSpec.getMode(0), 12 - TextUtils.indexOf("", "")).intern(), m7258((char) (TextUtils.lastIndexOf("", '0', 0) + 23236), 1526 - View.getDefaultSize(0, 0), 48 - (Process.myTid() >> 22)).intern());
        } else {
            if (!(!m7213())) {
                k.m7102(m7258((char) (12436 - KeyEvent.keyCodeFromString("")), 74 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 13).intern(), m7258((char) Color.red(0), 1573 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 58).intern());
                return;
            }
            this.f3043 = iSAdQualityConfig;
            int i10 = f3026 + 21;
            f3023 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 22 / 0;
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        f3026 = (f3023 + 73) % 128;
        if (m7266()) {
            f3026 = (f3023 + 55) % 128;
            k.m7102(m7258((char) (12436 - TextUtils.indexOf("", "")), TextUtils.indexOf("", "", 0) + 74, Gravity.getAbsoluteGravity(0, 0) + 12).intern(), m7258((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1476, (ViewConfiguration.getTouchSlop() >> 8) + 49).intern());
            return;
        }
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.4

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f3072 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static long f3073 = -1054491529785472550L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f3074;

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (!s.m7217(s.this)) {
                    f3072 = (f3074 + 109) % 128;
                    k.m7102(m7273("覛쥥࠽䬾諗췱\u0c91䱓轻츺Đ䃸", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16602).intern(), m7273("覙琌狚烘署絩篣禾搖投悏潢洩毼榽名勞僝弩嵯察妊䐡䋏䂣佰䴭䯻䦷㐕㋑ビ㽩㴉㯟㧿␏⋚⃐⽕ⴭ⯡⧼ᐎዀ႘ὌᴪᯫᦱЍ˕\u0093ཝ൮", 64951 - TextUtils.getOffsetBefore("", 0)).intern());
                } else {
                    if (s.m7211(s.this) != null) {
                        s.m7211(s.this).m4744(iSAdQualitySegment);
                    }
                    f3072 = (f3074 + 49) % 128;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m7273(String str, int i10) {
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
                                cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f3073);
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
        });
        int i10 = f3026 + 119;
        f3023 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z10) {
        int i10 = f3023 + 75;
        f3026 = i10 % 128;
        if (i10 % 2 == 0) {
            m7224().m4760(z10);
        } else {
            m7224().m4760(z10);
            int i11 = 87 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        f3023 = (f3026 + 123) % 128;
        m7262(false);
        f3026 = (f3023 + 73) % 128;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m7213() {
        int i10 = f3023 + 9;
        f3026 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return this.f3044;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m7216() {
        boolean z10;
        int i10 = f3023;
        z10 = this.f3045;
        int i11 = i10 + 35;
        f3026 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m7219() {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                for (ISAdQualityInitListener iSAdQualityInitListener : s.m7210(s.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                s.m7210(s.this).clear();
            }
        });
        int i10 = f3026 + 85;
        f3023 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized boolean m7221() {
        boolean z10;
        int i10 = (f3023 + 73) % 128;
        f3026 = i10;
        z10 = this.f3042;
        f3023 = (i10 + 121) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized ao m7224() {
        ao aoVar;
        try {
            int i10 = f3026 + 61;
            f3023 = i10 % 128;
            if (i10 % 2 == 0) {
                aoVar = this.f3046;
                int i11 = 5 / 0;
            } else {
                aoVar = this.f3046;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aoVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject m7226() {
        int i10 = f3023 + 21;
        f3026 = i10 % 128;
        if (i10 % 2 != 0) {
            m7224().m4748();
            throw null;
        }
        Map<String, String> mapM4748 = m7224().m4748();
        if (mapM4748 != null && mapM4748.containsKey(m7258((char) ((Process.getThreadPriority(0) + 20) >> 6), 1032 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0, 0) + 13).intern())) {
            try {
                return new JSONObject(mapM4748.get(m7258((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1031, 12 - TextUtils.lastIndexOf("", '0', 0)).intern()));
            } catch (JSONException unused) {
            }
        }
        int i11 = f3023 + 69;
        f3026 = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ at m7227(s sVar) {
        int i10 = f3026;
        int i11 = i10 + 85;
        f3023 = i11 % 128;
        int i12 = i11 % 2;
        at atVar = sVar.f3034;
        if (i12 == 0) {
            throw null;
        }
        f3023 = (i10 + 61) % 128;
        return atVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ at m7230(s sVar, at atVar) {
        int i10 = f3026;
        f3023 = (i10 + 63) % 128;
        sVar.f3034 = atVar;
        int i11 = i10 + 111;
        f3023 = i11 % 128;
        if (i11 % 2 != 0) {
            return atVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ je m7238(s sVar, je jeVar) {
        int i10 = f3023 + 91;
        f3026 = i10 % 128;
        int i11 = i10 % 2;
        sVar.f3028 = jeVar;
        if (i11 == 0) {
            return jeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ iw m7246(s sVar, iw iwVar) {
        int i10 = f3026;
        f3023 = (i10 + 101) % 128;
        sVar.f3033 = iwVar;
        f3023 = (i10 + 21) % 128;
        return iwVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m7255(boolean z10) {
        try {
            int i10 = f3023 + 25;
            int i11 = i10 % 128;
            f3026 = i11;
            if (i10 % 2 != 0) {
                this.f3042 = z10;
                throw null;
            }
            this.f3042 = z10;
            int i12 = i11 + 97;
            f3023 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ an m7257(s sVar, an anVar) {
        int i10 = f3026;
        f3023 = (i10 + 55) % 128;
        sVar.f3029 = anVar;
        int i11 = i10 + 39;
        f3023 = i11 % 128;
        if (i11 % 2 != 0) {
            return anVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = (f3023 + 45) % 128;
        f3026 = i10;
        if (context instanceof Application) {
            int i11 = i10 + 35;
            f3023 = i11 % 128;
            if (i11 % 2 != 0) {
                m7260((Application) context, str, iSAdQualityConfig);
                return;
            } else {
                m7260((Application) context, str, iSAdQualityConfig);
                int i12 = 68 / 0;
                return;
            }
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m7260((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        if (!(context instanceof Activity)) {
            String strIntern = m7258((char) (30239 - Drawable.resolveOpacity(0, 0)), ViewConfiguration.getTouchSlop() >> 8, (ViewConfiguration.getJumpTapTimeout() >> 16) + 74).intern();
            k.m7102(m7258((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12436), 73 - ExpandableListView.getPackedPositionChild(0L), (KeyEvent.getMaxKeyCode() >> 16) + 12).intern(), strIntern);
            m7251(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
            f3026 = (f3023 + 121) % 128;
            return;
        }
        int i13 = f3026 + 119;
        f3023 = i13 % 128;
        if (i13 % 2 != 0) {
            m7247((Activity) context, str, iSAdQualityConfig);
        } else {
            m7247((Activity) context, str, iSAdQualityConfig);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized at m7265() {
        at atVar;
        int i10 = (f3023 + 53) % 128;
        f3026 = i10;
        atVar = this.f3034;
        f3023 = (i10 + 103) % 128;
        return atVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ iw m7231(s sVar) {
        int i10 = f3023;
        f3026 = (i10 + 81) % 128;
        iw iwVar = sVar.f3033;
        int i11 = i10 + 51;
        f3026 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 72 / 0;
        }
        return iwVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m7242(s sVar, Context context) {
        int i10 = f3026 + 101;
        f3023 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m7233(context);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f3023 + 95;
        f3026 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 23 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7248(s sVar) {
        f3023 = (f3026 + 73) % 128;
        sVar.m7262(true);
        int i10 = f3023 + 77;
        f3026 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 34 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m7264(s sVar) {
        f3026 = (f3023 + 57) % 128;
        boolean zM7221 = sVar.m7221();
        f3023 = (f3026 + 9) % 128;
        return zM7221;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized ISAdQualityLogLevel m7268() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        try {
            int i10 = f3023 + 117;
            f3026 = i10 % 128;
            if (i10 % 2 != 0) {
                iSAdQualityLogLevel = this.f3039;
                int i11 = 82 / 0;
            } else {
                iSAdQualityLogLevel = this.f3039;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ iz m7232(s sVar, iz izVar) {
        int i10 = f3023 + 95;
        int i11 = i10 % 128;
        f3026 = i11;
        int i12 = i10 % 2;
        sVar.f3030 = izVar;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i11 + 59;
        f3023 = i13 % 128;
        if (i13 % 2 != 0) {
            return izVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m7243(s sVar, ISAdQualityInitError iSAdQualityInitError, String str) {
        f3023 = (f3026 + 101) % 128;
        sVar.m7261(iSAdQualityInitError, str);
        int i10 = f3026 + 23;
        f3023 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7249(s sVar, Context context) {
        f3026 = (f3023 + 99) % 128;
        sVar.m7240(context);
        f3026 = (f3023 + 43) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m7260(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f3026 + 79;
        f3023 = i10 % 128;
        int i11 = i10 % 2;
        m7259(application, null, str, iSAdQualityConfig);
        if (i11 == 0) {
            int i12 = 75 / 0;
        }
        int i13 = f3026 + 89;
        f3023 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m7235(s sVar, boolean z10) {
        f3023 = (f3026 + 37) % 128;
        sVar.m7255(z10);
        int i10 = f3023 + 3;
        f3026 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m7244(s sVar, ISAdQualityLogLevel iSAdQualityLogLevel) {
        f3026 = (f3023 + 117) % 128;
        sVar.m7234(iSAdQualityLogLevel);
        f3023 = (f3026 + 25) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7250(s sVar, Context context, String str) {
        f3026 = (f3023 + 31) % 128;
        sVar.m7241(context, str, true, false, true);
        f3026 = (f3023 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m7259(Application application, Activity activity, String str, @Nullable ISAdQualityConfig iSAdQualityConfig) {
        String strIntern = m7258((char) ((ViewConfiguration.getTapTimeout() >> 16) + 12436), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, (ViewConfiguration.getScrollBarSize() >> 8) + 12).intern();
        if (iSAdQualityConfig == null) {
            iSAdQualityConfig = new ISAdQualityConfig.Builder().build();
        }
        if (bc.m5083().isEmpty()) {
            String strIntern2 = m7258((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 86, ((byte) KeyEvent.getModifierMetaStateMask()) + 58).intern();
            k.m7113(strIntern, strIntern2);
            m7251(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.NO_AD_NETWORKS, strIntern2);
            return;
        }
        if (!m7263(iSAdQualityConfig)) {
            f3023 = (f3026 + 15) % 128;
            iSAdQualityConfig = ISAdQualityConfig.merge(this.f3043, iSAdQualityConfig);
        }
        ISAdQualityConfig iSAdQualityConfig2 = iSAdQualityConfig;
        if (m7213()) {
            String strIntern3 = m7258((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 143 - Gravity.getAbsoluteGravity(0, 0), 40 - TextUtils.getOffsetBefore("", 0)).intern();
            k.m7113(strIntern, strIntern3);
            m7251(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern3);
            return;
        }
        if (m7216()) {
            String strIntern4 = m7258((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12940), (Process.myPid() >> 22) + 183, 'k' - AndroidCharacter.getMirror('0')).intern();
            k.m7113(strIntern, strIntern4);
            m7251(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern4);
            return;
        }
        if (m7266()) {
            String strIntern5 = m7258((char) Color.argb(0, 0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 242, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48).intern();
            k.m7102(strIntern, strIntern5);
            m7251(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern5);
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfig2.getUserId()) && iSAdQualityConfig2.isUserIdSet()) {
            f3023 = (f3026 + 65) % 128;
            String strIntern6 = m7258((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 290, 60 - TextUtils.indexOf("", "")).intern();
            k.m7102(strIntern, strIntern6);
            m7251(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, strIntern6);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            f3026 = (f3023 + 45) % 128;
            String strIntern7 = m7258((char) (TextUtils.getCapsMode("", 0, 0) + 23578), 350 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 48 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
            k.m7102(strIntern, strIntern7);
            m7251(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern7);
            int i10 = f3023 + 67;
            f3026 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 84 / 0;
                return;
            }
            return;
        }
        this.f3032.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
        m7236(true);
        jj.m6964().mo6970(application, activity);
        jd.m6903().m6912();
        jf.m6944().m6950();
        t.m7283(new AnonymousClass5(iSAdQualityConfig2, str, application, activity));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static s m7239() {
        synchronized (s.class) {
            try {
                if (f3027 == null) {
                    f3027 = new s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3027;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7247(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        f3026 = (f3023 + 17) % 128;
        m7259(activity.getApplication(), activity, str, iSAdQualityConfig);
        f3023 = (f3026 + 51) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m7266() {
        boolean z10;
        try {
            int i10 = f3023 + 89;
            f3026 = i10 % 128;
            if (i10 % 2 != 0) {
                z10 = this.f3041;
                int i11 = 80 / 0;
            } else {
                z10 = this.f3041;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m7233(Context context) {
        f3023 = (f3026 + 43) % 128;
        String strM6925 = this.f3028.m6925(m7258((char) (32247 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getTapTimeout() >> 16) + IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES, TextUtils.lastIndexOf("", '0', 0, 0) + 11).intern());
        if (!TextUtils.isEmpty(strM6925)) {
            new je(context, m7258((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25).intern(), m7258((char) (17560 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 1080, 23 - ImageFormat.getBitsPerPixel(0)).intern()).m6926(m7258((char) (32247 - TextUtils.indexOf("", "")), 1045 - Gravity.getAbsoluteGravity(0, 0), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), strM6925);
            this.f3028.m6922(m7258((char) (Gravity.getAbsoluteGravity(0, 0) + 32247), 1045 - (ViewConfiguration.getLongPressTimeout() >> 16), 10 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        }
        int i10 = f3026 + 121;
        f3023 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m7253(String str) {
        if (m7266()) {
            k.m7102(m7258((char) (KeyEvent.keyCodeFromString("") + 12436), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 74, 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m7258((char) (TextUtils.getOffsetAfter("", 0) + 51589), 621 - (ViewConfiguration.getScrollBarSize() >> 8), 52 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
            f3026 = (f3023 + 53) % 128;
            return false;
        }
        if (!m7216()) {
            k.m7102(m7258((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12436), 74 - (KeyEvent.getMaxKeyCode() >> 16), 11 - ImageFormat.getBitsPerPixel(0)).intern(), m7258((char) KeyEvent.keyCodeFromString(""), 672 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.getOffsetBefore("", 0) + 65).intern());
            int i10 = f3023 + 83;
            f3026 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 40 / 0;
            }
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        k.m7102(m7258((char) (12436 - Color.green(0)), MotionEvent.axisFromString("") + 75, 12 - View.combineMeasuredStates(0, 0)).intern(), m7258((char) (Process.myPid() >> 22), 737 - TextUtils.lastIndexOf("", '0', 0), 33 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m7241(Context context, String str, boolean z10, boolean z11, boolean z12) {
        String strM4755 = m7224().m4755();
        m7224().m4750(str);
        if (str != null) {
            if (str.equals(m7258((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 866, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17).intern())) {
                String strIntern = m7258((char) (12436 - (ViewConfiguration.getScrollBarSize() >> 8)), 74 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 12).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7258((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 882, 40 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                sb2.append(str);
                sb2.append(m7258((char) (KeyEvent.normalizeMetaState(0) + 40415), KeyEvent.getDeadChar(0, 0) + 922, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 76).intern());
                k.m7102(strIntern, sb2.toString());
            } else {
                String strIntern2 = m7258((char) (12436 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 74, 12 - ExpandableListView.getPackedPositionType(0L)).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m7258((char) (KeyEvent.normalizeMetaState(0) + 64281), 999 - (ViewConfiguration.getPressedStateDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 33).intern());
                sb3.append(str);
                k.m7109(strIntern2, sb3.toString());
                f3026 = (f3023 + 39) % 128;
            }
        } else {
            f3026 = (f3023 + 117) % 128;
            k.m7102(m7258((char) (TextUtils.indexOf("", "", 0, 0) + 12436), 73 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getTouchSlop() >> 8) + 12).intern(), m7258((char) (48646 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 772, TextUtils.getCapsMode("", 0, 0) + 93).intern());
        }
        ar.m4771().mo4795(new AnonymousClass1(z10, context, z11, strM4755, z12));
        JSONObject jSONObjectM7226 = m7226();
        if (jSONObjectM7226 != null) {
            f3026 = (f3023 + 67) % 128;
            ar.m4771().mo4803(jSONObjectM7226);
        } else {
            ar.m4771().mo4794(context, m7224(), true);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m7234(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f3023 + 91;
        f3026 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f3039 = iSAdQualityLogLevel;
            throw null;
        }
        this.f3039 = iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m7236(boolean z10) {
        try {
            int i10 = f3023 + 35;
            f3026 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f3044 = z10;
                int i11 = 2 / 0;
            } else {
                this.f3044 = z10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m7267() {
        boolean z10;
        int i10 = f3023;
        int i11 = i10 + 45;
        f3026 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        z10 = this.f3040;
        int i12 = i10 + 37;
        f3026 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m7252(boolean z10) {
        int i10 = f3023 + 31;
        f3026 = i10 % 128;
        int i11 = i10 % 2;
        this.f3045 = true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7251(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
        int i10 = f3023 + 55;
        f3026 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 44 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m7240(Context context) {
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.s.3
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    jw.m7051(intent);
                }
            }, new IntentFilter(m7258((char) (1363 - (Process.myPid() >> 22)), 1212 - (ViewConfiguration.getScrollBarSize() >> 8), 38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()), null, t.m7278());
            f3023 = (f3026 + 17) % 128;
        } catch (Throwable th2) {
            k.m7104(m7258((char) (12435 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 74, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m7258((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 40086), 1249 - (ViewConfiguration.getTouchSlop() >> 8), 34 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), th2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:18|(1:20)|21|(2:23|(10:25|30|45|31|32|(1:34)|35|36|37|38)(1:26))(1:28)|27|30|45|31|32|(0)|35|36|37|38) */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e2 A[Catch: all -> 0x0055, Exception -> 0x0059, TryCatch #2 {Exception -> 0x0059, blocks: (B:4:0x0006, B:6:0x000c, B:13:0x005e, B:15:0x0064, B:18:0x00ab, B:20:0x00cf, B:21:0x00ff, B:25:0x0112, B:31:0x016f, B:32:0x0191, B:34:0x01e2, B:35:0x0213, B:26:0x0134, B:27:0x014d, B:28:0x0152), top: B:47:0x0006, outer: #1 }] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void m7262(boolean r12) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.s.m7262(boolean):void");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m7269() {
        int i10 = f3026 + 27;
        f3023 = i10 % 128;
        if (i10 % 2 != 0) {
            if (!(!m7266())) {
                k.m7102(m7258((char) (12436 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 74, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m7258((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.blue(0) + 1104, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60).intern());
                return;
            } else {
                if (!m7216()) {
                    this.f3040 = true;
                    return;
                }
                f3026 = (f3023 + 117) % 128;
                k.m7102(m7258((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12436), 74 - View.getDefaultSize(0, 0), 12 - (Process.myPid() >> 22)).intern(), m7258((char) (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + e.a.f43919j, 49 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
                f3023 = (f3026 + 5) % 128;
                return;
            }
        }
        m7266();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m7261(ISAdQualityInitError iSAdQualityInitError, String str) {
        f3023 = (f3026 + 61) % 128;
        m7251(this.f3032, iSAdQualityInitError, str);
        f3026 = (f3023 + 125) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m7263(ISAdQualityConfig iSAdQualityConfig) {
        if (this.f3043 == null) {
            int i10 = f3023 + 39;
            f3026 = i10 % 128;
            return i10 % 2 == 0;
        }
        try {
            String str = iSAdQualityConfig.getMetaData().get(m7258((char) (Process.getGidForName("") + 1), 1032 - TextUtils.getOffsetBefore("", 0), 13 - KeyEvent.getDeadChar(0, 0)).intern());
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str).optBoolean(m7258((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 50909), TextUtils.indexOf("", "") + 1632, 22 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
            }
            f3026 = (f3023 + 45) % 128;
        } catch (Throwable unused) {
        }
        f3023 = (f3026 + 115) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m7258(char c10, int i10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f3025[i10 + i12]) ^ (((long) i12) * f3024)) ^ ((long) c10));
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
}
