package n2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.y.z.w.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f95083i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f95085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f95086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f95087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f95088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f95089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f95090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f95091h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f95098b;

        b(int i10) {
            this.f95098b = i10;
        }

        public final int g() {
            return this.f95098b;
        }
    }

    public c(JSONObject component) throws JSONException {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f95084a = string;
        this.f95085b = component.optInt(FirebaseAnalytics.Param.INDEX, -1);
        this.f95086c = component.optInt("id");
        String strOptString = component.optString("text");
        Intrinsics.checkNotNullExpressionValue(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.f95087d = strOptString;
        String strOptString2 = component.optString(s.z.f67720z);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.f95088e = strOptString2;
        String strOptString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f95089f = strOptString3;
        String strOptString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.f95090g = strOptString4;
        this.f95091h = component.optInt("match_bitmask");
    }

    public final String a() {
        return this.f95084a;
    }

    public final String b() {
        return this.f95089f;
    }

    public final String c() {
        return this.f95090g;
    }

    public final int d() {
        return this.f95086c;
    }

    public final int e() {
        return this.f95085b;
    }

    public final int f() {
        return this.f95091h;
    }

    public final String g() {
        return this.f95088e;
    }

    public final String h() {
        return this.f95087d;
    }
}
