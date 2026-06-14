package com.mobilefuse.videoplayer.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import com.mobilefuse.videoplayer.model.VastBaseResource;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastCreative;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import com.mobilefuse.videoplayer.model.VastResourceType;
import com.mobilefuse.videoplayer.network.NetworkType;
import com.mobilefuse.videoplayer.network.NetworkUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import mf.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\u0005\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0014\u001a\u00020\u0015\u001a4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u001a4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b*\b\u0012\u0004\u0012\u00020\u000e0\bH\u0000\u001a,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\b*\b\u0012\u0004\u0012\u00020\u000e0\b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001e0\"H\u0000\u001a0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\b*\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¨\u0006$"}, d2 = {"convertFromDpToPixels", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "pixels", "", "convertFromPixelsToDp", "enqueueMediaFilesByCompatibility", "", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "mediaFiles", "", "containerSize", "getAllCompanionsFromVastCreatives", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "creatives", "Lcom/mobilefuse/videoplayer/model/VastCreative;", "getScreenSizeAsDp", "getScreenSizeAsPixels", "removeMediaFilesWithHigherBitrate", "bitrateLimit", "", "selectEndCardCompanions", "companions", "maxCompanionsNumToSelect", "screenDensity", "", "sortMediaFilesByPlayerSizeProximity", "playerContainerSize", "usePixels", "", "getMultipleExplicitEndCardsOrSingle", "preferCompanionAds", "block", "Lkotlin/Function1;", "sortCompanionAdsByPlayerSizeProximity", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
public final class MediaUtilsKt {
    public static final void convertFromDpToPixels(@NotNull Context context, @NotNull int[] pixels) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pixels, "pixels");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        float f10 = resources.getDisplayMetrics().density;
        int length = pixels.length;
        for (int i10 = 0; i10 < length; i10++) {
            pixels[i10] = (int) ((pixels[i10] * f10) + 0.5f);
        }
    }

    public static final void convertFromPixelsToDp(@NotNull Context context, @NotNull int[] pixels) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pixels, "pixels");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        float f10 = resources.getDisplayMetrics().density;
        int length = pixels.length;
        for (int i10 = 0; i10 < length; i10++) {
            pixels[i10] = (int) ((pixels[i10] / f10) + 0.5f);
        }
    }

    @NotNull
    public static final List<VastMediaFile> enqueueMediaFilesByCompatibility(@NotNull Context context, @NotNull List<VastMediaFile> mediaFiles, @NotNull int[] containerSize) {
        boolean z10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(containerSize, "containerSize");
        NetworkType networkType = NetworkUtils.INSTANCE.getNetworkType(context);
        int iIntValue = 0;
        for (VastMediaFile vastMediaFile : mediaFiles) {
            if (vastMediaFile.getBitrate() == null || vastMediaFile.getBitrate().intValue() < 32) {
                z10 = false;
                iIntValue = 0;
                break;
            }
            if (vastMediaFile.getBitrate().intValue() > iIntValue) {
                iIntValue = vastMediaFile.getBitrate().intValue();
            }
        }
        z10 = true;
        if (networkType == NetworkType.MOBILE_5G) {
            return sortMediaFilesByPlayerSizeProximity(context, mediaFiles, containerSize, true);
        }
        if (networkType == NetworkType.WIFI) {
            return sortMediaFilesByPlayerSizeProximity(context, mediaFiles, containerSize, false);
        }
        if (networkType == NetworkType.MOBILE_4G) {
            if (!z10 || iIntValue < 2000) {
                return sortMediaFilesByPlayerSizeProximity(context, mediaFiles, containerSize, false);
            }
            ArrayList arrayList = new ArrayList(mediaFiles);
            List<VastMediaFile> listRemoveMediaFilesWithHigherBitrate = removeMediaFilesWithHigherBitrate(arrayList, 2000);
            if (listRemoveMediaFilesWithHigherBitrate.size() > 1) {
                CollectionsKt.sortWith(listRemoveMediaFilesWithHigherBitrate, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$enqueueMediaFilesByCompatibility$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return a.d(((VastMediaFile) t10).getBitrate(), ((VastMediaFile) t11).getBitrate());
                    }
                });
            }
            List<VastMediaFile> listSortMediaFilesByPlayerSizeProximity = sortMediaFilesByPlayerSizeProximity(context, arrayList, containerSize, false);
            listSortMediaFilesByPlayerSizeProximity.addAll(listRemoveMediaFilesWithHigherBitrate);
            return listSortMediaFilesByPlayerSizeProximity;
        }
        if (networkType != null && networkType != NetworkType.UNKNOWN && networkType != NetworkType.MOBILE_2G && networkType != NetworkType.MOBILE_3G) {
            return sortMediaFilesByPlayerSizeProximity(context, mediaFiles, containerSize, false);
        }
        if (z10) {
            if (mediaFiles.size() > 1) {
                CollectionsKt.sortWith(mediaFiles, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$enqueueMediaFilesByCompatibility$$inlined$sortBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return a.d(((VastMediaFile) t10).getBitrate(), ((VastMediaFile) t11).getBitrate());
                    }
                });
                return mediaFiles;
            }
        } else if (mediaFiles.size() > 1) {
            CollectionsKt.sortWith(mediaFiles, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$enqueueMediaFilesByCompatibility$$inlined$sortBy$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return a.d(((VastMediaFile) t10).getPixelsCount(), ((VastMediaFile) t11).getPixelsCount());
                }
            });
        }
        return mediaFiles;
    }

    @NotNull
    public static final List<VastCompanion> getAllCompanionsFromVastCreatives(@NotNull List<VastCreative> creatives) {
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        ArrayList arrayList = new ArrayList();
        for (VastCreative vastCreative : creatives) {
            if (!vastCreative.getCompanionList().isEmpty()) {
                arrayList.addAll(vastCreative.getCompanionList());
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<VastCompanion> getMultipleExplicitEndCardsOrSingle(@NotNull List<VastCompanion> getMultipleExplicitEndCardsOrSingle) {
        Intrinsics.checkNotNullParameter(getMultipleExplicitEndCardsOrSingle, "$this$getMultipleExplicitEndCardsOrSingle");
        List<VastCompanion> list = getMultipleExplicitEndCardsOrSingle;
        List arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((VastCompanion) obj).getRenderingMode(), "end-card")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = CollectionsKt.take(list, 1);
        }
        return arrayList;
    }

    @NotNull
    public static final int[] getScreenSizeAsDp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int[] screenSizeAsPixels = getScreenSizeAsPixels(context);
        convertFromPixelsToDp(context, screenSizeAsPixels);
        return screenSizeAsPixels;
    }

    @NotNull
    public static final int[] getScreenSizeAsPixels(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return new int[]{point.x, point.y};
    }

    @NotNull
    public static final List<VastCompanion> preferCompanionAds(@NotNull List<VastCompanion> preferCompanionAds, @NotNull Function1<? super VastCompanion, Boolean> block) {
        Intrinsics.checkNotNullParameter(preferCompanionAds, "$this$preferCompanionAds");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (VastCompanion vastCompanion : preferCompanionAds) {
            if (block.invoke(vastCompanion).booleanValue()) {
                arrayList2.add(vastCompanion);
            } else {
                arrayList.add(vastCompanion);
            }
        }
        CollectionsKt.addAll(arrayList2, arrayList);
        return arrayList2;
    }

    @NotNull
    public static final List<VastMediaFile> removeMediaFilesWithHigherBitrate(@NotNull List<VastMediaFile> mediaFiles, int i10) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        ArrayList arrayList = new ArrayList();
        for (VastMediaFile vastMediaFile : CollectionsKt.reversed(mediaFiles)) {
            if (vastMediaFile.getBitrate() != null && vastMediaFile.getBitrate().intValue() > i10) {
                arrayList.add(vastMediaFile);
                mediaFiles.remove(vastMediaFile);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<VastCompanion> selectEndCardCompanions(@NotNull List<VastCompanion> companions, int i10, @NotNull int[] containerSize, float f10) {
        Intrinsics.checkNotNullParameter(companions, "companions");
        Intrinsics.checkNotNullParameter(containerSize, "containerSize");
        return companions.isEmpty() ? CollectionsKt.emptyList() : containerSize.length != 2 ? CollectionsKt.emptyList() : getMultipleExplicitEndCardsOrSingle(CollectionsKt.take(preferCompanionAds(preferCompanionAds(sortCompanionAdsByPlayerSizeProximity(companions, containerSize, f10, true), new Function1<VastCompanion, Boolean>() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt.selectEndCardCompanions.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(VastCompanion vastCompanion) {
                return Boolean.valueOf(invoke2(vastCompanion));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull VastCompanion it) {
                Intrinsics.checkNotNullParameter(it, "it");
                VastBaseResource resource = it.getResource();
                return (resource != null ? resource.getResourceType() : null) != VastResourceType.STATIC;
            }
        }), new Function1<VastCompanion, Boolean>() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt.selectEndCardCompanions.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(VastCompanion vastCompanion) {
                return Boolean.valueOf(invoke2(vastCompanion));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull VastCompanion it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Intrinsics.areEqual(it.getRenderingMode(), "end-card");
            }
        }), i10));
    }

    @NotNull
    public static final List<VastCompanion> sortCompanionAdsByPlayerSizeProximity(@NotNull List<VastCompanion> sortCompanionAdsByPlayerSizeProximity, @NotNull int[] playerContainerSize, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(sortCompanionAdsByPlayerSizeProximity, "$this$sortCompanionAdsByPlayerSizeProximity");
        Intrinsics.checkNotNullParameter(playerContainerSize, "playerContainerSize");
        if (z10) {
            f10 = 1.0f;
        }
        float f11 = playerContainerSize[0] / f10;
        float f12 = playerContainerSize[1] / f10;
        float f13 = f11 / f12;
        ArrayList arrayList = new ArrayList();
        for (VastCompanion vastCompanion : sortCompanionAdsByPlayerSizeProximity) {
            if (vastCompanion.getWidth() != null && vastCompanion.getHeight() != null) {
                int iIntValue = vastCompanion.getWidth().intValue();
                if (vastCompanion.getAssetWidth() != null && vastCompanion.getAssetWidth().intValue() > 0) {
                    iIntValue = vastCompanion.getAssetWidth().intValue();
                }
                int iIntValue2 = vastCompanion.getHeight().intValue();
                if (vastCompanion.getAssetHeight() != null && vastCompanion.getAssetHeight().intValue() > 0) {
                    iIntValue2 = vastCompanion.getAssetHeight().intValue();
                }
                float f14 = iIntValue;
                float f15 = iIntValue2;
                arrayList.add(new Pair(Float.valueOf((Math.abs(f11 - f14) + Math.abs(f12 - f15)) * Math.abs(f13 - (f14 / f15))), vastCompanion));
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$sortCompanionAdsByPlayerSizeProximity$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return a.d((Float) ((Pair) t10).first, (Float) ((Pair) t11).first);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((VastCompanion) ((Pair) it.next()).second);
        }
        return b1.c(arrayList2);
    }

    private static final List<VastMediaFile> sortMediaFilesByPlayerSizeProximity(Context context, List<VastMediaFile> list, int[] iArr, boolean z10) {
        Resources resources;
        DisplayMetrics displayMetrics;
        float f10 = 1.0f;
        if (!z10 && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f10 = displayMetrics.density;
        }
        float f11 = iArr[0] / f10;
        float f12 = iArr[1] / f10;
        float f13 = f11 / f12;
        ArrayList arrayList = new ArrayList();
        for (VastMediaFile vastMediaFile : list) {
            if (vastMediaFile.getWidth() != null && vastMediaFile.getHeight() != null) {
                arrayList.add(new Pair(Float.valueOf((Math.abs(f11 - vastMediaFile.getWidth().intValue()) + Math.abs(f12 - vastMediaFile.getHeight().intValue())) * Math.abs(f13 - vastMediaFile.getSizeRatio())), vastMediaFile));
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$sortMediaFilesByPlayerSizeProximity$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return a.d((Float) ((Pair) t10).first, (Float) ((Pair) t11).first);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((VastMediaFile) ((Pair) it.next()).second);
        }
        return b1.c(arrayList2);
    }
}
