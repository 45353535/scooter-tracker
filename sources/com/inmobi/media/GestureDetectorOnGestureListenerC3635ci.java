package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.PlaybackException;
import androidx.webkit.Profile;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3837ki;
import com.inmobi.media.GestureDetectorOnGestureListenerC3635ci;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class GestureDetectorOnGestureListenerC3635ci extends AbstractC4170y2 implements C, F2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Gf, InterfaceC3911nh {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final Mh f38345e1 = new Mh();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final Lh f38346f1 = new Lh();

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f38347g1 = GestureDetectorOnGestureListenerC3635ci.class.getSimpleName();

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final I1 f38348h1 = new I1(Boolean.FALSE, new Function0() { // from class: w3.i6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(GestureDetectorOnGestureListenerC3635ci.y());
        }
    }, false, true);
    public C4130wc A;
    public final C4113vk A0;
    public boolean B;
    public boolean B0;
    public JSONObject C;
    public boolean C0;
    public JSONObject D;
    public U5 D0;
    public boolean E;
    public S5 E0;
    public boolean F;
    public String F0;
    public boolean G;
    public Ff G0;
    public boolean H;
    public L0 H0;
    public Hn I;
    public final AtomicBoolean I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public U K0;
    public String L;
    public String L0;
    public final AtomicBoolean M;
    public boolean M0;
    public final Object N;
    public xo N0;
    public final Object O;
    public boolean O0;
    public boolean P;
    public Map P0;
    public final boolean Q;
    public final Qh Q0;
    public View R;
    public final C3609bi R0;
    public WebChromeClient.CustomViewCallback S;
    public String S0;
    public int T;
    public final Th T0;
    public boolean U;
    public final Rh U0;
    public boolean V;
    public final Oh V0;
    public long W;
    public boolean W0;
    public D4 X0;
    public C4101v8 Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f38349a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public C3583ai f38350a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f38351b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final AtomicBoolean f38352b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final Vh f38353b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f38354c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f38355c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final Kh f38356c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38357d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C3887mi f38358d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public vo f38359d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38360e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Lazy f38361e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38362f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C3684eg f38363f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f38364g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Lazy f38365g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3738gi f38366h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f38367h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3878m9 f38368i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Map f38369i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Di f38370j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public E2 f38371j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ko f38372k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public C f38373k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3919o0 f38374l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f38375l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdConfig f38376m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public InterfaceC4118w0 f38377m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f38378n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Fn f38379n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f38380o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final boolean f38381o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f38382p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f38383p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC3607bg f38384q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f38385q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f38386r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int[] f38387r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C3739gj f38388s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f38389s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f38390t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f38391t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public WeakReference f38392u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Ph f38393u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f38394v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Sh f38395v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f38396w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f38397w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC3686ei f38398x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f38399x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Mutex f38400y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public C3931oc f38401y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f38402z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final GestureDetector f38403z0;

    public /* synthetic */ GestureDetectorOnGestureListenerC3635ci(Context context, byte b10, LinkedHashSet linkedHashSet, String str, String str2, long j10, C3738gi c3738gi, InterfaceC3878m9 interfaceC3878m9, Di di, ko koVar, C3919o0 c3919o0, AdConfig adConfig, int i10) {
        this(context, b10, (i10 & 4) != 0 ? null : linkedHashSet, (i10 & 8) != 0 ? null : str, (i10 & 16) == 0, (i10 & 32) != 0 ? "DEFAULT" : str2, (i10 & 64) != 0 ? -1L : j10, (i10 & 128) != 0 ? null : c3738gi, interfaceC3878m9, di, koVar, c3919o0, adConfig);
    }

    public static final TelemetryConfig.LandingPageConfig A() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        return ((TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class)).getLpConfig();
    }

    public static final Ti c(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        return new Ti(gestureDetectorOnGestureListenerC3635ci.f38372k, gestureDetectorOnGestureListenerC3635ci.f38368i);
    }

    public static final Unit f() {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = InMobiAdActivity.f36524l;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.D();
        }
        return Unit.f93236a;
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.f38365g0.getValue();
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraid();
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    private final C3864lk getScrollThrottler() {
        return (C3864lk) this.f38361e0.getValue();
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    public static final short l(String str) {
        Intrinsics.checkNotNull(str);
        return Short.parseShort(str);
    }

    private final void setAdSize(String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setAdSize " + this);
        }
        L5 l52 = J5.f37099a;
        this.f38383p0 = (int) (J5.b() * Integer.parseInt(((String[]) new Regex("x").j(str, 0).toArray(new String[0]))[0]));
        this.f38389s0 = ((int) (J5.b() * Integer.parseInt(((String[]) new Regex("x").j(str, 0).toArray(new String[0]))[1]))) * this.f38383p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setOmidViewableAd(com.inmobi.media.C4138wk r18) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3635ci.setOmidViewableAd(com.inmobi.media.wk):void");
    }

    public static final boolean y() {
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Context context = Ji.f37157a;
        Intrinsics.checkNotNull(context);
        Ea eaA = Da.a(context, "default");
        Intrinsics.checkNotNullParameter("enableImraidLogs", C4240b4.i.W);
        return eaA.f36783a.getBoolean("enableImraidLogs", false);
    }

    public final void B() {
        Activity activity;
        if (getPlacementType() == 0) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            toString();
            if (((Activity) this.f38394v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                Intrinsics.checkNotNullParameter(this, "<this>");
                int i10 = 0;
                View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i10 >= upperBoundForActivityContext) {
                        break;
                    }
                    Context context = view.getContext();
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break loop0;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Object parent = view.getParent();
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                    i10++;
                }
                if (activity != null) {
                    this.f38394v = new WeakReference(activity);
                    Unit unit = Unit.f93236a;
                }
            }
        }
    }

    public void C() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onImpressionFired " + this);
        }
        F();
        C4101v8 c4101v8 = this.Y0;
        if (c4101v8 != null) {
            HtmlVideoPlayerConfig htmlVideoPlayerConfig = c4101v8.f39754j;
            C4183yf c4183yf = c4101v8.f39760p;
            if (c4183yf != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                if (skippable) {
                    Ae ae2 = c4183yf.f40001e;
                    if (ae2 != null) {
                        ae2.a(skipOffset, autoplay);
                    }
                } else {
                    Ae ae3 = c4183yf.f40001e;
                    if (ae3 != null) {
                        ae3.a(autoplay);
                    }
                }
                Ae ae4 = c4183yf.f40001e;
                if (ae4 != null) {
                    if (ae4.f38487e == null) {
                        InterfaceC3878m9 interfaceC3878m92 = ae4.f38484b;
                        if (interfaceC3878m92 != null) {
                            ((C3903n9) interfaceC3878m92).a(AbstractC3669e1.f38482f, "Failed to registerImpression: AdEvent is null");
                        }
                    } else {
                        InterfaceC3878m9 interfaceC3878m93 = ae4.f38484b;
                        if (interfaceC3878m93 != null) {
                            ((C3903n9) interfaceC3878m93).a(AbstractC3669e1.f38482f, "registerImpression");
                        }
                        P4.a(ae4.f38483a, new Z0(ae4, null));
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void D() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onUserLandingCompleted " + this);
        }
        g("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void E() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "processUnload " + this);
        }
        if (this.M.get()) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).b(TAG2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!z()) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
            if (interfaceC3878m93 != null) {
                String TAG3 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3903n9) interfaceC3878m93).b(TAG3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.C0) {
            InterfaceC3878m9 interfaceC3878m94 = this.f38368i;
            if (interfaceC3878m94 != null) {
                String TAG4 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C3903n9) interfaceC3878m94).b(TAG4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.O0) {
            return;
        }
        this.O0 = true;
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        Runnable runnable = new Runnable() { // from class: w3.k6
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC3635ci.a(this.f107139b);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.post(runnable);
    }

    public final void F() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "recordContextualData " + this);
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.a();
        }
    }

    public final void G() {
        String str;
        C4093v0 c4093v0;
        String str2;
        String str3;
        String str4;
        C4093v0 c4093v02;
        String str5;
        C3970q1 c3970q1;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "sendTelemetryEventForNetworkLoad " + this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put("errorCode", Short.valueOf(this.B0 ? (short) 2212 : (short) 2211));
        C3738gi c3738gi = this.f38366h;
        if (c3738gi != null && (c3970q1 = c3738gi.f38649j) != null) {
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - c3970q1.f39335a.f39425c));
        }
        C3738gi c3738gi2 = this.f38366h;
        if (c3738gi2 != null && (c4093v02 = c3738gi2.f38640a) != null && (str5 = c4093v02.f39716f) != null) {
            linkedHashMap.put("plType", str5);
        }
        C3738gi c3738gi3 = this.f38366h;
        if (c3738gi3 != null && (str4 = c3738gi3.f38645f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        C3738gi c3738gi4 = this.f38366h;
        if (c3738gi4 != null && (str3 = c3738gi4.f38641b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        C3738gi c3738gi5 = this.f38366h;
        if (c3738gi5 != null && (c4093v0 = c3738gi5.f38640a) != null && (str2 = c4093v0.f39715e) != null) {
            linkedHashMap.put("adType", str2);
        }
        C3738gi c3738gi6 = this.f38366h;
        if (c3738gi6 != null && (str = c3738gi6.f38643d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        C3738gi c3738gi7 = this.f38366h;
        if (c3738gi7 != null) {
            linkedHashMap.put("isRewarded", Boolean.valueOf(c3738gi7.f38647h));
        }
        a("NetworkLoadLimitExceeded", (HashMap) linkedHashMap);
    }

    public final void H() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "setCurrentPosition " + this);
        }
        this.D = new JSONObject();
        getLocationOnScreen(new int[2]);
        try {
            JSONObject jSONObject = this.D;
            if (jSONObject != null) {
                jSONObject.put("x", F3.b(r0[0] / J5.b()));
            }
            JSONObject jSONObject2 = this.D;
            if (jSONObject2 != null) {
                jSONObject2.put("y", F3.b(r0[1] / J5.b()));
            }
            int iB = F3.b(getWidth() / J5.b());
            int iB2 = F3.b(getHeight() / J5.b());
            JSONObject jSONObject3 = this.D;
            if (jSONObject3 != null) {
                jSONObject3.put("width", iB);
            }
            JSONObject jSONObject4 = this.D;
            if (jSONObject4 != null) {
                jSONObject4.put("height", iB2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.O) {
            this.F = false;
            this.O.notifyAll();
            Unit unit = Unit.f93236a;
        }
    }

    public final void I() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "setDefaultPosition " + this);
        }
        int[] iArr = new int[2];
        this.C = new JSONObject();
        if (this.f38396w == null) {
            ViewParent parent = getParent();
            this.f38396w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.f38396w;
        if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
            WeakReference weakReference2 = this.f38396w;
            if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                JSONObject jSONObject = this.C;
                if (jSONObject != null) {
                    jSONObject.put("x", F3.b(iArr[0] / J5.b()));
                }
                JSONObject jSONObject2 = this.C;
                if (jSONObject2 != null) {
                    jSONObject2.put("y", F3.b(iArr[1] / J5.b()));
                }
                WeakReference weakReference3 = this.f38396w;
                int iB = F3.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / J5.b());
                WeakReference weakReference4 = this.f38396w;
                int iB2 = F3.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / J5.b());
                JSONObject jSONObject3 = this.C;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", iB);
                }
                JSONObject jSONObject4 = this.C;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", iB2);
                }
            } catch (JSONException unused) {
                Unit unit = Unit.f93236a;
            }
        } else {
            try {
                JSONObject jSONObject5 = this.C;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                JSONObject jSONObject6 = this.C;
                if (jSONObject6 != null) {
                    jSONObject6.put("y", 0);
                }
                JSONObject jSONObject7 = this.C;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.C;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (JSONException unused2) {
                Unit unit2 = Unit.f93236a;
            }
        }
        synchronized (this.N) {
            this.E = false;
            this.N.notifyAll();
            Unit unit3 = Unit.f93236a;
        }
    }

    public final void J() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setFallbackImpressionMinPercentageViewed " + this);
        }
        int webImpressionMinPercentageViewed = Intrinsics.areEqual("video", this.F0) ? getAdConfig().getViewability().getVideoImpressionMinPercentageViewed() : (Intrinsics.areEqual("audio", this.F0) && Intrinsics.areEqual("audio", getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
        this.f38399x0 = webImpressionMinPercentageViewed;
    }

    public final void K() {
        int webImpressionMinTimeViewed = Intrinsics.areEqual("video", this.F0) ? getAdConfig().getViewability().getVideoImpressionMinTimeViewed() : (Intrinsics.areEqual("audio", this.F0) && Intrinsics.areEqual("audio", getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
        this.f38397w0 = webImpressionMinTimeViewed;
    }

    public final void L() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setFallbackImpressionParams " + this);
        }
        K();
        J();
        M();
    }

    public final void M() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setFallbackImpressionType " + this);
        }
        String adType = getAdType();
        this.f38386r = Intrinsics.areEqual(adType, "banner") ? getAdConfig().getViewability().getBannerImpressionType() : Intrinsics.areEqual(adType, "audio") ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
    }

    public final void N() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setImpressionParams " + this);
        }
        if (this.f38354c == null) {
            L();
            return;
        }
        try {
            L();
            for (C4138wk c4138wk : this.f38354c) {
                if (c4138wk.f39872a == 2) {
                    if (c4138wk.f39873b.containsKey("type")) {
                        Object obj = c4138wk.f39873b.get("type");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                        this.f38386r = (byte) ((Integer) obj).intValue();
                    } else {
                        M();
                    }
                    if (c4138wk.f39873b.containsKey("time")) {
                        Object obj2 = c4138wk.f39873b.get("time");
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                        this.f38397w0 = ((Integer) obj2).intValue();
                    } else {
                        K();
                    }
                    if (c4138wk.f39873b.containsKey(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                        Object obj3 = c4138wk.f39873b.get(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                        this.f38399x0 = ((Integer) obj3).intValue();
                    } else {
                        J();
                    }
                    if (this.f38386r == 2) {
                        if (c4138wk.f39873b.containsKey("pixel")) {
                            Object obj4 = c4138wk.f39873b.get("pixel");
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            this.f38391t0 = ((Integer) obj4).intValue();
                        } else {
                            M();
                        }
                        if (c4138wk.f39873b.containsKey(TypedValues.AttributesType.S_FRAME)) {
                            Object obj5 = c4138wk.f39873b.get(TypedValues.AttributesType.S_FRAME);
                            this.f38387r0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            M();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).b(TAG2, "Exception in parsing the impressionType and pixel frame");
            }
            L();
        } catch (Exception unused2) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
            if (interfaceC3878m93 != null) {
                String TAG3 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3903n9) interfaceC3878m93).b(TAG3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            L();
        }
    }

    public final void O() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "setIsViewHardwareAccelerated " + this);
        }
        this.B = isHardwareAccelerated();
    }

    public final void P() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "skipFromInterActive " + this);
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.h();
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "skipFromInterActive");
        }
    }

    public final void Q() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "startTrackingAudioVolume " + this);
        }
        if (!z() || this.f38360e) {
            return;
        }
        C3968q c3968q = C3968q.f39323a;
        Ph listener = this.f38393u0;
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        eg.i.d(C3968q.f39329g, null, null, new C3843l(interfaceC3878m92, listener, null), 3, null);
    }

    public final void R() {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        Set linkedHashSet;
        Set<View> setKeySet;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "startTrackingExposure " + this);
        }
        if (!z() || this.f38360e) {
            gestureDetectorOnGestureListenerC3635ci = this;
            InterfaceC3878m9 interfaceC3878m92 = gestureDetectorOnGestureListenerC3635ci.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).b(TAG2, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (setKeySet = friendlyViews.keySet()) == null || (linkedHashSet = CollectionsKt.toMutableSet(setKeySet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            gestureDetectorOnGestureListenerC3635ci = this;
            gestureDetectorOnGestureListenerC3635ci.K0 = new U(gestureDetectorOnGestureListenerC3635ci, linkedHashSet, getAdConfig().getMraid3().getExposureChangeInterval(), this.f38395v0, this.f38368i);
        }
        U u10 = gestureDetectorOnGestureListenerC3635ci.K0;
        if (u10 != null) {
            u10.a();
        }
    }

    public final void S() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "stopTrackingAudioVolume " + this);
        }
        C3968q c3968q = C3968q.f39323a;
        Ph listener = this.f38393u0;
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        eg.i.d(C3968q.f39329g, null, null, new C3893n(interfaceC3878m92, listener, null), 3, null);
    }

    public final void T() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "stopTrackingExposure " + this);
        }
        U u10 = this.K0;
        if (u10 != null) {
            u10.b();
        }
    }

    public final void U() {
        new C4171y3(this, !this.G, !this.J, this.f38368i).a(this.f38359d1);
    }

    public final long V() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "timeSincePodShow " + this);
        }
        InterfaceC4118w0 interfaceC4118w0 = this.f38377m0;
        if (interfaceC4118w0 != null) {
            return ((AbstractC3845l1) interfaceC4118w0).T();
        }
        return 0L;
    }

    public final void W() {
        getListener().e(this);
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "ad dismissed");
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a();
        }
        L0 l02 = this.H0;
        if (l02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            l02 = null;
        }
        if (l02.f37244d.get()) {
            l02.a("session end is already triggered");
            return;
        }
        if (!l02.f37241a.getEnabled()) {
            l02.a("config kill switch - false. ad quality will skip");
        } else if (l02.f37247g == null) {
            l02.a("setup not done. ignore trigger");
        } else {
            l02.f37244d.set(true);
            l02.a(false);
        }
    }

    public final void X() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "unregisterBackButtonPressedEventListener " + this);
        }
        this.L = null;
    }

    public final void Y() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "updateActivitiesOrientationProperties " + this);
        }
        Activity activity = (Activity) this.f38392u.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Ff orientationProperties = this.G0;
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        O8 o82 = ((InMobiAdActivity) activity).f36525a;
        if (o82 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
            o82 = null;
        }
        o82.a(orientationProperties);
    }

    public final void a(C3931oc movementGestureDetector) {
        Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        if (this.f38360e || !getRenderingConfig().getSupportedGestures().contains(2)) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "Pan gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            JSONArray jSONArray = movementGestureDetector.f39196j;
            Integer numValueOf = jSONArray != null ? Integer.valueOf(jSONArray.length()) : null;
            ((C3903n9) interfaceC3878m92).a(TAG2, StringsKt.n("onPanDetected\n " + numValueOf + " \n " + movementGestureDetector.f39196j));
        }
        g("window.imraidview.onGestureDetected('2', '" + movementGestureDetector.f39196j + "');");
    }

    public final void b(C3931oc rotationDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        Intrinsics.checkNotNullParameter(rotationDetector, "rotationDetector");
        Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (this.f38360e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, StringsKt.n(" Rotation detected " + rotationDetector.f39195i + " \n " + initialEvent + " \n " + endEvent));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(initialEvent.getX())), Integer.valueOf(F3.c(initialEvent.getY()))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(initialEvent.getX(1))), Integer.valueOf(F3.c(initialEvent.getY(1)))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(endEvent.getX())), Integer.valueOf(F3.c(endEvent.getY()))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(endEvent.getX(1))), Integer.valueOf(F3.c(endEvent.getY(1)))})));
        g("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void d(boolean z10) {
        Hn hn = z10 ? Hn.f37036c : Hn.f37035b;
        if (this.I != hn) {
            if (!this.P) {
                this.I = hn;
                if (z10) {
                    getListener().j(this);
                }
                c(z10);
                L0 l02 = this.H0;
                if (l02 != null) {
                    Hn adViewableStatus = this.I;
                    Intrinsics.checkNotNullParameter(adViewableStatus, "adViewableStatus");
                    l02.f37248h = adViewableStatus;
                }
                o();
            }
            C4101v8 c4101v8 = this.Y0;
            if (c4101v8 == null || c4101v8.f39751g.get() || !C4101v8.a(c4101v8, new EnumC4026s8[]{EnumC4026s8.f39509c, EnumC4026s8.f39511e, EnumC4026s8.f39512f}, null, null, null, 14) || c4101v8.f39756l == z10) {
                return;
            }
            c4101v8.f39756l = z10;
            if (!z10) {
                if (!c4101v8.f39751g.get() && c4101v8.f39755k.f37417p.isPlaying()) {
                    c4101v8.f39755k.f();
                    N7 n72 = c4101v8.f39755k;
                    EnumC4034sg state = EnumC4034sg.f39536e;
                    n72.getClass();
                    Intrinsics.checkNotNullParameter(state, "state");
                    n72.f37421t = state;
                    return;
                }
                return;
            }
            if (c4101v8.f39751g.get()) {
                return;
            }
            N7 n73 = c4101v8.f39755k;
            if (n73.f37421t == EnumC4034sg.f39536e) {
                n73.e();
                N7 n74 = c4101v8.f39755k;
                EnumC4034sg state2 = EnumC4034sg.f39535d;
                n74.getClass();
                Intrinsics.checkNotNullParameter(state2, "state");
                n74.f37421t = state2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.J0) {
                InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
                if (interfaceC3878m9 != null) {
                    String TAG = f38347g1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C3903n9) interfaceC3878m9).b(TAG, "dispatchTouchEvent Invalid Coordinates " + event);
                }
                this.J0 = true;
            }
            return super.dispatchTouchEvent(event);
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "dispatchTouchEvent " + this);
        }
        this.A0.a(event);
        if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.dispatchTouchEvent(event);
    }

    public final void e() {
        WebViewClient webViewClient;
        if (this.f38360e) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            U5 u52 = new U5("IN_CUSTOM_BROWSER", new Function0() { // from class: w3.n6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GestureDetectorOnGestureListenerC3635ci.f();
                }
            }, new Function1() { // from class: w3.o6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC3635ci.a((JSONObject) obj);
                }
            }, new Function2() { // from class: w3.p6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GestureDetectorOnGestureListenerC3635ci.a((String) obj, (Map) obj2);
                }
            }, this.f38368i);
            this.D0 = u52;
            webViewClient = u52;
        } else {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).c(TAG2, "view is ad. Using RenderViewClient");
            }
            C3661di c3661di = new C3661di(this.f38358d0, this.f38368i, new Function1() { // from class: w3.q6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC3635ci.a(this.f107262b, ((Boolean) obj).booleanValue());
                }
            });
            String adType = getAdType();
            c3661di.f40029b = Intrinsics.areEqual(adType, "banner") ? getAdConfig().getRendering().getBannerNetworkLoadsLimit() : Intrinsics.areEqual(adType, "audio") ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            webViewClient = c3661di;
        }
        setWebViewClient(webViewClient);
    }

    public final void g(final String value) {
        Intrinsics.checkNotNullParameter(value, "js");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "injectJavaScript " + this + " - " + value);
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        Runnable runnable = new Runnable() { // from class: w3.j6
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC3635ci.d(this.f107117b, value);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.postAtFrontOfQueue(runnable);
    }

    @NotNull
    public AdConfig getAdConfig() {
        return this.f38376m;
    }

    @Nullable
    public final C3919o0 getAdMetaData() {
        return this.f38374l;
    }

    @Nullable
    public final InterfaceC4118w0 getAdPodHandler() {
        return this.f38377m0;
    }

    @NotNull
    public final L0 getAdQualityManager() {
        L0 l02 = this.H0;
        if (l02 != null) {
            return l02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
        return null;
    }

    @Nullable
    public String getAdType() {
        return this.f38367h0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f38375l0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    @NotNull
    public final WeakReference<Activity> getBannerHolderActivity() {
        return this.f38394v;
    }

    @Nullable
    public final String getBeaconUrl() {
        return this.L0;
    }

    @NotNull
    public final vo getCloseAssetArea() {
        return this.f38359d1;
    }

    public final long getConfiguredArea() {
        return this.f38389s0;
    }

    @NotNull
    public Context getContainerContext() {
        Activity activity = (Activity) this.f38392u.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Nullable
    public final String getContentURL() {
        return this.f38385q0;
    }

    @Nullable
    public final D4 getContextualDataHandler() {
        return this.X0;
    }

    @NotNull
    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    @Nullable
    public String getCreativeId() {
        return this.f38349a0;
    }

    @NotNull
    public final String getCurrentPosition() {
        String string;
        JSONObject jSONObject = this.D;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    @NotNull
    public final Object getCurrentPositionMonitor() {
        return this.O;
    }

    @WorkerThread
    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC4118w0 interfaceC4118w0 = this.f38377m0;
        if (interfaceC4118w0 != null) {
            return ((AbstractC3845l1) interfaceC4118w0).n(this);
        }
        return 0;
    }

    @Nullable
    public Object getDataModel() {
        return null;
    }

    @NotNull
    public final String getDefaultPosition() {
        String string;
        JSONObject jSONObject = this.C;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    @NotNull
    public final Object getDefaultPositionMonitor() {
        return this.N;
    }

    @Nullable
    public final S5 getEmbeddedBrowserJsCallbacks() {
        return this.E0;
    }

    @Nullable
    public final U getExposureTracker() {
        return this.K0;
    }

    @Nullable
    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.f38369i0;
    }

    @Nullable
    public final Activity getFullScreenActivity() {
        return (Activity) this.f38392u.get();
    }

    @NotNull
    public B getFullScreenEventsListener() {
        return this.f38353b1;
    }

    @Nullable
    public String getImpressionId() {
        return this.f38357d;
    }

    public final byte getImpressionType() {
        return this.f38386r;
    }

    @NotNull
    public final String getLandingScheme() {
        return this.f38362f;
    }

    @NotNull
    public final AbstractC3686ei getListener() {
        AbstractC3686ei abstractC3686ei = this.f38398x;
        if (abstractC3686ei != null) {
            return abstractC3686ei;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "listener getter " + this);
        }
        Lh lh2 = f38346f1;
        this.f38398x = lh2;
        return lh2;
    }

    @Nullable
    public final String getMCreativeType() {
        return this.F0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.f38399x0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.f38397w0;
    }

    @Nullable
    public final Fn getMViewableAd() {
        return this.f38379n0;
    }

    @NotNull
    public String getMarkupType() {
        return this.S0;
    }

    @NotNull
    public final String getMarkupTypeAdUnit() {
        return this.S0;
    }

    @Nullable
    public final C4130wc getMediaProcessor() {
        return this.A;
    }

    public final int getMinimumPixelsPainted() {
        return this.f38391t0;
    }

    @NotNull
    public final String getMraidJsString() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "mraidJsString getter " + this);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea eaA = Da.a(context, "mraid_js_store");
        Intrinsics.checkNotNullParameter("mraid_js_string", C4240b4.i.W);
        Intrinsics.checkNotNullParameter("mraid_js_string", C4240b4.i.W);
        String string = eaA.f36783a.getString("mraid_js_string", null);
        if (string == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).a(TAG2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(d){}};this.remove=function(a){var d=!1,f=this;b=b.filter(function(b){if(b=b===a)--f.count,\nd=!0;return!b});return d};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(d){try{d.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(d){c.push(\"|\",String(d),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(d){this.log(d)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var d=this.listeners;d[c]||(d[c]=new EventListeners(c));d[c].broadcast(b)}catch(f){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var d=arguments[c],d=JSON.parse(d);b[c]=d}else b[c]=arguments[c];d=b[1];\"success\"!=d&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){d={};d.command=a;d.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)f=arguments[c+1],null!=f&&(b[arguments[c]]=\"\"+f);d.params=b}else for(var d=this.urlScheme+\"://\"+a,f,b=!0,c=1;c<arguments.length;c+=2)f=arguments[c+1],null!=f&&(b?(d+=\"?\",b=!1):d+=\"&\",d+=arguments[c]+\"=\"+escape(f));__im__iosNativeCall.executeNativeCall(d);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(d){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(d);return!1};a.popupBlocked=function(d){a.firePopupBlockedBeacon(d)};a.zeroPad=function(d){var a=\"\";10>d&&(a+=\"0\");return a+d};a.supports=function(d){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof d)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",d)};a.useCustomClose=function(d){try{sdkController.useCustomClose(\"window.mraidview\",d)}catch(a){imraidview.showAlert(\"use CustomClose: \"+a)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(d){imraidview.showAlert(\"close: \"+d)}};a.stackCommands=function(d,a){c?b.push(d):(eval(d),a&&(c=!0))};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nd.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(a.orientationProperties.forceOrientation=d.forceOrientation)):d=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(b){imraidview.showAlert(\"setOrientationProperties: \"+b+\", props = \"+d)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(d){\"undefined\"==typeof d&&(d=null);try{sdkController.open(\"window.mraidview\",d)}catch(a){imraidview.showAlert(\"open: \"+a)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getScreenSize: \"+d)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getMaxSize: \"+d)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(d){imraidview.showAlert(\"getCurrentPosition: \"+d)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getDefaultPosition: \"+d)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(d){imraidview.showAlert(\"getState: \"+d)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(d){imraidview.showAlert(\"isViewable: \"+\nd)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(d){imraidview.showAlert(\"close: \"+d)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(d){return 0==this.indexOf(d)});a.playVideo=function(d){var a=\"\";null!=d&&(a=d);try{sdkController.playVideo(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(d){if(\"undefined\"===\ntypeof JSON){var b=\"\",c;if(\"undefined\"==typeof d.length)return a.stringifyArg(d);for(c=0;c<d.length;c++)0<c&&(b+=\",\"),b+=a.stringifyArg(d[c]);return b+\"]\"}return JSON.stringify(d)};a.stringifyArg=function(a){var b,c,e;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(e in a)null!==a[e]&&(c||(b+=\",\"),b=b+'\"'+e+'\":',c=typeof a[e],b=\"number\"===c||\"boolean\"===c?b+a[e]:\"function\"===typeof a[e]?b+'\"\"':a[e]instanceof\nObject?b+this.stringify(args[i][e]):b+'\"'+a[e]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(d){console.log(\"bridge: storePicture\");if(\"string\"!=typeof d)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+d+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",d);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+d+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var d;switch(a.orientation){case 0:case 180:d=\"portrait\";break;case 90:case 270:d=\"landscape\";break;default:d=\"none\"}return{orientation:d,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(d){try{d?this.props=d:d=null;if(\"undefined\"!=typeof d.lockOrientation&&null!=d.lockOrientation&&\"undefined\"!=typeof d.orientation&&null!=d.orientation){var b={};b.allowOrientationChange=!d.lockOrientation;b.forceOrientation=d.orientation;a.setOrientationProperties(b)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(d))}catch(c){imraidview.showAlert(\"executeNativesetExpandProperties: \"+c+\", props = \"+d)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(d){var b,c;try{b=parseInt(d.width);c=parseInt(d.height);if(isNaN(b)||isNaN(c)||1>b||1>c)throw\"Invalid\";d.width=b;d.height=c;a.resizeProps=d;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(d))}catch(e){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(d){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var f={};f.trigger=a;f.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,f)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",e=0;e<b;e++)c+=a[e];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\n\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(d){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof d&&(\"useCustomClose\"in d&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(d.useCustomClose),window.mraid.broadcastEvent(\"error\",\n\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(d))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\n\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),\nb.expand(a))}catch(f){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(d){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof d?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(d))};a.resize=function(){try{1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\n\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(d){\"string\"!=typeof d?a.broadcastEvent(\"error\",\n\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(d)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=d.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(mraidview.orientationProperties.forceOrientation=d.forceOrientation),\"undefined\"!=typeof d.direction&&(mraidview.orientationProperties.direction=\nd.direction)):d=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(b){a.showAlert(\"setOrientationProperties: \"+b+\", props = \"+d)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var e=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(e=e+\"_\"+b);window.imraid.broadcastEvent(e,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var e=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(e=e+\"_\"+a);window.imraid.broadcastEvent(e,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var e={name:\"timeupdate\",target:{}};e.target.currentTime=b;e.target.duration=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var e=new Image;e.src=\"data:image/jpeg;base64,\"+a;e.width=b;e.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",e)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var e=new Image;e.src=\"data:image/jpeg;base64,\"+\na;e.width=b;e.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",e)};a.fireMediaCloseEvent=function(a,b,c){var e={name:\"close\"};e.viaUserInteraction=b;e.target={};e.target.currentTime=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.fireMediaVolumeChangeEvent=function(a,b,c){var e={name:\"volumechange\",target:{}};e.target.volume=b;e.target.muted=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,e)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(d,b){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",d,b):sdkController.openExternal(\"window.imraidview\",\nd)}catch(c){a.showAlert(\"openExternal: \"+c)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,g=\"\",e=0;e<c;e++)g+=b[e];return parseInt(g)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,g,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==\na||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(e){}};a.customExpand=function(b,c,g,e,h){try{void 0==g||\"number\"!=typeof g?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):\nvoid 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==h||\"boolean\"!=typeof h?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,g,e,h)}catch(k){a.showAlert(\"executeNativeCustomExpand: \"+k+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+g+\", bottomNavBarVisible = \"+h+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};\na.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=function(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",\na)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,void 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=\nc&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(e){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=function(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=\nmraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(g){a.showAlert(\"checkFallbackViewable: \"+g)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};a.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",\nb,c)}catch(g){a.showAlert(\"loadWebView: \"+g)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(g){a.showAlert(\"sendMessage: \"+\ng)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===typeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):\nsdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};a.createVideoPlayer=function(b){try{sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"createVideoPlayer: \"+c)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,f){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");sdkController.executeVideoPlayerActions(\"window.imraidview\",\nb,JSON.stringify(f))}catch(g){a.showAlert(\"executeVideoPlayerActions: \"+g)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{sdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,f,g){var e=arguments.length,h,k=null;if(3>e){if(\"function\"===typeof arguments[e-1])h=arguments[e-1];else return;k={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],k={reason:11,url:arguments[1]});\"function\"!==!h&&(k?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(k))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,f,g)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,g,e){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,g,e)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=b.impressionFired;a.getImraidVersion=\nb.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=b.showWebView;a.sendMessage=b.sendMessage;\na.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(d){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var f=-1;try{f=a.indexOf(b)}catch(g){}return f};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,d,f){if(!imIsObjValid(d)||!imIsObjValid(f))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+d+\",\"+f):a+(\"&u-tap-o=\"+d+\",\"+f));return a};b.performAdClick=function(a,d){d=d||event;if(imIsObjValid(a)){var f=a.clickConfig,g=a.landingConfig;if(!imIsObjValid(f)&&!imIsObjValid(g))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var e=null,h=null,k=null,m=null,n=null,l=null,q=null,p=null;if(imIsObjValid(d))try{m=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(r){n=\nm=0}imIsObjValid(g)?imIsObjValid(f)?(l=g.url,q=g.fallbackUrl,p=g.urlType,e=f.url,h=f.pingWV,k=f.fr):(l=g.url,p=g.urlType):(l=f.url,p=f.urlType);f=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;e=b.appendTapParams(e,m,n);imIsObjValid(e)?!0==h?b.pingInWebView(e,k):b.ping(e,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(l))switch(imIsObjValid(e)||\n(l=b.appendTapParams(l,m,n)),p){case 1:b.openEmbedded(l);break;case 2:\"ios\"==f?b.ios.openItunesProductView(l):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+f);break;default:b.openExternal(l,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,d){d=d||event;if(imIsObjValid(a)){var f=a.clickConfig,g=a.landingConfig;\nif(!imIsObjValid(f)&&!imIsObjValid(g))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var e=null,h=null,k=null,m=null,n=null;if(imIsObjValid(d))try{m=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(l){n=m=0}imIsObjValid(f)&&(e=f.url,h=f.pingWV,k=f.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;e=b.appendTapParams(e,m,n);imIsObjValid(e)?!0==h?b.pingInWebView(e,k):b.ping(e,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(g)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,d){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,d)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
        if (interfaceC3878m93 != null) {
            String TAG3 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3903n9) interfaceC3878m93).a(TAG3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    @NotNull
    public final Ff getOrientationProperties() {
        return this.G0;
    }

    public final long getPlacementId() {
        return this.W;
    }

    public byte getPlacementType() {
        return this.f38351b;
    }

    @Nullable
    public final HtmlVideoPlaybackState getPlaybackState() {
        C4101v8 c4101v8 = this.Y0;
        if (c4101v8 == null) {
            return null;
        }
        if (c4101v8.f39751g.get()) {
            return new HtmlVideoPlaybackState();
        }
        if (c4101v8.f39761q.get() == EnumC4026s8.f39507a) {
            EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
            c4101v8.a("getVideoPlayerState", "Playback state requested before load", (String) null);
        }
        return c4101v8.f39755k.a();
    }

    @Nullable
    public C getReferenceContainer() {
        return this.f38373k0;
    }

    @Nullable
    public final C3887mi getRenderViewTelemetry() {
        return this.f38358d0;
    }

    @WorkerThread
    @NotNull
    public final JSONArray getRenderableAdIndexes() {
        InterfaceC4118w0 interfaceC4118w0 = this.f38377m0;
        return interfaceC4118w0 != null ? ((AbstractC3845l1) interfaceC4118w0).v() : new JSONArray();
    }

    @NotNull
    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    @NotNull
    public final Di getRoute() {
        return this.f38370j;
    }

    @Nullable
    public final JSONObject getSafeArea() {
        xo xoVar = this.N0;
        if (xoVar != null) {
            Integer numF = J5.f();
            wo woVar = (numF == null && (numF = J5.f37105g) == null) ? null : (wo) xoVar.f39957d.get(numF);
            if (woVar != null) {
                return woVar.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.M0;
    }

    @WorkerThread
    public final long getShowTimeStamp() {
        InterfaceC4118w0 interfaceC4118w0 = this.f38377m0;
        if (interfaceC4118w0 != null) {
            return ((AbstractC3845l1) interfaceC4118w0).w();
        }
        return 0L;
    }

    @NotNull
    public final Ti getSiblingWebviewManager() {
        return (Ti) this.f38390t.getValue();
    }

    @Nullable
    public Map<String, C3994r1> getTelemetryManagerMap() {
        return this.P0;
    }

    @NotNull
    public C3740gk getTelemetryOnAdImpression() {
        Map<String, C3994r1> telemetryManagerMap = getTelemetryManagerMap();
        return new C3740gk(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.F0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    @VisibleForTesting
    public final boolean getUnloaded() {
        return this.O0;
    }

    @NotNull
    public final Ln getVISIBILITY_CHANGE_LISTENER() {
        return this.V0;
    }

    @Nullable
    public View getVideoContainerView() {
        return null;
    }

    @NotNull
    public final String getViewState() {
        return this.f38402z;
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public long getViewTouchTimestamp() {
        return this.f38364g;
    }

    @Override // com.inmobi.media.C
    @NotNull
    public Fn getViewableAd() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "viewableAd getter " + this);
        }
        if (this.f38379n0 == null) {
            this.f38379n0 = new C9(this, new Gn(this), new C3976q7(this.f38386r, this.F0, this.f38397w0, this.f38399x0, getVisibilityTrackingMinPercentage(), this.f38368i), this.f38368i);
            Set<C4138wk> set = this.f38354c;
            if (set != null) {
                for (C4138wk c4138wk : set) {
                    try {
                        if (c4138wk.f39872a == 3) {
                            setOmidViewableAd(c4138wk);
                        }
                        Unit unit = Unit.f93236a;
                    } catch (Exception e10) {
                        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
                        if (interfaceC3878m92 != null) {
                            String TAG2 = f38347g1;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            ((C3903n9) interfaceC3878m92).b(TAG2, "Exception occurred while creating the HTML viewable ad : " + e10.getMessage());
                            Unit unit2 = Unit.f93236a;
                        }
                    }
                }
            }
        }
        Fn fn = this.f38379n0;
        Intrinsics.checkNotNull(fn);
        return fn;
    }

    @Nullable
    public final int[] getViewableFrameArray() {
        return this.f38387r0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    @NotNull
    public final ko getWebViewFactory() {
        return this.f38372k;
    }

    @NotNull
    public final uo getWindowInsetListener() {
        return this.R0;
    }

    @NotNull
    public final C3739gj getWvStateMachine() {
        return this.f38388s;
    }

    public final void h(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        C3887mi c3887mi = this.f38358d0;
        if (c3887mi != null) {
            c3887mi.b();
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "loadDataInWebView " + this);
        }
        this.P = false;
        if (this.M.get()) {
            return;
        }
        loadDataWithBaseURL("", content, "text/html", "UTF-8", null);
    }

    public final void i() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "deferredDestroy " + this);
        }
        super.destroy();
    }

    public final void j() throws JSONException {
        if (this.M.get()) {
            return;
        }
        if (!this.H) {
            this.H = true;
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f38355c0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f38355c0 = null;
        }
        this.M.set(true);
        this.f38372k.a(this.f38370j.f36741b);
        xo xoVar = this.N0;
        if (xoVar != null) {
            xoVar.a();
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.b();
        }
        this.P = true;
        this.T = -1;
        C4101v8 c4101v8 = this.Y0;
        if (c4101v8 != null) {
            InterfaceC3878m9 interfaceC3878m9 = c4101v8.f39747c;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("HybridVideoPlayerHandler", "destroy");
            }
            c4101v8.a();
            C4183yf c4183yf = c4101v8.f39760p;
            if (c4183yf != null) {
                InterfaceC3878m9 interfaceC3878m92 = c4183yf.f40003g;
                if (interfaceC3878m92 != null) {
                    Intrinsics.checkNotNullExpressionValue("yf", "TAG");
                    ((C3903n9) interfaceC3878m92).c("yf", "stopOmidSession");
                }
                Ae ae2 = c4183yf.f40001e;
                if (ae2 != null) {
                    if (ae2.f38485c == null) {
                        InterfaceC3878m9 interfaceC3878m93 = ae2.f38484b;
                        if (interfaceC3878m93 != null) {
                            ((C3903n9) interfaceC3878m93).a(AbstractC3669e1.f38482f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3878m9 interfaceC3878m94 = ae2.f38484b;
                        if (interfaceC3878m94 != null) {
                            ((C3903n9) interfaceC3878m94).a(AbstractC3669e1.f38482f, "stopAdSession");
                        }
                        AdSession adSession = ae2.f38485c;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        ae2.f38485c = null;
                    }
                }
            }
            c4101v8.f39760p = null;
            F3.a(c4101v8.f39748d);
        }
        this.Y0 = null;
        removeJavascriptInterface("sdkController");
        C4130wc c4130wc = this.A;
        if (c4130wc != null) {
            C3577ac c3577ac = c4130wc.f39842d;
            if (c3577ac != null) {
                c3577ac.a();
            }
            c4130wc.f39842d = null;
            C3577ac c3577ac2 = c4130wc.f39843e;
            if (c3577ac2 != null) {
                c3577ac2.a();
            }
            c4130wc.f39843e = null;
            C3577ac c3577ac3 = c4130wc.f39844f;
            if (c3577ac3 != null) {
                c3577ac3.a();
            }
            c4130wc.f39844f = null;
        }
        this.f38392u.clear();
        this.f38394v.clear();
        WeakReference weakReference = this.f38396w;
        if (weakReference != null) {
            weakReference.clear();
        }
        Fn fn = this.f38379n0;
        if (fn != null) {
            fn.d();
        }
        Fn fn2 = this.f38379n0;
        if (fn2 != null) {
            fn2.a();
        }
        C3684eg c3684eg = this.f38363f0;
        if (c3684eg != null) {
            F8 f82 = Uf.f37853b;
            if (f82 != null) {
                String id2 = c3684eg.f38521c;
                Intrinsics.checkNotNullParameter(id2, "id");
                f82.f38765b.remove(id2);
                Iterator it = f82.f38765b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            C3949p5 c3949p5 = Uf.f37854c;
            if (c3949p5 != null) {
                String id3 = c3684eg.f38521c;
                Intrinsics.checkNotNullParameter(id3, "id");
                c3949p5.f38765b.remove(id3);
                Iterator it2 = c3949p5.f38765b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            c3684eg.f38522d.set(true);
        }
        this.f38363f0 = null;
        T();
        S();
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.E0 = null;
        this.f38398x = null;
        this.f38373k0 = null;
        this.f38377m0 = null;
        this.B0 = false;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public final void k(String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "registerBackButtonPressedEventListener " + this);
        }
        this.L = str;
    }

    public void m() {
        InterfaceC4118w0 interfaceC4118w0;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "dismissCurrentViewContainer " + this);
        }
        C4130wc c4130wc = this.A;
        if (c4130wc != null) {
            C3757hc c3757hc = c4130wc.f39841c;
            if (c3757hc != null) {
                c3757hc.b();
            }
            c4130wc.f39841c = null;
        }
        if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, this.f38402z)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z10 = parent instanceof ViewGroup;
            if (z10) {
                this.f38372k.b(new Function1() { // from class: w3.m6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC3635ci.c((C3837ki) obj);
                    }
                });
            }
            if (1 == this.f38351b) {
                n();
            } else if (z10) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.I != Hn.f37036c || (interfaceC4118w0 = this.f38377m0) == null) {
            return;
        }
        interfaceC4118w0.a(this, getFullScreenActivity());
    }

    public final void n() {
        Activity fullScreenActivity;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "finishFullScreenActivity " + this);
        }
        SparseArray sparseArray = InMobiAdActivity.f36523k;
        Intrinsics.checkNotNullParameter(this, "container");
        InMobiAdActivity.f36523k.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, this.f38402z)) {
                setAndUpdateViewState("Hidden");
            }
            W();
            return;
        }
        InterfaceC4118w0 interfaceC4118w0 = this.f38377m0;
        if (interfaceC4118w0 == null || !interfaceC4118w0.a(this)) {
            Activity fullScreenActivity2 = getFullScreenActivity();
            Intrinsics.checkNotNull(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            ((InMobiAdActivity) fullScreenActivity2).f36529e = true;
            Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.T == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.T);
        }
    }

    public final void o() {
        L0 l02;
        AdQualityControl adQualityControl;
        Activity activity;
        L0 l03;
        AdQualityControl adQualityControl2;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireAQSession - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
        }
        if (!Intrinsics.areEqual(getAdType(), "int") || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.f38392u.get()) == null) {
            L0 l04 = this.H0;
            if (l04 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
                l02 = null;
            } else {
                l02 = l04;
            }
            l02.getClass();
            Intrinsics.checkNotNullParameter(this, "adView");
            if (!l02.a()) {
                l02.a("session state invalid");
                return;
            }
            l02.a("session start trigger...");
            l02.f37243c.set(true);
            AdQualityControl adQualityControl3 = l02.f37247g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = l02.f37247g) == null) {
                return;
            }
            l02.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (Qh) null);
            return;
        }
        L0 l05 = this.H0;
        if (l05 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            l03 = null;
        } else {
            l03 = l05;
        }
        l03.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l03.a()) {
            l03.a("session state invalid");
            return;
        }
        l03.a("session start trigger...");
        l03.f37243c.set(true);
        AdQualityControl adQualityControl4 = l03.f37247g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = l03.f37247g) == null) {
            return;
        }
        l03.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (Qh) null);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Gh gh2;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onAttachedToWindow " + this);
        }
        super.onAttachedToWindow();
        if (!this.f38360e) {
            if (Intrinsics.areEqual(this.f38370j.f36741b, "default")) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                B();
            }
        }
        C4130wc c4130wc = this.A;
        if (c4130wc != null) {
            C3577ac c3577ac = c4130wc.f39842d;
            if (c3577ac != null) {
                c3577ac.b();
            }
            C3577ac c3577ac2 = c4130wc.f39843e;
            if (c3577ac2 != null) {
                c3577ac2.b();
            }
            C3577ac c3577ac3 = c4130wc.f39844f;
            if (c3577ac3 != null) {
                c3577ac3.b();
            }
        }
        O();
        if (this.f38396w == null) {
            ViewParent parent = getParent();
            this.f38396w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        U();
        R();
        Q();
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
        if (interfaceC3878m93 == null || (gh2 = ((C3903n9) interfaceC3878m93).f39085a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onDetachedFromWindow " + this);
        }
        U5 u52 = this.D0;
        if (u52 != null) {
            U5.a(u52, 8, true, null, 12);
        }
        C4130wc c4130wc = this.A;
        if (c4130wc != null) {
            C3577ac c3577ac = c4130wc.f39842d;
            if (c3577ac != null) {
                c3577ac.a();
            }
            C3577ac c3577ac2 = c4130wc.f39843e;
            if (c3577ac2 != null) {
                c3577ac2.a();
            }
            C3577ac c3577ac3 = c4130wc.f39844f;
            if (c3577ac3 != null) {
                c3577ac3.a();
            }
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "Detached from window");
        }
        L0 l02 = this.H0;
        if (l02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            l02 = null;
        }
        if (l02.f37244d.get()) {
            l02.a("session end is already triggered");
        } else if (!l02.f37241a.getEnabled()) {
            l02.a("config kill switch - false. ad quality will skip");
        } else if (l02.f37247g == null) {
            l02.a("setup not done. ignore trigger");
        } else {
            l02.f37244d.set(true);
            l02.a(false);
        }
        if (this.I0.get()) {
            eg.i.d(A9.f36557c, null, null, new Wh(this, null), 3, null);
        }
        U();
        T();
        S();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e10) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
            if (interfaceC3878m93 != null) {
                String TAG3 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3903n9) interfaceC3878m93).b(TAG3, "Detaching WebView from window encountered an error ( " + e10.getMessage() + " )");
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (!this.f38378n) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f38360e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).c(TAG2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
        if (interfaceC3878m93 != null) {
            String TAG3 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3903n9) interfaceC3878m93).a(TAG3, "onDoubleTapEvent detected \n " + e10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (e10.getAction() == 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(F3.c(e10.getX()));
                jSONArray.put(F3.c(e10.getY()));
            } catch (JSONException e11) {
                InterfaceC3878m9 interfaceC3878m94 = this.f38368i;
                if (interfaceC3878m94 != null) {
                    String TAG4 = f38347g1;
                    Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    ((C3903n9) interfaceC3878m94).a(TAG4, "Exception in onDoubleTap", e11);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            g("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        Intrinsics.checkNotNullParameter(e22, "e2");
        if (!this.f38378n) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f38360e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).c(TAG2, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY()))})));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(e22.getX())), Integer.valueOf(F3.c(e22.getY()))})));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f10), Float.valueOf(f11)})));
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
            if (interfaceC3878m93 != null) {
                String TAG3 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3903n9) interfaceC3878m93).a(TAG3, "Exception in onFling", e10);
            }
        }
        g("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (!this.f38378n) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.f38360e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).c(TAG2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
        if (interfaceC3878m93 != null) {
            String TAG3 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3903n9) interfaceC3878m93).a(TAG3, "onLongPress detected \n " + e10);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(e10.getX()));
            jSONArray.put(F3.c(e10.getY()));
        } catch (JSONException e11) {
            InterfaceC3878m9 interfaceC3878m94 = this.f38368i;
            if (interfaceC3878m94 != null) {
                String TAG4 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C3903n9) interfaceC3878m94).a(TAG4, "Exception in onLongPress", e11);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        Intrinsics.checkNotNullParameter(e22, "e2");
        if (this.f38360e && !this.V) {
            this.V = true;
            SparseArray sparseArray = InMobiAdActivity.f36523k;
            f38345e1.getClass();
            JSONObject jsonObject = Mh.a("IN_CUSTOM_BROWSER", "onScroll");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = InMobiAdActivity.f36524l;
            if (gestureDetectorOnGestureListenerC3635ci != null) {
                gestureDetectorOnGestureListenerC3635ci.c(jsonObject);
            }
            return false;
        }
        if (!this.f38378n) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "onScroll detected \n " + motionEvent + " \n " + e22);
        }
        if (!this.f38360e) {
            C3864lk scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - scrollThrottler.f38992b < scrollThrottler.f38991a) {
                scrollThrottler.f38992b = jElapsedRealtime;
            } else {
                scrollThrottler.f38992b = jElapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY()))})));
                        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c(e22.getX())), Integer.valueOf(F3.c(e22.getY()))})));
                    } catch (Exception e10) {
                        InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
                        if (interfaceC3878m93 != null) {
                            String TAG3 = f38347g1;
                            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                            ((C3903n9) interfaceC3878m93).a(TAG3, "Exception in onScroll", e10);
                        }
                    }
                    g("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (!this.f38378n) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f38360e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).c(TAG2, "Click gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
        if (interfaceC3878m93 != null) {
            String TAG3 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3903n9) interfaceC3878m93).a(TAG3, "onSingleTapConfirmed detected \n " + e10);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(e10.getX()));
            jSONArray.put(F3.c(e10.getY()));
        } catch (JSONException e11) {
            InterfaceC3878m9 interfaceC3878m94 = this.f38368i;
            if (interfaceC3878m94 != null) {
                String TAG4 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C3903n9) interfaceC3878m94).a(TAG4, "Exception in onSingleTapConfirmed", e11);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onSingleTapUp detected \n " + e10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "onSizeChanged " + this);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "onSizeChanged (" + i10 + ", " + i11 + ")");
        }
        if (i10 == 0 || i11 == 0) {
            return;
        }
        a(F3.b(i10 / J5.b()), F3.b(i11 / J5.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.J0) {
                InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
                if (interfaceC3878m9 != null) {
                    String TAG = f38347g1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C3903n9) interfaceC3878m9).b(TAG, "onTouchEvent Invalid Coordinates " + event);
                }
                this.J0 = true;
            }
            return super.onTouchEvent(event);
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "onTouchEvent " + this);
        }
        if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onWindowFocusChanged(boolean r5) {
        /*
            r4 = this;
            com.inmobi.media.m9 r0 = r4.f38368i
            if (r0 == 0) goto L29
            java.lang.String r1 = com.inmobi.media.GestureDetectorOnGestureListenerC3635ci.f38347g1
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onWindowFocusChanged "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " - "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.inmobi.media.n9 r0 = (com.inmobi.media.C3903n9) r0
            r0.a(r1, r2)
        L29:
            super.onWindowFocusChanged(r5)
            r0 = 1
            if (r5 == 0) goto L4a
            boolean r5 = r4.isShown()
            if (r5 == 0) goto L49
            com.inmobi.media.n7 r5 = com.inmobi.media.C3976q7.f39351k
            int r1 = r4.f38399x0
            boolean r1 = r5.b(r4, r4, r1)
            if (r1 == 0) goto L49
            int r1 = r4.f38399x0
            boolean r5 = r5.a(r4, r4, r1)
            if (r5 == 0) goto L49
            r5 = r0
            goto L4a
        L49:
            r5 = 0
        L4a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 <= r2) goto L5d
            android.app.Activity r1 = r4.getFullScreenActivity()
            if (r1 == 0) goto L5d
            boolean r1 = com.google.android.gms.ads.internal.util.d.a(r1)
            if (r1 != r0) goto L5d
            return
        L5d:
            r4.d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3635ci.onWindowFocusChanged(boolean):void");
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "onWindowVisibilityChanged " + this + " " + i10);
        }
        super.onWindowVisibilityChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (z11) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                C3901n7 c3901n7 = C3976q7.f39351k;
                if (c3901n7.b(this, this, visibilityTrackingMinPercentage) && c3901n7.a(this, this, visibilityTrackingMinPercentage)) {
                    z10 = true;
                }
            }
        } else {
            z10 = z11;
        }
        d(z10);
    }

    public final void p() {
        if (this.O0) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).a(TAG, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.C0 = true;
        C3887mi c3887mi = this.f38358d0;
        if (c3887mi != null) {
            Map mapA = c3887mi.a();
            long j10 = c3887mi.f39043c;
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3887mi.a("FireAdFailed");
            Wj wj = Wj.f37959a;
            Wj.b(strA, mapA, EnumC3585ak.f38215a);
        }
        getListener().h(this);
    }

    public final void q() {
        if (this.M.get()) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).b(TAG, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.O0) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).a(TAG2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        C3887mi c3887mi = this.f38358d0;
        if (c3887mi != null) {
            Map mapA = c3887mi.a();
            long j10 = c3887mi.f39043c;
            CoroutineScope coroutineScope = AbstractC3790il.f38771a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
            mapA.put("latency", Long.valueOf(jElapsedRealtime));
            c3887mi.f39048h = jElapsedRealtime;
            String strA = c3887mi.a("FireAdReady");
            Wj wj = Wj.f37959a;
            Wj.b(strA, mapA, EnumC3585ak.f38215a);
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
        if (interfaceC3878m93 != null) {
            String TAG3 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C3903n9) interfaceC3878m93).a(TAG3, "fireAdReady " + this);
        }
        this.B0 = true;
        if (this.f38386r == 0) {
            u();
        }
        eg.i.d(A9.f36557c, null, null, new Zh(this, null), 3, null);
        getListener().i(this);
    }

    public final void r() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireBackButtonPressedEvent " + this);
        }
        String str = this.L;
        if (str != null) {
            a(str, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void s() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireClickTrackers " + this);
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.f();
        }
        v();
        getListener().b(this);
    }

    public final void setAdPodHandler(@Nullable InterfaceC4118w0 interfaceC4118w0) {
        this.f38377m0 = interfaceC4118w0;
    }

    public void setAdType(@Nullable String str) {
        this.f38367h0 = str;
    }

    public final void setAllowAutoRedirection(boolean z10) {
        this.f38375l0 = z10;
    }

    public final void setAndUpdateViewState(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "setAndUpdateViewState " + this);
        }
        this.f38402z = state;
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "set state:" + this.f38402z);
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = state.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        e(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z10) {
        this.K = z10;
    }

    public final void setBannerHolderActivity(@NotNull WeakReference<Activity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f38394v = weakReference;
    }

    public final void setBeaconUrl(@Nullable String str) {
        this.L0 = str;
    }

    public final void setBlobProvider(@Nullable E2 e22) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "setBlobProvider " + this);
        }
        this.f38371j0 = e22;
    }

    public final void setCloseAssetArea(@NotNull vo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.W0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!F3.a(context)) {
                return;
            }
        }
        this.f38359d1 = new vo(0, value.f39804b, value.f39805c, 0);
    }

    public final void setConfiguredArea(long j10) {
        this.f38389s0 = ((long) getWidth()) * ((long) getHeight());
    }

    public final void setContentURL(@Nullable String str) {
        this.f38385q0 = str;
    }

    public final void setContextualDataHandler(@Nullable D4 d42) {
        this.X0 = d42;
    }

    public void setCreativeId(@Nullable String str) {
        this.f38349a0 = str;
    }

    public final void setDisableBackButton(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setDisableBackButton " + this);
        }
        this.K = z10;
    }

    public final void setEmbeddedBrowserJsCallbacks(@Nullable S5 s52) {
        this.E0 = s52;
    }

    public final void setEnableNativeGestures(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "enableNativeGestures " + this + " " + z10);
        }
        boolean z11 = this.f38378n;
        this.f38378n = z10;
        if (z10 && !z11) {
            if (this.f38401y0 == null) {
                this.f38401y0 = new C3931oc(this);
            }
        } else {
            if (z10 || !z11) {
                return;
            }
            this.f38401y0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setEnableTouchBeginCallback " + this + " " + z10);
        }
        this.f38382p = z10;
    }

    public final void setEnableTouchEndCallback(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setEnableTouchEndCallback " + this + " " + z10);
        }
        this.f38380o = z10;
    }

    public void setExitAnimation(int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "setExitAnimation " + this);
        }
        this.T = i10;
    }

    public final void setExposureTracker(@Nullable U u10) {
        this.K0 = u10;
    }

    public void setFriendlyViews(@Nullable Map<View, FriendlyObstructionPurpose> map) {
        this.f38369i0 = map;
    }

    public void setFullScreenActivityContext(@Nullable Activity activity) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setFullScreenActivityContext " + this);
        }
        this.f38392u = new WeakReference(activity);
        Y();
        if (this.f38360e || activity == null) {
            return;
        }
        xo xoVar = this.N0;
        if (xoVar != null) {
            xoVar.a();
        }
        this.N0 = new xo(activity, this.R0, this.f38368i);
    }

    public final void setImmersiveMode(boolean z10) {
        this.W0 = z10;
    }

    public void setImpressionId(@Nullable String str) {
        this.f38357d = str;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(@Nullable Ya ya2) {
        U5 u52 = this.D0;
        if (u52 != null) {
            u52.f37825j = ya2;
            u52.f37826k = new Wa(ya2, u52);
        }
    }

    public final void setLandingScheme(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f38362f = str;
    }

    public final void setMCreativeType(@Nullable String str) {
        this.F0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i10) {
        this.f38399x0 = i10;
    }

    public final void setMImpressionMinTimeViewed(int i10) {
        this.f38397w0 = i10;
    }

    public final void setMViewableAd(@Nullable Fn fn) {
        this.f38379n0 = fn;
    }

    public final void setMarkupTypeAdUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.S0 = str;
    }

    public final void setOrientationProperties(@NotNull Ff ff2) {
        Intrinsics.checkNotNullParameter(ff2, "<set-?>");
        this.G0 = ff2;
    }

    @VisibleForTesting
    public final void setPingAckListener(@NotNull InterfaceC3607bg pingAckListener) {
        Intrinsics.checkNotNullParameter(pingAckListener, "pingAckListener");
        this.f38384q = pingAckListener;
    }

    @VisibleForTesting
    public final void setPingManager(@NotNull C3684eg pingManager) {
        Intrinsics.checkNotNullParameter(pingManager, "pingManager");
        this.f38363f0 = pingManager;
    }

    public final void setPlacementId(long j10) {
        this.W = j10;
    }

    public final void setPreloadView(boolean z10) {
    }

    public void setReferenceContainer(@Nullable C c10) {
        this.f38373k0 = c10;
    }

    public final void setRenderViewEventListener(@Nullable AbstractC3686ei abstractC3686ei) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "setRenderViewEventListener " + this);
        }
        this.f38398x = abstractC3686ei;
    }

    public final void setRenderViewTelemetry(@Nullable C3887mi c3887mi) {
        this.f38358d0 = c3887mi;
    }

    public final void setScrollable(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "setScrollable " + this);
        }
        setScrollContainer(z10);
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public final void setShouldFireLandingPageBeacons(boolean z10) {
        this.M0 = z10;
    }

    public void setTelemetryManagerMap(@Nullable Map<String, C3994r1> map) {
        this.P0 = map;
    }

    @VisibleForTesting
    public final void setUnloaded(boolean z10) {
        this.O0 = z10;
    }

    public final void setUseCustomClose(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setUseCustomClose " + this + " " + z10);
        }
        this.G = z10;
    }

    public void setViewTouchTimestamp(long j10) {
        this.f38364g = j10;
    }

    public final void setWatermark(@NotNull final WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        if (!getAdConfig().getWatermarkEnabled()) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        final byte[] bArrDecode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        if (!this.f38352b0.get()) {
            this.f38352b0.set(true);
            this.f38355c0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: w3.e6
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    GestureDetectorOnGestureListenerC3635ci.a(this.f107033b, bArrDecode, watermarkData);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.f38355c0);
        } else {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).c(TAG2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "stopLoading " + this);
        }
        if (this.M.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireEvent " + this + " 2");
        }
    }

    public void u() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireImpression " + this);
        }
        if (Intrinsics.areEqual("video", this.F0) || Intrinsics.areEqual("audio", this.F0)) {
            return;
        }
        F();
        g("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void v() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireOnUserInteraction " + this);
        }
        g("window.imraidview.onUserInteraction();");
    }

    public final void w() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "firePopupBlockedEvent " + this);
        }
        g("window.mraidview.popupBlocked('popupBlocked')");
    }

    public final void x() {
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "fullScreenActivity is not null and finishing");
            }
            InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof InMobiAdActivity ? (InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.a();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean z() {
        if (Intrinsics.areEqual(getAdType(), "banner") && getAdConfig().getMraid3().getBannerEnabled()) {
            return true;
        }
        return Intrinsics.areEqual(getAdType(), "int") && getAdConfig().getMraid3().getInterstitialEnabled();
    }

    public final void l() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "dismissCurrentIntAdViewContainerInShowNextPodFlow " + this);
        }
        C4130wc c4130wc = this.A;
        if (c4130wc != null) {
            C3757hc c3757hc = c4130wc.f39841c;
            if (c3757hc != null) {
                c3757hc.b();
            }
            c4130wc.f39841c = null;
        }
        if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, this.f38402z)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof ViewGroup) {
                this.f38372k.b(new Function1() { // from class: w3.r6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC3635ci.b((C3837ki) obj);
                    }
                });
            }
            SparseArray sparseArray = InMobiAdActivity.f36523k;
            Intrinsics.checkNotNullParameter(this, "container");
            InMobiAdActivity.f36523k.remove(hashCode());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GestureDetectorOnGestureListenerC3635ci(Context context, byte b10, Set set, String str, boolean z10, String landingScheme, long j10, C3738gi c3738gi, InterfaceC3878m9 interfaceC3878m9, Di route, ko webViewFactory, C3919o0 c3919o0, AdConfig adConfig) {
        Kh nh2;
        vo voVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        super(applicationContext);
        this.f38351b = b10;
        this.f38354c = set;
        this.f38357d = str;
        this.f38360e = z10;
        this.f38362f = landingScheme;
        this.f38364g = j10;
        this.f38366h = c3738gi;
        this.f38368i = interfaceC3878m9;
        this.f38370j = route;
        this.f38372k = webViewFactory;
        this.f38374l = c3919o0;
        this.f38376m = adConfig;
        this.f38382p = true;
        this.f38384q = new Yh(this);
        this.f38388s = new C3739gj(interfaceC3878m9);
        this.f38390t = lf.i.a(new Function0() { // from class: w3.s6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3635ci.c(this.f107297b);
            }
        });
        this.f38392u = new WeakReference(null);
        this.f38394v = new WeakReference(null);
        this.f38400y = ng.f.b(false, 1, null);
        this.f38402z = Profile.DEFAULT_PROFILE_NAME;
        this.E = true;
        this.F = true;
        this.H = true;
        this.I = Hn.f37034a;
        this.M = new AtomicBoolean(false);
        this.N = new Object();
        this.O = new Object();
        this.Q = true;
        this.T = -1;
        this.W = Long.MIN_VALUE;
        this.f38352b0 = new AtomicBoolean(false);
        this.f38361e0 = lf.i.b(lf.l.f94210c, new Function0() { // from class: w3.f6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3635ci.b(this.f107049b);
            }
        });
        this.f38365g0 = lf.i.a(new Function0() { // from class: w3.g6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3635ci.A();
            }
        });
        this.f38393u0 = new Ph(this);
        this.f38395v0 = new Sh(this);
        this.f38397w0 = Integer.MIN_VALUE;
        this.f38399x0 = Integer.MIN_VALUE;
        this.I0 = new AtomicBoolean(true);
        this.Q0 = new Qh(this);
        this.R0 = new C3609bi(this);
        this.S0 = "html";
        this.T0 = new Th(this, context);
        this.U0 = new Rh(this);
        this.V0 = new Oh(this);
        String TAG = f38347g1;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        toString();
        f38345e1.getClass();
        f38348h1.a();
        this.f38373k0 = this;
        this.f38381o0 = true;
        this.G0 = new Ff();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b10 == 1);
        this.f38403z0 = gestureDetector;
        this.A0 = new C4113vk(this);
        if (this.f38378n && this.f38401y0 == null) {
            this.f38401y0 = new C3931oc(this);
        }
        if (c3738gi != null) {
            this.f38358d0 = new C3887mi(c3738gi);
        }
        Jh.a(this, interfaceC3878m9);
        if (c3919o0 != null) {
            setAdType(c3919o0.f39123a);
            this.W0 = c3919o0.f39124b;
            this.W = c3919o0.f39125c;
            this.f38375l0 = c3919o0.f39126d;
            setCreativeId(c3919o0.f39127e);
            this.f38377m0 = c3919o0.f39131i;
            this.f38385q0 = c3919o0.f39132j;
            this.S0 = c3919o0.f39129g;
            String str2 = c3919o0.f39130h;
            if (str2 != null) {
                setAdSize(str2);
            }
            setTelemetryManagerMap(c3919o0.f39133k);
            b(c3919o0.f39128f);
        }
        this.f38350a1 = new C3583ai(this);
        this.f38353b1 = new Vh(this);
        if (getAdConfig().getRendering().getDisableShowCustomView()) {
            nh2 = new Kh(this);
        } else {
            nh2 = new Nh(this);
        }
        this.f38356c1 = nh2;
        if (!this.W0 && !F3.a(context)) {
            voVar = new vo(0, 0, 0, 0);
        } else {
            voVar = new vo(0, 44, 44, 0);
        }
        this.f38359d1 = voVar;
    }

    public final void i(String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "loadScript " + this);
        }
        loadUrl(str);
    }

    public final void k() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "disableHardwareAcceleration called. " + this);
        }
        try {
            setLayerType(1, null);
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    public final void f(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "processUseCustomCloseRequest " + this + " " + z10);
        }
        setUseCustomClose(z10);
        U();
    }

    public final void c(String str, String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "sendTelemetryForAutoRedirectFraud " + this + " " + str + " " + str2);
        }
        HashMap map = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            map.put("creativeId", creativeId);
        }
        map.put("trigger", str);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        map.put("adType", str2);
        a("BlockAutoRedirection", map);
    }

    public final void h() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "completeFromInterActive " + this);
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.g();
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "completeFromInterActive");
        }
    }

    public final void f(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (getAdConfig().getPingV2().getEnabled()) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).a(TAG, "handlePing " + this);
            }
            if (this.f38363f0 == null) {
                this.f38363f0 = new C3684eg(this.f38384q, this.f38358d0);
            }
            C3684eg c3684eg = this.f38363f0;
            Intrinsics.checkNotNull(c3684eg);
            c3684eg.getClass();
            Intrinsics.checkNotNullParameter(json, "json");
            eg.i.d(A9.f36558d, null, null, new C3633cg(c3684eg, json, null), 3, null);
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "pings v2 is disabled " + this);
        }
        C3887mi c3887mi = this.f38358d0;
        if (c3887mi != null) {
            Intrinsics.checkNotNullParameter("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3887mi.a();
            mapA.put("errorCode", (short) 2257);
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC3810jg.a("PingFailed", mapA);
        }
        InterfaceC3607bg interfaceC3607bg = this.f38384q;
        Z5[] z5Arr = Z5.f38096a;
        ((Yh) interfaceC3607bg).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    public final void g() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "closeAll " + this);
        }
        InterfaceC4118w0 interfaceC4118w0 = this.f38377m0;
        if (interfaceC4118w0 != null) {
            interfaceC4118w0.b();
        }
        x();
    }

    public final void c(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireViewableChange " + this + " " + z10);
        }
        g("window.mraidview.broadcastEvent('viewableChange'," + z10 + ");");
    }

    public final void a(C3931oc movementGestureDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (!this.f38360e && getRenderingConfig().getSupportedGestures().contains(4)) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).a(TAG, StringsKt.n(" onScaleDetected\n " + initialEvent + " \n " + endEvent));
            }
            JSONArray jSONArray = new JSONArray();
            float f10 = 2;
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(F3.c((endEvent.getX(1) + endEvent.getX()) / f10)), Integer.valueOf(F3.c((endEvent.getY(1) + endEvent.getY()) / f10))})));
            g("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).c(TAG2, "Pinch gesture is disabled from config");
        }
    }

    public static final Unit c(C3837ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m();
        return Unit.f93236a;
    }

    public final void b(float f10, float f11) {
        if (!this.f38380o) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "onTouchEnd detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(f10));
            jSONArray.put(F3.c(f11));
        } catch (JSONException e10) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
            if (interfaceC3878m93 != null) {
                String TAG3 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3903n9) interfaceC3878m93).a(TAG3, "Exception in onTouchEnd", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r6.equals("html5video") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
    
        if (r6.equals(net.pubnative.lite.sdk.mraid.MRAIDNativeFeature.INLINE_VIDEO) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        if (r5.B == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        if (r5.Q == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0126, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        r6 = r5.f38368i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC3635ci.f38347g1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "TAG");
        ((com.inmobi.media.C3903n9) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3635ci.m(java.lang.String):boolean");
    }

    public final void c(String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "evaluateScript " + this);
        }
        evaluateJavascript(str, null);
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final boolean c() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    public final void e(String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireStateChange " + this + " " + str);
        }
        g("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void c(String jsCallbackNamespace, String callback, String blob) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(blob, "blob");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "retrievedBlob");
        }
        a(jsCallbackNamespace, callback + "(" + blob + ");");
    }

    public final void e(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "processDisableCloseRegionRequest " + this + " " + z10);
        }
        this.J = z10;
        U();
    }

    public final void c(int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "showPodAdAtIndex " + this + " " + i10);
        }
        if (this.I == Hn.f37036c && this.f38377m0 != null && !this.M.get()) {
            InterfaceC4118w0 interfaceC4118w0 = this.f38377m0;
            if (interfaceC4118w0 != null) {
                interfaceC4118w0.a(i10, this, getFullScreenActivity());
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    public static final C3864lk b(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        return new C3864lk(gestureDetectorOnGestureListenerC3635ci.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    public final void a(float f10, float f11) {
        if (!this.f38382p) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).c(TAG, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "onTouchBegin detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(f10));
            jSONArray.put(F3.c(f11));
        } catch (JSONException e10) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
            if (interfaceC3878m93 != null) {
                String TAG3 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3903n9) interfaceC3878m93).a(TAG3, "Exception in onTouchBegin", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    @Override // com.inmobi.media.C
    public void b() throws JSONException {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "destroyContainer " + this);
        }
        j();
        this.f38372k.b(new Function1() { // from class: w3.l6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GestureDetectorOnGestureListenerC3635ci.a((C3837ki) obj);
            }
        });
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.f38381o0 && omidConfig.isOmidEnabled()) {
            Bf.f36629a.getClass();
            if (Omid.isActive()) {
                new C3763hi(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void c(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).a(TAG, "onLpLifeCycleEvent " + this);
            }
            g("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jsonObject + ");");
        }
    }

    public final void c(GestureDetectorOnGestureListenerC3635ci sourceView, String targetId) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "fireShowWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.g("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 com.inmobi.media.Ua, still in use, count: 2, list:
          (r0v4 com.inmobi.media.Ua) from 0x00a5: MOVE (r19v0 com.inmobi.media.Ua) = (r0v4 com.inmobi.media.Ua)
          (r0v4 com.inmobi.media.Ua) from 0x005f: MOVE (r19v2 com.inmobi.media.Ua) = (r0v4 com.inmobi.media.Ua)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // com.inmobi.media.AbstractC4170y2
    public final com.inmobi.media.Ua d() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3635ci.d():com.inmobi.media.Ua");
    }

    public static final void a(GestureDetectorOnGestureListenerC3635ci renderView, byte[] bArr, WatermarkData watermarkData) {
        InterfaceC3878m9 interfaceC3878m9 = renderView.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "adding overlay to renderview");
        }
        Context context = renderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FrameLayout overlayLayout = Zn.a(context, bArr, watermarkData.getAlpha());
        Intrinsics.checkNotNullParameter(overlayLayout, "overlayLayout");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (renderView.getParent() != null) {
            ViewParent parent = renderView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(overlayLayout, 0);
        }
        renderView.getViewableAd().a(overlayLayout, FriendlyObstructionPurpose.NOT_VISIBLE);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = renderView.f38355c0;
        if (onGlobalLayoutListener != null) {
            renderView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            renderView.f38355c0 = null;
        }
    }

    public final void b(Df orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "handle orientationChange " + this + " " + orientation);
        }
        a(Ef.a(orientation));
    }

    public final void b(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "processMediaPlaybackRequest " + this);
        }
        if (this.O0) {
            InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).b(TAG2, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.f38351b) {
            InterfaceC3878m9 interfaceC3878m93 = this.f38368i;
            if (interfaceC3878m93 != null) {
                String TAG3 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((C3903n9) interfaceC3878m93).b(TAG3, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f38392u.get();
        if (activity == null) {
            InterfaceC3878m9 interfaceC3878m94 = this.f38368i;
            if (interfaceC3878m94 != null) {
                String TAG4 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((C3903n9) interfaceC3878m94).b(TAG4, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        C4130wc c4130wc = this.A;
        if (c4130wc != null) {
            c4130wc.a(url, activity);
        }
    }

    public final void a(String url, String templateInfoStr, boolean z10) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        Exception exc;
        Activity activity;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(templateInfoStr, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(templateInfoStr);
            InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
            if (interfaceC3878m9 != null) {
                try {
                    String TAG = f38347g1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C3903n9) interfaceC3878m9).a(TAG, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
                } catch (Exception e10) {
                    exc = e10;
                    gestureDetectorOnGestureListenerC3635ci = this;
                }
            }
            if (Intrinsics.areEqual(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.f38392u.get()) != null) {
                Lazy lazy = E0.f36762a;
                try {
                    E0.a(activity, this, url, z10, jSONObject, this.Q0);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    gestureDetectorOnGestureListenerC3635ci = this;
                }
            } else {
                gestureDetectorOnGestureListenerC3635ci = this;
                try {
                    Lazy lazy2 = E0.f36762a;
                    E0.a(gestureDetectorOnGestureListenerC3635ci, this, url, z10, jSONObject, gestureDetectorOnGestureListenerC3635ci.Q0);
                    return;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        } catch (Exception e13) {
            e = e13;
            gestureDetectorOnGestureListenerC3635ci = this;
        }
        exc = e;
        InterfaceC3878m9 interfaceC3878m92 = gestureDetectorOnGestureListenerC3635ci.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, "issue wile reporting ad", exc);
        }
    }

    public static final Unit b(C3837ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m();
        return Unit.f93236a;
    }

    public final void b(int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "loadPodAd " + this);
        }
        if (this.I == Hn.f37036c && this.f38377m0 != null && !this.M.get()) {
            InterfaceC4118w0 interfaceC4118w0 = this.f38377m0;
            if (interfaceC4118w0 != null) {
                interfaceC4118w0.a(i10, this);
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).b(TAG2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void a(MotionEvent motionEvent) {
        C3931oc c3931oc;
        if (this.f38360e && !this.U) {
            this.U = true;
            SparseArray sparseArray = InMobiAdActivity.f36523k;
            f38345e1.getClass();
            JSONObject jsonObject = Mh.a("IN_CUSTOM_BROWSER", "onInteraction");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = InMobiAdActivity.f36524l;
            if (gestureDetectorOnGestureListenerC3635ci != null) {
                gestureDetectorOnGestureListenerC3635ci.c(jsonObject);
            }
        }
        if (this.f38351b == 1 && (c3931oc = this.f38401y0) != null) {
            c3931oc.a(motionEvent);
        }
        this.f38403z0.onTouchEvent(motionEvent);
    }

    public final void b(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "fireNextAdShowComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adShowSuccess'," + z10 + ");";
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).a(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        g(str);
    }

    public final void b(String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "creativeType " + this + " " + str);
        }
        this.F0 = str;
    }

    public final void a(AbstractC3686ei abstractC3686ei) {
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "initialize " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (Intrinsics.areEqual(this.S0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        N();
        this.f38398x = abstractC3686ei;
        ViewParent parent = getParent();
        this.f38396w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        C3981qc c3981qc = new C3981qc(url, maxRetries, retryInterval, expiry, interfaceC3878m92);
        if (url != null) {
            eg.i.d(A9.f36557c, null, null, new C3956pc(c3981qc, null), 3, null);
        } else if (interfaceC3878m92 != null) {
            String TAG2 = c3981qc.f39378f;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).b(TAG2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.f38360e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.f38356c1);
        if (!this.f38360e) {
            C4103va c4103va = new C4103va(this.f38351b, this);
            InterfaceC3878m9 logger = this.f38368i;
            if (logger != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c4103va.f39766c = logger;
            }
            addJavascriptInterface(c4103va, "sdkController");
        }
        this.A = new C4130wc(this, this.f38368i);
        this.H0 = new L0(getAdConfig().getAdQuality(), this.f38368i);
        if (i10 >= 29) {
            C3787ii c3787ii = new C3787ii(this.f38368i, this.f38358d0);
            Object value = AbstractC3925o6.f39164c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            setWebViewRenderProcessClient((ExecutorService) value, c3787ii);
        }
        C3919o0 c3919o0 = this.f38374l;
        if (c3919o0 != null && (adQualityControl = c3919o0.f39136n) != null) {
            L0 l02 = this.H0;
            if (l02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
                l02 = null;
            }
            l02.getClass();
            Intrinsics.checkNotNullParameter(adQualityControl, "adQualityControl");
            l02.a("adQuality session setup");
            if (!l02.f37241a.getEnabled()) {
                l02.a("config kill switch while setup - false. ad quality will skip");
            } else if (l02.f37243c.get()) {
                l02.a("session already started. skip");
            } else {
                l02.a("verifying control flags");
                String beacon = adQualityControl.getBeacon();
                if (beacon != null && beacon.length() == 0) {
                    l02.a("no beacon received. aborting...");
                    CoroutineScope coroutineScope = E0.f36766e;
                    if (coroutineScope != null) {
                        kotlinx.coroutines.i.d(coroutineScope, new CancellationException("Shutdown"));
                    }
                    E0.f36766e = null;
                    l02.a("session end - cleanup");
                    l02.f37247g = null;
                    l02.f37246f.clear();
                    l02.f37243c.set(false);
                    l02.f37244d.set(false);
                    l02.a("ad quality session is already in progress. skipping...");
                } else {
                    l02.f37247g = adQualityControl;
                }
            }
        }
        C3919o0 c3919o02 = this.f38374l;
        if (c3919o02 != null && (watermarkData = c3919o02.f39135m) != null) {
            setWatermark(watermarkData);
        }
        C3919o0 c3919o03 = this.f38374l;
        if (c3919o03 != null ? Intrinsics.areEqual(c3919o03.f39134l, Boolean.TRUE) : false) {
            k();
        }
    }

    public final void d(String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireDetectAutoRedirectFraud " + this + " " + str);
        }
        g("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.f38360e);
        }
        g("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void d(JSONObject jSONObject) {
        short s10;
        final String strOptString = jSONObject.optString("errorCode");
        Object objA = H3.a(new Function0() { // from class: w3.h6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Short.valueOf(GestureDetectorOnGestureListenerC3635ci.l(strOptString));
            }
        });
        if (Result.j(objA)) {
            short sShortValue = ((Number) objA).shortValue();
            C3887mi c3887mi = this.f38358d0;
            if (c3887mi != null) {
                Map mapA = c3887mi.a();
                switch (sShortValue) {
                    case 101:
                        s10 = 2261;
                        break;
                    case 102:
                        s10 = 2262;
                        break;
                    case 103:
                        s10 = 2263;
                        break;
                    case 104:
                        s10 = 2267;
                        break;
                    case 105:
                        s10 = 2266;
                        break;
                    case 106:
                        s10 = 2265;
                        break;
                    case 107:
                        s10 = 2264;
                        break;
                    default:
                        switch (sShortValue) {
                            case 301:
                                s10 = 2268;
                                break;
                            case 302:
                                s10 = 2269;
                                break;
                            case 303:
                                s10 = 2270;
                                break;
                            case 304:
                                s10 = 2271;
                                break;
                            case 305:
                                s10 = 2272;
                                break;
                            case 306:
                                s10 = 2273;
                                break;
                            case 307:
                                s10 = 2274;
                                break;
                            case 308:
                                s10 = 2275;
                                break;
                            case 309:
                                s10 = 2276;
                                break;
                            case 310:
                                s10 = 2277;
                                break;
                            case 311:
                                s10 = 2278;
                                break;
                            case 312:
                                s10 = 2280;
                                break;
                            case 313:
                                s10 = 2281;
                                break;
                            default:
                                s10 = sShortValue;
                                break;
                        }
                        break;
                }
                mapA.put("errorCode", Short.valueOf(s10));
                long j10 = c3887mi.f39043c;
                CoroutineScope coroutineScope = AbstractC3790il.f38771a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                Wj wj = Wj.f37959a;
                Wj.b("CompanionWebViewLoadFailed", mapA, EnumC3585ak.f38215a);
            }
        }
    }

    public final void b(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onCTLifeCycleEvent " + this);
        }
        g("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jsonObject + ");");
    }

    public final void j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C3887mi c3887mi = this.f38358d0;
        if (c3887mi != null) {
            c3887mi.b();
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "loadUrlInWebView " + this);
        }
        this.P = false;
        if (this.M.get()) {
            return;
        }
        loadUrl(url);
    }

    public final void b(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireLandingPageTracker " + this);
        }
        getListener().a(this, trackerName, macros);
    }

    public final void b(GestureDetectorOnGestureListenerC3635ci sourceView, String targetId) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "fireLoadWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        C3887mi c3887mi = this.f38358d0;
        jSONObject.put("latency", c3887mi != null ? c3887mi.f39048h : 0L);
        sourceView.g("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public static final void d(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, String str) {
        try {
            if (gestureDetectorOnGestureListenerC3635ci.M.get()) {
                return;
            }
            String str2 = "javascript:try{" + str + "}catch(e){}";
            InterfaceC3878m9 interfaceC3878m9 = gestureDetectorOnGestureListenerC3635ci.f38368i;
            if (interfaceC3878m9 != null) {
                String TAG = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C3903n9) interfaceC3878m9).a(TAG, "Injecting javascript");
            }
            gestureDetectorOnGestureListenerC3635ci.c(str2);
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m92 = gestureDetectorOnGestureListenerC3635ci.f38368i;
            if (interfaceC3878m92 != null) {
                String TAG2 = f38347g1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C3903n9) interfaceC3878m92).b(TAG2, "SDK encountered an unexpected error injecting JavaScript in the Ad container; " + e10.getMessage());
            }
        }
    }

    public final void a(RelativeLayout adView) {
        C4183yf c4183yf;
        Intrinsics.checkNotNullParameter(adView, "adBackgroundView");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        C4101v8 c4101v8 = this.Y0;
        if (c4101v8 != null) {
            Intrinsics.checkNotNullParameter(adView, "parentView");
            if (c4101v8.f39751g.get()) {
                return;
            }
            InterfaceC3878m9 interfaceC3878m92 = c4101v8.f39747c;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).b("HybridVideoPlayerHandler", "Inflate called");
            }
            if (c4101v8.f39753i && (c4183yf = c4101v8.f39760p) != null) {
                Intrinsics.checkNotNullParameter(adView, "parentView");
                InterfaceC3878m9 interfaceC3878m93 = c4183yf.f40003g;
                if (interfaceC3878m93 != null) {
                    Intrinsics.checkNotNullExpressionValue("yf", "TAG");
                    ((C3903n9) interfaceC3878m93).c("yf", "startOmidSession");
                }
                Ae ae2 = c4183yf.f40001e;
                if (ae2 != null) {
                    Intrinsics.checkNotNullParameter(adView, "adView");
                    if (ae2.f38485c == null) {
                        InterfaceC3878m9 interfaceC3878m94 = ae2.f38484b;
                        if (interfaceC3878m94 != null) {
                            ((C3903n9) interfaceC3878m94).a(AbstractC3669e1.f38482f, "Failed to registerAdView. adSession is null");
                        }
                    } else {
                        InterfaceC3878m9 interfaceC3878m95 = ae2.f38484b;
                        if (interfaceC3878m95 != null) {
                            ((C3903n9) interfaceC3878m95).a(AbstractC3669e1.f38482f, "registerAdView");
                        }
                        P4.a(ae2.f38483a, new Y0(ae2, adView, null));
                    }
                }
                Ae ae3 = c4183yf.f40001e;
                if (ae3 != null) {
                    if (ae3.f38485c == null) {
                        InterfaceC3878m9 interfaceC3878m96 = ae3.f38484b;
                        if (interfaceC3878m96 != null) {
                            ((C3903n9) interfaceC3878m96).a(AbstractC3669e1.f38482f, "Failed to startAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3878m9 interfaceC3878m97 = ae3.f38484b;
                        if (interfaceC3878m97 != null) {
                            ((C3903n9) interfaceC3878m97).a(AbstractC3669e1.f38482f, "startAdSession");
                        }
                        P4.a(ae3.f38483a, new C3592b1(ae3, null));
                    }
                }
            }
            c4101v8.f39755k.a(adView);
            c4101v8.f39755k.e();
            c4101v8.f39759o = true;
        }
    }

    public final void a(EnumC3952p8 enumC3952p8, Object obj) {
        if (obj instanceof String) {
            obj = "'" + obj + "'";
        }
        String str = "window.imraid.broadcastEvent('" + enumC3952p8.f39266a + "', " + obj + ");";
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).b(TAG, "fireHtmlVideoEvents: " + str);
        }
        g(str);
    }

    public final void a(HashMap params) {
        C4183yf c4183yf;
        Ae ae2;
        Intrinsics.checkNotNullParameter(params, "params");
        getListener().a(params);
        C4101v8 c4101v8 = this.Y0;
        if (c4101v8 == null || (c4183yf = c4101v8.f39760p) == null || (ae2 = c4183yf.f40001e) == null) {
            return;
        }
        ae2.a(InteractionType.CLICK);
    }

    public static final Unit a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "it");
        SparseArray sparseArray = InMobiAdActivity.f36523k;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = InMobiAdActivity.f36524l;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.c(jsonObject);
        }
        return Unit.f93236a;
    }

    public static final Unit a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        SparseArray sparseArray = InMobiAdActivity.f36523k;
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = InMobiAdActivity.f36524l;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.b(trackerName, macros);
        }
        return Unit.f93236a;
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "initContextualData " + this);
        }
        this.X0 = new D4(ad2 != null ? ad2.getContextData() : null, this.W);
    }

    public static final Unit a(C3837ki it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.b();
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final void a(String mraidApi) {
        Intrinsics.checkNotNullParameter(mraidApi, "mraidApi");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "sendFraudBeaconAndTelemetryEvent " + this);
        }
        d(mraidApi);
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(mraidApi, adType);
    }

    public final void a(boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireNextAdLoadComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adLoadSuccess'," + z10 + ");";
        InterfaceC3878m9 interfaceC3878m92 = this.f38368i;
        if (interfaceC3878m92 != null) {
            String TAG2 = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C3903n9) interfaceC3878m92).c(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        g(str);
    }

    public final void a(int i10, int i11) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireSizeChanged " + this + " w-" + i10 + " h-" + i11);
        }
        g("window.mraidview.broadcastEvent('sizeChange'," + i10 + StringUtils.COMMA + i11 + ");");
    }

    public final void a(int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireOrientationChange " + this + " " + i10);
        }
        g("window.imraid.broadcastEvent('orientationChange','" + i10 + "');");
    }

    public final void a(String str, JSONObject message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireError " + this + " - " + message);
        }
        g("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
        d(message);
    }

    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireError " + this + " - " + message + " - " + str2);
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + message + "\", \"" + str2 + "\")");
    }

    public final void a(String str, String callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "fireJavaScriptCallback " + this);
        }
        if (str == null) {
            return;
        }
        g(str + "." + callback);
    }

    public final void a(String str, HashMap map) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "processTelemetryEvent " + this);
        }
        getListener().a(str, map);
    }

    public void a(Ff orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "setOrientationProperties " + this);
        }
        this.G0 = orientationProperties;
        Y();
    }

    public static final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        gestureDetectorOnGestureListenerC3635ci.getListener().k(gestureDetectorOnGestureListenerC3635ci);
    }

    @Override // com.inmobi.media.Gf
    public final void a(Df orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "onOrientationUpdate " + this);
        }
    }

    public final void a(Df orientation, wo woVar) {
        JSONObject jSONObjectA;
        vo voVar;
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "fireOnSafeAreaChanged " + this);
        }
        Intrinsics.checkNotNullParameter(woVar, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        try {
            woVar.getClass();
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            voVar = (vo) woVar.f39881a.get(orientation);
        } catch (Exception unused) {
        }
        if (voVar != null) {
            jSONObjectA = voVar.a();
            jSONObjectA.put("orientation", Ef.a(orientation));
        } else {
            jSONObjectA = null;
        }
        g("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObjectA + ")");
    }

    public final boolean a(JsResult jsResult) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "shouldRenderPopup " + this);
        }
        if (getRenderingConfig().getShouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        w();
        return false;
    }

    @Override // com.inmobi.media.InterfaceC3911nh
    public final boolean a() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "hasUserInteracted " + getViewTouchTimestamp() + " " + getRenderingConfig().getUserTouchResetTime());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.f38375l0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final void a(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).a(TAG, "handlePingException " + this, e10);
        }
        InterfaceC3607bg interfaceC3607bg = this.f38384q;
        Z5[] z5Arr = Z5.f38096a;
        ((Yh) interfaceC3607bg).a("", PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "Ping exception occurred", System.currentTimeMillis(), 0);
        Lazy lazy = P9.f37527a;
        AbstractC3779i9.a(e10);
    }

    public static final Unit a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = gestureDetectorOnGestureListenerC3635ci.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC3635ci.getListener().a(gestureDetectorOnGestureListenerC3635ci, z10);
        return Unit.f93236a;
    }

    public final void a(boolean z10, short s10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "fireRenderProcessGoneTelemetry");
        }
        C3887mi c3887mi = this.f38358d0;
        if (c3887mi != null) {
            c3887mi.a(z10, s10);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3635ci sourceView, String targetId) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC3878m9 interfaceC3878m9 = this.f38368i;
        if (interfaceC3878m9 != null) {
            String TAG = f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m9).c(TAG, "fireDestroyWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.g("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }
}
