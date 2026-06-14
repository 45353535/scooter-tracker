package sg.bigo.ads.core.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;

/* JADX INFO: loaded from: classes4.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f104325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.core.h.c f104326b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f104327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1293b f104328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f104329i;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final b f104330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final C1293b f104331b;

        public a(@NonNull b bVar, @NonNull C1293b c1293b) {
            this.f104330a = bVar;
            this.f104331b = c1293b;
        }

        @JavascriptInterface
        public final void onCustomJSEventCallback(String str, String str2) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "onCustomJSEventCallback, eventType: " + str + ", eventJson: " + str2);
            sg.bigo.ads.core.h.c customWebChromeClient = this.f104330a.getCustomWebChromeClient();
            if (customWebChromeClient != null) {
                customWebChromeClient.a(this.f104330a, str, str2);
            }
        }

        @JavascriptInterface
        public final void webCollect(String str) {
            String string;
            C1293b c1293b = this.f104331b;
            if (c1293b.f104332a == null) {
                c1293b.f104332a = new ArrayList();
            }
            if (!str.contains("notify") || str.startsWith(C4240b4.j.f42672d)) {
                string = str;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put(BidResponsed.KEY_CUR, SystemClock.elapsedRealtime());
                    string = jSONObject.toString();
                } catch (Exception unused) {
                    string = str;
                }
            }
            c1293b.f104332a.add(string);
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "webCollect: ".concat(str));
        }

        @JavascriptInterface
        public final void webStat(String str, String str2) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "statUniversalInfo, eventId: " + str + ", msgJson: " + str2);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.h.b$b, reason: collision with other inner class name */
    public static class C1293b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<String> f104332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<String> f104333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Boolean f104334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Boolean f104335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f104336e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f104337f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f104338g = -1;

        final boolean a(String str) {
            List<String> list = this.f104333b;
            if (str != null && list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f104340b;

        private c() {
        }

        public final Boolean a() {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "Try to check not blank by bit");
            if (this.f104340b != null) {
                sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "Has result for checking not blank by bit");
                return this.f104340b;
            }
            b bVar = b.this;
            if (bVar.f104342j) {
                sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "WebView is destroyed stop checking not blank by bit");
                return null;
            }
            int width = bVar.getWidth();
            int height = b.this.getHeight();
            if (width > 0 && height > 0) {
                try {
                    int[] iArr = new int[width * height];
                    Bitmap bitmapA = sg.bigo.ads.common.utils.d.a(width, height, Bitmap.Config.RGB_565);
                    if (bitmapA == null) {
                        return null;
                    }
                    b.this.draw(new Canvas(bitmapA));
                    bitmapA.getPixels(iArr, 0, width, 0, 0, width, height);
                    bitmapA.recycle();
                    this.f104340b = Boolean.valueOf(!a(iArr));
                    sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "The result of current banner checking not blank by bit: " + this.f104340b);
                    return this.f104340b;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public /* synthetic */ c(b bVar, byte b10) {
            this();
        }

        private static boolean a(int[] iArr) {
            if (iArr.length <= 0) {
                return false;
            }
            int length = iArr.length;
            int i10 = length - 1;
            int i11 = 0;
            while (true) {
                int i12 = length / 2;
                if (i11 >= i12 || i10 < i12) {
                    return true;
                }
                if (iArr[i11] != iArr[i10]) {
                    return false;
                }
                i11++;
                i10--;
            }
        }
    }

    public b(Context context) {
        super(context);
        this.f104327g = false;
        C1293b c1293b = new C1293b();
        this.f104328h = c1293b;
        a aVar = new a(this, c1293b);
        this.f104325a = aVar;
        addJavascriptInterface(aVar, "bigossp");
    }

    final void a(int i10, WebResourceRequest webResourceRequest, int i11, CharSequence charSequence) {
        if (webResourceRequest != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "UniversalWebView", "dispatchResourceError, type: " + i10 + ", url: " + webResourceRequest.getUrl() + ", errorCode: " + i11 + ", desc: " + ((Object) charSequence));
            C1293b c1293b = this.f104328h;
            String strValueOf = String.valueOf(webResourceRequest.getUrl());
            if (c1293b.f104333b == null) {
                c1293b.f104333b = new ArrayList();
            }
            c1293b.f104333b.add(strValueOf);
        }
    }

    @Nullable
    public sg.bigo.ads.core.h.c getCustomWebChromeClient() {
        return this.f104326b;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        this.f104326b = webChromeClient instanceof sg.bigo.ads.core.h.c ? (sg.bigo.ads.core.h.c) webChromeClient : null;
        super.setWebChromeClient(webChromeClient);
    }

    public static void a(@NonNull C1293b c1293b) {
        List<String> list;
        long jElapsedRealtime;
        JSONObject jSONObjectOptJSONObject;
        if (!i.f102116a.n().a(0) || (list = c1293b.f104332a) == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            if (str.startsWith(C4240b4.j.f42672d)) {
                sb2.append(str.substring(1, str.length() - 1));
                sb2.append(StringUtils.COMMA);
            }
            sb2.append(str);
            sb2.append(StringUtils.COMMA);
        }
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray(C4240b4.j.f42672d + sb2.substring(0, sb2.length() - 1) + C4240b4.j.f42674e);
            int length = jSONArray2.length();
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("type");
                    if ("render_start".equals(strOptString)) {
                        jSONObject = jSONObjectOptJSONObject2;
                    }
                    if (Reporting.EventType.RENDER.equals(strOptString) && jSONObject2 == null) {
                        jSONObject2 = jSONObjectOptJSONObject2;
                    }
                    if (!"mayError".equals(strOptString) || ((jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("params")) != null && c1293b.a(jSONObjectOptJSONObject.optString("url")))) {
                        jSONArray.put(jSONObjectOptJSONObject2);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                sg.bigo.ads.core.d.b.a(3002, 10113, jSONArray.toString());
            }
            if (jSONObject != null) {
                if (jSONObject2 != null) {
                    c1293b.f104334c = Boolean.TRUE;
                    jElapsedRealtime = jSONObject2.optLong(BidResponsed.KEY_CUR);
                } else {
                    c1293b.f104334c = Boolean.FALSE;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                c1293b.f104336e = jElapsedRealtime;
            }
        } catch (Exception unused) {
        }
    }
}
