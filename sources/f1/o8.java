package f1;

import android.content.Context;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public final class o8 extends u3 {
    public final String P;
    public final String Q;
    public final d2 R;
    public final zb S;
    public final List T;
    public final ag U;
    public final CoroutineDispatcher V;
    public final Function1 W;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70730f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b7 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new b7(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(Context context, String location, a6 mtype, String adUnitParameters, m fileCache, wf wfVar, t6 uiPoster, w1 w1Var, b1.e eVar, String baseUrl, String str, d2 infoIcon, d4 openMeasurementImpressionCallback, u7 adUnitRendererCallback, zb impressionInterface, r1 webViewTimeoutInterface, List scripts, ag eventTracker, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, wfVar, w1Var, eVar, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.P = baseUrl;
        this.Q = str;
        this.R = infoIcon;
        this.S = impressionInterface;
        this.T = scripts;
        this.U = eventTracker;
        this.V = dispatcher;
        this.W = cbWebViewFactory;
    }

    @Override // f1.u3
    public v4 G(Context context) {
        v4 v4Var;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.Q;
        if (str == null || StringsKt.y0(str)) {
            eg.j("html must not be null or blank", null, 2, null);
            return null;
        }
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            v4Var = null;
                                        } catch (Exception e10) {
                                            e = e10;
                                            v4Var = null;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        v4Var = null;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    v4Var = null;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                v4Var = null;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            v4Var = null;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        v4Var = null;
                    }
                } catch (Exception e16) {
                    e = e16;
                    v4Var = null;
                }
            } catch (Exception e17) {
                e = e17;
                v4Var = null;
            }
        } catch (Exception e18) {
            e = e18;
            v4Var = null;
        }
        try {
            i7 i7Var = new i7(context, this.P, this.Q, this.R, this.U, Q(), this.S, this.V, this.W, null, 512, null);
            RelativeLayout webViewContainer = i7Var.getWebViewContainer();
            if (webViewContainer != null) {
                i7Var.d(webViewContainer);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("webViewContainer null when creating HtmlWebViewBase", null, 2, null);
            }
            return i7Var;
        } catch (Exception e19) {
            e = e19;
            I("Can't instantiate WebViewBase: " + e);
            return v4Var;
        }
    }

    @Override // f1.u3
    public void e0() {
        l4 webView;
        super.e0();
        this.S.u();
        v4 v4VarB0 = b0();
        if (v4VarB0 == null || (webView = v4VarB0.getWebView()) == null) {
            return;
        }
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            webView.evaluateJavascript((String) it.next(), null);
        }
    }

    public /* synthetic */ o8(Context context, String str, a6 a6Var, String str2, m mVar, wf wfVar, t6 t6Var, w1 w1Var, b1.e eVar, String str3, String str4, d2 d2Var, d4 d4Var, u7 u7Var, zb zbVar, r1 r1Var, List list, ag agVar, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, a6Var, str2, mVar, wfVar, t6Var, w1Var, eVar, str3, str4, d2Var, d4Var, u7Var, zbVar, r1Var, list, agVar, (i10 & 262144) != 0 ? eg.o0.c() : coroutineDispatcher, (i10 & 524288) != 0 ? a.f70730f : function1);
    }

    @Override // f1.u3
    public void d0() {
    }
}
