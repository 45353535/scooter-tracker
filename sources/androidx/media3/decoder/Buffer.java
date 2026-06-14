package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public abstract class Buffer {
    private int flags;

    public final void addFlag(int i10) {
        this.flags = i10 | this.flags;
    }

    @CallSuper
    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i10) {
        this.flags = (~i10) & this.flags;
    }

    protected final boolean getFlag(int i10) {
        return (this.flags & i10) == i10;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isFirstSample() {
        return getFlag(134217728);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(536870912);
    }

    public final void setFlags(int i10) {
        this.flags = i10;
    }
}
