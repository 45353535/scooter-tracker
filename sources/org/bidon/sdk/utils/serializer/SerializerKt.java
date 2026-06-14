package org.bidon.sdk.utils.serializer;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"serialize", "Lorg/json/JSONObject;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "Lorg/json/JSONArray;", "", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SerializerKt {
    @NotNull
    public static final JSONObject serialize(@NotNull Serializable serializable) {
        Intrinsics.checkNotNullParameter(serializable, "<this>");
        return BidonSerializer.INSTANCE.serialize(serializable);
    }

    @NotNull
    public static final JSONArray serialize(@NotNull List<? extends Serializable> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return BidonSerializer.INSTANCE.serializeToArray(list);
    }
}
