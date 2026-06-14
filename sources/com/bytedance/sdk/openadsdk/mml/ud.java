package com.bytedance.sdk.openadsdk.mml;

import com.bytedance.sdk.openadsdk.mml.lnr.qdl;
import com.ironsource.C4424m2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public static final String qdl = qdl.InterfaceC0289qdl.qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final String f17744ud = qdl.InterfaceC0289qdl.f17706ud;
    public static final String lnr = qdl.InterfaceC0289qdl.lnr;
    public static final String mml = qdl.InterfaceC0289qdl.mml;
    public static final String mzz = qdl.InterfaceC0289qdl.mzz;
    public static final String mo = qdl.InterfaceC0289qdl.mo;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public static final Set<String> f17745wd = new HashSet(Arrays.asList("click", C4424m2.f43623v, "insight_log"));

    public static class qdl {
        public static String lnr = "direct";
        public static String mml = "saLandingPageLinks";
        public static String qdl = "openDetailPage";

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public static String f17746ud = "openAdLandPageLinks";
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.mml.ud$ud, reason: collision with other inner class name */
    public static class C0294ud {
        public static int lnr = 100;
        public static int qdl = 1;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public static int f17747ud = 2;
    }

    public static boolean qdl(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
