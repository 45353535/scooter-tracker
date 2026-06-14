package com.google.android.exoplayer2.util;

import android.view.SurfaceView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: com.google.android.exoplayer2.util.a
        @Override // com.google.android.exoplayer2.util.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i10, int i11) {
            return b.a(i10, i11);
        }
    };

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i10, int i11);
}
