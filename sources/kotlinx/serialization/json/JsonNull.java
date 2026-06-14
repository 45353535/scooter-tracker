package kotlinx.serialization.json;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ug.l(with = a0.class)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "b", "Ljava/lang/String;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Ljava/lang/String;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonNull extends JsonPrimitive {

    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String content = "null";

    private JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String e() {
        return content;
    }

    @NotNull
    public final KSerializer serializer() {
        return a0.f93656a;
    }
}
