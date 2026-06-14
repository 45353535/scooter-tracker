package com.apm.insight.l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f7971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static File f7972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static File f7973c;

    public static File a(@NonNull Context context) {
        return new File(j(context), "apminsight/CrashLogJava");
    }

    public static File b(@NonNull Context context) {
        return new File(j(context), "apminsight/CrashLogSimple");
    }

    public static File c(@NonNull Context context) {
        return new File(j(context), "apminsight/RuntimeContext");
    }

    public static File d(@NonNull Context context) {
        if (f7972b == null) {
            if (context == null) {
                context = com.apm.insight.e.g();
            }
            f7972b = new File(j(context), "apminsight/CrashLogNative");
        }
        return f7972b;
    }

    public static File e(@NonNull Context context) {
        if (f7973c == null) {
            f7973c = new File(j(context) + IOUtils.DIR_SEPARATOR_UNIX + "apminsight/CrashCommonLog/" + com.apm.insight.e.f());
        }
        return f7973c;
    }

    public static File f(Context context) {
        return new File(j(context), "apminsight/CrashCommonLog");
    }

    public static File g(Context context) {
        return new File(j(context), "apminsight/issueCrashTimes");
    }

    public static File h(Context context) {
        return new File(j(context) + IOUtils.DIR_SEPARATOR_UNIX + "apminsight/issueCrashTimes/current.times");
    }

    public static File i(@NonNull Context context) {
        return new File(j(context), "apminsight/alogCrash");
    }

    public static File j(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "threads.txt");
    }

    public static File k(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "meminfo.txt");
    }

    public static File l(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "pthreads.txt");
    }

    public static File m(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "rountines.txt");
    }

    public static File n(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "leakd_threads.txt");
    }

    public static File o(File file) {
        return new File(file, "abortmsg.txt");
    }

    public static File a() {
        File file = f7972b;
        return file == null ? d(com.apm.insight.e.g()) : file;
    }

    public static String b() {
        return "anr_" + com.apm.insight.e.e();
    }

    public static String c() {
        return String.format("ensure_%s", com.apm.insight.e.e());
    }

    public static File f(File file) {
        return new File(file, "upload.json");
    }

    public static File g(File file) {
        return new File(file, "javastack.txt");
    }

    public static File h(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "logcat.txt");
    }

    public static File i(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "fds.txt");
    }

    public static String j(@NonNull Context context) {
        if (TextUtils.isEmpty(f7971a)) {
            try {
                f7971a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e10) {
                f7971a = "/sdcard/";
                e10.printStackTrace();
            }
        }
        return f7971a;
    }

    public static File b(File file) {
        return new File(file, "tombstone.txt");
    }

    public static File c(File file) {
        return new File(file, "header.bin");
    }

    public static File f(String str) {
        return new File(a(com.apm.insight.e.g(), str), "rountines.txt");
    }

    public static File g(String str) {
        return new File(a(com.apm.insight.e.g(), str), "leakd_threads.txt");
    }

    public static File a(@NonNull Context context, String str) {
        return new File(j(context) + IOUtils.DIR_SEPARATOR_UNIX + "apminsight/CrashCommonLog/" + str);
    }

    public static File b(String str) {
        return new File(a(com.apm.insight.e.g(), str), "fds.txt");
    }

    public static File c(String str) {
        return new File(a(com.apm.insight.e.g(), str), "threads.txt");
    }

    public static File e(File file) {
        return new File(file, "callback.json");
    }

    public static String a(String str) {
        return "dart_".concat(String.valueOf(str));
    }

    public static File d(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "maps.txt");
    }

    public static File e(String str) {
        return new File(a(com.apm.insight.e.g(), str), "pthreads.txt");
    }

    public static File a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    public static File d(String str) {
        return new File(a(com.apm.insight.e.g(), str), "meminfo.txt");
    }

    public static File a(File file) {
        return new File(file, "flog.txt");
    }
}
