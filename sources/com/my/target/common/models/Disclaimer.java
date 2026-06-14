package com.my.target.common.models;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class Disclaimer {
    public final int disclaimerType;

    @NonNull
    public final String text;

    public Disclaimer(int i10, @NonNull String str) {
        this.disclaimerType = i10;
        this.text = str;
    }

    public String toString() {
        return "Disclaimer{disclaimerType=" + this.disclaimerType + ", text='" + this.text + "'}";
    }
}
