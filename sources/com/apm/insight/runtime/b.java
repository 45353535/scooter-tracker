package com.apm.insight.runtime;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f8072a = -30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static File f8073b;

    public static void a(long j10) throws Throwable {
        if (j10 - f8072a < 30000) {
            return;
        }
        f8072a = j10;
        try {
            if (f8073b == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                f8073b = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + "/" + com.apm.insight.e.f());
            }
            com.apm.insight.l.f.a(f8073b, String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    public static String a(long j10, String str) {
        try {
            return com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((j10 - (j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + "/" + str), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i10 = 0; i10 < list.length - 5; i10++) {
                com.apm.insight.l.f.a(new File(file, list[i10]));
            }
        }
    }
}
