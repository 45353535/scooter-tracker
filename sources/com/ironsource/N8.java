package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface N8 {

    public interface a {
        void a(@NotNull Pe pe2);
    }

    int a(@NotNull IronSource.a aVar);

    @NotNull
    List<String> a();

    @NotNull
    Map<String, JSONObject> a(@NotNull Me me2);

    @NotNull
    JSONObject a(@NotNull Ye ye2);
}
