package com.inmobi.media;

import com.inmobi.media.C4082ue;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4082ue extends AbstractC4167y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4036si f39670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sg f39671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D4 f39672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC3669e1 f39673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nc f39674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ec f39675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f39676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f39677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f39678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lazy f39679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f39680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f39681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f39682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Lazy f39683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f39684p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4082ue(C4036si renderedStateCache, Sg publisherNativeViewData, D4 contextualDataHandler, AbstractC3669e1 adSessionManager, Nc nativeBeaconProcessor, Ec nativeAdUnitComponent) {
        super(nativeAdUnitComponent.f36789a);
        Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.f39670b = renderedStateCache;
        this.f39671c = publisherNativeViewData;
        this.f39672d = contextualDataHandler;
        this.f39673e = adSessionManager;
        this.f39674f = nativeBeaconProcessor;
        this.f39675g = nativeAdUnitComponent;
        this.f39676h = P4.a(k());
        this.f39677i = lf.i.a(new Function0() { // from class: w3.xa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4082ue.g(this.f107383b);
            }
        });
        this.f39678j = lf.i.a(new Function0() { // from class: w3.ya
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4082ue.c(this.f107400b);
            }
        });
        this.f39679k = lf.i.a(new Function0() { // from class: w3.za
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4082ue.e(this.f107417b);
            }
        });
        this.f39680l = lf.i.a(new Function0() { // from class: w3.ab
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4082ue.h(this.f106981b);
            }
        });
        this.f39681m = lf.i.a(new Function0() { // from class: w3.bb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4082ue.b(this.f106995b);
            }
        });
        this.f39682n = lf.i.a(new Function0() { // from class: w3.cb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4082ue.a(this.f107009b);
            }
        });
        this.f39683o = lf.i.a(new Function0() { // from class: w3.db
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4082ue.f(this.f107023b);
            }
        });
        this.f39684p = lf.i.a(new Function0() { // from class: w3.eb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4082ue.d(this.f107041b);
            }
        });
    }

    public static final C3912ni a(C4082ue c4082ue) {
        return new C3912ni(c4082ue.f39672d, c4082ue.f39673e, c4082ue.f39675g);
    }

    public static final Sc b(C4082ue c4082ue) {
        Ec ec2 = c4082ue.f39675g;
        AbstractC3669e1 clickSession = c4082ue.f39673e;
        D4 contextualDataHandler = c4082ue.f39672d;
        Nc nativeBeaconProcessor = c4082ue.f39674f;
        C3807jd nativeLandingPageHandler = (C3807jd) c4082ue.f39684p.getValue();
        InterfaceC3878m9 interfaceC3878m9L = c4082ue.l();
        Intrinsics.checkNotNullParameter(ec2, "<this>");
        Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        Intrinsics.checkNotNullParameter(ec2, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonAssetObject assetsObject = ec2.f36790b.getAssetsObject();
        if (assetsObject != null) {
            Title title = assetsObject.getTitle();
            if (title != null) {
                Link link = title.getLink();
                linkedHashMap.put((short) 3, new Kc(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            Description description = assetsObject.getDescription();
            if (description != null) {
                Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new Kc(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            Icon icon = assetsObject.getIcon();
            if (icon != null) {
                Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new Kc(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            CTA cta = assetsObject.getCta();
            if (cta != null) {
                Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new Kc(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new Kc(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new Kc(ec2.f36789a.f39883b.f36898a.f39234b.getNative().getAdChoiceConfig().getLink(), CollectionsKt.emptyList()));
            }
        }
        return new Sc(nativeLandingPageHandler, clickSession, contextualDataHandler, nativeBeaconProcessor, new Rc(ec2.f36793e, new C4161xi(linkedHashMap, ec2.f36790b.getMainLink(), ec2.f36789a.f39883b.f36904g)), interfaceC3878m9L);
    }

    public static final C3707fd c(C4082ue c4082ue) {
        CoroutineScope coroutineScope = c4082ue.f39676h;
        C4091un c4091un = (C4091un) c4082ue.f39677i.getValue();
        Ec ec2 = c4082ue.f39675g;
        Intrinsics.checkNotNullParameter(ec2, "<this>");
        AdConfig.NativeViewabilityConfig viewabilityConfig = ec2.f36789a.f39883b.f36898a.f39234b.getNative().getViewabilityConfig();
        F f10 = ec2.f36789a.f39883b.f36910m;
        C4166xn c4166xn = new C4166xn(viewabilityConfig.getImpressionConfig().getPollInterval(), f10.f36820d, AbstractC3766hl.a(viewabilityConfig.getParentMinDimension().getDimensions()), f10.f36819c);
        MutableStateFlow mutableStateFlow = ((yo) c4082ue.f39680l.getValue()).f40024b;
        c4082ue.l();
        return new C3707fd(coroutineScope, c4091un, c4166xn, mutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.inmobi.media.C3807jd d(com.inmobi.media.C4082ue r19) {
        /*
            r0 = r19
            com.inmobi.media.kd r1 = new com.inmobi.media.kd
            com.inmobi.media.Ec r2 = r0.f39675g
            com.inmobi.media.x r2 = r2.f36789a
            com.inmobi.media.o1 r2 = r2.f39882a
            android.content.Context r2 = r2.f39144b
            com.inmobi.media.x r3 = r0.f39960a
            com.inmobi.media.G r3 = r3.f39883b
            com.inmobi.media.ads.network.common.model.MetaInfo r4 = r3.f36901d
            r5 = 0
            if (r4 == 0) goto L2b
            java.util.List r4 = r4.getLandingPageParams()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = kotlin.collections.CollectionsKt.getOrNull(r4, r5)
            com.inmobi.media.ads.network.common.model.LandingPageParam r4 = (com.inmobi.media.ads.network.common.model.LandingPageParam) r4
            if (r4 == 0) goto L2b
            boolean r4 = r4.getSupportLockScreen()
            r6 = 1
            if (r4 != r6) goto L2b
            goto L2c
        L2b:
            r6 = r5
        L2c:
            com.inmobi.media.Za r4 = new com.inmobi.media.Za
            com.inmobi.media.x r7 = r0.f39960a
            com.inmobi.media.G r7 = r7.f39883b
            com.inmobi.media.p1 r8 = r7.f36898a
            com.inmobi.media.Jg r8 = r8.f39233a
            long r9 = r8.f37141a
            com.inmobi.media.F r11 = r7.f36910m
            java.lang.String r11 = r11.f36818b
            java.lang.String r8 = r8.f37147g
            java.lang.String r13 = r7.f36900c
            com.inmobi.media.ads.network.common.model.MetaInfo r7 = r7.f36901d
            if (r7 == 0) goto L4d
            java.lang.String r7 = r7.getCreativeType()
            if (r7 != 0) goto L4b
            goto L4d
        L4b:
            r14 = r7
            goto L50
        L4d:
            java.lang.String r7 = "unknown"
            goto L4b
        L50:
            com.inmobi.media.Ec r7 = r0.f39675g
            com.inmobi.media.x r7 = r7.f36789a
            com.inmobi.media.G r7 = r7.f39883b
            java.lang.String r7 = r7.f36906i
            if (r7 != 0) goto L5c
            java.lang.String r7 = ""
        L5c:
            r15 = r7
            com.inmobi.media.x r7 = r0.f39960a
            com.inmobi.media.G r7 = r7.f39883b
            com.inmobi.media.D r12 = r7.f36899b
            boolean r12 = r12.f36691a
            com.inmobi.media.ads.network.common.model.MetaInfo r7 = r7.f36901d
            if (r7 == 0) goto L83
            java.util.List r7 = r7.getLandingPageParams()
            if (r7 == 0) goto L83
            java.lang.Object r5 = kotlin.collections.CollectionsKt.getOrNull(r7, r5)
            com.inmobi.media.ads.network.common.model.LandingPageParam r5 = (com.inmobi.media.ads.network.common.model.LandingPageParam) r5
            if (r5 == 0) goto L83
            java.lang.String r5 = r5.getOpenMode()
            if (r5 != 0) goto L7e
            goto L83
        L7e:
            r17 = r5
            r16 = r12
            goto L86
        L83:
            java.lang.String r5 = "DEFAULT"
            goto L7e
        L86:
            java.lang.String r12 = "native"
            r7 = r11
            r11 = r8
            r8 = r9
            r10 = r7
            r7 = r4
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16, r17)
            com.inmobi.media.Ec r5 = r0.f39675g
            kotlin.Lazy r5 = r5.f36794f
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.Dc r5 = (com.inmobi.media.Dc) r5
            com.inmobi.media.Ec r7 = r0.f39675g
            com.inmobi.media.Ac r7 = r7.f36791c
            com.inmobi.media.m9 r0 = r0.l()
            r18 = r7
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.inmobi.media.jd r1 = new com.inmobi.media.jd
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4082ue.d(com.inmobi.media.ue):com.inmobi.media.jd");
    }

    public static final Fd e(C4082ue c4082ue) {
        Vb k52;
        NativeMedia media;
        NativeVideo video;
        CoroutineScope coroutineScope = c4082ue.f39676h;
        Ec ec2 = c4082ue.f39675g;
        C4091un viewHolderConfig = (C4091un) c4082ue.f39677i.getValue();
        Intrinsics.checkNotNullParameter(ec2, "<this>");
        Intrinsics.checkNotNullParameter(viewHolderConfig, "viewHolderConfig");
        E e10 = ec2.f36789a.f39883b.f36911n;
        InMobiJsonResponse inMobiJsonResponse = ec2.f36790b;
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if ((assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null) ? false : video.getRequired()) {
            k52 = new Nm(((C3856lc) ec2.f36795g.getValue()).f38974e, e10.f36760a);
        } else {
            AdConfig.NativeViewabilityConfig viewabilityConfig = ec2.f36789a.f39883b.f36898a.f39234b.getNative().getViewabilityConfig();
            k52 = new K5(viewHolderConfig, new C4166xn(viewabilityConfig.getImpressionConfig().getPollInterval(), e10.f36761b, AbstractC3766hl.a(viewabilityConfig.getParentMinDimension().getDimensions()), e10.f36760a));
        }
        return new Fd(coroutineScope, k52, ((yo) c4082ue.f39680l.getValue()).f40024b);
    }

    public static final Ug f(C4082ue c4082ue) {
        c4082ue.getClass();
        return new Ug();
    }

    public static final C4091un g(C4082ue c4082ue) {
        NativeMedia media;
        NativeImage image;
        Icon icon;
        NativeMedia media2;
        NativeVideo video;
        NativeMedia media3;
        NativeMedia media4;
        Ec ec2 = c4082ue.f39675g;
        Sg publisherNativeViewData = c4082ue.f39671c;
        Intrinsics.checkNotNullParameter(ec2, "<this>");
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        AdConfig.NativeConfig nativeConfig = ec2.f36789a.f39883b.f36898a.f39234b.getNative();
        JsonAssetObject assetsObject = ec2.f36790b.getAssetsObject();
        Boolean boolValueOf = null;
        String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        InMobiJsonResponse inMobiJsonResponse = ec2.f36790b;
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (Intrinsics.areEqual((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), "video")) {
            JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                boolValueOf = Boolean.valueOf(video.getRequired());
            }
        } else {
            JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                boolValueOf = Boolean.valueOf(image.getRequired());
            }
        }
        boolean required = false;
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        if (Intrinsics.areEqual(type, "video")) {
            if (!zBooleanValue) {
                required = true;
            }
        } else if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
            required = icon.getRequired();
        }
        return new C4091un(required, zBooleanValue, AbstractC3766hl.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), AbstractC3766hl.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), publisherNativeViewData);
    }

    public static final yo h(C4082ue c4082ue) {
        return new yo(c4082ue.f39960a.f39883b.f36898a.f39234b.getViewability().getWindowPollingInterval(), c4082ue.f39676h, c4082ue.f39671c.f37729a.getParentView(), c4082ue.l());
    }
}
