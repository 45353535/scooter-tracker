package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BANNER", "VIDEO", MobileFuseNativeAdKt.AD_TYPE, "STORYBOARD", "OVERLAY", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public enum AdmMediaType {
    BANNER("banner"),
    VIDEO("video"),
    NATIVE("native"),
    STORYBOARD("storyboard"),
    OVERLAY("overlay");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/network/model/AdmMediaType$Companion;", "", "()V", "fromValue", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "value", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final AdmMediaType fromValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            for (AdmMediaType admMediaType : AdmMediaType.values()) {
                if (Intrinsics.areEqual(admMediaType.getValue(), value)) {
                    return admMediaType;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    AdmMediaType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
