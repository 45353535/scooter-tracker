package sg.bigo.ads.common.h.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102478a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102479b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102480c = 40;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f102481d = 432000000;

    public a() {
        c();
    }

    private void c() {
        this.f102478a = 3;
        this.f102479b = 20;
        this.f102480c = 40;
        this.f102481d = 432000000L;
    }

    public final int a() {
        int i10 = this.f102479b;
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    public final boolean b() {
        return this.f102478a <= 0;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            c();
            return;
        }
        this.f102478a = jSONObject.optInt("download_parallel_num", 3);
        int iOptInt = jSONObject.optInt("num", 20);
        this.f102479b = iOptInt;
        this.f102480c = iOptInt * 2;
        long jOptInt = ((long) jSONObject.optInt("valid_period")) * 1000;
        if (jOptInt == 0) {
            jOptInt = 432000000;
        }
        this.f102481d = jOptInt;
    }
}
