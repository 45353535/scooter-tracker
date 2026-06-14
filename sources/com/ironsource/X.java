package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class X implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4434mc f42003a;

    public static final class a implements Jc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y8 f42004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InitListener f42005b;

        a(Y8 y82, InitListener initListener) {
            this.f42004a = y82;
            this.f42005b = initListener;
        }

        @Override // com.ironsource.Jc
        public void onFail(@NotNull C4516r8 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f42005b.onInitFailed(C4598w5.f45712a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.Jc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            V vE = this.f42004a.e();
            ironLog.verbose("controllerURL = " + (vE != null ? vE.c() : null));
            V vE2 = this.f42004a.e();
            ironLog.verbose("controllerConfig = " + (vE2 != null ? vE2.a() : null));
            V vE3 = this.f42004a.e();
            ironLog.verbose("debugMode = " + (vE3 != null ? Integer.valueOf(vE3.b()) : null));
            ironLog.verbose("applicationKey = " + this.f42004a.d());
            ironLog.verbose("userId = " + this.f42004a.h());
            this.f42005b.onInitSuccess();
        }
    }

    public X(@NotNull InterfaceC4434mc networkInitApi) {
        Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.f42003a = networkInitApi;
    }

    @Override // com.ironsource.W
    public void a(@NotNull Context context, @NotNull Y8 initConfig, @NotNull InitListener initListener) {
        JSONObject jSONObjectA;
        String strC;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        InterfaceC4434mc interfaceC4434mc = this.f42003a;
        V vE = initConfig.e();
        interfaceC4434mc.a(vE != null ? vE.b() : 0);
        V vE2 = initConfig.e();
        if (vE2 != null && (strC = vE2.c()) != null) {
            this.f42003a.b(strC);
        }
        V vE3 = initConfig.e();
        if (vE3 != null && (jSONObjectA = vE3.a()) != null) {
            InterfaceC4434mc interfaceC4434mc2 = this.f42003a;
            String string = jSONObjectA.toString();
            Intrinsics.checkNotNullExpressionValue(string, "applicationConfig.toString()");
            interfaceC4434mc2.a(string);
        }
        Map<String, String> mapA = new C4400kc().a();
        this.f42003a.a(new a(initConfig, initListener));
        this.f42003a.a(context, initConfig.d(), initConfig.h(), mapA);
    }
}
