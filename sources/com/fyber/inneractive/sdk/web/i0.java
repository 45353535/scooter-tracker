package com.fyber.inneractive.sdk.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.IAcloseButton;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.Partner;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i0 extends i1 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String[] f23990o0 = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    public com.fyber.inneractive.sdk.mraid.f0 N;
    public final z O;
    public final d0 P;
    public final c0 Q;
    public ViewGroup R;
    public m S;
    public boolean T;
    public int U;
    public e0 V;
    public IAcloseButton W;
    public boolean X;
    public float Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f23991a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f23992b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f23993c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f23994d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f23995e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Orientation f23996f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f23997g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public FrameLayout f23998h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public FrameLayout f23999i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public FrameLayout f24000j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f24001k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f24002l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public t f24003m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final p f24004n0;

    public i0(boolean z10, c0 c0Var, z zVar, d0 d0Var, com.fyber.inneractive.sdk.measurement.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z10, c0Var, rVar);
        this.N = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
        this.T = false;
        this.Z = -1;
        this.f23991a0 = -1;
        this.f23992b0 = -1;
        this.f23993c0 = -1;
        this.f23994d0 = -1;
        this.f23995e0 = -1;
        this.f23996f0 = Orientation.NONE;
        this.H = eVar;
        this.Q = c0Var;
        this.O = zVar;
        this.P = d0Var;
        this.f24004n0 = new p(this);
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public void a(boolean z10) {
        a(new com.fyber.inneractive.sdk.mraid.g0(z10));
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void b() {
        com.fyber.inneractive.sdk.util.r.f23896b.post(new r(this));
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void c() {
        m mVar = this.f23971b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.f23971b.getViewTreeObserver().removeOnPreDrawListener(this.f24004n0);
        }
        com.fyber.inneractive.sdk.util.r.f23896b.post(new s(this));
    }

    public final void d(boolean z10) {
        try {
            Activity activity = (Activity) com.fyber.inneractive.sdk.util.o.a(this.f23971b);
            if (activity != null) {
                if (!z10 || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                    activity.setRequestedOrientation(this.U);
                } else {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                }
            }
        } catch (Exception unused) {
            IAlog.a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.util.g1 g() {
        m mVar;
        return (this.N != com.fyber.inneractive.sdk.mraid.f0.EXPANDED || (mVar = this.S) == null) ? super.g() : mVar.getLastClickedLocation();
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void h() {
        super.h();
        this.N = com.fyber.inneractive.sdk.mraid.f0.LOADING;
        Context contextA = com.fyber.inneractive.sdk.util.o.a(this.f23971b);
        this.U = contextA instanceof Activity ? ((Activity) contextA).getRequestedOrientation() : -1;
        this.f23999i0 = new FrameLayout(contextA);
        this.f24000j0 = new FrameLayout(contextA);
        FrameLayout frameLayout = new FrameLayout(contextA);
        frameLayout.setBackgroundColor(-858993460);
        this.f23998h0 = frameLayout;
        a(contextA, false);
        this.f23971b.setOnKeyListener(new q(this));
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void j() {
        m mVar = this.f23971b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void k() {
        ArrayList arrayList = new ArrayList();
        m mVar = this.f23971b;
        if (mVar == null || mVar.getScaleX() == 1.0f || this.f23971b.getScaleY() == 1.0f) {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.Z, this.f23991a0));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.f23992b0, this.f23993c0));
        } else {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.f23971b.getWidthDp(), this.f23971b.getHeightDp()));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.f23971b.getWidthDp(), this.f23971b.getHeightDp()));
        }
        m mVar2 = this.f23971b;
        int iC = com.fyber.inneractive.sdk.util.o.c(mVar2 != null ? mVar2.getWidth() : this.f23992b0);
        m mVar3 = this.f23971b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.z(iC, com.fyber.inneractive.sdk.util.o.c(mVar3 != null ? mVar3.getHeight() : this.f23993c0)));
        a(arrayList);
        com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
        this.N = f0Var;
        a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final boolean m() {
        c0 c0Var = this.Q;
        return c0Var != null && c0Var.equals(c0.INTERSTITIAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.i0.o():void");
    }

    public final boolean p() {
        return this.N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
    }

    public final void q() {
        com.fyber.inneractive.sdk.measurement.tracker.e bVar;
        com.fyber.inneractive.sdk.measurement.e eVar = this.H;
        if (eVar != null) {
            m mVar = this.f23971b;
            com.fyber.inneractive.sdk.flow.x xVar = this.f23988s;
            boolean z10 = false;
            IAlog.a("omsdk initMraidSession", new Object[0]);
            if (eVar.f21099e == null) {
                IAlog.a("omsdk partner is null", new Object[0]);
                bVar = null;
            } else {
                if (xVar != null && xVar.b() != null && xVar.b().J) {
                    z10 = true;
                }
                com.fyber.inneractive.sdk.measurement.tracker.f fVar = eVar.f21100f;
                Partner partner = eVar.f21099e;
                fVar.getClass();
                bVar = z10 ? new com.fyber.inneractive.sdk.measurement.tracker.b(partner, mVar) : new com.fyber.inneractive.sdk.measurement.tracker.a(partner, mVar);
                bVar.a(mVar);
            }
            this.I = bVar;
        }
        g gVar = this.f23975f;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    public final void r() {
        try {
            if (!(com.fyber.inneractive.sdk.util.o.a(this.f23971b) instanceof Activity) || this.f24003m0 == null) {
                return;
            }
            ((Activity) com.fyber.inneractive.sdk.util.o.a(this.f23971b)).getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f24003m0);
            this.f24003m0 = null;
        } catch (Exception e10) {
            IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e10.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void setAdDefaultSize(int i10, int i11) {
        this.f24001k0 = i10;
        this.f24002l0 = i11;
        this.f23994d0 = i10;
        this.f23995e0 = i11;
    }

    public void setOrientationProperties(boolean z10, String str) {
        if ("portrait".equals(str)) {
            this.f23996f0 = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.f23996f0 = Orientation.LANDSCAPE;
        } else {
            this.f23996f0 = Orientation.NONE;
        }
        j1 j1Var = this.f23976g;
        if (j1Var != null) {
            ((b0) j1Var).a(z10, this.f23996f0);
        }
    }

    public void setResizeProperties() {
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void b(boolean z10) {
        m mVar = this.f23971b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.f23971b.getViewTreeObserver().removeOnPreDrawListener(this.f24004n0);
        }
        com.fyber.inneractive.sdk.util.r.f23896b.post(new s(this));
        m mVar2 = this.S;
        if (mVar2 != null && mVar2.getParent() != null && (this.S.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.S.getParent()).removeView(this.S);
            this.S = null;
        }
        FrameLayout frameLayout = this.f23999i0;
        if (frameLayout != null && this.f24000j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.f24000j0.removeAllViewsInLayout();
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                viewGroup.removeView(this.f24000j0);
            }
        }
        this.f23970a = false;
        if (Build.VERSION.SDK_INT >= 33) {
            r();
        }
        super.b(z10);
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandle url for: %s webView = %s", IAlog.a(this), str, webView);
        if (this.N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED && !TextUtils.isEmpty(str) && webView.equals(this.S) && !this.T) {
            this.T = true;
            return false;
        }
        return super.a(webView, str);
    }

    public final void c(boolean z10) {
        if (this.R == null) {
            return;
        }
        if (z10) {
            int iB = com.fyber.inneractive.sdk.util.o.b(35);
            if (this.W == null) {
                IAcloseButton iAcloseButton = new IAcloseButton(com.fyber.inneractive.sdk.util.o.a(this.f23971b), iB);
                this.W = iAcloseButton;
                iAcloseButton.setOnClickListener(new o(this));
            }
            com.fyber.inneractive.sdk.util.v.a(this.W);
            this.f24000j0.addView(this.W);
            IAcloseButton iAcloseButton2 = this.W;
            ViewGroup.LayoutParams layoutParams = iAcloseButton2.getLayoutParams();
            layoutParams.width = iB;
            layoutParams.height = iB;
            iAcloseButton2.setLayoutParams(layoutParams);
            com.fyber.inneractive.sdk.util.o.a(this.W, 53);
            IAcloseButton iAcloseButton3 = this.W;
            int iB2 = com.fyber.inneractive.sdk.util.o.b(10);
            int iB3 = com.fyber.inneractive.sdk.util.o.b(10);
            ViewGroup.LayoutParams layoutParams2 = iAcloseButton3.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.topMargin = iB2;
                marginLayoutParams.rightMargin = iB3;
                marginLayoutParams.bottomMargin = 0;
                iAcloseButton3.setLayoutParams(marginLayoutParams);
            }
        } else {
            this.f24000j0.removeView(this.W);
        }
        j1 j1Var = this.f23976g;
        if (j1Var != null) {
            ((b0) j1Var).b(z10);
        }
        this.X = !z10;
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void a(Context context, boolean z10) {
        Window window;
        Window window2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) IAConfigManager.O.f20316v.a().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.Y = displayMetrics.density;
        Rect rect = new Rect();
        boolean z11 = context instanceof Activity;
        if (z11 && (window2 = ((Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i10 = rect.top;
        View viewFindViewById = (!z11 || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(R.id.content);
        int top = viewFindViewById != null ? viewFindViewById.getTop() - i10 : 0;
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        double d10 = i11;
        double d11 = 160.0d / ((double) displayMetrics.densityDpi);
        int widthDp = (int) (d11 * d10);
        int heightDp = (int) (d11 * ((double) i12));
        int i13 = (i12 - i10) - top;
        m mVar = this.f23971b;
        if (mVar != null && mVar.getScaleX() != 1.0f && this.f23971b.getScaleY() != 1.0f) {
            widthDp = this.f23971b.getWidthDp();
            heightDp = this.f23971b.getHeightDp();
            int iB = (com.fyber.inneractive.sdk.util.o.b(this.f23971b.getHeightDp()) - i10) - top;
            this.f23992b0 = this.Z;
            this.f23993c0 = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * ((double) iB));
        } else {
            double d12 = 160.0d / ((double) displayMetrics.densityDpi);
            this.f23992b0 = (int) (d10 * d12);
            this.f23993c0 = (int) (d12 * ((double) i13));
        }
        if (this.Z == widthDp && this.f23991a0 == heightDp) {
            return;
        }
        this.Z = widthDp;
        this.f23991a0 = heightDp;
        if (z10) {
            a(new com.fyber.inneractive.sdk.mraid.c0(widthDp, heightDp));
            a(new com.fyber.inneractive.sdk.mraid.a0(this.f23992b0, this.f23993c0));
            a(new com.fyber.inneractive.sdk.mraid.z(this.f23992b0, this.f23993c0));
            int i14 = this.f23994d0;
            if (i14 > 0 && this.f23995e0 > 0) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i14), com.fyber.inneractive.sdk.util.o.c(this.f23995e0)));
                return;
            }
            m mVar2 = this.f23971b;
            if (mVar2 == null || mVar2.getWidth() <= 0 || this.f23971b.getHeight() <= 0) {
                return;
            }
            a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(this.f23971b.getWidth()), com.fyber.inneractive.sdk.util.o.c(this.f23971b.getHeight())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r7, int r8, int r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.i0.a(java.lang.String, int, int, boolean, boolean):void");
    }

    public static HashMap a(Map map) {
        String str;
        HashMap map2 = new HashMap();
        if (map.containsKey("description") && map.containsKey("start")) {
            map2.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                Date dateA = a((String) map.get("start"));
                if (dateA != null) {
                    map2.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, Long.valueOf(dateA.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date dateA2 = a((String) map.get("end"));
                        if (dateA2 != null) {
                            map2.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_END_TIME, Long.valueOf(dateA2.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey("location")) {
                        map2.put(MRAIDNativeFeatureProvider.EVENT_LOCATION, map.get("location"));
                    }
                    if (map.containsKey("summary")) {
                        map2.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        map2.put("availability", Integer.valueOf(C4240b4.i.T.equals(map.get("transparency")) ? 1 : 0));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (map.containsKey("frequency")) {
                        String str2 = (String) map.get("frequency");
                        int i10 = map.containsKey("interval") ? Integer.parseInt((String) map.get("interval")) : -1;
                        if ("daily".equals(str2)) {
                            sb2.append("FREQ=DAILY;");
                            if (i10 != -1) {
                                sb2.append("INTERVAL=" + i10 + ";");
                            }
                        } else {
                            if ("weekly".equals(str2)) {
                                sb2.append("FREQ=WEEKLY;");
                                if (i10 != -1) {
                                    sb2.append("INTERVAL=" + i10 + ";");
                                }
                                if (map.containsKey("daysInWeek")) {
                                    String str3 = (String) map.get("daysInWeek");
                                    StringBuilder sb3 = new StringBuilder();
                                    boolean[] zArr = new boolean[7];
                                    String[] strArrSplit = str3.split(StringUtils.COMMA);
                                    for (String str4 : strArrSplit) {
                                        int i11 = Integer.parseInt(str4);
                                        if (i11 == 7) {
                                            i11 = 0;
                                        }
                                        if (!zArr[i11]) {
                                            StringBuilder sb4 = new StringBuilder();
                                            switch (i11) {
                                                case 0:
                                                    str = "SU";
                                                    break;
                                                case 1:
                                                    str = "MO";
                                                    break;
                                                case 2:
                                                    str = "TU";
                                                    break;
                                                case 3:
                                                    str = "WE";
                                                    break;
                                                case 4:
                                                    str = "TH";
                                                    break;
                                                case 5:
                                                    str = "FR";
                                                    break;
                                                case 6:
                                                    str = "SA";
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of week ", i11));
                                            }
                                            sb4.append(str);
                                            sb4.append(StringUtils.COMMA);
                                            sb3.append(sb4.toString());
                                            zArr[i11] = true;
                                        }
                                    }
                                    if (strArrSplit.length != 0) {
                                        sb3.deleteCharAt(sb3.length() - 1);
                                        String string = sb3.toString();
                                        if (string == null) {
                                            throw new IllegalArgumentException("invalid ");
                                        }
                                        sb2.append("BYDAY=" + string + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                                    }
                                }
                            } else if ("monthly".equals(str2)) {
                                sb2.append("FREQ=MONTHLY;");
                                if (i10 != -1) {
                                    sb2.append("INTERVAL=" + i10 + ";");
                                }
                                if (map.containsKey("daysInMonth")) {
                                    String str5 = (String) map.get("daysInMonth");
                                    StringBuilder sb5 = new StringBuilder();
                                    boolean[] zArr2 = new boolean[63];
                                    String[] strArrSplit2 = str5.split(StringUtils.COMMA);
                                    for (String str6 : strArrSplit2) {
                                        int i12 = Integer.parseInt(str6);
                                        int i13 = i12 + 31;
                                        if (!zArr2[i13]) {
                                            StringBuilder sb6 = new StringBuilder();
                                            if (i12 != 0 && i12 >= -31 && i12 <= 31) {
                                                sb6.append("" + i12);
                                                sb6.append(StringUtils.COMMA);
                                                sb5.append(sb6.toString());
                                                zArr2[i13] = true;
                                            } else {
                                                throw new IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of month ", i12));
                                            }
                                        }
                                    }
                                    if (strArrSplit2.length != 0) {
                                        sb5.deleteCharAt(sb5.length() - 1);
                                        String string2 = sb5.toString();
                                        if (string2 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        sb2.append("BYMONTHDAY=" + string2 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                        }
                    }
                    String string3 = sb2.toString();
                    if (!TextUtils.isEmpty(string3)) {
                        map2.put("rrule", string3);
                    }
                    return map2;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    public static Date a(String str) {
        Date date = null;
        int i10 = 0;
        while (true) {
            String[] strArr = f23990o0;
            if (i10 >= 2) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i10], Locale.getDefault()).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
            i10++;
        }
        return date;
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar, String str) {
        String strA = kVar.a();
        m mVar = this.f23971b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireErrorEvent('" + strA + "', '" + str + "');");
        }
    }

    public static LinkedHashMap a(URI uri) {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split(C4240b4.j.f42670c)) {
                int iIndexOf = str.indexOf(C4240b4.j.f42668b);
                linkedHashMap.put(iIndexOf > 0 ? URLDecoder.decode(str.substring(0, iIndexOf), "UTF-8") : str, (iIndexOf <= 0 || str.length() <= (i10 = iIndexOf + 1)) ? null : URLDecoder.decode(str.substring(i10), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    public final void a(View view, com.fyber.inneractive.sdk.measurement.tracker.d dVar) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        if (view == null || (eVar = this.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.f21120a;
            if (adSession != null) {
                if (dVar == com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton) {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.CLOSE_AD, dVar.name());
                } else {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, dVar.name());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.BANNER_RESIZE_EXPAND;
        InneractiveAdRequest inneractiveAdRequest = this.f23987r;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23988s;
        com.fyber.inneractive.sdk.response.e eVarB = xVar != null ? xVar.b() : null;
        com.fyber.inneractive.sdk.flow.x xVar2 = this.f23988s;
        JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f21037c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
        wVar.f21418c = uVar;
        wVar.f21416a = inneractiveAdRequest;
        wVar.f21419d = jSONArrayB;
        wVar.a("action", kVar.a()).a((String) null);
    }
}
