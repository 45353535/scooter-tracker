package com.yandex.div.core.util;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/util/SearchRoute;", "T", "", "item", "(Ljava/lang/Object;)V", "enterLeaveBalance", "", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "movedDistance", "distance", "onEnter", "", "onLeave", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SearchRoute<T> {
    private int enterLeaveBalance;

    @Nullable
    private final T item;
    private int movedDistance;

    public SearchRoute(@Nullable T t10) {
        this.item = t10;
    }

    /* JADX INFO: renamed from: distance, reason: from getter */
    public final int getMovedDistance() {
        return this.movedDistance;
    }

    @Nullable
    public final T getItem() {
        return this.item;
    }

    public final void onEnter() {
        this.enterLeaveBalance++;
        this.movedDistance++;
    }

    public final void onLeave() {
        int i10 = this.enterLeaveBalance;
        if (i10 <= 0) {
            this.movedDistance++;
        } else {
            this.enterLeaveBalance = i10 - 1;
            this.movedDistance--;
        }
    }
}
