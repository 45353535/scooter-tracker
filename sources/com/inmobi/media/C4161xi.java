package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4161xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f39939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainLink f39940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39941c;

    public C4161xi(LinkedHashMap assetIdToLinkMap, MainLink mainLink, List responseClickTrackers) {
        Intrinsics.checkNotNullParameter(assetIdToLinkMap, "assetIdToLinkMap");
        Intrinsics.checkNotNullParameter(responseClickTrackers, "responseClickTrackers");
        this.f39939a = assetIdToLinkMap;
        this.f39940b = mainLink;
        this.f39941c = responseClickTrackers;
    }
}
