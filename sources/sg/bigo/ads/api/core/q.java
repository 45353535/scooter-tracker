package sg.bigo.ads.api.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f102217a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102218b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102219c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102220d = 0;

    public q() {
        a();
    }

    private void a() {
        this.f102217a = false;
        this.f102218b = "";
        this.f102219c = 3;
        this.f102220d = 20000;
    }

    public final boolean b(int i10) {
        return i10 < this.f102219c;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            a();
            return;
        }
        this.f102217a = true;
        this.f102218b = jSONObject.optString("http_succ_code");
        this.f102219c = jSONObject.optInt("retry_cnt", 3);
        int iOptInt = jSONObject.optInt("retry_interval") * 1000;
        this.f102220d = iOptInt;
        if (iOptInt < 20000) {
            this.f102220d = 20000;
        }
    }

    public final boolean a(int i10) {
        if (i10 >= 100) {
            return this.f102218b.contains(String.valueOf(i10));
        }
        return false;
    }

    public final boolean a(long j10, long j11) {
        return j10 + ((long) this.f102220d) < j11;
    }
}
