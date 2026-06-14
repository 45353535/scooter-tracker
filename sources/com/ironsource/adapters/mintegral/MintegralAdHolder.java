package com.ironsource.adapters.mintegral;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u0015\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ironsource/adapters/mintegral/MintegralAdHolder;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "()V", "mintegralAds", "", "Lcom/ironsource/adapters/mintegral/MintegralAdapter;", "getAdapters", "", "removeAd", "", C4240b4.i.W, "retrieveAd", "(Lcom/ironsource/adapters/mintegral/MintegralAdapter;)Ljava/lang/Object;", "storeAd", "value", "(Lcom/ironsource/adapters/mintegral/MintegralAdapter;Ljava/lang/Object;)V", "mintegraladapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MintegralAdHolder<V> {

    @NotNull
    private final Map<MintegralAdapter, V> mintegralAds;

    public MintegralAdHolder() {
        Map<MintegralAdapter, V> mapSynchronizedMap = DesugarCollections.synchronizedMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(WeakHashMap())");
        this.mintegralAds = mapSynchronizedMap;
    }

    @NotNull
    public final Set<MintegralAdapter> getAdapters() {
        return this.mintegralAds.keySet();
    }

    public final void removeAd(@NotNull MintegralAdapter key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.mintegralAds.remove(key);
    }

    @Nullable
    public final V retrieveAd(@NotNull MintegralAdapter key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mintegralAds.get(key);
    }

    public final void storeAd(@NotNull MintegralAdapter key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.mintegralAds.put(key, value);
    }
}
