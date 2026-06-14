package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.content.Context;
import android.webkit.WebView;
import com.amazon.device.ads.DtbConstants;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f56748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f56749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f56750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f56751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c f56752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f56753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f56754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f56755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StateFlow f56756j;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56757r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f56759t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ y f56760u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, y yVar, Continuation continuation) {
            super(2, continuation);
            this.f56759t = z10;
            this.f56760u = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new a(this.f56759t, this.f56760u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56757r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableStateFlow mutableStateFlow = b.this.f56755i;
                w.f fVar = new w.f(this.f56759t, this.f56760u);
                this.f56757r = 1;
                if (mutableStateFlow.emit(fVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b$b, reason: collision with other inner class name */
    public static final class C0717b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56761r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f56762s;

        public C0717b(Continuation continuation) {
            super(2, continuation);
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((C0717b) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C0717b c0717b = b.this.new C0717b(continuation);
            c0717b.f56762s = ((Boolean) obj).booleanValue();
            return c0717b;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56761r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            b.this.f56751e.h(this.f56762s);
            return Unit.f93236a;
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56764r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56765s;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e0.a aVar, Continuation continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f56765s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56764r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            b.this.f56751e.d(((e0.a) this.f56765s).a());
            return Unit.f93236a;
        }
    }

    public b(Context context, WebView webView, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b clickthroughEventHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(clickthroughEventHandler, "clickthroughEventHandler");
        this.f56747a = context;
        this.f56748b = webView;
        this.f56749c = clickthroughEventHandler;
        CoroutineScope coroutineScopeA = i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f56750d = coroutineScopeA;
        this.f56751e = new d(webView);
        this.f56752f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c(context, this);
        this.f56753g = c0.f56385d;
        this.f56754h = new e0(webView, context, coroutineScopeA);
        MutableStateFlow mutableStateFlowA = l0.a(new w.f(true, y.f56537e));
        this.f56755i = mutableStateFlowA;
        this.f56756j = mutableStateFlowA;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a(String url) throws JSONException {
        Intrinsics.checkNotNullParameter(url, "url");
        JSONObject jSONObject = new JSONObject();
        String strC = c(url);
        jSONObject.put("event", "clickthrough");
        jSONObject.put("contentType", "mraid");
        jSONObject.put("url", strC);
        try {
            this.f56749c.a(jSONObject);
            this.f56751e.f("open");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "TAG", "Ad clicked: " + strC, false, 4, null);
        } catch (Exception unused) {
            this.f56751e.g("open", "Can't open links when mraid container is not visible to the user");
        }
    }

    public final String c(String str) {
        return StringsKt.a0(str, "itms-apps://", false, 2, null) ? StringsKt.W(str, "itms-apps://", DtbConstants.HTTPS, false, 4, null) : str;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public StateFlow e() {
        return this.f56756j;
    }

    public final void f() {
        hg.i.F(hg.i.K(this.f56754h.x(), new C0717b(null)), this.f56750d);
        hg.i.F(hg.i.K(this.f56754h.s(), new c(null)), this.f56750d);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void remove() {
        this.f56748b.removeJavascriptInterface("AndroidMraid");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void b() {
        this.f56748b.addJavascriptInterface(this.f56752f, "AndroidMraid");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void d() {
        this.f56753g = c0.f56385d;
        this.f56751e.i(false, false, false, false, true);
        this.f56751e.e(this.f56753g);
        this.f56751e.c(a0.f56371d);
        this.f56751e.d(((e0.a) this.f56754h.s().getValue()).a());
        f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a() {
        if (this.f56753g == c0.f56387f) {
            this.f56753g = c0.f56385d;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a(boolean z10, y forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        eg.i.d(this.f56750d, null, null, new a(z10, forceOrientation, null), 3, null);
    }
}
