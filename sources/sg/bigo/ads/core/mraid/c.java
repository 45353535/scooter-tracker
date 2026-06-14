package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.sdk.AppLovinMediationProvider;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.core.mraid.a.a;
import sg.bigo.ads.core.mraid.h;
import sg.bigo.ads.core.mraid.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    b f104397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    C1296c f104398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    sg.bigo.ads.common.ac.a f104399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f104400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f104401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final n f104402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final h f104403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WebViewClient f104404h;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104411a;

        static {
            int[] iArr = new int[g.values().length];
            f104411a = iArr;
            try {
                iArr[g.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104411a[g.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104411a[g.UNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104411a[g.EXPAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f104411a[g.USE_CUSTOM_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f104411a[g.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f104411a[g.SET_ORIENTATION_PROPERTIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f104411a[g.PLAY_VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f104411a[g.STORE_PICTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f104411a[g.CREATE_CALENDAR_EVENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f104411a[g.UNSPECIFIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(int i10, int i11, int i12, int i13, @NonNull a.EnumC1295a enumC1295a, boolean z10);

        void a(String str);

        void a(String str, @Nullable sg.bigo.ads.common.i iVar);

        void a(String str, boolean z10);

        void a(sg.bigo.ads.core.mraid.b bVar);

        void a(boolean z10);

        void a(boolean z10, i iVar);

        boolean a(@NonNull JsResult jsResult);

        void b();

        void b(boolean z10);

        void c();

        boolean d();

        void e();

        void f();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$c, reason: collision with other inner class name */
    public static class C1296c extends sg.bigo.ads.core.h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        p f104412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f104413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private a f104414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private sg.bigo.ads.common.i f104415d;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$c$a */
        public interface a {
            void a(sg.bigo.ads.core.mraid.b bVar);

            void a(boolean z10);
        }

        private C1296c(Context context) {
            super(context);
            this.f104415d = new sg.bigo.ads.common.i();
            this.f104412a = new p(this);
            this.f104412a.f104528d = new p.b() { // from class: sg.bigo.ads.core.mraid.c.c.1
                @Override // sg.bigo.ads.core.mraid.p.b
                public final void a(boolean z10, sg.bigo.ads.core.mraid.b bVar) {
                    C1296c.this.setMraidViewable(z10);
                    C1296c.a(C1296c.this, bVar);
                }
            };
        }

        static /* synthetic */ void a(C1296c c1296c, sg.bigo.ads.core.mraid.b bVar) {
            a aVar = c1296c.f104414c;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMraidViewable(boolean z10) {
            if (this.f104413b == z10) {
                return;
            }
            this.f104413b = z10;
            a aVar = this.f104414c;
            if (aVar != null) {
                aVar.a(z10);
            }
        }

        @Override // sg.bigo.ads.core.h.e, android.webkit.WebView
        public final void destroy() {
            super.destroy();
            setWebChromeClient(null);
            setWebViewClient(null);
            this.f104412a = null;
            this.f104414c = null;
        }

        @Nullable
        public final sg.bigo.ads.common.i getClickPoints() {
            return this.f104415d;
        }

        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.f104415d.f102538b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.f104415d.f102537a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        protected final void onVisibilityChanged(@NonNull View view, int i10) {
            super.onVisibilityChanged(view, i10);
            if (this.f104412a == null) {
                setMraidViewable(i10 == 0);
            } else if (i10 != 0) {
                setMraidViewable(false);
            }
        }

        final void setVisibilityChangedListener(@Nullable a aVar) {
            this.f104414c = aVar;
        }

        /* synthetic */ C1296c(Context context, byte b10) {
            this(context);
        }
    }

    c(@Nullable n nVar) {
        this(nVar, new h());
    }

    private static int a(int i10, int i11) throws d {
        if (i10 < i11 || i10 > 100000) {
            throw new d("Integer parameter out of range: ".concat(String.valueOf(i10)));
        }
        return i10;
    }

    @NonNull
    private static String b(Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    private boolean d() {
        sg.bigo.ads.common.ac.a aVar = this.f104399c;
        if (aVar != null) {
            return this.f104401e ? aVar.f102283a.f102286a : aVar.a();
        }
        return false;
    }

    private static String e(String str) throws d {
        if (str != null) {
            return str;
        }
        throw new d("Parameter cannot be null");
    }

    private static int f(@NonNull String str) throws d {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new d("Invalid numeric parameter: ".concat(String.valueOf(str)));
        }
    }

    private static boolean g(String str) throws d {
        if ("true".equals(str)) {
            return true;
        }
        if ("false".equals(str)) {
            return false;
        }
        throw new d("Invalid boolean parameter: ".concat(String.valueOf(str)));
    }

    final void c(@NonNull String str) {
        if (this.f104398b == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Attempted to inject Javascript into MRAID WebView while was not attached:\n\t".concat(String.valueOf(str)));
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Injecting Javascript into MRAID WebView:\n\t".concat(String.valueOf(str)));
            this.f104398b.loadUrl("javascript:".concat(String.valueOf(str)));
        }
    }

    @VisibleForTesting
    private c(@Nullable n nVar, @NonNull h hVar) {
        this.f104401e = false;
        this.f104404h = new k() { // from class: sg.bigo.ads.core.mraid.c.4
            @Override // sg.bigo.ads.core.mraid.k, sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                c cVar = c.this;
                sg.bigo.ads.common.t.a.a(0, "MraidBridge", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                cVar.a();
                b bVar = cVar.f104397a;
                if (bVar != null) {
                    bVar.c();
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(@NonNull WebView webView, @NonNull String str) {
                p pVar;
                super.onPageFinished(webView, str);
                c cVar = c.this;
                if (cVar.f104400d) {
                    return;
                }
                cVar.f104400d = true;
                C1296c c1296c = cVar.f104398b;
                if (c1296c != null && (pVar = c1296c.f104412a) != null && !pVar.f104529e) {
                    pVar.f104529e = true;
                    pVar.f104527c.postDelayed(pVar.f104526b, 500L);
                }
                b bVar = cVar.f104397a;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(@NonNull WebView webView, int i10, @NonNull String str, @NonNull String str2) {
                sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Error: ".concat(String.valueOf(str)));
                super.onReceivedError(webView, i10, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(@NonNull WebView webView, String str) {
                return c.this.d(str);
            }
        };
        this.f104402f = nVar;
        this.f104403g = hVar;
    }

    @NonNull
    private static String a(Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }

    public final void b(String str) {
        C1296c c1296c = this.f104398b;
        if (c1296c == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "MRAID bridge called setContentHtml while WebView was not attached");
        } else {
            this.f104400d = false;
            c1296c.loadUrl(str);
        }
    }

    final boolean c() {
        return this.f104398b != null;
    }

    @VisibleForTesting
    final boolean d(String str) {
        Map<String, String> mapA;
        i iVar;
        String str2;
        StringBuilder sb2;
        b bVar;
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return true;
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (AppLovinMediationProvider.MOPUB.equals(scheme)) {
                if ("failLoad".equals(host) && this.f104402f == n.INLINE && (bVar = this.f104397a) != null) {
                    bVar.b();
                }
                return true;
            }
            if (d() && !"mraid".equals(scheme)) {
                try {
                    sb2 = new StringBuilder("mraid://open?url=");
                    str2 = str;
                } catch (UnsupportedEncodingException unused) {
                    str2 = str;
                }
                try {
                    sb2.append(URLEncoder.encode(str2, "UTF-8"));
                    uri = Uri.parse(sb2.toString());
                    host = uri.getHost();
                    scheme = uri.getScheme();
                } catch (UnsupportedEncodingException unused2) {
                    sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Invalid MRAID URL encoding: ".concat(String.valueOf(str2)));
                    a(g.OPEN, "Non-mraid URL is invalid");
                    return false;
                }
            }
            if (!"mraid".equals(scheme)) {
                sg.bigo.ads.common.ac.a aVar = this.f104399c;
                return aVar != null && aVar.a();
            }
            final g gVarA = g.a(host);
            try {
                mapA = a(uri);
                if (gVarA.a(this.f104402f) && !d()) {
                    throw new d("Cannot execute this command unless the user clicks");
                }
            } catch (IllegalArgumentException e10) {
                e = e10;
                a(gVarA, e.getMessage());
            } catch (d e11) {
                e = e11;
                a(gVarA, e.getMessage());
            }
            if (this.f104397a == null) {
                throw new d("Invalid state to execute this command");
            }
            if (this.f104398b == null) {
                throw new d("The current WebView is being destroyed");
            }
            switch (AnonymousClass6.f104411a[gVarA.ordinal()]) {
                case 1:
                    this.f104397a.f();
                    break;
                case 2:
                    int iA = a(f(mapA.get("width")), 0);
                    int iA2 = a(f(mapA.get("height")), 0);
                    int iA3 = a(f(mapA.get("offsetX")), -100000);
                    int iA4 = a(f(mapA.get("offsetY")), -100000);
                    String str3 = mapA.get("customClosePosition");
                    a.EnumC1295a enumC1295a = a.EnumC1295a.TOP_RIGHT;
                    if (!TextUtils.isEmpty(str3)) {
                        if (str3.equals(C4240b4.e.f42563c)) {
                            enumC1295a = a.EnumC1295a.TOP_LEFT;
                        } else if (!str3.equals(C4240b4.e.f42562b)) {
                            if (str3.equals("center")) {
                                enumC1295a = a.EnumC1295a.CENTER;
                            } else if (str3.equals(C4240b4.e.f42565e)) {
                                enumC1295a = a.EnumC1295a.BOTTOM_LEFT;
                            } else if (str3.equals(C4240b4.e.f42564d)) {
                                enumC1295a = a.EnumC1295a.BOTTOM_RIGHT;
                            } else if (str3.equals("top-center")) {
                                enumC1295a = a.EnumC1295a.TOP_CENTER;
                            } else {
                                if (!str3.equals("bottom-center")) {
                                    throw new d("Invalid close position: ".concat(str3));
                                }
                                enumC1295a = a.EnumC1295a.BOTTOM_CENTER;
                            }
                        }
                    }
                    this.f104397a.a(iA, iA2, iA3, iA4, enumC1295a, a(mapA.get("allowOffscreen"), true));
                    this.f104397a.b(false);
                    break;
                case 3:
                    this.f104397a.e();
                    break;
                case 4:
                    this.f104397a.a(mapA.get("url"), a(mapA));
                    break;
                case 5:
                    this.f104397a.b(a(mapA));
                    break;
                case 6:
                    this.f104397a.a(e(mapA.get("url")), this.f104398b.getClickPoints());
                    break;
                case 7:
                    boolean zG = g(mapA.get("allowOrientationChange"));
                    String str4 = mapA.get("forceOrientation");
                    if ("portrait".equals(str4)) {
                        iVar = i.PORTRAIT;
                    } else if ("landscape".equals(str4)) {
                        iVar = i.LANDSCAPE;
                    } else {
                        if (!"none".equals(str4)) {
                            throw new d("Invalid orientation: ".concat(String.valueOf(str4)));
                        }
                        iVar = i.NONE;
                    }
                    this.f104397a.a(zG, iVar);
                    break;
                case 8:
                    this.f104397a.a(e(mapA.get(com.taurusx.tax.o.g.f66428y)));
                    break;
                case 9:
                    String strE = e(mapA.get(com.taurusx.tax.o.g.f66428y));
                    h hVar = this.f104403g;
                    Context context = this.f104398b.getContext();
                    h.c cVar = new h.c() { // from class: sg.bigo.ads.core.mraid.c.5
                        @Override // sg.bigo.ads.core.mraid.h.c
                        public final void a(d dVar) {
                            c.this.a(gVarA, dVar.getMessage());
                        }
                    };
                    if (!h.c(context)) {
                        sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                        throw new d("Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted.");
                    }
                    if (!(context instanceof Activity)) {
                        Toast.makeText(context, "Downloading image", 0).show();
                        hVar.a(context, strE, cVar);
                    } else {
                        new AlertDialog.Builder(context).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: sg.bigo.ads.core.mraid.h.3

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ Context f104486a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ String f104487b;

                            /* JADX INFO: renamed from: c */
                            final /* synthetic */ c f104488c;

                            AnonymousClass3(Context context2, String strE2, c cVar2) {
                                context = context2;
                                str = strE2;
                                cVar = cVar2;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                h.this.a(context, str, cVar);
                            }
                        }).setCancelable(true).show();
                    }
                    break;
                    break;
                case 10:
                    h.a(this.f104398b.getContext(), mapA);
                    break;
                case 11:
                    throw new d("Unspecified MRAID Javascript command");
            }
            c("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(gVarA.f104478l) + ")");
            return true;
        } catch (Exception unused3) {
            return true;
        }
    }

    @NonNull
    private static Map<String, String> a(@NonNull Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str)));
        }
        return map;
    }

    final boolean b() {
        C1296c c1296c = this.f104398b;
        return c1296c != null && c1296c.f104413b;
    }

    @Nullable
    static C1296c a(@NonNull Context context) {
        try {
            return new C1296c(context, (byte) 0);
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(e10));
            return null;
        }
    }

    final void a() {
        C1296c c1296c = this.f104398b;
        if (c1296c != null) {
            c1296c.setOnTouchListener(null);
            this.f104398b.setVisibilityChangedListener(null);
            this.f104398b.destroy();
            this.f104398b = null;
        }
    }

    public final void a(@NonNull String str) {
        if (this.f104398b == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "MRAID bridge called setContentHtml before WebView was attached");
            return;
        }
        this.f104400d = false;
        sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "MraidBridge setContentHtml");
        this.f104398b.loadDataWithBaseURL("https://mraid.bigo.sg", str, "text/html", null, null);
    }

    final void a(sg.bigo.ads.core.mraid.b bVar) {
        StringBuilder sb2 = new StringBuilder("mraidbridge.notifyExposureChangeEvent(");
        sb2.append(String.valueOf(bVar.f104394a) + ", " + sg.bigo.ads.core.mraid.b.a(bVar.f104395b) + ", " + sg.bigo.ads.core.mraid.b.a(bVar.f104396c));
        sb2.append(");");
        c(sb2.toString());
    }

    final void a(@NonNull C1296c c1296c) {
        this.f104398b = c1296c;
        c1296c.getSettings().setJavaScriptEnabled(true);
        if (this.f104402f == n.INTERSTITIAL) {
            c1296c.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        this.f104398b.setScrollContainer(false);
        this.f104398b.setVerticalScrollBarEnabled(false);
        this.f104398b.setHorizontalScrollBarEnabled(false);
        this.f104398b.setBackgroundColor(0);
        this.f104398b.setWebViewClient(this.f104404h);
        this.f104398b.setWebChromeClient(new sg.bigo.ads.core.h.c() { // from class: sg.bigo.ads.core.mraid.c.1
            @Override // sg.bigo.ads.core.h.c
            public final void a(WebView webView, String str, String str2) {
                super.a(webView, str, str2);
                b bVar = c.this.f104397a;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
                b bVar = c.this.f104397a;
                return bVar != null ? bVar.d() : super.onConsoleMessage(consoleMessage);
            }

            @Override // sg.bigo.ads.core.h.c, android.webkit.WebChromeClient
            public final boolean onJsAlert(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
                b bVar = c.this.f104397a;
                return bVar != null ? bVar.a(jsResult) : super.onJsAlert(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
            }
        });
        this.f104399c = new sg.bigo.ads.common.ac.a(this.f104398b.getContext());
        this.f104398b.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.c.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                c.this.f104399c.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if ((action != 0 && action != 1) || view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        this.f104398b.setVisibilityChangedListener(new C1296c.a() { // from class: sg.bigo.ads.core.mraid.c.3
            @Override // sg.bigo.ads.core.mraid.c.C1296c.a
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                b bVar2 = c.this.f104397a;
                if (bVar2 != null) {
                    bVar2.a(bVar);
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.C1296c.a
            public final void a(boolean z10) {
                b bVar = c.this.f104397a;
                if (bVar != null) {
                    bVar.a(z10);
                }
            }
        });
    }

    final void a(@NonNull g gVar, @NonNull String str) {
        c("window.mraidbridge.notifyErrorEvent(" + JSONObject.quote(gVar.f104478l) + ", " + JSONObject.quote(str) + ")");
    }

    public final void a(@NonNull j jVar) {
        String str;
        StringBuilder sb2 = new StringBuilder("mraidbridge.setScreenSize(");
        sb2.append(b(jVar.f104501b));
        sb2.append(");mraidbridge.setMaxSize(");
        sb2.append(b(jVar.f104503d));
        sb2.append(");mraidbridge.setCurrentPosition(");
        sb2.append(a(jVar.f104505f));
        sb2.append(");mraidbridge.setDefaultPosition(");
        sb2.append(a(jVar.f104507h));
        sb2.append(");mraidbridge.setCurrentAppOrientation(");
        C1296c c1296c = this.f104398b;
        if (c1296c == null) {
            str = "";
        } else {
            Context context = c1296c.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            String str2 = context.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
            boolean z10 = false;
            if (activity == null) {
                sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Context is not an Activity, set locked to false");
            } else if (activity.getRequestedOrientation() != -1) {
                z10 = true;
            }
            str = "'" + str2 + "', " + z10;
        }
        sb2.append(str);
        sb2.append(")");
        c(sb2.toString());
        c("mraidbridge.notifySizeChangeEvent(" + b(jVar.f104505f) + ")");
    }

    final void a(n nVar) {
        c("mraidbridge.setPlacementType(" + JSONObject.quote(nVar.toString().toLowerCase(Locale.US)) + ")");
    }

    final void a(o oVar) {
        c("mraidbridge.setState(" + JSONObject.quote(oVar.toString().toLowerCase(Locale.US)) + ")");
    }

    final void a(boolean z10) {
        c("mraidbridge.setIsViewable(" + z10 + ")");
    }

    final void a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        c("mraidbridge.setSupports(" + z10 + StringUtils.COMMA + z11 + StringUtils.COMMA + z12 + StringUtils.COMMA + z13 + StringUtils.COMMA + z14 + ")");
    }

    private static boolean a(@Nullable String str, boolean z10) {
        return str == null ? z10 : g(str);
    }

    private static boolean a(@NonNull Map<String, String> map) {
        return a(map.get("shouldUseCustomClose"), false);
    }
}
