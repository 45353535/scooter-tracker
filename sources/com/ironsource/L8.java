package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface L8 {

    public interface a {
        void a(@NotNull b bVar);

        void a(@NotNull List<? extends b> list);
    }

    public interface b {
        int b();

        @NotNull
        String c();
    }

    boolean a();

    boolean b(@NotNull b bVar);
}
