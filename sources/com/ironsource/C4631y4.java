package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4631y4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45855c = "y4";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f45856d = "setSharedSignal";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f45857e = "getSharedSignal";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45858f = "functionName";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f45859g = "functionParams";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f45860h = "success";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45861i = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C4614x4 f45863b;

    /* JADX INFO: renamed from: com.ironsource.y4$a */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f45865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f45866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f45867d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f45864a = jSONObject.optString("functionName");
            aVar.f45865b = jSONObject.optJSONObject("functionParams");
            aVar.f45866c = jSONObject.optString("success");
            aVar.f45867d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C4631y4(Context context, C4614x4 c4614x4) {
        this.f45862a = context;
        this.f45863b = c4614x4;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, InterfaceC4451na interfaceC4451na) {
        Yd yd2 = new Yd();
        JSONObject jSONObject = aVar.f45865b;
        this.f45863b.a(context, EnumC4597w4.a(jSONObject.optString("source")), jSONObject.optString(C4240b4.i.W), jSONObject.optString("data"));
        interfaceC4451na.a(true, aVar.f45866c, yd2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r6, com.ironsource.InterfaceC4451na r7) throws java.lang.Exception {
        /*
            r5 = this;
            com.ironsource.y4$a r0 = r5.a(r6)
            java.lang.String r1 = r0.f45864a     // Catch: java.lang.Exception -> L20
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L20
            r3 = 576059875(0x2255f9e3, float:2.8999172E-18)
            r4 = 1
            if (r2 == r3) goto L22
            r3 = 1486812399(0x589ef4ef, float:1.3981986E15)
            if (r2 == r3) goto L16
            goto L2c
        L16:
            java.lang.String r2 = "setSharedSignal"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L2c
            r1 = 0
            goto L2d
        L20:
            r6 = move-exception
            goto L54
        L22:
            java.lang.String r2 = "getSharedSignal"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L2c
            r1 = r4
            goto L2d
        L2c:
            r1 = -1
        L2d:
            if (r1 == 0) goto L4e
            if (r1 != r4) goto L37
            android.content.Context r6 = r5.f45862a     // Catch: java.lang.Exception -> L20
            r5.a(r6, r0, r7)     // Catch: java.lang.Exception -> L20
            return
        L37:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Exception -> L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20
            r2.<init>()     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = "unsupported API: "
            r2.append(r3)     // Catch: java.lang.Exception -> L20
            r2.append(r6)     // Catch: java.lang.Exception -> L20
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L20
            r1.<init>(r6)     // Catch: java.lang.Exception -> L20
            throw r1     // Catch: java.lang.Exception -> L20
        L4e:
            android.content.Context r6 = r5.f45862a     // Catch: java.lang.Exception -> L20
            r5.b(r6, r0, r7)     // Catch: java.lang.Exception -> L20
            return
        L54:
            r5.a(r0, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4631y4.a(java.lang.String, com.ironsource.na):void");
    }

    private void a(Context context, a aVar, InterfaceC4451na interfaceC4451na) {
        Yd yd2 = new Yd();
        JSONObject jSONObject = aVar.f45865b;
        yd2.b("data", this.f45863b.a(context, EnumC4597w4.a(jSONObject.optString("source")), jSONObject.optString(C4240b4.i.W)));
        interfaceC4451na.a(true, aVar.f45866c, yd2);
    }

    private void a(a aVar, InterfaceC4451na interfaceC4451na, Exception exc) {
        C4462o4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(f45855c, aVar.f45864a + " exception " + message);
        Yd yd2 = new Yd();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        yd2.b("error", message);
        interfaceC4451na.a(false, aVar.f45867d, yd2);
    }
}
