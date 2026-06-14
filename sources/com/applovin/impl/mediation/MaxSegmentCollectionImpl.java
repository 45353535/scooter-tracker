package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MaxSegmentCollectionImpl extends MaxSegmentCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9399b;

    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9400a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f9400a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f9399b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f9398a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f9398a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f9400a;
        this.f9398a = list;
        this.f9399b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f9399b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
