package e6;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f68923a = new a(b.class.getName(), d6.a.a());

    public static JSONObject a(Long l10) {
        if (l10 == null) {
            l10 = Long.valueOf(System.currentTimeMillis());
        }
        try {
            return new JSONObject().put("ts", l10);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
