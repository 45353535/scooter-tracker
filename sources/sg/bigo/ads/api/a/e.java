package sg.bigo.ads.api.a;

import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f102106a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f102107b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f102108c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f102109d = "";
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f102110a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f102111b = "";
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f102112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f102113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f102114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f102115d;

        public c(@NonNull JSONObject jSONObject) {
            this.f102112a = "";
            this.f102113b = 0;
            this.f102114c = null;
            this.f102115d = "";
            this.f102112a = jSONObject.optString("title", "");
            this.f102113b = jSONObject.optInt("type", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.f102114c = new String[jSONArrayOptJSONArray.length()];
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f102114c[i10] = jSONArrayOptJSONArray.optString(i10);
                }
            }
            this.f102115d = jSONObject.optString("id", "");
        }
    }

    String a();

    String b();

    long c();

    int d();

    String e();

    int f();

    String g();

    String h();

    f[] i();

    f j();

    f k();

    b l();

    c[] m();

    a n();
}
