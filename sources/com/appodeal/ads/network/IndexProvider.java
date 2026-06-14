package com.appodeal.ads.network;

import com.taurusx.tax.f.y;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\rJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/network/IndexProvider;", "", "", "currentIndex", "()I", "size", "popNextIndex", "(I)Ljava/lang/Integer;", "", "saveIndex", "()V", "removeIndex", y.f66058y, "com/appodeal/ads/network/b", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IndexProvider {
    public static final b Companion = b.f13948a;

    int currentIndex();

    Integer popNextIndex(int size);

    void removeIndex();

    void saveIndex();
}
