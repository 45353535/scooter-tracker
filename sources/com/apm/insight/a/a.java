package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* JADX INFO: loaded from: classes5.dex */
public class a implements ICrashCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f7606d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f7607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile i.a f7608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile i.a f7609c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f7610e = false;

    private a() {
    }

    public static a a() {
        if (f7606d == null) {
            synchronized (a.class) {
                try {
                    if (f7606d == null) {
                        f7606d = new a();
                    }
                } finally {
                }
            }
        }
        return f7606d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f7607a = str;
        this.f7608b = aVar;
        this.f7609c = aVar2;
        if (this.f7610e) {
            return;
        }
        this.f7610e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
