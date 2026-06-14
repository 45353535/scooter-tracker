package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/yandex/mobile/ads/common/AdSize;", "", "", "width", "height", "<init>", "(II)V", "o", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getWidth", "b", "getHeight", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class AdSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int height;

    public AdSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public boolean equals(@Nullable Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && Intrinsics.areEqual(AdSize.class, o10.getClass())) {
            AdSize adSize = (AdSize) o10;
            if (this.width == adSize.width && this.height == adSize.height) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    @NotNull
    public String toString() {
        return "AdSize (width=" + this.width + ", height=" + this.height + ")";
    }
}
