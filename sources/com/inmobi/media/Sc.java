package com.inmobi.media;

import android.webkit.URLUtil;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3807jd f37705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X2 f37706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4 f37707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Nc f37708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rc f37709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3878m9 f37710f;

    public Sc(C3807jd nativeLandingPageHandler, X2 clickSession, D4 contextualDataHandler, Nc nativeBeaconProcessor, Rc nativeClickModel, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeClickModel, "nativeClickModel");
        this.f37705a = nativeLandingPageHandler;
        this.f37706b = clickSession;
        this.f37707c = contextualDataHandler;
        this.f37708d = nativeBeaconProcessor;
        this.f37709e = nativeClickModel;
        this.f37710f = interfaceC3878m9;
    }

    public final void a(short s10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37710f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeClickProcessor", "onAssetClickEvent: assetType=" + ((int) s10));
        }
        if (s10 == 7) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37710f;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("NativeClickProcessor", "Processing AD_CHOICE asset click");
            }
            a();
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f37710f;
        if (interfaceC3878m93 != null) {
            ((C3903n9) interfaceC3878m93).a("NativeClickProcessor", "Processing native asset click, tracking user interaction");
        }
        this.f37707c.f();
        ((AbstractC3669e1) this.f37706b).a(InteractionType.CLICK);
        b(s10);
    }

    public final void b(short s10) {
        List list;
        Rc rc2 = this.f37709e;
        C3865ll c3865ll = rc2.f37655a;
        ArrayList arrayListA = null;
        String str = c3865ll != null ? c3865ll.f38993a : null;
        List listA = Qc.a(rc2);
        InterfaceC3878m9 interfaceC3878m9 = this.f37710f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeClickProcessor", "processNativeAssetClick: assetId=" + ((int) s10) + ", VAST clickThroughUrl=" + str + ", VAST trackers count=" + listA.size());
        }
        if (!G3.a(str)) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37710f;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("NativeClickProcessor", "VAST URL is not a network URL, using response asset click URL");
            }
            Rc rc3 = this.f37709e;
            Intrinsics.checkNotNullParameter(rc3, "<this>");
            Kc kc2 = (Kc) rc3.f37656b.f39939a.get(Short.valueOf(s10));
            String str2 = kc2 != null ? kc2.f37218a : null;
            Rc rc4 = this.f37709e;
            Intrinsics.checkNotNullParameter(rc4, "<this>");
            Kc kc3 = (Kc) rc4.f37656b.f39939a.get(Short.valueOf(s10));
            if (kc3 != null && (list = kc3.f37219b) != null) {
                arrayListA = AbstractC4197z4.a("click", list);
            }
            List listEmptyList = arrayListA == null ? CollectionsKt.emptyList() : arrayListA;
            InterfaceC3878m9 interfaceC3878m93 = this.f37710f;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).a("NativeClickProcessor", "Response asset URL=" + str2 + ", trackers count=" + listEmptyList.size());
            }
            str = str2;
            listA = listEmptyList;
        }
        a((short) 0, str, listA);
    }

    public final void a(AbstractC3603bc mediaEvent) {
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        InterfaceC3878m9 interfaceC3878m9 = this.f37710f;
        if (interfaceC3878m9 != null) {
            String simpleName = kotlin.jvm.internal.v0.b(mediaEvent.getClass()).getSimpleName();
            Intrinsics.checkNotNullParameter(mediaEvent, "<this>");
            ((C3903n9) interfaceC3878m9).a("NativeClickProcessor", "processIfMediaClickEvent: mediaEvent type=" + simpleName + ", isClickEvent=" + ((mediaEvent instanceof C3788ij) || (mediaEvent instanceof Ol) || (mediaEvent instanceof Q3)));
        }
        Intrinsics.checkNotNullParameter(mediaEvent, "<this>");
        boolean z10 = mediaEvent instanceof C3788ij;
        if (z10 || (mediaEvent instanceof Ol) || (mediaEvent instanceof Q3)) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37710f;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("NativeClickProcessor", "Media click event detected, tracking user interaction");
            }
            this.f37707c.f();
            ((AbstractC3669e1) this.f37706b).a(InteractionType.CLICK);
            if (z10) {
                InterfaceC3878m9 interfaceC3878m93 = this.f37710f;
                if (interfaceC3878m93 != null) {
                    ((C3903n9) interfaceC3878m93).a("NativeClickProcessor", "Processing StaticClick event");
                }
                a((C3788ij) mediaEvent);
                return;
            }
            if (mediaEvent instanceof Ol) {
                InterfaceC3878m9 interfaceC3878m94 = this.f37710f;
                if (interfaceC3878m94 != null) {
                    ((C3903n9) interfaceC3878m94).a("NativeClickProcessor", "Processing VideoClick event");
                }
                b();
                return;
            }
            if (mediaEvent instanceof Q3) {
                InterfaceC3878m9 interfaceC3878m95 = this.f37710f;
                if (interfaceC3878m95 != null) {
                    ((C3903n9) interfaceC3878m95).a("NativeClickProcessor", "Processing CompanionClick event");
                }
                a((Q3) mediaEvent);
                return;
            }
            InterfaceC3878m9 interfaceC3878m96 = this.f37710f;
            if (interfaceC3878m96 != null) {
                ((C3903n9) interfaceC3878m96).a("NativeClickProcessor", "Unknown media event type, ignoring");
            }
        }
    }

    public final void b() {
        Rc rc2 = this.f37709e;
        C3865ll c3865ll = rc2.f37655a;
        String str = c3865ll != null ? c3865ll.f38993a : null;
        List listA = Qc.a(rc2);
        InterfaceC3878m9 interfaceC3878m9 = this.f37710f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeClickProcessor", "processVideoClickEvent: VAST clickThroughUrl=" + str + ", trackers count=" + listA.size());
        }
        a((short) 0, str, listA);
    }

    public final void a() {
        Rc rc2 = this.f37709e;
        Intrinsics.checkNotNullParameter(rc2, "<this>");
        Kc kc2 = (Kc) rc2.f37656b.f39939a.get((short) 7);
        String str = kc2 != null ? kc2.f37218a : null;
        InterfaceC3878m9 interfaceC3878m9 = this.f37710f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeClickProcessor", "processAdChoiceAssetClick: url=" + str + ", isNetworkUrl=" + (str != null ? Boolean.valueOf(URLUtil.isNetworkUrl(str)) : null));
        }
        if (str != null && URLUtil.isNetworkUrl(str)) {
            this.f37705a.b(str, null);
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f37710f;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a("NativeClickProcessor", "AdChoice URL is null or not a network URL, skipping");
        }
    }

    public final void a(C3788ij c3788ij) {
        Rc rc2 = this.f37709e;
        C3865ll c3865ll = rc2.f37655a;
        String str = c3865ll != null ? c3865ll.f38993a : null;
        List listA = Qc.a(rc2);
        InterfaceC3878m9 interfaceC3878m9 = this.f37710f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeClickProcessor", "processStaticClickEvent: VAST clickThroughUrl=" + str);
        }
        List list = listA;
        if (!G3.a(str)) {
            InterfaceC3878m9 interfaceC3878m92 = this.f37710f;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("NativeClickProcessor", "VAST URL is not a network URL, using static click URL");
            }
            str = c3788ij.f38769a;
            ArrayList arrayList = c3788ij.f38770b;
            InterfaceC3878m9 interfaceC3878m93 = this.f37710f;
            list = arrayList;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).a("NativeClickProcessor", "Static click URL=" + str + ", trackers count=" + arrayList.size());
                list = arrayList;
            }
        }
        a((short) 0, str, list);
    }

    public final void a(Q3 q32) {
        C3865ll c3865ll = this.f37709e.f37655a;
        String str = c3865ll != null ? c3865ll.f38993a : null;
        ArrayList arrayList = q32.f37572a;
        boolean zIsEmpty = arrayList.isEmpty();
        List listA = arrayList;
        if (zIsEmpty) {
            listA = Qc.a(this.f37709e);
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f37710f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeClickProcessor", "processCompanionClick: VAST clickThroughUrl=" + str + ", companion trackers count=" + q32.f37572a.size() + ", using VAST trackers=" + q32.f37572a.isEmpty());
        }
        a((short) 1, str, listA);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(short s10, String str, List list) {
        List list2;
        InterfaceC3878m9 interfaceC3878m9 = this.f37710f;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("NativeClickProcessor", "processAssetData: assetType=" + ((int) s10) + ", url=" + str + ", assetTrackers count=" + list.size());
        }
        Rc rc2 = this.f37709e;
        Intrinsics.checkNotNullParameter(rc2, "<this>");
        ArrayList arrayListA = AbstractC4197z4.a("click", rc2.f37656b.f39941c);
        List listPlus = CollectionsKt.plus((Collection) list, (Iterable) arrayListA);
        InterfaceC3878m9 interfaceC3878m92 = this.f37710f;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a("NativeClickProcessor", "Response click trackers count=" + arrayListA.size() + ", combined trackers count=" + listPlus.size());
        }
        if (G3.a(str)) {
            list2 = listPlus;
        } else {
            InterfaceC3878m9 interfaceC3878m93 = this.f37710f;
            if (interfaceC3878m93 != null) {
                ((C3903n9) interfaceC3878m93).a("NativeClickProcessor", "URL is not a network URL, using main link from response");
            }
            MainLink mainLink = this.f37709e.f37656b.f39940b;
            str = mainLink != null ? mainLink.getUrl() : null;
            MainLink mainLink2 = this.f37709e.f37656b.f39940b;
            fallbackUrl = mainLink2 != null ? mainLink2.getFallbackUrl() : null;
            InterfaceC3878m9 interfaceC3878m94 = this.f37710f;
            list2 = arrayListA;
            if (interfaceC3878m94 != null) {
                ((C3903n9) interfaceC3878m94).a("NativeClickProcessor", "Main link URL=" + str + ", fallbackUrl=" + fallbackUrl);
                list2 = arrayListA;
            }
        }
        if (str == null) {
            InterfaceC3878m9 interfaceC3878m95 = this.f37710f;
            if (interfaceC3878m95 != null) {
                ((C3903n9) interfaceC3878m95).a("NativeClickProcessor", "Final URL is null, skipping click processing");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m96 = this.f37710f;
        if (interfaceC3878m96 != null) {
            ((C3903n9) interfaceC3878m96).a("NativeClickProcessor", "Handling click: finalUrl=" + str + ", fallbackUrl=" + fallbackUrl + ", firing " + list2.size() + " beacons");
        }
        this.f37705a.b(str, fallbackUrl);
        this.f37708d.a(s10, list2);
    }
}
