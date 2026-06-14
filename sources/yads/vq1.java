package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class vq1 {
    public static long a() {
        Runtime runtime = Runtime.getRuntime();
        return Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }
}
