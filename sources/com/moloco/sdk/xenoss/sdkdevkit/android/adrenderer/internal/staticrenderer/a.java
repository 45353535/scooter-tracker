package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.scheduling.c;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import eg.x1;
import hg.i;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends d0 implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f56649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f56650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f56651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f56652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f56653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateFlow f56654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SharedFlow f56655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StateFlow f56656j;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a, reason: collision with other inner class name */
    public static final class C0710a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56657r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f56659t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f56660u;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a, reason: collision with other inner class name */
        public static final class C0711a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56661r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a f56662s;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$a, reason: collision with other inner class name */
            public static final class C0712a extends k implements Function3 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56663r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ boolean f56664s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f56665t;

                public C0712a(Continuation continuation) {
                    super(3, continuation);
                }

                public final Object c(boolean z10, g gVar, Continuation continuation) {
                    C0712a c0712a = new C0712a(continuation);
                    c0712a.f56664s = z10;
                    c0712a.f56665t = gVar;
                    return c0712a.invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return c(((Boolean) obj).booleanValue(), (g) obj2, (Continuation) obj3);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56663r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    boolean z10 = this.f56664s;
                    return TuplesKt.to(kotlin.coroutines.jvm.internal.b.a(z10), (g) this.f56665t);
                }
            }

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$b */
            public static final class b extends k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56666r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f56667s;

                public b(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair pair, Continuation continuation) {
                    return ((b) create(pair, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    b bVar = new b(continuation);
                    bVar.f56667s = obj;
                    return bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56666r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    Pair pair = (Pair) this.f56667s;
                    return kotlin.coroutines.jvm.internal.b.a(((Boolean) pair.component1()).booleanValue() || ((g) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0711a(a aVar, Continuation continuation) {
                super(2, continuation);
                this.f56662s = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0711a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0711a(this.f56662s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56661r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    return obj;
                }
                d.b(obj);
                Flow flowC = i.C(this.f56662s.f56653g.u(), this.f56662s.f56653g.s(), new C0712a(null));
                b bVar = new b(null);
                this.f56661r = 1;
                Object objY = i.y(flowC, bVar, this);
                return objY == objG ? objG : objY;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0710a(String str, long j10, Continuation continuation) {
            super(2, continuation);
            this.f56659t = str;
            this.f56660u = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0710a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new C0710a(this.f56659t, this.f56660u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56657r;
            if (i10 == 0) {
                d.b(obj);
                try {
                    a aVar = a.this;
                    e0.a(aVar, aVar.getHtmlCssFixer().a(this.f56659t));
                    long j10 = this.f56660u;
                    C0711a c0711a = new C0711a(a.this, null);
                    this.f56657r = 1;
                    obj = x1.f(j10, c0711a, this);
                    if (obj == objG) {
                        return objG;
                    }
                } catch (Exception e10) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "StaticWebView", "loadHtml", e10, false, 8, null);
                    return new h0.a(g.f56048c);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            if (obj == null) {
                a.this.f56653g.f();
            }
            boolean zBooleanValue = ((Boolean) a.this.f56653g.u().getValue()).booleanValue();
            g gVar = (g) a.this.f56653g.s().getValue();
            return gVar != null ? new h0.a(gVar) : zBooleanValue ? new h0.b(Unit.f93236a) : new h0.a(g.f56047b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(Context context, CoroutineScope coroutineScope, c0 c0Var, r rVar, boolean z10, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineScope coroutineScopeA = (i10 & 2) != 0 ? kotlinx.coroutines.i.a(c.a().getMain()) : coroutineScope;
        this(context, coroutineScopeA, c0Var, rVar, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? new b(coroutineScopeA, c0Var, rVar) : bVar);
    }

    public final Object b(String str, long j10, Continuation continuation) {
        return eg.g.g(c.a().getMain(), new C0710a(str, j10, null), continuation);
    }

    public final StateFlow c() {
        return this.f56656j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0, android.webkit.WebView
    public void destroy() {
        super.destroy();
        kotlinx.coroutines.i.f(this.f56649c, null, 1, null);
    }

    @NotNull
    public final SharedFlow getClickthroughEvent() {
        return this.f56655i;
    }

    @NotNull
    public final StateFlow getUnrecoverableError() {
        return this.f56654h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void m(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f56653g.m(button);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f56652f) {
            return false;
        }
        if (event.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.f56653g.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(ArraysKt.first(iArr), ArraysKt.last(iArr), getHeight(), getWidth(), (int) (event.getX() + ArraysKt.first(iArr)), (int) (event.getY() + ArraysKt.last(iArr))));
        }
        return super.onTouchEvent(event);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void p(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f56653g.p(buttonType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, CoroutineScope scope, c0 clickthroughService, r buttonTracker, boolean z10, b webViewClientImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.f56649c = scope;
        this.f56650d = clickthroughService;
        this.f56651e = buttonTracker;
        this.f56652f = z10;
        this.f56653g = webViewClientImpl;
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        setBackgroundColor(0);
        setVisibility(8);
        this.f56654h = webViewClientImpl.s();
        this.f56655i = webViewClientImpl.o();
        this.f56656j = webViewClientImpl.v();
    }
}
