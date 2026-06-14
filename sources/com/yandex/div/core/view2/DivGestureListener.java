package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/DivGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "awaitLongClick", "", "(Z)V", "onDoubleTapListener", "Lkotlin/Function0;", "", "getOnDoubleTapListener", "()Lkotlin/jvm/functions/Function0;", "setOnDoubleTapListener", "(Lkotlin/jvm/functions/Function0;)V", "onSingleTapListener", "getOnSingleTapListener", "setOnSingleTapListener", "onDoubleTap", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroid/view/MotionEvent;", "onDown", "onSingleTapConfirmed", "onSingleTapUp", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {
    private final boolean awaitLongClick;

    @Nullable
    private Function0<Unit> onDoubleTapListener;

    @Nullable
    private Function0<Unit> onSingleTapListener;

    public DivGestureListener(boolean z10) {
        this.awaitLongClick = z10;
    }

    @Nullable
    public final Function0<Unit> getOnDoubleTapListener() {
        return this.onDoubleTapListener;
    }

    @Nullable
    public final Function0<Unit> getOnSingleTapListener() {
        return this.onSingleTapListener;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent e10) {
        Function0<Unit> function0 = this.onDoubleTapListener;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent e10) {
        if (this.awaitLongClick) {
            return false;
        }
        return (this.onDoubleTapListener == null && this.onSingleTapListener == null) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@NotNull MotionEvent e10) {
        Function0<Unit> function0;
        if (this.onDoubleTapListener == null || (function0 = this.onSingleTapListener) == null) {
            return false;
        }
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull MotionEvent e10) {
        Function0<Unit> function0;
        if (this.onDoubleTapListener != null || (function0 = this.onSingleTapListener) == null) {
            return false;
        }
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    public final void setOnDoubleTapListener(@Nullable Function0<Unit> function0) {
        this.onDoubleTapListener = function0;
    }

    public final void setOnSingleTapListener(@Nullable Function0<Unit> function0) {
        this.onSingleTapListener = function0;
    }
}
