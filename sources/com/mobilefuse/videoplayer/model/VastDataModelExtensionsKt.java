package com.mobilefuse.videoplayer.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.tracking.VastEventTracker;
import com.mobilefuse.videoplayer.utils.MediaUtilsKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.y.z.w.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0000\u001a\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030!*\u00020\u00102\u0006\u0010\"\u001a\u00020\u000f\u001a\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001d*\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0001\u001a\u0014\u0010'\u001a\u0004\u0018\u00010\u0007*\u00020\u00102\u0006\u0010(\u001a\u00020\u0007\u001a \u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u000b2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-\u001a*\u0010.\u001a\u00020/*\u0002002\u0006\u0010*\u001a\u00020+2\u0006\u00101\u001a\u0002022\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020/\u0018\u000104\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0013\u001a\u00020\u000f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\u000f*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018\"\u0015\u0010\u0019\u001a\u00020\u0007*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u00065"}, d2 = {"allCreativesWithCompanionAds", "", "Lcom/mobilefuse/videoplayer/model/VastCreative;", "Lcom/mobilefuse/videoplayer/model/VastAd;", "getAllCreativesWithCompanionAds", "(Lcom/mobilefuse/videoplayer/model/VastAd;)Ljava/util/List;", "firstAd", "Lcom/mobilefuse/videoplayer/model/VastTag;", "getFirstAd", "(Lcom/mobilefuse/videoplayer/model/VastTag;)Lcom/mobilefuse/videoplayer/model/VastAd;", "firstAdLinear", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "getFirstAdLinear", "(Lcom/mobilefuse/videoplayer/model/VastAd;)Lcom/mobilefuse/videoplayer/model/VastLinear;", "hasAdContentToPlay", "", "Lcom/mobilefuse/videoplayer/model/VastModel;", "getHasAdContentToPlay", "(Lcom/mobilefuse/videoplayer/model/VastModel;)Z", "hasAnyMediaFile", "getHasAnyMediaFile", "(Lcom/mobilefuse/videoplayer/model/VastLinear;)Z", "isValid", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "(Lcom/mobilefuse/videoplayer/model/VastCompanion;)Z", "mainVastTag", "getMainVastTag", "(Lcom/mobilefuse/videoplayer/model/VastModel;)Lcom/mobilefuse/videoplayer/model/VastTag;", "verifyMediaFiles", "", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "mediaFiles", "getAdsChainIterator", "", "onlyParentAds", "getIcons", "Lcom/mobilefuse/videoplayer/model/VastIcon;", "excludedPrograms", "", "getParentTag", s.z.f67720z, "getSupportedMediaFiles", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "containerSize", "", "openUrl", "", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "eventTracker", "Lcom/mobilefuse/videoplayer/tracking/VastEventTracker;", "onOpenCallback", "Lkotlin/Function0;", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
public final class VastDataModelExtensionsKt {

    /* JADX INFO: renamed from: com.mobilefuse.videoplayer.model.VastDataModelExtensionsKt$getAdsChainIterator$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\t\u0010\u000b\u001a\u00020\u0002H\u0096\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"com/mobilefuse/videoplayer/model/VastDataModelExtensionsKt$getAdsChainIterator$1", "", "Lcom/mobilefuse/videoplayer/model/VastAd;", "itAd", "Lcom/mobilefuse/videoplayer/model/VastTag;", "getItAd", "()Lcom/mobilefuse/videoplayer/model/VastTag;", "setItAd", "(Lcom/mobilefuse/videoplayer/model/VastTag;)V", "hasNext", "", "next", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public static final class AnonymousClass1 implements Iterator<VastAd>, a {
        final /* synthetic */ boolean $onlyParentAds;
        final /* synthetic */ VastModel $this_getAdsChainIterator;

        @Nullable
        private VastTag itAd;

        AnonymousClass1(VastModel vastModel, boolean z10) {
            this.$this_getAdsChainIterator = vastModel;
            this.$onlyParentAds = z10;
            this.itAd = z10 ? VastDataModelExtensionsKt.getParentTag(vastModel, VastDataModelExtensionsKt.getMainVastTag(vastModel)) : VastDataModelExtensionsKt.getMainVastTag(vastModel);
        }

        @Nullable
        public final VastTag getItAd() {
            return this.itAd;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            VastTag vastTag = this.itAd;
            if (vastTag != null) {
                return (vastTag != null ? VastDataModelExtensionsKt.getFirstAd(vastTag) : null) != null;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setItAd(@Nullable VastTag vastTag) {
            this.itAd = vastTag;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @NotNull
        public VastAd next() {
            VastTag vastTag = this.itAd;
            Intrinsics.checkNotNull(vastTag);
            this.itAd = VastDataModelExtensionsKt.getParentTag(this.$this_getAdsChainIterator, vastTag);
            VastAd firstAd = VastDataModelExtensionsKt.getFirstAd(vastTag);
            Intrinsics.checkNotNull(firstAd);
            return firstAd;
        }
    }

    @NotNull
    public static final Iterator<VastAd> getAdsChainIterator(@NotNull VastModel getAdsChainIterator, boolean z10) {
        Intrinsics.checkNotNullParameter(getAdsChainIterator, "$this$getAdsChainIterator");
        return new AnonymousClass1(getAdsChainIterator, z10);
    }

    @NotNull
    public static final List<VastCreative> getAllCreativesWithCompanionAds(@NotNull VastAd allCreativesWithCompanionAds) {
        List<VastCreative> creativeList;
        Intrinsics.checkNotNullParameter(allCreativesWithCompanionAds, "$this$allCreativesWithCompanionAds");
        ArrayList arrayList = new ArrayList();
        VastAdContent content = allCreativesWithCompanionAds.getContent();
        if (content != null && (creativeList = content.getCreativeList()) != null && !creativeList.isEmpty()) {
            for (VastCreative vastCreative : allCreativesWithCompanionAds.getContent().getCreativeList()) {
                if (!vastCreative.getCompanionList().isEmpty()) {
                    arrayList.add(vastCreative);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static final VastAd getFirstAd(@NotNull VastTag firstAd) {
        Intrinsics.checkNotNullParameter(firstAd, "$this$firstAd");
        return (VastAd) CollectionsKt.firstOrNull((List) firstAd.getAdList());
    }

    @Nullable
    public static final VastLinear getFirstAdLinear(@NotNull VastAd firstAdLinear) {
        List<VastCreative> creativeList;
        Intrinsics.checkNotNullParameter(firstAdLinear, "$this$firstAdLinear");
        VastAdContent content = firstAdLinear.getContent();
        if (content != null && (creativeList = content.getCreativeList()) != null && !creativeList.isEmpty()) {
            for (VastCreative vastCreative : firstAdLinear.getContent().getCreativeList()) {
                if (vastCreative.getLinear() != null) {
                    return vastCreative.getLinear();
                }
            }
        }
        return null;
    }

    public static final boolean getHasAdContentToPlay(@NotNull VastModel hasAdContentToPlay) {
        VastLinear firstAdLinear;
        Intrinsics.checkNotNullParameter(hasAdContentToPlay, "$this$hasAdContentToPlay");
        Iterator<VastTag> it = hasAdContentToPlay.getVastTagChain().iterator();
        while (it.hasNext()) {
            VastAd firstAd = getFirstAd(it.next());
            if (firstAd != null && (firstAdLinear = getFirstAdLinear(firstAd)) != null && getHasAnyMediaFile(firstAdLinear)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean getHasAnyMediaFile(@NotNull VastLinear hasAnyMediaFile) {
        Intrinsics.checkNotNullParameter(hasAnyMediaFile, "$this$hasAnyMediaFile");
        return !hasAnyMediaFile.getMediaFiles().isEmpty();
    }

    @NotNull
    public static final List<VastIcon> getIcons(@NotNull VastLinear getIcons, @NotNull List<String> excludedPrograms) {
        Intrinsics.checkNotNullParameter(getIcons, "$this$getIcons");
        Intrinsics.checkNotNullParameter(excludedPrograms, "excludedPrograms");
        ArrayList arrayList = new ArrayList();
        for (VastIcon vastIcon : getIcons.getIcons()) {
            if (vastIcon.getProgram() == null || excludedPrograms.isEmpty()) {
                arrayList.add(vastIcon);
            } else {
                String program = vastIcon.getProgram();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
                String lowerCase = program.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!excludedPrograms.contains(lowerCase)) {
                    arrayList.add(vastIcon);
                    String program2 = vastIcon.getProgram();
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "Locale.getDefault()");
                    String lowerCase2 = program2.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                    excludedPrograms.add(lowerCase2);
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static final VastTag getMainVastTag(@NotNull VastModel mainVastTag) {
        Intrinsics.checkNotNullParameter(mainVastTag, "$this$mainVastTag");
        return (VastTag) CollectionsKt.first((List) mainVastTag.getVastTagChain());
    }

    @Nullable
    public static final VastTag getParentTag(@NotNull VastModel getParentTag, @NotNull VastTag tag) {
        Intrinsics.checkNotNullParameter(getParentTag, "$this$getParentTag");
        Intrinsics.checkNotNullParameter(tag, "tag");
        int iIndexOf = getParentTag.getVastTagChain().indexOf(tag) + 1;
        if (iIndexOf >= getParentTag.getVastTagChain().size()) {
            return null;
        }
        return getParentTag.getVastTagChain().get(iIndexOf);
    }

    @NotNull
    public static final List<VastMediaFile> getSupportedMediaFiles(@NotNull VastLinear getSupportedMediaFiles, @NotNull Context context, @NotNull int[] containerSize) {
        Intrinsics.checkNotNullParameter(getSupportedMediaFiles, "$this$getSupportedMediaFiles");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerSize, "containerSize");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getSupportedMediaFiles.getVerifiedMediaFiles());
        return MediaUtilsKt.enqueueMediaFilesByCompatibility(context, arrayList, containerSize);
    }

    public static final boolean isValid(@NotNull VastCompanion isValid) {
        Intrinsics.checkNotNullParameter(isValid, "$this$isValid");
        if (isValid.getWidth() == null || isValid.getHeight() == null || isValid.getResource() == null) {
            return false;
        }
        return (isValid.getResource().getResourceType() == VastResourceType.STATIC && isValid.getClickThrough() == null) ? false : true;
    }

    public static final void openUrl(@NotNull VastClickThrough openUrl, @NotNull Context context, @NotNull VastEventTracker eventTracker, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(openUrl, "$this$openUrl");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        String macro = eventTracker.parseMacro(openUrl.getUrl(), null, null);
        if (function0 != null) {
            try {
                function0.invoke();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(macro));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @NotNull
    public static final List<VastMediaFile> verifyMediaFiles(@NotNull List<VastMediaFile> mediaFiles) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        ArrayList arrayList = new ArrayList();
        Set<String> supportedVideoContainers = VideoPlayerSettings.INSTANCE.getSupportedVideoContainers();
        for (VastMediaFile vastMediaFile : mediaFiles) {
            String url = vastMediaFile.getUrl();
            if (url != null && url.length() > 0 && Intrinsics.areEqual(VastMediaFileDelivery.PROGRESSIVE.getValue(), vastMediaFile.getDelivery()) && CollectionsKt.contains(supportedVideoContainers, vastMediaFile.getType())) {
                arrayList.add(vastMediaFile);
            }
        }
        return arrayList;
    }
}
