package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: androidx.media3.common.f
        @Override // androidx.media3.common.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i10, int i11) {
            return g.a(i10, i11);
        }
    };

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i10, int i11);
}
