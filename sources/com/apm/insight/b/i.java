package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7716a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f7717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Printer f7719d;

    public interface a {
    }

    static class b implements Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<Printer> f7720a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Printer> f7723d = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<Printer> f7721b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7724e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7722c = false;

        b() {
        }

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f7722c) {
                for (Printer printer : this.f7721b) {
                    if (!this.f7720a.contains(printer)) {
                        this.f7720a.add(printer);
                    }
                }
                this.f7721b.clear();
                this.f7722c = false;
            }
            if (this.f7720a.size() > i.f7716a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f7720a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() {
        if (f7718c) {
            return;
        }
        f7718c = true;
        f7717b = new b();
        Printer printerD = d();
        f7719d = printerD;
        if (printerD != null) {
            f7717b.f7720a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f7717b);
        }
    }

    static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f7717b.f7721b.contains(printer)) {
            return;
        }
        f7717b.f7721b.add(printer);
        f7717b.f7722c = true;
    }
}
