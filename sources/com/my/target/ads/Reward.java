package com.my.target.ads;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class Reward {
    public static final String DEFAULT = "default";

    @NonNull
    public final String type;

    public Reward(String str) {
        this.type = str;
    }

    @NonNull
    public static Reward getDefault() {
        return new Reward("default");
    }
}
