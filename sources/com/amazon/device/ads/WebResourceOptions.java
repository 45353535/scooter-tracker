package com.amazon.device.ads;

/* JADX INFO: loaded from: classes5.dex */
public class WebResourceOptions {
    private static String cdnHost;
    private static String[] jsNames = {"aps-mraid.js", "dtb-m.js", "omsdk-v1.js"};
    private static boolean useLocalOnly;

    static String getCDNHost(String str) {
        String str2 = cdnHost;
        if (str2 == null) {
            str2 = DtbConstants.DTB_WEB_RESOURCES;
        }
        if ("omsdk-v1.js".equals(str)) {
            str2 = "video-player.aps.amazon-adsystem.com/static/omsdk/" + DtbConstants.INTEGRATED_OM_VERSION;
        }
        if (str2.endsWith("/")) {
            return str2;
        }
        return str2 + "/";
    }

    static String[] getCDNResources() {
        return jsNames;
    }

    public static boolean isLocalSourcesOnly() {
        return useLocalOnly;
    }

    static void setCDNHost(String str) {
        if (str.equals(cdnHost)) {
            return;
        }
        cdnHost = str;
        DtbSharedPreferences.getInstance().resetWebResoucesLastPing();
        WebResourceService.getInstance().deleteWebDirContent();
    }

    static void setCDNResources(String[] strArr) {
        jsNames = strArr;
    }

    static void setLocalSourcesOnly(boolean z10) {
        useLocalOnly = z10;
    }
}
