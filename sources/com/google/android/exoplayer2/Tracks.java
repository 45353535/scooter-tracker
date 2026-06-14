package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Tracks implements Bundleable {
    private final ImmutableList<Group> groups;
    public static final Tracks EMPTY = new Tracks(ImmutableList.of());
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    public static final Bundleable.Creator<Tracks> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.l5
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Tracks.a(bundle);
        }
    };

    public static final class Group implements Bundleable {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<Group> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.m5
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Tracks.Group.a(bundle);
            }
        };

        public Group(TrackGroup trackGroup, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = trackGroup.length;
            this.length = i10;
            boolean z11 = false;
            Assertions.checkArgument(i10 == iArr.length && i10 == zArr.length);
            this.mediaTrackGroup = trackGroup;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.adaptiveSupported = z11;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public static /* synthetic */ Group a(Bundle bundle) {
            TrackGroup trackGroup = (TrackGroup) TrackGroup.CREATOR.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP)));
            return new Group(trackGroup, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) MoreObjects.firstNonNull(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroup.length]), (boolean[]) MoreObjects.firstNonNull(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroup.length]));
        }

        public Group copyWithId(String str) {
            return new Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i10) {
            return this.mediaTrackGroup.getFormat(i10);
        }

        public int getTrackSupport(int i10) {
            return this.trackSupport[i10];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return (((((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31) + Arrays.hashCode(this.trackSupport)) * 31) + Arrays.hashCode(this.trackSelected);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSelected() {
            return Booleans.contains(this.trackSelected, true);
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSelected(int i10) {
            return this.trackSelected[i10];
        }

        public boolean isTrackSupported(int i10) {
            return isTrackSupported(i10, false);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        public boolean isSupported(boolean z10) {
            for (int i10 = 0; i10 < this.trackSupport.length; i10++) {
                if (isTrackSupported(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSupported(int i10, boolean z10) {
            int i11 = this.trackSupport[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }
    }

    public Tracks(List<Group> list) {
        this.groups = ImmutableList.copyOf((Collection) list);
    }

    public static /* synthetic */ Tracks a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return new Tracks(parcelableArrayList == null ? ImmutableList.of() : BundleableUtil.fromBundleList(Group.CREATOR, parcelableArrayList));
    }

    public boolean containsType(int i10) {
        for (int i11 = 0; i11 < this.groups.size(); i11++) {
            if (this.groups.get(i11).getType() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public ImmutableList<Group> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean isTypeSelected(int i10) {
        for (int i11 = 0; i11 < this.groups.size(); i11++) {
            Group group = this.groups.get(i11);
            if (group.isSelected() && group.getType() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i10) {
        return isTypeSupported(i10, false);
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i10) {
        return isTypeSupportedOrEmpty(i10, false);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleableUtil.toBundleArrayList(this.groups));
        return bundle;
    }

    public boolean isTypeSupported(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.groups.size(); i11++) {
            if (this.groups.get(i11).getType() == i10 && this.groups.get(i11).isSupported(z10)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i10, boolean z10) {
        return !containsType(i10) || isTypeSupported(i10, z10);
    }
}
