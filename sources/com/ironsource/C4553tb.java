package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.C4450n9;
import com.ironsource.Ee;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4553tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4484p9 f45491a = new C4484p9(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: com.ironsource.tb$a */
    public static final class a extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f45492b;

        a(Runnable runnable) {
            this.f45492b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            this.f45492b.run();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.tb$b */
    public static final class b extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f45493b;

        b(Function0<Unit> function0) {
            this.f45493b = function0;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            this.f45493b.invoke();
        }
    }

    public final void a(@NotNull AbstractRunnableC4232ae safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void e(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4553tb this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.f45491a.b(runnable);
    }

    public final void b(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.vm
            @Override // java.lang.Runnable
            public final void run() {
                C4553tb.a(this.f45685b, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void c(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.wm
            @Override // java.lang.Runnable
            public final void run() {
                C4553tb.b(this.f45810b, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void d(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f45491a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4553tb this$0, Runnable runnable, long j10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C4553tb this$0, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.um
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                C4553tb.a(this.f45593b, runnable, j10);
            }
        });
    }

    public static /* synthetic */ void a(C4553tb c4553tb, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4553tb.a(runnable, j10);
    }

    public final void b(@NotNull AbstractRunnableC4232ae safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f45491a.a(safeRunnable);
    }

    public final void a(@NotNull Runnable runnable, long j10) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j10);
    }

    @NotNull
    public final C4318fe b(@NotNull C4318fe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new C4318fe(error.c(), "serverResponseIsNotValid") : error;
    }

    public final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f45491a.a(callback);
    }

    public final void a(@NotNull AbstractRunnableC4232ae safeRunnable, long j10) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f45491a.a(safeRunnable, j10);
    }

    public final void b(@NotNull String adUnitId, int i10, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C4456nf.a(A5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public static /* synthetic */ void a(C4553tb c4553tb, AbstractRunnableC4232ae abstractRunnableC4232ae, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4553tb.a(abstractRunnableC4232ae, j10);
    }

    public static /* synthetic */ void a(C4553tb c4553tb, Function0 function0, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4553tb.a((Function0<Unit>) function0, j10);
    }

    public final void a(@NotNull Function0<Unit> action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        a((AbstractRunnableC4232ae) new b(action), j10);
    }

    @NotNull
    public final Handler a() {
        return this.f45491a.a();
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4450n9.a aVar = C4450n9.f44458a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    @NotNull
    public final IronSource.a[] a(@NotNull LevelPlay.AdFormat... adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    @NotNull
    public final IronSource.a a(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(@NotNull AdapterBaseInterface networkAdapter, @NotNull IronSource.a adFormat, @NotNull String providerName) {
        Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return C4456nf.a(networkAdapter, adFormat, providerName);
    }

    public static /* synthetic */ void a(C4553tb c4553tb, long j10, Ee.a aVar, long j11, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i10 & 8) != 0) {
            jSONObject = new JSONObject();
        }
        c4553tb.a(j10, aVar, j11, jSONObject);
    }

    public final void a(long j10, @NotNull Ee.a responseOrigin, long j11, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("isMultipleAdUnits", 1);
            data.put("duration", j10);
            String strB = responseOrigin.b();
            Intrinsics.checkNotNullExpressionValue(strB, "responseOrigin.value");
            data.put(IronSourceConstants.EVENTS_EXT1, a(strB, j11));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        C4456nf.a(A5.SDK_INIT_SUCCESS, data);
    }

    @NotNull
    public final C4318fe a(@NotNull C4318fe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int iC = error.c();
        if (iC != 2070) {
            return iC != 2110 ? error : new C4318fe(error.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return new C4318fe(error.c(), "noServerResponse");
    }

    private final String a(String str, long j10) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j10;
    }

    public static /* synthetic */ void a(C4553tb c4553tb, C4318fe c4318fe, long j10, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i10 & 4) != 0) {
            jSONObject = new JSONObject();
        }
        c4553tb.a(c4318fe, j10, jSONObject);
    }

    public final void a(@NotNull C4318fe error, long j10, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("errorCode", error.c());
            data.put("reason", error.d());
            data.put("isMultipleAdUnits", 1);
            data.put("duration", j10);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        C4456nf.a(A5.SDK_INIT_FAILED, data);
    }

    public final void a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat, int i10, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(Ya.f42160f, adFormat.getValue());
        jSONObject.put("adf", C4456nf.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        C4456nf.a(A5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(@NotNull String adUnitId, int i10, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C4456nf.a(A5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }
}
