package com.unity3d.services.core.device.reader.pii;

import com.taurusx.tax.f.y;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "TRUE", "FALSE", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag$Companion;", "", "()V", "fromString", "Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag;", "value", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NonBehavioralFlag fromString(@NotNull String value) {
            Object objB;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Result.Companion companion = Result.f93230c;
                String upperCase = value.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objB = Result.b(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (Result.i(objB)) {
                objB = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) objB;
        }

        private Companion() {
        }
    }
}
