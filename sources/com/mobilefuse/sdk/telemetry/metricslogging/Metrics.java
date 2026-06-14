package com.mobilefuse.sdk.telemetry.metricslogging;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/Metrics;", "", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class Metrics {

    @NotNull
    private final String message;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Metrics LOAD_TO_READY = new Metrics("sdk:load_to_loaded_seconds_stat");

    @NotNull
    private static final Metrics SHOW_TO_RENDERED = new Metrics("sdk:show_to_rendered_seconds_stat");

    @NotNull
    private static final Metrics PLAYER_CREATED_TO_RENDER = new Metrics("sdk:player_created_to_loaded_seconds_stat");

    @NotNull
    private static final Metrics ADVERTISING_ID_REQUESTED_TO_FAILED = new Metrics("sdk:advertising_id_requested_to_failed_stat");

    @NotNull
    private static final Metrics BIDDING_TOKEN_GENERATED_WITH_JIT = new Metrics("sdk:get_bidding_token_seconds_stat");

    @NotNull
    private static final Metrics BIDDING_TOKEN_GENERATED = new Metrics("sdk:bidding_token_generated_seconds_stat");

    @NotNull
    private static final String VIDEO_STREAM_ENABLED_METRIC = "stream_video";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/Metrics$Companion;", "", "()V", "ADVERTISING_ID_REQUESTED_TO_FAILED", "Lcom/mobilefuse/sdk/telemetry/metricslogging/Metrics;", "getADVERTISING_ID_REQUESTED_TO_FAILED", "()Lcom/mobilefuse/sdk/telemetry/metricslogging/Metrics;", "BIDDING_TOKEN_GENERATED", "getBIDDING_TOKEN_GENERATED", "BIDDING_TOKEN_GENERATED_WITH_JIT", "getBIDDING_TOKEN_GENERATED_WITH_JIT", "LOAD_TO_READY", "getLOAD_TO_READY", "PLAYER_CREATED_TO_RENDER", "getPLAYER_CREATED_TO_RENDER", "SHOW_TO_RENDERED", "getSHOW_TO_RENDERED", "VIDEO_STREAM_ENABLED_METRIC", "", "getVIDEO_STREAM_ENABLED_METRIC", "()Ljava/lang/String;", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Metrics getADVERTISING_ID_REQUESTED_TO_FAILED() {
            return Metrics.ADVERTISING_ID_REQUESTED_TO_FAILED;
        }

        @NotNull
        public final Metrics getBIDDING_TOKEN_GENERATED() {
            return Metrics.BIDDING_TOKEN_GENERATED;
        }

        @NotNull
        public final Metrics getBIDDING_TOKEN_GENERATED_WITH_JIT() {
            return Metrics.BIDDING_TOKEN_GENERATED_WITH_JIT;
        }

        @NotNull
        public final Metrics getLOAD_TO_READY() {
            return Metrics.LOAD_TO_READY;
        }

        @NotNull
        public final Metrics getPLAYER_CREATED_TO_RENDER() {
            return Metrics.PLAYER_CREATED_TO_RENDER;
        }

        @NotNull
        public final Metrics getSHOW_TO_RENDERED() {
            return Metrics.SHOW_TO_RENDERED;
        }

        @NotNull
        public final String getVIDEO_STREAM_ENABLED_METRIC() {
            return Metrics.VIDEO_STREAM_ENABLED_METRIC;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Metrics(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public static /* synthetic */ Metrics copy$default(Metrics metrics, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metrics.message;
        }
        return metrics.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Metrics copy(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new Metrics(message);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof Metrics) && Intrinsics.areEqual(this.message, ((Metrics) other).message);
        }
        return true;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "Metrics(message=" + this.message + ")";
    }
}
