package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f7712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Printer f7713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f7714c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f7715d = false;

    public interface a {
        @Nullable
        String a();

        String b();

        String c();
    }

    public static void a() {
        if (f7712a) {
            return;
        }
        f7712a = true;
        f7713b = new Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    h.a(true, str);
                } else if (str.charAt(0) == '<') {
                    h.a(false, str);
                }
            }
        };
        i.a();
        i.a(f7713b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f7714c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z10, String str) {
        e.f7656a = System.nanoTime() / 1000000;
        e.f7657b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f7714c;
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            e eVar = copyOnWriteArrayList.get(i10);
            if (eVar == null || !eVar.a()) {
                if (!z10 && eVar.f7658c) {
                    eVar.b("");
                }
            } else if (z10) {
                if (!eVar.f7658c) {
                    eVar.a(str);
                }
            } else if (eVar.f7658c) {
                eVar.b(str);
            }
        }
    }
}
