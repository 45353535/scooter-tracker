package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.amazon.device.ads.DtbDeviceData;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4623xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7 f45829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Long> f45830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final I7 f45831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Executor f45832d;

    /* JADX INFO: renamed from: com.ironsource.xd$a */
    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function0<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45833a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xd$b */
    public static final class b implements OutcomeReceiver {
        b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C4623xd.this.a(error.getMessage());
        }

        public void onResult(@Nullable Object obj) {
            C4623xd.this.c();
        }
    }

    public C4623xd() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    private final void d() {
        this.f45829a.a(new C4649z5(A5.REGISTER_TRIGGER, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    public final void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d();
        try {
            MeasurementManager measurementManagerA = C4371j0.a(context);
            if (measurementManagerA == null) {
                a("could not obtain measurement manager");
            } else {
                measurementManagerA.registerTrigger(a(context), this.f45832d, a());
            }
        } catch (Exception e10) {
            a(e10.getMessage());
            C4462o4.d().a(e10);
        }
    }

    public C4623xd(@NotNull C7 eventManager, @NotNull Function0<Long> getTimeFunction, @NotNull I7 serviceProvider, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f45829a = eventManager;
        this.f45830b = getTimeFunction;
        this.f45831c = serviceProvider;
        this.f45832d = executor;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C4432ma.b().c();
        List<String> list = concurrentHashMapC != null ? concurrentHashMapC.get("is_child_directed") : null;
        String str = list != null ? (String) CollectionsKt.first((List) list) : null;
        return str == null ? "" : str;
    }

    private final Uri a(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = this.f45831c.i();
        String strA = IronSourceUtils.a(context);
        Uri uriBuild = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(N6.V0, interfaceC4634y7I.I(context)).appendQueryParameter(N6.L0, interfaceC4634y7I.y(context)).appendQueryParameter("auid", interfaceC4634y7I.d(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(N6.f41393j0, String.valueOf(C4371j0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(this.f45830b.invoke().longValue())).appendQueryParameter(C4240b4.j.f42708x, interfaceC4634y7I.c(context)).appendQueryParameter("deviceCarrier", interfaceC4634y7I.u(context)).appendQueryParameter("connectionType", strA).appendQueryParameter(X3.f42018b, String.valueOf(StringsKt.N(strA, X3.f42018b, true))).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4623xd(C7 c72, Function0 function0, I7 i72, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        c72 = (i10 & 1) != 0 ? Ib.f41088s.d().q() : c72;
        function0 = (i10 & 2) != 0 ? a.f45833a : function0;
        i72 = (i10 & 4) != 0 ? Ib.f41088s.d() : i72;
        if ((i10 & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
        this(c72, function0, i72, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f45829a.a(new C4649z5(A5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    private final OutcomeReceiver a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f45829a.a(new C4649z5(A5.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}
