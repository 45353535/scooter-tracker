package com.ironsource;

import com.ironsource.AbstractC4478p3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4579v3<Smash extends AbstractC4478p3<?>> extends xg<Smash> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45617h;

    public /* synthetic */ C4579v3(int i10, boolean z10, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, list, (i11 & 8) != 0 ? false : z11);
    }

    @Override // com.ironsource.xg
    public void c(@NotNull Smash smash) {
        String str;
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.f45617h = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        IronSourceUtils.i(str);
    }

    @Override // com.ironsource.xg
    public boolean e() {
        return super.e() || this.f45617h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4579v3(int i10, boolean z10, @NotNull List<? extends Smash> waterfall, boolean z11) {
        super(i10, z10, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.f45617h = z11;
    }
}
