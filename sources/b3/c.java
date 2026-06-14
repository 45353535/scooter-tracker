package b3;

import android.os.Build;
import com.facebook.internal.z;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f5808h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC0126c f5810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONArray f5811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f5812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f5815g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5816a = new a();

        private a() {
        }

        public static final c a(String str, String str2) {
            return new c(str, str2, (DefaultConstructorMarker) null);
        }

        public static final c b(Throwable th2, EnumC0126c t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            return new c(th2, t10, (DefaultConstructorMarker) null);
        }

        public static final c c(JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new c(features, (DefaultConstructorMarker) null);
        }

        public static final c d(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new c(file, (DefaultConstructorMarker) null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EnumC0126c b(String str) {
            return StringsKt.a0(str, "crash_log_", false, 2, null) ? EnumC0126c.CrashReport : StringsKt.a0(str, "shield_log_", false, 2, null) ? EnumC0126c.CrashShield : StringsKt.a0(str, "thread_check_log_", false, 2, null) ? EnumC0126c.ThreadCheck : StringsKt.a0(str, "analysis_log_", false, 2, null) ? EnumC0126c.Analysis : StringsKt.a0(str, "anr_log_", false, 2, null) ? EnumC0126c.AnrReport : EnumC0126c.Unknown;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: b3.c$c, reason: collision with other inner class name */
    public enum EnumC0126c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: renamed from: b3.c$c$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC0126c.values().length];
                try {
                    iArr[EnumC0126c.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0126c.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0126c.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC0126c.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC0126c.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String g() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0126c.values().length];
            try {
                iArr[EnumC0126c.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0126c.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0126c.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0126c.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0126c.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ c(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f5811c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l10 = this.f5815g;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f5812d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l10 = this.f5815g;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            String str2 = this.f5813e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f5814f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC0126c enumC0126c = this.f5810b;
            if (enumC0126c != null) {
                jSONObject.put("type", enumC0126c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        EnumC0126c enumC0126c = this.f5810b;
        int i10 = enumC0126c == null ? -1 : d.$EnumSwitchMapping$0[enumC0126c.ordinal()];
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return d();
        }
        return null;
    }

    public final void a() {
        k.d(this.f5809a);
    }

    public final int b(c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l10 = this.f5815g;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = data.f5815g;
        if (l11 != null) {
            return Intrinsics.compare(l11.longValue(), jLongValue);
        }
        return 1;
    }

    public final boolean f() {
        EnumC0126c enumC0126c = this.f5810b;
        int i10 = enumC0126c == null ? -1 : d.$EnumSwitchMapping$0[enumC0126c.ordinal()];
        return i10 != 1 ? i10 != 2 ? ((i10 != 3 && i10 != 4 && i10 != 5) || this.f5814f == null || this.f5815g == null) ? false : true : (this.f5814f == null || this.f5813e == null || this.f5815g == null) ? false : true : (this.f5811c == null || this.f5815g == null) ? false : true;
    }

    public final void g() {
        if (f()) {
            k.t(this.f5809a, toString());
        }
    }

    public String toString() {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            String string = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObjectE.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "params.toString()");
        return string2;
    }

    public /* synthetic */ c(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ c(Throwable th2, EnumC0126c enumC0126c, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, enumC0126c);
    }

    public /* synthetic */ c(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private c(JSONArray jSONArray) {
        this.f5810b = EnumC0126c.Analysis;
        this.f5815g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f5811c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f5815g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.f5809a = string;
    }

    private c(Throwable th2, EnumC0126c enumC0126c) {
        this.f5810b = enumC0126c;
        this.f5812d = z.u();
        this.f5813e = k.e(th2);
        this.f5814f = k.h(th2);
        this.f5815g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC0126c.g());
        stringBuffer.append(String.valueOf(this.f5815g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.f5809a = string;
    }

    private c(String str, String str2) {
        this.f5810b = EnumC0126c.AnrReport;
        this.f5812d = z.u();
        this.f5813e = str;
        this.f5814f = str2;
        this.f5815g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f5815g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.f5809a = string;
    }

    private c(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f5809a = name;
        this.f5810b = f5808h.b(name);
        JSONObject jSONObjectR = k.r(this.f5809a, true);
        if (jSONObjectR != null) {
            this.f5815g = Long.valueOf(jSONObjectR.optLong("timestamp", 0L));
            this.f5812d = jSONObjectR.optString("app_version", null);
            this.f5813e = jSONObjectR.optString("reason", null);
            this.f5814f = jSONObjectR.optString("callstack", null);
            this.f5811c = jSONObjectR.optJSONArray("feature_names");
        }
    }
}
