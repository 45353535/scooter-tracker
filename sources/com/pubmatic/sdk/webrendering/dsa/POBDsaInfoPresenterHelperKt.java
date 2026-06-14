package com.pubmatic.sdk.webrendering.dsa;

import com.pubmatic.sdk.common.log.POBLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"encodeToUTF8", "", "webrendering_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public abstract class POBDsaInfoPresenterHelperKt {
    @NotNull
    public static final String encodeToUTF8(@Nullable String str) {
        String strEncode;
        if (str != null) {
            try {
                strEncode = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                POBLog.error("StringEncoding", "Failed to encode string: " + e10.getMessage(), new Object[0]);
                strEncode = "";
            }
        } else {
            strEncode = null;
        }
        return strEncode == null ? "" : strEncode;
    }
}
