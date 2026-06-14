package org.bidon.sdk.segment;

import kotlin.Metadata;
import org.bidon.sdk.segment.models.SegmentAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H&J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/segment/SegmentSynchronizer;", "", "attributes", "Lorg/bidon/sdk/segment/models/SegmentAttributes;", "getAttributes", "()Lorg/bidon/sdk/segment/models/SegmentAttributes;", "segmentUid", "", "getSegmentUid", "()Ljava/lang/String;", "parseSegmentUid", "", "rootJsonResponse", "setSegmentUid", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SegmentSynchronizer {
    @NotNull
    SegmentAttributes getAttributes();

    @Nullable
    String getSegmentUid();

    void parseSegmentUid(@NotNull String rootJsonResponse);

    void setSegmentUid(@Nullable String segmentUid);
}
