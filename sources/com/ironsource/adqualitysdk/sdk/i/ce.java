package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.protobuf.ByteString;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.bidmachine.protobuf.EventTypeExtended;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ce extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1289 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1290 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1291;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1292;

    class a extends WebViewApp implements hg<WebViewApp> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f1308 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1312 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f1316;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WebViewApp f1317;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f1313 = {15750, 10963, 4989, 31666, 24612, 18615, 45516, 40513, 34457, 61246, 55289, 15567, 9568, 3486, 31268, 25277, 19395, 45127, 39071, 33028, 59793, 54989, 16234, 10228, 3100, 29882, 6738, 3335, 13481, 23654, 18416, 28515, 38424, 47509, 41293, 51434, 61485, 6913, 674, 10857, 24002, 17774, 27700, 38818, 48971, 42732, 52838, 61719, 6331, '!', 11209, 37047, 34786, 48716, 54915, 52501, 58758, 7421, 13168, 11176, 16911, 31432, 37354, 34897, 41135, 55061, 53132, 59122, 7521, 13751, 11296, 17563, 59920, 64837, 50411, 44068, 47026, 40737, 26202, 18903, 20751, 14504, 'o', 60249, 62198, 55816, 44466, 46379, 40021, 26566, 20240, 22151, 15932, 37286, 34547, 48989, 55186, 52228, 58519, 7660, 12897, 10937, 17182, 31705, 37103, 35136, 41406, 54800, 52887, 59375, 7232, 13478, 11571, 17800, 31472, 37706, 35780, 41008, 55441, 61929, 'W', 5890, 11948, 18019, 24053, 30054, 35869, 41872, 47944, 53999, 59944, 286, 6321, 12373, 18374, 24396, 30214, 36274, 42320, 48337, 52421, 56208, 57918, 35569, 37223, 47604, 16527, 28418, 30682, 7805, 9914, 52638, 54306, 64717, 35699, 37882, 47758, 16681, 27086, 28758, 6397, 10122, 56354, 52087, 62169, 39446, 33152, 43283, 20584, 32741, 26429, 3738, 13917, 56682, 50372, 60451, 39864, 33546, 43616, 20961, 31018, 24764, 2069, 14180, 57038, 50775, 60854};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f1314 = 8513197706427635559L;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static long f1310 = 2082429000782378280L;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f1311 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char f1309 = 0;

        a(WebViewApp webViewApp, ch chVar) {
            this.f1317 = webViewApp;
            this.f1316 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m5796(int i10, char c10, int i11) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1677) {
                try {
                    char[] cArr = new char[i11];
                    com.ironsource.adqualitysdk.sdk.i.d.f1676 = 0;
                    while (true) {
                        int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1676;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f1313[i10 + i12]) ^ (((long) i12) * f1314)) ^ ((long) c10));
                            com.ironsource.adqualitysdk.sdk.i.d.f1676 = i12 + 1;
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

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m5797(String str, char c10, String str2, int i10, String str3) {
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1310) ^ ((long) f1311)) ^ ((long) f1309));
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
        private WebViewApp m5798() {
            int i10 = (f1308 + 109) % 128;
            f1312 = i10;
            WebViewApp webViewApp = this.f1317;
            f1308 = (i10 + 105) % 128;
            return webViewApp;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void addCallback(NativeCallback nativeCallback) {
            f1308 = (f1312 + 81) % 128;
            ce.this.m5106(this, this.f1316, m5796(140 - Gravity.getAbsoluteGravity(0, 0), (char) (52370 - Color.argb(0, 0, 0, 0)), 22 - Gravity.getAbsoluteGravity(0, 0)).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                webViewApp.addCallback(nativeCallback);
            }
            int i10 = f1308 + 13;
            f1312 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public NativeCallback getCallback(String str) {
            f1312 = (f1308 + 69) % 128;
            ce.this.m5106(this, this.f1316, m5797("ۥ霥吤륄쓦럷蚄쎪쩒쒃ﾗﰓȹ愰볼\ud961ꓩ㖍㔞⳰멃ഡ", (char) (ViewConfiguration.getScrollBarSize() >> 8), "\uf528鶚䘤᳦", TextUtils.indexOf("", "", 0, 0), "䨒춰燙偏").intern(), str);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                return webViewApp.getCallback(str);
            }
            f1312 = (f1308 + 41) % 128;
            return null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public Configuration getConfiguration() {
            f1312 = (f1308 + 81) % 128;
            ce.this.m5106(this, this.f1316, m5797("횓\ud942ꇳ雍\ua9dc암뮐㒷醿葾湶퇕誗텆퇄憝\ue27e劸벃憸╃㷟\uf0b2ᎁ\uf1c1䪚땲", (char) (10947 - View.MeasureSpec.getSize(0)), "\uf528鶚䘤᳦", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.DC4, "ፃ\uabfc썤\udb2a").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp == null) {
                return null;
            }
            f1308 = (f1312 + 61) % 128;
            Configuration configuration = webViewApp.getConfiguration();
            f1312 = (f1308 + 29) % 128;
            return configuration;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public ErrorState getErrorStateFromWebAppCode() {
            f1312 = (f1308 + 7) % 128;
            ce.this.m5106(this, this.f1316, m5797("흏최宋鳄Զ㏐弮굤렞\uf64b⦕隰\ue685ઠ\udeca澴䟚\uec4a翳撓\fﰜ⍕⍜ྈ拋핱ቴ楇랆\ue2cf⹋ﱆ뒚㝱봨䌚褭", (char) TextUtils.getCapsMode("", 0, 0), "\uf528鶚䘤᳦", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "ﮍగ运ᴘ").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp == null) {
                return null;
            }
            ErrorState errorStateFromWebAppCode = webViewApp.getErrorStateFromWebAppCode();
            f1308 = (f1312 + 17) % 128;
            return errorStateFromWebAppCode;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public int getWebAppFailureCode() {
            f1312 = (f1308 + 35) % 128;
            ce.this.m5106(this, this.f1316, m5797("縌ㄣ㢷硷쮈ч槧㞄従⓽뉛㊓ꊌ\ufde7㘆廳웗⪪㮤Ꮸ搰\ue6ab⇀뻉澩䐢᭗蚠↦뙫膏", (char) (Color.green(0) + 43124), "\uf528鶚䘤᳦", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ESC, "ᨄ߆璖誨").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp == null) {
                return 0;
            }
            int i10 = f1312 + 11;
            f1308 = i10 % 128;
            if (i10 % 2 == 0) {
                return webViewApp.getWebAppFailureCode();
            }
            webViewApp.getWebAppFailureCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public String getWebAppFailureMessage() {
            f1312 = (f1308 + 113) % 128;
            ce.this.m5106(this, this.f1316, m5797("뛋瀪秸찐킋᠋튖ˎ츭ᐯ\ue67d\ue1fd鞸ⰾ蕞鈊\uf4f2\uf799Šើ坈㊞풓\uea30롓㎈뮜\udffb梼鶤탶\ue868늬炒", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\uf528鶚䘤᳦", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\ude6eꇑ\ue2f4鼞").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp == null) {
                return null;
            }
            int i10 = f1312 + 21;
            f1308 = i10 % 128;
            if (i10 % 2 == 0) {
                return webViewApp.getWebAppFailureMessage();
            }
            int i11 = 85 / 0;
            return webViewApp.getWebAppFailureMessage();
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public WebView getWebView() {
            f1312 = (f1308 + 123) % 128;
            ce.this.m5106(this, this.f1316, m5796((Process.myTid() >> 22) + 51, (char) (37088 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                return webViewApp.getWebView();
            }
            int i10 = f1312 + 19;
            f1308 = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean invokeCallback(Invocation invocation) {
            f1312 = (f1308 + 7) % 128;
            ce.this.m5106(this, this.f1316, m5797("\u2d97ᢉ낛쯰ꞟ餞\uab6c\ue9b7塁蜨吧쏑ᣬ嬴奸꺧铑崼朢茅햩閤̫鹴覲", (char) KeyEvent.getDeadChar(0, 0), "\uf528鶚䘤᳦", 526339778 - ((byte) KeyEvent.getModifierMetaStateMask()), "쌦彎餟뜞").intern(), invocation);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                return webViewApp.invokeCallback(invocation);
            }
            int i10 = f1308 + 79;
            f1312 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 46 / 0;
            }
            return false;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            f1312 = (f1308 + 83) % 128;
            ce.this.m5106(this, this.f1316, m5797("\udb02ꓞꮜ祎Ṩ㖌\uf809쏔痞ᐛ뾣\ud9e7淋ꑪ㬓엦韡햔뗔\ua7f1쳩웦暢", (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "\uf528鶚䘤᳦", 1947390416 - TextUtils.getOffsetBefore("", 0), "탿ዑ扴\uea5b").intern(), str, str2, method, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1317;
            if (webViewApp == null) {
                return false;
            }
            f1312 = (f1308 + 71) % 128;
            boolean zInvokeMethod = webViewApp.invokeMethod(str, str2, method, objArr);
            f1312 = (f1308 + 11) % 128;
            return zInvokeMethod;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
        
            com.ironsource.adqualitysdk.sdk.i.ce.a.f1308 = (com.ironsource.adqualitysdk.sdk.i.ce.a.f1312 + 47) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
        
            if (r10.f1317 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
        
            if (r10.f1317 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
        
            r0 = r10.f1317.isWebAppInitialized();
            com.ironsource.adqualitysdk.sdk.i.ce.a.f1308 = (com.ironsource.adqualitysdk.sdk.i.ce.a.f1312 + 113) % 128;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isWebAppInitialized() {
            /*
                r10 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.ce.a.f1308
                int r0 = r0 + 53
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ce.a.f1312 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "鴩ͬ㡙ւ"
                r2 = 0
                java.lang.String r4 = "\uf528鶚䘤᳦"
                r5 = 33336(0x8238, float:4.6714E-41)
                java.lang.String r6 = "ㄫ감弋︯ꇕ̜褮༹ᆔ漟\ue157\uf5c3\udd44\uf1f2욮㵗殒绀◚⥞邮\u0b52\uda04䛩㡞︗㓸\u1ada屯薵"
                r7 = 0
                if (r0 != 0) goto L39
                com.ironsource.adqualitysdk.sdk.i.ce r0 = com.ironsource.adqualitysdk.sdk.i.ce.this
                com.ironsource.adqualitysdk.sdk.i.ch r8 = r10.f1316
                r9 = 1
                int r9 = android.view.View.combineMeasuredStates(r9, r7)
                int r5 = r5 >>> r9
                char r5 = (char) r5
                int r2 = android.widget.ExpandableListView.getPackedPositionGroup(r2)
                java.lang.String r1 = m5797(r6, r5, r4, r2, r1)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r0.m5106(r10, r8, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r10.f1317
                if (r0 == 0) goto L67
                goto L58
            L39:
                com.ironsource.adqualitysdk.sdk.i.ce r0 = com.ironsource.adqualitysdk.sdk.i.ce.this
                com.ironsource.adqualitysdk.sdk.i.ch r8 = r10.f1316
                int r9 = android.view.View.combineMeasuredStates(r7, r7)
                int r9 = r9 + r5
                char r5 = (char) r9
                int r2 = android.widget.ExpandableListView.getPackedPositionGroup(r2)
                java.lang.String r1 = m5797(r6, r5, r4, r2, r1)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r0.m5106(r10, r8, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r10.f1317
                if (r0 == 0) goto L67
            L58:
                com.unity3d.services.core.webview.WebViewApp r0 = r10.f1317
                boolean r0 = r0.isWebAppInitialized()
                int r1 = com.ironsource.adqualitysdk.sdk.i.ce.a.f1312
                int r1 = r1 + 113
                int r1 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.ce.a.f1308 = r1
                return r0
            L67:
                int r0 = com.ironsource.adqualitysdk.sdk.i.ce.a.f1312
                int r0 = r0 + 47
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ce.a.f1308 = r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.a.isWebAppInitialized():boolean");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppLoaded() {
            f1312 = (f1308 + 11) % 128;
            ce.this.m5106(this, this.f1316, m5796(26 - KeyEvent.getDeadChar(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 6662), 25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp == null) {
                return false;
            }
            f1312 = (f1308 + 3) % 128;
            boolean zIsWebAppLoaded = webViewApp.isWebAppLoaded();
            f1308 = (f1312 + 17) % 128;
            return zIsWebAppLoaded;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void removeCallback(NativeCallback nativeCallback) {
            f1312 = (f1308 + 7) % 128;
            ce.this.m5106(this, this.f1316, m5796(TextUtils.indexOf("", "", 0, 0) + 162, (char) (56436 - TextUtils.indexOf((CharSequence) "", '0')), 25 - View.getDefaultSize(0, 0)).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                webViewApp.removeCallback(nativeCallback);
                f1312 = (f1308 + 29) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void resetWebViewAppInitialization() {
            ce.this.m5106(this, this.f1316, m5797("八㉇䥖珨笿ܖꠜ┘ጱ䯄忺푏禌陶賞梬陂넌制礭楻㮽誴\ueb21뜦\ue4ae礿鄵捈\u09b5\ue9e6㙱㾣뗖䮛ꜵ酫\uf40b\ud872诏", (char) (Color.rgb(0, 0, 0) + 16822550), "\uf528鶚䘤᳦", ViewConfiguration.getEdgeSlop() >> 16, "번腛ᘲ钱").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                int i10 = f1312 + 113;
                f1308 = i10 % 128;
                int i11 = i10 % 2;
                webViewApp.resetWebViewAppInitialization();
                if (i11 != 0) {
                    throw null;
                }
            }
            int i12 = f1312 + 123;
            f1308 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean sendEvent(Enum r82, Enum r92, Object... objArr) {
            f1308 = (f1312 + 65) % 128;
            ce.this.m5106(this, this.f1316, m5796((ViewConfiguration.getFadingEdgeLength() >> 16) + 120, (char) (Process.myTid() >> 22), 20 - View.MeasureSpec.getSize(0)).intern(), r82, r92, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1317;
            if (webViewApp == null) {
                return false;
            }
            f1312 = (f1308 + 65) % 128;
            boolean zSendEvent = webViewApp.sendEvent(r82, r92, objArr);
            f1308 = (f1312 + 81) % 128;
            return zSendEvent;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setConfiguration(Configuration configuration) {
            f1308 = (f1312 + 21) % 128;
            ce.this.m5106(this, this.f1316, m5796((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 92, (char) (37361 - (Process.myTid() >> 22)), (ViewConfiguration.getPressedStateDuration() >> 16) + 27).intern(), configuration);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                f1312 = (f1308 + 79) % 128;
                webViewApp.setConfiguration(configuration);
                f1312 = (f1308 + 3) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureCode(int i10) {
            f1308 = (f1312 + 123) % 128;
            ce.this.m5106(this, this.f1316, m5797("ꖍ숖儃乍﹦ᅦ鱾岞䮠쓃\ue180눸정鈶㹮\ud8e2퇚꿆⬙ꛚ\uf889淍\uf2d2쮌奐\ue558\udd21쩈\uf3b6熷\ua7e0", (char) (24958 - (ViewConfiguration.getEdgeSlop() >> 16)), "\uf528鶚䘤᳦", (-960206802) - (Process.myTid() >> 22), "⸈쑨细捡").intern(), Integer.valueOf(i10));
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                int i11 = f1308 + 95;
                f1312 = i11 % 128;
                int i12 = i11 % 2;
                webViewApp.setWebAppFailureCode(i10);
                if (i12 == 0) {
                    int i13 = 52 / 0;
                }
                f1312 = (f1308 + 59) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureMessage(String str) {
            ce.this.m5106(this, this.f1316, m5797("퍍띓䜟\ue942쿝\ue232帽\uf6ba\uf65d\u0cf5㭫때쾈戙浘粡镀쓆唐䲬\udc15쒮횽㿰쏿\uea2eᎾ瓼ꕳه痞᩶쯕㭳", (char) (ViewConfiguration.getFadingEdgeLength() >> 16), "\uf528鶚䘤᳦", (-1) - TextUtils.lastIndexOf("", '0'), "\u12bf﹀ۮힲ").intern(), str);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                f1308 = (f1312 + 17) % 128;
                webViewApp.setWebAppFailureMessage(str);
                f1308 = (f1312 + 59) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppInitialized(boolean z10) {
            f1312 = (f1308 + 29) % 128;
            ce.this.m5106(this, this.f1316, m5797("耀당嶫\ud955ꕣ\ue64b\uec2c\u20c5鴸䥧䶕⭔焔\uf6d0ᢖ놚䨃㐾읽ཛ쪇\ud808綀䭟佲\udb32ⶠ㘄\u1759駸⁺", (char) (56155 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\uf528鶚䘤᳦", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 550039125, "吥죮嬠䏛").intern(), Boolean.valueOf(z10));
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                int i10 = f1312 + 81;
                f1308 = i10 % 128;
                int i11 = i10 % 2;
                webViewApp.setWebAppInitialized(z10);
                if (i11 != 0) {
                    throw null;
                }
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppLoaded(boolean z10) {
            f1312 = (f1308 + 67) % 128;
            ce.this.m5106(this, this.f1316, m5796(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 15825), 26 - KeyEvent.normalizeMetaState(0)).intern(), Boolean.valueOf(z10));
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                f1312 = (f1308 + 21) % 128;
                webViewApp.setWebAppLoaded(z10);
            }
            int i10 = f1312 + 117;
            f1308 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebView(WebView webView) {
            f1308 = (f1312 + 7) % 128;
            ce.this.m5106(this, this.f1316, m5796(72 - TextUtils.getTrimmedLength(""), (char) (59974 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSizeAndState(0, 0, 0) + 21).intern(), webView);
            WebViewApp webViewApp = this.f1317;
            if (webViewApp != null) {
                int i10 = f1308 + 1;
                f1312 = i10 % 128;
                int i11 = i10 % 2;
                webViewApp.setWebView(webView);
                if (i11 == 0) {
                    int i12 = 88 / 0;
                }
                f1308 = (f1312 + 49) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ WebViewApp mo5030() {
            int i10 = f1308 + 89;
            f1312 = i10 % 128;
            if (i10 % 2 != 0) {
                return m5798();
            }
            m5798();
            throw null;
        }
    }

    public static class d extends bd {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f1318 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f1319 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f1320 = 1149251818;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static short[] f1321 = null;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static byte[] f1322 = {-32, -19, 126, -124, 108, -122, 110, -118, -101, 70, -124, 116, -110, 106, -100, 13, -58, -52, -76, -50, -74, -46, -29, -114, -52, -68, -38, -78, -28, -44, 123, -52, -68, -70, -46, -60, -12, 124, -48, -60, -12, 124, -49, -61, -69, -76, -59, -50, -77, 6, -117, -14, 123, -58, -52, -68, -70, 8, -126, -65, -51, -23, 115, 93, 116, 69, 110, 88, 97, 110, UnsignedBytes.MAX_POWER_OF_TWO, 6, 87, 65, 88, 41, 82, 60, 69, 82, 100, 89, 0, 70, 82, 60, 69, 82, 68, 121, 0, 83, 71, Utf8.REPLACEMENT_BYTE, 56, 73, 82, 55, -118, Ascii.SI, 118, -1, 74, 80, SignedBytes.MAX_POWER_OF_TWO, 62, -116, 6, 67, 81};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f1323 = -390470819;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f1324 = 33;

        public d(String str) {
            super(str);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.bd
        /* JADX INFO: renamed from: ﻐ */
        final Map<String, bd.b> mo5024() {
            HashMap map = new HashMap();
            int i10 = f1318 + 103;
            f1319 = i10 % 128;
            if (i10 % 2 != 0) {
                return map;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.bd
        /* JADX INFO: renamed from: ﻛ */
        public final String mo5025() {
            String version = UnityAds.getVersion();
            if (version == null) {
                return null;
            }
            f1319 = (f1318 + 93) % 128;
            String str = version.split(m5799((ViewConfiguration.getTouchSlop() >> 8) - 1149251818, (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27), Color.argb(0, 0, 0, 0) + 390470864, (byte) KeyEvent.getDeadChar(0, 0), (-35) - ((byte) KeyEvent.getModifierMetaStateMask())).intern())[0];
            f1318 = (f1319 + 125) % 128;
            return str;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00fb  */
        @Override // com.ironsource.adqualitysdk.sdk.i.bd
        /* JADX INFO: renamed from: ﾒ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Class mo5026(java.lang.String r14) {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.d.mo5026(java.lang.String):java.lang.Class");
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m5799(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f3017) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f1324;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f1322;
                        i14 = bArr != null ? (byte) (bArr[f1320 + i10] + i13) : (short) (f1321[f1320 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f3018 = ((i10 + i14) - 2) + f1320 + i15;
                        o.f3019 = b10;
                        char c10 = (char) (i11 + f1323);
                        o.f3021 = c10;
                        sb2.append(c10);
                        o.f3020 = o.f3021;
                        o.f3022 = 1;
                        while (o.f3022 < i14) {
                            byte[] bArr2 = f1322;
                            if (bArr2 != null) {
                                int i16 = o.f3018;
                                o.f3018 = i16 - 1;
                                o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                            } else {
                                short[] sArr = f1321;
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
    }

    static {
        char[] cArr = new char[1265];
        ByteBuffer.wrap("/ð\u0000U\u0013j&a9xLi_Ur|\u0085o\u0098u«J¾AÑXäI÷u\n\\\u001dO\u0000U\u0013j&a9xLi_Ur|\u0085o\u0098i«q¾FÑEäD÷M\ny\u001dX03C\bV!i?|$\u008f1¢6µ9È\u0012\u0000U\u0013j&a9xLi_Ur|\u0085o\u0098i«q¾FÑEäD÷M\ny\u001dX03C\u0001V0i8|5\u008f:¢<µ9È\u0004Û(î\u0001\u0001\u001f\u0014\u0004'\u0011:\u0016M\u0019`ò:Ü)ã\u001cè\u0003ñvàeÜHõ¿æ¢þ\u0091È\u0084ÃëóÞÐÍØ0Æ'ô\n¹y½7\u0007$\u0015\u0011\f\u000e:{!h\u0011E\"²*¯\u0004\u009c6\u0089\u000bæ\u000fê\u008cùºÌ±Ó\u0085¦®µ¾\u0098¶o¢r\u0088A\u008bT¶;\u0081\u000e\u008e\u001d\u0081à\u0097iWzaOjPZ%y6q\u001boìYñVÂA×F¸X\u008ds\u009eUcLtYY'*+?:\u00005íhþWË\\ÔE¡T²d\u009fJhOuxFmS|<k\tl\u001a}çlðnÝ\u0013\u0000S\u0013l&g9{LQ_prT\u0085u\u0098S«P¾MÑBäU÷F\ny\u001dX0!C4V<i)|\"ÐÕÃçöíéî\u009cé\u008fï¢ËUüHÓ{ÜnÊ«Ì¸ó\u008dø\u0092áçðôÌÙå.ö3î\u0000Ø\u0015ÓzãOÀ\\È¡Ö\u0000W\u0013a&j9^Lu_erm\u0085y\u0098S«PËnØOíròM\u0087V\u0094O¹vNPS{`buq\u001aj/k<b°÷£Ð\u0096Ó\u0089×üÀïÓ\u0000U\u0013j&a9xLi_Vry\u0085r\u0098N«A¾ZÑ_\u0000U\u0013j&a9xLi_Vry\u0085r\u0098N«A¾ZÑ\u007fäY÷N\n]\u0000B\u0013e&f9bLu_frK\u0085t\u0098O«S§©´\u008e\u0081\u008d\u009e\u0089ë\u009eø\u008dÕ»\"\u009e?¯\fª\u0000B\u0013e&f9bLu_fr]\u0085j\u0098E«J¾\\\u0000B\u0013e&f9bLu_frT\u0085u\u0098S«P¾MÑBäU÷F.@=g\bd\u0017`bwqd\\i«S¶M\u0085B\u0090_ÿBÊWÙu$U3P\u001e$m/x-G;R ¡7\u008c.\u009b7æ\rõ\b\u0000B\u0013e&f9bLu_frH\u0085n\u0098O«T¾MÑ^äD÷]\n]\u001dO\u0000B\u0013e&f9bLu_frH\u0085s\u0098S«M¾\\ÑEä_÷Z\u0000B\u0013e&f9bLu_frO\u0085y\u0098B«t¾DÑMäI÷Q\nJ\u001d\u007f0/C*V<i-|9\u008f:¢=µ.\u008d\u000e\u009e)«*´.Á9Ò*ÿ\u0011\b\"\u0015\u001e&\u00073\u0016\\#i\u0013z\u001c\u0087\u0011\u0000B\u0013e&f9bLu_fr]\u0085n\u0098R«K¾ZÑeä^÷R\nW\u0000B\u0013e&f9bLu_frN\u0085u\u0098E«S\u0000c\u0013k&e9\"Le_zrq\u0085h\u0098Y«\u0017¾LÑ\u0002äC÷Q\nJ\u001dJ0)C'V-i?|~\u008f6¢9µ2È\u000eÛ\u0001î\u001a\u0001\u001f\u0014^'6:\u0019M\u0012`îsá\u0086ú\u0099Ú¬ù¿ñÒï$^7y\u0002z\u001d~hi{zVR¡i¼Y\u008fO\u009awõQÀOÓ@.A\u0000I\u0013Q&f9eLd_mrZ\u0085}\u0098N«J¾MÑ^ä|÷]\nK\u001dH0%C*V-i>{\u008ch«]¨B¬7»$¨\t\u0080þ»ã\u008bÐ\u009dÅ¯ª®\u009f\u0097\u008c\u0089q\u0082f\u0097Kà8ï-ô\u0000B\u0013e&f9bLu_frN\u0085u\u0098E«S¾dÑEäC÷@\n]\u001dR0%C6iVzqOrPv%a6r\u001bZìañQÂG×s¸T\u008d@ÝeÎmûcä$\u0091c\u0082|¯wXnE_v\u0011cJ\f\u00049E*W×LÀLí/\u009e!\u008b+´9¡xR0\u007f?h4\u0015\b\u0006\u00073\u001cÜ\u0019ÉXú\u0004ç\u0017\u0090\u001f½ñ®¬[ÌDëqøbü\u000fû8è%ðÖËÃËìÝMâ^ÕkÀtÄ\u0001Ç\u0012Ó?ÎÈÝÕáæîóÛ\u009cí©öºÆGõPý}\u0093\u000e¤\u001b\u0085$\u009b1\u0084Â\u009cï\u009dø\u0081\u0000c\u0013k&e9\"Le_zrq\u0085h\u0098Y«\u0017¾LÑ\u0002äQ÷P\nK\u001d\u00120!C V8i |1\u008f-¢=µ.ÈNÛ\"î\u001d\u0001\u0000\u0014\u001c'':\u001bM\u000e`åsá\u0086æ\u0099Û¬õ¿öÒÎåõøÅ\u000bÓ\u001eì1ÅDÃWÄjÔ}Ý\u0090¹ûæèÇÝàÂÉ·Ý¤Ö\u0089Ü~Ï\u0000A\u0013j&l9~L\u007f_}r|\u0085Z\u0098U«H¾DÑ_äS÷F\n]\u001dY0.C\u0013V-i.|\u0006\u008f=¢=µ+È!Û\u0000î8\u0001\u0000\u0014\u0011'\r:\u001dM\u000e*÷9È\fÃ\u0013ÚfËu÷XÞ¯Í²Î\u0081é\u0094ëûêÎÝÝæ î7÷\u001a\u008di\u0088|\u0099îUýjÈa×x¢i±U\u009c|kovbEEP[?I\n\u007f\u0019DäLóUÞ/\u00ad*¸;\u0000A\u0013`&N9cLb_yry\u0085h\u0000C\u0013h&a9iL~_`rH\u0085n\u0098O«T¾MÑ^äD÷]\n]\u001dO\u0000D\u0013m&i9kL~_{rk\u0085h\u0098I«G¾mÑZäU÷Z\nLõàæøÓÏÌÌ¹ÍªÄ\u0087ðpÑmú^ÞKé$ê\u0011î\u0002ÑÿøèæÅ\u009d¶\u0088£\u008f\u009c\u0080\u0089\u008b\u0000g\u0013a&|9OLe_frj\u0085y\u0098N«P¾\u007fÑIäR÷b\nQ\u001dY07C\u0005V8i<'\n4\u001f\u0001\u0004\u001e\u0004k\rx\u0018U%¢7¿\u001e\u008c(\u0099#ö\u0013Ã0Ð8-&:\u0014\u0017Yd]óøàêÕ÷ÊÄ¿î¬í\u0081ávòkÅXÛMô\"Â\u0017Ù\u0004éùÚîÒÃ¼°\u008e¥³\u009a·\u0000g\u0013a&|9KLq_yr}\u0085U\u0098D\u0000g\u0013a&|9YL~_}rl\u0085e\u0098a«@¾[Ñ`äY÷G\nL\u001dY0.C!V:\u009c«\u008f¹º¤¥\u0081Ð¦Ã¥î´\u0019½\u0004¹7\u0098\"\u0083M¸x\u0081k\u009f\u0096\u0094\u0081\u0081¬ößùÊâ\u0000a\u0013`&l9YL~_}rl\u0085e\u0098a«@¾[Ñ`äY÷G\nL\u001dY0.C!V:\u0000r\u0013a&e9cLf_qrM\u0085r\u0098I«P¾QÑmäT÷G\nt\u001dU03C0V-i\"|5\u008f&ÎßÝÙèÄ÷ã\u0082Í\u0091Î¼öKÍVýeëpÕ\u001fâ*í9âÄôÓÇþ\u0099\u008d\u0088\u0098\u0095§\u0093²\u0087A\u009el\u0099\u0010$\u0003\"6?)\u0018\\6O5b\t\u0095:\u0088\u0012»\u0012®\u000eÁ\u001cô\u0007ç2\u001a\r\r\u001a mSsý~îxÛeÄE±e¢l\u008fbx`eTVXC_,A\u0019`\nI\u0000g\u0013a&|9NLq_zrv\u0085y\u0098R«h¾AÑ_äD÷Q\nV\u001dY02\u0000s\u0013a&|9NLq_zrv\u0085y\u0098R«h¾AÑ_äD÷Q\nV\u001dY02\u0000g\u0013a&|9CL`_drw\u0085n\u0098T«Q¾FÑEäD÷M\nq\u001dX\u0000g\u0013a&|9\\L|_ur{\u0085y\u0098M«A¾FÑXäy÷P\n~\u001dN0/C)V\ti(|\u001f\u008f6¢2µ9È\u0003Û\u0010\u0000g\u0013a&|9@L\u007f_ur|\u0085S\u0098P«P¾AÑCä^÷Gµú¦ü\u0093á\u008cÕùìêýÇäDÍWËbÖ}á\bÛ\u001bÓ6×ÁÿÜîïÈúð\u0095é ÷³ÝNþYÿt\u008f\u0007\u0080\u0012\u0096-¶8\u0088Ë\u0091æ\u0082ñ\u0093\u008c¸\u009fºª«E£P©øÜëÚÞÇÁç´Ç§Î\u008aÀ}Â`öSúFý)ã\u001cÂ\u000fëòÅåõÈ\u0094»\u0092®·\u0091\u009e\u0084\u008aw\u0088Z\u008dM\u00880¨#«\u0016ºù´ì\u008eß¹Â¦µ©\u0098OL9_?j\"u\u0001\u0000:\u00138>/É,Ô\u0019ç.ò\u0017\u009d\u0015¨\u001d\u0000A\u0013@&]9BLY_@\u0000V\u0013M&L9IL__DrT\u0085]\u0098y«a¾z\u0000R\u0013A&Y9YLU_GrLÞYÍJøPçH\u0092W\u0081I¬V¥©¶¯\u0083¡\u009c®é¿C1P9e4z0\u000f'\u001c%1>Æ'Û\u0004è\u001fý\u000e\u0092\u0007\u0000S\u0013P&G9^LQ_Sr]Ç\u0089Ô\u009dá\u008cþ\u0086\u008b\u009f\u0098\u009cµ\u0092B\u0084_¿\u0000L\u0013M&N9ILS_Mr[\u0085P\u0098e\u0089\u001d\u009a\u0015¯\u001b°\u0002Å\u0002Ö\u000fû\u0012\f\u0007\u0000F\u0013E&A9@LU_P".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1265);
        f1291 = cArr;
        f1292 = -847298327511756028L;
    }

    public ce(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    static /* synthetic */ String m5761() {
        f1290 = (f1289 + 35) % 128;
        String strM5762 = m5762();
        f1289 = (f1290 + 99) % 128;
        return strM5762;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m5762() {
        int i10 = f1290 + 93;
        f1289 = i10 % 128;
        if (i10 % 2 == 0) {
            return ClientProperties.getGameId();
        }
        int i11 = 96 / 0;
        return ClientProperties.getGameId();
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ Object m5763() {
        f1290 = (f1289 + 13) % 128;
        Object objM5764 = m5764();
        f1290 = (f1289 + 123) % 128;
        return objM5764;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static Object m5764() {
        f1290 = (f1289 + 81) % 128;
        IUnityAdsListener listener = UnityAds.getListener();
        int i10 = f1289 + 61;
        f1290 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
        }
        return listener;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static Object m5767() {
        f1289 = (f1290 + 95) % 128;
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        f1289 = (f1290 + 113) % 128;
        return currentApp;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static String m5768() {
        int i10 = f1289 + 79;
        f1290 = i10 % 128;
        if (i10 % 2 == 0) {
            ClientProperties.getGameId();
            throw null;
        }
        String gameId = ClientProperties.getGameId();
        f1290 = (f1289 + 55) % 128;
        return gameId;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static void m5769(IUnityAdsListener iUnityAdsListener) {
        f1289 = (f1290 + 25) % 128;
        UnityAds.removeListener(iUnityAdsListener);
        f1290 = (f1289 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5771(AdObject adObject) {
        int i10 = f1289 + 39;
        f1290 = i10 % 128;
        if (i10 % 2 == 0) {
            m5781(adObject);
            throw null;
        }
        String strM5781 = m5781(adObject);
        int i11 = f1290 + 105;
        f1289 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 96 / 0;
        }
        return strM5781;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ByteString m5775(AdObject adObject) {
        int i10 = f1290 + 21;
        f1289 = i10 % 128;
        int i11 = i10 % 2;
        ByteString byteStringM5786 = m5786(adObject);
        if (i11 != 0) {
            int i12 = 66 / 0;
        }
        int i13 = f1289 + 59;
        f1290 = i13 % 128;
        if (i13 % 2 != 0) {
            return byteStringM5786;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m5782(BannerView bannerView) {
        int i10 = f1290 + 101;
        f1289 = i10 % 128;
        int i11 = i10 % 2;
        String strM5791 = m5791(bannerView);
        if (i11 != 0) {
            int i12 = 73 / 0;
        }
        return strM5791;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m5788(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1289 + 33;
        f1290 = i10 % 128;
        int i11 = i10 % 2;
        m5773(iUnityAdsListener);
        if (i11 == 0) {
            int i12 = 12 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ UnityAdsLoadOptions m5790(AdObject adObject) {
        f1289 = (f1290 + 45) % 128;
        UnityAdsLoadOptions unityAdsLoadOptionsM5765 = m5765(adObject);
        f1289 = (f1290 + 103) % 128;
        return unityAdsLoadOptionsM5765;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Enum m5766(java.lang.String r9) {
        /*
            int r0 = r9.hashCode()
            r1 = 183181625(0xaeb2139, float:2.2642174E-32)
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == r1) goto L37
            r1 = 2066319421(0x7b29883d, float:8.802614E35)
            if (r0 == r1) goto L15
            goto L6d
        L15:
            int r0 = android.widget.ExpandableListView.getPackedPositionGroup(r5)
            int r0 = r0 + 1259
            int r1 = android.graphics.Color.red(r4)
            char r1 = (char) r1
            int r2 = android.view.MotionEvent.axisFromString(r2)
            int r2 = r2 + 7
            java.lang.String r0 = m5778(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            boolean r9 = r9.equals(r0)
            if (r9 == r3) goto L35
            goto L6d
        L35:
            r4 = r3
            goto L6e
        L37:
            r0 = 48
            int r0 = android.text.TextUtils.indexOf(r2, r0, r4)
            int r0 = r0 + 1252
            r1 = 35165(0x895d, float:4.9277E-41)
            int r2 = android.widget.ExpandableListView.getPackedPositionChild(r5)
            int r1 = r1 - r2
            char r1 = (char) r1
            long r7 = android.os.Process.getElapsedCpuTime()
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r2 = r2 + 7
            java.lang.String r0 = m5778(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L6d
            int r9 = com.ironsource.adqualitysdk.sdk.i.ce.f1289
            int r9 = r9 + 19
            int r9 = r9 % 128
            com.ironsource.adqualitysdk.sdk.i.ce.f1290 = r9
            int r9 = r9 + 35
            int r9 = r9 % 128
            com.ironsource.adqualitysdk.sdk.i.ce.f1289 = r9
            goto L6e
        L6d:
            r4 = -1
        L6e:
            if (r4 == 0) goto L77
            if (r4 == r3) goto L74
            r9 = 0
            return r9
        L74:
            com.unity3d.services.core.request.WebRequestEvent r9 = com.unity3d.services.core.request.WebRequestEvent.FAILED
            return r9
        L77:
            com.unity3d.services.core.request.WebRequestEvent r9 = com.unity3d.services.core.request.WebRequestEvent.COMPLETE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.m5766(java.lang.String):java.lang.Enum");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ BannerView.IListener m5776(BannerView bannerView) {
        int i10 = f1289 + 125;
        f1290 = i10 % 128;
        if (i10 % 2 == 0) {
            m5770(bannerView);
            throw null;
        }
        BannerView.IListener iListenerM5770 = m5770(bannerView);
        f1290 = (f1289 + 51) % 128;
        return iListenerM5770;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m5783(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i10 = f1289 + 109;
        f1290 = i10 % 128;
        int i11 = i10 % 2;
        String strM5787 = m5787(diagnosticEvent);
        if (i11 == 0) {
            int i12 = 68 / 0;
        }
        return strM5787;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m5789(BannerView bannerView, BannerView.IListener iListener) {
        int i10 = f1290 + 123;
        f1289 = i10 % 128;
        int i11 = i10 % 2;
        m5785(bannerView, iListener);
        if (i11 != 0) {
            throw null;
        }
        f1289 = (f1290 + 29) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m5793(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i10 = f1289 + 63;
        f1290 = i10 % 128;
        if (i10 % 2 == 0) {
            m5772(unityAdsLoadOptions);
            throw null;
        }
        JSONObject jSONObjectM5772 = m5772(unityAdsLoadOptions);
        int i11 = f1289 + 41;
        f1290 = i11 % 128;
        if (i11 % 2 != 0) {
            return jSONObjectM5772;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5778(Color.red(0) + EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 19 - ExpandableListView.getPackedPositionChild(0L)).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5767();
            }
        });
        map.put(m5778(826 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (10089 - View.MeasureSpec.getMode(0)), TextUtils.getOffsetAfter("", 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.this.m5795(list.get(0), chVar);
            }
        });
        map.put(m5778(843 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (62347 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 20 - Color.green(0)).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                ce.m5774(list.get(0));
                return null;
            }
        });
        map.put(m5778(View.combineMeasuredStates(0, 0) + 863, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5768();
            }
        });
        map.put(m5778(872 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5763();
            }
        });
        map.put(m5778(ExpandableListView.getPackedPositionType(0L) + 891, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 40151), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                ce.m5784((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m5778((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE, (char) Color.blue(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                ce.m5788((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m5778((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 929, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                ce.m5794((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m5778(951 - Gravity.getAbsoluteGravity(0, 0), (char) (52920 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5777((String) list.get(0));
            }
        });
        map.put(m5778((-16776242) - Color.rgb(0, 0, 0), (char) (4163 - View.MeasureSpec.makeMeasureSpec(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5766((String) list.get(0));
            }
        });
        map.put(m5778(Color.argb(0, 0, 0, 0) + 992, (char) (64793 - (ViewConfiguration.getPressedStateDuration() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5782((BannerView) list.get(0));
            }
        });
        map.put(m5778(View.getDefaultSize(0, 0) + 1006, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5776((BannerView) list.get(0));
            }
        });
        map.put(m5778(TextUtils.getCapsMode("", 0, 0) + 1023, (char) (ViewConfiguration.getScrollBarSize() >> 8), 18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                ce.m5789((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        map.put(m5778(KeyEvent.normalizeMetaState(0) + IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, (char) ExpandableListView.getPackedPositionType(0L), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5775((AdObject) list.get(0));
            }
        });
        map.put(m5778(ImageFormat.getBitsPerPixel(0) + IronSourceError.ERROR_RV_EXPIRED_ADS, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5771((AdObject) list.get(0));
            }
        });
        map.put(m5778(1082 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) TextUtils.getOffsetAfter("", 0), KeyEvent.getDeadChar(0, 0) + 14).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5790((AdObject) list.get(0));
            }
        });
        map.put(m5778(1096 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (46493 - (ViewConfiguration.getScrollBarSize() >> 8)), 6 - ExpandableListView.getPackedPositionChild(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5793((UnityAdsLoadOptions) list.get(0));
            }
        });
        map.put(m5778((ViewConfiguration.getPressedStateDuration() >> 16) + 1103, (char) (TextUtils.indexOf((CharSequence) "", '0') + 17579), Gravity.getAbsoluteGravity(0, 0) + 29).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5761();
            }
        });
        map.put(m5778((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1131, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 63675), 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5783((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        map.put(m5778(View.getDefaultSize(0, 0) + 1165, (char) (Drawable.resolveOpacity(0, 0) + 19550), View.resolveSizeAndState(0, 0, 0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return ce.m5779((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        int i10 = f1290 + 9;
        f1289 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 28 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m5779(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        f1289 = (f1290 + 51) % 128;
        Map mapM5792 = m5792(diagnosticEvent);
        int i10 = f1289 + 91;
        f1290 = i10 % 128;
        if (i10 % 2 != 0) {
            return mapM5792;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5784(IUnityAdsListener iUnityAdsListener) {
        f1289 = (f1290 + 41) % 128;
        m5780(iUnityAdsListener);
        int i10 = f1290 + 31;
        f1289 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ByteString m5786(AdObject adObject) {
        int i10 = f1290 + 49;
        f1289 = i10 % 128;
        if (i10 % 2 != 0) {
            adObject.getOpportunityId();
            throw null;
        }
        ByteString opportunityId = adObject.getOpportunityId();
        f1290 = (f1289 + 59) % 128;
        return opportunityId;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5794(IUnityAdsListener iUnityAdsListener) {
        f1289 = (f1290 + 87) % 128;
        m5769(iUnityAdsListener);
        int i10 = f1289 + 93;
        f1290 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5787(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        f1290 = (f1289 + 9) % 128;
        String placementId = diagnosticEvent.getPlacementId();
        int i10 = f1289 + 95;
        f1290 = i10 % 128;
        if (i10 % 2 != 0) {
            return placementId;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f1289 = (f1290 + 57) % 128;
        String version = UnityAds.getVersion();
        if (version != null) {
            int i10 = f1290 + 5;
            f1289 = i10 % 128;
            return i10 % 2 != 0 ? version.split(m5778(Color.blue(0), (char) (7564 - (AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1))), 1 - TextUtils.getTrimmedLength("")).intern())[1] : version.split(m5778(Color.blue(0), (char) (12254 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1 - TextUtils.getTrimmedLength("")).intern())[0];
        }
        f1290 = (f1289 + 113) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m5795(Object obj, ch chVar) {
        a aVar = new a((WebViewApp) obj, chVar);
        int i10 = f1289 + 83;
        f1290 = i10 % 128;
        if (i10 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5026(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 2270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m5785(BannerView bannerView, BannerView.IListener iListener) {
        int i10 = f1289 + 107;
        f1290 = i10 % 128;
        int i11 = i10 % 2;
        bannerView.setListener(iListener);
        if (i11 == 0) {
            int i12 = 11 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static UnityAdsLoadOptions m5765(AdObject adObject) {
        int i10 = f1289 + 115;
        f1290 = i10 % 128;
        int i11 = i10 % 2;
        UnityAdsLoadOptions loadOptions = adObject.getLoadOptions();
        if (i11 == 0) {
            int i12 = 12 / 0;
        }
        return loadOptions;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5781(AdObject adObject) {
        f1290 = (f1289 + 33) % 128;
        String placementId = adObject.getPlacementId();
        int i10 = f1289 + 93;
        f1290 = i10 % 128;
        if (i10 % 2 != 0) {
            return placementId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m5780(IUnityAdsListener iUnityAdsListener) {
        f1290 = (f1289 + 29) % 128;
        UnityAds.setListener(iUnityAdsListener);
        int i10 = f1289 + 67;
        f1290 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Enum m5777(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.m5777(java.lang.String):java.lang.Enum");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5773(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1289 + 95;
        f1290 = i10 % 128;
        int i11 = i10 % 2;
        UnityAds.addListener(iUnityAdsListener);
        if (i11 == 0) {
            throw null;
        }
        f1290 = (f1289 + 97) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m5774(Object obj) {
        f1289 = (f1290 + 89) % 128;
        WebViewApp.setCurrentApp((a) obj);
        f1289 = (f1290 + 81) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5778(int i10, char c10, int i11) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1677) {
            try {
                char[] cArr = new char[i11];
                com.ironsource.adqualitysdk.sdk.i.d.f1676 = 0;
                while (true) {
                    int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1291[i10 + i12]) ^ (((long) i12) * f1292)) ^ ((long) c10));
                        com.ironsource.adqualitysdk.sdk.i.d.f1676 = i12 + 1;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static BannerView.IListener m5770(BannerView bannerView) {
        int i10 = f1290 + 1;
        f1289 = i10 % 128;
        if (i10 % 2 == 0) {
            return bannerView.getListener();
        }
        bannerView.getListener();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m5772(UnityAdsLoadOptions unityAdsLoadOptions) {
        f1290 = (f1289 + 65) % 128;
        JSONObject data = unityAdsLoadOptions.getData();
        f1290 = (f1289 + 119) % 128;
        return data;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5791(BannerView bannerView) {
        int i10 = f1289 + 65;
        f1290 = i10 % 128;
        if (i10 % 2 != 0) {
            return bannerView.getPlacementId();
        }
        bannerView.getPlacementId();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map m5792(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        f1290 = (f1289 + 21) % 128;
        Map<String, String> stringTagsMap = diagnosticEvent.getStringTagsMap();
        int i10 = f1290 + 97;
        f1289 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 74 / 0;
        }
        return stringTagsMap;
    }
}
