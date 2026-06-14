package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Cc extends AbstractC3669e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f36669h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc(CoroutineScope coroutineScope, C3903n9 c3903n9) {
        super(coroutineScope, c3903n9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36670g = Cc.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC3669e1
    public final void a(String omsdkScript, List omidTrackers, Map macros, String str, String customReferenceData, boolean z10) {
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeAdSessionManager", "initializeAdSession");
        }
        P4.a(this.f38483a, new Bc(this, AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, z10), W0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }

    @Override // com.inmobi.media.AbstractC3669e1
    public final void a() {
        if (this.f38487e == null) {
            String tag = this.f36670g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
        } else {
            P4.a(this.f38483a, new C3747h2(this, null));
        }
    }
}
