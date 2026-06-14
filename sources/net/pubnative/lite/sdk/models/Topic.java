package net.pubnative.lite.sdk.models;

import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class Topic {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f95873id;
    private final long taxonomyVersion;
    private final String taxonomyVersionName;

    public Topic(int i10, long j10, String str) {
        this.f95873id = i10;
        this.taxonomyVersion = j10;
        this.taxonomyVersionName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Topic topic = (Topic) obj;
            if (this.f95873id == topic.f95873id && this.taxonomyVersion == topic.taxonomyVersion) {
                return true;
            }
        }
        return false;
    }

    public int getId() {
        return this.f95873id;
    }

    public Long getTaxonomyVersion() {
        return Long.valueOf(this.taxonomyVersion);
    }

    public String getTaxonomyVersionName() {
        return this.taxonomyVersionName;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f95873id), Long.valueOf(this.taxonomyVersion));
    }
}
