package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes7.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20834b;

    static {
        String strB = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
        f20833a = "<html><head>" + strB + "<script src='%s'></script></head><body></body></html>";
        f20834b = "<html><head>" + strB + "%s</head><body></body></html>";
    }

    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static String b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (str.startsWith(iAConfigManager.f20311q ? "https" : "http")) {
            return String.format(f20833a, str);
        }
        if (iAConfigManager.f20311q && !str.startsWith("https")) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return String.format(f20834b, str);
    }
}
