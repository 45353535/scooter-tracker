package f1;

import f1.bd;
import f1.z;
import g1.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class f8 extends z {
    /* JADX WARN: Illegal instructions before constructor call */
    public f8(ae networkParameters, re reVar, r4 r4Var, Cif cif, wc session) {
        Intrinsics.checkNotNullParameter(networkParameters, "networkParameters");
        Intrinsics.checkNotNullParameter(session, "session");
        bd.c method = networkParameters.f69401a;
        Intrinsics.checkNotNullExpressionValue(method, "method");
        String endpoint = networkParameters.f69402b;
        Intrinsics.checkNotNullExpressionValue(endpoint, "endpoint");
        String path = networkParameters.f69403c;
        Intrinsics.checkNotNullExpressionValue(path, "path");
        n3 n3Var = networkParameters.f69404d;
        r priority = networkParameters.f69405e;
        Intrinsics.checkNotNullExpressionValue(priority, "priority");
        z.a aVar = networkParameters.f69406f;
        Intrinsics.checkNotNull(cif);
        super(method, endpoint, path, n3Var, priority, (String) null, aVar, cif, session);
        JSONObject jSONObjectI = new y8(networkParameters.f69404d, reVar, r4Var).i();
        Intrinsics.checkNotNullExpressionValue(jSONObjectI, "getJsonRepresentation(...)");
        v(jSONObjectI);
    }

    @Override // f1.z, f1.bd
    public ke b(ef efVar) {
        byte[] bArrA;
        try {
            if (efVar == null || (bArrA = efVar.a()) == null) {
                bArrA = new byte[0];
            }
            return ke.f70267c.b(new JSONObject(new String(bArrA, Charsets.UTF_8)));
        } catch (JSONException e10) {
            eg.i("parseServerResponse", e10);
            return ke.f70267c.a(new g1.a(a.c.f72144g, "No Bid"));
        }
    }

    @Override // f1.z
    public void z() {
    }
}
