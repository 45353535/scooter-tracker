package com.yandex.div.core.state;

import com.yandex.div.core.state.DivViewState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/state/PagerState;", "Lcom/yandex/div/core/state/DivViewState$BlockState;", "", "currentPageIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCurrentPageIndex", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PagerState implements DivViewState.BlockState {
    private final int currentPageIndex;

    public PagerState(int i10) {
        this.currentPageIndex = i10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PagerState) && this.currentPageIndex == ((PagerState) other).currentPageIndex;
    }

    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    public int hashCode() {
        return this.currentPageIndex;
    }

    @NotNull
    public String toString() {
        return "PagerState(currentPageIndex=" + this.currentPageIndex + ')';
    }
}
