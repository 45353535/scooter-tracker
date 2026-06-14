package yads;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class w21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f83 f117278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz2 f117279b;

    public /* synthetic */ w21() {
        this(new f83(), new bz2());
    }

    public final d31 a(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
        int i11 = jSONObject.getInt("h");
        this.f117278a.getClass();
        String strA = f83.a("url", jSONObject);
        az2 az2VarA = jSONObject.has("smartCenterSettings") ? this.f117279b.a(jSONObject.getJSONObject("smartCenterSettings")) : null;
        String strOptString = jSONObject.optString("sizeType");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("preload", true);
        String strOptString2 = jSONObject.optString("preview");
        return new d31(i10, i11, strA, strOptString, az2VarA, zOptBoolean, strOptString2.length() > 0 ? strOptString2 : null);
    }

    public w21(f83 f83Var, bz2 bz2Var) {
        this.f117278a = f83Var;
        this.f117279b = bz2Var;
    }
}
