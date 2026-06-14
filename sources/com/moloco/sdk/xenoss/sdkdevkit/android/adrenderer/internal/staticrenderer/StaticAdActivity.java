package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import hg.l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003¨\u0006\f"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "a", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class StaticAdActivity extends ComponentActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Function9 f56634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f56635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static StaticAdActivity f56636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Function0 f56637g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static g0 f56639i;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final MutableStateFlow f56638h = l0.a(Boolean.FALSE);

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a, reason: collision with other inner class name */
        public static final class C0708a extends d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public Object f56640r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f56641s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f56643u;

            public C0708a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f56641s = obj;
                this.f56643u |= Integer.MIN_VALUE;
                return Companion.this.a(null, null, null, null, null, this);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$b */
        public static final class b extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56644r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ boolean f56645s;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            public final Object c(boolean z10, Continuation continuation) {
                return ((b) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(continuation);
                bVar.f56645s = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f56644r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f56645s);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(android.content.Context r7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a r8, kotlin.jvm.functions.Function0 r9, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o r10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 r11, kotlin.coroutines.Continuation r12) {
            /*
                r6 = this;
                boolean r0 = r12 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.Companion.C0708a
                if (r0 == 0) goto L13
                r0 = r12
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.Companion.C0708a) r0
                int r1 = r0.f56643u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f56643u = r1
                goto L18
            L13:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f56641s
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f56643u
                r3 = 0
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L39
                if (r2 != r4) goto L31
                java.lang.Object r7 = r0.f56640r
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a r7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.Companion) r7
                kotlin.d.b(r12)     // Catch: java.lang.Throwable -> L2f
                goto L76
            L2f:
                r7 = move-exception
                goto L9b
            L31:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L39:
                kotlin.d.b(r12)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.x(r11)     // Catch: java.lang.Throwable -> L2f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.w(r8)     // Catch: java.lang.Throwable -> L2f
                kotlin.jvm.functions.Function9 r8 = r10.a()     // Catch: java.lang.Throwable -> L2f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.z(r8)     // Catch: java.lang.Throwable -> L2f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.y(r9)     // Catch: java.lang.Throwable -> L2f
                android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Throwable -> L2f
                java.lang.Class<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity> r9 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.class
                r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L2f
                int r9 = r10.d()     // Catch: java.lang.Throwable -> L2f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0.b(r8, r9)     // Catch: java.lang.Throwable -> L2f
                r9 = 268435456(0x10000000, float:2.524355E-29)
                r8.setFlags(r9)     // Catch: java.lang.Throwable -> L2f
                r7.startActivity(r8)     // Catch: java.lang.Throwable -> L2f
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.A()     // Catch: java.lang.Throwable -> L2f
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$b r8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$b     // Catch: java.lang.Throwable -> L2f
                r8.<init>(r5)     // Catch: java.lang.Throwable -> L2f
                r0.f56640r = r6     // Catch: java.lang.Throwable -> L2f
                r0.f56643u = r4     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r12 = hg.i.y(r7, r8, r0)     // Catch: java.lang.Throwable -> L2f
                if (r12 != r1) goto L76
                return r1
            L76:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L2f
                r12.getClass()     // Catch: java.lang.Throwable -> L2f
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.A()
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r3)
                r7.setValue(r8)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.y(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.w(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.z(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.v()
                if (r7 == 0) goto L98
                r7.finish()
            L98:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            L9b:
                kotlinx.coroutines.flow.MutableStateFlow r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.A()
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r3)
                r8.setValue(r9)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.y(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.w(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.z(r5)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.v()
                if (r8 == 0) goto Lb8
                r8.finish()
            Lb8:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.Companion.a(android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a, kotlin.jvm.functions.Function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final void b() {
            StaticAdActivity.f56638h.setValue(Boolean.TRUE);
        }

        public final void e(a.AbstractC0780a.c cVar) {
            a aVar = StaticAdActivity.f56635e;
            if (aVar != null) {
                aVar.m(cVar);
            }
        }

        public Companion() {
        }
    }

    public static final class b implements Function2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f56647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function9 f56648d;

        public /* synthetic */ class a extends y implements Function1 {
            public a(Object obj) {
                super(1, obj, Companion.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(a.AbstractC0780a.c p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                ((Companion) this.receiver).e(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.AbstractC0780a.c) obj);
                return Unit.f93236a;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0709b extends y implements Function0 {
            public C0709b(Object obj) {
                super(0, obj, Companion.class, "dismiss", "dismiss()V", 0);
            }

            public final void a() {
                ((Companion) this.receiver).b();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f93236a;
            }
        }

        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, Function9 function9) {
            this.f56647c = aVar;
            this.f56648d = function9;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1193619358, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.onCreate.<anonymous> (StaticAdActivity.kt:38)");
            }
            StaticAdActivity staticAdActivity = StaticAdActivity.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = this.f56647c;
            Intent intent = staticAdActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            int iX = x0.x(intent);
            Companion companion = StaticAdActivity.INSTANCE;
            composer.startReplaceableGroup(-1212657475);
            boolean zChanged = composer.changed(companion);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(companion);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composer.startReplaceableGroup(-1212655916);
            boolean zChanged2 = composer.changed(companion);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C0709b(companion);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            p.k(staticAdActivity, aVar, iX, function1, (Function0) ((KFunction) objRememberedValue2), this.f56648d, StaticAdActivity.f56639i, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Composer) obj, ((Number) obj2).intValue());
            return Unit.f93236a;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        f56636f = this;
        Function9 function9 = f56634d;
        a aVar = f56635e;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: WebView is missing", null, false, 12, null);
            INSTANCE.b();
        } else if (function9 != null) {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1193619358, true, new b(aVar, function9)), 1, null);
        } else {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: StaticRenderer is missing", null, false, 12, null);
            INSTANCE.b();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Function0 function0 = f56637g;
        if (function0 != null) {
            function0.invoke();
        }
        f56636f = null;
    }
}
