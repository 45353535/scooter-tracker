package com.mobilefuse.sdk.network.model;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/network/model/AdmCreativeFormat;", "", "value", "", "isTransparent", "", "(Ljava/lang/String;ILjava/lang/String;Z)V", "()Z", "getValue", "()Ljava/lang/String;", "TRANSPARENT_INTERSTITIAL", "OMNI_BREAKOUT", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public enum AdmCreativeFormat {
    TRANSPARENT_INTERSTITIAL("instl_transparent", true),
    OMNI_BREAKOUT("omni_breakout", true);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isTransparent;

    @NotNull
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/network/model/AdmCreativeFormat$Companion;", "", "()V", "fromValue", "Lcom/mobilefuse/sdk/network/model/AdmCreativeFormat;", "value", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final AdmCreativeFormat fromValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            for (AdmCreativeFormat admCreativeFormat : AdmCreativeFormat.values()) {
                if (Intrinsics.areEqual(admCreativeFormat.getValue(), value)) {
                    return admCreativeFormat;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    AdmCreativeFormat(String str, boolean z10) {
        this.value = str;
        this.isTransparent = z10;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: isTransparent, reason: from getter */
    public final boolean getIsTransparent() {
        return this.isTransparent;
    }
}
