package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f10417f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10418a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f10420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f10421d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List f10419b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f10422e = System.currentTimeMillis();

    public s7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f10418a = kVar;
        this.f10420c = jSONObject;
        this.f10421d = jSONObject2;
    }

    public List a() {
        return this.f10419b;
    }

    public JSONObject b() {
        return this.f10420c;
    }

    public long c() {
        return this.f10422e;
    }

    public int d() {
        return this.f10419b.size();
    }

    public JSONObject e() {
        return this.f10421d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f10420c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f10417f;
    }

    public int g() {
        return n7.c(JsonUtils.getInt(this.f10420c, "video_completion_percent", -1));
    }
}
