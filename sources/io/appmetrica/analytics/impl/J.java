package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5068ef f75971a = C5468ua.k().z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavableToggle f75972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f75973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f75974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f75975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f75976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SavableToggle f75977g;

    public J(C5204jm c5204jm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f75972b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f75973c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f75974d = outerStateToggle2;
        this.f75975e = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt.listOf((Object[]) new SimpleThreadSafeToggle[]{savableToggle, outerStateToggle}), IronSourceConstants.TYPE_GAID);
        this.f75976f = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt.listOf((Object[]) new SimpleThreadSafeToggle[]{savableToggle, outerStateToggle2}), "HOAID");
        this.f75977g = savableToggle;
        a(c5204jm);
    }

    public final void a(C5204jm c5204jm) {
        boolean z10 = c5204jm.f77555p;
        boolean z11 = true;
        this.f75973c.update(!z10 || c5204jm.f77553n.f78210c);
        OuterStateToggle outerStateToggle = this.f75974d;
        if (z10 && !c5204jm.f77553n.f78212e) {
            z11 = false;
        }
        outerStateToggle.update(z11);
    }

    public final G a() {
        int i10;
        int i11 = 3;
        int i12 = 4;
        if (this.f75975e.getActualState()) {
            i10 = 1;
        } else if (this.f75972b.getActualState()) {
            i10 = !this.f75973c.getActualState() ? 3 : 4;
        } else {
            i10 = 2;
        }
        if (this.f75976f.getActualState()) {
            i11 = 1;
        } else if (!this.f75972b.getActualState()) {
            i11 = 2;
        } else if (this.f75974d.getActualState()) {
            i11 = 4;
        }
        if (this.f75977g.getActualState()) {
            i12 = 1;
        } else if (!this.f75972b.getActualState()) {
            i12 = 2;
        }
        return new G(i10, i11, i12);
    }
}
