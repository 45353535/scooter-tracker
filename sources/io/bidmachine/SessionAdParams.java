package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public final class SessionAdParams extends zb.g {
    private Integer sessionDuration;

    void clear() {
        this.sessionDuration = null;
    }

    void fillUserExtension(@NonNull Struct.Builder builder) {
        if (this.sessionDuration != null) {
            builder.putFields("sessionduration", Value.newBuilder().setNumberValue(this.sessionDuration.intValue()).build());
        }
    }

    @Nullable
    Integer getSessionDuration() {
        return this.sessionDuration;
    }

    @Override // zb.g
    public void merge(@NonNull SessionAdParams sessionAdParams) {
        this.sessionDuration = (Integer) io.bidmachine.core.h.W(this.sessionDuration, sessionAdParams.sessionDuration);
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: setClickRate, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m7758setClickRate(@Nullable Float f10) {
        io.bidmachine.core.a.o("The method setClickRate is no longer supported and has no effect.");
        return this;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: setCompletionRate, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m7759setCompletionRate(@Nullable Float f10) {
        io.bidmachine.core.a.o("The method setCompletionRate is no longer supported and has no effect.");
        return this;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: setImpressionCount, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m7760setImpressionCount(@Nullable Integer num) {
        io.bidmachine.core.a.o("The method setImpressionCount is no longer supported and has no effect.");
        return this;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: setIsUserClickedOnLastAd, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m7761setIsUserClickedOnLastAd(@Nullable Boolean bool) {
        io.bidmachine.core.a.o("The method setIsUserClickedOnLastAd is no longer supported and has no effect.");
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: setSessionDuration, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m7762setSessionDuration(@Nullable Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.sessionDuration = num;
            return this;
        }
        io.bidmachine.core.a.g("session duration shouldn't be negative");
        return this;
    }
}
