package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.ViewParent;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.b;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.n;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.service_locator.b;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f55057f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55058g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StateFlow f55059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f55060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f55061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f55062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext f55063e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55064a;

        static {
            int[] iArr = new int[Initialization.values().length];
            try {
                iArr[Initialization.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Initialization.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55064a = iArr;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55065r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55066s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55067t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f55068u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f55070w;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55068u = obj;
            this.f55070w |= Integer.MIN_VALUE;
            return o.this.e(null, null, null, this);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55071r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Function1 f55072s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f55072s = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f55072s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55071r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            Function1 function1 = this.f55072s;
            this.f55071r = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objG ? objG : objInvoke;
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ String A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55073r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55074s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55075t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f55076u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55077v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55079x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f55080y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f55081z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f55079x = aVar;
            this.f55080y = str;
            this.f55081z = str2;
            this.A = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new e(this.f55079x, this.f55080y, this.f55081z, this.A, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j0 j0Var;
            String strF;
            Object objE;
            com.moloco.sdk.acm.f fVar;
            long j10;
            Object objG = pf.b.g();
            int i10 = this.f55077v;
            if (i10 == 0) {
                kotlin.d.b(obj);
                j0Var = j0.f54776b;
                long jInvoke = o.this.f55060b.invoke();
                strF = o.this.f();
                com.moloco.sdk.acm.f fVarF = this.f55079x.c(com.moloco.sdk.internal.client_metrics_data.d.f54189i.g()).f(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + j0Var + " ad with adUnitId: " + this.f55080y, null, false, 12, null);
                o oVar = o.this;
                Function1 function1 = oVar.f55062d;
                com.moloco.sdk.acm.recorder.a aVar = this.f55079x;
                this.f55073r = j0Var;
                this.f55074s = strF;
                this.f55075t = fVarF;
                this.f55076u = jInvoke;
                this.f55077v = 1;
                objE = oVar.e(function1, j0Var, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                fVar = fVarF;
                j10 = jInvoke;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f55076u;
                com.moloco.sdk.acm.f fVar2 = (com.moloco.sdk.acm.f) this.f55075t;
                strF = (String) this.f55074s;
                j0Var = (j0) this.f55073r;
                kotlin.d.b(obj);
                fVar = fVar2;
                objE = obj;
            }
            String str = strF;
            j0 j0Var2 = j0Var;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objE;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f55791a.a();
                com.moloco.sdk.internal.services.q qVarE = b.C0685b.f55795a.e();
                String str2 = this.f55080y;
                b.h hVar = b.h.f55827a;
                ViewParent viewParentA = eVar.a(contextA, qVarE, str2, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f55081z), new n(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.a.a(this.A), null), hVar.i(), n.b.f54457c, this.f55079x);
                if (viewParentA != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f55079x;
                    com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54158l.g());
                    com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                    aVar2.b(cVar.e(cVar2.g(), "success").e(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var2.name()).e("initial_sdk_init_state", str));
                    this.f55079x.a(fVar.f(cVar2.g(), "success"));
                    if (viewParentA instanceof i0) {
                        ((i0) viewParentA).setCreateAdObjectStartTime(j10);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + j0Var2 + " ad with adUnitId: " + this.f55080y, null, false, 12, null);
                    return new h0.b(viewParentA);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = o.this.b(this.f55080y, str, fVar, j0Var2, this.f55079x);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + j0Var2 + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new h0.a(adCreateErrorB);
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ String A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55082r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55083s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55084t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f55085u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55086v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55088x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f55089y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f55090z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f55088x = aVar;
            this.f55089y = str;
            this.f55090z = str2;
            this.A = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new f(this.f55088x, this.f55089y, this.f55090z, this.A, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j0 j0Var;
            String strF;
            Object objE;
            com.moloco.sdk.acm.f fVar;
            long j10;
            Object objG = pf.b.g();
            int i10 = this.f55086v;
            if (i10 == 0) {
                kotlin.d.b(obj);
                j0Var = j0.f54777c;
                long jInvoke = o.this.f55060b.invoke();
                strF = o.this.f();
                com.moloco.sdk.acm.f fVarF = this.f55088x.c(com.moloco.sdk.internal.client_metrics_data.d.f54189i.g()).f(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + j0Var + " ad with adUnitId: " + this.f55089y, null, false, 12, null);
                o oVar = o.this;
                Function1 function1 = oVar.f55062d;
                com.moloco.sdk.acm.recorder.a aVar = this.f55088x;
                this.f55082r = j0Var;
                this.f55083s = strF;
                this.f55084t = fVarF;
                this.f55085u = jInvoke;
                this.f55086v = 1;
                objE = oVar.e(function1, j0Var, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                fVar = fVarF;
                j10 = jInvoke;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f55085u;
                com.moloco.sdk.acm.f fVar2 = (com.moloco.sdk.acm.f) this.f55084t;
                strF = (String) this.f55083s;
                j0Var = (j0) this.f55082r;
                kotlin.d.b(obj);
                fVar = fVar2;
                objE = obj;
            }
            String str = strF;
            j0 j0Var2 = j0Var;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objE;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f55791a.a();
                com.moloco.sdk.internal.services.q qVarE = b.C0685b.f55795a.e();
                String str2 = this.f55089y;
                b.h hVar = b.h.f55827a;
                ViewParent viewParentD = eVar.d(contextA, qVarE, str2, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f55090z), new n(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.a.a(this.A), null), hVar.i(), n.c.f54458c, this.f55088x);
                if (viewParentD != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f55088x;
                    com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54158l.g());
                    com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                    aVar2.b(cVar.e(cVar2.g(), "success").e(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var2.name()).e("initial_sdk_init_state", str));
                    this.f55088x.a(fVar.f(cVar2.g(), "success"));
                    if (viewParentD instanceof i0) {
                        ((i0) viewParentD).setCreateAdObjectStartTime(j10);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + j0Var2 + " ad with adUnitId: " + this.f55089y, null, false, 12, null);
                    return new h0.b(viewParentD);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = o.this.b(this.f55089y, str, fVar, j0Var2, this.f55088x);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + j0Var2 + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new h0.a(adCreateErrorB);
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ String A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55091r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55092s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55093t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f55094u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55095v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55097x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f55098y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f55099z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f55097x = aVar;
            this.f55098y = str;
            this.f55099z = str2;
            this.A = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new g(this.f55097x, this.f55098y, this.f55099z, this.A, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j0 j0Var;
            String strF;
            Object objE;
            com.moloco.sdk.acm.f fVar;
            long j10;
            Object objG = pf.b.g();
            int i10 = this.f55095v;
            if (i10 == 0) {
                kotlin.d.b(obj);
                j0Var = j0.f54781g;
                long jInvoke = o.this.f55060b.invoke();
                strF = o.this.f();
                com.moloco.sdk.acm.f fVarF = this.f55097x.c(com.moloco.sdk.internal.client_metrics_data.d.f54189i.g()).f(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + j0Var + " ad with adUnitId: " + this.f55098y, null, false, 12, null);
                o oVar = o.this;
                Function1 function1 = oVar.f55062d;
                com.moloco.sdk.acm.recorder.a aVar = this.f55097x;
                this.f55091r = j0Var;
                this.f55092s = strF;
                this.f55093t = fVarF;
                this.f55094u = jInvoke;
                this.f55095v = 1;
                objE = oVar.e(function1, j0Var, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                fVar = fVarF;
                j10 = jInvoke;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f55094u;
                com.moloco.sdk.acm.f fVar2 = (com.moloco.sdk.acm.f) this.f55093t;
                strF = (String) this.f55092s;
                j0Var = (j0) this.f55091r;
                kotlin.d.b(obj);
                fVar = fVar2;
                objE = obj;
            }
            String str = strF;
            j0 j0Var2 = j0Var;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objE;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f55791a.a();
                com.moloco.sdk.internal.services.q qVarE = b.C0685b.f55795a.e();
                String str2 = this.f55098y;
                b.h hVar = b.h.f55827a;
                InterstitialAd interstitialAdE = eVar.e(contextA, qVarE, str2, hVar.j(), hVar.f(), b.i.f55834a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f55099z), new n(AdFormatType.INTERSTITIAL, com.moloco.sdk.internal.mediators.a.b(this.A), null), this.f55097x);
                if (interstitialAdE != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f55097x;
                    com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54158l.g());
                    com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                    aVar2.b(cVar.e(cVar2.g(), "success").e(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var2.name()).e("initial_sdk_init_state", str.toString()));
                    this.f55097x.a(fVar.f(cVar2.g(), "success"));
                    if (interstitialAdE instanceof i0) {
                        ((i0) interstitialAdE).setCreateAdObjectStartTime(j10);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + j0Var2 + " ad with adUnitId: " + this.f55098y, null, false, 12, null);
                    return new h0.b(interstitialAdE);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = o.this.b(this.f55098y, str, fVar, j0Var2, this.f55097x);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + j0Var2 + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new h0.a(adCreateErrorB);
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ String A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55100r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55101s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55102t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f55103u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55104v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55106x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f55107y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f55108z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f55106x = aVar;
            this.f55107y = str;
            this.f55108z = str2;
            this.A = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new h(this.f55106x, this.f55107y, this.f55108z, this.A, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j0 j0Var;
            String strF;
            Object objE;
            com.moloco.sdk.acm.f fVar;
            long j10;
            Object objG = pf.b.g();
            int i10 = this.f55104v;
            if (i10 == 0) {
                kotlin.d.b(obj);
                j0Var = j0.f54778d;
                long jA = o.this.f55060b.a();
                strF = o.this.f();
                com.moloco.sdk.acm.f fVarF = this.f55106x.c(com.moloco.sdk.internal.client_metrics_data.d.f54189i.g()).f(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + j0Var + " ad with adUnitId: " + this.f55107y, null, false, 12, null);
                o oVar = o.this;
                Function1 function1 = oVar.f55062d;
                com.moloco.sdk.acm.recorder.a aVar = this.f55106x;
                this.f55100r = j0Var;
                this.f55101s = strF;
                this.f55102t = fVarF;
                this.f55103u = jA;
                this.f55104v = 1;
                objE = oVar.e(function1, j0Var, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                fVar = fVarF;
                j10 = jA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f55103u;
                com.moloco.sdk.acm.f fVar2 = (com.moloco.sdk.acm.f) this.f55102t;
                strF = (String) this.f55101s;
                j0Var = (j0) this.f55100r;
                kotlin.d.b(obj);
                fVar = fVar2;
                objE = obj;
            }
            String str = strF;
            j0 j0Var2 = j0Var;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objE;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f55791a.a();
                com.moloco.sdk.internal.services.q qVarE = b.C0685b.f55795a.e();
                String str2 = this.f55107y;
                b.h hVar = b.h.f55827a;
                ViewParent viewParentB = eVar.b(contextA, qVarE, str2, hVar.j(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f55108z), new n(AdFormatType.MREC, com.moloco.sdk.internal.mediators.a.a(this.A), null), hVar.i(), n.a.f54456c, this.f55106x);
                if (viewParentB != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f55106x;
                    com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54158l.g());
                    com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                    aVar2.b(cVar.e(cVar2.g(), "success").e(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var2.name()).e("initial_sdk_init_state", str.toString()));
                    this.f55106x.a(fVar.f(cVar2.g(), "success"));
                    if (viewParentB instanceof i0) {
                        ((i0) viewParentB).setCreateAdObjectStartTime(j10);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + j0Var2 + " ad with adUnitId: " + this.f55107y, null, false, 12, null);
                    return new h0.b(viewParentB);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = o.this.b(this.f55107y, str, fVar, j0Var2, this.f55106x);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + j0Var2 + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new h0.a(adCreateErrorB);
        }
    }

    public static final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ String A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55109r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55110s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55111t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f55112u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55113v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55115x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f55116y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f55117z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f55115x = aVar;
            this.f55116y = str;
            this.f55117z = str2;
            this.A = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new i(this.f55115x, this.f55116y, this.f55117z, this.A, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j0 j0Var;
            String strF;
            Object objE;
            com.moloco.sdk.acm.f fVar;
            long j10;
            Object objG = pf.b.g();
            int i10 = this.f55113v;
            if (i10 == 0) {
                kotlin.d.b(obj);
                j0Var = j0.f54779e;
                long jA = o.this.f55060b.a();
                strF = o.this.f();
                com.moloco.sdk.acm.f fVarF = this.f55115x.c(com.moloco.sdk.internal.client_metrics_data.d.f54189i.g()).f(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + j0Var + " ad with adUnitId: " + this.f55116y, null, false, 12, null);
                o oVar = o.this;
                Function1 function1 = oVar.f55062d;
                com.moloco.sdk.acm.recorder.a aVar = this.f55115x;
                this.f55109r = j0Var;
                this.f55110s = strF;
                this.f55111t = fVarF;
                this.f55112u = jA;
                this.f55113v = 1;
                objE = oVar.e(function1, j0Var, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                fVar = fVarF;
                j10 = jA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f55112u;
                com.moloco.sdk.acm.f fVar2 = (com.moloco.sdk.acm.f) this.f55111t;
                strF = (String) this.f55110s;
                j0Var = (j0) this.f55109r;
                kotlin.d.b(obj);
                fVar = fVar2;
                objE = obj;
            }
            String str = strF;
            j0 j0Var2 = j0Var;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objE;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f55791a.a();
                com.moloco.sdk.internal.services.q qVarE = b.C0685b.f55795a.e();
                com.moloco.sdk.internal.services.y yVarI = b.e.f55808a.i();
                String str2 = this.f55116y;
                b.h hVar = b.h.f55827a;
                NativeAd nativeAdC = eVar.c(contextA, qVarE, yVarI, str2, hVar.j(), hVar.f(), b.i.f55834a.c(), hVar.i(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f55117z), new n(AdFormatType.NATIVE, com.moloco.sdk.internal.mediators.a.c(this.A), null), hVar.h(), this.f55115x);
                if (nativeAdC != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f55115x;
                    com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54158l.g());
                    com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                    aVar2.b(cVar.e(cVar2.g(), "success").e(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var2.name()).e("initial_sdk_init_state", str.toString()));
                    this.f55115x.a(fVar.f(cVar2.g(), "success"));
                    if (nativeAdC instanceof i0) {
                        ((i0) nativeAdC).setCreateAdObjectStartTime(j10);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + j0Var2 + " ad with adUnitId: " + this.f55116y, null, false, 12, null);
                    return new h0.b(nativeAdC);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = o.this.b(this.f55116y, str, fVar, j0Var2, this.f55115x);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + j0Var2 + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new h0.a(adCreateErrorB);
        }
    }

    public static final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ String A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55118r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55119s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55120t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f55121u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55122v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55124x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f55125y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f55126z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.moloco.sdk.acm.recorder.a aVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f55124x = aVar;
            this.f55125y = str;
            this.f55126z = str2;
            this.A = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new j(this.f55124x, this.f55125y, this.f55126z, this.A, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            j0 j0Var;
            String strF;
            Object objE;
            com.moloco.sdk.acm.f fVar;
            long j10;
            Object objG = pf.b.g();
            int i10 = this.f55122v;
            if (i10 == 0) {
                kotlin.d.b(obj);
                j0Var = j0.f54782h;
                long jInvoke = o.this.f55060b.invoke();
                strF = o.this.f();
                com.moloco.sdk.acm.f fVarF = this.f55124x.c(com.moloco.sdk.internal.client_metrics_data.d.f54189i.g()).f(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var.name()).f("initial_sdk_init_state", strF);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + j0Var + " ad with adUnitId: " + this.f55125y, null, false, 12, null);
                o oVar = o.this;
                Function1 function1 = oVar.f55062d;
                com.moloco.sdk.acm.recorder.a aVar = this.f55124x;
                this.f55118r = j0Var;
                this.f55119s = strF;
                this.f55120t = fVarF;
                this.f55121u = jInvoke;
                this.f55122v = 1;
                objE = oVar.e(function1, j0Var, aVar, this);
                if (objE == objG) {
                    return objG;
                }
                fVar = fVarF;
                j10 = jInvoke;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f55121u;
                com.moloco.sdk.acm.f fVar2 = (com.moloco.sdk.acm.f) this.f55120t;
                strF = (String) this.f55119s;
                j0Var = (j0) this.f55118r;
                kotlin.d.b(obj);
                fVar = fVar2;
                objE = obj;
            }
            String str = strF;
            j0 j0Var2 = j0Var;
            com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objE;
            if (eVar != null) {
                Context contextA = com.moloco.sdk.service_locator.b.f55791a.a();
                com.moloco.sdk.internal.services.q qVarE = b.C0685b.f55795a.e();
                String str2 = this.f55125y;
                b.h hVar = b.h.f55827a;
                RewardedInterstitialAd rewardedInterstitialAdF = eVar.f(contextA, qVarE, str2, hVar.j(), hVar.f(), b.i.f55834a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b(this.f55126z), new n(AdFormatType.REWARDED, com.moloco.sdk.internal.mediators.a.b(this.A), null), this.f55124x);
                if (rewardedInterstitialAdF != null) {
                    com.moloco.sdk.acm.recorder.a aVar2 = this.f55124x;
                    com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54158l.g());
                    com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
                    aVar2.b(cVar.e(cVar2.g(), "success").e(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var2.name()).e("initial_sdk_init_state", str));
                    this.f55124x.a(fVar.f(cVar2.g(), "success"));
                    if (rewardedInterstitialAdF instanceof i0) {
                        ((i0) rewardedInterstitialAdF).setCreateAdObjectStartTime(j10);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + j0Var2 + " ad with adUnitId: " + this.f55125y, null, false, 12, null);
                    return new h0.b(rewardedInterstitialAdF);
                }
            }
            MolocoAdError.AdCreateError adCreateErrorB = o.this.b(this.f55125y, str, fVar, j0Var2, this.f55124x);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + j0Var2 + " with reason: " + adCreateErrorB, null, false, 12, null);
            return new h0.a(adCreateErrorB);
        }
    }

    public o(StateFlow initializationState, com.moloco.sdk.internal.services.i timeProviderService, p adCreatorConfiguration, Function1 awaitAdFactory) {
        Intrinsics.checkNotNullParameter(initializationState, "initializationState");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(adCreatorConfiguration, "adCreatorConfiguration");
        Intrinsics.checkNotNullParameter(awaitAdFactory, "awaitAdFactory");
        this.f55059a = initializationState;
        this.f55060b = timeProviderService;
        this.f55061c = adCreatorConfiguration;
        this.f55062d = awaitAdFactory;
        this.f55063e = com.moloco.sdk.internal.scheduling.c.a().getDefault();
    }

    public final MolocoAdError.AdCreateError b(String str, String str2, com.moloco.sdk.acm.f fVar, j0 j0Var, com.moloco.sdk.acm.recorder.a aVar) {
        com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54158l.g());
        com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54176e;
        com.moloco.sdk.acm.c cVarE = cVar.e(cVar2.g(), "failure").e("initial_sdk_init_state", str2).e(com.moloco.sdk.internal.client_metrics_data.c.f54175d.g(), j0Var.name());
        Initialization initialization = (Initialization) this.f55059a.getValue();
        int i10 = initialization == null ? -1 : b.f55064a[initialization.ordinal()];
        if (i10 == -1) {
            com.moloco.sdk.internal.error.b bVarF = b.C0685b.f55795a.f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE_");
            String upperCase = j0Var.name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
            sb2.append("_AD_FAILED_SDK_INIT_NOT_COMPLETED");
            b.a.a(bVarF, sb2.toString(), null, 2, null);
            com.moloco.sdk.acm.f fVarF = fVar.f(cVar2.g(), "failure");
            com.moloco.sdk.internal.client_metrics_data.c cVar3 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
            aVar.a(fVarF.f(cVar3.g(), "sdk_init_not_completed"));
            aVar.b(cVarE.e(cVar3.g(), "sdk_init_not_completed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i10 == 1) {
            b.a.a(b.C0685b.f55795a.f(), "UNABLE_TO_CREATE_AD", null, 2, null);
            com.moloco.sdk.acm.f fVarF2 = fVar.f(cVar2.g(), "failure");
            com.moloco.sdk.internal.client_metrics_data.c cVar4 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
            aVar.a(fVarF2.f(cVar4.g(), "unable_to_create_ad"));
            aVar.b(cVarE.e(cVar4.g(), "unable_to_create_ad"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Could not find the adUnitId that was requested for load: " + str, null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i10 != 2) {
            throw new lf.m();
        }
        com.moloco.sdk.internal.error.b bVarF2 = b.C0685b.f55795a.f();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("CREATE_");
        String upperCase2 = j0Var.name().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        sb3.append(upperCase2);
        sb3.append("_AD_FAILED_SDK_INIT_FAILED");
        b.a.a(bVarF2, sb3.toString(), null, 2, null);
        com.moloco.sdk.acm.f fVarF3 = fVar.f(cVar2.g(), "failure");
        com.moloco.sdk.internal.client_metrics_data.c cVar5 = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
        aVar.a(fVarF3.f(cVar5.g(), "sdk_init_failed"));
        aVar.b(cVarE.e(cVar5.g(), "sdk_init_failed"));
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
        return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
    }

    public final Object d(String str, String str2, com.moloco.sdk.acm.recorder.a aVar, String str3, Continuation continuation) {
        return eg.g.g(this.f55063e, new e(aVar, str2, str3, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.jvm.functions.Function1 r19, com.moloco.sdk.internal.publisher.j0 r20, com.moloco.sdk.acm.recorder.a r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o.e(kotlin.jvm.functions.Function1, com.moloco.sdk.internal.publisher.j0, com.moloco.sdk.acm.recorder.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String f() {
        String strName;
        Initialization initialization = (Initialization) this.f55059a.getValue();
        if (initialization == null || (strName = initialization.name()) == null) {
            return "not_invoked_or_in_progress";
        }
        String lowerCase = strName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase == null ? "not_invoked_or_in_progress" : lowerCase;
    }

    public final Object i(String str, String str2, com.moloco.sdk.acm.recorder.a aVar, String str3, Continuation continuation) {
        return eg.g.g(this.f55063e, new f(aVar, str2, str3, str, null), continuation);
    }

    public final Object j(String str, String str2, com.moloco.sdk.acm.recorder.a aVar, String str3, Continuation continuation) {
        return eg.g.g(this.f55063e, new g(aVar, str2, str3, str, null), continuation);
    }

    public final Object l(String str, String str2, com.moloco.sdk.acm.recorder.a aVar, String str3, Continuation continuation) {
        return eg.g.g(this.f55063e, new h(aVar, str2, str3, str, null), continuation);
    }

    public final Object m(String str, String str2, com.moloco.sdk.acm.recorder.a aVar, String str3, Continuation continuation) {
        return eg.g.g(this.f55063e, new i(aVar, str2, str3, str, null), continuation);
    }

    public final Object n(String str, String str2, com.moloco.sdk.acm.recorder.a aVar, String str3, Continuation continuation) {
        return eg.g.g(this.f55063e, new j(aVar, str2, str3, str, null), continuation);
    }
}
