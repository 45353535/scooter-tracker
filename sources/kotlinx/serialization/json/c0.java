package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f93663a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.f93663a);
    }

    public final JsonElement b(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (JsonElement) this.f93663a.put(key, element);
    }
}
