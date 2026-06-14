package com.ironsource;

import android.app.Activity;
import com.ironsource.C4240b4;
import com.ironsource.C4500q8;
import com.ironsource.F8;
import com.ironsource.G8;
import com.ironsource.Rb;
import com.ironsource.Xd;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class B8 implements F8 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f40431j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f40432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rb f40433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4550t8 f40434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private D8 f40435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f40436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f40437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Long f40438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private F8.a f40439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private G8 f40440i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final B8 a() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new B8(string, new Qb(string, controllerManager, null, null, 12, null), new C4567u8());
        }

        private a() {
        }
    }

    public B8(@NotNull String id2, @NotNull Rb controller, @NotNull InterfaceC4550t8 eventTracker) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f40432a = id2;
        this.f40433b = controller;
        this.f40434c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4533s8 d() {
        C4533s8 c4533s8A = new C4533s8().a(D5.f40577x, this.f40437f).a(D5.f40575v, this.f40436e).a(D5.f40576w, C4500q8.e.NativeAd.toString()).a(D5.I, Long.valueOf(j()));
        Intrinsics.checkNotNullExpressionValue(c4533s8A, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c4533s8A;
    }

    @NotNull
    public static final B8 e() {
        return f40431j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l10 = this.f40438g;
        if (l10 == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l10.longValue();
    }

    @Nullable
    public final String h() {
        return this.f40436e;
    }

    @Nullable
    public final String i() {
        return this.f40437f;
    }

    @Override // com.ironsource.F8
    @Nullable
    public F8.a b() {
        return this.f40439h;
    }

    @Override // com.ironsource.F8
    @Nullable
    public D8 c() {
        return this.f40435d;
    }

    public static final class b implements Rb.a {
        b() {
        }

        @Override // com.ironsource.Rb.a
        public void a(@NotNull D8 adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            B8.this.f40435d = adData;
            InterfaceC4550t8 interfaceC4550t8 = B8.this.f40434c;
            Xd.a loadAdSuccess = Xd.f42078l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapA = B8.this.d().a();
            Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
            interfaceC4550t8.a(loadAdSuccess, mapA);
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Rb.a
        public void e() {
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Rb.a
        public void a(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            C4533s8 c4533s8A = B8.this.d().a(D5.A, reason);
            InterfaceC4550t8 interfaceC4550t8 = B8.this.f40434c;
            Xd.a loadAdFailed = Xd.f42073g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapA = c4533s8A.a();
            Intrinsics.checkNotNullExpressionValue(mapA, "eventParams.data");
            interfaceC4550t8.a(loadAdFailed, mapA);
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Rb.a
        public void a() {
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.F8
    public void a(@Nullable F8.a aVar) {
        this.f40439h = aVar;
    }

    public static final class c implements G8.a {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40443a;

            static {
                int[] iArr = new int[G8.b.values().length];
                try {
                    iArr[G8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f40443a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.G8.a
        public void a(@NotNull G8.b viewName) throws JSONException {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.f40443a[viewName.ordinal()] == 1) {
                B8.this.f40433b.c();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.b());
            Rb rb2 = B8.this.f40433b;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            rb2.a(clickParams);
        }

        @Override // com.ironsource.G8.a
        public void a(@NotNull gg viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            B8.this.f40433b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.F8
    public void a(@NotNull Activity activity, @NotNull JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.f40438g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f40436e = loadParams.optString("demandSourceName");
        this.f40437f = loadParams.optString("inAppBidding");
        InterfaceC4550t8 interfaceC4550t8 = this.f40434c;
        Xd.a loadAd = Xd.f42072f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> mapA = d().a();
        Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        interfaceC4550t8.a(loadAd, mapA);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(C4240b4.i.f42663y0, String.valueOf(this.f40438g));
        this.f40433b.a(activity, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ B8(String str, Rb rb2, InterfaceC4550t8 interfaceC4550t8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(str, rb2, interfaceC4550t8);
    }

    @Override // com.ironsource.F8
    public void a(@NotNull G8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = d().a();
        Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = viewHolder.t().toString();
        Intrinsics.checkNotNullExpressionValue(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(D5.f40578y, string);
        InterfaceC4550t8 interfaceC4550t8 = this.f40434c;
        Xd.a registerAd = Xd.f42080n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC4550t8.a(registerAd, linkedHashMap);
        this.f40440i = viewHolder;
        viewHolder.a(g());
        this.f40433b.a(viewHolder);
    }

    @Override // com.ironsource.F8
    public void a() {
        G8 g82 = this.f40440i;
        if (g82 != null) {
            g82.a((G8.a) null);
        }
        this.f40433b.a();
    }
}
