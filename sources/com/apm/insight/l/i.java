package com.apm.insight.l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f7970a = new b(0);

    static class a {
        private a() {
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    @TargetApi(16)
    static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.apm.insight.l.i.a
        public final long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }

        /* synthetic */ b(byte b10) {
            this();
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return f7970a.a(memoryInfo);
    }
}
