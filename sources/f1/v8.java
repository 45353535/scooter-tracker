package f1;

import android.os.Build;
import e1.a;
import e1.i;
import f1.bf;
import f1.z2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class v8 extends c1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t6 f71371m;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71372f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.d f71373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.c f71374g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d1.d dVar, c1.c cVar) {
            super(0);
            this.f71373f = dVar;
            this.f71374g = cVar;
        }

        public final void a() {
            this.f71373f.g(new e1.b(null, this.f71374g), new e1.a(a.EnumC0857a.f68679g, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.d f71375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.c f71376g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d1.d dVar, c1.c cVar) {
            super(0);
            this.f71375f = dVar;
            this.f71376g = cVar;
        }

        public final void a() {
            this.f71375f.e(new e1.j(null, this.f71376g), new e1.i(i.a.f68754d, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.d f71377f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.c f71378g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d1.d dVar, c1.c cVar) {
            super(0);
            this.f71377f = dVar;
            this.f71378g = cVar;
        }

        public final void a() {
            this.f71377f.e(new e1.j(null, this.f71378g), new e1.i(i.a.f68758h, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(m0 adUnitLoader, r5 adUnitRenderer, t6 uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, s1 adApiCallbackSender, wc session, y base64Wrapper, ag eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutorService, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f71371m = uiPoster;
    }

    public final void x(c1.c ad2, d1.d callback) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        y(ad2, callback, null);
    }

    public final void y(c1.c ad2, d1.d callback, String str) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!w(ad2.getLocation())) {
            r(ad2.getLocation(), ad2, callback, str);
        } else {
            this.f71371m.b(new b(callback, ad2));
            k(z2.a.f71695f, "Invalid configuration. Check logs for more details.", bf.b.f69484g, ad2.getLocation());
        }
    }

    public final void z(c1.c ad2, d1.d callback) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (w(ad2.getLocation())) {
            this.f71371m.b(new c(callback, ad2));
            k(z2.i.f71749e, "Invalid configuration. Check logs for more details.", bf.b.f69484g, ad2.getLocation());
        } else if (s()) {
            h(ad2, callback);
        } else {
            this.f71371m.b(new d(callback, ad2));
        }
    }

    public /* synthetic */ v8(m0 m0Var, r5 r5Var, t6 t6Var, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, s1 s1Var, wc wcVar, y yVar, ag agVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0Var, r5Var, t6Var, atomicReference, scheduledExecutorService, s1Var, wcVar, yVar, agVar, (i10 & 512) != 0 ? a.f71372f : function0);
    }
}
