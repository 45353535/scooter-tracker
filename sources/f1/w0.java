package f1;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f71423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0 f71424d = new w0("MRAID", 0, "mraid");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w0 f71425e = new w0("HTML", 1, "html");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w0 f71426f = new w0("VAST", 2, "vast");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w0 f71427g = new w0("UNKNOWN", 3, "unknown");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w0[] f71428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71429i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71430b;

    public static final class a {
        public a() {
        }

        public final w0 a(String str) {
            Object next;
            Iterator<E> it = w0.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.N(((w0) next).h(), str, true)) {
                    break;
                }
            }
            w0 w0Var = (w0) next;
            return w0Var == null ? w0.f71427g : w0Var;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        w0[] w0VarArrD = d();
        f71428h = w0VarArrD;
        f71429i = qf.a.a(w0VarArrD);
        f71423c = new a(null);
    }

    public w0(String str, int i10, String str2) {
        this.f71430b = str2;
    }

    public static final /* synthetic */ w0[] d() {
        return new w0[]{f71424d, f71425e, f71426f, f71427g};
    }

    public static EnumEntries g() {
        return f71429i;
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f71428h.clone();
    }

    public final String h() {
        return this.f71430b;
    }
}
