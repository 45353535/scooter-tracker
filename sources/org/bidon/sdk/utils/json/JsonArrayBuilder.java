package org.bidon.sdk.utils.json;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/utils/json/JsonArrayBuilder;", "", "<init>", "()V", "jsonArray", "Lorg/json/JSONArray;", "putValues", "", "value", "", "build", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonArrayBuilder {

    @NotNull
    private final JSONArray jsonArray = new JSONArray();

    @NotNull
    /* JADX INFO: renamed from: build, reason: from getter */
    public final JSONArray getJsonArray() {
        return this.jsonArray;
    }

    public final void putValues(@Nullable List<? extends Object> value) {
        if (value == null) {
            return;
        }
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            this.jsonArray.put(it.next());
        }
    }
}
