package org.bidon.sdk.databinders.adapters;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.AdaptersSource;
import org.bidon.sdk.databinders.DataBinder;
import org.bidon.sdk.utils.json.JsonObjectBuilder;
import org.bidon.sdk.utils.json.JsonObjectBuilderKt;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/databinders/adapters/AdaptersBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "Lorg/json/JSONObject;", "adaptersSource", "Lorg/bidon/sdk/adapter/AdaptersSource;", "<init>", "(Lorg/bidon/sdk/adapter/AdaptersSource;)V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDevice", "", "Lorg/bidon/sdk/adapter/AdapterInfo;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdaptersBinder implements DataBinder<JSONObject> {

    @NotNull
    private final AdaptersSource adaptersSource;

    @NotNull
    private final String fieldName;

    public AdaptersBinder(@NotNull AdaptersSource adaptersSource) {
        Intrinsics.checkNotNullParameter(adaptersSource, "adaptersSource");
        this.adaptersSource = adaptersSource;
        this.fieldName = "adapters";
    }

    private final Map<String, AdapterInfo> createDevice() {
        Set<Adapter> adapters = this.adaptersSource.getAdapters();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(adapters, 10)), 16));
        for (Adapter adapter : adapters) {
            Pair pair = TuplesKt.to(adapter.getDemandId().getDemandId(), adapter.getAdapterInfo());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getJsonObject$lambda$1(AdaptersBinder adaptersBinder, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Map.Entry<String, AdapterInfo> entry : adaptersBinder.createDevice().entrySet()) {
            jsonObject.hasValue(entry.getKey(), SerializerKt.serialize(entry.getValue()));
        }
        return Unit.f93236a;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        return JsonObjectBuilderKt.jsonObject(new Function1() { // from class: org.bidon.sdk.databinders.adapters.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdaptersBinder.getJsonObject$lambda$1(this.f97642b, (JsonObjectBuilder) obj);
            }
        });
    }
}
