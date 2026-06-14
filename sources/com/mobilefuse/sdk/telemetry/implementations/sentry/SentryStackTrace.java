package com.mobilefuse.sdk.telemetry.implementations.sentry;

import com.mbridge.msdk.foundation.entity.b;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackTrace;", "", b.JSON_KEY_FRAME_ADS, "", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackFrame;", "(Ljava/util/List;)V", "getFrames", "()Ljava/util/List;", "component1", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class SentryStackTrace {

    @NotNull
    private final List<SentryStackFrame> frames;

    public SentryStackTrace(@NotNull List<SentryStackFrame> frames) {
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.frames = frames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SentryStackTrace copy$default(SentryStackTrace sentryStackTrace, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sentryStackTrace.frames;
        }
        return sentryStackTrace.copy(list);
    }

    @NotNull
    public final List<SentryStackFrame> component1() {
        return this.frames;
    }

    @NotNull
    public final SentryStackTrace copy(@NotNull List<SentryStackFrame> frames) {
        Intrinsics.checkNotNullParameter(frames, "frames");
        return new SentryStackTrace(frames);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof SentryStackTrace) && Intrinsics.areEqual(this.frames, ((SentryStackTrace) other).frames);
        }
        return true;
    }

    @NotNull
    public final List<SentryStackFrame> getFrames() {
        return this.frames;
    }

    public int hashCode() {
        List<SentryStackFrame> list = this.frames;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "SentryStackTrace(frames=" + this.frames + ")";
    }
}
