package com.google.common.graph;

import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractGraphBuilder<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f30557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f30558b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ElementOrder f30559c = ElementOrder.insertion();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ElementOrder f30560d = ElementOrder.unordered();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Optional f30561e = Optional.absent();

    AbstractGraphBuilder(boolean z10) {
        this.f30557a = z10;
    }
}
