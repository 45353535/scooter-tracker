package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4288e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42949b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42950c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4388k0 f42951a;

    /* JADX INFO: renamed from: com.ironsource.e1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return mf.a.d(Integer.valueOf(((LevelPlayAdSize) t11).getWidth()), Integer.valueOf(((LevelPlayAdSize) t10).getWidth()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e1$c */
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f42952a;

        public c(Comparator comparator) {
            this.f42952a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f42952a.compare(t10, t11);
            return iCompare != 0 ? iCompare : mf.a.d(Integer.valueOf(((LevelPlayAdSize) t11).getHeight()), Integer.valueOf(((LevelPlayAdSize) t10).getHeight()));
        }
    }

    public C4288e1(@NotNull C4388k0 adSizeTools) {
        Intrinsics.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.f42951a = adSizeTools;
    }

    @Nullable
    public final LevelPlayAdSize a(@NotNull Context context, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f42951a.d()) {
            IronLog.API.error(C4388k0.a(this.f42951a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer numB = this.f42951a.b(context);
        if (numB == null) {
            IronLog.API.error(C4388k0.a(this.f42951a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
            return null;
        }
        int iIntValue = numB.intValue();
        int iA = a(num, context);
        int iA2 = this.f42951a.a(iA);
        List<LevelPlayAdSize> listA = a();
        for (LevelPlayAdSize levelPlayAdSizeCreateCustomSize : a(listA, iIntValue, iA)) {
            if (levelPlayAdSizeCreateCustomSize.getWidth() <= iA && (levelPlayAdSizeCreateCustomSize.getHeight() <= iA2 || iA2 == -1)) {
                iA2 = Math.max(iA2, levelPlayAdSizeCreateCustomSize.getHeight());
                break;
            }
        }
        levelPlayAdSizeCreateCustomSize = null;
        if (levelPlayAdSizeCreateCustomSize == null) {
            iA2 = ((LevelPlayAdSize) CollectionsKt.last((List) listA)).getHeight();
            levelPlayAdSizeCreateCustomSize = LevelPlayAdSize.Companion.createCustomSize(iA, iA2);
        }
        int i10 = iA2;
        LevelPlayAdSize levelPlayAdSize = levelPlayAdSizeCreateCustomSize;
        IronLog.INTERNAL.info(C4388k0.a(this.f42951a, "Adaptive: " + iA + "x" + i10 + " Fallback: " + levelPlayAdSize, (String) null, 2, (Object) null));
        return new LevelPlayAdSize(iA, i10, "CUSTOM", true, levelPlayAdSize);
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C4388k0.a(this.f42951a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
            return C4241b5.f42712a.b(context);
        }
        if (num == null) {
            return C4241b5.f42712a.b(context);
        }
        return num.intValue();
    }

    private final List<LevelPlayAdSize> a() {
        return CollectionsKt.sortedWith(this.f42951a.b(), new c(new b()));
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i10 && levelPlayAdSize.getWidth() <= i11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
