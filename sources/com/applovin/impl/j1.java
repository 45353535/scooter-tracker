package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9120a;

    public j1(com.applovin.impl.sdk.k kVar) {
        this.f9120a = kVar;
    }

    public void a(Uri uri) {
        com.applovin.impl.sdk.o.g("DeepLinkManager", "Processing incoming URL: " + uri);
        if (CollectionUtils.atLeastOneValueMatch(uri.getQueryParameterNames(), Arrays.asList("aleid", "alart"))) {
            String queryParameter = uri.getQueryParameter("alart");
            if (StringUtils.isValidString(queryParameter)) {
                this.f9120a.w0().b(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("aleid");
            if (StringUtils.isValidString(queryParameter2)) {
                this.f9120a.w0().c(queryParameter2);
            }
        }
    }
}
