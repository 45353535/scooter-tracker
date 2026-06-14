package com.chartboost.sdk.internal.clickthrough;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import eg.o0;
import f1.ia;
import f1.o2;
import f1.o6;
import f1.q0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f17942r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f17943s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17944t;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17943s = obj;
            this.f17944t |= Integer.MIN_VALUE;
            Object objC = b.c(null, null, null, null, null, null, this);
            return objC == pf.b.g() ? objC : Result.a(objC);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0306b extends y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0306b f17945b = new C0306b();

        public C0306b() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f17946f = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f17947r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f17948s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17949t;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17948s = obj;
            this.f17949t |= Integer.MIN_VALUE;
            Object objE = b.e(null, null, null, null, null, this);
            return objE == pf.b.g() ? objE : Result.a(objE);
        }
    }

    public /* synthetic */ class e extends y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f17950b = new e();

        public e() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f17951f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(1);
            this.f17951f = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return EmbeddedBrowserActivity.INSTANCE.a(this.f17951f, url);
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f17952r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f17953s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17954t;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17953s = obj;
            this.f17954t |= Integer.MIN_VALUE;
            Object objJ = b.j(null, null, null, null, null, this);
            return objJ == pf.b.g() ? objJ : Result.a(objJ);
        }
    }

    public /* synthetic */ class h extends y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f17955b = new h();

        public h() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class i extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final i f17956f = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f17957r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f17958s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17959t;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17958s = obj;
            this.f17959t |= Integer.MIN_VALUE;
            Object objM = b.m(null, null, null, null, null, this);
            return objM == pf.b.g() ? objM : Result.a(objM);
        }
    }

    public /* synthetic */ class k extends y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f17960b = new k();

        public k() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class l extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final l f17961f = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class m extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f17962r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f17963s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Intent f17964t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context, Intent intent, Continuation continuation) {
            super(2, continuation);
            this.f17963s = context;
            this.f17964t = intent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.f17963s, this.f17964t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f17962r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f17963s.startActivity(b.i(this.f17964t));
            return Unit.f93236a;
        }
    }

    public static final Object b(Context context, Intent intent, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        Object objG = eg.g.g(coroutineDispatcher, new m(context, intent, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(f1.ia r7, android.content.Context r8, f1.o6 r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11, kotlinx.coroutines.CoroutineDispatcher r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.internal.clickthrough.b.c(f1.ia, android.content.Context, f1.o6, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlinx.coroutines.CoroutineDispatcher, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object d(ia iaVar, Context context, o6 o6Var, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            context = o2.a();
        }
        if ((i10 & 4) != 0) {
            o6Var = o2.b();
        }
        if ((i10 & 8) != 0) {
            function1 = C0306b.f17945b;
        }
        if ((i10 & 16) != 0) {
            function12 = c.f17946f;
        }
        if ((i10 & 32) != 0) {
            coroutineDispatcher = o0.c();
        }
        CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
        return c(iaVar, context, o6Var, function1, function12, coroutineDispatcher2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(f1.ia r7, android.content.Context r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, kotlinx.coroutines.CoroutineDispatcher r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.internal.clickthrough.b.e(f1.ia, android.content.Context, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlinx.coroutines.CoroutineDispatcher, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object f(ia iaVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            context = o2.a();
        }
        if ((i10 & 4) != 0) {
            function1 = e.f17950b;
        }
        if ((i10 & 8) != 0) {
            function12 = new f(context);
        }
        if ((i10 & 16) != 0) {
            coroutineDispatcher = o0.c();
        }
        Function1 function13 = function12;
        return e(iaVar, context, function1, function13, coroutineDispatcher, continuation);
    }

    public static final boolean g(ia iaVar) {
        return iaVar.a() == q0.f70797d;
    }

    public static final boolean h(ia iaVar, Function1 function1) {
        if (iaVar != null) {
            return Intrinsics.areEqual(((Uri) function1.invoke(iaVar.d())).getScheme(), "http");
        }
        return false;
    }

    public static final Intent i(Intent intent) {
        intent.setFlags(268435456);
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(f1.ia r7, android.content.Context r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, kotlinx.coroutines.CoroutineDispatcher r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.internal.clickthrough.b.j(f1.ia, android.content.Context, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlinx.coroutines.CoroutineDispatcher, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object k(ia iaVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            context = o2.a();
        }
        if ((i10 & 4) != 0) {
            function1 = h.f17955b;
        }
        if ((i10 & 8) != 0) {
            function12 = i.f17956f;
        }
        if ((i10 & 16) != 0) {
            coroutineDispatcher = o0.c();
        }
        Function1 function13 = function12;
        return j(iaVar, context, function1, function13, coroutineDispatcher, continuation);
    }

    public static final boolean l(ia iaVar) {
        return iaVar.a() == q0.f70798e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(f1.ia r7, android.content.Context r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, kotlinx.coroutines.CoroutineDispatcher r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.internal.clickthrough.b.m(f1.ia, android.content.Context, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlinx.coroutines.CoroutineDispatcher, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object n(ia iaVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            context = o2.a();
        }
        if ((i10 & 4) != 0) {
            function1 = k.f17960b;
        }
        if ((i10 & 8) != 0) {
            function12 = l.f17961f;
        }
        if ((i10 & 16) != 0) {
            coroutineDispatcher = o0.c();
        }
        Function1 function13 = function12;
        return m(iaVar, context, function1, function13, coroutineDispatcher, continuation);
    }
}
