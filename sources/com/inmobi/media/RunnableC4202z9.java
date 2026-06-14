package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4202z9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f40038a;

    public RunnableC4202z9(JSONObject jSONObject) {
        this.f40038a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Ok.c()) {
            return;
        }
        F9.a(this.f40038a);
    }
}
