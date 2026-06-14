package com.pubmatic.sdk.openwrap.core.nativead;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestAsset;", "", "", "id", "", "isRequired", "<init>", "(IZ)V", "getId", "()I", "()Z", "a", "I", "b", "Z", "Lorg/json/JSONObject;", "getRTBJSON", "()Lorg/json/JSONObject;", "RTBJSON", "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public abstract class POBCoreNativeRequestAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isRequired;

    public POBCoreNativeRequestAsset(int i10, boolean z10) {
        this.id = i10;
        this.isRequired = z10;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public abstract JSONObject getRTBJSON();

    /* JADX INFO: renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }
}
