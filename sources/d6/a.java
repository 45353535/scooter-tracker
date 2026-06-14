package d6;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f68445a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f68446b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f68447c = Boolean.TRUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f68448d = "v1.2";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f68449e = "analytics.us.tiktok.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static EnumC0853a f68450f = EnumC0853a.INFO;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static AtomicBoolean f68451g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static AtomicBoolean f68452h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static AtomicBoolean f68453i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f68454j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f68455k = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    public enum EnumC0853a {
        NONE,
        INFO,
        WARN,
        DEBUG
    }

    public static EnumC0853a a() {
        return f68450f;
    }
}
