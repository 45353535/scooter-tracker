package io.sentry.android.replay;

import android.content.Context;
import io.sentry.x7;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f83074g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f83075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f83076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f83077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f83078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f83079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f83080f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(int i10) {
            int i11 = i10 % 16;
            return i11 <= 8 ? Math.max(16, i10 - i11) : i10 + (16 - i11);
        }

        public final r b(Context context, x7 sessionReplay, int i10, int i11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
            float f10 = i11;
            float f11 = i10;
            Pair pair = TuplesKt.to(Integer.valueOf(a(zf.a.d((f10 / context.getResources().getDisplayMetrics().density) * sessionReplay.h().sizeScale))), Integer.valueOf(a(zf.a.d((f11 / context.getResources().getDisplayMetrics().density) * sessionReplay.h().sizeScale))));
            int iIntValue = ((Number) pair.component1()).intValue();
            int iIntValue2 = ((Number) pair.component2()).intValue();
            return new r(iIntValue2, iIntValue, iIntValue2 / f11, iIntValue / f10, sessionReplay.d(), sessionReplay.h().bitRate);
        }

        private a() {
        }
    }

    public r(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f83075a = i10;
        this.f83076b = i11;
        this.f83077c = f10;
        this.f83078d = f11;
        this.f83079e = i12;
        this.f83080f = i13;
    }

    public final int a() {
        return this.f83080f;
    }

    public final int b() {
        return this.f83079e;
    }

    public final int c() {
        return this.f83076b;
    }

    public final int d() {
        return this.f83075a;
    }

    public final float e() {
        return this.f83077c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f83075a == rVar.f83075a && this.f83076b == rVar.f83076b && Float.compare(this.f83077c, rVar.f83077c) == 0 && Float.compare(this.f83078d, rVar.f83078d) == 0 && this.f83079e == rVar.f83079e && this.f83080f == rVar.f83080f;
    }

    public final float f() {
        return this.f83078d;
    }

    public int hashCode() {
        return (((((((((this.f83075a * 31) + this.f83076b) * 31) + Float.floatToIntBits(this.f83077c)) * 31) + Float.floatToIntBits(this.f83078d)) * 31) + this.f83079e) * 31) + this.f83080f;
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.f83075a + ", recordingHeight=" + this.f83076b + ", scaleFactorX=" + this.f83077c + ", scaleFactorY=" + this.f83078d + ", frameRate=" + this.f83079e + ", bitRate=" + this.f83080f + ')';
    }
}
