package id;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f74641e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f74642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f74643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f74644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f74645d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v0 a(String str) {
            List listSplit$default = str != null ? StringsKt.split$default(str, new String[]{StringUtils.COMMA}, false, 0, 6, null) : null;
            if (listSplit$default != null && listSplit$default.size() >= 4) {
                try {
                    return new v0(Float.parseFloat(StringsKt.v1((String) listSplit$default.get(0)).toString()), Float.parseFloat(StringsKt.v1((String) listSplit$default.get(1)).toString()), Float.parseFloat(StringsKt.v1((String) listSplit$default.get(2)).toString()), Float.parseFloat(StringsKt.v1((String) listSplit$default.get(3)).toString()));
                } catch (Exception unused) {
                }
            }
            return null;
        }

        private a() {
        }
    }

    public v0(float f10, float f11, float f12, float f13) {
        this.f74642a = f10;
        this.f74643b = f11;
        this.f74644c = f12;
        this.f74645d = f13;
    }

    public final float a() {
        return this.f74645d;
    }

    public final float b() {
        return this.f74642a;
    }

    public final float c() {
        return this.f74644c;
    }

    public final float d() {
        return this.f74643b;
    }

    public final boolean e() {
        return this.f74642a == 0.0f && this.f74643b == 0.0f && this.f74644c == 0.0f && this.f74645d == 0.0f;
    }
}
