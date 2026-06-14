package com.pubmatic.sdk.omsdk;

import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.adsession.VerificationScriptResource;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBOMSDKUtil {
    public static final String TAG = "OMSDK";

    @NonNull
    public static List<VerificationScriptResource> getVerificationScriptResourceList(@Nullable List<? extends POBVerificationScriptResource> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (POBVerificationScriptResource pOBVerificationScriptResource : list) {
                List<String> javaScriptResource = pOBVerificationScriptResource.getJavaScriptResource();
                if (javaScriptResource != null) {
                    for (String str : javaScriptResource) {
                        if (URLUtil.isValidUrl(str)) {
                            try {
                                URL url = new URL(str);
                                arrayList.add((POBUtils.isNullOrEmpty(pOBVerificationScriptResource.getVendorKey()) || POBUtils.isNullOrEmpty(pOBVerificationScriptResource.getVerificationParameter())) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(pOBVerificationScriptResource.getVendorKey(), url, pOBVerificationScriptResource.getVerificationParameter()));
                            } catch (Exception unused) {
                                POBLog.warn(TAG, "Unable to form verification script resource for resource url : %s", str);
                            }
                        }
                    }
                } else {
                    POBLog.debug(TAG, "Javascript resources are null", new Object[0]);
                }
            }
        }
        return arrayList;
    }
}
