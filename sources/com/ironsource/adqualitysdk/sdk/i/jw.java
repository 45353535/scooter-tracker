package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class jw {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2934 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2935;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f2936;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f2937;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2938;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject f2939;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2940;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject f2941;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2942;

    static {
        m7047();
        f2939 = null;
        f2935 = (f2934 + 121) % 128;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static synchronized JSONObject m7041() {
        JSONObject jSONObject;
        try {
            f2935 = (f2934 + 11) % 128;
            if (f2939 == null) {
                JSONObject jSONObject2 = new JSONObject();
                f2939 = jSONObject2;
                try {
                    jSONObject2.put(m7059("\ue73b\ue74c赚\ue9a9㾮", ViewConfiguration.getScrollDefaultDelay() >> 16).intern(), -1);
                    f2939.put(m7053(null, Color.alpha(0) + 127, null, "\u0081").intern(), -1);
                    f2934 = (f2935 + 93) % 128;
                } catch (JSONException unused) {
                }
            }
            jSONObject = f2939;
            f2934 = (f2935 + 13) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static synchronized JSONObject m7042() {
        JSONObject jSONObject;
        int i10 = f2935;
        jSONObject = f2941;
        f2934 = (i10 + 75) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static JSONObject m7043() {
        int i10 = f2934 + 115;
        f2935 = i10 % 128;
        if (i10 % 2 != 0) {
            jz.m7082(m7042());
            throw null;
        }
        JSONObject jSONObjectM7082 = jz.m7082(m7042());
        int i11 = f2935 + 13;
        f2934 = i11 % 128;
        if (i11 % 2 != 0) {
            return jSONObjectM7082;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m7044() {
        String str = Build.VERSION.RELEASE;
        int i10 = f2934;
        int i11 = i10 + 39;
        f2935 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 + 45;
        f2935 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static void m7047() {
        f2938 = -3258111641122125134L;
        f2937 = true;
        f2936 = true;
        f2940 = 251;
        f2942 = new char[]{355, 370, 356, 361, 351, 362, 319, 352, 369, 350, 336, 367, 359, 366, 320, 365, 283, 354, 328, 353, 360, 348, 363, 372, 371, 368, 309, 358, 349, 357};
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m7054() {
        f2934 = (f2935 + 29) % 128;
        JSONObject jSONObjectM7082 = jz.m7082(m7041());
        int i10 = f2934 + 87;
        f2935 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 7 / 0;
        }
        return jSONObjectM7082;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m7062(int i10, int i11) {
        int i12 = f2935 + 59;
        int i13 = i12 % 128;
        f2934 = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        f2935 = (i13 + 59) % 128;
        if (i10 > m7063()) {
            return false;
        }
        int i14 = f2935 + 97;
        f2934 = i14 % 128;
        if (i14 % 2 == 0) {
            m7058();
            throw null;
        }
        if (i11 > m7058()) {
            return false;
        }
        f2934 = (f2935 + 59) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int m7063() {
        JSONObject jSONObjectM7054;
        int iMyPid;
        int i10 = f2934 + 115;
        f2935 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM7054 = m7054();
            iMyPid = Process.myPid() % 120;
        } else {
            jSONObjectM7054 = m7054();
            iMyPid = Process.myPid() >> 22;
        }
        return jSONObjectM7054.optInt(m7059("\ue73b\ue74c赚\ue9a9㾮", iMyPid).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7045(android.app.Application r2) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.jw.f2935
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jw.f2934 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L13
            r0 = 41
            int r0 = r0 / 0
            if (r2 == 0) goto L1c
            goto L15
        L13:
            if (r2 == 0) goto L1c
        L15:
            android.content.Context r2 = r2.getApplicationContext()
            m7055(r2)
        L1c:
            int r2 = com.ironsource.adqualitysdk.sdk.i.jw.f2935
            int r2 = r2 + 95
            int r0 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.jw.f2934 = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L29
            return
        L29:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jw.m7045(android.app.Application):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7052(JSONObject jSONObject) {
        int i10 = f2934 + 9;
        f2935 = i10 % 128;
        try {
            jSONObject.put(i10 % 2 != 0 ? m7059("钴铇佔\uefd1薏竏托ȫ", ViewConfiguration.getPressedStateDuration() * 24).intern() : m7059("钴铇佔\uefd1薏竏托ȫ", ViewConfiguration.getPressedStateDuration() >> 16).intern(), m7054());
            int i11 = f2934 + 47;
            f2935 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 46 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000d, B:28:0x00a1, B:35:0x00bf, B:9:0x001a, B:16:0x0054, B:25:0x0072, B:26:0x009b, B:30:0x00ad, B:31:0x00b5, B:32:0x00bc, B:14:0x003a, B:19:0x005a, B:21:0x0064), top: B:45:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void m7055(android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jw.m7055(android.content.Context):void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m7058() {
        JSONObject jSONObjectM7054;
        int threadPriority;
        int i10 = f2934 + 79;
        f2935 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM7054 = m7054();
            threadPriority = 99 >>> ((Process.getThreadPriority(0) >> 89) * 25);
        } else {
            jSONObjectM7054 = m7054();
            threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 127;
        }
        int iOptInt = jSONObjectM7054.optInt(m7053(null, threadPriority, null, "\u0081").intern());
        f2935 = (f2934 + 17) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static synchronized void m7046(JSONObject jSONObject) {
        try {
            int i10 = f2934 + 47;
            f2935 = i10 % 128;
            if (i10 % 2 != 0) {
                f2941 = jSONObject;
                int i11 = 93 / 0;
            } else {
                f2941 = jSONObject;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized void m7049(Activity activity) {
        int i10 = (f2935 + 89) % 128;
        f2934 = i10;
        if (activity != null) {
            f2935 = (i10 + 55) % 128;
            m7055(activity.getApplicationContext());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m7048(int i10, int i11) {
        int i12 = f2935;
        int i13 = i12 + 39;
        f2934 = i13 % 128;
        try {
            if (i13 % 2 == 0) {
                throw null;
            }
            if (i10 > 0) {
                int i14 = i12 + 61;
                f2934 = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                if (i11 > 0) {
                    f2934 = (i12 + 25) % 128;
                    JSONObject jSONObjectM7041 = m7041();
                    jSONObjectM7041.put(m7059("\ue73b\ue74c赚\ue9a9㾮", ViewConfiguration.getLongPressTimeout() >> 16).intern(), i11);
                    jSONObjectM7041.put(m7053(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u0081").intern(), i10);
                }
            }
        } catch (Throwable th2) {
            k.m7118(m7053(null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m7059("\ue456\ue413躅ⶉ䑅뢟㫶媏컬篟\uedd6끍놲꺳윔輾摩얯㡆\udafb伄גּ浨ㆮ㆞\u2e6c䚬ི\ue483", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m7064(Context context, JSONObject jSONObject) {
        f2935 = (f2934 + 35) % 128;
        try {
            if (jy.m7077(context, m7059("꾽꿜\ue700\ue9dbⷜ糛롿\ud81b蔚ሓ⦓㊏艹윧͝ප⾌걹ﰔ塸Ӳ銼ꥱ댈稖䟙苒跒꽞ⰽ羘\ud8f0蒃ᅣ⥘㎢囹잳ȫ\u0e6c", ViewConfiguration.getPressedStateDuration() >> 16).intern())) {
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(m7059("䛀䚷\uf7df墱㴄춳㏂厽", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())).getConnectionInfo();
                jSONObject.put(m7059("쇏솸룎怴爚\uf523퀇끥", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1).intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    jSONObject.put(m7059("摭搚뗛轇缏ᩑ蔰\ue555", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), connectionInfo.getRssi());
                    jSONObject.put(m7059("\u0efbຌﳄ䲛㘐\ud98c䔇╡", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), connectionInfo.getLinkSpeed());
                }
            }
            int i10 = f2934 + 63;
            f2935 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            k.m7118(m7053(null, 127 - View.combineMeasuredStates(0, 0), null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m7059("⯳⮶ᨣ쫧탣忱套㤮ŉ\uef79પ폭縇㨈⁽\uec96ꮋ兞\udf32륟肺濑訊刏ﹽ뫖ꆋ泝⬬텡岖㧧î\uec67\u0a4f", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m7060(DisplayMetrics displayMetrics) {
        int i10 = f2934 + 23;
        f2935 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (displayMetrics != null) {
            m7048(displayMetrics.heightPixels, displayMetrics.widthPixels);
            f2934 = (f2935 + 85) % 128;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m7061(JSONObject jSONObject) {
        f2935 = (f2934 + 5) % 128;
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(m7053(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0097\u008e\u0082\u0084").intern(), Math.round((totalRxBytes2 - totalRxBytes) * (1000.0f / (jCurrentTimeMillis2 - jCurrentTimeMillis))));
                jSONObject.put(m7053(null, 127 - View.resolveSize(0, 0), null, "\u0099\u0090\u0082\u0084").intern(), totalRxBytes2);
                f2934 = (f2935 + 95) % 128;
            }
        } catch (Throwable th2) {
            k.m7118(m7053(null, View.MeasureSpec.getMode(0) + 127, null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m7053(null, 127 - Color.green(0), null, "\u0088\u0092\u0096\u008e\u009a\u0091\u009c\u0090\u0086\u0082\u008c\u0088\u0084\u0091\u0085\u0084\u0096\u0091\u009a\u0097\u008a\u0091\u0092\u0084\u0083\u008c\u008c\u0088\u0092\u0091\u0090\u0086\u0090\u0090\u008f").intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7050(Context context, JSONObject jSONObject) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m7053(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, "\u0098\u008c\u0083\u0089\u0083\u008c\u008a\u0096").intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m7059("环珂瑗\uf6ee뺈揫䍰⌐", View.MeasureSpec.getMode(0)).intern(), memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            jSONObject.put(m7059("㒫㓆胥ⷿ䨺룯쩧ꨙ", ViewConfiguration.getJumpTapTimeout() >> 16).intern(), memoryInfo.threshold / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            if (memoryInfo.lowMemory) {
                jSONObject.put(m7053(null, 127 - (ViewConfiguration.getTouchSlop() >> 8), null, "\u0082\u008d\u0095\u0095").intern(), memoryInfo.lowMemory);
                f2934 = (f2935 + 37) % 128;
            }
            f2935 = (f2934 + 53) % 128;
            jSONObject.put(m7059("㢋㣦蛗磙䰈\uedc9逨\uf04a", ViewConfiguration.getEdgeSlop() >> 16).intern(), memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable th2) {
            String strIntern = m7053(null, 127 - Color.green(0), null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7053(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "\u0091\u009b\u0088\u0092\u0096\u008e\u009a\u0091\u0098\u0090\u0086\u0095\u0088\u0095\u0091\u0092\u0084\u0083\u008c\u008c\u0088\u0092\u0091\u0090\u0086\u0090\u0090\u008f").intern());
            sb2.append(th2.getLocalizedMessage());
            k.m7098(strIntern, sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7057(JSONObject jSONObject) {
        JSONObject jSONObjectM7043 = m7043();
        if (jSONObjectM7043 != null) {
            int i10 = f2934 + 61;
            f2935 = i10 % 128;
            int i11 = i10 % 2;
            jz.m7083(jSONObject, jSONObjectM7043);
            if (i11 != 0) {
                throw null;
            }
            f2935 = (f2934 + 57) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7056(Context context, JSONObject jSONObject, boolean z10) {
        f2935 = (f2934 + 29) % 128;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m7053(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u0098\u008c\u0083\u0089\u0083\u008c\u008a\u0088\u0084\u0084\u0086\u008a").intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m7053(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u0088\u0084\u0086\u0081\u0097").intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                jSONObject.put(m7059("㷋㶦측䫡ӱ\udff6瞡ៃ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    jSONObject.put(m7059("ᮎᯣ꙼ꫲ沬㿢Ǩ憎ㄯ", TextUtils.getTrimmedLength("")).intern(), networkInfo.getType());
                    jSONObject.put(m7053(null, 127 - KeyEvent.normalizeMetaState(0), null, "\u0097\u008c\u009d\u0095").intern(), networkInfo.getTypeName());
                    jSONObject.put(m7053(null, TextUtils.indexOf((CharSequence) "", '0') + 128, null, "\u0083\u0097\u008e\u009d\u0095").intern(), networkInfo.getSubtype());
                    jSONObject.put(m7053(null, 127 - (KeyEvent.getMaxKeyCode() >> 16), null, "\u0097\u008e\u009d\u0095").intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m7053(null, 127 - View.getDefaultSize(0, 0), null, "\u0086\u0084\u009d\u0095").intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m7053(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u0084\u0086\u009d\u0095").intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m7053(null, 127 - TextUtils.indexOf("", "", 0), null, "\u008a\u008a\u009d\u0095").intern(), telephonyManager.getNetworkCountryIso());
                    if (z10) {
                        f2934 = (f2935 + 75) % 128;
                        jSONObject.put(m7053(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u0086\u008e\u009d\u0095").intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m7059("䓤䒉麤ꊮ呴㞹§惟", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), telephonyManager.getSimOperatorName());
                    }
                }
            }
        } catch (Throwable th2) {
            k.m7118(m7053(null, View.combineMeasuredStates(0, 0) + 127, null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern(), m7053(null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, "\u008c\u0084\u0088\u0089\u0088\u0091\u0086\u008c\u0091\u0086\u0094\u0084\u0083\u0091\u0088\u008d\u0083\u009d\u0086\u0095\u0091\u0092\u0084\u0083\u0085\u0085\u0096\u0091\u0090\u0086\u0090\u0090\u008f").intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7059(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f2938, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2938));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7051(Intent intent) {
        int intExtra;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            try {
                if (!intent.hasExtra(m7059("䞸䟈䈿뿑裡⫀ȕ扤洗뜠羙", ViewConfiguration.getLongPressTimeout() >> 16).intern())) {
                    intExtra = -1;
                } else {
                    int i10 = f2935 + 51;
                    f2934 = i10 % 128;
                    intExtra = intent.getIntExtra(i10 % 2 == 0 ? m7059("䞸䟈䈿뿑裡⫀ȕ扤洗뜠羙", KeyEvent.getDeadChar(0, 0)).intern() : m7059("䞸䟈䈿뿑裡⫀ȕ扤洗뜠羙", KeyEvent.getDeadChar(0, 0)).intern(), -1);
                    f2935 = (f2934 + 85) % 128;
                }
                jSONObject.put(m7059("쨑쩳휣凹ᷥ쓭℥䅟", TextUtils.getOffsetBefore("", 0)).intern(), intExtra);
                jSONObject.put(m7053(null, 126 - TextUtils.lastIndexOf("", '0', 0), null, "\u0089\u008d\u008c\u009d").intern(), Math.round(((intent.hasExtra(m7053(null, TextUtils.getOffsetBefore("", 0) + 127, null, "\u008d\u0088\u0089\u0088\u008d").intern()) ? intent.getIntExtra(m7053(null, (-16777089) - Color.rgb(0, 0, 0), null, "\u008d\u0088\u0089\u0088\u008d").intern(), -1) : -1) * 100.0f) / (intent.hasExtra(m7053(null, 127 - (ViewConfiguration.getTapTimeout() >> 16), null, "\u0088\u008d\u0096\u008a\u008e").intern()) ? intent.getIntExtra(m7053(null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, "\u0088\u008d\u0096\u008a\u008e").intern(), -1) : -1)));
            } catch (Throwable th2) {
                String strIntern = m7053(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u008e\u008d\u0083\u008c\u008b\u0088\u008a\u0083\u0089\u0088\u0087").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7053(null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0091\u009b\u0084\u0086\u008e\u009e\u0091\u0086\u008c\u0091\u008e\u008d\u0088\u0089\u0088\u008d\u0091\u0098\u0090\u0088\u008c\u008c\u0096\u009d\u0091\u0092\u0084\u0083\u0085\u0085\u0096\u0091\u0090\u0086\u0090\u0090\u008f").intern());
                sb2.append(th2.getLocalizedMessage());
                k.m7098(strIntern, sb2.toString());
            }
        }
        m7046(jSONObject);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m7053(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2942;
                int i11 = f2940;
                if (f2936) {
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
                if (f2937) {
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
}
