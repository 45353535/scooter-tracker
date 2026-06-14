package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/inmobi/media/videoPlayer/model/VideoViewPosition;", "", "<init>", "()V", "x", "", "getX", "()I", "setX", "(I)V", "y", "getY", "setY", "width", "getWidth", "setWidth", "height", "getHeight", "setHeight", "orientation", "", "getOrientation", "()Ljava/lang/String;", "setOrientation", "(Ljava/lang/String;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoViewPosition {
    private int height;

    @Nullable
    private String orientation;
    private int width;
    private int x;
    private int y;

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getOrientation() {
        return this.orientation;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setOrientation(@Nullable String str) {
        this.orientation = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public final void setX(int i10) {
        this.x = i10;
    }

    public final void setY(int i10) {
        this.y = i10;
    }
}
