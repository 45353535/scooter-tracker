package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "body", "transaction", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(@NotNull SQLiteDatabase sQLiteDatabase, boolean z10, @NotNull Function1<? super SQLiteDatabase, ? extends T> function1) {
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
            z.b(1);
            sQLiteDatabase.endTransaction();
            z.a(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            z.b(1);
            sQLiteDatabase.endTransaction();
            z.a(1);
        }
    }
}
