package com.ironsource;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface Rb {

    public interface a {
        void a();

        void a(@NotNull D8 d82);

        void a(@NotNull String str);

        void e();
    }

    void a();

    void a(@NotNull Activity activity, @NotNull JSONObject jSONObject);

    void a(@NotNull G8 g82);

    void a(@Nullable a aVar);

    void a(@NotNull gg ggVar);

    void a(@NotNull JSONObject jSONObject);

    @Nullable
    a b();

    void c();
}
