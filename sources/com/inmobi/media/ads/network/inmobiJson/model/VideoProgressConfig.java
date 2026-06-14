package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/VideoProgressConfig;", "", "<init>", "()V", "showProgress", "", "getShowProgress", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "value", "", "color", "getColor", "()[I", "", "height", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoProgressConfig {

    @Nullable
    private int[] color;

    @Nullable
    private Integer height;

    @Nullable
    private final Boolean showProgress;

    @Nullable
    public final int[] getColor() {
        return this.color;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Boolean getShowProgress() {
        return this.showProgress;
    }
}
