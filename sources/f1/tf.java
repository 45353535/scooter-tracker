package f1;

import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.common.net.HttpHeaders;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class tf {

    public interface a {
        void a(JSONObject jSONObject);
    }

    public final void a(String str, a aVar) {
        if (b(str)) {
            eg.j("CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource", null, 2, null);
            if (aVar != null) {
                aVar.a(new JSONObject().put(PglCryptUtils.KEY_MESSAGE, "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource"));
            }
        }
    }

    public final boolean b(String str) {
        return (str == null || !StringsKt.g0(str, HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, false, 2, null) || !StringsKt.g0(str, "'null'", false, 2, null) || StringsKt.g0(str, "http://", false, 2, null) || StringsKt.g0(str, DtbConstants.HTTPS, false, 2, null)) ? false : true;
    }
}
