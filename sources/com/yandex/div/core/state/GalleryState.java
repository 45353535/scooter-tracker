package com.yandex.div.core.state;

import com.yandex.div.core.state.DivViewState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/state/GalleryState;", "Lcom/yandex/div/core/state/DivViewState$BlockState;", "", "visibleItemIndex", "scrollOffset", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVisibleItemIndex", "getScrollOffset", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GalleryState implements DivViewState.BlockState {
    private final int scrollOffset;
    private final int visibleItemIndex;

    public GalleryState(int i10, int i11) {
        this.visibleItemIndex = i10;
        this.scrollOffset = i11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryState)) {
            return false;
        }
        GalleryState galleryState = (GalleryState) other;
        return this.visibleItemIndex == galleryState.visibleItemIndex && this.scrollOffset == galleryState.scrollOffset;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getVisibleItemIndex() {
        return this.visibleItemIndex;
    }

    public int hashCode() {
        return (this.visibleItemIndex * 31) + this.scrollOffset;
    }

    @NotNull
    public String toString() {
        return "GalleryState(visibleItemIndex=" + this.visibleItemIndex + ", scrollOffset=" + this.scrollOffset + ')';
    }
}
