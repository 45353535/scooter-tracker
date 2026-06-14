package io.sentry.android.core.internal.util;

import io.sentry.g1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n f82585c = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f82586a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f82587b = new ArrayList();

    private n() {
    }

    public static n a() {
        return f82585c;
    }

    String b() {
        return "/sys/devices/system/cpu";
    }

    public List c() {
        g1 g1VarD = this.f82586a.d();
        try {
            if (!this.f82587b.isEmpty()) {
                List list = this.f82587b;
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(b()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strC = io.sentry.util.h.c(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strC != null) {
                            this.f82587b.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            List list2 = this.f82587b;
            if (g1VarD != null) {
                g1VarD.close();
            }
            return list2;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
