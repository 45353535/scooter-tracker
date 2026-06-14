package j;

import androidx.sqlite.SQLiteConnection;
import lf.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static boolean a(SQLiteConnection sQLiteConnection) {
        throw new n(sQLiteConnection + " does not implement inTransaction().");
    }
}
