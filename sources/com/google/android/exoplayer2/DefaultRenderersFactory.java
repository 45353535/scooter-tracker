package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionRenderer;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private boolean enableOffload;
    private final DefaultMediaCodecAdapterFactory codecAdapterFactory = new DefaultMediaCodecAdapterFactory();
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
    }

    protected void buildAudioRenderers(Context context, int i10, MediaCodecSelector mediaCodecSelector, boolean z10, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        int i11;
        int i12;
        int i13;
        arrayList.add(new MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z10, handler, audioRendererEventListener, audioSink));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                Log.i(TAG, "Loaded MidiRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i11;
                i11 = size;
            }
            try {
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (Renderer) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating Opus extension", e10);
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                try {
                    i13 = i12 + 1;
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    arrayList.add(i12, (Renderer) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                    Log.i(TAG, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused6) {
                    i12 = i13;
                    i13 = i12;
                }
                try {
                    arrayList.add(i13, (Renderer) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                    Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e11);
                }
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating FLAC extension", e12);
            }
        } catch (Exception e13) {
            throw new RuntimeException("Error instantiating MIDI extension", e13);
        }
    }

    @Nullable
    protected AudioSink buildAudioSink(Context context, boolean z10, boolean z11, boolean z12) {
        return new DefaultAudioSink.Builder().setAudioCapabilities(AudioCapabilities.getCapabilities(context)).setEnableFloatOutput(z10).setEnableAudioTrackPlaybackParams(z11).setOffloadMode(z12 ? 1 : 0).build();
    }

    protected void buildCameraMotionRenderers(Context context, int i10, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    protected void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i10, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    protected void buildMiscellaneousRenderers(Context context, Handler handler, int i10, ArrayList<Renderer> arrayList) {
    }

    protected void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i10, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    protected void buildVideoRenderers(Context context, int i10, MediaCodecSelector mediaCodecSelector, boolean z10, Handler handler, VideoRendererEventListener videoRendererEventListener, long j10, ArrayList<Renderer> arrayList) {
        int i11;
        int i12;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        arrayList.add(new MediaCodecVideoRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, j10, z10, handler, videoRendererEventListener, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = 50;
                try {
                    i12 = size + 1;
                } catch (ClassNotFoundException unused) {
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
            i11 = 50;
        }
        try {
            arrayList.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j10), handler, videoRendererEventListener, 50));
            Log.i(TAG, "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused3) {
            size = i12;
            i12 = size;
        }
        try {
            arrayList.add(i12, (Renderer) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j10), handler, videoRendererEventListener, Integer.valueOf(i11)));
            Log.i(TAG, "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating AV1 extension", e11);
        }
    }

    @Override // com.google.android.exoplayer2.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        Handler handler2;
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink audioSinkBuildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams, this.enableOffload);
        if (audioSinkBuildAudioSink != null) {
            handler2 = handler;
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, audioSinkBuildAudioSink, handler2, audioRendererEventListener, arrayList);
        } else {
            handler2 = handler;
        }
        buildTextRenderers(this.context, textOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildMiscellaneousRenderers(this.context, handler2, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z10) {
        this.codecAdapterFactory.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(z10);
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    protected MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j10) {
        this.allowedVideoJoiningTimeMs = j10;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory setEnableAudioFloatOutput(boolean z10) {
        this.enableFloatOutput = z10;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory setEnableAudioOffload(boolean z10) {
        this.enableOffload = z10;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z10) {
        this.enableAudioTrackPlaybackParams = z10;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory setEnableDecoderFallback(boolean z10) {
        this.enableDecoderFallback = z10;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory setExtensionRendererMode(int i10) {
        this.extensionRendererMode = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }
}
