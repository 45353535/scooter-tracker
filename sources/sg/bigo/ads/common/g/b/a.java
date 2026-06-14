package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f102435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f102436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f102437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f102439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f102440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f102441g;

    public a(Cursor cursor) {
        this.f102435a = -1L;
        this.f102435a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f102436b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.f102437c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f102438d = cursor.getInt(cursor.getColumnIndex("states"));
        this.f102439e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f102440f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f102441g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        long j10 = this.f102435a;
        return j10 >= 0 && j10 == ((a) obj).f102435a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f102435a + ",eventInfo=" + this.f102437c;
    }

    public a(String str, String str2) {
        this.f102435a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f102436b = str;
        this.f102437c = str2;
        this.f102438d = 0;
        this.f102439e = "";
        this.f102440f = jCurrentTimeMillis;
        this.f102441g = jCurrentTimeMillis;
    }
}
