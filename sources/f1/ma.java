package f1;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ma {
    public JSONObject a(i9 i9Var) {
        return i9Var == null ? new JSONObject() : bb.c(bb.a("carrier-name", i9Var.d()), bb.a("mobile-country-code", i9Var.a()), bb.a("mobile-network-code", i9Var.b()), bb.a("iso-country-code", i9Var.c()), bb.a("phone-type", Integer.valueOf(i9Var.e())));
    }
}
