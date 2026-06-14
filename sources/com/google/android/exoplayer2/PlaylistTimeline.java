package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final Timeline[] timelines;
    private final Object[] uids;
    private final int windowCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int windowCount = 0;
        int size = collection.size();
        this.firstPeriodInChildIndices = new int[size];
        this.firstWindowInChildIndices = new int[size];
        this.timelines = new Timeline[size];
        this.uids = new Object[size];
        this.childIndexByUid = new HashMap<>();
        int periodCount = 0;
        int i10 = 0;
        for (MediaSourceInfoHolder mediaSourceInfoHolder : collection) {
            this.timelines[i10] = mediaSourceInfoHolder.getTimeline();
            this.firstWindowInChildIndices[i10] = windowCount;
            this.firstPeriodInChildIndices[i10] = periodCount;
            windowCount += this.timelines[i10].getWindowCount();
            periodCount += this.timelines[i10].getPeriodCount();
            this.uids[i10] = mediaSourceInfoHolder.getUid();
            this.childIndexByUid.put(this.uids[i10], Integer.valueOf(i10));
            i10++;
        }
        this.windowCount = windowCount;
        this.periodCount = periodCount;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByChildUid(Object obj) {
        Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByPeriodIndex(int i10) {
        return Util.binarySearchFloor(this.firstPeriodInChildIndices, i10 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByWindowIndex(int i10) {
        return Util.binarySearchFloor(this.firstWindowInChildIndices, i10 + 1, false, false);
    }

    List<Timeline> getChildTimelines() {
        return Arrays.asList(this.timelines);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected Object getChildUidByChildIndex(int i10) {
        return this.uids[i10];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getFirstPeriodIndexByChildIndex(int i10) {
        return this.firstPeriodInChildIndices[i10];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getFirstWindowIndexByChildIndex(int i10) {
        return this.firstWindowInChildIndices[i10];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.periodCount;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected Timeline getTimelineByChildIndex(int i10) {
        return this.timelines[i10];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return this.windowCount;
    }
}
