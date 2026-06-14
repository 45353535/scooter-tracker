package com.appsflyer.internal.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u0014"}, d2 = {"Lcom/appsflyer/internal/db/PurchaseDatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getPurchasedTokens", "", "", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onOpen", "onUpgrade", "oldVersion", "", "newVersion", "savePurchaseTokens", "tokens", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseDatabaseHelper extends SQLiteOpenHelper {

    @NotNull
    public static final String COLUMN_NAME_TOKEN = "token";

    @NotNull
    private static final String DATABASE_NAME = "afpurchases.db";
    private static final int DATABASE_VERSION = 1;

    @NotNull
    public static final String TABLE_NAME = "purchases";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDatabaseHelper(@NotNull Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final Set<String> getPurchasedTokens() throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Cursor cursorQuery = getReadableDatabase().query(TABLE_NAME, new String[]{"token"}, null, null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("token"));
                Intrinsics.checkNotNullExpressionValue(string, "it.getString(it.getColum…Throw(COLUMN_NAME_TOKEN))");
                linkedHashSet.add(string);
            }
            Unit unit = Unit.f93236a;
            c.a(cursorQuery, null);
            return linkedHashSet;
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.execSQL("CREATE TABLE purchases (token TEXT PRIMARY KEY)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(@Nullable SQLiteDatabase db2) {
        super.onOpen(db2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(db2, "db");
    }

    public final void savePurchaseTokens(@NotNull Set<String> tokens) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            Iterator<String> it = tokens.iterator();
            while (it.hasNext()) {
                contentValues.put("token", it.next());
                writableDatabase.insertWithOnConflict(TABLE_NAME, null, contentValues, 4);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }
}
