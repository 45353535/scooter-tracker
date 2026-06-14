package com.yandex.div.storage.database;

import android.database.Cursor;
import com.yandex.div.internal.util.IOUtils;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/storage/database/ReadState;", "Ljava/io/Closeable;", "Lkotlin/Function0;", "", "onCloseState", "Lkf/a;", "Landroid/database/Cursor;", "cursorProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkf/a;)V", "close", "()V", "Lkotlin/jvm/functions/Function0;", "Lkf/a;", "_cursor", "Landroid/database/Cursor;", "getCursor", "()Landroid/database/Cursor;", "cursor", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReadState implements Closeable, AutoCloseable {

    @Nullable
    private Cursor _cursor;

    @NotNull
    private final kf.a cursorProvider;

    @NotNull
    private final Function0<Unit> onCloseState;

    public ReadState(@NotNull Function0<Unit> function0, @NotNull kf.a aVar) {
        this.onCloseState = function0;
        this.cursorProvider = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.closeCursorSilently(this._cursor);
        this.onCloseState.invoke();
    }

    @NotNull
    public final Cursor getCursor() {
        if (this._cursor != null) {
            throw new RuntimeException("Cursor should be called only once");
        }
        Cursor cursor = (Cursor) this.cursorProvider.get();
        this._cursor = cursor;
        return cursor;
    }

    public /* synthetic */ ReadState(Function0 function0, kf.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0<Unit>() { // from class: com.yandex.div.storage.database.ReadState.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }
        } : function0, aVar);
    }
}
