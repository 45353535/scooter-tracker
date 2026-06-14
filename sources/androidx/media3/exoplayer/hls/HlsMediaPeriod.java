package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class HlsMediaPeriod implements MediaPeriod, HlsPlaylistTracker.PlaylistEventListener {
    private final Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HlsExtractorFactory extractorFactory;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private MediaPeriod.Callback mediaPeriodCallback;

    @Nullable
    private final TransferListener mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final PlayerId playerId;
    private final HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final HlsSampleStreamWrapper.Callback sampleStreamWrapperCallback = new SampleStreamWrapperCallback();
    private final IdentityHashMap<SampleStream, Integer> streamWrapperIndices = new IdentityHashMap<>();
    private final TimestampAdjusterProvider timestampAdjusterProvider = new TimestampAdjusterProvider();
    private HlsSampleStreamWrapper[] sampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private int[][] manifestUrlIndicesPerWrapper = new int[0][];

    private class SampleStreamWrapperCallback implements HlsSampleStreamWrapper.Callback {
        private SampleStreamWrapperCallback() {
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPlaylistRefreshRequired(Uri uri) {
            HlsMediaPeriod.this.playlistTracker.refreshPlaylist(uri);
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPrepared() {
            if (HlsMediaPeriod.access$106(HlsMediaPeriod.this) > 0) {
                return;
            }
            int i10 = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper : HlsMediaPeriod.this.sampleStreamWrappers) {
                i10 += hlsSampleStreamWrapper.getTrackGroups().length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i10];
            int i11 = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : HlsMediaPeriod.this.sampleStreamWrappers) {
                int i12 = hlsSampleStreamWrapper2.getTrackGroups().length;
                int i13 = 0;
                while (i13 < i12) {
                    trackGroupArr[i11] = hlsSampleStreamWrapper2.getTrackGroups().get(i13);
                    i13++;
                    i11++;
                }
            }
            HlsMediaPeriod.this.trackGroups = new TrackGroupArray(trackGroupArr);
            HlsMediaPeriod.this.mediaPeriodCallback.onPrepared(HlsMediaPeriod.this);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
            HlsMediaPeriod.this.mediaPeriodCallback.onContinueLoadingRequested(HlsMediaPeriod.this);
        }
    }

    public HlsMediaPeriod(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z10, int i10, boolean z11, PlayerId playerId, long j10) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.allowChunklessPreparation = z10;
        this.metadataType = i10;
        this.useSessionKeys = z11;
        this.playerId = playerId;
        this.timestampAdjusterInitializationTimeoutMs = j10;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
    }

    static /* synthetic */ int access$106(HlsMediaPeriod hlsMediaPeriod) {
        int i10 = hlsMediaPeriod.pendingPrepareCount - 1;
        hlsMediaPeriod.pendingPrepareCount = i10;
        return i10;
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long j10, List<HlsMultivariantPlaylist.Rendition> list, List<HlsSampleStreamWrapper> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).name;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (Util.areEqual(str, list.get(i11).name)) {
                        HlsMultivariantPlaylist.Rendition rendition = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(rendition.url);
                        arrayList2.add(rendition.format);
                        z10 &= Util.getCodecCountOfType(rendition.format.codecs, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str2, 1, (Uri[]) arrayList.toArray((Uri[]) Util.castNonNullTypeArray(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.EMPTY_LIST, map, j10);
                list3.add(Ints.toArray(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z10) {
                    hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new TrackGroup[]{new TrackGroup(str2, (Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void buildAndPrepareMainSampleStreamWrapper(HlsMultivariantPlaylist hlsMultivariantPlaylist, long j10, List<HlsSampleStreamWrapper> list, List<int[]> list2, Map<String, DrmInitData> map) {
        int i10;
        boolean z10;
        boolean z11;
        int size = hlsMultivariantPlaylist.variants.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < hlsMultivariantPlaylist.variants.size(); i13++) {
            Format format = hlsMultivariantPlaylist.variants.get(i13).format;
            if (format.height > 0 || Util.getCodecsOfType(format.codecs, 2) != null) {
                iArr[i13] = 2;
                i11++;
            } else if (Util.getCodecsOfType(format.codecs, 1) != null) {
                iArr[i13] = 1;
                i12++;
            } else {
                iArr[i13] = -1;
            }
        }
        if (i11 > 0) {
            i10 = i11;
            z10 = true;
            z11 = false;
        } else if (i12 < size) {
            i10 = size - i12;
            z11 = true;
            z10 = false;
        } else {
            i10 = size;
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[i10];
        Format[] formatArr = new Format[i10];
        int[] iArr2 = new int[i10];
        int i14 = 0;
        for (int i15 = 0; i15 < hlsMultivariantPlaylist.variants.size(); i15++) {
            if ((!z10 || iArr[i15] == 2) && (!z11 || iArr[i15] != 1)) {
                HlsMultivariantPlaylist.Variant variant = hlsMultivariantPlaylist.variants.get(i15);
                uriArr[i14] = variant.url;
                formatArr[i14] = variant.format;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = formatArr[0].codecs;
        int codecCountOfType = Util.getCodecCountOfType(str, 2);
        int codecCountOfType2 = Util.getCodecCountOfType(str, 1);
        boolean z12 = (codecCountOfType2 == 1 || (codecCountOfType2 == 0 && hlsMultivariantPlaylist.audios.isEmpty())) && codecCountOfType <= 1 && codecCountOfType2 + codecCountOfType > 0;
        HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(C4240b4.i.Z, (z10 || codecCountOfType2 <= 0) ? 0 : 1, uriArr, formatArr, hlsMultivariantPlaylist.muxedAudioFormat, hlsMultivariantPlaylist.muxedCaptionFormats, map, j10);
        list.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
        list2.add(iArr2);
        if (this.allowChunklessPreparation && z12) {
            ArrayList arrayList = new ArrayList();
            if (codecCountOfType > 0) {
                Format[] formatArr2 = new Format[i10];
                for (int i16 = 0; i16 < i10; i16++) {
                    formatArr2[i16] = deriveVideoFormat(formatArr[i16]);
                }
                arrayList.add(new TrackGroup(C4240b4.i.Z, formatArr2));
                if (codecCountOfType2 > 0 && (hlsMultivariantPlaylist.muxedAudioFormat != null || hlsMultivariantPlaylist.audios.isEmpty())) {
                    arrayList.add(new TrackGroup(C4240b4.i.Z + ":audio", deriveAudioFormat(formatArr[0], hlsMultivariantPlaylist.muxedAudioFormat, false)));
                }
                List<Format> list3 = hlsMultivariantPlaylist.muxedCaptionFormats;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new TrackGroup(C4240b4.i.Z + ":cc:" + i17, this.extractorFactory.getOutputTextFormat(list3.get(i17))));
                    }
                }
            } else {
                Format[] formatArr3 = new Format[i10];
                for (int i18 = 0; i18 < i10; i18++) {
                    formatArr3[i18] = deriveAudioFormat(formatArr[i18], hlsMultivariantPlaylist.muxedAudioFormat, true);
                }
                arrayList.add(new TrackGroup(C4240b4.i.Z, formatArr3));
            }
            TrackGroup trackGroup = new TrackGroup(C4240b4.i.Z + ":id3", new Format.Builder().setId("ID3").setSampleMimeType("application/id3").build());
            arrayList.add(trackGroup);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
        }
    }

    private void buildAndPrepareSampleStreamWrappers(long j10) {
        int i10 = 0;
        HlsMultivariantPlaylist hlsMultivariantPlaylist = (HlsMultivariantPlaylist) Assertions.checkNotNull(this.playlistTracker.getMultivariantPlaylist());
        Map<String, DrmInitData> mapDeriveOverridingDrmInitData = this.useSessionKeys ? deriveOverridingDrmInitData(hlsMultivariantPlaylist.sessionKeyDrmInitData) : Collections.EMPTY_MAP;
        boolean zIsEmpty = hlsMultivariantPlaylist.variants.isEmpty();
        List<HlsMultivariantPlaylist.Rendition> list = hlsMultivariantPlaylist.audios;
        List<HlsMultivariantPlaylist.Rendition> list2 = hlsMultivariantPlaylist.subtitles;
        this.pendingPrepareCount = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            buildAndPrepareMainSampleStreamWrapper(hlsMultivariantPlaylist, j10, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        }
        buildAndPrepareAudioSampleStreamWrappers(j10, list, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        this.audioVideoSampleStreamWrapperCount = arrayList.size();
        int i11 = 0;
        while (i11 < list2.size()) {
            HlsMultivariantPlaylist.Rendition rendition = list2.get(i11);
            String str = "subtitle:" + i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + rendition.name;
            Format format = rendition.format;
            Uri[] uriArr = new Uri[1];
            uriArr[i10] = rendition.url;
            Format[] formatArr = new Format[1];
            formatArr[i10] = format;
            Map<String, DrmInitData> map = mapDeriveOverridingDrmInitData;
            int i12 = i10;
            HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str, 3, uriArr, formatArr, null, Collections.EMPTY_LIST, map, j10);
            mapDeriveOverridingDrmInitData = map;
            arrayList2.add(new int[]{i11});
            arrayList.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
            Format[] formatArr2 = new Format[1];
            formatArr2[i12] = this.extractorFactory.getOutputTextFormat(format);
            TrackGroup[] trackGroupArr = new TrackGroup[1];
            trackGroupArr[i12] = new TrackGroup(str, formatArr2);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(trackGroupArr, i12, new int[i12]);
            i11++;
            i10 = i12;
        }
        int i13 = i10;
        this.sampleStreamWrappers = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[i13]);
        this.manifestUrlIndicesPerWrapper = (int[][]) arrayList2.toArray(new int[i13][]);
        this.pendingPrepareCount = this.sampleStreamWrappers.length;
        for (int i14 = i13; i14 < this.audioVideoSampleStreamWrapperCount; i14++) {
            this.sampleStreamWrappers[i14].setIsPrimaryTimestampSource(true);
        }
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
        int length = hlsSampleStreamWrapperArr.length;
        for (int i15 = i13; i15 < length; i15++) {
            hlsSampleStreamWrapperArr[i15].continuePreparing();
        }
        this.enabledSampleStreamWrappers = this.sampleStreamWrappers;
    }

    private HlsSampleStreamWrapper buildSampleStreamWrapper(String str, int i10, Uri[] uriArr, Format[] formatArr, @Nullable Format format, @Nullable List<Format> list, Map<String, DrmInitData> map, long j10) {
        return new HlsSampleStreamWrapper(str, i10, this.sampleStreamWrapperCallback, new HlsChunkSource(this.extractorFactory, this.playlistTracker, uriArr, formatArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, list, this.playerId, this.cmcdConfiguration), map, this.allocator, j10, format, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.eventDispatcher, this.metadataType);
    }

    private static Format deriveAudioFormat(Format format, @Nullable Format format2, boolean z10) {
        Metadata metadata;
        int i10;
        String str;
        String str2;
        List<Label> list;
        int i11;
        int i12;
        String str3;
        ImmutableList immutableListOf = ImmutableList.of();
        if (format2 != null) {
            str2 = format2.codecs;
            metadata = format2.metadata;
            i11 = format2.channelCount;
            i10 = format2.selectionFlags;
            i12 = format2.roleFlags;
            str = format2.language;
            str3 = format2.label;
            list = format2.labels;
        } else {
            String codecsOfType = Util.getCodecsOfType(format.codecs, 1);
            metadata = format.metadata;
            if (z10) {
                i11 = format.channelCount;
                i10 = format.selectionFlags;
                i12 = format.roleFlags;
                str = format.language;
                str3 = format.label;
                str2 = codecsOfType;
                list = format.labels;
            } else {
                i10 = 0;
                str = null;
                str2 = codecsOfType;
                list = immutableListOf;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        return new Format.Builder().setId(format.f4631id).setLabel(str3).setLabels(list).setContainerMimeType(format.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(str2)).setCodecs(str2).setMetadata(metadata).setAverageBitrate(z10 ? format.averageBitrate : -1).setPeakBitrate(z10 ? format.peakBitrate : -1).setChannelCount(i11).setSelectionFlags(i10).setRoleFlags(i12).setLanguage(str).build();
    }

    private static Map<String, DrmInitData> deriveOverridingDrmInitData(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitDataMerge = list.get(i10);
            String str = drmInitDataMerge.schemeType;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataMerge = drmInitDataMerge.merge(drmInitData);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, drmInitDataMerge);
        }
        return map;
    }

    private static Format deriveVideoFormat(Format format) {
        String codecsOfType = Util.getCodecsOfType(format.codecs, 2);
        return new Format.Builder().setId(format.f4631id).setLabel(format.label).setLabels(format.labels).setContainerMimeType(format.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(format.metadata).setAverageBitrate(format.averageBitrate).setPeakBitrate(format.peakBitrate).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).build();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.trackGroups != null) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j10, z10);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            if (hlsSampleStreamWrapper.isVideoSampleStream()) {
                return hlsSampleStreamWrapper.getAdjustedSeekPositionUs(j10, seekParameters);
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        int[] iArr;
        TrackGroupArray trackGroups;
        int primaryTrackGroupIndex;
        int i10;
        HlsMediaPeriod hlsMediaPeriod = this;
        HlsMultivariantPlaylist hlsMultivariantPlaylist = (HlsMultivariantPlaylist) Assertions.checkNotNull(hlsMediaPeriod.playlistTracker.getMultivariantPlaylist());
        boolean zIsEmpty = hlsMultivariantPlaylist.variants.isEmpty();
        boolean z10 = !zIsEmpty;
        int length = hlsMediaPeriod.sampleStreamWrappers.length - hlsMultivariantPlaylist.subtitles.size();
        int i11 = 0;
        if (zIsEmpty) {
            iArr = new int[0];
            trackGroups = TrackGroupArray.EMPTY;
            primaryTrackGroupIndex = 0;
        } else {
            HlsSampleStreamWrapper hlsSampleStreamWrapper = hlsMediaPeriod.sampleStreamWrappers[0];
            iArr = hlsMediaPeriod.manifestUrlIndicesPerWrapper[0];
            trackGroups = hlsSampleStreamWrapper.getTrackGroups();
            primaryTrackGroupIndex = hlsSampleStreamWrapper.getPrimaryTrackGroupIndex();
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        for (ExoTrackSelection exoTrackSelection : list) {
            TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                ?? r15 = z10;
                i10 = i11;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = hlsMediaPeriod.sampleStreamWrappers;
                    if (r15 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[r15].getTrackGroups().indexOf(trackGroup) != -1) {
                        int i12 = r15 < length ? 1 : 2;
                        int[] iArr2 = hlsMediaPeriod.manifestUrlIndicesPerWrapper[r15];
                        for (int i13 = i10; i13 < exoTrackSelection.length(); i13++) {
                            arrayList.add(new StreamKey(i12, iArr2[exoTrackSelection.getIndexInTrackGroup(i13)]));
                        }
                    } else {
                        hlsMediaPeriod = this;
                        r15++;
                    }
                }
            } else if (iIndexOf == primaryTrackGroupIndex) {
                for (int i14 = i11; i14 < exoTrackSelection.length(); i14++) {
                    arrayList.add(new StreamKey(i11, iArr[exoTrackSelection.getIndexInTrackGroup(i14)]));
                }
                i10 = i11;
                z12 = true;
            } else {
                i10 = i11;
                z11 = true;
            }
            hlsMediaPeriod = this;
            i11 = i10;
        }
        int i15 = i11;
        if (z11 && !z12) {
            int i16 = iArr[i15];
            int i17 = hlsMultivariantPlaylist.variants.get(i16).format.bitrate;
            for (int i18 = 1; i18 < iArr.length; i18++) {
                int i19 = hlsMultivariantPlaylist.variants.get(iArr[i18]).format.bitrate;
                if (i19 < i17) {
                    i16 = iArr[i18];
                    i17 = i19;
                }
            }
            arrayList.add(new StreamKey(i15, i16));
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.onPlaylistUpdated();
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z10) {
        boolean zOnPlaylistError = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            zOnPlaylistError &= hlsSampleStreamWrapper.onPlaylistError(uri, loadErrorInfo, z10);
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.mediaPeriodCallback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j10);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.compositeSequenceableLoader.reevaluateBuffer(j10);
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.mediaPeriodCallback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j10) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.enabledSampleStreamWrappers;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zSeekToUs = hlsSampleStreamWrapperArr[0].seekToUs(j10, false);
            int i10 = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.enabledSampleStreamWrappers;
                if (i10 >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i10].seekToUs(j10, zSeekToUs);
                i10++;
            }
            if (zSeekToUs) {
                this.timestampAdjusterProvider.reset();
            }
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] r21, boolean[] r22, androidx.media3.exoplayer.source.SampleStream[] r23, boolean[] r24, long r25) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaPeriod.selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[], boolean[], androidx.media3.exoplayer.source.SampleStream[], boolean[], long):long");
    }
}
