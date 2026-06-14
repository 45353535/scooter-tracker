package androidx.room.support;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.room.DelegatingOpenHelper;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.D5;
import com.taurusx.tax.f.y;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001d\u001e\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u0014\u0010\u0003\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "delegate", "autoCloser", "Landroidx/room/support/AutoCloser;", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/support/AutoCloser;)V", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getAutoCloser$room_runtime", "()Landroidx/room/support/AutoCloser;", "autoClosingDb", "Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "writableDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "readableDatabase", "getReadableDatabase", "close", "", "setWriteAheadLoggingEnabled", "enabled", "", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "AutoClosingSupportSQLiteDatabase", "KeepAliveCursor", "AutoClosingSupportSQLiteStatement", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper, AutoCloseable {

    @NotNull
    private final AutoCloser autoCloser;

    @NotNull
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;

    @NotNull
    private final SupportSQLiteOpenHelper delegate;

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010*\u001a\u00020\u000bH\u0016J'\u0010*\u001a\u00020+2\u0006\u0010*\u001a\u00020\u000b2\u0010\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010.0-H\u0016¢\u0006\u0002\u0010/J\u0010\u0010*\u001a\u00020+2\u0006\u0010*\u001a\u000200H\u0016J\u001a\u0010*\u001a\u00020+2\u0006\u0010*\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0017J \u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u000207H\u0016J3\u00108\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u000b2\u0012\u0010:\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010.\u0018\u00010-H\u0016¢\u0006\u0002\u0010;JC\u0010<\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u000b2\u0012\u0010:\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010.\u0018\u00010-H\u0016¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J'\u0010>\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010.0-H\u0016¢\u0006\u0002\u0010?J\u0010\u0010B\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u001cH\u0016J\u0010\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u001cH\u0016J\u0010\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0015H\u0016J\b\u0010N\u001a\u00020\u0015H\u0016J\b\u0010O\u001a\u00020\u0007H\u0016J\b\u0010W\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R$\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010#\"\u0004\b(\u0010)R\u0014\u0010@\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0017R\u0014\u0010A\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0017R\u0016\u0010D\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010P\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0017R(\u0010Q\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0S\u0018\u00010R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0017¨\u0006X"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "autoCloser", "Landroidx/room/support/AutoCloser;", "<init>", "(Landroidx/room/support/AutoCloser;)V", "pokeOpen", "", "compileStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "", "beginTransaction", "beginTransactionNonExclusive", "beginTransactionWithListener", "transactionListener", "Landroid/database/sqlite/SQLiteTransactionListener;", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "inTransaction", "", "isDbLockedByCurrentThread", "()Z", "yieldIfContendedSafely", "sleepAfterYieldDelayMillis", "", "version", "", "getVersion", "()I", "setVersion", "(I)V", "maximumSize", "getMaximumSize", "()J", "setMaximumSize", "numBytes", "pageSize", "getPageSize", "setPageSize", "(J)V", "query", "Landroid/database/Cursor;", "bindArgs", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "cancellationSignal", "Landroid/os/CancellationSignal;", "insert", D5.Q, "conflictAlgorithm", "values", "Landroid/content/ContentValues;", "delete", "whereClause", "whereArgs", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "isReadOnly", "isOpen", "needUpgrade", "newVersion", "path", "getPath", "()Ljava/lang/String;", "setLocale", CommonUrlParts.LOCALE, "Ljava/util/Locale;", "setMaxSqlCacheSize", "cacheSize", "setForeignKeyConstraintsEnabled", "enabled", "enableWriteAheadLogging", "disableWriteAheadLogging", "isWriteAheadLoggingEnabled", "attachedDbs", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "isDatabaseIntegrityOk", "close", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase, AutoCloseable {

        @NotNull
        private final AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(@NotNull AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _set_pageSize_$lambda$3(long j10, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.setPageSize(j10);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _set_version_$lambda$1(int i10, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.setVersion(i10);
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int delete$lambda$5(String str, String str2, Object[] objArr, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            return db2.delete(str, str2, objArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit execSQL$lambda$7(String str, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.execSQL(str);
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit execSQL$lambda$8(String str, Object[] objArr, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.execSQL(str, objArr);
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long insert$lambda$4(String str, int i10, ContentValues contentValues, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            return db2.insert(str, i10, contentValues);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean needUpgrade$lambda$9(int i10, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            return db2.needUpgrade(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object pokeOpen$lambda$0(SupportSQLiteDatabase it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setForeignKeyConstraintsEnabled$lambda$12(boolean z10, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.setForeignKeyConstraintsEnabled(z10);
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setLocale$lambda$10(Locale locale, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.setLocale(locale);
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setMaxSqlCacheSize$lambda$11(int i10, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.setMaxSqlCacheSize(i10);
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long setMaximumSize$lambda$2(long j10, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            return db2.setMaximumSize(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int update$lambda$6(String str, int i10, ContentValues contentValues, String str2, Object[] objArr, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            return db2.update(str, i10, contentValues, str2, objArr);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th2) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th2) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ void beginTransactionReadOnly() {
            k.a.a(this);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListener(@NotNull SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (Throwable th2) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (Throwable th2) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ void beginTransactionWithListenerReadOnly(SQLiteTransactionListener sQLiteTransactionListener) {
            k.a.b(this, sQLiteTransactionListener);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.autoCloser.closeDatabaseIfOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public SupportSQLiteStatement compileStatement(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new AutoClosingSupportSQLiteStatement(sql, this.autoCloser);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(@NotNull final String table, @Nullable final String whereClause, @Nullable final Object[] whereArgs) {
            Intrinsics.checkNotNullParameter(table, "table");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.delete$lambda$5(table, whereClause, whereArgs, (SupportSQLiteDatabase) obj));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            try {
                SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
                Intrinsics.checkNotNull(delegateDatabase);
                delegateDatabase.endTransaction();
            } finally {
                this.autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ void execPerConnectionSQL(String str, Object[] objArr) {
            k.a.c(this, str, objArr);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@NotNull final String sql) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.execSQL$lambda$7(sql, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @Nullable
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.autoCloser.executeRefCountingFunction(new n0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SupportSQLiteDatabase) obj).getAttachedDbs();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new n0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new g0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.g0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.g0, kotlin.reflect.KMutableProperty1
                public void set(Object obj, Object obj2) {
                    ((SupportSQLiteDatabase) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @Nullable
        public String getPath() {
            return (String) this.autoCloser.executeRefCountingFunction(new n0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SupportSQLiteDatabase) obj).getPath();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new g0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.g0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.g0, kotlin.reflect.KMutableProperty1
                public void set(Object obj, Object obj2) {
                    ((SupportSQLiteDatabase) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(@NotNull final String table, final int conflictAlgorithm, @NotNull final ContentValues values) throws SQLException {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.insert$lambda$4(table, conflictAlgorithm, values, (SupportSQLiteDatabase) obj));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new n0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new n0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return k.a.d(this);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            return this.autoCloser.isActive();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new n0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new n0() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(final int newVersion) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.needUpgrade$lambda$9(newVersion, (SupportSQLiteDatabase) obj));
                }
            })).booleanValue();
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen$lambda$0((SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setForeignKeyConstraintsEnabled(final boolean enabled) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setForeignKeyConstraintsEnabled$lambda$12(enabled, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(@NotNull final Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setLocale$lambda$10(locale, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(final int cacheSize) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaxSqlCacheSize$lambda$11(cacheSize, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(final long numBytes) {
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaximumSize$lambda$2(numBytes, (SupportSQLiteDatabase) obj));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(final long j10) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_pageSize_$lambda$3(j10, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
            Intrinsics.checkNotNull(delegateDatabase);
            delegateDatabase.setTransactionSuccessful();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(final int i10) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_version_$lambda$1(i10, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(@NotNull final String table, final int conflictAlgorithm, @NotNull final ContentValues values, @Nullable final String whereClause, @Nullable final Object[] whereArgs) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.update$lambda$6(table, conflictAlgorithm, values, whereClause, whereArgs, (SupportSQLiteDatabase) obj));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@NotNull final String sql, @NotNull final Object[] bindArgs) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.execSQL$lambda$8(sql, bindArgs, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull String query, @NotNull Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull SupportSQLiteQuery query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 24)
        @NotNull
        public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th2) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0016J'\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u001e0 H\u0002¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0018H\u0016J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0018\u0010&\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0003H\u0016J\u0018\u0010)\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0012H\u0016J\b\u0010*\u001a\u00020\u0015H\u0016J\u0018\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0002J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u00061"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "", "autoCloser", "Landroidx/room/support/AutoCloser;", "<init>", "(Ljava/lang/String;Landroidx/room/support/AutoCloser;)V", "bindingTypes", "", "longBindings", "", "doubleBindings", "", "stringBindings", "", "[Ljava/lang/String;", "blobBindings", "", "[[B", "close", "", "execute", "executeUpdateDelete", "", "executeInsert", "", "simpleQueryForLong", "simpleQueryForString", "executeWithRefCount", "T", "block", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "bindNull", FirebaseAnalytics.Param.INDEX, "bindLong", "value", "bindDouble", "", "bindString", "bindBlob", "clearBindings", "ensureCapacity", "columnType", "bindTo", "query", "Landroidx/sqlite/db/SupportSQLiteProgram;", y.f66058y, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class AutoClosingSupportSQLiteStatement implements SupportSQLiteStatement, AutoCloseable {
        private static final int COLUMN_TYPE_BLOB = 4;
        private static final int COLUMN_TYPE_DOUBLE = 2;
        private static final int COLUMN_TYPE_LONG = 1;
        private static final int COLUMN_TYPE_NULL = 5;
        private static final int COLUMN_TYPE_STRING = 3;

        @NotNull
        private final AutoCloser autoCloser;

        @NotNull
        private int[] bindingTypes;

        @NotNull
        private byte[][] blobBindings;

        @NotNull
        private double[] doubleBindings;

        @NotNull
        private long[] longBindings;

        @NotNull
        private final String sql;

        @NotNull
        private String[] stringBindings;

        public AutoClosingSupportSQLiteStatement(@NotNull String sql, @NotNull AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void bindTo(SupportSQLiteProgram query) {
            int length = this.bindingTypes.length;
            for (int i10 = 1; i10 < length; i10++) {
                int i11 = this.bindingTypes[i10];
                if (i11 == 1) {
                    query.bindLong(i10, this.longBindings[i10]);
                } else if (i11 == 2) {
                    query.bindDouble(i10, this.doubleBindings[i10]);
                } else if (i11 == 3) {
                    String str = this.stringBindings[i10];
                    Intrinsics.checkNotNull(str);
                    query.bindString(i10, str);
                } else if (i11 == 4) {
                    byte[] bArr = this.blobBindings[i10];
                    Intrinsics.checkNotNull(bArr);
                    query.bindBlob(i10, bArr);
                } else if (i11 == 5) {
                    query.bindNull(i10);
                }
            }
        }

        private final void ensureCapacity(int columnType, int index) {
            int i10 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i10) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i10) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
                    Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i10) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
                    Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i10) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i10);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i10) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i10);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit execute$lambda$0(SupportSQLiteStatement statement) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            statement.execute();
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long executeInsert$lambda$2(SupportSQLiteStatement obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.executeInsert();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int executeUpdateDelete$lambda$1(SupportSQLiteStatement obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.executeUpdateDelete();
        }

        private final <T> T executeWithRefCount(final Function1<? super SupportSQLiteStatement, ? extends T> block) {
            return (T) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeWithRefCount$lambda$5(this.f5436b, block, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object executeWithRefCount$lambda$5(AutoClosingSupportSQLiteStatement autoClosingSupportSQLiteStatement, Function1 function1, SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = db2.compileStatement(autoClosingSupportSQLiteStatement.sql);
            autoClosingSupportSQLiteStatement.bindTo(supportSQLiteStatementCompileStatement);
            return function1.invoke(supportSQLiteStatementCompileStatement);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long simpleQueryForLong$lambda$3(SupportSQLiteStatement obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.simpleQueryForLong();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String simpleQueryForString$lambda$4(SupportSQLiteStatement obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.simpleQueryForString();
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindBlob(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ensureCapacity(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindDouble(int index, double value) {
            ensureCapacity(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindLong(int index, long value) {
            ensureCapacity(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindNull(int index) {
            ensureCapacity(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindString(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ensureCapacity(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void clearBindings() {
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            clearBindings();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public void execute() {
            executeWithRefCount(new Function1() { // from class: androidx.room.support.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.execute$lambda$0((SupportSQLiteStatement) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long executeInsert() {
            return ((Number) executeWithRefCount(new Function1() { // from class: androidx.room.support.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeInsert$lambda$2((SupportSQLiteStatement) obj));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((Number) executeWithRefCount(new Function1() { // from class: androidx.room.support.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeUpdateDelete$lambda$1((SupportSQLiteStatement) obj));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((Number) executeWithRefCount(new Function1() { // from class: androidx.room.support.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.simpleQueryForLong$lambda$3((SupportSQLiteStatement) obj));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        @Nullable
        public String simpleQueryForString() {
            return (String) executeWithRefCount(new Function1() { // from class: androidx.room.support.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.simpleQueryForString$lambda$4((SupportSQLiteStatement) obj);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J!\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rH\u0096\u0001J\t\u0010\u000f\u001a\u00020\bH\u0097\u0001J\u0019\u0010\u0010\u001a\n \u000e*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\t\u0010\u0012\u001a\u00020\u000bH\u0096\u0001J\u0019\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010\u00140\u0014H\u0096\u0001J\u0019\u0010\u0015\u001a\u00020\u000b2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010\u00140\u0014H\u0096\u0001J\u0019\u0010\u0016\u001a\n \u000e*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J4\u0010\u0017\u001a(\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00140\u0014 \u000e*\u0014\u0012\u000e\b\u0001\u0012\n \u000e*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00180\u0018H\u0096\u0001¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010\u001d\u001a\n \u000e*\u0004\u0018\u00010\u001e0\u001eH\u0096\u0001J\u0011\u0010\u001f\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010!\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010\"\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010$\u001a\n \u000e*\u0004\u0018\u00010%0%H\u0096\u0001J\t\u0010&\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010'\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0019\u0010)\u001a\n \u000e*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0011\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\t\u0010+\u001a\u00020,H\u0096\u0001J\t\u0010-\u001a\u00020,H\u0096\u0001J\t\u0010.\u001a\u00020,H\u0096\u0001J\t\u0010/\u001a\u00020,H\u0096\u0001J\t\u00100\u001a\u00020,H\u0096\u0001J\t\u00101\u001a\u00020,H\u0096\u0001J\u0011\u00102\u001a\u00020,2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0011\u00103\u001a\u00020,2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\t\u00104\u001a\u00020,H\u0096\u0001J\t\u00105\u001a\u00020,H\u0096\u0001J\t\u00106\u001a\u00020,H\u0096\u0001J\u0011\u00107\u001a\u00020,2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\t\u00108\u001a\u00020,H\u0096\u0001J\u0019\u00109\u001a\u00020\b2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010:0:H\u0096\u0001J\u0019\u0010;\u001a\u00020\b2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010<0<H\u0096\u0001J\t\u0010=\u001a\u00020,H\u0097\u0001J!\u0010>\u001a\n \u000e*\u0004\u0018\u00010\u001e0\u001e2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010\u001e0\u001eH\u0096\u0001J\u0019\u0010?\u001a\u00020\b2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010\u001e0\u001eH\u0096\u0001J)\u0010@\u001a\u00020\b2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010A0A2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010%0%H\u0096\u0001J\u0019\u0010B\u001a\u00020\b2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010:0:H\u0096\u0001J\u0019\u0010C\u001a\u00020\b2\u000e\u0010\n\u001a\n \u000e*\u0004\u0018\u00010<0<H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "delegate", "autoCloser", "Landroidx/room/support/AutoCloser;", "<init>", "(Landroid/database/Cursor;Landroidx/room/support/AutoCloser;)V", "close", "", "copyStringToBuffer", "p0", "", "p1", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "deactivate", "getBlob", "", "getColumnCount", "getColumnIndex", "", "getColumnIndexOrThrow", "getColumnName", "getColumnNames", "", "()[Ljava/lang/String;", "getCount", "getDouble", "", "getExtras", "Landroid/os/Bundle;", "getFloat", "", "getInt", "getLong", "", "getNotificationUri", "Landroid/net/Uri;", "getPosition", "getShort", "", "getString", "getType", "getWantsAllOnMoveCalls", "", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "registerContentObserver", "Landroid/database/ContentObserver;", "registerDataSetObserver", "Landroid/database/DataSetObserver;", "requery", "respond", "setExtras", "setNotificationUri", "Landroid/content/ContentResolver;", "unregisterContentObserver", "unregisterDataSetObserver", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class KeepAliveCursor implements Cursor, AutoCloseable {

        @NotNull
        private final AutoCloser autoCloser;

        @NotNull
        private final Cursor delegate;

        public KeepAliveCursor(@NotNull Cursor delegate, @NotNull AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p02, CharArrayBuffer p12) {
            this.delegate.copyStringToBuffer(p02, p12);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p02) {
            return this.delegate.getBlob(p02);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p02) {
            return this.delegate.getColumnIndex(p02);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p02) {
            return this.delegate.getColumnIndexOrThrow(p02);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p02) {
            return this.delegate.getColumnName(p02);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p02) {
            return this.delegate.getDouble(p02);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p02) {
            return this.delegate.getFloat(p02);
        }

        @Override // android.database.Cursor
        public int getInt(int p02) {
            return this.delegate.getInt(p02);
        }

        @Override // android.database.Cursor
        public long getLong(int p02) {
            return this.delegate.getLong(p02);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return this.delegate.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p02) {
            return this.delegate.getShort(p02);
        }

        @Override // android.database.Cursor
        public String getString(int p02) {
            return this.delegate.getString(p02);
        }

        @Override // android.database.Cursor
        public int getType(int p02) {
            return this.delegate.getType(p02);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p02) {
            return this.delegate.isNull(p02);
        }

        @Override // android.database.Cursor
        public boolean move(int p02) {
            return this.delegate.move(p02);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p02) {
            return this.delegate.moveToPosition(p02);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p02) {
            this.delegate.registerContentObserver(p02);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p02) {
            this.delegate.registerDataSetObserver(p02);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p02) {
            return this.delegate.respond(p02);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle p02) {
            this.delegate.setExtras(p02);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p02, Uri p12) {
            this.delegate.setNotificationUri(p02, p12);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p02) {
            this.delegate.unregisterContentObserver(p02);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p02) {
            this.delegate.unregisterDataSetObserver(p02);
        }
    }

    public AutoClosingRoomOpenHelper(@NotNull SupportSQLiteOpenHelper delegate, @NotNull AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
        autoCloser.initOpenHelper(getDelegate());
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.autoClosingDb.close();
    }

    @NotNull
    /* JADX INFO: renamed from: getAutoCloser$room_runtime, reason: from getter */
    public final AutoCloser getAutoCloser() {
        return this.autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NotNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }
}
