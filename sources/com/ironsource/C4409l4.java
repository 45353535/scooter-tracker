package com.ironsource;

import android.util.Log;
import com.ironsource.InterfaceC4375j4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4409l4 implements InterfaceC4566u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4359i4 f43538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<C4652z8, Object> f43539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4651z7 f43540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f43541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f43542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private C4652z8 f43543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f43544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Zc f43545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private String f43546i;

    /* JADX INFO: renamed from: com.ironsource.l4$a */
    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1<Result, Unit> {
        a(Object obj) {
            super(1, obj, C4409l4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(@NotNull Object obj) {
            ((C4409l4) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result result) {
            a(result.l());
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l4$b */
    /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1<Result, Unit> {
        b(Object obj) {
            super(1, obj, C4409l4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(@NotNull Object obj) throws JSONException {
            ((C4409l4) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result result) throws JSONException {
            a(result.l());
            return Unit.f93236a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4409l4(@NotNull C4359i4 config, @NotNull Function1<? super C4652z8, ? extends Object> onFinish, @NotNull InterfaceC4651z7 downloadManager, @NotNull InterfaceC4496q4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f43538a = config;
        this.f43539b = onFinish;
        this.f43540c = downloadManager;
        this.f43541d = currentTimeProvider;
        this.f43542e = C4409l4.class.getSimpleName();
        this.f43543f = new C4652z8(config.d(), "mobileController_0.html");
        this.f43544g = currentTimeProvider.a();
        this.f43545h = new Zc(config.a());
        this.f43546i = "";
    }

    @Override // com.ironsource.InterfaceC4566u7
    @NotNull
    public C4652z8 c() {
        return this.f43543f;
    }

    @NotNull
    public final Function1<C4652z8, Object> d() {
        return this.f43539b;
    }

    @NotNull
    public final InterfaceC4496q4 a() {
        return this.f43541d;
    }

    @Override // com.ironsource.InterfaceC4566u7
    public void b() {
        this.f43544g = this.f43541d.a();
        new C4252c(new C4269d(this.f43545h), this.f43538a.d() + "/temp", this.f43540c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC4566u7
    public boolean a(@NotNull C4652z8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").g(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) throws JSONException {
        if (Result.i(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.f43546i = string;
            C4392k4 c4392k4A = a(string);
            if (c4392k4A.j()) {
                C4652z8 c4652z8K = c4392k4A.k();
                this.f43543f = c4652z8K;
                this.f43539b.invoke(c4652z8K);
                return;
            }
            c4392k4A.m();
            return;
        }
        a("0").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        if (Result.j(obj)) {
            C4652z8 c4652z8 = (C4652z8) (Result.i(obj) ? null : obj);
            if (!Intrinsics.areEqual(c4652z8 != null ? c4652z8.getAbsolutePath() : null, this.f43543f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f43543f);
                    Intrinsics.checkNotNull(c4652z8);
                    uf.i.w(c4652z8, this.f43543f, true, 0, 4, null);
                } catch (Exception e10) {
                    C4462o4.d().a(e10);
                    Log.e(this.f43542e, "Unable to copy downloaded mobileController.html to cache folder: " + e10.getMessage());
                }
                Intrinsics.checkNotNull(c4652z8);
                this.f43543f = c4652z8;
            }
            new InterfaceC4375j4.b(this.f43538a.b(), this.f43544g, this.f43541d).a();
        } else {
            new InterfaceC4375j4.a(this.f43538a.b()).a();
        }
        Function1<C4652z8, Object> function1 = this.f43539b;
        if (Result.i(obj)) {
            obj = null;
        }
        function1.invoke((C4652z8) obj);
    }

    private final C4392k4 a(String str) {
        return new C4392k4(new cg(this.f43545h, str), this.f43538a.d() + "/mobileController_" + str + ".html", this.f43540c, new a(this));
    }
}
