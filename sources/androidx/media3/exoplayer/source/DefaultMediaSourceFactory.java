package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.ExternallyLoadedMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";

    @Nullable
    private AdViewProvider adViewProvider;

    @Nullable
    private AdsLoader.Provider adsLoaderProvider;
    private DataSource.Factory dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;

    @Nullable
    private ExternalLoader externalImageLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;

    @Nullable
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean parseSubtitlesDuringExtraction;

    @Nullable
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private SubtitleParser.Factory subtitleParserFactory;

    @UnstableApi
    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class DelegateFactoryLoader {

        @Nullable
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private DataSource.Factory dataSourceFactory;

        @Nullable
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final ExtractorsFactory extractorsFactory;

        @Nullable
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private SubtitleParser.Factory subtitleParserFactory;
        private final Map<Integer, Supplier<MediaSource.Factory>> mediaSourceFactorySuppliers = new HashMap();
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories = new HashMap();
        private boolean parseSubtitlesDuringExtraction = true;

        public DelegateFactoryLoader(ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory) {
            this.extractorsFactory = extractorsFactory;
            this.subtitleParserFactory = factory;
        }

        public static /* synthetic */ MediaSource.Factory c(DelegateFactoryLoader delegateFactoryLoader, DataSource.Factory factory) {
            return new ProgressiveMediaSource.Factory(factory, delegateFactoryLoader.extractorsFactory);
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        private Supplier<MediaSource.Factory> loadSupplier(int i10) throws ClassNotFoundException {
            Supplier<MediaSource.Factory> supplier;
            Supplier<MediaSource.Factory> supplier2;
            Supplier<MediaSource.Factory> supplier3 = this.mediaSourceFactorySuppliers.get(Integer.valueOf(i10));
            if (supplier3 != null) {
                return supplier3;
            }
            final DataSource.Factory factory = (DataSource.Factory) Assertions.checkNotNull(this.dataSourceFactory);
            if (i10 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.f
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass, factory);
                    }
                };
            } else if (i10 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.g
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass2, factory);
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.i
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return DefaultMediaSourceFactory.newInstance(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.j
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return DefaultMediaSourceFactory.DelegateFactoryLoader.c(this.f5166b, factory);
                            }
                        };
                    }
                    this.mediaSourceFactorySuppliers.put(Integer.valueOf(i10), supplier2);
                    return supplier2;
                }
                final Class clsAsSubclass4 = HlsMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.h
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass4, factory);
                    }
                };
            }
            supplier2 = supplier;
            this.mediaSourceFactorySuppliers.put(Integer.valueOf(i10), supplier2);
            return supplier2;
        }

        @Nullable
        @CanIgnoreReturnValue
        private Supplier<MediaSource.Factory> maybeLoadSupplier(int i10) {
            try {
                return loadSupplier(i10);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public MediaSource.Factory getMediaSourceFactory(int i10) throws ClassNotFoundException {
            MediaSource.Factory factory = this.mediaSourceFactories.get(Integer.valueOf(i10));
            if (factory != null) {
                return factory;
            }
            MediaSource.Factory factory2 = loadSupplier(i10).get();
            CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            factory2.setSubtitleParserFactory(this.subtitleParserFactory);
            factory2.experimentalParseSubtitlesDuringExtraction(this.parseSubtitlesDuringExtraction);
            this.mediaSourceFactories.put(Integer.valueOf(i10), factory2);
            return factory2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return Ints.toArray(this.mediaSourceFactorySuppliers.keySet());
        }

        public void setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(factory);
            }
        }

        public void setDataSourceFactory(DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setJpegExtractorFlags(int i10) {
            ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory) extractorsFactory).setJpegExtractorFlags(i10);
            }
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z10) {
            this.parseSubtitlesDuringExtraction = z10;
            this.extractorsFactory.experimentalSetTextTrackTranscodingEnabled(z10);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z10);
            }
        }

        public void setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = factory;
            this.extractorsFactory.setSubtitleParserFactory(factory);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(factory);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format format;

        public UnknownSubtitlesExtractor(Format format) {
            this.format = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public /* synthetic */ List getSniffFailureDetails() {
            return androidx.media3.extractor.d.a(this);
        }

        @Override // androidx.media3.extractor.Extractor
        public /* synthetic */ Extractor getUnderlyingImplementation() {
            return androidx.media3.extractor.d.b(this);
        }

        @Override // androidx.media3.extractor.Extractor
        public void init(ExtractorOutput extractorOutput) {
            TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
            extractorOutput.endTracks();
            trackOutputTrack.format(this.format.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(this.format.sampleMimeType).build());
        }

        @Override // androidx.media3.extractor.Extractor
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
            return extractorInput.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.Extractor
        public void release() {
        }

        @Override // androidx.media3.extractor.Extractor
        public void seek(long j10, long j11) {
        }

        @Override // androidx.media3.extractor.Extractor
        public boolean sniff(ExtractorInput extractorInput) {
            return true;
        }
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    public static /* synthetic */ Extractor[] a(DefaultMediaSourceFactory defaultMediaSourceFactory, Format format) {
        return new Extractor[]{defaultMediaSourceFactory.subtitleParserFactory.supportsFormat(format) ? new SubtitleExtractor(defaultMediaSourceFactory.subtitleParserFactory.create(format), format) : new UnknownSubtitlesExtractor(format)};
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        if (clippingConfiguration.startPositionUs == 0 && clippingConfiguration.endPositionUs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) {
            return mediaSource;
        }
        MediaItem.ClippingConfiguration clippingConfiguration2 = mediaItem.clippingConfiguration;
        return new ClippingMediaSource(mediaSource, clippingConfiguration2.startPositionUs, clippingConfiguration2.endPositionUs, !clippingConfiguration2.startsAtKeyFrame, clippingConfiguration2.relativeToLiveWindow, clippingConfiguration2.relativeToDefaultPosition);
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoader.Provider provider = this.adsLoaderProvider;
        AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object objOf = adsConfiguration.adsId;
        if (objOf == null) {
            objOf = ImmutableList.of((Uri) mediaItem.mediaId, mediaItem.localConfiguration.uri, adsConfiguration.adTagUri);
        }
        return new AdsMediaSource(mediaSource, dataSpec, objOf, this, adsLoader, adViewProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
        try {
            return cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    public MediaSource createMediaSource(MediaItem mediaItem) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((MediaSource.Factory) Assertions.checkNotNull(this.serverSideAdInsertionMediaSourceFactory)).createMediaSource(mediaItem);
        }
        if (Objects.equals(mediaItem.localConfiguration.mimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
            return new ExternallyLoadedMediaSource.Factory(Util.msToUs(mediaItem.localConfiguration.imageDurationMs), (ExternalLoader) Assertions.checkNotNull(this.externalImageLoader)).createMediaSource(mediaItem);
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != -9223372036854775807L) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
        }
        try {
            MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
            MediaItem.LiveConfiguration.Builder builderBuildUpon = mediaItem.liveConfiguration.buildUpon();
            if (mediaItem.liveConfiguration.targetOffsetMs == -9223372036854775807L) {
                builderBuildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
            }
            if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
            }
            if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
            }
            if (mediaItem.liveConfiguration.minOffsetMs == -9223372036854775807L) {
                builderBuildUpon.setMinOffsetMs(this.liveMinOffsetMs);
            }
            if (mediaItem.liveConfiguration.maxOffsetMs == -9223372036854775807L) {
                builderBuildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
            }
            MediaItem.LiveConfiguration liveConfigurationBuild = builderBuildUpon.build();
            if (!liveConfigurationBuild.equals(mediaItem.liveConfiguration)) {
                mediaItem = mediaItem.buildUpon().setLiveConfiguration(liveConfigurationBuild).build();
            }
            MediaSource mediaSourceCreateMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
            ImmutableList<MediaItem.SubtitleConfiguration> immutableList = ((MediaItem.LocalConfiguration) Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
            if (!immutableList.isEmpty()) {
                MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
                mediaSourceArr[0] = mediaSourceCreateMediaSource;
                for (int i10 = 0; i10 < immutableList.size(); i10++) {
                    if (this.parseSubtitlesDuringExtraction) {
                        final Format formatBuild = new Format.Builder().setSampleMimeType(immutableList.get(i10).mimeType).setLanguage(immutableList.get(i10).language).setSelectionFlags(immutableList.get(i10).selectionFlags).setRoleFlags(immutableList.get(i10).roleFlags).setLabel(immutableList.get(i10).label).setId(immutableList.get(i10).f4633id).build();
                        ProgressiveMediaSource.Factory factory = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new ExtractorsFactory() { // from class: androidx.media3.exoplayer.source.e
                            @Override // androidx.media3.extractor.ExtractorsFactory
                            public final Extractor[] createExtractors() {
                                return DefaultMediaSourceFactory.a(this.f5157a, formatBuild);
                            }

                            @Override // androidx.media3.extractor.ExtractorsFactory
                            public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z10) {
                                return androidx.media3.extractor.f.b(this, z10);
                            }

                            @Override // androidx.media3.extractor.ExtractorsFactory
                            public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory2) {
                                return androidx.media3.extractor.f.c(this, factory2);
                            }

                            @Override // androidx.media3.extractor.ExtractorsFactory
                            public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
                                return androidx.media3.extractor.f.a(this, uri, map);
                            }
                        });
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy != null) {
                            factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                        }
                        mediaSourceArr[i10 + 1] = factory.createMediaSource(MediaItem.fromUri(immutableList.get(i10).uri.toString()));
                    } else {
                        SingleSampleMediaSource.Factory factory2 = new SingleSampleMediaSource.Factory(this.dataSourceFactory);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy2 != null) {
                            factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                        }
                        mediaSourceArr[i10 + 1] = factory2.createMediaSource(immutableList.get(i10), -9223372036854775807L);
                    }
                }
                mediaSourceCreateMediaSource = new MergingMediaSource(mediaSourceArr);
            }
            return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, mediaSourceCreateMediaSource));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @CanIgnoreReturnValue
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory setAdViewProvider(@Nullable AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory setAdsLoaderProvider(@Nullable AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader.setDataSourceFactory(factory);
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setExternalImageLoader(@Nullable ExternalLoader externalLoader) {
        this.externalImageLoader = externalLoader;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j10) {
        this.liveMaxOffsetMs = j10;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveMaxSpeed(float f10) {
        this.liveMaxSpeed = f10;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j10) {
        this.liveMinOffsetMs = j10;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveMinSpeed(float f10) {
        this.liveMinSpeed = f10;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j10) {
        this.liveTargetOffsetMs = j10;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLocalAdInsertionComponents(AdsLoader.Provider provider, AdViewProvider adViewProvider) {
        this.adsLoaderProvider = (AdsLoader.Provider) Assertions.checkNotNull(provider);
        this.adViewProvider = (AdViewProvider) Assertions.checkNotNull(adViewProvider);
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(@Nullable MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    @UnstableApi
    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSource.Factory(context), extractorsFactory);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory experimentalParseSubtitlesDuringExtraction(boolean z10) {
        this.parseSubtitlesDuringExtraction = z10;
        this.delegateFactoryLoader.setParseSubtitlesDuringExtraction(z10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        this.delegateFactoryLoader.setCmcdConfigurationFactory((CmcdConfiguration.Factory) Assertions.checkNotNull(factory));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        this.delegateFactoryLoader.setDrmSessionManagerProvider((DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        this.subtitleParserFactory = (SubtitleParser.Factory) Assertions.checkNotNull(factory);
        this.delegateFactoryLoader.setSubtitleParserFactory(factory);
        return this;
    }

    @UnstableApi
    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @UnstableApi
    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory = new DefaultSubtitleParserFactory();
        this.subtitleParserFactory = defaultSubtitleParserFactory;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(extractorsFactory, defaultSubtitleParserFactory);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = -9223372036854775807L;
        this.liveMinOffsetMs = -9223372036854775807L;
        this.liveMaxOffsetMs = -9223372036854775807L;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }
}
