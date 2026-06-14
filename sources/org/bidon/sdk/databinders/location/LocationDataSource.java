package org.bidon.sdk.databinders.location;

import kotlin.Metadata;
import org.bidon.sdk.databinders.DataSource;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\rH&¢\u0006\u0002\u0010\u000eJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0010H&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0014\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/databinders/location/LocationDataSource;", "Lorg/bidon/sdk/databinders/DataSource;", "isLocationAvailable", "", "()Z", "getLatitude", "", "()Ljava/lang/Double;", "getLongitude", "getAccuracy", "", "()Ljava/lang/Integer;", "getLastFix", "", "()Ljava/lang/Long;", "getCountry", "", "getRegion", "getCity", "getZip", "getUtcOffset", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface LocationDataSource extends DataSource {
    @Nullable
    Integer getAccuracy();

    @Nullable
    String getCity();

    @Nullable
    String getCountry();

    @Nullable
    Long getLastFix();

    @Nullable
    Double getLatitude();

    @Nullable
    Double getLongitude();

    @Nullable
    String getRegion();

    int getUtcOffset();

    @Nullable
    String getZip();

    boolean isLocationAvailable();
}
