package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Period {
    public final List<AdaptationSet> adaptationSets;

    @Nullable
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    public final String f25077id;
    public final long startMs;

    public Period(@Nullable String str, long j10, List<AdaptationSet> list) {
        this(str, j10, list, Collections.EMPTY_LIST, null);
    }

    public int getAdaptationSetIndex(int i10) {
        int size = this.adaptationSets.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.adaptationSets.get(i11).type == i10) {
                return i11;
            }
        }
        return -1;
    }

    public Period(@Nullable String str, long j10, List<AdaptationSet> list, List<EventStream> list2) {
        this(str, j10, list, list2, null);
    }

    public Period(@Nullable String str, long j10, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        this.f25077id = str;
        this.startMs = j10;
        this.adaptationSets = DesugarCollections.unmodifiableList(list);
        this.eventStreams = DesugarCollections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }
}
