package com.taurusx.tax.o;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b0 {
    private String z(String str) {
        return str != null ? str.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "") : "";
    }

    public String toString() {
        return z(z());
    }

    public abstract String z();
}
