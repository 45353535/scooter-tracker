package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HlsMultivariantPlaylist extends HlsPlaylist {
    public static final HlsMultivariantPlaylist EMPTY;
    public static final int GROUP_INDEX_AUDIO = 1;
    public static final int GROUP_INDEX_SUBTITLE = 2;
    public static final int GROUP_INDEX_VARIANT = 0;
    public final List<Rendition> audios;
    public final List<Rendition> closedCaptions;
    public final List<Uri> mediaPlaylistUrls;

    @Nullable
    public final Format muxedAudioFormat;

    @Nullable
    public final List<Format> muxedCaptionFormats;
    public final List<DrmInitData> sessionKeyDrmInitData;
    public final List<Rendition> subtitles;
    public final Map<String, String> variableDefinitions;
    public final List<Variant> variants;
    public final List<Rendition> videos;

    public static final class Rendition {
        public final Format format;
        public final String groupId;
        public final String name;

        @Nullable
        public final Uri url;

        public Rendition(@Nullable Uri uri, Format format, String str, String str2) {
            this.url = uri;
            this.format = format;
            this.groupId = str;
            this.name = str2;
        }
    }

    public static final class Variant {

        @Nullable
        public final String audioGroupId;

        @Nullable
        public final String captionGroupId;
        public final Format format;

        @Nullable
        public final String subtitleGroupId;
        public final Uri url;

        @Nullable
        public final String videoGroupId;

        public Variant(Uri uri, Format format, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.url = uri;
            this.format = format;
            this.videoGroupId = str;
            this.audioGroupId = str2;
            this.subtitleGroupId = str3;
            this.captionGroupId = str4;
        }

        public static Variant createMediaPlaylistVariantUrl(Uri uri) {
            return new Variant(uri, new Format.Builder().setId("0").setContainerMimeType("application/x-mpegURL").build(), null, null, null, null);
        }

        public Variant copyWithFormat(Format format) {
            return new Variant(this.url, format, this.videoGroupId, this.audioGroupId, this.subtitleGroupId, this.captionGroupId);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        EMPTY = new HlsMultivariantPlaylist("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public HlsMultivariantPlaylist(String str, List<String> list, List<Variant> list2, List<Rendition> list3, List<Rendition> list4, List<Rendition> list5, List<Rendition> list6, @Nullable Format format, @Nullable List<Format> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        this.mediaPlaylistUrls = DesugarCollections.unmodifiableList(getMediaPlaylistUrls(list2, list3, list4, list5, list6));
        this.variants = DesugarCollections.unmodifiableList(list2);
        this.videos = DesugarCollections.unmodifiableList(list3);
        this.audios = DesugarCollections.unmodifiableList(list4);
        this.subtitles = DesugarCollections.unmodifiableList(list5);
        this.closedCaptions = DesugarCollections.unmodifiableList(list6);
        this.muxedAudioFormat = format;
        this.muxedCaptionFormats = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.variableDefinitions = DesugarCollections.unmodifiableMap(map);
        this.sessionKeyDrmInitData = DesugarCollections.unmodifiableList(list8);
    }

    private static void addMediaPlaylistUrls(List<Rendition> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).url;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> copyStreams(List<T> list, int i10, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = list2.get(i12);
                    if (streamKey.groupIndex == i10 && streamKey.streamIndex == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static HlsMultivariantPlaylist createSingleVariantMultivariantPlaylist(String str) {
        List listSingletonList = Collections.singletonList(Variant.createMediaPlaylistVariantUrl(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new HlsMultivariantPlaylist("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List<Uri> getMediaPlaylistUrls(List<Variant> list, List<Rendition> list2, List<Rendition> list3, List<Rendition> list4, List<Rendition> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).url;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        addMediaPlaylistUrls(list2, arrayList);
        addMediaPlaylistUrls(list3, arrayList);
        addMediaPlaylistUrls(list4, arrayList);
        addMediaPlaylistUrls(list5, arrayList);
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        String str = this.baseUri;
        List<String> list2 = this.tags;
        List listCopyStreams = copyStreams(this.variants, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new HlsMultivariantPlaylist(str, list2, listCopyStreams, list3, copyStreams(this.audios, 1, list), copyStreams(this.subtitles, 2, list), list3, this.muxedAudioFormat, this.muxedCaptionFormats, this.hasIndependentSegments, this.variableDefinitions, this.sessionKeyDrmInitData);
    }
}
