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
public final class Ae extends AbstractC4145x2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f36571i = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(CoroutineScope coroutineScope, InterfaceC3878m9 interfaceC3878m9) {
        super(coroutineScope, interfaceC3878m9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    @Override // com.inmobi.media.AbstractC3669e1
    public final void a(String omsdkScript, List omidTrackers, Map macros, String str, String customReferenceData, boolean z10) {
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        InterfaceC3878m9 interfaceC3878m9 = this.f38484b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeVideoAdSessionManager", "initializeAdSession");
        }
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        P4.a(this.f38483a, new C4207ze(this, AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, z10), W0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }
}
