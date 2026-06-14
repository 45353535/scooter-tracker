package f3;

import b3.k;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0882a f71929d = new C0882a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f71930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f71931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f71932c;

    /* JADX INFO: renamed from: f3.a$a, reason: collision with other inner class name */
    public static final class C0882a {
        public /* synthetic */ C0882a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0882a() {
        }
    }

    public a(String str) {
        this.f71932c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f71931b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.f71932c;
        Intrinsics.checkNotNull(l10, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.f71930a = string;
    }

    public final void a() {
        k.d(this.f71930a);
    }

    public final int b(a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l10 = this.f71932c;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = data.f71932c;
        if (l11 != null) {
            return Intrinsics.compare(l11.longValue(), jLongValue);
        }
        return 1;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f71932c;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.f71931b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.f71931b == null || this.f71932c == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            k.t(this.f71930a, toString());
        }
    }

    public String toString() {
        JSONObject jSONObjectC = c();
        if (jSONObjectC == null) {
            return super.toString();
        }
        String string = jSONObjectC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "params.toString()");
        return string;
    }

    public a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f71930a = name;
        JSONObject jSONObjectR = k.r(name, true);
        if (jSONObjectR != null) {
            this.f71932c = Long.valueOf(jSONObjectR.optLong("timestamp", 0L));
            this.f71931b = jSONObjectR.optString("error_message", null);
        }
    }
}
