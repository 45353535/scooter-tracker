package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f102442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f102443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f102444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f102445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f102446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f102447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f102448g;

    public b(Cursor cursor) {
        this.f102442a = -1L;
        this.f102442a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f102443b = cursor.getString(cursor.getColumnIndex("event_id"));
        this.f102444c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f102445d = cursor.getLong(cursor.getColumnIndex("expired_ts"));
        this.f102446e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f102447f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f102448g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != b.class) {
            return false;
        }
        long j10 = this.f102442a;
        return j10 >= 0 && j10 == ((b) obj).f102442a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f102442a + StringUtils.COMMA + "mEventId = " + this.f102443b + StringUtils.COMMA + "mExpiredTs = " + this.f102445d + StringUtils.COMMA + "eventInfo = " + this.f102444c;
    }

    public b(String str, String str2, long j10) {
        this.f102442a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f102443b = str;
        this.f102444c = str2;
        this.f102445d = j10;
        this.f102446e = "";
        this.f102447f = jCurrentTimeMillis;
        this.f102448g = jCurrentTimeMillis;
    }
}
