package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface O {

    public interface a {
        void a(@NotNull N n10);

        void a(@NotNull EnumC4422m0 enumC4422m0, @NotNull String str);

        void a(@NotNull JSONObject jSONObject, @NotNull EnumC4422m0 enumC4422m0, @NotNull String str);
    }

    @Nullable
    N a(@NotNull String str);

    @NotNull
    List<N> a();
}
