package w8;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Ad;

/* JADX INFO: loaded from: classes12.dex */
abstract class h extends zb.b {
    h(Ad ad2) {
        super(ad2);
        b().put("creativeId", ad2.getId());
    }

    @Override // zb.b
    public boolean f() {
        Object obj = b().get("creativeAdm");
        return (obj instanceof CharSequence) && !TextUtils.isEmpty((CharSequence) obj);
    }

    void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b().put("creativeAdm", str);
    }
}
