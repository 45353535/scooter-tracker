package f1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k9 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, name, cursorFactory, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public /* synthetic */ k9(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? "chartboost_exoplayer.db" : str, (i11 & 4) != 0 ? null : cursorFactory, (i11 & 8) != 0 ? 1 : i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
