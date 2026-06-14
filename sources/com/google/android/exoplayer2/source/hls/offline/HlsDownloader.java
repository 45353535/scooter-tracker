package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import androidx.media3.exoplayer.hls.offline.a;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class HlsDownloader extends SegmentDownloader<HlsPlaylist> {
    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new a());
    }

    private void addMediaPlaylistDataSpecs(List<Uri> list, List<DataSpec> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list2.add(SegmentDownloader.getCompressibleDataSpec(list.get(i10)));
        }
    }

    private void addSegment(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist.Segment segment, HashSet<Uri> hashSet, ArrayList<SegmentDownloader.Segment> arrayList) {
        String str = hlsMediaPlaylist.baseUri;
        long j10 = hlsMediaPlaylist.startTimeUs + segment.relativeStartTimeUs;
        String str2 = segment.fullSegmentEncryptionKeyUri;
        if (str2 != null) {
            Uri uriResolveToUri = UriUtil.resolveToUri(str, str2);
            if (hashSet.add(uriResolveToUri)) {
                arrayList.add(new SegmentDownloader.Segment(j10, SegmentDownloader.getCompressibleDataSpec(uriResolveToUri)));
            }
        }
        arrayList.add(new SegmentDownloader.Segment(j10, new DataSpec(UriUtil.resolveToUri(str, segment.url), segment.byteRangeOffset, segment.byteRangeLength)));
    }

    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new HlsPlaylistParser(), factory, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, HlsPlaylist hlsPlaylist, boolean z10) throws InterruptedException, IOException {
        ArrayList<DataSpec> arrayList = new ArrayList();
        if (hlsPlaylist instanceof HlsMultivariantPlaylist) {
            addMediaPlaylistDataSpecs(((HlsMultivariantPlaylist) hlsPlaylist).mediaPlaylistUrls, arrayList);
        } else {
            arrayList.add(SegmentDownloader.getCompressibleDataSpec(Uri.parse(hlsPlaylist.baseUri)));
        }
        ArrayList<SegmentDownloader.Segment> arrayList2 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        for (DataSpec dataSpec : arrayList) {
            arrayList2.add(new SegmentDownloader.Segment(0L, dataSpec));
            try {
                HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) getManifest(dataSource, dataSpec, z10);
                List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
                HlsMediaPlaylist.Segment segment = null;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    HlsMediaPlaylist.Segment segment2 = list.get(i10);
                    HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                    if (segment3 != null && segment3 != segment) {
                        addSegment(hlsMediaPlaylist, segment3, hashSet, arrayList2);
                        segment = segment3;
                    }
                    addSegment(hlsMediaPlaylist, segment2, hashSet, arrayList2);
                }
            } catch (IOException e10) {
                if (!z10) {
                    throw e10;
                }
            }
        }
        return arrayList2;
    }

    public HlsDownloader(MediaItem mediaItem, ParsingLoadable.Parser<HlsPlaylist> parser, CacheDataSource.Factory factory, Executor executor) {
        super(mediaItem, parser, factory, executor);
    }
}
