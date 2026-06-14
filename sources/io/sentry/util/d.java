package io.sentry.util;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.e7;
import io.sentry.g7;
import io.sentry.v7;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f84295a = "sentry-debug-meta.properties";

    public static void a(v7 v7Var, List list) {
        if (list != null) {
            f(v7Var, list);
            b(v7Var, list);
            d(v7Var, list);
        }
    }

    private static void b(v7 v7Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Properties properties = (Properties) it.next();
            String strG = g(properties);
            if (strG != null) {
                String strH = h(properties);
                if (strH == null) {
                    strH = "unknown";
                }
                v7Var.getLogger().c(g7.DEBUG, "Build tool found: %s, version %s", strG, strH);
                e7.d().b(strG, strH);
                return;
            }
        }
    }

    private static void c(v7 v7Var, List list) {
        if (v7Var.getBundleIds().isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                v7Var.getLogger().c(g7.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(StringUtils.COMMA, -1)) {
                        v7Var.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void d(v7 v7Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Properties properties = (Properties) it.next();
            String strK = k(properties);
            String strL = l(properties);
            String strI = i(properties);
            String strJ = j(properties);
            if (strK != null || strL != null || strI != null || strJ != null) {
                v7.g distribution = v7Var.getDistribution();
                if (strK != null && !strK.isEmpty() && distribution.f84355b.isEmpty()) {
                    v7Var.getLogger().c(g7.DEBUG, "Distribution org slug found: %s", strK);
                    distribution.f84355b = strK;
                }
                if (strL != null && !strL.isEmpty() && distribution.f84356c.isEmpty()) {
                    v7Var.getLogger().c(g7.DEBUG, "Distribution project slug found: %s", strL);
                    distribution.f84356c = strL;
                }
                if (strI != null && !strI.isEmpty() && distribution.f84354a.isEmpty()) {
                    v7Var.getLogger().c(g7.DEBUG, "Distribution org auth token found", new Object[0]);
                    distribution.f84354a = strI;
                }
                if (strJ == null || strJ.isEmpty() || distribution.f84358e != null) {
                    return;
                }
                v7Var.getLogger().c(g7.DEBUG, "Distribution build configuration found: %s", strJ);
                distribution.f84358e = strJ;
                return;
            }
        }
    }

    private static void e(v7 v7Var, List list) {
        if (v7Var.getProguardUuid() == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM = m((Properties) it.next());
                if (strM != null) {
                    v7Var.getLogger().c(g7.DEBUG, "Proguard UUID found: %s", strM);
                    v7Var.setProguardUuid(strM);
                    return;
                }
            }
        }
    }

    public static void f(v7 v7Var, List list) {
        if (list != null) {
            c(v7Var, list);
            e(v7Var, list);
        }
    }

    public static String g(Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    public static String h(Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    private static String i(Properties properties) {
        return properties.getProperty("io.sentry.distribution.auth-token");
    }

    private static String j(Properties properties) {
        return properties.getProperty("io.sentry.distribution.build-configuration");
    }

    private static String k(Properties properties) {
        return properties.getProperty("io.sentry.distribution.org-slug");
    }

    private static String l(Properties properties) {
        return properties.getProperty("io.sentry.distribution.project-slug");
    }

    public static String m(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
