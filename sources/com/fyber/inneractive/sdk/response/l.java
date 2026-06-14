package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.j f23750e;

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) throws Exception {
        com.fyber.inneractive.sdk.response.nativead.j jVar;
        if (this.f23710a == null || (jVar = this.f23750e) == null) {
            throw new Exception("Missing response ".concat(this.f23710a == null ? "data" : "data native"));
        }
        if (r0Var == null) {
            jVar.f23729i = "ErrorConfigurationMismatch";
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.f23750e.f23729i = "ErrorInvalidJsonResponse";
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            com.fyber.inneractive.sdk.response.nativead.i iVarA = a(jSONObject.optJSONObject("native"));
            com.fyber.inneractive.sdk.response.nativead.k kVar = this.f23750e.T;
            kVar.N = iVarA;
            if (kVar.d()) {
                a(this.f23750e, r0Var);
            }
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            if (e10.getCause() != null) {
                this.f23750e.f23729i = e10.getCause().getMessage();
            }
            this.f23750e.f23730j = e10.getMessage();
            throw e10;
        } catch (com.fyber.inneractive.sdk.response.nativead.a e11) {
            if (e11.getCause() != null) {
                this.f23750e.f23729i = e11.getCause().getMessage();
            }
            this.f23750e.f23730j = e11.getMessage();
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e11.getMessage());
            throw e11;
        } catch (Exception e12) {
            this.f23750e.f23730j = e12.getMessage();
            com.fyber.inneractive.sdk.response.nativead.j jVar2 = this.f23750e;
            jVar2.f23729i = "ErrorInvalidNativeOrtbObject";
            jVar2.f23746z = e12;
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e12.getMessage());
            if (IAlog.f23840a == 2) {
                e12.printStackTrace();
            }
            throw e12;
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean b() {
        return false;
    }

    public final void a(com.fyber.inneractive.sdk.response.nativead.j jVar, r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.e eVarC = jVar.T.c();
        String str = eVarC != null ? eVarC.f23754a : null;
        if (str != null && !str.isEmpty()) {
            d dVar = new d(false);
            dVar.f23710a = new g();
            dVar.f23714e = this.f23750e;
            dVar.a(str, r0Var);
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("Missing vast content", "VastErrorInvalidFile");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.response.nativead.i a(org.json.JSONObject r15) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.response.l.a(org.json.JSONObject):com.fyber.inneractive.sdk.response.nativead.i");
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        com.fyber.inneractive.sdk.response.nativead.j jVar = new com.fyber.inneractive.sdk.response.nativead.j();
        this.f23710a = jVar;
        this.f23750e = jVar;
        return jVar;
    }
}
