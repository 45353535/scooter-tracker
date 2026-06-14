package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Ee;
import com.ironsource.InterfaceC4345h7;
import com.ironsource.InterfaceC4506qe;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Ce {
    private final InterfaceC4506qe b(Context context, C4590ve c4590ve, C4419le c4419le) throws Throwable {
        InterfaceC4506qe interfaceC4506qeA = a(context, c4590ve, c4419le);
        if (!(interfaceC4506qeA instanceof InterfaceC4506qe.a)) {
            return interfaceC4506qeA;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        Ee eeA = c4590ve.a(context, c4419le.d());
        if (eeA == null || !eeA.q()) {
            return interfaceC4506qeA;
        }
        InterfaceC4506qe.b bVar = new InterfaceC4506qe.b(new C4436me(eeA));
        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c4419le.d(), c4419le.f());
        IronSourceLoggerManager.getLogger().log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError + ": " + bVar.b(), 1);
        c4590ve.g();
        return bVar;
    }

    public final void a(@NotNull Context context, @NotNull C4419le request, @NotNull C4590ve tools, @NotNull InterfaceC4385je listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strF = request.f();
        if (strF == null) {
            strF = "";
        }
        tools.a("userId", strF);
        tools.a("appKey", request.d());
        tools.c().i(request.f());
        tools.a();
        InterfaceC4506qe interfaceC4506qeB = b(context, tools, request);
        if (interfaceC4506qeB instanceof InterfaceC4506qe.b) {
            listener.a(new C4284de(((InterfaceC4506qe.b) interfaceC4506qeB).b()));
        } else if (interfaceC4506qeB instanceof InterfaceC4506qe.a) {
            InterfaceC4506qe.a aVar = (InterfaceC4506qe.a) interfaceC4506qeB;
            tools.a(aVar.d(), aVar.f(), aVar.e());
            listener.a(aVar.d());
        }
    }

    private final InterfaceC4506qe a(Context context, C4590ve c4590ve, C4419le c4419le) throws Throwable {
        C4318fe c4318fe;
        try {
            String strA = c4590ve.a(context);
            if (TextUtils.isEmpty(strA)) {
                strA = c4590ve.b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strA;
            C4246ba c4246baD = c4590ve.d();
            String strA2 = Ge.a(context, c4419le.d(), c4419le.f(), str, null, true, c4246baD != null ? c4246baD.f() : null, false);
            String string = C4279d9.a().toString();
            Intrinsics.checkNotNullExpressionValue(string, "createRequestData().toString()");
            InterfaceC4345h7 serverResponse = C4311f7.a(strA2, string);
            if (serverResponse instanceof InterfaceC4345h7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC4345h7.a) serverResponse).a());
                Intrinsics.checkNotNullExpressionValue(serverResponse, "serverResponse");
                return new InterfaceC4506qe.a(a((InterfaceC4345h7.a) serverResponse), strA2, string);
            }
            if (serverResponse instanceof InterfaceC4345h7.b) {
                String strD = ((InterfaceC4345h7.b) serverResponse).d();
                if (c4590ve.e()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    JSONObject jSONObject = new JSONObject(strD);
                    String encryptedResponse = jSONObject.optString("response");
                    if (TextUtils.isEmpty(encryptedResponse)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new InterfaceC4506qe.a(new C4318fe(2100, C4369ie.f43372h), strA2, string);
                    }
                    boolean zOptBoolean = jSONObject.optBoolean("compression", false);
                    Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                    strD = a(encryptedResponse, zOptBoolean);
                    if (TextUtils.isEmpty(strD)) {
                        ironLog.warning("encoded response invalid - return null");
                        c4590ve.f();
                        return new InterfaceC4506qe.a(new C4318fe(C4318fe.f43117f, C4369ie.f43371g), strA2, string);
                    }
                }
                Ee ee2 = new Ee(context, c4419le.d(), c4419le.f(), strD);
                ee2.a(Ee.a.SERVER);
                if (!ee2.q()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    String strE = ee2.e();
                    if (strE == null) {
                        strE = "Unknown";
                    }
                    return new InterfaceC4506qe.a(new C4318fe(C4318fe.f43116e, strE), strA2, string);
                }
                return new InterfaceC4506qe.b(new C4436me(ee2));
            }
            throw new lf.m();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.warning("exception = " + e10);
            if (e10 instanceof JSONException) {
                c4318fe = new C4318fe(C4318fe.f43116e, "serverResponseIsNotValid");
            } else {
                c4318fe = new C4318fe(510, "internal error");
            }
            return new InterfaceC4506qe.a(c4318fe, null, null, 6, null);
        }
    }

    private final String a(String str, boolean z10) {
        if (z10) {
            String strD = K9.d(C4427m5.b().c(), str);
            Intrinsics.checkNotNullExpressionValue(strD, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return strD;
        }
        String strB = K9.b(C4427m5.b().c(), str);
        Intrinsics.checkNotNullExpressionValue(strB, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strB;
    }

    private final C4318fe a(InterfaceC4345h7.a aVar) {
        return new C4318fe(aVar.b() ? C4318fe.f43115d : C4318fe.f43119h, aVar.a());
    }
}
