package nd;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Double f95830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Struct.Builder f95831c;

    private final Struct.Builder e() {
        Struct.Builder builder = this.f95831c;
        if (builder != null) {
            return builder;
        }
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        this.f95831c = builderNewBuilder;
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder().also {\n    …amsBuilder = it\n        }");
        return builderNewBuilder;
    }

    public final a a(Map map) {
        Struct.Builder builderE = e();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Value valueY = ae.f.y(entry.getValue());
                if (valueY != null) {
                    builderE.putFields((String) entry.getKey(), valueY);
                }
            }
        }
        return this;
    }

    public final Struct b() {
        Struct.Builder builder = this.f95831c;
        if (builder != null) {
            return builder.build();
        }
        return null;
    }

    public final String c() {
        return this.f95829a;
    }

    public final Double d() {
        return this.f95830b;
    }

    public final a f(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        e().putFields(key, Value.newBuilder().setStringValue(value).build());
        return this;
    }

    public final a g(Map map) {
        this.f95831c = ae.f.w(map);
        return this;
    }

    public final a h(String str) {
        this.f95829a = str;
        return this;
    }

    public final a i(Double d10) {
        this.f95830b = d10;
        return this;
    }
}
