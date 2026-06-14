package com.unity3d.ads.adplayer.model;

import com.unity3d.scar.adapter.common.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/adplayer/model/OnGmaEvent;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "Lcom/unity3d/scar/adapter/common/c;", "gmaEvent", "<init>", "(Lcom/unity3d/scar/adapter/common/c;)V", "", "category", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "name", "getName", "", "", "parameters", "[Ljava/lang/Object;", "getParameters", "()[Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnGmaEvent implements WebViewEvent {

    @NotNull
    private final String category;

    @NotNull
    private final String name;

    @NotNull
    private final Object[] parameters;

    public OnGmaEvent(@NotNull c gmaEvent) {
        Intrinsics.checkNotNullParameter(gmaEvent, "gmaEvent");
        this.category = "GMA";
        this.name = gmaEvent.name();
        this.parameters = new Object[0];
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public Object[] getParameters() {
        return this.parameters;
    }
}
