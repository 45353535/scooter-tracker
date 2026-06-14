package com.ironsource;

import com.vungle.ads.internal.signals.SignalManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public enum M3 {
    Day("d", SignalManager.TWENTY_FOUR_HOURS_MILLIS),
    Hour("h", 3600000),
    Second("s", 1000);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f41302c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41308b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final M3 a(@Nullable String str) {
            for (M3 m32 : M3.values()) {
                if (Intrinsics.areEqual(m32.f41307a, str)) {
                    return m32;
                }
            }
            return null;
        }

        private a() {
        }
    }

    M3(String str, long j10) {
        this.f41307a = str;
        this.f41308b = j10;
    }

    public final long a(@Nullable Integer num) {
        return ((long) (num != null ? num.intValue() : 1)) * this.f41308b;
    }

    public static /* synthetic */ long a(M3 m32, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i10 & 1) != 0) {
            num = 1;
        }
        return m32.a(num);
    }
}
