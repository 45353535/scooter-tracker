package org.bidon.sdk.adapter;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/adapter/AdViewHolder;", "", "networkAdview", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getNetworkAdview", "()Landroid/view/View;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdViewHolder {

    @NotNull
    private final View networkAdview;

    public AdViewHolder(@NotNull View networkAdview) {
        Intrinsics.checkNotNullParameter(networkAdview, "networkAdview");
        this.networkAdview = networkAdview;
    }

    @NotNull
    public final View getNetworkAdview() {
        return this.networkAdview;
    }
}
