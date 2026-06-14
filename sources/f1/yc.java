package f1;

import f1.gc;
import g1.a;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gc f71648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f71649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f71650c;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71651r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f71652s;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ia iaVar, Continuation continuation) {
            return ((a) create(iaVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f71652s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objN;
            Object objG = pf.b.g();
            int i10 = this.f71651r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ia iaVar = (ia) this.f71652s;
                this.f71651r = 1;
                objN = com.chartboost.sdk.internal.clickthrough.b.n(iaVar, null, null, null, null, this, 30, null);
                if (objN == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objN = ((Result) obj).l();
            }
            return Result.a(objN);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71653r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f71654s;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ia iaVar, Continuation continuation) {
            return ((b) create(iaVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f71654s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            Object objG = pf.b.g();
            int i10 = this.f71653r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ia iaVar = (ia) this.f71654s;
                this.f71653r = 1;
                objD = com.chartboost.sdk.internal.clickthrough.b.d(iaVar, null, null, null, null, null, this, 62, null);
                if (objD == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objD = ((Result) obj).l();
            }
            return Result.a(objD);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71655r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f71656s;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ia iaVar, Continuation continuation) {
            return ((c) create(iaVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f71656s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF;
            Object objG = pf.b.g();
            int i10 = this.f71655r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ia iaVar = (ia) this.f71656s;
                this.f71655r = 1;
                objF = com.chartboost.sdk.internal.clickthrough.b.f(iaVar, null, null, null, null, this, 30, null);
                if (objF == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objF = ((Result) obj).l();
            }
            return Result.a(objF);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71657r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f71658s;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ia iaVar, Continuation continuation) {
            return ((d) create(iaVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f71658s = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objG = pf.b.g();
            int i10 = this.f71657r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ia iaVar = (ia) this.f71658s;
                this.f71657r = 1;
                objK = com.chartboost.sdk.internal.clickthrough.b.k(iaVar, null, null, null, null, this, 30, null);
                if (objK == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objK = ((Result) obj).l();
            }
            return Result.a(objK);
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f71659r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f71660s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f71661t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f71663v;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f71661t = obj;
            this.f71663v |= Integer.MIN_VALUE;
            Object objH = yc.this.h(null, null, null, this);
            return objH == pf.b.g() ? objH : Result.a(objH);
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f71664r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f71665s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f71666t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f71667u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f71668v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f71670x;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f71668v = obj;
            this.f71670x |= Integer.MIN_VALUE;
            return yc.this.c(null, null, this);
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71671r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f71673t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h3 f71674u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ q0 f71675v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f71676w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, h3 h3Var, q0 q0Var, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f71673t = str;
            this.f71674u = h3Var;
            this.f71675v = q0Var;
            this.f71676w = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return yc.this.new g(this.f71673t, this.f71674u, this.f71675v, this.f71676w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f71671r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                yc ycVar = yc.this;
                Object objG2 = ycVar.g(gc.b(ycVar.f71648a, this.f71673t, 0, 2, null), this.f71673t, this.f71674u);
                String strD = this.f71673t;
                Throwable thG = Result.g(objG2);
                if (thG == null) {
                    strD = (String) objG2;
                } else if (thG instanceof gc.b.e) {
                    strD = ((gc.b.e) thG).d();
                }
                ia iaVar = new ia(strD, this.f71675v, this.f71676w);
                yc ycVar2 = yc.this;
                h3 h3Var = this.f71674u;
                this.f71671r = 1;
                if (ycVar2.c(iaVar, h3Var, this) == objG) {
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

    public yc(gc urlRedirect, List actions, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(urlRedirect, "urlRedirect");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f71648a = urlRedirect;
        this.f71649b = actions;
        this.f71650c = ioDispatcher;
    }

    public final a.EnumC0885a b(String str, q0 clkp, h3 clickTracking, boolean z10) {
        Intrinsics.checkNotNullParameter(clkp, "clkp");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        eg.e("Resolving url: " + str + ", clickPreference: " + clkp + ", userGesture: " + z10, null, 2, null);
        if (str != null && str.length() != 0) {
            eg.i.d(kotlinx.coroutines.i.a(this.f71650c), null, null, new g(str, clickTracking, clkp, z10, null), 3, null);
            return null;
        }
        a.EnumC0885a enumC0885a = a.EnumC0885a.f72108b;
        eg.p("Url is null or empty.", null, 2, null);
        return enumC0885a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:24:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(f1.ia r9, f1.h3 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.yc.c(f1.ia, f1.h3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object g(Object obj, String str, h3 h3Var) {
        Throwable thG = Result.g(obj);
        if (thG != null) {
            h3Var.b("Redirection failed for " + str + ": " + thG);
            eg.p("Redirection failed for " + str + ": " + thG, null, 2, null);
            return obj;
        }
        String str2 = (String) obj;
        h3Var.a("Redirection successful from " + str + " to " + str2);
        eg.e("Redirection successful from " + str + " to " + str2, null, 2, null);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.jvm.functions.Function2 r7, f1.ia r8, f1.h3 r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.yc.h(kotlin.jvm.functions.Function2, f1.ia, f1.h3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ yc(gc gcVar, List list, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gcVar, (i10 & 2) != 0 ? CollectionsKt.listOf((Object[]) new Function2[]{new a(null), new b(null), new c(null), new d(null)}) : list, (i10 & 4) != 0 ? eg.o0.b() : coroutineDispatcher);
    }
}
