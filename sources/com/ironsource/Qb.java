package com.ironsource;

import android.app.Activity;
import com.ironsource.C4240b4;
import com.ironsource.D8;
import com.ironsource.Rb;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Qb implements Rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.sdk.controller.e f41638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final U8 f41639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4219a1 f41640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f41641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Rb.a f41642f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f41643a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f41644b = "nativeAd.load";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f41645c = "nativeAd.loadReport";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f41646d = "nativeAd.register";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f41647e = "nativeAd.click";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f41648f = "nativeAd.privacyClick";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f41649g = "nativeAd.visibilityChanged";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f41650h = "nativeAd.destroy";

        private a() {
        }
    }

    public Qb(@NotNull String id2, @NotNull com.ironsource.sdk.controller.e controllerManager, @NotNull U8 imageLoader, @NotNull InterfaceC4219a1 adViewManagement) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.f41637a = id2;
        this.f41638b = controllerManager;
        this.f41639c = imageLoader;
        this.f41640d = adViewManagement;
        this.f41641e = Qb.class.getSimpleName();
        controllerManager.a(id2, d());
    }

    @Override // com.ironsource.Rb
    public void a(@Nullable Rb.a aVar) {
        this.f41642f = aVar;
    }

    private final l.b d() {
        return new l.b() { // from class: com.ironsource.zi
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Kb kb2) {
                Qb.a(this.f45983a, kb2);
            }
        };
    }

    private final JSONObject e() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(f.b.f45113g, a.f41647e).put("sdkCallback", C4240b4.h.U);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.Rb
    public void a(@NotNull final Activity activity, @NotNull JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.f41638b.a(activity);
        this.f41638b.a(new f.c(this.f41637a, a.f41644b, loadParams), new l.a() { // from class: com.ironsource.wi
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Qb.a(this.f45803a, activity, aVar);
            }
        });
    }

    @Override // com.ironsource.Rb
    @Nullable
    public Rb.a b() {
        return this.f41642f;
    }

    @Override // com.ironsource.Rb
    public void c() {
        this.f41638b.a(new f.c(this.f41637a, a.f41648f, new JSONObject()), (l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Qb this$0, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f41641e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.f41641e, "failed to handle show on native ad: " + strOptString);
            return;
        }
        Rb.a aVarB = b();
        if (aVarB != null) {
            aVarB.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Qb this$0, Activity activity, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    private final void a(Activity activity, f.a aVar) {
        if (aVar.d() == null) {
            Rb.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Rb.a aVarB2 = b();
            if (aVarB2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                aVarB2.a(reason);
                return;
            }
            return;
        }
        D8.b bVarA = new D8.a(this.f41639c, this.f41640d).a(activity, aVar.d());
        a(bVarA, bVarA.a().h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Qb(String str, com.ironsource.sdk.controller.e eVar, U8 u82, InterfaceC4219a1 interfaceC4219a1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        u82 = (i10 & 4) != 0 ? new T8(null, 1, null) : u82;
        if ((i10 & 8) != 0) {
            interfaceC4219a1 = C4449n8.a();
            Intrinsics.checkNotNullExpressionValue(interfaceC4219a1, "getInstance()");
        }
        this(str, eVar, u82, interfaceC4219a1);
    }

    private final void a(D8.b bVar, final D8 d82) {
        this.f41638b.a(new f.c(this.f41637a, "nativeAd.loadReport." + this.f41637a, bVar.b()), new l.a() { // from class: com.ironsource.yi
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Qb.a(this.f45913a, d82, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Qb this$0, D8 adData, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adData, "$adData");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    private final void a(D8 d82, f.a aVar) {
        if (aVar.d() == null) {
            Rb.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Rb.a aVarB2 = b();
            if (aVarB2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                aVarB2.a(reason);
                return;
            }
            return;
        }
        Rb.a aVarB3 = b();
        if (aVarB3 != null) {
            aVarB3.a(d82);
        }
    }

    @Override // com.ironsource.Rb
    public void a() {
        this.f41638b.a(new f.c(this.f41637a, a.f41650h, new JSONObject()), (l.a) null);
    }

    @Override // com.ironsource.Rb
    public void a(@NotNull G8 viewHolder) throws JSONException {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", e());
        String str = this.f41637a;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        this.f41638b.a(new f.c(str, a.f41646d, params), (l.a) null);
    }

    @Override // com.ironsource.Rb
    public void a(@NotNull gg viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.f41638b.a(new f.c(this.f41637a, a.f41649g, viewVisibilityParams.g()), new l.a() { // from class: com.ironsource.xi
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Qb.b(this.f45843a, aVar);
            }
        });
    }

    @Override // com.ironsource.Rb
    public void a(@NotNull JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.f41638b.a(new f.c(this.f41637a, a.f41647e, clickParams), new l.a() { // from class: com.ironsource.aj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Qb.a(this.f42440a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Qb this$0, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    private final void a(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f41641e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.f41641e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        Rb.a aVarB = b();
        if (aVarB != null) {
            aVarB.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Qb this$0, Kb msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.areEqual(msg.e(), a.f41647e)) {
            this$0.a(msg);
        }
    }

    private final void a(Kb kb2) {
        if (kb2.f() == null) {
            Logger.i(this.f41641e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!kb2.f().optBoolean("success", false)) {
            String strOptString = kb2.f().optString("reason", "unexpected error");
            Logger.i(this.f41641e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        Rb.a aVarB = b();
        if (aVarB != null) {
            aVarB.e();
        }
    }
}
