package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f93662a = new ArrayList();

    public final boolean a(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f93662a.add(element);
        return true;
    }

    public final JsonArray b() {
        return new JsonArray(this.f93662a);
    }
}
