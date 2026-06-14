package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.f.y;
import j.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/room/paging/CursorSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "cursor", "Landroid/database/Cursor;", "<init>", "(Landroid/database/Cursor;)V", "getBlob", "", FirebaseAnalytics.Param.INDEX, "", "getDouble", "", "getLong", "", "getText", "", "isNull", "", "getColumnCount", "getColumnName", "getColumnType", "step", "reset", "", "close", "bindBlob", "", "value", "bindDouble", "bindLong", "bindText", "bindNull", "clearBindings", y.f66058y, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CursorSQLiteStatement implements SQLiteStatement, AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Cursor cursor;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"Landroidx/room/paging/CursorSQLiteStatement$Companion;", "", "<init>", "()V", "getDataType", "", "Landroid/database/Cursor;", FirebaseAnalytics.Param.INDEX, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getDataType(Cursor cursor, int i10) {
            int type = cursor.getType(i10);
            int type2 = cursor.getType(i10);
            if (type2 == 0) {
                return 5;
            }
            int i11 = 1;
            if (type2 != 1) {
                i11 = 2;
                if (type2 != 2) {
                    i11 = 3;
                    if (type2 != 3) {
                        if (type2 == 4) {
                            return 4;
                        }
                        throw new IllegalStateException(("Unknown field type: " + type).toString());
                    }
                }
            }
            return i11;
        }

        private Companion() {
        }
    }

    public CursorSQLiteStatement(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        this.cursor = cursor;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindBoolean(int i10, boolean z10) {
        c.a(this, i10, z10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindFloat(int i10, float f10) {
        c.b(this, i10, f10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindInt(int i10, int i11) {
        c.c(this, i10, i11);
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.cursor.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    public byte[] getBlob(int index) {
        byte[] blob = this.cursor.getBlob(index);
        Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
        return blob;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ boolean getBoolean(int i10) {
        return c.d(this, i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.cursor.getColumnCount();
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    public String getColumnName(int index) {
        String columnName = this.cursor.getColumnName(index);
        Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ List getColumnNames() {
        return c.e(this);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int index) {
        return INSTANCE.getDataType(this.cursor, index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int index) {
        return this.cursor.getDouble(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ float getFloat(int i10) {
        return c.f(this, i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ int getInt(int i10) {
        return c.g(this, i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int index) {
        return this.cursor.getLong(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    public String getText(int index) {
        String string = this.cursor.getString(index);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int index) {
        return this.cursor.isNull(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.cursor.moveToPosition(-1);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.cursor.moveToNext();
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    /* JADX INFO: renamed from: bindBlob, reason: merged with bridge method [inline-methods] */
    public Void mo4249bindBlob(int index, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    /* JADX INFO: renamed from: bindDouble, reason: merged with bridge method [inline-methods] */
    public Void mo4250bindDouble(int index, double value) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    /* JADX INFO: renamed from: bindLong, reason: merged with bridge method [inline-methods] */
    public Void mo4251bindLong(int index, long value) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    /* JADX INFO: renamed from: bindNull, reason: merged with bridge method [inline-methods] */
    public Void mo4252bindNull(int index) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    /* JADX INFO: renamed from: bindText, reason: merged with bridge method [inline-methods] */
    public Void mo4253bindText(int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @NotNull
    /* JADX INFO: renamed from: clearBindings, reason: merged with bridge method [inline-methods] */
    public Void mo4254clearBindings() {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }
}
