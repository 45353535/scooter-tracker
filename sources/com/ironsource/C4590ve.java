package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Ee;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4590ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final U9 f45670a = new U9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4484p9 f45671b = new C4484p9(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4634y7 f45672c = Ib.f41088s.d().i();

    /* JADX INFO: renamed from: com.ironsource.ve$a */
    public static final class a extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f45673b;

        a(Runnable runnable) {
            this.f45673b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            this.f45673b.run();
        }
    }

    public final void a(@NotNull AbstractRunnableC4232ae safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    @NotNull
    public final InterfaceC4634y7 b() {
        return this.f45672c;
    }

    @NotNull
    public final U9 c() {
        return this.f45670a;
    }

    public final void d(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    public final void e(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    public final void f() {
        com.ironsource.mediationsdk.r.m().S();
    }

    public final void g() {
        Ib.f41088s.d().q().a(new C4649z5(A5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    public static /* synthetic */ void a(C4590ve c4590ve, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4590ve.a(runnable, j10);
    }

    public final void b(@NotNull AbstractRunnableC4232ae safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f45671b.a(safeRunnable);
    }

    public final void c(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f45671b.b(runnable);
    }

    @Nullable
    public final C4246ba d() {
        return com.ironsource.mediationsdk.r.m().s();
    }

    public final void a(@NotNull Runnable runnable, long j10) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j10);
    }

    public final void b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IronSourceUtils.g(context);
    }

    public final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f45671b.a(callback);
    }

    @NotNull
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strM = this.f45672c.M(context);
        Intrinsics.checkNotNullExpressionValue(strM, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strM;
    }

    public final boolean e() {
        return IronSourceUtils.g();
    }

    public final void a(@NotNull AbstractRunnableC4232ae safeRunnable, long j10) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f45671b.a(safeRunnable, j10);
    }

    public static /* synthetic */ void a(C4590ve c4590ve, AbstractRunnableC4232ae abstractRunnableC4232ae, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4590ve.a(abstractRunnableC4232ae, j10);
    }

    public final void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        K6.a().a(key, value);
    }

    public final void a(long j10, @NotNull Ee.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.r.m().a(j10, responseOrigin);
    }

    @NotNull
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strB = com.ironsource.mediationsdk.r.m().b(context);
        Intrinsics.checkNotNullExpressionValue(strB, "getInstance().getAdvertiserId(context)");
        return strB;
    }

    @Nullable
    public final Ee a(@NotNull Context context, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.r.m().a(context, appKey);
    }

    public final void a(@NotNull C1 reporterSettings) {
        Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        C4462o4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.d(), reporterSettings.a(), reporterSettings.g());
    }

    public final void a(@NotNull EnumC4556te initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        C4573ue.f45559a.a(initStatus);
    }

    public final void a() {
        C4589vd.c().a();
    }

    public final void a(@NotNull C4318fe error, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put("errorCode", error.c());
            jSONObjectB.put("reason", error.d());
            String str3 = "";
            if (!TextUtils.isEmpty(str)) {
                str3 = "request=" + str + ";";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + "body=" + str2;
            }
            if (str3.length() > 0) {
                jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, str3);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        Ib.f41088s.d().q().a(new C4649z5(A5.TROUBLESHOOTING_SERVER_INIT_FAILED, jSONObjectB));
    }
}
