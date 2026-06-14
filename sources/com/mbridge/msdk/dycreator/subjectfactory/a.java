package com.mbridge.msdk.dycreator.subjectfactory;

import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f48148a;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.subjectfactory.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0505a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48149a;

        static {
            int[] iArr = new int[b.values().length];
            f48149a = iArr;
            try {
                iArr[b.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48149a[b.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48149a[b.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48149a[b.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private a() {
    }

    public static a a() {
        if (f48148a == null) {
            synchronized (a.class) {
                try {
                    if (f48148a == null) {
                        f48148a = new a();
                    }
                } finally {
                }
            }
        }
        return f48148a;
    }

    public <T extends com.mbridge.msdk.dycreator.viewobserver.a> T a(b bVar) {
        int i10 = C0505a.f48149a[bVar.ordinal()];
        if (i10 == 1) {
            return new d();
        }
        if (i10 == 2) {
            return new c();
        }
        if (i10 == 3) {
            return new f();
        }
        if (i10 != 4) {
            return null;
        }
        return new h();
    }
}
