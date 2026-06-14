package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m;
import eg.k0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityResultLauncher f57084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f57085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Flow f57086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f57087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function3 f57088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function2 f57089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f57090h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f57091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1 f57092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Job f57093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Job f57094d;

        public a(boolean z10, Function1 onOutcome, Job timeoutJob, Job fgJob) {
            Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
            Intrinsics.checkNotNullParameter(timeoutJob, "timeoutJob");
            Intrinsics.checkNotNullParameter(fgJob, "fgJob");
            this.f57091a = z10;
            this.f57092b = onOutcome;
            this.f57093c = timeoutJob;
            this.f57094d = fgJob;
        }

        public final void a(boolean z10) {
            this.f57091a = z10;
        }

        public final boolean b() {
            return this.f57091a;
        }

        public final Job c() {
            return this.f57094d;
        }

        public final Function1 d() {
            return this.f57092b;
        }

        public final Job e() {
            return this.f57093c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f57091a == aVar.f57091a && Intrinsics.areEqual(this.f57092b, aVar.f57092b) && Intrinsics.areEqual(this.f57093c, aVar.f57093c) && Intrinsics.areEqual(this.f57094d, aVar.f57094d);
        }

        public int hashCode() {
            return (((((androidx.compose.foundation.c.a(this.f57091a) * 31) + this.f57092b.hashCode()) * 31) + this.f57093c.hashCode()) * 31) + this.f57094d.hashCode();
        }

        public String toString() {
            return "LaunchState(backgroundedSinceLaunch=" + this.f57091a + ", onOutcome=" + this.f57092b + ", timeoutJob=" + this.f57093c + ", fgJob=" + this.f57094d + ')';
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57095r;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f57097b;

            public a(r rVar) {
                this.f57097b = rVar;
            }

            public final Object a(boolean z10, Continuation continuation) {
                a aVar;
                if (!z10 && (aVar = this.f57097b.f57090h) != null) {
                    aVar.a(true);
                }
                return Unit.f93236a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57095r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow flow = r.this.f57086d;
                a aVar = new a(r.this);
                this.f57095r = 1;
                if (flow.collect(aVar, this) == objG) {
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

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57098r;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57098r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                long j10 = r.this.f57087e;
                this.f57098r = 1;
                if (k0.b(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            r.this.cancel();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ r(Context context, ActivityResultLauncher activityResultLauncher, CoroutineScope coroutineScope, Flow flow, long j10, Function3 function3, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, activityResultLauncher, coroutineScope, flow, j10, function3, function2);
    }

    public static final Intent b(String bundleId, String str, String caller) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        String str2 = "https://play.google.com/d?id=" + bundleId;
        if (str != null) {
            str2 = str2 + "&referrer=" + str;
        }
        Uri uri = Uri.parse(str2);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        intent.setData(uri);
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", caller);
        return intent;
    }

    public static final boolean d(PackageManager pm, Intent i10) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(i10, "i");
        return i10.resolveActivity(pm) != null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public boolean a(String bundleId, String str, Function1 onOutcome) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
        cancel();
        Function3 function3 = this.f57088f;
        String packageName = this.f57083a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        Intent intent = (Intent) function3.invoke(bundleId, str, packageName);
        Function2 function2 = this.f57089g;
        PackageManager packageManager = this.f57083a.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        if (!((Boolean) function2.invoke(packageManager, intent)).booleanValue()) {
            return false;
        }
        this.f57090h = new a(false, onOutcome, eg.i.d(this.f57085c, null, null, new c(null), 3, null), eg.i.d(this.f57085c, null, null, new b(null), 3, null));
        this.f57084b.launch(intent);
        return true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public void cancel() {
        Job jobC;
        Job jobE;
        a aVar = this.f57090h;
        if (aVar != null && (jobE = aVar.e()) != null) {
            Job.a.a(jobE, null, 1, null);
        }
        a aVar2 = this.f57090h;
        if (aVar2 != null && (jobC = aVar2.c()) != null) {
            Job.a.a(jobC, null, 1, null);
        }
        this.f57090h = null;
    }

    public r(Context context, ActivityResultLauncher installLauncher, CoroutineScope scope, Flow foregroundFlow, long j10, Function3 intentFactory, Function2 canResolve) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(installLauncher, "installLauncher");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(foregroundFlow, "foregroundFlow");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        Intrinsics.checkNotNullParameter(canResolve, "canResolve");
        this.f57083a = context;
        this.f57084b = installLauncher;
        this.f57085c = scope;
        this.f57086d = foregroundFlow;
        this.f57087e = j10;
        this.f57088f = intentFactory;
        this.f57089g = canResolve;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public void a(int i10) {
        a aVar = this.f57090h;
        if (aVar == null) {
            return;
        }
        Job.a.a(aVar.e(), null, 1, null);
        Job.a.a(aVar.c(), null, 1, null);
        aVar.d().invoke(aVar.b() ? m.a.f57080a : m.c.f57082a);
        this.f57090h = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r(Context context, ActivityResultLauncher activityResultLauncher, CoroutineScope coroutineScope, Flow flow, long j10, Function3 function3, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jS;
        if ((i10 & 16) != 0) {
            b.a aVar = kotlin.time.b.f93560c;
            jS = kotlin.time.c.s(60, cg.b.f6839f);
        } else {
            jS = j10;
        }
        this(context, activityResultLauncher, coroutineScope, flow, jS, (i10 & 32) != 0 ? new Function3() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.p
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return r.b((String) obj, (String) obj2, (String) obj3);
            }
        } : function3, (i10 & 64) != 0 ? new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(r.d((PackageManager) obj, (Intent) obj2));
            }
        } : function2, null);
    }
}
