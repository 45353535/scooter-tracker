package d9;

import android.os.Bundle;
import android.text.TextUtils;
import c9.e;
import com.taurusx.tax.n.z;

/* JADX INFO: loaded from: classes12.dex */
public class a implements b {
    @Override // d9.b
    public String a(String str, Bundle bundle) {
        int i10;
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey("params_error_code") && (i10 = bundle.getInt("params_error_code", -1)) > -1) {
            e.a("VastAdUrlProcessor", "Before prepare url: %s", str);
            if (str.contains(z.f66398w)) {
                str = str.replace(z.f66398w, String.valueOf(i10));
            }
            if (str.contains("%5BERRORCODE%5D")) {
                str = str.replace("%5BERRORCODE%5D", String.valueOf(i10));
            }
            e.a("VastAdUrlProcessor", "After prepare url: %s", str);
        }
        return str;
    }
}
