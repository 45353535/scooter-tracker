package xe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final boolean a() {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            return Boolean.parseBoolean(property);
        }
        return false;
    }
}
