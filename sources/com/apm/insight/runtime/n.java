package com.apm.insight.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f8118a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f8121c;

        a(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 3) {
                com.apm.insight.c.a();
                j.a(new RuntimeException("err ProcessTrack line:".concat(str)), "NPTH_CATCH");
                return;
            }
            this.f8120b = strArrSplit[0];
            this.f8119a = strArrSplit[1];
            try {
                this.f8121c = Long.parseLong(strArrSplit[2]);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(new RuntimeException("err ProcessTrack line:".concat(str), th2), "NPTH_CATCH");
            }
        }
    }

    public static File a(long j10) {
        return new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j10 - (j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS));
    }

    @NonNull
    public static HashMap<String, a> a(long j10, String str) throws Throwable {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j10 - (j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS));
        String[] list = file.list();
        HashMap<String, a> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file2, length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0L);
                    int length2 = jSONArrayA.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String strOptString = jSONArrayA.optString(length2);
                            if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                                map.put(str2.replace('_', ':').replace(".txt", ""), new a(strOptString));
                                break;
                            }
                            length2--;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return map;
    }

    public static void a(String str, String str2) {
        File file;
        try {
            if (f8118a == null) {
                com.apm.insight.e.g();
                String strB = com.apm.insight.l.a.b();
                if (strB == null) {
                    file = null;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    f8118a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + IOUtils.DIR_SEPARATOR_UNIX + strB.replace(':', '_') + ".txt");
                    file = f8118a;
                }
            } else {
                file = f8118a;
            }
            if (file != null) {
                com.apm.insight.l.f.a(file, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
