package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4614x4 implements P8, O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4617x7 f45815a;

    public C4614x4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.O8
    public void a(@NotNull Context context, @NotNull EnumC4597w4 source, @NotNull String key, @NotNull String value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C4 c4A = this.f45815a.a(context, source);
        if (c4A != null) {
            c4A.b(key, value);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C4614x4(@NotNull InterfaceC4617x7 sharedSignalsStorageFactory) {
        Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f45815a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.P8
    @Nullable
    public String a(@NotNull Context context, @NotNull EnumC4597w4 source, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        C4 c4A = this.f45815a.a(context, source);
        if (c4A != null) {
            return ah.a(c4A, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C4614x4(InterfaceC4617x7 interfaceC4617x7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new A4() : interfaceC4617x7);
    }
}
