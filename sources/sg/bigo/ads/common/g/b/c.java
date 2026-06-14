package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f102449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f102450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f102452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f102453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f102454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f102455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f102456h;

    public c(Cursor cursor) {
        this.f102449a = -1L;
        this.f102450b = false;
        this.f102451c = 0;
        this.f102452d = 0L;
        this.f102453e = "";
        this.f102449a = cursor.getLong(cursor.getColumnIndex("_id"));
        try {
            this.f102456h = j.a(new JSONObject(cursor.getString(cursor.getColumnIndex("ad_data"))));
        } catch (JSONException unused) {
        }
        a(cursor.getString(cursor.getColumnIndex("tracker_imp")));
        b(cursor.getString(cursor.getColumnIndex("tracker_cli")));
        c(cursor.getString(cursor.getColumnIndex("tracker_nurl")));
        d(cursor.getString(cursor.getColumnIndex("tracker_lurl")));
        this.f102451c = cursor.getInt(cursor.getColumnIndex("tracker_type"));
        this.f102452d = cursor.getLong(cursor.getColumnIndex("last_retry_ts"));
        this.f102453e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f102454f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f102455g = cursor.getLong(cursor.getColumnIndex("mtime"));
        this.f102450b = true;
    }

    @NonNull
    public final String a() {
        Map<String, String> map = this.f102456h;
        if (map == null) {
            return "";
        }
        if ((map instanceof HashMap) && map != null) {
            map.remove(null);
            map.values().removeAll(Collections.singleton(null));
        }
        return new JSONObject(this.f102456h).toString();
    }

    protected abstract void a(String str);

    @NonNull
    public abstract String b();

    protected abstract void b(String str);

    @NonNull
    public abstract String c();

    protected abstract void c(String str);

    @NonNull
    public abstract String d();

    protected abstract void d(String str);

    @NonNull
    public abstract String e();

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != c.class) {
            return false;
        }
        long j10 = this.f102449a;
        return j10 >= 0 && j10 == ((c) obj).f102449a;
    }

    public long f() {
        return 0L;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f102449a;
    }

    public c(@NonNull Map<String, String> map) {
        this.f102449a = -1L;
        this.f102450b = false;
        this.f102451c = 0;
        this.f102452d = 0L;
        this.f102453e = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f102456h = map;
        this.f102454f = jCurrentTimeMillis;
        this.f102455g = jCurrentTimeMillis;
    }
}
