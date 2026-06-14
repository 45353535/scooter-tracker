package com.google.android.exoplayer2.source.dash.manifest;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AdaptationSet {
    public static final int ID_UNSET = -1;
    public final List<Descriptor> accessibilityDescriptors;
    public final List<Descriptor> essentialProperties;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final int f25075id;
    public final List<Representation> representations;
    public final List<Descriptor> supplementalProperties;
    public final int type;

    public AdaptationSet(int i10, int i11, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        this.f25075id = i10;
        this.type = i11;
        this.representations = DesugarCollections.unmodifiableList(list);
        this.accessibilityDescriptors = DesugarCollections.unmodifiableList(list2);
        this.essentialProperties = DesugarCollections.unmodifiableList(list3);
        this.supplementalProperties = DesugarCollections.unmodifiableList(list4);
    }
}
