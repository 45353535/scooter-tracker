package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20925a = b("app_screen_%d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20926b = "document.getElementById(\"app_screen_%d\").src = app_screen_%d;\n";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20927c = b("app_video_url_%d");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20928d = "document.getElementById(\"app_video_url_%d\").src = app_video_url_%d;\n";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20929e = b("app_icon");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20930f = "document.getElementById(\"app_icon\").src = app_icon;\n";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f20931g = b("app_name");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f20932h = a("app_name");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20933i = b("app_pub_name");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20934j = a("app_pub_name");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20935k = b("app_label");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f20936l = a("app_label");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f20937m = b(CampaignEx.JSON_KEY_APP_SIZE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f20938n = a(CampaignEx.JSON_KEY_APP_SIZE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f20939o = b("app_rating");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f20940p = a("app_rating");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f20941q = b("app_rating_icon");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f20942r = "document.getElementById(\"app_rating_icon\").src = app_rating_icon;\n";

    public static String a(String str) {
        return "document.getElementById(\"" + str + "\").innerHTML = `${" + str + "}`;\n";
    }

    public static String b(String str) {
        return "var " + str + " = `%s`;\n";
    }

    public static String a(boolean z10, String str) {
        StringBuilder sb2 = new StringBuilder("document.getElementById(\"");
        sb2.append(str);
        sb2.append("\").style.display = ");
        sb2.append(z10 ? "'block'" : "'none'");
        sb2.append(";\n");
        return sb2.toString();
    }
}
