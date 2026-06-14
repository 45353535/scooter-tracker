package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Rf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NetworkSettings f41683b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f41682a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f41684c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41685d = true;

    Rf() {
    }

    public void a(NetworkSettings networkSettings) {
        this.f41683b = networkSettings;
    }

    public JSONObject b() {
        return this.f41684c;
    }

    @Nullable
    public NetworkSettings c() {
        return this.f41683b;
    }

    public ArrayList<String> d() {
        return this.f41682a;
    }

    public boolean e() {
        return this.f41685d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f41682a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.f41684c = jSONObject;
    }

    public void a(boolean z10) {
        this.f41685d = z10;
    }

    public static Rf a() {
        return new Rf();
    }
}
