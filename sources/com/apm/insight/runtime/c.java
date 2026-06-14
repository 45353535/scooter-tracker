package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f8074a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f8075b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f8076c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f8077d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f8078e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8079a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f8079a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8079a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8079a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8079a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8079a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f8079a[crashType.ordinal()];
        if (i10 == 1) {
            this.f8074a.add(iCrashCallback);
            this.f8075b.add(iCrashCallback);
            this.f8076c.add(iCrashCallback);
            this.f8077d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f8077d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f8075b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f8074a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f8076c.add(iCrashCallback);
        }
    }

    final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f8079a[crashType.ordinal()];
        if (i10 == 1) {
            this.f8074a.remove(iCrashCallback);
            this.f8075b.remove(iCrashCallback);
            this.f8076c.remove(iCrashCallback);
            this.f8077d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f8077d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f8075b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f8074a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f8076c.remove(iCrashCallback);
        }
    }

    @NonNull
    public final List<ICrashCallback> c() {
        return this.f8075b;
    }

    @NonNull
    public final List<ICrashCallback> d() {
        return this.f8076c;
    }

    @NonNull
    public final List<ICrashCallback> e() {
        return this.f8077d;
    }

    final void a(IOOMCallback iOOMCallback) {
        this.f8078e.add(iOOMCallback);
    }

    final void b(IOOMCallback iOOMCallback) {
        this.f8078e.remove(iOOMCallback);
    }

    @NonNull
    public final List<IOOMCallback> a() {
        return this.f8078e;
    }

    @NonNull
    public final List<ICrashCallback> b() {
        return this.f8074a;
    }
}
