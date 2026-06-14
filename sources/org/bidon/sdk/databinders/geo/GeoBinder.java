package org.bidon.sdk.databinders.geo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.models.Geo;
import org.bidon.sdk.databinders.DataBinder;
import org.bidon.sdk.databinders.location.LocationDataSource;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0002\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lorg/bidon/sdk/databinders/geo/GeoBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "Lorg/json/JSONObject;", "dataSource", "Lorg/bidon/sdk/databinders/location/LocationDataSource;", "<init>", "(Lorg/bidon/sdk/databinders/location/LocationDataSource;)V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createGeo", "Lorg/bidon/sdk/config/models/Geo;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GeoBinder implements DataBinder<JSONObject> {

    @NotNull
    private final LocationDataSource dataSource;

    @NotNull
    private final String fieldName;

    public GeoBinder(@NotNull LocationDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.fieldName = "geo";
    }

    private final Geo createGeo() {
        if (this.dataSource.isLocationAvailable()) {
            return new Geo(this.dataSource.getLatitude(), this.dataSource.getLongitude(), this.dataSource.getAccuracy(), this.dataSource.getLastFix(), this.dataSource.getCountry(), this.dataSource.getCity(), this.dataSource.getZip(), this.dataSource.getUtcOffset());
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        Geo geoCreateGeo = createGeo();
        if (geoCreateGeo != null) {
            return SerializerKt.serialize(geoCreateGeo);
        }
        return null;
    }
}
