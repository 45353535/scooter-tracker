package yads;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class dc0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cursor f109874a;

    public dc0(Cursor cursor) {
        this.f109874a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f109874a.close();
    }
}
