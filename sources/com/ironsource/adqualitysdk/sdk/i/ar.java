package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
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
import com.applovin.shadow.okio.Utf8;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.i.jz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ar extends AnonymousClass4 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ar f385;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ar$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private JSONObject f386;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ax f387;

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        public final synchronized JSONObject m4805() {
            return this.f386;
        }

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        public final ax m4806() {
            return this.f387;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public synchronized void mo4807(JSONObject jSONObject) {
            this.f386 = jSONObject;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m4808(ax axVar) {
            this.f387 = axVar;
        }
    }

    static class a extends ar {

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        private static int f388 = 1;

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static char f389 = 5;

        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static int f390;

        /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
        private static char[] f391 = {'e', 'n', 'v', 'c', 'g', 'l', 't', 's', 'a', 'b', 'd', 'q', 'r', 'k', '.', 'm', 'o', 'f', 'i', 'h', 'R', 'C', 'p', 'U', 'T'};

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private static int[] f392 = {-81983579, -2138919679, -2091503318, 1361753917, -1791869496, 2042201685, -849660709, 193592439, 18121261, 1108331668, 557020721, -1451000058, 935243444, -1090763053, -957734026, -1238215441, 1683544758, 378638243};

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private boolean f393;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private boolean f394;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private int f395;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private boolean f396;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private List f397;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private al f398;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private ap f399;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private List<av> f400;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<av> f401;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private av f402;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private c f403;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private iw f404;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private as f405;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private aq f406;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private au f407;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private Handler f408;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private final int f409;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private final int f410;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final int f411;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private je f412;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private final int f413;

        public a() {
            super((byte) 0);
            m4818("\u0001\u0002£", 3 - View.resolveSize(0, 0), (byte) (46 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern();
            m4819(new int[]{1346807643, -110320428}, 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
            m4818("\u0004\u0000\u0006\u0007", 4 - View.MeasureSpec.getMode(0), (byte) (86 - Color.alpha(0))).intern();
            m4818("\u0002\b\u0006\u0007", 4 - ExpandableListView.getPackedPositionGroup(0L), (byte) (Process.getGidForName("") + 62)).intern();
            m4819(new int[]{556728592, 2019290960}, 4 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
            m4818("\t\u0007\u0007\u0005", (ViewConfiguration.getTapTimeout() >> 16) + 4, (byte) ((-16777206) - Color.rgb(0, 0, 0))).intern();
            m4819(new int[]{-1424613954, 342081122}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4).intern();
            m4818("\b\u0006\u009f", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, (byte) (TextUtils.indexOf("", "") + 59)).intern();
            m4818("\b\t\f\u0006", 4 - TextUtils.indexOf("", ""), (byte) (89 - TextUtils.indexOf("", "", 0))).intern();
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.toMillis(24L);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            this.f409 = (int) timeUnit2.toMillis(5L);
            this.f413 = (int) timeUnit.toMillis(12L);
            this.f410 = (int) timeUnit2.toMillis(3L);
            this.f411 = (int) timeUnit2.toMillis(10L);
            this.f395 = 0;
            this.f397 = null;
            this.f393 = false;
        }

        /* JADX INFO: renamed from: K, reason: contains not printable characters */
        private synchronized void m4809() {
            int i10 = f388 + 69;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            Handler handler = this.f408;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        a.this.m4833(true);
                        if (a.m4812(a.this) != null) {
                            a.m4812(a.this).mo4605();
                        }
                        Iterator it = new ArrayList(a.m4828(a.this)).iterator();
                        while (it.hasNext()) {
                            ((av) it.next()).mo4605();
                        }
                        a.m4828(a.this).clear();
                        Iterator it2 = new ArrayList(a.m4823(a.this)).iterator();
                        while (it2.hasNext()) {
                            ((av) it2.next()).mo4605();
                        }
                    }
                });
                f388 = (f390 + 125) % 128;
            }
        }

        /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
        private JSONObject m4810() {
            f390 = (f388 + 125) % 128;
            String strM6925 = this.f412.m6925(m4818("\r\u0002\u0015\u0006\u0012\u0013\t\u0013\b\r\u0004\u0012Ú", 13 - Color.argb(0, 0, 0, 0), (byte) (Gravity.getAbsoluteGravity(0, 0) + 117)).intern());
            if (strM6925 != null) {
                try {
                    return new JSONObject(strM6925);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            int i10 = f390 + 97;
            f388 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 55 / 0;
            }
            return jSONObject;
        }

        /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
        private int m4811() {
            int i10 = f390 + 19;
            f388 = i10 % 128;
            int iOptInt = i10 % 2 == 0 ? m4805().optInt(m4819(new int[]{-1302242163, -58660411}, 5 % ImageFormat.getBitsPerPixel(1)).intern(), 2) : m4805().optInt(m4819(new int[]{-1302242163, -58660411}, ImageFormat.getBitsPerPixel(0) + 5).intern(), 3);
            int i11 = f390 + 29;
            f388 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 24 / 0;
            }
            return iOptInt;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        static /* synthetic */ av m4812(a aVar) {
            int i10 = f390 + 5;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            av avVar = aVar.f402;
            if (i11 == 0) {
                int i12 = 49 / 0;
            }
            return avVar;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        static /* synthetic */ int m4813(a aVar) {
            f390 = (f388 + 121) % 128;
            int iM4811 = aVar.m4811();
            f390 = (f388 + 61) % 128;
            return iM4811;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        static /* synthetic */ int m4814(a aVar) {
            int i10 = f390;
            f388 = (i10 + 71) % 128;
            int i11 = aVar.f395;
            aVar.f395 = i11 + 1;
            int i12 = i10 + 21;
            f388 = i12 % 128;
            if (i12 % 2 != 0) {
                return i11;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        static /* synthetic */ Handler m4815(a aVar) {
            int i10 = f390 + 29;
            f388 = i10 % 128;
            int i11 = i10 % 2;
            Handler handler = aVar.f408;
            if (i11 == 0) {
                int i12 = 78 / 0;
            }
            return handler;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ je m4816(a aVar) {
            int i10 = f388 + 55;
            int i11 = i10 % 128;
            f390 = i11;
            int i12 = i10 % 2;
            je jeVar = aVar.f412;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i11 + 69;
            f388 = i13 % 128;
            if (i13 % 2 != 0) {
                return jeVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ c m4817(a aVar) {
            int i10 = (f390 + 75) % 128;
            f388 = i10;
            c cVar = aVar.f403;
            int i11 = i10 + 3;
            f390 = i11 % 128;
            if (i11 % 2 == 0) {
                return cVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ av m4821(a aVar, av avVar) {
            int i10 = f388;
            f390 = (i10 + 89) % 128;
            aVar.f402 = avVar;
            f390 = (i10 + 91) % 128;
            return avVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ void m4826(a aVar) {
            f390 = (f388 + 79) % 128;
            aVar.m4809();
            int i10 = f388 + 25;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 15 / 0;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ List m4828(a aVar) {
            int i10 = f390;
            f388 = (i10 + 7) % 128;
            List<av> list = aVar.f400;
            f388 = (i10 + 13) % 128;
            return list;
        }

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        public final int m4829() {
            JSONObject jSONObjectM4805;
            String strM4819;
            int i10 = f388 + 7;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM4805 = m4805();
                strM4819 = m4819(new int[]{-810661301, -1583971185}, 4 / ExpandableListView.getPackedPositionChild(1L));
            } else {
                jSONObjectM4805 = m4805();
                strM4819 = m4819(new int[]{-810661301, -1583971185}, ExpandableListView.getPackedPositionChild(0L) + 4);
            }
            int iOptInt = jSONObjectM4805.optInt(strM4819.intern(), this.f413);
            f388 = (f390 + 103) % 128;
            return iOptInt;
        }

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        public final int m4830() {
            f390 = (f388 + 87) % 128;
            int iOptInt = m4805().optInt(m4818("\u0002\ré", View.MeasureSpec.getMode(0) + 3, (byte) (Color.red(0) + 117)).intern(), this.f409);
            f390 = (f388 + 115) % 128;
            return iOptInt;
        }

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        public final synchronized iw m4831() {
            iw iwVar;
            try {
                int i10 = f390;
                int i11 = i10 + 73;
                f388 = i11 % 128;
                if (i11 % 2 == 0) {
                    iwVar = this.f404;
                    int i12 = 99 / 0;
                } else {
                    iwVar = this.f404;
                }
                int i13 = i10 + 99;
                f388 = i13 % 128;
                if (i13 % 2 != 0) {
                    return iwVar;
                }
                int i14 = 45 / 0;
                return iwVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: リ */
        public final boolean mo4772() {
            f388 = (f390 + 97) % 128;
            boolean zOptBoolean = m4805().optBoolean(m4819(new int[]{-1424613954, 342081122}, 4 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
            f390 = (f388 + 97) % 128;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヮ */
        public final List mo4773() {
            if (this.f397 == null) {
                this.f397 = jz.m7093(m4805().optJSONArray(m4818("\t\u0007\u0007\u0005", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 10)).intern()), new jz.b<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final /* synthetic */ ISAdQualityAdType mo4838(JSONArray jSONArray, int i10) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i10));
                    }
                });
                f390 = (f388 + 47) % 128;
            }
            List list = this.f397;
            int i10 = f390 + 79;
            f388 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 / 0;
            }
            return list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヶ */
        public final int mo4774() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m4805().optInt(m4818("\b\u0006\u009f", 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (TextUtils.getOffsetBefore("", 0) + 59)).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 丫 */
        public final boolean mo4775() {
            f390 = (f388 + 3) % 128;
            boolean zOptBoolean = m4805().optBoolean(m4818("\b\t\f\u0006", 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (KeyEvent.keyCodeFromString("") + 89)).intern());
            f388 = (f390 + 25) % 128;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 乁 */
        public final long mo4776() {
            String strM6925 = this.f412.m6925(m4818("\u0006\u000f\u0002\u0000\r\t\u000b\f\n\t\t\b\u000b\u0001\u0015\u0006\u0002\u0001\u0001\b\u0011\u000b\u0018\u0017\r\u0005\u0005\u0001\u0017\u0013\u0014\u0005\b\u0007\u0005\u0012®", View.resolveSize(0, 0) + 37, (byte) (62 - ((Process.getThreadPriority(0) + 20) >> 6))).intern());
            if (TextUtils.isEmpty(strM6925)) {
                return 0L;
            }
            int i10 = f390 + 105;
            f388 = i10 % 128;
            if (i10 % 2 == 0) {
                Long.parseLong(strM6925);
                throw null;
            }
            long j10 = Long.parseLong(strM6925);
            f388 = (f390 + 97) % 128;
            return j10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 爫 */
        public final String mo4777() {
            f388 = (f390 + 13) % 128;
            if (m4805() == null) {
                return null;
            }
            String strOptString = m4805().optString(m4819(new int[]{1356438421, 723423256}, 4 - View.MeasureSpec.getSize(0)).intern());
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            f390 = (f388 + 43) % 128;
            String strM4955 = m4806().m4955();
            f388 = (f390 + 25) % 128;
            return strM4955;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﬤ */
        public final int mo4778() {
            f388 = (f390 + 83) % 128;
            int iOptInt = m4805().optInt(m4818("\u0002\b\u0006\u0007", 4 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 61)).intern(), this.f411);
            f390 = (f388 + 51) % 128;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: טּ */
        public final synchronized void mo4779() {
            this.f408.removeCallbacksAndMessages(null);
            this.f408 = null;
            t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.4
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    a.m4828(a.this).clear();
                    a.m4823(a.this).clear();
                    a.m4821(a.this, (av) null);
                }
            });
            f388 = (f390 + 65) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: סּ */
        public final int mo4780() {
            JSONObject jSONObjectM4805;
            int trimmedLength;
            byte scrollBarSize;
            int i10 = f388 + 19;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM4805 = m4805();
                trimmedLength = 3 - TextUtils.getTrimmedLength("");
                scrollBarSize = (byte) (30 % (ViewConfiguration.getScrollBarSize() * 93));
            } else {
                jSONObjectM4805 = m4805();
                trimmedLength = TextUtils.getTrimmedLength("") + 4;
                scrollBarSize = (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 86);
            }
            return jSONObjectM4805.optInt(m4818("\u0004\u0000\u0006\u0007", trimmedLength, scrollBarSize).intern(), this.f410);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            com.ironsource.adqualitysdk.sdk.i.ar.a.f390 = (com.ironsource.adqualitysdk.sdk.i.ar.a.f388 + 105) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            if (m4806() != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        
            if (m4806() != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            r0 = m4806().m4954();
            r2 = com.ironsource.adqualitysdk.sdk.i.ar.a.f388 + 77;
            com.ironsource.adqualitysdk.sdk.i.ar.a.f390 = r2 % 128;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ףּ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final org.json.JSONObject mo4781() {
            /*
                r4 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f390
                int r0 = r0 + 101
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f388 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 != 0) goto L18
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m4806()
                r2 = 20
                int r2 = r2 / 0
                if (r0 == 0) goto L34
                goto L1e
            L18:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m4806()
                if (r0 == 0) goto L34
            L1e:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m4806()
                org.json.JSONObject r0 = r0.m4954()
                int r2 = com.ironsource.adqualitysdk.sdk.i.ar.a.f388
                int r2 = r2 + 77
                int r3 = r2 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f390 = r3
                int r2 = r2 % 2
                if (r2 != 0) goto L33
                return r0
            L33:
                throw r1
            L34:
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f388
                int r0 = r0 + 105
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f390 = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ar.a.mo4781():org.json.JSONObject");
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭖ */
        public final au mo4782() {
            int i10 = f388 + 55;
            f390 = i10 % 128;
            if (i10 % 2 == 0) {
                return this.f407;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭴ */
        public final ap mo4783() {
            int i10 = (f390 + 99) % 128;
            f388 = i10;
            ap apVar = this.f399;
            f390 = (i10 + 11) % 128;
            return apVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭸ */
        public final as mo4784() {
            int i10 = f390;
            int i11 = i10 + 49;
            f388 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            as asVar = this.f405;
            int i12 = i10 + 107;
            f388 = i12 % 128;
            if (i12 % 2 != 0) {
                return asVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮉ */
        public final aq mo4785() {
            int i10 = f390 + 121;
            int i11 = i10 % 128;
            f388 = i11;
            if (i10 % 2 == 0) {
                throw null;
            }
            aq aqVar = this.f406;
            f390 = (i11 + 107) % 128;
            return aqVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮌ */
        public final String mo4786() {
            JSONObject jSONObjectM4805;
            int tapTimeout;
            int mode;
            int i10 = f388 + 13;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM4805 = m4805();
                tapTimeout = (ViewConfiguration.getTapTimeout() << 125) * 3;
                mode = 70 - View.MeasureSpec.getMode(0);
            } else {
                jSONObjectM4805 = m4805();
                tapTimeout = 3 - (ViewConfiguration.getTapTimeout() >> 16);
                mode = View.MeasureSpec.getMode(0) + 45;
            }
            String strOptString = jSONObjectM4805.optString(m4818("\u0001\u0002£", tapTimeout, (byte) mode).intern());
            int i11 = f390 + 83;
            f388 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 17 / 0;
            }
            return strOptString;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱟ */
        public final boolean mo4788() {
            int i10 = (f388 + 33) % 128;
            f390 = i10;
            boolean z10 = this.f394;
            int i11 = i10 + 19;
            f388 = i11 % 128;
            if (i11 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ void m4820(JSONObject jSONObject, long j10) {
            int i10 = f388 + 27;
            f390 = i10 % 128;
            int i11 = i10 % 2;
            m4824(jSONObject, j10);
            if (i11 != 0) {
                throw null;
            }
            int i12 = f388 + 5;
            f390 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ List m4823(a aVar) {
            int i10 = f388 + 83;
            int i11 = i10 % 128;
            f390 = i11;
            int i12 = i10 % 2;
            List<av> list = aVar.f401;
            if (i12 != 0) {
                throw null;
            }
            f388 = (i11 + 57) % 128;
            return list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮐ */
        public final double mo4787() {
            JSONObject jSONObjectM4805;
            String strM4819;
            int i10 = f390 + 113;
            f388 = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObjectM4805 = m4805();
                strM4819 = m4819(new int[]{556728592, 2019290960}, 5 >>> TextUtils.getCapsMode("", 0, 0));
            } else {
                jSONObjectM4805 = m4805();
                strM4819 = m4819(new int[]{556728592, 2019290960}, TextUtils.getCapsMode("", 0, 0) + 4);
            }
            return jSONObjectM4805.optDouble(strM4819.intern(), 1.0d);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱡ */
        public final double mo4789() {
            f390 = (f388 + 89) % 128;
            double dOptDouble = m4805().optDouble(m4818("\u0005\u0001ì", 3 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (124 - View.resolveSizeAndState(0, 0, 0))).intern(), 5.0d);
            int i10 = f390 + 73;
            f388 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 36 / 0;
            }
            return dOptDouble;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﺙ */
        public final int mo4790() {
            int iM4956;
            ax axVarM4806 = m4806();
            if (axVarM4806 != null) {
                int i10 = f390 + 23;
                f388 = i10 % 128;
                if (i10 % 2 == 0) {
                    iM4956 = axVarM4806.m4956();
                    int i11 = 30 / 0;
                } else {
                    iM4956 = axVarM4806.m4956();
                }
            } else {
                iM4956 = 3000;
            }
            int i12 = f390 + 17;
            f388 = i12 % 128;
            if (i12 % 2 != 0) {
                return iM4956;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻏ */
        public final synchronized boolean mo4791() {
            int i10 = (f388 + 101) % 128;
            f390 = i10;
            boolean z10 = this.f396;
            int i11 = i10 + 105;
            f388 = i11 % 128;
            if (i11 % 2 != 0) {
                return z10;
            }
            int i12 = 70 / 0;
            return z10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo4792() {
            JSONObject jSONObjectM4805;
            String strM4819;
            int i10 = f388 + 33;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM4805 = m4805();
                strM4819 = m4819(new int[]{-1481378087, -1826599106}, 2 / Gravity.getAbsoluteGravity(0, 0));
            } else {
                jSONObjectM4805 = m4805();
                strM4819 = m4819(new int[]{-1481378087, -1826599106}, 3 - Gravity.getAbsoluteGravity(0, 0));
            }
            boolean zOptBoolean = jSONObjectM4805.optBoolean(strM4819.intern(), false);
            f388 = (f390 + 7) % 128;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final void mo4800(final av avVar) {
            f388 = (f390 + 91) % 128;
            Handler handler = this.f408;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        if (a.this.mo4791()) {
                            avVar.mo4605();
                        } else {
                            a.m4828(a.this).add(avVar);
                        }
                    }
                });
                f388 = (f390 + 29) % 128;
            }
            int i10 = f388 + 91;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final synchronized void m4833(boolean z10) {
            try {
                int i10 = f390 + 11;
                int i11 = i10 % 128;
                f388 = i11;
                if (i10 % 2 == 0) {
                    this.f396 = z10;
                    throw null;
                }
                this.f396 = z10;
                int i12 = i11 + 79;
                f390 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            throw th2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass4
        /* JADX INFO: renamed from: ﻛ */
        public final synchronized void mo4807(JSONObject jSONObject) {
            try {
                if (!(!m4825(jSONObject))) {
                    int i10 = f390 + 65;
                    f388 = i10 % 128;
                    if (i10 % 2 == 0) {
                        m4827(jSONObject);
                        throw null;
                    }
                    m4827(jSONObject);
                }
                super.mo4807(jSONObject);
                this.f407.mo4807(jSONObject);
                this.f405.mo4807(jSONObject);
                this.f406.mo4807(jSONObject);
                this.f399.mo4807(jSONObject);
                int i11 = f390 + 27;
                f388 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final void mo4797(Context context, iw iwVar, al alVar, c cVar, boolean z10) {
            this.f412 = new je(context, m4818("\u0007\u000b\r\b\u0004\u0005\r\b\u000e\n\f\u0003\n\u000b\u000e\u0013\n\u0002\u0010\u0011\u0005\u0001\u0001\u0012\u0002\u0010\u0013\u0003", 27 - ExpandableListView.getPackedPositionChild(0L), (byte) (View.MeasureSpec.getMode(0) + 72)).intern(), m4819(new int[]{-428506525, -193480751, 2108206326, -1894586225, 1815068023, 1149962225, 515620675, -1355112994, 831061069, -123686041}, 20 - KeyEvent.normalizeMetaState(0)).intern());
            this.f404 = iwVar;
            this.f396 = false;
            this.f394 = z10;
            this.f398 = alVar;
            this.f408 = new Handler(Looper.getMainLooper());
            ax axVar = new ax();
            this.f407 = new au(axVar);
            this.f405 = new as(axVar);
            this.f406 = new aq(axVar);
            this.f399 = new ap();
            mo4807(m4810());
            m4808(axVar);
            this.f403 = cVar;
            this.f400 = new ArrayList();
            this.f401 = new ArrayList();
            int i10 = f388 + 43;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4803(JSONObject jSONObject) {
            f390 = (f388 + 105) % 128;
            mo4807(jSONObject);
            m4809();
            f388 = (f390 + 95) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo4801(String str, String str2) {
            f390 = (f388 + 113) % 128;
            if (m4822(str) != null && !(!r2.m4946(str2))) {
                return false;
            }
            f388 = (f390 + 119) % 128;
            return true;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo4802(final av avVar) {
            f390 = (f388 + 49) % 128;
            Handler handler = this.f408;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        a.m4821(a.this, avVar);
                        if (a.this.mo4791()) {
                            avVar.mo4605();
                        }
                    }
                });
                f390 = (f388 + 75) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final String mo4799(String str) {
            aw awVarM4822 = m4822(str);
            if (awVarM4822 == null) {
                return null;
            }
            f390 = (f388 + 33) % 128;
            String strM4945 = awVarM4822.m4945();
            int i10 = f390 + 53;
            f388 = i10 % 128;
            if (i10 % 2 != 0) {
                return strM4945;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final boolean mo4804() {
            f390 = (f388 + 55) % 128;
            boolean zOptBoolean = m4805().optBoolean(m4819(new int[]{-1202225691, -1025302518}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3).intern(), true);
            f388 = (f390 + 25) % 128;
            return zOptBoolean;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m4832(long j10) {
            int i10 = f390 + 65;
            f388 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (!this.f393) {
                this.f412.m6929(m4818("\u0006\u000f\u0002\u0000\r\t\u000b\f\n\t\t\b\u000b\u0001\u0015\u0006\u0002\u0001\u0001\b\u0011\u000b\u0018\u0017\r\u0005\u0005\u0001\u0017\u0013\u0014\u0005\b\u0007\u0005\u0012®", 37 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (62 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), String.valueOf(j10));
                this.f393 = true;
            }
            int i11 = f388 + 99;
            f390 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static void m4827(JSONObject jSONObject) {
            f390 = (f388 + 69) % 128;
            jz.m7083(jSONObject, jSONObject.optJSONObject(m4818("\u0007\u000b\r\u0017\u0007\b", AndroidCharacter.getMirror('0') - '*', (byte) (7 - Color.argb(0, 0, 0, 0))).intern()));
            f388 = (f390 + 85) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo4796(iz izVar) {
            f388 = (f390 + 39) % 128;
            m4806().m4958(izVar);
            int i10 = f388 + 113;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo4794(final Context context, final ao aoVar, boolean z10) {
            f388 = (f390 + 113) % 128;
            if (z10) {
                t.m7282(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        if (!a.this.m4831().m6830().m6818()) {
                            a.m4817(a.this).mo4840();
                        } else {
                            if (a.this.mo4791()) {
                                return;
                            }
                            a.m4817(a.this).mo4839();
                        }
                    }
                }, ar.m4771().mo4780());
            }
            m4833(false);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new jq(context, aoVar, mo4776()).mo4692(new JSONObject(), m4831().m6830().m6818(), true, false);
                f390 = (f388 + 49) % 128;
            } catch (JSONException e10) {
                k.m7118(m4818("\u0000\u0005\u0010\u0011\u0005\u0001\u0001\u0015\u0002\u0010\u0013\u0003", View.MeasureSpec.getMode(0) + 12, (byte) (44 - TextUtils.getOffsetAfter("", 0))).intern(), m4819(new int[]{1461733317, 1044056902, -518746095, 635703919, 1515719867, -1711267859, -1048964546, 160505427, -1977465801, 738556905, 1081323132, -1630142639, -138943661, 230175536}, Color.green(0) + 25).intern(), e10);
            }
            m4831().m6828(this.f398.m4724(m4818("\u0010\u0003\u0010\b", 4 - View.combineMeasuredStates(0, 0), (byte) (TextUtils.indexOf("", "") + 2)).intern()), jSONObject, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3

                /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
                private static int f417 = 1;

                /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
                private static short[] f418 = null;

                /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                private static int f419 = 0;

                /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
                private static byte[] f420 = {86, 123, -122, 125, 122, -119, -58, 57, 122, 106, -120, -127, -121, 123, 118, -41, 34, -120, -123, 114, -118, 118, -123, -117, -121, -123, 107, -89, 100, -102, -88, 80, 87, -85, 96, -110, -85, 86, -83, -86, 89, -92, 10, 43, 5, -64, 34, -55, -64, Utf8.REPLACEMENT_BYTE, -98, 126, 51, 48, -63, -117, 116, 51, -50, 53, 50, -63, -114, 116, 52, -56, 56, -51, -62, 51, -118, 99, -50, 48, -51, -32, 0, 0, 0, 0, 0};

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f421 = 117819832;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f422 = 17;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f423 = 25698;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f424 = -847945897;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static char f425 = 8251;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static char f426 = 37973;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char f427 = 31241;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private void m4835(int i10) {
                    synchronized (a.this) {
                        try {
                            if (a.m4815(a.this) != null) {
                                t.m7284(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3.3
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo4564() {
                                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                        a.this.mo4794(context, aoVar, false);
                                    }
                                }, i10);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m4836(int i10, short s10, int i11, byte b10, int i12) {
                    String string;
                    synchronized (o.f3017) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            int i13 = f422;
                            int i14 = i12 + i13;
                            int i15 = i14 == -1 ? 1 : 0;
                            if (i15 != 0) {
                                byte[] bArr = f420;
                                i14 = bArr != null ? (byte) (bArr[f421 + i10] + i13) : (short) (f418[f421 + i10] + i13);
                            }
                            if (i14 > 0) {
                                o.f3018 = ((i10 + i14) - 2) + f421 + i15;
                                o.f3019 = b10;
                                char c10 = (char) (i11 + f424);
                                o.f3021 = c10;
                                sb2.append(c10);
                                o.f3020 = o.f3021;
                                o.f3022 = 1;
                                while (o.f3022 < i14) {
                                    byte[] bArr2 = f420;
                                    if (bArr2 != null) {
                                        int i16 = o.f3018;
                                        o.f3018 = i16 - 1;
                                        o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                                    } else {
                                        short[] sArr = f418;
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
                public final void mo4675(iq iqVar) {
                    int iM6805;
                    String strM6806;
                    try {
                        iM6805 = iqVar.m6802().m6805();
                        strM6806 = iqVar.m6802().m6806();
                    } catch (Exception e11) {
                        kd.m7167(m4834("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12).intern(), m4834("ᶒ绽῞\ud964渀蠯䬺灁鑋괷蟾\uf6bd䦛狓嗇딳㇎躦ﾉ햄蝙헊뽶줫ӵ\udab6䦛狓涬\ude16뽶줫", View.resolveSize(0, 0) + 32).intern(), (Throwable) e11, false, true);
                    }
                    if (iM6805 >= 200) {
                        f419 = (f417 + 103) % 128;
                        if (iM6805 <= 299) {
                            JSONObject jSONObjectM6801 = iqVar.m6801();
                            if (jSONObjectM6801.optBoolean(m4834("¦ﺧ䧢谖", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3).intern())) {
                                int i10 = f417 + 61;
                                f419 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    s.m7239().m7269();
                                    throw null;
                                }
                                s.m7239().m7269();
                            }
                            k.m7099(m4834("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", 12 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m4836((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 117819833, (short) (ViewConfiguration.getEdgeSlop() >> 16), 847945980 - (Process.myPid() >> 22), (byte) ((-123) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - KeyEvent.normalizeMetaState(0)).intern(), jSONObjectM6801);
                            JSONObject jSONObjectM7082 = jz.m7082(jSONObjectM6801);
                            a.this.m4832(jSONObjectM7082.optLong(m4834("鱨₰\udacb㍧", Color.rgb(0, 0, 0) + 16777220).intern(), 0L));
                            jSONObjectM7082.remove(m4836(((Process.getThreadPriority(0) + 20) >> 6) - 117819804, (short) View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 847946012, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 101), (-15) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                            a.m4816(a.this).m6923(m4836((-117819802) - ExpandableListView.getPackedPositionType(0L), (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 847946010 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (85 - Color.blue(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 4).intern(), jSONObjectM7082.toString(), null);
                            jSONObjectM6801.put(m4836((-117819790) - (Process.myTid() >> 22), (short) Color.argb(0, 0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 847946013, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 12), (-15) - (Process.myTid() >> 22)).intern(), jx.m7068());
                            jSONObjectM6801.put(m4834("鰏㋷", 2 - TextUtils.indexOf("", "", 0, 0)).intern(), jx.m7066());
                            a.m4820(jSONObjectM6801, iqVar.m6803());
                            a.this.mo4807(jSONObjectM6801);
                            a.m4826(a.this);
                            m4835(a.this.m4829());
                            return;
                        }
                    }
                    mo4676(iqVar, strM6806);
                    int i11 = f419 + 111;
                    f417 = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo4676(iq iqVar, String str) {
                    int iM6805;
                    if (iqVar != null) {
                        f417 = (f419 + 21) % 128;
                        iM6805 = iqVar.m6802().m6805();
                    } else {
                        f419 = (f417 + 117) % 128;
                        iM6805 = -1;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m4836((-117819790) - TextUtils.lastIndexOf("", '0', 0, 0), (short) ((Process.getThreadPriority(0) + 20) >> 6), 847945966 - TextUtils.getOffsetAfter("", 0), (byte) ((-51) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf("", "") + 17).intern());
                    sb2.append(iM6805);
                    k.m7102(m4834("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", 12 - ExpandableListView.getPackedPositionGroup(0L)).intern(), sb2.toString());
                    if (iM6805 != 403) {
                        f417 = (f419 + 99) % 128;
                        if (a.m4814(a.this) < a.m4813(a.this)) {
                            m4835(a.this.m4830());
                        }
                    }
                }

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m4834(String str, int i10) {
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
                                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f423)) ^ ((c11 >>> 5) + f425)));
                                        cArr3[1] = c12;
                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f427) ^ ((c12 + i12) ^ ((c12 << 4) + f426))));
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
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo4798() {
            JSONObject jSONObjectM4805;
            String strIntern;
            boolean z10;
            int i10 = f388 + 25;
            f390 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM4805 = m4805();
                strIntern = m4819(new int[]{626012635, -1984863808}, 2 % (KeyEvent.getMaxKeyCode() >>> 25)).intern();
                z10 = false;
            } else {
                jSONObjectM4805 = m4805();
                strIntern = m4819(new int[]{626012635, -1984863808}, (KeyEvent.getMaxKeyCode() >> 16) + 4).intern();
                z10 = true;
            }
            return jSONObjectM4805.optBoolean(strIntern, z10);
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static void m4824(JSONObject jSONObject, long j10) {
            if (jSONObject.has(m4819(new int[]{-712133822, -224733627}, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                int i10 = f388 + 63;
                f390 = i10 % 128;
                try {
                    if (i10 % 2 != 0) {
                        jSONObject.put(m4819(new int[]{-712133822, -224733627}, TextUtils.getCapsMode("", 0, 0) * 2).intern(), (j10 / 2) | jSONObject.optLong(m4819(new int[]{-712133822, -224733627}, 5 / Color.green(1)).intern()));
                    } else {
                        jSONObject.put(m4819(new int[]{-712133822, -224733627}, 3 - TextUtils.getCapsMode("", 0, 0)).intern(), jSONObject.optLong(m4819(new int[]{-712133822, -224733627}, Color.green(0) + 3).intern()) + (j10 / 2));
                    }
                    int i11 = f388 + 91;
                    f390 = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                    return;
                } catch (JSONException unused) {
                }
            }
            int i12 = f388 + 31;
            f390 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 31 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo4795(final av avVar) {
            int i10 = f390 + 17;
            f388 = i10 % 128;
            if (i10 % 2 != 0) {
                Handler handler = this.f408;
                if (handler != null) {
                    handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            a.m4823(a.this).add(avVar);
                            if (a.this.mo4791()) {
                                avVar.mo4605();
                            }
                        }
                    });
                }
                f388 = (f390 + 1) % 128;
                return;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean m4825(JSONObject jSONObject) {
            int iNormalizeMetaState;
            int i10;
            int i11 = f390 + 121;
            f388 = i11 % 128;
            if (i11 % 2 == 0) {
                iNormalizeMetaState = KeyEvent.normalizeMetaState(1) * 49;
                i10 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            } else {
                iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 6;
                i10 = 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            }
            boolean zHas = jSONObject.has(m4818("\u0007\u000b\r\u0017\u0007\b", iNormalizeMetaState, (byte) i10).intern());
            int i12 = f388 + 103;
            f390 = i12 % 128;
            if (i12 % 2 == 0) {
                return zHas;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private aw m4822(String str) {
            int i10 = f390;
            int i11 = i10 + 99;
            int i12 = i11 % 128;
            f388 = i12;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (str != null) {
                int i13 = i10 + 89;
                f388 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 27 / 0;
                    return mo4793().get(str);
                }
                return mo4793().get(str);
            }
            int i15 = i12 + 5;
            f390 = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final Map<String, aw> mo4793() {
            Map<String, aw> map = new HashMap<>();
            try {
                String strOptString = m4805().optString(m4818("\r\u0000î", 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (KeyEvent.keyCodeFromString("") + 123)).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = jz.m7085(new JSONObject(strOptString), new jz.c<aw>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.6
                        @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        public final /* synthetic */ aw mo4837(JSONObject jSONObject, String str) {
                            return new aw(jSONObject.optJSONObject(str));
                        }
                    });
                }
                f390 = (f388 + 9) % 128;
                return map;
            } catch (JSONException e10) {
                kd.m7160(m4818("\u0000\u0005\u0010\u0011\u0005\u0001\u0001\u0015\u0002\u0010\u0013\u0003", AndroidCharacter.getMirror('0') - '$', (byte) (43 - MotionEvent.axisFromString(""))).intern(), m4819(new int[]{1461733317, 1044056902, 428215858, -1961072058, -65074011, -1059125625, 1581561942, -1481391031, -157161790, -1026405494, -2084764877, 218133828, -2117089186, 682257840, 1457645334, 2131892427}, (ViewConfiguration.getTouchSlop() >> 8) + 31).intern(), e10, false);
                return map;
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m4818(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2153) {
                try {
                    char[] cArr2 = f391;
                    char c10 = f389;
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

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m4819(int[] iArr, int i10) {
            String str;
            synchronized (e.f1936) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f392.clone();
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
    }

    public interface c {
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        void mo4839();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo4840();
    }

    /* synthetic */ ar(byte b10) {
        this();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized ar m4771() {
        try {
            if (f385 == null) {
                f385 = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f385;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public abstract boolean mo4772();

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public abstract List mo4773();

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public abstract int mo4774();

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public abstract boolean mo4775();

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public abstract long mo4776();

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public abstract String mo4777();

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public abstract int mo4778();

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public abstract void mo4779();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public abstract int mo4780();

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public abstract JSONObject mo4781();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public abstract au mo4782();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public abstract ap mo4783();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public abstract as mo4784();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public abstract aq mo4785();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public abstract String mo4786();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public abstract double mo4787();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public abstract boolean mo4788();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public abstract double mo4789();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public abstract int mo4790();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public abstract boolean mo4791();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo4792();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract Map<String, aw> mo4793();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo4794(Context context, ao aoVar, boolean z10);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo4795(av avVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo4796(iz izVar);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo4797(Context context, iw iwVar, al alVar, c cVar, boolean z10);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo4798();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract String mo4799(String str);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo4800(av avVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo4801(String str, String str2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo4802(av avVar);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo4803(JSONObject jSONObject);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo4804();

    private ar() {
    }
}
