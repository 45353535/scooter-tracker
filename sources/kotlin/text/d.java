package kotlin.text;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f93495d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f93496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f93497f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f93498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f93499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f93500c;

    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final C1071a f93501j = new C1071a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f93502k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f93503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f93504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f93505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f93506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f93507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f93508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f93509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f93510h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f93511i;

        /* JADX INFO: renamed from: kotlin.text.d$a$a, reason: collision with other inner class name */
        public static final class C1071a {
            public /* synthetic */ C1071a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f93502k;
            }

            private C1071a() {
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.f93503a = i10;
            this.f93504b = i11;
            this.f93505c = groupSeparator;
            this.f93506d = byteSeparator;
            this.f93507e = bytePrefix;
            this.f93508f = byteSuffix;
            this.f93509g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f93510h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f93511i = e.b(groupSeparator) || e.b(byteSeparator) || e.b(bytePrefix) || e.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f93503a);
            sb2.append(StringUtils.COMMA);
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f93504b);
            sb2.append(StringUtils.COMMA);
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f93505c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f93506d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f93507e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f93508f);
            sb2.append("\"");
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f93496e;
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final a f93512h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f93513i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f93514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f93515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f93516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f93517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f93518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f93519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f93520g;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f93513i;
            }

            private a() {
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.f93514a = prefix;
            this.f93515b = suffix;
            this.f93516c = z10;
            this.f93517d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f93518e = z11;
            this.f93519f = z11 && i10 == 1;
            this.f93520g = e.b(prefix) || e.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f93514a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f93515b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f93516c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f93517d);
            return sb2;
        }

        public final boolean c() {
            return this.f93520g;
        }

        public final String d() {
            return this.f93514a;
        }

        public final String e() {
            return this.f93515b;
        }

        public final boolean f() {
            return this.f93518e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C1071a c1071a = a.f93501j;
        a aVarA = c1071a.a();
        c.a aVar = c.f93512h;
        f93496e = new d(false, aVarA, aVar.a());
        f93497f = new d(true, c1071a.a(), aVar.a());
    }

    public d(boolean z10, a bytes, c number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f93498a = z10;
        this.f93499b = bytes;
        this.f93500c = number;
    }

    public final c b() {
        return this.f93500c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f93498a);
        sb2.append(StringUtils.COMMA);
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f93499b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f93500c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
