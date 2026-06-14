package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final boolean a() {
        String property = System.getProperty("io.ktor.development");
        return property != null && Boolean.parseBoolean(property);
    }
}
