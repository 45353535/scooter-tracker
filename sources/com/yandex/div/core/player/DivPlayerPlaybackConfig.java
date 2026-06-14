package com.yandex.div.core.player;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0004\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerPlaybackConfig;", "", "", "autoplay", "isMuted", "repeatable", "Lorg/json/JSONObject;", "payload", "<init>", "(ZZZLorg/json/JSONObject;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAutoplay", "()Z", "getRepeatable", "Lorg/json/JSONObject;", "getPayload", "()Lorg/json/JSONObject;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DivPlayerPlaybackConfig {
    private final boolean autoplay;
    private final boolean isMuted;

    @Nullable
    private final JSONObject payload;
    private final boolean repeatable;

    public DivPlayerPlaybackConfig(boolean z10, boolean z11, boolean z12, @Nullable JSONObject jSONObject) {
        this.autoplay = z10;
        this.isMuted = z11;
        this.repeatable = z12;
        this.payload = jSONObject;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivPlayerPlaybackConfig)) {
            return false;
        }
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = (DivPlayerPlaybackConfig) other;
        return this.autoplay == divPlayerPlaybackConfig.autoplay && this.isMuted == divPlayerPlaybackConfig.isMuted && this.repeatable == divPlayerPlaybackConfig.repeatable && Intrinsics.areEqual(this.payload, divPlayerPlaybackConfig.payload);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.autoplay;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.isMuted;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (i10 + r22) * 31;
        boolean z12 = this.repeatable;
        int i12 = (i11 + (z12 ? 1 : z12)) * 31;
        JSONObject jSONObject = this.payload;
        return i12 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "DivPlayerPlaybackConfig(autoplay=" + this.autoplay + ", isMuted=" + this.isMuted + ", repeatable=" + this.repeatable + ", payload=" + this.payload + ')';
    }
}
