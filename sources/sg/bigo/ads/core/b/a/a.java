package sg.bigo.ads.core.b.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103909a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103910b = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103911c = 259200000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f103912d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f103913e = 1;

    public a() {
        b();
    }

    private void b() {
        this.f103909a = 10;
        this.f103910b = 900000;
        this.f103911c = 259200000;
    }

    public final int a() {
        return Math.round(this.f103909a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f103909a = jSONObject.optInt("num", 10);
        int iOptInt = jSONObject.optInt("interval") * 1000;
        this.f103910b = iOptInt;
        if (iOptInt == 0) {
            this.f103910b = 900000;
        }
        this.f103911c = jSONObject.optInt("expired") * 1000;
        this.f103912d = jSONObject.optInt("imp_clk_independent", 0) == 1;
        this.f103913e = jSONObject.optInt("imp_clk_independent_num", 1);
    }
}
