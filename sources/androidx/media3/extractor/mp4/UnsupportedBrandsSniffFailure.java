package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.ImmutableIntArray;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i10, @Nullable int[] iArr) {
        this.majorBrand = i10;
        this.compatibleBrands = iArr != null ? ImmutableIntArray.copyOf(iArr) : ImmutableIntArray.of();
    }
}
