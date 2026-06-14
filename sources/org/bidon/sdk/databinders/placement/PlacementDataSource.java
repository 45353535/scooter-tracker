package org.bidon.sdk.databinders.placement;

import kotlin.Metadata;
import org.bidon.sdk.databinders.DataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/databinders/placement/PlacementDataSource;", "Lorg/bidon/sdk/databinders/DataSource;", "getName", "", "getRewardAmount", "", "()Ljava/lang/Integer;", "getRewardType", "getCappingSetting", "getCappingValue", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PlacementDataSource extends DataSource {
    @NotNull
    String getCappingSetting();

    int getCappingValue();

    @NotNull
    String getName();

    @Nullable
    Integer getRewardAmount();

    @Nullable
    String getRewardType();
}
