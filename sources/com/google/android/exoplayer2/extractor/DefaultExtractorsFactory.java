package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.jpeg.JpegExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final ExtensionLoader FLAC_EXTENSION_LOADER = new ExtensionLoader(new ExtensionLoader.ConstructorSupplier() { // from class: com.google.android.exoplayer2.extractor.b
        @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final Constructor getConstructor() {
            return DefaultExtractorsFactory.getFlacExtractorConstructor();
        }
    });
    private static final ExtensionLoader MIDI_EXTENSION_LOADER = new ExtensionLoader(new ExtensionLoader.ConstructorSupplier() { // from class: com.google.android.exoplayer2.extractor.c
        @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final Constructor getConstructor() {
            return DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    });
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingAlwaysEnabled;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private int tsMode = 1;
    private int tsTimestampSearchBytes = 112800;
    private ImmutableList<Format> tsSubtitleFormats = ImmutableList.of();

    /* JADX INFO: Access modifiers changed from: private */
    static final class ExtensionLoader {
        private final ConstructorSupplier constructorSupplier;
        private final AtomicBoolean extensionLoaded = new AtomicBoolean(false);

        @Nullable
        @GuardedBy("extensionLoaded")
        private Constructor<? extends Extractor> extractorConstructor;

        public interface ConstructorSupplier {
            @Nullable
            Constructor<? extends Extractor> getConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public ExtensionLoader(ConstructorSupplier constructorSupplier) {
            this.constructorSupplier = constructorSupplier;
        }

        @Nullable
        private Constructor<? extends Extractor> maybeLoadExtractorConstructor() {
            synchronized (this.extensionLoaded) {
                if (this.extensionLoaded.get()) {
                    return this.extractorConstructor;
                }
                try {
                    return this.constructorSupplier.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.extensionLoaded.set(true);
                    return this.extractorConstructor;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        @Nullable
        public Extractor getExtractor(Object... objArr) {
            Constructor<? extends Extractor> constructorMaybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (constructorMaybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return constructorMaybeLoadExtractorConstructor.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void addExtractorsForFileType(int i10, List<Extractor> list) {
        switch (i10) {
            case 0:
                list.add(new Ac3Extractor());
                break;
            case 1:
                list.add(new Ac4Extractor());
                break;
            case 2:
                list.add(new AdtsExtractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.adtsFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 3:
                list.add(new AmrExtractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.amrFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 4:
                Extractor extractor = FLAC_EXTENSION_LOADER.getExtractor(Integer.valueOf(this.flacFlags));
                if (extractor == null) {
                    list.add(new FlacExtractor(this.flacFlags));
                } else {
                    list.add(extractor);
                }
                break;
            case 5:
                list.add(new FlvExtractor());
                break;
            case 6:
                list.add(new MatroskaExtractor(this.matroskaFlags));
                break;
            case 7:
                list.add(new Mp3Extractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.mp3Flags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 8:
                list.add(new FragmentedMp4Extractor(this.fragmentedMp4Flags));
                list.add(new Mp4Extractor(this.mp4Flags));
                break;
            case 9:
                list.add(new OggExtractor());
                break;
            case 10:
                list.add(new PsExtractor());
                break;
            case 11:
                list.add(new TsExtractor(this.tsMode, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(this.tsFlags, this.tsSubtitleFormats), this.tsTimestampSearchBytes));
                break;
            case 12:
                list.add(new WavExtractor());
                break;
            case 14:
                list.add(new JpegExtractor());
                break;
            case 15:
                Extractor extractor2 = MIDI_EXTENSION_LOADER.getExtractor(new Object[0]);
                if (extractor2 != null) {
                    list.add(extractor2);
                }
                break;
            case 16:
                list.add(new AviExtractor());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Constructor<? extends Extractor> getFlacExtractorConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends Extractor> getMidiExtractorConstructor() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(null);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized Extractor[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setAdtsExtractorFlags(int i10) {
        this.adtsFlags = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setAmrExtractorFlags(int i10) {
        this.amrFlags = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setConstantBitrateSeekingAlwaysEnabled(boolean z10) {
        this.constantBitrateSeekingAlwaysEnabled = z10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean z10) {
        this.constantBitrateSeekingEnabled = z10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setFlacExtractorFlags(int i10) {
        this.flacFlags = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int i10) {
        this.fragmentedMp4Flags = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setMatroskaExtractorFlags(int i10) {
        this.matroskaFlags = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setMp3ExtractorFlags(int i10) {
        this.mp3Flags = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setMp4ExtractorFlags(int i10) {
        this.mp4Flags = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setTsExtractorFlags(int i10) {
        this.tsFlags = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setTsExtractorMode(int i10) {
        this.tsMode = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setTsExtractorTimestampSearchBytes(int i10) {
        this.tsTimestampSearchBytes = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized DefaultExtractorsFactory setTsSubtitleFormats(List<Format> list) {
        this.tsSubtitleFormats = ImmutableList.copyOf((Collection) list);
        return this;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = DEFAULT_EXTRACTOR_ORDER;
            arrayList = new ArrayList(iArr.length);
            int iInferFileTypeFromResponseHeaders = FileTypes.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                addExtractorsForFileType(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                addExtractorsForFileType(iInferFileTypeFromUri, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iInferFileTypeFromResponseHeaders && i10 != iInferFileTypeFromUri) {
                    addExtractorsForFileType(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
    }
}
