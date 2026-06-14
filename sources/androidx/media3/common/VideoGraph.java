package androidx.media3.common;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface VideoGraph {

    @UnstableApi
    public interface Listener {
        void onEnded(long j10);

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onOutputFrameAvailableForRendering(long j10);

        void onOutputSizeChanged(int i10, int i11);
    }

    VideoFrameProcessor getProcessor(int i10);

    boolean hasProducedFrameWithTimestampZero();

    void initialize() throws VideoFrameProcessingException;

    void registerInput(@IntRange(from = 0) int i10) throws VideoFrameProcessingException;

    void release();

    void setOutputSurfaceInfo(@Nullable SurfaceInfo surfaceInfo);
}
