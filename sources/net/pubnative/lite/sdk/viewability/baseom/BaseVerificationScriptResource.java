package net.pubnative.lite.sdk.viewability.baseom;

import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class BaseVerificationScriptResource {
    private final URL resourceUrl;
    private final String vendorKey;
    private final String verificationParameters;

    private BaseVerificationScriptResource(String str, URL url, String str2) {
        this.vendorKey = str;
        this.resourceUrl = url;
        this.verificationParameters = str2;
    }

    public static BaseVerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        return new BaseVerificationScriptResource(str, url, str2);
    }

    public URL getResourceUrl() {
        return this.resourceUrl;
    }

    public String getVendorKey() {
        return this.vendorKey;
    }

    public String getVerificationParameters() {
        return this.verificationParameters;
    }
}
