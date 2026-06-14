package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;
import com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
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

/* JADX INFO: loaded from: classes7.dex */
public final class HlsMediaPeriod implements MediaPeriod, HlsSampleStreamWrapper.Callback, HlsPlaylistTracker.PlaylistEventListener {
    private final Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;

    @Nullable
    private MediaPeriod.Callback callback;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HlsExtractorFactory extractorFactory;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private final TransferListener mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final PlayerId playerId;
    private final HlsPlaylistTracker playlistTracker;
    private TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final IdentityHashMap<SampleStream, Integer> streamWrapperIndices = new IdentityHashMap<>();
    private final TimestampAdjusterProvider timestampAdjusterProvider = new TimestampAdjusterProvider();
    private HlsSampleStreamWrapper[] sampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private int[][] manifestUrlIndicesPerWrapper = new int[0][];

    public HlsMediaPeriod(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z10, int i10, boolean z11, PlayerId playerId) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = transferListener;
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
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
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
                String strValueOf = String.valueOf(str);
                String strConcat = strValueOf.length() != 0 ? "audio:".concat(strValueOf) : new String("audio:");
                HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(strConcat, 1, (Uri[]) arrayList.toArray((Uri[]) Util.castNonNullTypeArray(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.EMPTY_LIST, map, j10);
                list3.add(Ints.toArray(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z10) {
                    hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new TrackGroup[]{new TrackGroup(strConcat, (Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void buildAndPrepareMainSampleStreamWrapper(HlsMultivariantPlaylist hlsMultivariantPlaylist, long j10, List<HlsSampleStreamWrapper> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z10;
        boolean z11;
        int size = hlsMultivariantPlaylist.variants.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < hlsMultivariantPlaylist.variants.size(); i12++) {
            Format format = hlsMultivariantPlaylist.variants.get(i12).format;
            if (format.height > 0 || Util.getCodecsOfType(format.codecs, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (Util.getCodecsOfType(format.codecs, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            z10 = true;
            size = i10;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z11 = true;
            z10 = false;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        Format[] formatArr = new Format[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < hlsMultivariantPlaylist.variants.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                HlsMultivariantPlaylist.Variant variant = hlsMultivariantPlaylist.variants.get(i14);
                uriArr[i13] = variant.url;
                formatArr[i13] = variant.format;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = formatArr[0].codecs;
        int codecCountOfType = Util.getCodecCountOfType(str, 2);
        int codecCountOfType2 = Util.getCodecCountOfType(str, 1);
        boolean z12 = codecCountOfType2 <= 1 && codecCountOfType <= 1 && codecCountOfType2 + codecCountOfType > 0;
        HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(C4240b4.i.Z, (z10 || codecCountOfType2 <= 0) ? 0 : 1, uriArr, formatArr, hlsMultivariantPlaylist.muxedAudioFormat, hlsMultivariantPlaylist.muxedCaptionFormats, map, j10);
        list.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
        list2.add(iArr2);
        if (this.allowChunklessPreparation && z12) {
            ArrayList arrayList = new ArrayList();
            if (codecCountOfType > 0) {
                Format[] formatArr2 = new Format[size];
                for (int i15 = 0; i15 < size; i15++) {
                    formatArr2[i15] = deriveVideoFormat(formatArr[i15]);
                }
                arrayList.add(new TrackGroup(C4240b4.i.Z, formatArr2));
                if (codecCountOfType2 > 0 && (hlsMultivariantPlaylist.muxedAudioFormat != null || hlsMultivariantPlaylist.audios.isEmpty())) {
                    arrayList.add(new TrackGroup(C4240b4.i.Z.concat(":audio"), deriveAudioFormat(formatArr[0], hlsMultivariantPlaylist.muxedAudioFormat, false)));
                }
                List<Format> list3 = hlsMultivariantPlaylist.muxedCaptionFormats;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        StringBuilder sb2 = new StringBuilder(C4240b4.i.Z.length() + 15);
                        sb2.append(C4240b4.i.Z);
                        sb2.append(":cc:");
                        sb2.append(i16);
                        arrayList.add(new TrackGroup(sb2.toString(), list3.get(i16)));
                    }
                }
            } else {
                Format[] formatArr3 = new Format[size];
                for (int i17 = 0; i17 < size; i17++) {
                    formatArr3[i17] = deriveAudioFormat(formatArr[i17], hlsMultivariantPlaylist.muxedAudioFormat, true);
                }
                arrayList.add(new TrackGroup(C4240b4.i.Z, formatArr3));
            }
            TrackGroup trackGroup = new TrackGroup(C4240b4.i.Z.concat(":id3"), new Format.Builder().setId("ID3").setSampleMimeType("application/id3").build());
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
            String str = rendition.name;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21);
            sb2.append("subtitle:");
            sb2.append(i11);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(str);
            String string = sb2.toString();
            Uri[] uriArr = new Uri[1];
            uriArr[i10] = rendition.url;
            Format[] formatArr = new Format[1];
            formatArr[i10] = rendition.format;
            Map<String, DrmInitData> map = mapDeriveOverridingDrmInitData;
            int i12 = i10;
            HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(string, 3, uriArr, formatArr, null, Collections.EMPTY_LIST, map, j10);
            mapDeriveOverridingDrmInitData = map;
            arrayList2.add(new int[]{i11});
            arrayList.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
            Format[] formatArr2 = new Format[1];
            formatArr2[i12] = rendition.format;
            TrackGroup[] trackGroupArr = new TrackGroup[1];
            trackGroupArr[i12] = new TrackGroup(string, formatArr2);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(trackGroupArr, i12, new int[i12]);
            i11++;
            i10 = i12;
        }
        int i13 = i10;
        this.sampleStreamWrappers = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[i13]);
        this.manifestUrlIndicesPerWrapper = (int[][]) arrayList2.toArray(new int[i13][]);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
        this.pendingPrepareCount = hlsSampleStreamWrapperArr.length;
        hlsSampleStreamWrapperArr[i13].setIsTimestampMaster(true);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.sampleStreamWrappers;
        int length = hlsSampleStreamWrapperArr2.length;
        while (i10 < length) {
            hlsSampleStreamWrapperArr2[i10].continuePreparing();
            i10++;
        }
        this.enabledSampleStreamWrappers = this.sampleStreamWrappers;
    }

    private HlsSampleStreamWrapper buildSampleStreamWrapper(String str, int i10, Uri[] uriArr, Format[] formatArr, @Nullable Format format, @Nullable List<Format> list, Map<String, DrmInitData> map, long j10) {
        return new HlsSampleStreamWrapper(str, i10, this, new HlsChunkSource(this.extractorFactory, this.playlistTracker, uriArr, formatArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, list, this.playerId), map, this.allocator, j10, format, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.eventDispatcher, this.metadataType);
    }

    private static Format deriveAudioFormat(Format format, @Nullable Format format2, boolean z10) {
        String codecsOfType;
        Metadata metadata;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        if (format2 != null) {
            codecsOfType = format2.codecs;
            metadata = format2.metadata;
            i11 = format2.channelCount;
            i10 = format2.selectionFlags;
            i12 = format2.roleFlags;
            str = format2.language;
            str2 = format2.label;
        } else {
            codecsOfType = Util.getCodecsOfType(format.codecs, 1);
            metadata = format.metadata;
            if (z10) {
                i11 = format.channelCount;
                i10 = format.selectionFlags;
                i12 = format.roleFlags;
                str = format.language;
                str2 = format.label;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
        }
        return new Format.Builder().setId(format.f24619id).setLabel(str2).setContainerMimeType(format.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(metadata).setAverageBitrate(z10 ? format.averageBitrate : -1).setPeakBitrate(z10 ? format.peakBitrate : -1).setChannelCount(i11).setSelectionFlags(i10).setRoleFlags(i12).setLanguage(str).build();
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
        return new Format.Builder().setId(format.f24619id).setLabel(format.label).setContainerMimeType(format.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(format.metadata).setAverageBitrate(format.averageBitrate).setPeakBitrate(format.peakBitrate).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).build();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j10) {
        if (this.trackGroups != null) {
            return this.compositeSequenceableLoader.continueLoading(j10);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j10, z10);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            if (hlsSampleStreamWrapper.isVideoSampleStream()) {
                return hlsSampleStreamWrapper.getAdjustedSeekPositionUs(j10, seekParameters);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
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

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.onPlaylistUpdated();
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z10) {
        boolean zOnPlaylistError = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            zOnPlaylistError &= hlsSampleStreamWrapper.onPlaylistError(uri, loadErrorInfo, z10);
        }
        this.callback.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
    public void onPlaylistRefreshRequired(Uri uri) {
        this.playlistTracker.refreshPlaylist(uri);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
    public void onPrepared() {
        int i10 = this.pendingPrepareCount - 1;
        this.pendingPrepareCount = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            i11 += hlsSampleStreamWrapper.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i11];
        int i12 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : this.sampleStreamWrappers) {
            int i13 = hlsSampleStreamWrapper2.getTrackGroups().length;
            int i14 = 0;
            while (i14 < i13) {
                trackGroupArr[i12] = hlsSampleStreamWrapper2.getTrackGroups().get(i14);
                i14++;
                i12++;
            }
        }
        this.trackGroups = new TrackGroupArray(trackGroupArr);
        this.callback.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j10);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.compositeSequenceableLoader.reevaluateBuffer(j10);
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.callback = null;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
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
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r21, boolean[] r22, com.google.android.exoplayer2.source.SampleStream[] r23, boolean[] r24, long r25) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaPeriod.selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[], boolean[], com.google.android.exoplayer2.source.SampleStream[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.callback.onContinueLoadingRequested(this);
    }
}
